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
 *   E.D.Willink (CEA LIST) - 425799 Validity View Integration
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.validity.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.emf.validation.validity.ConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityManager;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityModel;
import org.eclipse.ocl.examples.emf.validation.validity.ui.view.IDEValidityManager;
import org.eclipse.ocl.examples.emf.validation.validity.ui.view.ValidityViewRefreshJob;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator.ValidationAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.examples.xtext.completeocl.ui.commands.LoadCompleteOCLResourceHandler.Helper;
import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCLCSResource;

/**
 * Abstract shared functionality for testing.
 */
public abstract class AbstractValidityTestCase extends TestCase
{
	public static final String PLUGIN_ID = "org.eclipse.ocl.examples.validity.test"; //$NON-NLS-1$

	protected static final @NonNull String OCL_CONSTRAINTS_MODEL = "model/ecore.ocl";
	protected static final @NonNull String OCL_CONSTRAINTS_MODEL2 = "model/ecoreTest.ocl";
	protected static final @NonNull String ECORE_MODEL_NAME = "model/ecoreTest.ecore";
	protected static final @NonNull String ECORE_MODEL_NAME2 = "model/validityModelTest.ecoretest";
	protected static final @NonNull String ECORE_MODEL_NAME3 = "model/ecoreTest2.ecore";
	
	private static ProjectMap projectMap = null;

	public static ConstrainingNode getConstrainingNodeByLabel(
			EList<ConstrainingNode> rootNodeChildren, String label) {
		ConstrainingNode result = null;
		Iterator<ConstrainingNode> iterator = rootNodeChildren.iterator();
		while (iterator.hasNext() && result == null) {
			ConstrainingNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static ConstrainingNode getConstrainingNodeFromRootByLabel(
			EList<RootConstrainingNode> rootNodeChildren, String label) {
		ConstrainingNode result = null;
		Iterator<RootConstrainingNode> iterator = rootNodeChildren.iterator();
		while (iterator.hasNext() && result == null) {
			ConstrainingNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static ProjectMap getProjectMap() {
		if (projectMap == null) {
			projectMap = new ProjectMap();
		}
		return projectMap;
	}

	public static Result getResultFromResultValidatableNode(
			List<Result> validatableNodeResults, String label) {
		Result result = null;
		Iterator<Result> iterator = validatableNodeResults.iterator();
		while (iterator.hasNext() && result == null) {
			Result resultIterated = iterator.next();
			if (label.equals(resultIterated.getResultValidatableNode()
				.getLabel())) {
				result = resultIterated;
			}
		}
		return result;
	}
	
	public static Result getResultOfValidatableNodeFromLabel(EList<Result> results, 
			String labelValidatableNode, String labelResultConstrainingNode) {
		Result result = null;
		Iterator<Result> iterator = results.iterator();
		while (iterator.hasNext() && result == null) {
			Result resultIter = iterator.next();
			if (labelValidatableNode.equals(resultIter.getResultValidatableNode().getLabel())
					&& labelResultConstrainingNode.equals(resultIter.getResultConstrainingNode().getLabel())) {
				result = resultIter;
			}
		}
		return result;
	}

	public static URI getTestModelURI(String localFileName) {
		ProjectMap projectMap = getProjectMap();
		String urlString = projectMap.getLocation(PLUGIN_ID).toString();
		return DomainUtil.nonNullEMF(URI.createURI(urlString + localFileName));
	}
	
	public static ValidatableNode getValidatableNodeByLabel(
			EList<ValidatableNode> validatableNodes, String label) {
		ValidatableNode result = null;
		Iterator<ValidatableNode> iterator = validatableNodes.iterator();
		while (iterator.hasNext() && result == null) {
			ValidatableNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static ValidatableNode getValidatableNodeFromRootByLabel(
			EList<RootValidatableNode> validatableNodes, String label) {
		ValidatableNode result = null;
		Iterator<RootValidatableNode> iterator = validatableNodes.iterator();
		while (iterator.hasNext() && result == null) {
			RootValidatableNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static boolean isCompleteOCLCSResourcePresent(@NonNull Set<Resource> resources) {
		for (Resource resource : resources) {
			if (resource instanceof CompleteOCLCSResource) {
				return true;
			}
		}
		return false;
	}

	protected ResourceSet resourceSet;
	protected Resource ecoreResource;
	protected Resource ecoreResource2;
	protected Resource ecoreResource3;
	protected Resource oclResource;
	protected Resource oclResource2;
	protected ValidationAdapter validationAdapter;
	protected ValidityModel validityModel;
	protected ValidityManager validityManager;
	protected RootNode rootNode;
	protected ResultSet resultSet;

	public void initTestModels() throws Exception {
		resourceSet = new ResourceSetImpl();
		// initialize all the needed resource factories to create ecore and ocl
		// resources in the global registry.
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			CompleteOCLStandaloneSetup.doSetup();
		}
		// Plug the OCL validation mechanism.
		OCLDelegateDomain.initialize(resourceSet);

		URI ecoreURI = getTestModelURI(ECORE_MODEL_NAME);
		URI ecoreURI2 = getTestModelURI(ECORE_MODEL_NAME2);
		URI ecoreURI3 = getTestModelURI(ECORE_MODEL_NAME3);
		URI oclURI = getTestModelURI(OCL_CONSTRAINTS_MODEL);
		URI oclURI2 = getTestModelURI(OCL_CONSTRAINTS_MODEL2);

		ResourceSet resourceSet2 = DomainUtil.nonNullState(resourceSet);
		ecoreResource = resourceSet2.getResource(ecoreURI, true);
		ecoreResource2 = resourceSet2.getResource(ecoreURI2, true);
		ecoreResource3 = resourceSet2.getResource(ecoreURI3, true);

		Helper helper = new Helper(resourceSet2)
		{
			@Override
			protected boolean error(@NonNull String primaryMessage, @Nullable String detailMessage) {
				return false;
			}
		};

		oclResource = helper.loadResource(oclURI);
		oclResource2 = helper.loadResource(oclURI2);
		assertTrue(helper.loadMetaModels());
		helper.installPackages();

		validationAdapter = ValidationAdapter.findAdapter(resourceSet2);
		assertNotNull(validationAdapter);
	}

	protected void initValidityManager(@Nullable ValidityManager validityManager) {
		if (validityManager == null) {
			validityManager = new IDEValidityManager(new ValidityViewRefreshJob());
		}
		this.validityManager = validityManager;
		validityManager.setInput(resourceSet);
		rootNode = validityManager.getRootNode();
		validityModel = validityManager.getModel();
		resultSet = validityModel.createResultSet(new NullProgressMonitor());
	}

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
		if (validityManager != null) {
			validityManager.dispose();
			validityManager = null;
		}
	}
}
