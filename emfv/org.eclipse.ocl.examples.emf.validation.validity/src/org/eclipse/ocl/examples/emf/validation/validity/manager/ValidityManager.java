/**
 * <copyright>
 *
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *  Obeo - Optimize View Input Refresh
 * </copyright>
 */
package org.eclipse.ocl.examples.emf.validation.validity.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.common.utils.TracingOption;
import org.eclipse.ocl.examples.domain.elements.Nameable;
import org.eclipse.ocl.examples.emf.validation.validity.ConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.ResultValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.locator.ConstraintLocator;
import org.eclipse.ocl.examples.emf.validation.validity.plugin.ValidityPlugin;

public class ValidityManager
{	
	private static final @NonNull Map<String, List<ConstraintLocator.Descriptor>> constraintLocatorDescriptors = new HashMap<String, List<ConstraintLocator.Descriptor>>();
	private static final @NonNull Map<String, List<ConstraintLocator>> constraintLocators = new HashMap<String, List<ConstraintLocator>>();

	public static final @NonNull TracingOption ANALYZE_RESOURCE = new TracingOption(ValidityPlugin.PLUGIN_ID, "analyze/resource");
	public static final @NonNull TracingOption CREATE_CONSTRAINING = new TracingOption(ValidityPlugin.PLUGIN_ID, "create/constraining");
	public static final @NonNull TracingOption CREATE_RESULT = new TracingOption(ValidityPlugin.PLUGIN_ID, "create/result");
	public static final @NonNull TracingOption CREATE_VALIDATABLE = new TracingOption(ValidityPlugin.PLUGIN_ID, "create/validatable");
	public static final @NonNull TracingOption LOCATE_RESOURCE = new TracingOption(ValidityPlugin.PLUGIN_ID, "locate/resource");

	private final @NonNull LinkedHashSet<Resource> newResources = new LinkedHashSet<Resource>();

	private final @NonNull Set<Resource> oldResources = new HashSet<Resource>();
	
	/**
	 * This add the corresponding constraint locator if it exists in the list of
	 * defined descriptors.
	 * 
	 * @param nsURI
	 *            the nsURI of the validated resource
	 * @param constraintLocator
	 *            the corresponding constraint locator
	 */
	public static synchronized void addConstraintLocator(/*@NonNull*/ String nsURI, @NonNull ConstraintLocator.Descriptor constraintLocator) {
		List<ConstraintLocator.Descriptor> list = constraintLocatorDescriptors.get(nsURI);
		if (list == null) {
			list = new ArrayList<ConstraintLocator.Descriptor>();
			constraintLocatorDescriptors.put(nsURI, list);
		}
		if (!list.contains(constraintLocator)) {
			list.add(constraintLocator);
			constraintLocators.remove(nsURI);
		}
	}

	public static synchronized @Nullable ConstraintLocator getConstraintLocator(@NonNull EObject eObject) {
		return getConstraintLocator(eObject.eResource());
	}

	public static synchronized @Nullable ConstraintLocator getConstraintLocator(@Nullable Resource resource) {
		if (resource != null) {
			for (EObject eObject : resource.getContents()) {
				EClass eClass = eObject.eClass();
				if (eClass != null) {
					EPackage ePackage = eClass.getEPackage();
					if (ePackage != null) {
						String nsURI = ePackage.getNsURI();
						if (nsURI != null) {
							List<ConstraintLocator> list = getConstraintLocators(nsURI);
							if ((list != null) && (list.size() > 0)) {
								return list.get(0);
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static synchronized @Nullable List<ConstraintLocator> getConstraintLocators(@NonNull String nsURI) {
		List<ConstraintLocator> list = constraintLocators.get(nsURI);
		if (list == null) {
			List<ConstraintLocator.Descriptor> descriptors = constraintLocatorDescriptors.get(nsURI);
			if (descriptors == null) {
				return null;
			}
			list = new ArrayList<ConstraintLocator>();
			constraintLocators.put(nsURI, list);
			for (ConstraintLocator.Descriptor descriptor : descriptors) {
				list.add(descriptor.getConstraintLocator());
			}
		}
		return list;
	}
	
	protected final @NonNull ComposedAdapterFactory adapterFactory;
	protected final @NonNull Map<ResultValidatableNode, Result> resultsMap = new HashMap<ResultValidatableNode, Result>();
	protected final @SuppressWarnings("null")@NonNull Map<Object, Object> context = Diagnostician.INSTANCE.createDefaultContext();
	private @Nullable ValidityModel model = null;
	protected @Nullable ResultSet lastResultSet = null;
	private boolean forceRefresh = false;
	private @Nullable Object lastInput = null;

	public ValidityManager() {
	    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	    adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
	    adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
	    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	public @NonNull Map<Object, Object> createDefaultContext() {
		return context;
	}

	@SuppressWarnings("null")
	public @NonNull BasicDiagnostic createDefaultDiagnostic(@NonNull EObject eObject) {
		return Diagnostician.INSTANCE.createDefaultDiagnostic(eObject);
	}

	protected @NonNull ValidityModel createModel(@NonNull Collection<Resource> newResources) {
		return new ValidityModel(this, newResources);
	}

	public /*synchronized*/ @Nullable ResultSet createResultSet(@Nullable IProgressMonitor monitor) {
		ValidityModel model2 = model;
		return model2 != null ? model2.createResultSet(monitor) : null;
	}

	public void dispose() {
		model = null;
		lastResultSet = null;
		resultsMap.clear();
	}
	
	protected @Nullable Set<ConstraintLocator> gatherConstraintLocators(@Nullable Set<ConstraintLocator> set, @NonNull List<ConstraintLocator> list) {
		if (set == null) {
			set = new HashSet<ConstraintLocator>();
		}
		set.addAll(list);
		return set;
	}

	public @NonNull AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * Return the ConstrainingNode node for EObject creating any ConstrainingNodes that
	 * are required to ensure that the returned ConstrainingNode is installed in the root.
	 */
	public @NonNull ConstrainingNode getConstrainingNode(@NonNull EObject eObject) {
		ValidityModel model2 = model;
		if (model2 == null) {
			throw new IllegalStateException();
		}
		return model2.getConstrainingNode(eObject);
	}

	public @NonNull List<Result> getConstrainingNodeResults(@NonNull ConstrainingNode element) {
		List<Result> results = new ArrayList<Result>();
		if (element.getLabel().startsWith("EOperation")) {
			getAllConstrainingNodeResults(results, element);
		}
		else {
			getAllConstrainingNodeResults(results, element);
		}
		return results;
	}
	
	/**
	 * Returns the eObject uri
	 * 
	 * @param eObject
	 * @return the eObject uri
	 */
	public @NonNull ConstrainingURI getConstrainingURI(@NonNull EObject eObject) {
		ConstraintLocator constraintLocator = ValidityManager.getConstraintLocator(eObject);
		if (constraintLocator != null) {
			URI uri = constraintLocator.getURI(eObject);
			if (uri != null) {
				return new ConstrainingURI(trimDuplicateContextSuffix(uri));		// FIXME should not be needed
			}
		}
		URI uri = EcoreUtil.getURI(eObject);
		assert uri != null;
		return new ConstrainingURI(trimDuplicateContextSuffix(uri));		// FIXME should not be needed
	}

	/**
	 * It is possible to have multiple "identical" contexts defined in an OCL file :
	 * <p>
	 * <pre>
	 * context EClass
	 *   inv invariant1 : not name.oclIsUndefined()
	 * 
	 * context EClass
	 *   inv invariant2 : if interface then name.startsWith('I') else true endif;
	 * </pre>
	 * </p>
	 * 
	 * In such a case, the URI of the first will be <code>http://www.eclipse.org/emf/2002/Ecore#//EClass</code> while the URI of the second will be <code>http://www.eclipse.org/emf/2002/Ecore#//EClass.1</code>. We wish to "regroup" both invariants
	 * under the same context in the validity results.
	 * 
	 * @param uri
	 * @return
	 */
	private @NonNull URI trimDuplicateContextSuffix(URI uri) {
		String fragment = uri.fragment();
		// This should always be called on types, so we should be able to safely remove the trailing ".1" from the fragment
		if (fragment.matches(".*\\.[0-9]+$")){
			String trimmedFragment = fragment.replaceFirst("\\.[0-9]+$", "");
			URI trimmedURI = uri.trimFragment().appendFragment(trimmedFragment);
			assert trimmedURI != null;
			return trimmedURI;
		}
		return uri;
	}

	private void getAllConstrainingNodeResults(List<Result> results, @NonNull ConstrainingNode element) {
		if (element instanceof ResultConstrainingNode) {
			ResultValidatableNode resultValidatableNode = ((ResultConstrainingNode)element).getResultValidatableNode();
			Result result = resultsMap.get(resultValidatableNode);
			if (result != null) {
				results.add(result);
			}
		}
		else {
			for (@SuppressWarnings("null")@NonNull ConstrainingNode child : element.getChildren()) {
				getAllConstrainingNodeResults(results, child);
			}
		}
	}

	private void getAllValidatableNodeResults(List<Result> results, @NonNull ValidatableNode element) {
		if (element instanceof ResultValidatableNode) {
			ResultValidatableNode resultValidatableNode = (ResultValidatableNode)element;
			Result result = resultsMap.get(resultValidatableNode);
			if (result != null) {
				results.add(result);
			}
		}
		else {
			for (@SuppressWarnings("null")@NonNull ValidatableNode child : element.getChildren()) {
				getAllValidatableNodeResults(results, child);
			}
		}
	}

	public @NonNull String getConstrainingLabel(@NonNull EObject eObject) {
		StringBuilder s = new StringBuilder();
		if (eObject instanceof ENamedElement) {
			s.append(((ENamedElement)eObject).getName());
		}
		else if (eObject instanceof Nameable) {
			s.append(((Nameable)eObject).getName());
		}
		else {
		    IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
			String label = itemLabelProvider != null ? itemLabelProvider.getText(eObject) : eObject.toString();
			s.append(label != null ? label : "");
		}
/*		EClass eClass = eObject.eClass();
		if (eClass != null) {
			s.append(" : " + eClass.getName());
		} */
		EObject eContainer = eObject.eContainer();
		if (eContainer == null) {
			Resource eResource = eObject.eResource();
			if (eResource != null) {
				URI uri = eResource.getURI();
				if (uri != null) {
					s.append(" in " + uri);
				}
			}
		}
		@SuppressWarnings("null")@NonNull String string = s.toString();
		return string;
	}
	
	public @Nullable ValidityModel getModel() {
		return model;
	}

	public @Nullable RootNode getRootNode() {
		ValidityModel model2 = model;
		return model2 != null ? model2.getRootNode() : null;
	}

	/**
	 * Returns the eObject uri
	 * 
	 * @param eObject
	 * @return the eObject uri
	 */
	public @NonNull TypeURI getTypeURI(@NonNull EObject eObject) {
		String nsURI = null;
		for (EObject eContainer = eObject; eContainer != null; eContainer = eContainer.eContainer()) {
			if (eContainer instanceof EPackage) {
				EPackage ePackage = (EPackage) eContainer;
				nsURI = ePackage.getNsURI();
				if ((nsURI != null) && !"".equals(nsURI)) {
					Resource eResource = ePackage.eResource();
					if (eResource != null) {
						String fragment = eResource.getURIFragment(eObject);
						@SuppressWarnings("null")@NonNull URI uri = URI.createURI(nsURI).appendFragment(fragment);
						return new TypeURI(uri);
					}
				}
			}
		}
		@SuppressWarnings("null")@NonNull URI uri = EcoreUtil.getURI(eObject);
		return new TypeURI(uri);
	}

	public @NonNull String getValidatableLabel(@NonNull EObject eObject) {
		StringBuilder s = new StringBuilder();
		if (eObject instanceof ENamedElement) {
			s.append(((ENamedElement)eObject).getName());
		}
		else if (eObject instanceof Nameable) {
			s.append(((Nameable)eObject).getName());
		}
		else {
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
			String label = itemLabelProvider != null ? itemLabelProvider.getText(eObject) : eObject.toString();
			s.append(label != null ? label : "");
		}
		if (eObject instanceof ETypedElement) {
			EClassifier eType = ((ETypedElement)eObject).getEType();
			s.append(" : " + eType.getName());
		}
		else {
			EClass eClass = eObject.eClass();
			if (eClass != null) {
				s.append(" | " + eClass.getName());
			}
		}
		EObject eContainer = eObject.eContainer();
		if (eContainer == null) {
			Resource eResource = eObject.eResource();
			if (eResource != null) {
				URI uri = eResource.getURI();
				if (uri != null) {
					s.append(" in " + uri);
				}
			}
		}
		@SuppressWarnings("null")@NonNull String string = s.toString();
		return string;
	}

	public List<Result> getValidatableNodeResults(@NonNull ValidatableNode element) {
		List<Result> results = new ArrayList<Result>();
		getAllValidatableNodeResults(results, element);
		return results;
	}

	/**
	 * Returns the eObject uri
	 * 
	 * @param eObject
	 * @return the eObject uri
	 */
	public @NonNull ValidatableURI getValidatableURI(@NonNull EObject eObject) {
		@SuppressWarnings("null")@NonNull URI uri = EcoreUtil.getURI(eObject);
		return new ValidatableURI(uri);
	}

	public void forceRefresh() {
		this.forceRefresh = true;
		setInput(lastInput, new BasicMonitor());
		this.forceRefresh = false;		
	}
	
	public void setInput(Object newInput) {
		setInput(newInput, new BasicMonitor());
	}

	public void setInput(Object newInput, @NonNull Monitor monitor) {
		monitor.beginTask("Selective Validation", ValidityModel.WORK_FOR_ALL_SET_INPUT);
		monitor.setTaskName("Clean Up");
		ResourceSet selectedResourceSet = null;
		Resource selectedResource = null;
		EObject selectedObject = null;
		newResources.clear();
		lastInput = newInput;
		
		if (newInput == null) {
			oldResources.clear();
			model = null;
			return;
		}
		
		if (newInput instanceof ResourceSet) {
			selectedResourceSet = (ResourceSet) newInput;
		} else if (newInput instanceof Resource) {
			selectedResource = (Resource) newInput;
			selectedResourceSet = selectedResource.getResourceSet();
			if (selectedResourceSet == null) {
				List<EObject> eContents = selectedResource.getContents();
				for (int j = 0; j < eContents.size(); j++) {		// Tolerate domain growth without a CME
					EObject eObject = eContents.get(j);
					EcoreUtil.resolveAll(eObject);
				}
				newResources.add(selectedResource);
			}
		} else if (newInput instanceof EObject) {
			selectedObject = (EObject) newInput;
			selectedResource = selectedObject.eResource();
			if (selectedResource != null) {
				selectedResourceSet = selectedResource.getResourceSet();
			}
		}

		if (selectedResourceSet != null) {
			List<Resource> selectedResources = selectedResourceSet.getResources();
			for (int i = 0; i < selectedResources.size(); i++) {	// Tolerate domain growth without a CME
				Resource eResource = selectedResources.get(i);
				List<EObject> eContents = eResource.getContents();
				for (int j = 0; j < eContents.size(); j++) {		// Tolerate domain growth without a CME
					EObject eObject = eContents.get(j);
					EcoreUtil.resolveAll(eObject);
				}
			}
			newResources.addAll(selectedResourceSet.getResources());
		}
		
		if (newResources.isEmpty()) {
			return;
		}
		
		if (!forceRefresh && !oldResources.isEmpty() && oldResources.equals(newResources)) {
			return;
		}

		monitor.worked(ValidityModel.WORK_FOR_CLEAN_UP);
		monitor.setTaskName("Creating model");
		ValidityModel model2 = model = createModel(newResources);
		monitor.worked(ValidityModel.WORK_FOR_CREATE_MODEL);
		model2.init(monitor);

		oldResources.clear();
		if (!monitor.isCanceled()) {
			oldResources.addAll(newResources);
		}
	}
}
