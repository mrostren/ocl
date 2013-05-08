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
 *
 * </copyright>
 */
package org.eclipse.emf.validation.debug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.validation.debug.locator.ConstraintLocator;
import org.eclipse.emf.validation.debug.locator.EClassConstraintLocator;
import org.eclipse.emf.validation.debug.locator.EClassifierConstraintLocator;
import org.eclipse.emf.validation.debug.locator.EValidatorConstraintLocator;
import org.eclipse.emf.validation.debug.validity.ConstrainingNode;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.ResultConstrainingNode;
import org.eclipse.emf.validation.debug.validity.ResultSet;
import org.eclipse.emf.validation.debug.validity.ResultValidatableNode;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.debug.validity.ValidatableNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class ValidityManager
{	
	public static final @NonNull Map<String, List<ConstraintLocator>> globalConstraintLocators = new HashMap<String, List<ConstraintLocator>>();

/*	public static void addConstraintLocator(@NonNull EClass eClass, @NonNull ConstraintLocator constraintLocator) {
		Resource eResource = eClass.eResource();
		URI uri = eResource.getURI().appendFragment(eResource.getURIFragment(EcorePackage.Literals.ECLASS));
		addConstraintLocator(uri, constraintLocator);
	} */

	public static void addConstraintLocator(/*@NonNull*/ String uri, @NonNull ConstraintLocator constraintLocator) {
		List<ConstraintLocator> list = globalConstraintLocators.get(uri);
		if (list == null) {
			list = new ArrayList<ConstraintLocator>();
			globalConstraintLocators.put(uri, list);
		}
		if (!list.contains(constraintLocator)) {
			list.add(constraintLocator);
		}
	}
	
	public static void initialize() {
		addConstraintLocator(EcorePackage.eNS_URI, new EClassConstraintLocator());
		addConstraintLocator(EcorePackage.eNS_URI, new EClassifierConstraintLocator());
		addConstraintLocator(EcorePackage.eNS_URI, new EValidatorConstraintLocator());
//		addConstraintLocator(UMLPackage.Literals.CONSTRAINT, new UMLConstraintLocator());
//		addConstraintLocator(PivotPackage.Literals.CONSTRAINT, new PivotConstraintLocator());
	}
	
	protected final @NonNull ComposedAdapterFactory adapterFactory;
	protected final @NonNull Map<ResultValidatableNode, Result> resultsMap = new HashMap<ResultValidatableNode, Result>();
	protected final @SuppressWarnings("null")@NonNull Map<Object, Object> context = Diagnostician.INSTANCE.createDefaultContext();
	private @Nullable ValidityModel model = null;
	protected @Nullable ResultSet lastResultSet = null;

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

	protected @NonNull ValidityModel createModel(@NonNull Set<Resource> newResources) {
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
		for (ConstraintLocator constraintLocator : list) {
			ConstraintLocator constraintLocator2 = constraintLocator.getConstraintLocator();
			if (constraintLocator2 != null) {
				set.add(constraintLocator2);
			}
		}
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

	public List<Result> getConstrainingNodeResults(@NonNull ConstrainingNode element) {
//		refreshLastResultSet();
		List<Result> results = new ArrayList<Result>();
		if (element.getLabel().startsWith("EOperation")) {
			getAllConstrainingNodeResults(results, element);
		}
		else {
			getAllConstrainingNodeResults(results, element);
		}
		return results;
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

	public @NonNull String getLabel(@NonNull EObject eObject) {
	    IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
		String label = itemLabelProvider != null ? itemLabelProvider.getText(eObject) : eObject.toString();
		return label != null ? label : "";
	}

	public @Nullable RootNode getRootNode() {
		ValidityModel model2 = model;
		return model2 != null ? model2.getRootNode() : null;
	}

	public List<Result> getValidatableNodeResults(@NonNull ValidatableNode element) {
//		refreshLastResultSet();
		List<Result> results = new ArrayList<Result>();
		getAllValidatableNodeResults(results, element);
		return results;
	}

	public void setInput(Object newInput) {
//		System.out.println("inputChanged " + newInput);
//		if (newInput == oldInput) {
//			return;
//		}
//		contentMap.clear();
//		metaModelManager = null;
		ResourceSet selectedResourceSet = null;
		Resource selectedResource = null;
		EObject selectedObject = null;
		Set<Resource> newResources = new HashSet<Resource>();
		
		if (newInput instanceof ResourceSet) {
			selectedResourceSet = (ResourceSet) newInput;
//			metaModelManager = PivotUtil.findMetaModelManager(selectedResourceSet);
//			if (metaModelManager == null) {
//				metaModelManager = new MetaModelManager();
//				MetaModelManagerResourceSetAdapter.getAdapter(selectedResourceSet, metaModelManager);
//				if (myMetaModelManagers == null) {
//					myMetaModelManagers = new HashSet<MetaModelManager>();
//				}
//				myMetaModelManagers.add(metaModelManager);
//			}
			newResources.addAll(selectedResourceSet.getResources());
		}
		else if (newInput instanceof Resource) {
			selectedResource = (Resource) newInput;
			selectedResourceSet = selectedResource.getResourceSet();
			if (selectedResourceSet == null) {
				newResources.add(selectedResource);
			}
//			metaModelManager = PivotUtil.findMetaModelManager(selectedResource);			
		}
		else if (newInput instanceof EObject) {
			selectedObject = (EObject) newInput;
			selectedResource = selectedObject.eResource();
			selectedResourceSet = selectedResource != null ? selectedResource.getResourceSet() : null;
//			metaModelManager = PivotUtil.findMetaModelManager(selectedObject);			
		}
		if (selectedResourceSet != null) {
			newResources.addAll(selectedResourceSet.getResources());
		}
		if (newResources.isEmpty()) {
			return;
		}
		ValidityModel model2 = model;
		if (model2 != null) {
			if (newResources.equals(model2.getResources())) {
				return;
			}		
		}
		model = model2 = createModel(newResources);
		model2.init();
	}
}
