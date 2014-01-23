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

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
import org.eclipse.emf.validation.debug.ui.view.IDEValidityManager;
import org.eclipse.emf.validation.debug.ui.view.ValidityViewRefreshJob;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.export.ExportResultsDescriptor;
import org.eclipse.emf.validation.export.ExportResultsRegistry;
import org.eclipse.emf.validation.export.IValidatorExport;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator.ValidationAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.ui.commands.LoadCompleteOCLResourceHandler.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class testing the AbstractExport class.
 */
public class AbstractExportOCLValidationResultTests extends TestCase {

	private static final String TEST_PROJECT_NAME = "org.eclipse.emf.validation.debug.test"; //$NON-NLS-1$
	private static final String TEST_PROJECT_PATH = "/"+TEST_PROJECT_NAME+"/"; //$NON-NLS-1$ //$NON-NLS-2$

	private static final String GENERATED_FILE_NAME = "testHtml.html"; //$NON-NLS-1$

	private static final String HTML_EXPORT_CLASS_NAME = "org.eclipse.emf.validation.debug.ui.export.util.HTMLExport"; //$NON-NLS-1$

	public static final @NonNull
	String PLUGIN_ID = "org.eclipse.emf.validation.debug.test"; //$NON-NLS-1$

	private static final String OCL_CONSTRAINTS_MODEL = "model/ecore.ocl"; //$NON-NLS-1$

	private static final String OCL_CONSTRAINTS_MODEL2 = "model/ecoreTest.ocl"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME = "model/ecoreTest.ecore"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME2 = "model/validityModelTest.ecoretest"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME3 = "model/ecoreTest2.ecore"; //$NON-NLS-1$

	private RootNode rootNode;

	private Resource ecoreResource;

	private ValidationAdapter validationAdapter;

	private IDEValidityManager validityManager;

	private IValidatorExport exporter;

	private IProject project;

	ResourceSet resourceSet;

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
		resourceSet2.getResource(ecoreURI2, true);
		resourceSet2.getResource(ecoreURI3, true);

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
		validityManager = new IDEValidityManager(new ValidityViewRefreshJob());
		validityManager.setInput(resourceSet2);
		rootNode = validityManager.getRootNode();

		exporter = null;
		for (ExportResultsDescriptor descriptor : ExportResultsRegistry
				.getRegisteredExtensions()) {
			if (HTML_EXPORT_CLASS_NAME.equals(descriptor
					.getExtensionClassName())) {
				exporter = descriptor.getExportExtension();
			}

		}

		// create test project to save export models into.
		project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(TEST_PROJECT_NAME); //$NON-NLS-1$
		project.create(new NullProgressMonitor());
		project.open(new NullProgressMonitor());
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
		validityManager = null;
		exporter = null;

		project.delete(true, new NullProgressMonitor());
	}

	@Test
	public void testGetFileFullPath() throws CoreException {
		IFile file = project.getFile(GENERATED_FILE_NAME);
		assertFalse(file.exists());
		exporter.export(TestTool.getIResource(ecoreResource), rootNode, file.getFullPath());
		assertTrue(file.exists());

		clearGeneratedReport();
		
		assertFalse(file.exists());
		exporter.export(TestTool.getIResource(ecoreResource), rootNode, new Path(TEST_PROJECT_PATH + GENERATED_FILE_NAME));
		assertTrue(file.exists());
	}

	private void clearGeneratedReport() throws CoreException {
		project.getFile(GENERATED_FILE_NAME).delete(true,
				new NullProgressMonitor());
	}
}
