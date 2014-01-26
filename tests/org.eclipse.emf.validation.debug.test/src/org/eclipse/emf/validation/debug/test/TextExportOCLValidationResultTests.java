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

import java.io.IOException;

import javax.xml.xpath.XPathExpressionException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.Severity;
import org.eclipse.ocl.examples.emf.validation.validity.export.ExportResultsDescriptor;
import org.eclipse.ocl.examples.emf.validation.validity.export.ExportResultsRegistry;
import org.eclipse.ocl.examples.emf.validation.validity.export.IValidatorExport;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityManager;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class testing the TextExport class.
 */
public class TextExportOCLValidationResultTests extends AbstractExportOCLValidationResultTests {
	private static final int WARNING_NUMBER_XPATH_LOCATION = 15;
	private static final int INFO_NUMBER_XPATH_LOCATION = 14;
	private static final int ERROR_NUMBER_XPATH_LOCATION = 16;
	private static final int FAILURE_NUMBER_XPATH_LOCATION = 17;
	private static final int SUCCESS_NUMBER_XPATH_LOCATION = 13;

	private static final String TEXT_EXPORT_CLASS_NAME = "org.eclipse.emf.validation.debug.ui.export.util.TextExport"; //$NON-NLS-1$
	private static final String EXPORTED_FILE_NAME = "testText.txt"; //$NON-NLS-1$

	private ValidityModel validityModel = null;
	private EList<Result> results = null;
	private IFile exportedFile = null;
	private IValidatorExport exporter = null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		validityModel = getValidityManager().getModel();
		ResultSet resultSet = validityModel
				.createResultSet(new NullProgressMonitor());
		results = resultSet.getResults();

		exportedFile = getProject().getFile(EXPORTED_FILE_NAME);
		exporter = getExporter();
		assertNotNull(exporter);
	}

	private ValidityManager getValidityManager() {
		return super.validityManager;
	}

	private IProject getProject() {
		return super.project;
	}

	private IValidatorExport getExporter() {
		for (ExportResultsDescriptor descriptor : ExportResultsRegistry
				.getRegisteredExtensions()) {
			if (TEXT_EXPORT_CLASS_NAME.equals(descriptor
					.getExtensionClassName())) {
				return descriptor.getExportExtension();
			}
		}
		return null;
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * 
	 * Tests that the exported file contains the expected log for metrics
	 * section.
	 * 
	 * @throws IOException
	 * @throws XPathExpressionException
	 * @throws CoreException
	 */
	@Test
	public void testTEXTExport_LoggingMetricsWithNoSeverity()
			throws IOException, XPathExpressionException, CoreException {
		// initiate the test case
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test the exporteFile content
		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
	}

	/**
	 * Tests that the exported file contains the expected log for metrics
	 * section.
	 * 
	 * @throws IOException
	 * @throws XPathExpressionException
	 * @throws CoreException
	 */
	@Test
	public void testTEXTExport_LoggingMetricsWithInformationSeverity()
			throws IOException, XPathExpressionException, CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
	}

	/**
	 * Tests that the exported file contains the expected log for metrics
	 * section.
	 * 
	 * @throws IOException
	 * @throws XPathExpressionException
	 * @throws CoreException
	 */
	@Test
	public void testTEXTExport_LoggingMetricsWithWarningSeverity()
			throws IOException, InterruptedException, XPathExpressionException,
			CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
	}

	/**
	 * Tests that the exported file contains the expected log for metrics
	 * section.
	 * 
	 * @throws IOException
	 * @throws XPathExpressionException
	 * @throws CoreException
	 */
	@Test
	public void testTEXTExport_LoggingMetricsWithErrorSeverity()
			throws IOException, InterruptedException, XPathExpressionException,
			CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute2 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.ERROR);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "0", exportedFile); //$NON-NLS-1$
	}

	/**
	 * Tests that the exported file contains the expected log for metrics
	 * section.
	 * 
	 * @throws IOException
	 * @throws XPathExpressionException
	 * @throws CoreException
	 */
	@Test
	public void testTEXTExport_LoggingMetricsWithFailureSeverity()
			throws IOException, InterruptedException, XPathExpressionException,
			CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute2 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.ERROR);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute4 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertLineContains(SUCCESS_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(INFO_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(WARNING_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(ERROR_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
		assertLineContains(FAILURE_NUMBER_XPATH_LOCATION, "1", exportedFile); //$NON-NLS-1$
	}

	/**
	 * Tests that the exportedFile contains the expected diagnostics for a
	 * constraint.
	 * 
	 * @throws XPathExpressionException
	 * @throws CoreException
	 * @throws IOException
	 */
	public void testTEXTExport_LogNullDiagnosticMessage()
			throws XPathExpressionException, CoreException, IOException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertLineContains(26, "null diagnostic message", exportedFile); //$NON-NLS-1$
	}

	/**
	 * Tests that the exportedFile contains the expected diagnostics for a
	 * constraint.
	 * 
	 * @throws XPathExpressionException
	 * @throws CoreException
	 * @throws IOException
	 */
	@Test
	public void testTEXTExport_LogInfoDiagnosticMessage() throws IOException,
			InterruptedException, XPathExpressionException, CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		String diagnostic = "Diag INFO"; //$NON-NLS-1$
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setDiagnostic(diagnostic);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertLineContains(26, diagnostic, exportedFile);
	}

	@Test
	public void testTEXTExport_ProducesAllLogHeadings() throws IOException,
			CoreException {
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

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test tables headings
		assertLineContains(22, "ecoreTest.ocl", exportedFile); //$NON-NLS-1$
		assertLineContains(23, "Constraint eclass2_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(24, "eclass2_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(25, "INFO", exportedFile); //$NON-NLS-1$

		assertLineContains(29, "ecore.ocl", exportedFile); //$NON-NLS-1$
		assertLineContains(30, "Constraint eattribute_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(31, "eattribute_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(32, "WARNING", exportedFile); //$NON-NLS-1$

		assertLineContains(36, "ecoreTest.ocl", exportedFile); //$NON-NLS-1$
		assertLineContains(37, "Constraint eclass1_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(38, "eclass1_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(39, "ERROR", exportedFile); //$NON-NLS-1$

		assertLineContains(43, "ecore.ocl", exportedFile); //$NON-NLS-1$
		assertLineContains(44, "Constraint epackage_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(45, "epackage_constraint", exportedFile); //$NON-NLS-1$
		assertLineContains(46, "FATAL", exportedFile); //$NON-NLS-1$
	}

	@Test
	public void testTEXTExport_Statistics() throws IOException, CoreException {
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

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// tests validation results
		// Total number
		assertLineContains(12, "16", exportedFile); //$NON-NLS-1$

		// Success
		assertLineContains(13, "8", exportedFile); //$NON-NLS-1$

		// Infos
		assertLineContains(14, "2", exportedFile); //$NON-NLS-1$

		// Warning
		assertLineContains(15, "2", exportedFile); //$NON-NLS-1$

		// Errors
		assertLineContains(16, "2", exportedFile); //$NON-NLS-1$

		// Failures
		assertLineContains(17, "2", exportedFile); //$NON-NLS-1$
	}

	@Test
	public void testTEXTExport_ModelsValidatedSuccessfully()
			throws IOException, CoreException {
		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test output file name
		assertLineContains(2, exportedFile.getName(), exportedFile);

		// test resource validated
		assertLineContains(8, "ecoreTest.ecore", exportedFile); //$NON-NLS-1$

		// tests validation results
		// Total number
		assertLineContains(12, "0", exportedFile); //$NON-NLS-1$

		// Success
		assertLineContains(13, "0", exportedFile); //$NON-NLS-1$

		// Infos
		assertLineContains(14, "0", exportedFile); //$NON-NLS-1$

		// Warning
		assertLineContains(15, "0", exportedFile); //$NON-NLS-1$

		// Errors
		assertLineContains(16, "0", exportedFile); //$NON-NLS-1$

		// Failures
		assertLineContains(17, "0", exportedFile); //$NON-NLS-1$

		// test logs results
		assertLineContains(
				21,
				"No log to display: models has been successfully validated.", exportedFile); //$NON-NLS-1$
	}

}
