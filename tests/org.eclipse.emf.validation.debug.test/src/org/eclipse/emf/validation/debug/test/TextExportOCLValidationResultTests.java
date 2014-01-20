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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.xpath.XPathExpressionException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
import org.eclipse.emf.validation.debug.ui.view.IDEValidityManager;
import org.eclipse.emf.validation.debug.ui.view.ValidityViewRefreshJob;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.ResultSet;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.debug.validity.Severity;
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
 * Class testing the TextExport class.
 */
public class TextExportOCLValidationResultTests {

	private static final String TEST_PROJECT_NAME = "/org.eclipse.emf.validation.debug.test/"; //$NON-NLS-1$
	private static final String GENERATED_FILE_NAME = "testText.txt"; //$NON-NLS-1$
	private static final int WARNING_NUMBER_XPATH_LOCATION = 15;
	private static final int INFO_NUMBER_XPATH_LOCATION = 14;
	private static final int ERROR_NUMBER_XPATH_LOCATION = 16;
	private static final int FAILURE_NUMBER_XPATH_LOCATION = 17;
	private static final int SUCCESS_NUMBER_XPATH_LOCATION = 13;

	private static final String TEXT_EXPORT_CLASS_NAME = "org.eclipse.emf.validation.debug.ui.export.util.TextExport"; //$NON-NLS-1$

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

	private ValidityModel validityModel;

	private IDEValidityManager validityManager;

	private ResultSet resultSet;

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
		validityModel = validityManager.getModel();
		resultSet = validityModel.createResultSet(new NullProgressMonitor());

		exporter = null;
		for (ExportResultsDescriptor descriptor : ExportResultsRegistry
				.getRegisteredExtensions()) {
			if (TEXT_EXPORT_CLASS_NAME.equals(descriptor
					.getExtensionClassName())) {
				exporter = descriptor.getExportExtension();
			}
		}

		// create test project to save export models into.
		project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("org.eclipse.emf.validation.debug.test"); //$NON-NLS-1$
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
		validityModel = null;
		validityManager = null;
		exporter = null;

		project.delete(false, new NullProgressMonitor());
	}

	/**
	 * Tests that when a constraint that contains one element of each severity,
	 * there is a log of the constraint for each kind of severity.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws XPathExpressionException
	 * @throws CoreException
	 */
	@Test
	public void testOCLTextExportLoggingSeverityDispatch() throws IOException,
			InterruptedException, XPathExpressionException, CoreException {
		EList<Result> results = resultSet.getResults();
		for (Result result : results) {
			result.setSeverity(Severity.OK);
		}

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		// Infos
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		// Warning
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		// Error
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute2 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.ERROR);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0"); //$NON-NLS-1$

		// Fatal
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute4 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$

		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "1"); //$NON-NLS-1$
	}

	/**
	 * Tests that the correct diagnostics of the constraint validation results
	 * are written in the generated file in each severity log regarding a
	 * diagnostic exists or not.
	 * 
	 * @throws XPathExpressionException
	 * @throws CoreException
	 * @throws IOException
	 */
	@Test
	public void testOCLTextExportLogDiagnostics()
			throws XPathExpressionException, CoreException, IOException {
		EList<Result> results = resultSet.getResults();

		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));
		assertLineContains(26, "null diagnostic message"); //$NON-NLS-1$

		clearGeneratedReport();
		String diagnostic = "Diag INFO"; //$NON-NLS-1$
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setDiagnostic(diagnostic);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));
		assertLineContains(26, diagnostic);
	}

	@Test
	public void testOCLTextExportLogging() throws IOException, CoreException {
		EList<Result> results = resultSet.getResults();

		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass1_constraint", "Eclass1 e1Att1").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.ERROR);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint epackage_constraint", "ecoreTest").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.FATAL);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass2_constraint", "EClass2").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.INFO);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		// test item logging
		assertLineContains(22, "ecoreTest.ocl"); //$NON-NLS-1$
		assertLineContains(23, "Constraint eclass2_constraint"); //$NON-NLS-1$
		assertLineContains(24, "eclass2_constraint"); //$NON-NLS-1$
		assertLineContains(25, "INFO"); //$NON-NLS-1$

		assertLineContains(29, "ecore.ocl"); //$NON-NLS-1$
		assertLineContains(30, "Constraint eattribute_constraint"); //$NON-NLS-1$
		assertLineContains(31, "eattribute_constraint"); //$NON-NLS-1$
		assertLineContains(32, "WARNING"); //$NON-NLS-1$

		assertLineContains(36, "ecoreTest.ocl"); //$NON-NLS-1$
		assertLineContains(37, "Constraint eclass1_constraint"); //$NON-NLS-1$
		assertLineContains(38, "eclass1_constraint"); //$NON-NLS-1$
		assertLineContains(39, "ERROR"); //$NON-NLS-1$

		assertLineContains(43, "ecore.ocl"); //$NON-NLS-1$
		assertLineContains(44, "Constraint epackage_constraint"); //$NON-NLS-1$
		assertLineContains(45, "epackage_constraint"); //$NON-NLS-1$
		assertLineContains(46, "FATAL"); //$NON-NLS-1$
	}

	@Test
	public void testOCLTextExportStatistics() throws IOException, CoreException {
		EList<Result> results = resultSet.getResults();
		for (Result result : results) {
			result.setSeverity(Severity.OK);
		}

		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass1_constraint", "Eclass1 e1Att1").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.ERROR);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint epackage_constraint_2", "ecoreTest").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.ERROR);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint epackage_constraint", "ecoreTest").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.FATAL);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass_constraint", "EClass3 -> Eclass5") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass2_constraint", "EClass2").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		// tests validation results
		// Total number
		assertLineContains(12, "16"); //$NON-NLS-1$

		// Success
		assertLineContains(13, "8"); //$NON-NLS-1$

		// Infos
		assertLineContains(14, "2"); //$NON-NLS-1$

		// Warning
		assertLineContains(15, "2"); //$NON-NLS-1$

		// Errors
		assertLineContains(16, "2"); //$NON-NLS-1$

		// Failures
		assertLineContains(17, "2"); //$NON-NLS-1$
	}

	@Test
	public void testOCLTextExportWithNoElementValidated() throws IOException,
			CoreException {
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		// test output file name
		assertLineContains(2, GENERATED_FILE_NAME);

		// test resource validated
		assertLineContains(8, "ecoreTest.ecore"); //$NON-NLS-1$

		// tests validation results
		// Total number
		assertLineContains(12, "0"); //$NON-NLS-1$

		// Success
		assertLineContains(13, "0"); //$NON-NLS-1$

		// Infos
		assertLineContains(14, "0"); //$NON-NLS-1$

		// Warning
		assertLineContains(15, "0"); //$NON-NLS-1$

		// Errors
		assertLineContains(16, "0"); //$NON-NLS-1$

		// Failures
		assertLineContains(17, "0"); //$NON-NLS-1$

		// test logs results
		assertLineContains(21,
				"No log to display: models has been successfully validated."); //$NON-NLS-1$
	}

	private void assertLineContains(int lineNumber, String expression)
			throws CoreException, IOException {
		InputStream contents = project.getFile(GENERATED_FILE_NAME)
				.getContents();
		InputStream exportedFile = contents;

		Scanner sc = new Scanner(exportedFile);
		String line = null;
		int i = 1;
		while (i <= lineNumber) {
			line = sc.nextLine();
			i++;
		}
		if (line != null) {
			assertTrue(line.contains(expression));
		}
		sc.close();
		contents.close();
	}

	private void clearGeneratedReport() throws CoreException {
		project.getFile(GENERATED_FILE_NAME).delete(true,
				new NullProgressMonitor());

	}
}
