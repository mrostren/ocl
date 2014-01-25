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
 *   E.D.Willink (Obeo) - 425799 Validity View Integration
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.validity.test;

import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.emf.validation.validity.ConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.LeafConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.ResultValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.validity.test.ecoreTest.EClass2;
import org.eclipse.ocl.examples.validity.test.ecoreTest.impl.Eclass1Impl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class testing the validityModel initialization mechanism.
 */
public class ValidityModelTests extends AbstractValidityTestCase
{
	private static final String PREFIX_CONSTRAINT_LABEL = "Constraint "; //$NON-NLS-1$

	@Before
	public void setUp() throws Exception {
		initTestModels();
		initValidityManager(null);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testValidityModel_AllResourcesArePresent() {
		Set<Resource> resources = validityModel.getResources();
		assertEquals((Integer) 5, (Integer) resources.size());
		assertTrue(resources.contains(ecoreResource));
		assertTrue(resources.contains(ecoreResource2));
		assertTrue(resources.contains(ecoreResource3));
		assertTrue(isCompleteOCLCSResourcePresent(resources));
	}

	@Test
	public void testValidityModelInitialization_RootValidatableNodesArePresent() {
		EList<RootValidatableNode> validatableNodes = rootNode
				.getValidatableNodes();
		assertEquals((Integer) 3, (Integer) validatableNodes.size());
		ValidatableNode rootChildValidatableNode = getValidatableNodeFromRootByLabel(validatableNodes,
						"Eclass1 e1Att1"); //$NON-NLS-1$
		assertTrue(rootChildValidatableNode.getConstrainedObject() instanceof Eclass1Impl);
		EList<ValidatableNode> rootValidatableNodeChildren = rootChildValidatableNode
				.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		ValidatableNode eclass1_constraint_ValidatableNode = getValidatableNodeByLabel(rootValidatableNodeChildren,
						PREFIX_CONSTRAINT_LABEL + "eclass1_constraint"); //$NON-NLS-1$
		assertNotNull(eclass1_constraint_ValidatableNode);
		assertTrue(eclass1_constraint_ValidatableNode.getConstrainedObject() == null);

		ValidatableNode containedValidatableNode = getValidatableNodeByLabel(rootValidatableNodeChildren,
						"EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		assertTrue(containedValidatableNode.getConstrainedObject() instanceof EClass2);
		EList<ValidatableNode> containedValidatableNodes = containedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		ValidatableNode constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		assertTrue(constraintOfcontainedValidatableNode.getConstrainedObject() == null);

		containedValidatableNode = getValidatableNodeByLabel(
				rootValidatableNodeChildren, "EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

		rootChildValidatableNode = getValidatableNodeFromRootByLabel(
				validatableNodes, "ecoreTest2"); //$NON-NLS-1$
		rootValidatableNodeChildren = rootChildValidatableNode.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		eclass1_constraint_ValidatableNode = getValidatableNodeByLabel(rootValidatableNodeChildren,
						PREFIX_CONSTRAINT_LABEL + "epackage_constraint_2"); //$NON-NLS-1$
		assertNotNull(eclass1_constraint_ValidatableNode);
		eclass1_constraint_ValidatableNode = getValidatableNodeByLabel(rootValidatableNodeChildren,
						PREFIX_CONSTRAINT_LABEL + "epackage_constraint"); //$NON-NLS-1$
		assertNotNull(eclass1_constraint_ValidatableNode);

		containedValidatableNode = getValidatableNodeByLabel(
				rootValidatableNodeChildren, "Eclass5"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 2, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						"eAttribute5 : EString"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		EList<ValidatableNode> containedValidatableNodes2 = constraintOfcontainedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes2.size());
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes2,
						PREFIX_CONSTRAINT_LABEL + "eattribute_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

	}

	@Test
	public void testValidityModelInitializationModelElements() {
		EList<RootValidatableNode> validatableNodes = rootNode
				.getValidatableNodes();
		assertEquals((Integer) 3, (Integer) validatableNodes.size());
		ValidatableNode rootValidatableNode = getValidatableNodeFromRootByLabel(validatableNodes,
						"Eclass1 e1Att1"); //$NON-NLS-1$
		assertTrue(rootValidatableNode.getConstrainedObject() instanceof Eclass1Impl);
		EList<ValidatableNode> rootValidatableNodeChildren = rootValidatableNode
				.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		ValidatableNode constraint1 = getValidatableNodeByLabel(
				rootValidatableNodeChildren, PREFIX_CONSTRAINT_LABEL
						+ "eclass1_constraint"); //$NON-NLS-1$
		assertNotNull(constraint1);
		assertTrue(constraint1.getConstrainedObject() == null);

		ValidatableNode containedValidatableNode = getValidatableNodeByLabel(rootValidatableNodeChildren,
						"EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		assertTrue(containedValidatableNode.getConstrainedObject() instanceof EClass2);
		EList<ValidatableNode> containedValidatableNodes = containedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		ValidatableNode constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		assertTrue(constraintOfcontainedValidatableNode.getConstrainedObject() == null);

		containedValidatableNode = getValidatableNodeByLabel(
				rootValidatableNodeChildren, "EClass2"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass2_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);

		rootValidatableNode = getValidatableNodeFromRootByLabel(
				validatableNodes, "ecoreTest2"); //$NON-NLS-1$
		rootValidatableNodeChildren = rootValidatableNode.getChildren();
		assertEquals((Integer) 3, (Integer) rootValidatableNodeChildren.size());
		constraint1 = getValidatableNodeByLabel(
				rootValidatableNodeChildren, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint_2"); //$NON-NLS-1$
		assertNotNull(constraint1);
		constraint1 = getValidatableNodeByLabel(
				rootValidatableNodeChildren, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint"); //$NON-NLS-1$
		assertNotNull(constraint1);

		containedValidatableNode = getValidatableNodeByLabel(
				rootValidatableNodeChildren, "Eclass5"); //$NON-NLS-1$
		assertNotNull(containedValidatableNode);
		containedValidatableNodes = containedValidatableNode.getChildren();
		assertEquals((Integer) 2, (Integer) containedValidatableNodes.size());
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						PREFIX_CONSTRAINT_LABEL + "eclass_constraint"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes,
						"eAttribute5 : EString"); //$NON-NLS-1$
		assertNotNull(constraintOfcontainedValidatableNode);
		EList<ValidatableNode> containedValidatableNodes2 = constraintOfcontainedValidatableNode
				.getChildren();
		assertEquals((Integer) 1, (Integer) containedValidatableNodes2.size());
		constraintOfcontainedValidatableNode = getValidatableNodeByLabel(containedValidatableNodes2,
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
		assertTrue(isCompleteOCLCSResourcePresent(resources));

		EList<RootConstrainingNode> constrainingNodes = rootNode
				.getConstrainingNodes();
		// Tests that we have all the RootConstrainingNode ecoreTest and ecore.
		assertEquals((Integer) 2, (Integer) constrainingNodes.size());
		ConstrainingNode rootConstrainingNode = getConstrainingNodeFromRootByLabel(constrainingNodes, "ecore"); //$NON-NLS-1$
		assertNotNull(rootConstrainingNode);
		assertTrue(rootConstrainingNode.getConstrainingObject() instanceof EPackage);
		EList<ConstrainingNode> contextsConstrained = rootConstrainingNode
				.getChildren();
		assertEquals((Integer) 3, (Integer) contextsConstrained.size());
		ConstrainingNode eClassContextConstrained = getConstrainingNodeByLabel(contextsConstrained, "EClass"); //$NON-NLS-1$
		assertTrue(eClassContextConstrained.getConstrainingObject() instanceof EClass);
		EList<ConstrainingNode> constraintsOfContext = eClassContextConstrained
				.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		ConstrainingNode constraintOfContext = getConstrainingNodeByLabel(constraintsOfContext,
						PREFIX_CONSTRAINT_LABEL + "eclass_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		assertTrue(constraintOfContext.getConstrainingObject() instanceof Constraint);
		EList<ConstrainingNode> elementsInvolvedByConstraint = constraintOfContext
				.getChildren();
		assertEquals((Integer) 4, (Integer) elementsInvolvedByConstraint.size());
		ConstrainingNode resultConstrainingNode = getConstrainingNodeByLabel(elementsInvolvedByConstraint,
						"Eclass1"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode.getConstrainingObject() == null);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "Eclass5"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass3 -> Eclass5"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		eClassContextConstrained = getConstrainingNodeByLabel(
				contextsConstrained, "EPackage"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 2, (Integer) constraintsOfContext.size());
		constraintOfContext = getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 2, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		constraintOfContext = getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "epackage_constraint_2"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 2, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "ecoreTest"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		eClassContextConstrained = getConstrainingNodeByLabel(
				contextsConstrained, "EAttribute"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		constraintOfContext = getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "eattribute_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 5, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute1 : EString"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute2 : EString"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute3 : EShort"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "eAttribute5 : EString"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		rootConstrainingNode = getConstrainingNodeFromRootByLabel(
				constrainingNodes, "ecoreTest"); //$NON-NLS-1$
		assertNotNull(rootConstrainingNode);

		contextsConstrained = rootConstrainingNode.getChildren();
		assertEquals((Integer) 2, (Integer) contextsConstrained.size());

		eClassContextConstrained = getConstrainingNodeByLabel(
				contextsConstrained, "Eclass1"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		constraintOfContext = getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "eclass1_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 1, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "Eclass1 e1Att1"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);

		eClassContextConstrained = getConstrainingNodeByLabel(
				contextsConstrained, "EClass2"); //$NON-NLS-1$
		constraintsOfContext = eClassContextConstrained.getChildren();
		assertEquals((Integer) 1, (Integer) constraintsOfContext.size());
		constraintOfContext = getConstrainingNodeByLabel(
				constraintsOfContext, PREFIX_CONSTRAINT_LABEL
						+ "eclass2_constraint"); //$NON-NLS-1$
		assertTrue(constraintOfContext instanceof LeafConstrainingNode);
		elementsInvolvedByConstraint = constraintOfContext.getChildren();
		assertEquals((Integer) 2, (Integer) elementsInvolvedByConstraint.size());
		resultConstrainingNode = getConstrainingNodeByLabel(
				elementsInvolvedByConstraint, "EClass2"); //$NON-NLS-1$
		assertNotNull(resultConstrainingNode);
		assertTrue(resultConstrainingNode instanceof ResultConstrainingNode);
		resultConstrainingNode = getConstrainingNodeByLabel(
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
