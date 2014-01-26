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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.debug.test.ecoreTest.Eclass1;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.emf.validation.validity.ConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityManager;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityModel;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator.ValidationAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.ui.commands.LoadCompleteOCLResourceHandler.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class testing the validityManager initialization mechanism.
 */
public class ValidityManagerTests extends TestCase
{
	public static class TestValidityManager extends ValidityManager
	{

		public void putResults(ResultSet resultSet) {
			for (Result result : resultSet.getResults()) {
				resultsMap.put(result.getResultValidatableNode(), result);
			}
		}
		
	}
	
	private static final String OCL_CONSTRAINTS_MODEL = "model/ecore.ocl"; //$NON-NLS-1$

	private static final String OCL_CONSTRAINTS_MODEL2 = "model/ecoreTest.ocl"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME = "model/ecoreTest.ecore"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME2 = "model/validityModelTest.ecoretest"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME3 = "model/ecoreTest2.ecore"; //$NON-NLS-1$

	private RootNode rootNode;

	private Resource ecoreResource;

	private Resource ecoreResource2;

	private Resource ecoreResource3;

	private Resource oclResource;

	private Resource oclResource2;

	private ValidationAdapter validationAdapter;

	private ValidityModel validityModel;

	private TestValidityManager validityManager;

	private ResourceSet resourceSet;

	@Before
	public void setUp()
			throws Exception {
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
			protected boolean error(String primaryMessage, String detailMessage) {
				return false;
			}
		};

		oclResource = helper.loadResource(oclURI);
		oclResource2 = helper.loadResource(oclURI2);
		assertTrue(helper.loadMetaModels());
		helper.installPackages();
		Set<Resource> newResources = new HashSet<Resource>();
		newResources.add(ecoreResource);
		newResources.add(ecoreResource2);
		newResources.add(ecoreResource3);
		newResources.add(oclResource);
		newResources.add(oclResource2);

		validationAdapter = ValidationAdapter.findAdapter(resourceSet2);
		assertNotNull(validationAdapter);
		validityManager = new TestValidityManager();
		validityManager.setInput(resourceSet2);
		rootNode = validityManager.getRootNode();
		validityModel = validityManager.getModel();
	}

	@After
	public void tearDown()
			throws Exception {
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
		validityManager.dispose();
		validityManager = null;
	}

	@Test
	public void testValidityManagerGetConstrainingNodeResults() {
		ConstrainingNode constrainingNode = validityManager
			.getConstrainingNode(ecoreResource2.getContents().get(0));
		assertTrue(constrainingNode instanceof RootConstrainingNode);
		assertEquals("Eclass1 e1Att1", constrainingNode.getLabel()); //$NON-NLS-1$

		ResultSet resultSet = validityModel
			.createResultSet(new NullProgressMonitor());
		validityManager.putResults(resultSet);

		ConstrainingNode constrainingNodeFromRootByLabel = TestTool
			.getConstrainingNodeFromRootByLabel(
				rootNode.getConstrainingNodes(), "ecoreTest"); //$NON-NLS-1$
		ConstrainingNode constrainingNodeByLabel = TestTool
			.getConstrainingNodeByLabel(
				constrainingNodeFromRootByLabel.getChildren(), "Eclass1"); //$NON-NLS-1$
		List<Result> constrainingNodeResults = validityManager
			.getConstrainingNodeResults(constrainingNodeByLabel);
		assertEquals((Integer) 1, (Integer) constrainingNodeResults.size());
		assertEquals("Eclass1 e1Att1", constrainingNodeResults.get(0) //$NON-NLS-1$
			.getResultConstrainingNode().getLabel());
		assertEquals("Constraint eclass1_constraint", constrainingNodeResults //$NON-NLS-1$
			.get(0).getResultValidatableNode().getLabel());
		assertEquals("Constraint eclass1_constraint", constrainingNodeResults //$NON-NLS-1$
			.get(0).getLeafConstrainingNode().getLabel());
	}

	@Test
	public void testValidityManagerGetValidatableNodeResults() {
		ResultSet resultSet = validityModel
			.createResultSet(new NullProgressMonitor());
		validityManager.putResults(resultSet);

		ValidatableNode rootValidatableNode = TestTool
			.getValidatableNodeFromRootByLabel(rootNode.getValidatableNodes(),
				"ecoreTest2"); //$NON-NLS-1$
		List<Result> validatableNodeResults = validityManager.getValidatableNodeResults(rootValidatableNode);

		assertEquals((Integer) 4, (Integer) validatableNodeResults.size());

		assertNotNull(TestTool.getResultFromResultValidatableNode(
			validatableNodeResults, "Constraint epackage_constraint")); //$NON-NLS-1$

		assertNotNull(TestTool.getResultFromResultValidatableNode(
			validatableNodeResults, "Constraint epackage_constraint_2")); //$NON-NLS-1$

		assertNotNull(TestTool.getResultFromResultValidatableNode(
			validatableNodeResults, "Constraint eclass_constraint")); //$NON-NLS-1$

		assertNotNull(TestTool.getResultFromResultValidatableNode(
			validatableNodeResults, "Constraint eattribute_constraint")); //$NON-NLS-1$
	}

	@Test
	public void testValidityManagerGetConstrainingNode() {
		ConstrainingNode constrainingNode = validityManager
			.getConstrainingNode(ecoreResource2.getContents().get(0));
		assertTrue(constrainingNode instanceof RootConstrainingNode);
		assertEquals("Eclass1 e1Att1", constrainingNode.getLabel()); //$NON-NLS-1$

		constrainingNode = validityManager
			.getConstrainingNode(((Eclass1) ecoreResource2.getContents().get(0))
				.getClasses2().get(0));
		assertEquals("EClass2", constrainingNode.getLabel()); //$NON-NLS-1$
	}

	@Test
	public void testValidityManagerSetInput() {
		validityManager.getModel().getResources().clear();
		assertEquals((Integer) 0, (Integer) validityManager.getModel()
			.getResources().size());
		EObject eObject = ecoreResource2.getContents().get(0);
		validityManager.setInput(eObject);
		assertEquals((Integer) 5, (Integer) validityManager.getModel()
			.getResources().size());
		validityManager.getModel().getResources().clear();
		assertEquals((Integer) 0, (Integer) validityManager.getModel()
			.getResources().size());
		validityManager.setInput(ecoreResource);
		assertEquals((Integer) 5, (Integer) validityManager.getModel()
			.getResources().size());
	}
}
