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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.debug.locator.ConstraintLocator;
import org.eclipse.emf.validation.debug.validity.AbstractNode;
import org.eclipse.emf.validation.debug.validity.ConstrainingNode;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.ResultConstrainingNode;
import org.eclipse.emf.validation.debug.validity.ResultSet;
import org.eclipse.emf.validation.debug.validity.ResultValidatableNode;
import org.eclipse.emf.validation.debug.validity.RootConstrainingNode;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.debug.validity.RootValidatableNode;
import org.eclipse.emf.validation.debug.validity.ValidatableNode;
import org.eclipse.emf.validation.debug.validity.ValidityFactory;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class ValidityModel
{
	private static final Logger logger = Logger.getLogger(ValidityManager.class);
	private static Comparator<AbstractNode> labelComparator = new Comparator<AbstractNode>()
	{
		public int compare(AbstractNode o1, AbstractNode o2) {
			String l1 = o1.getLabel();
			String l2 = o2.getLabel();
			return l1.compareTo(l2);
		}
	};
	private static @Nullable Set<ConstraintLocator> badConstraintLocators = null;
	
	protected final @NonNull ValidityManager validityManager;
	private final @SuppressWarnings("null")@NonNull RootNode rootNode = ValidityFactory.eINSTANCE.createRootNode();
	private final @NonNull Map<URI, ConstrainingNode> allConstrainingNodes = new HashMap<URI, ConstrainingNode>();
	private final @NonNull Map<Object, ValidatableNode> allValidatableNodes = new HashMap<Object, ValidatableNode>();
	private final @NonNull Map<EModelElement, Set<URI>> typeClosures = new HashMap<EModelElement, Set<URI>>();
	private final @NonNull Set<Resource> resources;
	
	public ValidityModel(@NonNull ValidityManager validityManager, @NonNull Set<Resource> newResources) {
		this.validityManager = validityManager;
		this.resources = newResources;
	}

	//
	//	Find all EPackages in the source Resources
	//
	protected @NonNull Map<EPackage,Set<Resource>> analyzeResources(@NonNull Collection<Resource> resources) {
		List<Resource> allResources = new ArrayList<Resource>(resources);
		Map<EPackage,Set<Resource>> ePackage2resources = new HashMap<EPackage,Set<Resource>>();
		for (int i = 0; i < allResources.size(); i++) {
			Resource resource = allResources.get(i);
			System.out.println(i + "/" + allResources.size() + " analyzeResources " + resource.getURI());
//			System.out.println(resource);
			Set<EClass> eClasses = new HashSet<EClass>();
			for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
				@SuppressWarnings("null")@NonNull EObject eObject = tit.next();
				@SuppressWarnings("null")@NonNull EClass eClass = eObject.eClass();
				eClasses.add(eClass);
			}
			Set<EPackage> ePackages = new HashSet<EPackage>();
			for (@SuppressWarnings("null")@NonNull EClass eClass : eClasses) {
				ePackages.add(eClass.getEPackage());
				for (@SuppressWarnings("null")@NonNull EClass eSuperClass : eClass.getEAllSuperTypes()) {
					ePackages.add(eSuperClass.getEPackage());
				}
			}
			for (@SuppressWarnings("null")@NonNull EPackage ePackage : ePackages) {
				Set<Resource> ePackageResources = ePackage2resources.get(ePackage);
				if (ePackageResources == null) {
					ePackageResources = new HashSet<Resource>();
					ePackage2resources.put(ePackage, ePackageResources);
				}
				ePackageResources.add(resource);
				List<ConstraintLocator> list = ValidityManager.getConstraintLocators(ePackage.getNsURI());
				if (list != null) {
					for (ConstraintLocator constraintLocator : list) {
						try {
							Collection<Resource> moreResources = constraintLocator.getImports(ePackage, resource);
							if (moreResources != null) {
								for (Resource anotherResource : moreResources) {
									if (!allResources.contains(anotherResource)) {
										allResources.add(anotherResource);
									}
								}
							}
						}
						catch (Exception e) {
							Set<ConstraintLocator> badConstraintLocators2 = badConstraintLocators;
							if (badConstraintLocators2 == null) {
								synchronized (this) {
									badConstraintLocators = badConstraintLocators2 = new HashSet<ConstraintLocator>();
								}
							}
							if (!badConstraintLocators2.contains(constraintLocator)) {
								synchronized (badConstraintLocators2) {
									if (badConstraintLocators2.add(constraintLocator)) {
										logger.error("ConstraintLocator " + constraintLocator + " failed", e);
									}
								}
							}
						}
					}
				}
			}
		}
		return ePackage2resources;
	}

	@SuppressWarnings("null")
	protected @NonNull ConstrainingNode createConstrainingNode() {
		return ValidityFactory.eINSTANCE.createConstrainingNode();
	}

	@SuppressWarnings("null")
	public @NonNull LeafConstrainingNode createLeafConstrainingNode() {
		return ValidityFactory.eINSTANCE.createLeafConstrainingNode();
	}

	//
	//	Create the child LeafConstrainingNodes for each EClass
	//
	protected void createLeafConstrainingNodes(@NonNull Map<EModelElement, Set<LeafConstrainingNode>> allConstraints) {
//		for (EClass eClass : eClasses) {
		for (@SuppressWarnings("null")@NonNull EModelElement constrainedType : allConstraints.keySet()) {
//			System.out.println(eClass);
//			if (eClass.getName().contains("In")) {
//				System.out.println(eClass);
//			}
			ConstrainingNode classConstrainingNode = getConstrainingNode(constrainedType);
			List<ConstrainingNode> children = classConstrainingNode.getChildren();
//			for (@SuppressWarnings("null")@NonNull EModelElement eachConstrainedType : allConstrainedTypes) {
				Set<LeafConstrainingNode> someConstraints = allConstraints.get(constrainedType);
				if (someConstraints != null) {
					children.addAll(someConstraints);
				}
//			}
		}
	}

	/**
	 * Return a new Result object, or return null if the creation process is to be aborted.
	 * <p>
	 * The default implementation always return an object. Derived implementations may cancel
	 * in response to a progress monitor request.
	 * 
	 * @param monitor
	 * @return
	 */
	protected @Nullable Result createResult(@Nullable IProgressMonitor monitor) {
		return ValidityFactory.eINSTANCE.createResult();
	}	

	@SuppressWarnings("null")
	protected @NonNull ResultConstrainingNode createResultConstrainingNode() {
		return ValidityFactory.eINSTANCE.createResultConstrainingNode();
	}

	/**
	 * Create the ResultValidatableNode,ResultConstrainingNode cross-linkage between constrainedObject and
	 * each child constraint of constrainingType.
	 */
	protected void createResultNodes(@NonNull EObject constrainedObject, @NonNull URI constrainingType) {
		ConstrainingNode constrainingNode = allConstrainingNodes.get(constrainingType);
		if (constrainingNode != null) {
			List<ConstrainingNode> children = constrainingNode.getChildren();
			if (children.size() > 0) {
				ValidatableNode validatable = getValidatableNode(constrainedObject);
				for (@SuppressWarnings("null")@NonNull ConstrainingNode leafConstrainingNode : children) {					
					ResultConstrainingNode resultConstrainingNode = createResultConstrainingNode();
					ResultValidatableNode resultValidatableNode = createResultValidatableNode();
					resultConstrainingNode.setResultValidatableNode(resultValidatableNode);
					resultConstrainingNode.setLabel(validatable.getLabel());
					resultValidatableNode.setLabel(leafConstrainingNode.getLabel());
					leafConstrainingNode.getChildren().add(resultConstrainingNode);
					validatable.getChildren().add(resultValidatableNode);
				}
			}
		}
	}

	@SuppressWarnings("null")
	protected @NonNull ResultSet createResultSet() {
		return ValidityFactory.eINSTANCE.createResultSet();
	}

	/**
	 * Return a new ResultSet object containing an initial result for every enabled combination
	 * of ValidatableNode and ConstrainingNode. Returns null if the creation process was aborted.
	 * 
	 * @param monitor
	 * @return
	 */
	public /*synchronized*/ @Nullable ResultSet createResultSet(@Nullable IProgressMonitor monitor) {
		ResultSet resultSet = createResultSet();
		List<Result> results = resultSet.getResults();
		if (!createResults(results, rootNode.getValidatableNodes(), monitor)) {
			return null;
		}
		else {
			rootNode.getResultSets().add(resultSet);
			return resultSet;
		}
	}

	@SuppressWarnings("null")
	protected @NonNull ResultValidatableNode createResultValidatableNode() {
		return ValidityFactory.eINSTANCE.createResultValidatableNode();
	}

	protected boolean createResults(@NonNull List<Result> results, @NonNull Iterable<? extends ValidatableNode> validatableNodes, @Nullable IProgressMonitor monitor) {
		for (ValidatableNode validatable : validatableNodes) {
			if (validatable.isEnabled()) {
				if (validatable instanceof ResultValidatableNode) {
					ResultValidatableNode resultValidatableNode = (ResultValidatableNode) validatable;
					LeafConstrainingNode constraint = (LeafConstrainingNode) resultValidatableNode.getResultConstrainingNode().getParent();
					if (constraint.isEnabled()) {
						Result result = createResult(monitor);
						if (result == null) {
							return false;
						}
						result.setResultValidatableNode(resultValidatableNode);
						results.add(result);
					}
				}
			}
			if (!createResults(results, validatable.getChildren(), monitor)) {
				return false;
			}
		}
		return true;
	}

	//
	// Create the ResultValidatableNode,ResultConstrainingNode cross-linkage for all validateableObject,constraint pairs.
	//
	protected void createResults(@NonNull Set<Resource> resources) {
		for (Resource resource : resources) {
			System.out.println("createResults " + resource.getURI());
			System.out.println(resource);
			for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
				@SuppressWarnings("null")@NonNull EObject eObject = tit.next();
				EClass eClass = eObject.eClass();
				EAnnotation eAnnotation = eClass.getEAnnotation("http://www.eclipse.org/uml2/2.0.0/UML");
				if ((eAnnotation != null) && (eAnnotation.getReferences().size() > 0)) {		// Stereotype application
					EObject umlClass = eAnnotation.getReferences().get(0);
					if (umlClass != null) {
						createResultNodes(eObject, getURI(umlClass));
//						eClass = null;
					}
				}
				else if (eClass != null) {
					for (@SuppressWarnings("null")@NonNull URI aType : getTypeClosure(eClass)) {
		//				System.out.println("  ... " + getLabel(eObject) + " " + getLabel(aType));
						createResultNodes(eObject, aType);
					}
				}
			}
		}
	}

	@SuppressWarnings("null")
	protected @NonNull RootConstrainingNode createRootConstrainingNode() {
		return ValidityFactory.eINSTANCE.createRootConstrainingNode();
	}

	@SuppressWarnings("null")
	protected @NonNull RootValidatableNode createRootValidatableNode() {
		return ValidityFactory.eINSTANCE.createRootValidatableNode();
	}

	@SuppressWarnings("null")
	protected @NonNull ValidatableNode createValidatableNode() {
		return ValidityFactory.eINSTANCE.createValidatableNode();
	}

	/**
	 * Return the ConstrainingNode node for EObject creating any parent ConstrainingNodes that
	 * are required to ensure that the returned ConstrainingNode is installed in the root.
	 */
	public @NonNull ConstrainingNode getConstrainingNode(@NonNull EObject eObject) {
		URI uri = getURI(eObject);
		ConstrainingNode constrainingNode = allConstrainingNodes.get(uri);
		if (constrainingNode == null) {
			EObject eContainer = eObject.eContainer();
			if (eContainer == null) {
				RootConstrainingNode rootConstrainingNode = createRootConstrainingNode();
				rootNode.getConstrainingNodes().add(rootConstrainingNode);
				constrainingNode = rootConstrainingNode;
			}
//			else if (eObject instanceof EClass) {
//				constrainingNode = ValidationFactory.eINSTANCE.createLeafConstrainingNode();
//			ConstrainingNode parentConstrainingNode = getConstrainingNode(eContainer);
//				parentConstrainingNode.getChildren().add(constrainingNode);
//			}
			else {
				constrainingNode = createConstrainingNode();
				ConstrainingNode parentConstrainingNode = getConstrainingNode(eContainer);
				parentConstrainingNode.getChildren().add(constrainingNode);
			}
			constrainingNode.setConstrainingObject(eObject);
			constrainingNode.setLabel(validityManager.getLabel(eObject));
			constrainingNode.setEnabled(true);
			allConstrainingNodes.put(uri, constrainingNode);
		}
		return constrainingNode;
	}

	public @NonNull String getLabel(@NonNull EObject eObject) {
		return validityManager.getLabel(eObject);
	}

	public @NonNull Set<Resource> getResources() {
		return resources;
	}

	public @NonNull RootNode getRootNode() {
		return rootNode;
	}

	/**
	 * Return all types that may provode constraints to an instance if aType.
	 */
	protected @NonNull Set<URI> getTypeClosure(@NonNull EModelElement aType) {
		Set<URI> typeClosure = typeClosures.get(aType);
		if (typeClosure == null) {
			typeClosure = new HashSet<URI>();
			List<ConstraintLocator> constraintLocators = ValidityManager.getConstraintLocators(aType.eClass().getEPackage().getNsURI());
			if (constraintLocators != null) {
				for (ConstraintLocator constraintLocator : constraintLocators) {
					typeClosure.addAll(constraintLocator.getAllTypes(aType));
				}
			}
			typeClosures.put(aType, typeClosure);
		}
		return typeClosure;
	}
	
	private @NonNull URI getURI(@NonNull EObject eObject) {
		ConstraintLocator constraintLocator = ValidityManager.getConstraintLocator(eObject);
		if (constraintLocator != null) {
			URI uri = constraintLocator.getURI(eObject);
			if (uri != null) {
				return uri;
			}
		}
		return EcoreUtil.getURI(eObject);
	}

	/**
	 * Return the ValidatableNode node for EObject creating any ValidatableNodes that
	 * are required to ensure that the returned ValidatableNode is installed in the root.
	 */
	protected @NonNull ValidatableNode getValidatableNode(@NonNull EObject eObject) {
		ValidatableNode validatable = allValidatableNodes.get(eObject);
		if (validatable == null) {
			EObject eContainer = eObject.eContainer();
			if (eContainer != null) {
//				ValidatableNode parentValidatableNode = getValidatableNode(eContainer);
//				parentValidatableNode.getChildren().add(validatable);
			}
			else if (eObject instanceof DynamicEObjectImpl) {
				EClass eClass = eObject.eClass();
				for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
					String featureName = eStructuralFeature.getName();
					if ((featureName != null) && featureName.startsWith("base_")  //org.eclipse.uml2.uml.Extension.METACLASS_ROLE_PREFIX)
					  && (eStructuralFeature instanceof EReference)
					  && eObject.eIsSet(eStructuralFeature)) {						// Unset for an applicable stereotype that has not been applied
						eContainer = (EObject) eObject.eGet(eStructuralFeature);
						break;
					}
				}
			}
			if (eContainer != null) {
				validatable = createValidatableNode();
				ValidatableNode parentValidatableNode = getValidatableNode(eContainer);
				parentValidatableNode.getChildren().add(validatable);
			}
			else {
				RootValidatableNode rootValidatableNode = createRootValidatableNode();
				rootNode.getValidatableNodes().add(rootValidatableNode);
				validatable = rootValidatableNode;
			}
			validatable.setEnabled(true);
			validatable.setLabel(validityManager.getLabel(eObject));
			validatable.setConstrainedObject(eObject);
			allValidatableNodes.put(eObject, validatable);
		}
		return validatable;
	}

	public void init() {
		Map<EPackage,Set<Resource>> ePackage2resources = analyzeResources(resources);			//	Find all EClasses and EPackages in the source Resources
		printPackage2Resource(ePackage2resources);
		Map<EModelElement, Set<LeafConstrainingNode>> allConstraints = locateConstraints(ePackage2resources);
		if (allConstraints != null) {
			String s = printConstraints(allConstraints);
			System.out.println("All Constraints\n" + s);
		}

//		if (eClasses != null) {
//			String s = printConstrainingNodes(eClasses);
//			System.out.println("ConstrainingNodes \n" + s);
//		}
		if (allConstraints != null) {
			createLeafConstrainingNodes(allConstraints);
		}
//		if (allConstraints != null) {
//			String s = printConstraints(allConstraints);
//			System.out.println("All Constraints\n" + s);
//		}
		createResults(resources);
		sortNodes(rootNode.getConstrainingNodes());
		sortNodes(rootNode.getValidatableNodes());
	}
	
	//
	//	Find all constraints for each EClass
	//
	protected Map<EModelElement, Set<LeafConstrainingNode>> locateConstraints(@NonNull Map<EPackage,Set<Resource>> ePackage2resources) {
		Map<EModelElement, Set<LeafConstrainingNode>> allConstraints = new HashMap<EModelElement, Set<LeafConstrainingNode>>();
		for (@SuppressWarnings("null")@NonNull EPackage ePackage : ePackage2resources.keySet()) {
			List<ConstraintLocator> list = ValidityManager.getConstraintLocators(ePackage.getNsURI());
			if (list != null) {
				@SuppressWarnings("null")@NonNull Set<Resource> ePackageResources = ePackage2resources.get(ePackage);
				for (ConstraintLocator constraintLocator : list) {
					try {
						Map<EModelElement, List<LeafConstrainingNode>> availableConstraints = constraintLocator.getConstraints(this, ePackage, ePackageResources);
						if (availableConstraints != null) {
							assert !availableConstraints.containsKey(null);
							for (EModelElement constrainedType : availableConstraints.keySet()) {
								Set<LeafConstrainingNode> typeConstraints = allConstraints.get(constrainedType);
								if (typeConstraints == null) {
									typeConstraints = new HashSet<LeafConstrainingNode>();
									allConstraints.put(constrainedType, typeConstraints);
								}
								typeConstraints.addAll(availableConstraints.get(constrainedType));
							}
						}
					}
					catch (Exception e) {
						Set<ConstraintLocator> badConstraintLocators2 = badConstraintLocators;
						if (badConstraintLocators2 == null) {
							synchronized (this) {
								badConstraintLocators = badConstraintLocators2 = new HashSet<ConstraintLocator>();
							}
						}
						if (!badConstraintLocators2.contains(constraintLocator)) {
							synchronized (badConstraintLocators2) {
								if (badConstraintLocators2.add(constraintLocator)) {
									logger.error("ConstraintLocator " + constraintLocator + " failed", e);
								}
							}
						}
					}
				}
			}
		}
		return allConstraints;
	}

	protected String printConstrainingNodes(@NonNull Set<EClass> eClasses) {
		StringBuilder s = new StringBuilder();
		ArrayList<EClass> sortedList = new ArrayList<EClass>(eClasses);
		Collections.sort(sortedList, new Comparator<EClass>()
		{
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (EClass eClass : sortedList) {
			s.append("\t" + eClass.getName() + ":");
			ConstrainingNode classConstrainingNode = allConstrainingNodes.get(eClass);
			if (classConstrainingNode != null) {
				for (ConstrainingNode constraint : classConstrainingNode.getChildren()) {
					s.append(" \'" + constraint.getLabel() + "'");
				}
			}
			s.append("\n");
		}
		return s.toString();
	}

	protected String printConstraints(@NonNull Map<EModelElement, Set<LeafConstrainingNode>> allConstraints) {
		StringBuilder s = new StringBuilder();
		ArrayList<EModelElement> sortedList = new ArrayList<EModelElement>(allConstraints.keySet());
//		Collections.sort(sortedList, new Comparator<EClassifier>()
//		{
//			public int compare(EClassifier o1, EClassifier o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		for (@SuppressWarnings("null")@NonNull EModelElement eObject : sortedList) {
			Set<LeafConstrainingNode> constraints = allConstraints.get(eObject);
			if ((constraints != null) && (constraints.size() > 0)) {
				LeafConstrainingNode firstConstraint = constraints.iterator().next();
				ConstraintLocator constraintLocator = firstConstraint.getConstraintLocator();
				s.append("\t");
				s.append(constraintLocator.getLabel(eObject));
				s.append(":");
				for (ConstrainingNode constraint : constraints) {
					s.append(" \'" + constraint.getLabel() + "'");
				}
			}
			s.append("\n");
		}
		return s.toString();
	}

	protected void printPackage2Resource(@NonNull Map<EPackage,Set<Resource>> ePackage2resources) {
		for (EPackage ePackage : ePackage2resources.keySet()) {
			System.out.println("EPackage : " + ePackage.getNsURI());
			for (Resource resource : ePackage2resources.get(ePackage)) {
				System.out.println("\t" + resource.getURI());
			}
		}
	}

	protected <T extends AbstractNode> void sortEList(@NonNull EList<T> nodes) {
		List<T> sortedList = new ArrayList<T>(nodes);
		Collections.sort(sortedList, labelComparator);
		for (int i = 0; i < sortedList.size(); i++) {
			nodes.move(i, sortedList.get(i));
		}
	}

	protected <T extends AbstractNode> void sortNodes(@NonNull EList<T> nodes) {
		sortEList(nodes);
		for (AbstractNode node : nodes) {
			sortNodes(node.getChildren());
		}
	}
}