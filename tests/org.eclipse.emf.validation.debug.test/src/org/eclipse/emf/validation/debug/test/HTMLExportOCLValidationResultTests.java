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

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
import org.eclipse.emf.validation.export.ExportResultsDescriptor;
import org.eclipse.emf.validation.export.ExportResultsRegistry;
import org.eclipse.emf.validation.export.IValidatorExport;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.Severity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class testing the HTMLExport class.
 */
public class HTMLExportOCLValidationResultTests extends AbstractExportOCLValidationResultTests {
	private static final String WARNING_NUMBER_XPATH_LOCATION = "//table[2]/tr[4]/td[2]"; //$NON-NLS-1$
	private static final String INFO_NUMBER_XPATH_LOCATION = "//table[2]/tr[3]/td[2]"; //$NON-NLS-1$
	private static final String ERROR_NUMBER_XPATH_LOCATION = "//table[2]/tr[5]/td[2]"; //$NON-NLS-1$
	private static final String FAILURE_NUMBER_XPATH_LOCATION = "//table[2]/tr[6]/td[2]"; //$NON-NLS-1$
	private static final String SUCCESS_NUMBER_XPATH_LOCATION = "//table[2]/tr[2]/td[2]"; //$NON-NLS-1$

	private static final String HTML_EXPORT_CLASS_NAME = "org.eclipse.emf.validation.debug.ui.export.util.HTMLExport"; //$NON-NLS-1$
	private static final String EXPORTED_FILE_NAME = "testHtml.html"; //$NON-NLS-1$

	private ValidityModel validityModel = null;
	private EList<Result> results = null;
	private XPath xPathEngine = null;
	private IFile exportedFile = null;
	private IValidatorExport exporter = null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		validityModel = getValidityManager().getModel();
		ResultSet resultSet = validityModel
				.createResultSet(new NullProgressMonitor());
		results = resultSet.getResults();

		XPathFactory factory = XPathFactory.newInstance();
		xPathEngine = factory.newXPath();

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

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	private IValidatorExport getExporter() {
		for (ExportResultsDescriptor descriptor : ExportResultsRegistry
				.getRegisteredExtensions()) {
			if (HTML_EXPORT_CLASS_NAME.equals(descriptor
					.getExtensionClassName())) {
				return descriptor.getExportExtension();
			}
		}
		return null;
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
	public void testHTMLExport_LoggingMetricsWithNoSeverity()
			throws XPathExpressionException, CoreException, IOException {
		// initiate the test case
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test the exporteFile content
		assertXPathTrue(
				SUCCESS_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				INFO_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				WARNING_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				ERROR_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				FAILURE_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
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
	public void testHTMLExport_LoggingMetricsWithInformationSeverity()
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

		assertXPathTrue(
				SUCCESS_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				INFO_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				WARNING_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				ERROR_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				FAILURE_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
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
	public void testHTMLExport_LoggingMetricsWithWarningSeverity()
			throws IOException, XPathExpressionException, CoreException {
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

		assertXPathTrue(
				SUCCESS_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				INFO_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				WARNING_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				ERROR_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				FAILURE_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
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
	public void testHTMLExport_LoggingMetricsWithErrorSeverity()
			throws IOException, XPathExpressionException, CoreException {
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

		assertXPathTrue(
				SUCCESS_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				INFO_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				WARNING_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				ERROR_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				FAILURE_NUMBER_XPATH_LOCATION + "=0", exportedFile, xPathEngine); //$NON-NLS-1$
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
	public void testHTMLExport_LoggingMetricsWithFailureSeverity()
			throws IOException, XPathExpressionException, CoreException {
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

		assertXPathTrue(
				SUCCESS_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				INFO_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				WARNING_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				ERROR_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
		assertXPathTrue(
				FAILURE_NUMBER_XPATH_LOCATION + "=1", exportedFile, xPathEngine); //$NON-NLS-1$
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
	public void testHTMLExport_LogNullDiagnosticMessage()
			throws XPathExpressionException, CoreException, IOException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		assertXPathTrue(
				"//table[3]/tr[2]/td[5]='null diagnostic message'", exportedFile, xPathEngine); //$NON-NLS-1$
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
	public void testHTMLExport_LogInfoDiagnosticMessage()
			throws XPathExpressionException, CoreException, IOException {
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

		assertXPathTrue(
				"//table[3]/tr[2]/td[5]='" + diagnostic + "'", exportedFile, xPathEngine); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void testHTMLExport_ProducesOneLogHeading() throws IOException,
			XPathExpressionException, CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass_constraint", "EClass3 -> Eclass5") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test heading
		assertXPathTrue(
				"//body/h2[2]='4.1. Failures'", exportedFile, xPathEngine);//$NON-NLS-1$
	}

	@Test
	public void testHTMLExport_ProducesAllLogHeadings() throws IOException,
			XPathExpressionException, CoreException {
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass_constraint", "EClass3 -> Eclass5") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);
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

		// test headings
		assertXPathTrue("//body/h2[2]='4.1. Infos'", exportedFile, xPathEngine);
		assertXPathTrue("//body/h2[3]='4.2. Warnings'", exportedFile,
				xPathEngine);
		assertXPathTrue("//body/h2[4]='4.3. Errors'", exportedFile, xPathEngine);
		assertXPathTrue("//body/h2[5]='4.4. Failures'", exportedFile,
				xPathEngine);
	}

	@Test
	public void testHTMLExport_LogContent() throws IOException,
			XPathExpressionException, CoreException {
		// Initialize test case
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

		// test the expected exportedFile content
		// information
		String expression = "count(//table[3]/tr[" //$NON-NLS-1$
				+ "td[1]=' Resource: ecoreTest.ocl' " //$NON-NLS-1$
				+ " and td[2]='Constraint eclass2_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eclass2_constraint')" //$NON-NLS-1$
				+ " and td[4]='INFO'" //$NON-NLS-1$
				+ "])=1"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		expression = "count(//table[3]/tr[td[1]=' Resource: ecore.ocl' " //$NON-NLS-1$
				+ " and td[2]='Constraint eattribute_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eattribute_constraint')" //$NON-NLS-1$
				+ " and td[4]='INFO'])"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		assertXPathTrue("count(//table[3]/tr)=3", exportedFile, xPathEngine);

		// information
		expression = "//table[3]/tr[3]/td[1]=' Resource: ecore.ocl' " //$NON-NLS-1$
				+ " and //table[3]/tr[3]/td[2]='Constraint eattribute_constraint'" //$NON-NLS-1$
				+ " and contains(//table[3]/tr[3]/td[3],'eattribute_constraint')" //$NON-NLS-1$
				+ " and //table[3]/tr[3]/td[4]='INFO'"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		assertXPathTrue("count(//table[3]/tr)=3", exportedFile, xPathEngine);

		// error
		expression = "count(//table[5]/tr[td[1]=' Resource: ecoreTest.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint eclass1_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eclass1_constraint')" //$NON-NLS-1$
				+ " and td[4]='ERROR'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		expression = "count(//table[5]/tr[td[1]=' Resource: ecore.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint epackage_constraint_2'" //$NON-NLS-1$
				+ " and contains(td[3],'epackage_constraint_2')" //$NON-NLS-1$
				+ " and td[4]='ERROR'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		assertXPathTrue("count(//table[5]/tr)=3", exportedFile, xPathEngine);

		// fatal
		expression = "count(//table[6]/tr[td[1]=' Resource: ecore.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint epackage_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'epackage_constraint')" //$NON-NLS-1$
				+ " and td[4]='FATAL'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		expression = "count(//table[6]/tr[td[1]=' Resource: ecore.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint eclass_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eclass_constraint')" //$NON-NLS-1$
				+ " and td[4]='FATAL'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression, exportedFile, xPathEngine);

		assertXPathTrue("count(//table[6]/tr)=3", exportedFile, xPathEngine);
	}

	@Test
	public void testHTMLExport_Statistics() throws IOException,
			XPathExpressionException, CoreException {
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
				"Constraint eclass2_constraint", "EClass2").setSeverity( //$NON-NLS-1$ //$NON-NLS-2$
				Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);

		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test output file name
		assertXPathTrue("//table[1]/tr/td[2]='testHtml.html'", exportedFile,
				xPathEngine);

		// test resource validated
		assertXPathTrue("//ul[1]/li='ecoreTest.ecore'", exportedFile,
				xPathEngine);

		// test author
		assertXPathTrue("//table[1]/tr[2]/td[2]!=''", exportedFile, xPathEngine);

		// tests validation results
		// Total number
		assertXPathTrue("//body/table[2]/tr/td[2]=16", exportedFile,
				xPathEngine);

		// Success
		assertXPathTrue(SUCCESS_NUMBER_XPATH_LOCATION + "=8", exportedFile,
				xPathEngine);

		// Infos
		assertXPathTrue(INFO_NUMBER_XPATH_LOCATION + "=2", exportedFile,
				xPathEngine);

		// Warning
		assertXPathTrue(WARNING_NUMBER_XPATH_LOCATION + "=2", exportedFile,
				xPathEngine);

		// Errors
		assertXPathTrue(ERROR_NUMBER_XPATH_LOCATION + "=2", exportedFile,
				xPathEngine);

		// Failures
		assertXPathTrue(FAILURE_NUMBER_XPATH_LOCATION + "=2", exportedFile,
				xPathEngine);
	}

	@Test
	public void testHTMLExport_ModelsValidatedSuccessfully()
			throws IOException, XPathExpressionException, CoreException {
		// launch the exporter
		assertFalse(exportedFile.exists());
		exporter.export(ecoreResource, rootNode, exportedFile.getFullPath());

		// test output file name
		assertXPathTrue("//table[1]/tr/td[2]='testHtml.html'", exportedFile,
				xPathEngine);

		// test resource validated
		assertXPathTrue("//ul[1]/li='ecoreTest.ecore'", exportedFile,
				xPathEngine);

		// test author
		assertXPathTrue("//table[1]/tr[2]/td[2]!=''", exportedFile, xPathEngine);

		// tests validation results
		assertXPathTrue("//body/table[2]/tr/td[2]=0", exportedFile, xPathEngine);
		assertXPathTrue("//table[2]/tr[2]/td[2]=0", exportedFile, xPathEngine);
		assertXPathTrue("//table[2]/tr[3]/td[2]=0", exportedFile, xPathEngine);
		assertXPathTrue("//table[2]/tr[4]/td[2]=0", exportedFile, xPathEngine);
		assertXPathTrue("//table[2]/tr[5]/td[2]=0", exportedFile, xPathEngine);
		assertXPathTrue("//table[2]/tr[6]/td[2]=0", exportedFile, xPathEngine);

		// test logs results
		assertXPathTrue(
				"//p[1]='No log to display: models has been successfully validated.'",
				exportedFile, xPathEngine);
	}
}
