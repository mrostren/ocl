/**
 * <copyright>
 *
 * Copyright (c) 2014 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Obeo - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.validation.debug.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.test.ecoreTest.EClass2;
import org.eclipse.emf.validation.debug.test.ecoreTest.impl.Eclass1Impl;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
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
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator.ValidationAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.ui.commands.LoadCompleteOCLResourceHandler.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class testing the validityModel initialization mechanism.
 */
public class ValidityModelTests {
	private static final String OCL_CONSTRAINTS_MODEL = "model/ecore.ocl"; //$NON-NLS-1$

	private static final String OCL_CONSTRAINTS_MODEL2 = "model/ecoreTest.ocl"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME = "model/ecoreTest.ecore"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME2 = "model/validityModelTest.ecoretest"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME3 = "model/ecoreTest2.ecore"; //$NON-NLS-1$

	private static final String PREFIX_CONSTRAINT_LABEL = "Constraint "; //$NON-NLS-1$

	private RootNode rootNode;

	private Resource ecoreResource;

	private Resource ecoreResource2;

	private Resource ecoreResource3;

	private ValidationAdapter validationAdapter;

	private ValidityManager validityManager;

	private ValidityModel validityModel;

	private ResourceSet resourceSet;

	@Before
	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();
		// initialize all the needed resource factories to create ecore and ocl
		// resources in the global registry.
		TestTool.doCompleteOCLSetup();
		// Plug the OCL validation mechanism.
		OCLDelegateDomain.initialize(resourceSet);

		URI ecoreURI = TestTool.getTestModelURI(ECORE_MODEL_NAME);
		URI ecoreURI2 = TestTool.getTestModelURI(ECORE_MODEL_NAME2);
		URI ecoreURI3 = TestTool.getTestModelURI(ECORE_MODEL_NAME3);
		URI oclURI = TestTool.getTestModelURI(OCL_CONSTRAINTS_MODEL);
		URI oclURI2 = TestTool.getTestModelURI(OCL_CONSTRAINTS_MODEL2);

		ResourceSet resourceSet2 = DomainUtil.nonNullState(resourceSet);
		ecoreResource = resourceSet2.getResource(ecoreURI, true);
		ecoreResource2 = resourceSet2.getResource(ecoreURI2, true);
		ecoreResource3 = resourceSet2.getResource(ecoreURI3, true);

		Helper helper = new Helper(resourceSet2) {

			@Override
			protected boolean error(@NonNull String primaryMessage,
					@Nullable String detailMessage) {
				return false;
			}
		};

		helper.loadResource(oclURI);
		helper.loadResource(oclURI2);
		assertTrue(helper.loadMetaModels());
		helper.installPackages();

		validationAdapter = ValidationAdapter.findAdapter(resourceSet2);
		assertNotNull(validationAdapter);
		validityManager = new ValidityManager();
		validityManager.setInput(resourceSet2);
		rootNode = validityManager.getRootNode();
		validityModel = validityManager.getModel();
	}

	@After
	public void tearDown() throws Exception {
		if (resourceSet != null) {
			for (Resource resource : resourceSet.getResources()) {
				resource.unload();
			}
			resourceSet.getResources().clear();
			resourceSet = null;
		}
		validationAdapter = null;
		rootNode = null;
		ecoreResource = null;
		validityModel = null;
	}

	@Test
	public void testValidityModel_AllResourcesArePresent() {
		Set<Resource> resources = validityModel.getResources();
		assertEquals((Integer) 5, (Integer) resources.size());
		assertTrue(resources.contains(ecoreResource));
		assertTrue(resources.contains(ecoreResource2));
		assertTrue(resources.contains(ecoreResource3));
		assertTrue(TestTool.isCompleteOCLCSResourcePresent(resources));
	}

	@Test
	public void testValidityModelInitialization_RootValidatableNodesArePresent() {
		EList<RootValidatableNode> validatableNodes = rootNode
				.getValidatableNodes();
		assertEquals((Integer) 3, (Integer) validatableNodes.size());
		ValidatableNode rootChildValidatableNode = TestTool
				.getValidatableNodeFromRootByLabel(validatableNodes,
						"Eclass1 e1Att1"); //$NON-NLS-1$
		assertTrue(rootChildValidatableNode.getConstrainedObject() instanceof Eclass1Impl);
		EList<ValidatableNode> rootValidatableNodeChildren = rootChildValidatableNode
				.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		ValidatableNode eclass1_constraint_ValidatableNode = TestTool
				.getValidatableNodeByLabel(rootValidatableNodeChildren,
						PREFIX_CONSTRAINT_LABEL + "eclass1_constraint"); //$NON-NLS-1$
		assertNotNull(eclass1_constraint_ValidatableNode);
		assertTrue(eclass1_constraint_ValidatableNode.getConstrainedObject() == null);

		ValidatableNode containedValidatableNode = TestTool
				.getValidatableNodeByLabel(rootValidatableNodeChildren,
						"EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		assertTrue(containedValidatableNode.getConstrainedObject() instanceof EClass2);
		EList<ValidatableNode> containedValidatableNodes = containedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		ValidatableNode constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		assertTrue(constraintOfcontainedValidatableNode.getConstrainedObject() == null);

		containedValidatableNode = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, "EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

		rootChildValidatableNode = TestTool.getValidatableNodeFromRootByLabel(
				validatableNodes, "ecoreTest2"); //$NON-NLS-1$
		rootValidatableNodeChildren = rootChildValidatableNode.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		eclass1_constraint_ValidatableNode = TestTool
				.getValidatableNodeByLabel(rootValidatableNodeChildren,
						PREFIX_CONSTRAINT_LABEL + "epackage_constraint_2"); //$NON-NLS-1$
		assertNotNull(eclass1_constraint_ValidatableNode);
		eclass1_constraint_ValidatableNode = TestTool
				.getValidatableNodeByLabel(rootValidatableNodeChildren,
						PREFIX_CONSTRAINT_LABEL + "epackage_constraint"); //$NON-NLS-1$
		assertNotNull(eclass1_constraint_ValidatableNode);

		containedValidatableNode = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, "Eclass5"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 2, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						"eAttribute5 : EString"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		EList<ValidatableNode> containedValidatableNodes2 = constraintOfcontainedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes2.size());
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes2,
						PREFIX_CONSTRAINT_LABEL + "eattribute_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

	}

	@Test
	public void testValidityModelInitializationModelElements() {
		EList<RootValidatableNode> validatableNodes = rootNode
				.getValidatableNodes();
		assertEquals((Integer) 3, (Integer) validatableNodes.size());
		ValidatableNode rootValidatableNode = TestTool
				.getValidatableNodeFromRootByLabel(validatableNodes,
						"Eclass1 e1Att1"); //$NON-NLS-1$
		assertTrue(rootValidatableNode.getConstrainedObject() instanceof Eclass1Impl);
		EList<ValidatableNode> rootValidatableNodeChildren = rootValidatableNode
				.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		ValidatableNode constraint1 = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, PREFIX_CONSTRAINT_LABEL
						+ "eclass1_constraint"); //$NON-NLS-1$
		assertNotNull(constraint1);
		assertTrue(constraint1.getConstrainedObject() == null);

		ValidatableNode containedValidatableNode = TestTool
				.getValidatableNodeByLabel(rootValidatableNodeChildren,
						"EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		assertTrue(containedValidatableNode.getConstrainedObject() instanceof EClass2);
		EList<ValidatableNode> containedValidatableNodes = containedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		ValidatableNode constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		assertTrue(constraintOfcontainedValidatableNode.getConstrainedObject() == null);

		containedValidatableNode = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, "EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

		rootValidatableNode = TestTool.getValidatableNodeFromRootByLabel(
				validatableNodes, "ecoreTest2"); //$NON-NLS-1$
		rootValidatableNodeChildren = rootValidatableNode.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		constraint1 = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint_2"); //$NON-NLS-1$
		assertNotNull(constraint1);
		constraint1 = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint"); //$NON-NLS-1$
		assertNotNull(constraint1);

		containedValidatableNode = TestTool.getValidatableNodeByLabel(
				rootValidatableNodeChildren, "Eclass5"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 2, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes,
						"eAttribute5 : EString"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		EList<ValidatableNode> containedValidatableNodes2 = constraintOfcontainedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes2.size());
		constraintOfcontainedValidatableNode = TestTool
				.getValidatableNodeByLabel(containedValidatableNodes2,
						PREFIX_CONSTRAINT_LABEL + "eattribute_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

	}

	@Test
	public void testValidityModelInitializationConstraints() {

		Set<Resource> resources = validityModel.getResources();
		assertEquals((Integer) 5, (Integer) resources.size());
		assertTrue(resources.contains(ecoreResource));
		assertTrue(resources.contains(ecoreResource2));
		assertTrue(resources.contains(ecoreResource3));
		assertTrue(TestTool.isCompleteOCLCSResourcePresent(resources));

		EList<RootConstrainingNode> constrainingNodes = rootNode
				.getConstrainingNodes();
		// Tests that we have all the RootConstrainingNode ecoreTest and ecore.
		assertEquals((Integer) 2, (Integer) constrainingNodes.size());
		ConstrainingNode rootConstrainingNode = TestTool
				.getConstrainingNodeFromRootByLabel(constrainingNodes, "ecore"); //$NON-NLS-1$
		assertNotNull(rootConstrainingNode);
		assertTrue(rootConstrainingNode.getConstrainingObject() instanceof EPackage);
		EList<ConstrainingNode> contextsConstrained = rootConstrainingNode
				.getChildren();
		assertEquals((Integer) 3, (Integer) contextsConstrained.size());
		ConstrainingNode eClassContextConstrained = TestTool
				.getConstrainingNodeByLabel(contextsConstrained, "EClass"); //$NON-NLS-1$
		assertTrue(eClassContextConstrained.getConstrainingObject() instanceof EClass);
		EList<ConstrainingNode> constraintsOfContext = eClassContextConstrained
				.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		ConstrainingNode constraintOfContext = TestTool
				.getConstrainingNodeByLabel(constraintsOfContext,
						PREFIX_CONSTRAINT_LABEL + "eclass_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		assertTrue(constraintOfContext.getConstrainingObject() instanceof Constraint);
		EList<ConstrainingNode> elementsInvolvedByConstraint = constraintOfContext
				.getChildren();
		assertEquals((Integer) 4, (Integer) elementsInvolvedByConstraint.size());
		ConstrainingNode resultConstrainingNode = TestTool
				.getConstrainingNodeByLabel(elementsInvolvedByConstraint,
						"Eclass1"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode.getConstrainingObject() == null);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "Eclass5"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass3 -> Eclass5"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		eClassContextConstrained = TestTool.getConstrainingNodeByLabel(
				contextsConstrained, "EPackage"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 2, (Integer) constraintsOfContext.size());
		constraintOfContext = TestTool.getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 2, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		constraintOfContext = TestTool.getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint_2"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 2, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		eClassContextConstrained = TestTool.getConstrainingNodeByLabel(
				contextsConstrained, "EAttribute"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		constraintOfContext = TestTool.getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "eattribute_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 5, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute1 : EString"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute2 : EString"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute3 : EShort"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute5 : EString"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		rootConstrainingNode = TestTool.getConstrainingNodeFromRootByLabel(
				constrainingNodes, "ecoreTest"); //$NON-NLS-1$
		assertNotNull(rootConstrainingNode);

		contextsConstrained = rootConstrainingNode.getChildren();
		assertEquals((Integer) 2, (Integer) contextsConstrained.size());

		eClassContextConstrained = TestTool.getConstrainingNodeByLabel(
				contextsConstrained, "Eclass1"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		constraintOfContext = TestTool.getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "eclass1_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 1, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "Eclass1 e1Att1"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		eClassContextConstrained = TestTool.getConstrainingNodeByLabel(
				contextsConstrained, "EClass2"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		constraintOfContext = TestTool.getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "eclass2_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 2, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = TestTool.getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
	}

	@Test
	public void testValidityModelCreateResultSet() {
		ResultSet resultSet = validityManager
				.createResultSet(new NullProgressMonitor());
		EList<Result> results = resultSet.getResults();
		for (Result result : results) {
			ResultValidatableNode resultValidatableNode = result
					.getResultValidatableNode();
			assertNotNull(resultValidatableNode);
			assertNotNull(resultValidatableNode.getResultConstrainingNode());
			assertEquals(resultValidatableNode, resultValidatableNode
					.getResultConstrainingNode().getResultValidatableNode());
		}

		assertEquals((Integer) 16, (Integer) results.size());
	}
}
