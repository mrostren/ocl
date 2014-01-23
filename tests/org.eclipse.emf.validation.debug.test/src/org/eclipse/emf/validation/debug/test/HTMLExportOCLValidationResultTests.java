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
import java.io.InputStream;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import junit.framework.TestCase;

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
import org.xml.sax.InputSource;

/**
 * Class testing the HTMLExport class.
 */
public class HTMLExportOCLValidationResultTests extends TestCase {

	private static final String TEST_PROJECT_NAME = "/org.eclipse.emf.validation.debug.test/"; //$NON-NLS-1$
	private static final String WARNING_NUMBER_XPATH_LOCATION = "//table[2]/tr[4]/td[2]"; //$NON-NLS-1$
	private static final String INFO_NUMBER_XPATH_LOCATION = "//table[2]/tr[3]/td[2]"; //$NON-NLS-1$
	private static final String ERROR_NUMBER_XPATH_LOCATION = "//table[2]/tr[5]/td[2]"; //$NON-NLS-1$
	private static final String FAILURE_NUMBER_XPATH_LOCATION = "//table[2]/tr[6]/td[2]"; //$NON-NLS-1$
	private static final String SUCCESS_NUMBER_XPATH_LOCATION = "//table[2]/tr[2]/td[2]"; //$NON-NLS-1$

	private static final String HTML_EXPORT_CLASS_NAME = "org.eclipse.emf.validation.debug.ui.export.util.HTMLExport"; //$NON-NLS-1$

	public static final @NonNull
	String PLUGIN_ID = "org.eclipse.emf.validation.debug.test"; //$NON-NLS-1$

	private static final String OCL_CONSTRAINTS_MODEL = "model/ecore.ocl"; //$NON-NLS-1$

	private static final String OCL_CONSTRAINTS_MODEL2 = "model/ecoreTest.ocl"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME = "model/ecoreTest.ecore"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME2 = "model/validityModelTest.ecoretest"; //$NON-NLS-1$

	private static final String ECORE_MODEL_NAME3 = "model/ecoreTest2.ecore"; //$NON-NLS-1$
	private static final String GENERATED_FILE_NAME = "testHtml.html"; //$NON-NLS-1$

	private RootNode rootNode;

	private Resource ecoreResource;

	private ValidationAdapter validationAdapter;

	private ValidityModel validityModel;

	private IDEValidityManager validityManager;

	private ResultSet resultSet;

	private IValidatorExport exporter;

	private XPath xPathEngine;

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
			if (HTML_EXPORT_CLASS_NAME.equals(descriptor
					.getExtensionClassName())) {
				exporter = descriptor.getExportExtension();
			}
		}

		// create test project to save export models into.
		project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("org.eclipse.emf.validation.debug.test"); //$NON-NLS-1$
		project.create(new NullProgressMonitor());
		project.open(new NullProgressMonitor());

		XPathFactory factory = XPathFactory.newInstance();
		xPathEngine = factory.newXPath();
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

		project.delete(true, new NullProgressMonitor());
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
	public void testOCLHTMLExportLoggingSeverityDispatch() throws IOException,
			InterruptedException, XPathExpressionException, CoreException {
		EList<Result> results = resultSet.getResults();

		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute5 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.OK);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		String expression = SUCCESS_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = INFO_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		expression = WARNING_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		expression = ERROR_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		expression = FAILURE_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		// Infos

		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		expression = SUCCESS_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = INFO_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = WARNING_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		expression = ERROR_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		expression = FAILURE_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		// Warning
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute1 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.WARNING);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		expression = SUCCESS_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = INFO_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = WARNING_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = ERROR_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		expression = FAILURE_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		// Error
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute2 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.ERROR);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		expression = SUCCESS_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = INFO_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = WARNING_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = ERROR_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = FAILURE_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=0"); //$NON-NLS-1$

		// Fatal
		clearGeneratedReport();
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute4 : EString") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		expression = SUCCESS_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = INFO_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = WARNING_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = ERROR_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$

		expression = FAILURE_NUMBER_XPATH_LOCATION;
		assertXPathTrue(expression + "=1"); //$NON-NLS-1$
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
	public void testOCLHTMLExportLogDiagnostics()
			throws XPathExpressionException, CoreException, IOException {
		EList<Result> results = resultSet.getResults();

		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.INFO);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));
		assertXPathTrue("//table[3]/tr[2]/td[5]='null diagnostic message'"); //$NON-NLS-1$

		clearGeneratedReport();
		String diagnostic = "Diag INFO"; //$NON-NLS-1$
		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eattribute_constraint", "eAttribute3 : EShort") //$NON-NLS-1$ //$NON-NLS-2$
				.setDiagnostic(diagnostic);
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));
		assertXPathTrue("//table[3]/tr[2]/td[5]='" + diagnostic + "'"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void testOCLHTMLExportLoggingNumeration() throws IOException,
			XPathExpressionException, CoreException {
		EList<Result> results = resultSet.getResults();

		TestTool.getResultOfValidatableNodeFromLabel(results,
				"Constraint eclass_constraint", "EClass3 -> Eclass5") //$NON-NLS-1$ //$NON-NLS-2$
				.setSeverity(Severity.FATAL);

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		String expression = "//body/h2[2]='4.1. Failures'"; //$NON-NLS-1$

		assertXPathTrue(expression);

		clearGeneratedReport();
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

		// tests headings
		expression = "//body/h2[2]='4.1. Infos'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//body/h2[3]='4.2. Warnings'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//body/h2[4]='4.3. Errors'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//body/h2[5]='4.4. Failures'"; //$NON-NLS-1$
		assertXPathTrue(expression);
	}

	@Test
	public void testOCLHTMLExportLogging() throws IOException,
			XPathExpressionException, CoreException {
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

		// test item logging
		// info
		String expression = "count(//table[3]/tr[" //$NON-NLS-1$
				+ "td[1]=' Resource: ecoreTest.ocl' " //$NON-NLS-1$
				+ " and td[2]='Constraint eclass2_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eclass2_constraint')" //$NON-NLS-1$
				+ " and td[4]='INFO'" //$NON-NLS-1$
				+ "])=1"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[3]/tr[td[1]=' Resource: ecore.ocl' " //$NON-NLS-1$
				+ " and td[2]='Constraint eattribute_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eattribute_constraint')" //$NON-NLS-1$
				+ " and td[4]='INFO'])"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[3]/tr)=3"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// info
		expression = "//table[3]/tr[3]/td[1]=' Resource: ecore.ocl' " //$NON-NLS-1$
				+ " and //table[3]/tr[3]/td[2]='Constraint eattribute_constraint'" //$NON-NLS-1$
				+ " and contains(//table[3]/tr[3]/td[3],'eattribute_constraint')" //$NON-NLS-1$
				+ " and //table[3]/tr[3]/td[4]='INFO'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[3]/tr)=3"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// error
		expression = "count(//table[5]/tr[td[1]=' Resource: ecoreTest.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint eclass1_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eclass1_constraint')" //$NON-NLS-1$
				+ " and td[4]='ERROR'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[5]/tr[td[1]=' Resource: ecore.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint epackage_constraint_2'" //$NON-NLS-1$
				+ " and contains(td[3],'epackage_constraint_2')" //$NON-NLS-1$
				+ " and td[4]='ERROR'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[5]/tr)=3"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// fatal
		expression = "count(//table[6]/tr[td[1]=' Resource: ecore.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint epackage_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'epackage_constraint')" //$NON-NLS-1$
				+ " and td[4]='FATAL'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[6]/tr[td[1]=' Resource: ecore.ocl'" //$NON-NLS-1$
				+ " and td[2]='Constraint eclass_constraint'" //$NON-NLS-1$
				+ " and contains(td[3],'eclass_constraint')" //$NON-NLS-1$
				+ " and td[4]='FATAL'])=1"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "count(//table[6]/tr)=3"; //$NON-NLS-1$
		assertXPathTrue(expression);
	}

	@Test
	public void testOCLHTMLExportStatistics() throws IOException,
			XPathExpressionException, CoreException {

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

		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		// test output file name
		String expression = "//table[1]/tr/td[2]='testHtml.html'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// test resource validated
		expression = "//ul[1]/li='ecoreTest.ecore'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// test author
		expression = "//table[1]/tr[2]/td[2]!=''"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// tests validation results
		// Total number
		expression = "//body/table[2]/tr/td[2]=16"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// Success
		expression = SUCCESS_NUMBER_XPATH_LOCATION + "=8"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// Infos
		expression = INFO_NUMBER_XPATH_LOCATION + "=2"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// Warning
		expression = WARNING_NUMBER_XPATH_LOCATION + "=2"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// Errors
		expression = ERROR_NUMBER_XPATH_LOCATION + "=2"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// Failures
		expression = FAILURE_NUMBER_XPATH_LOCATION + "=2"; //$NON-NLS-1$
		assertXPathTrue(expression);
	}

	@Test
	public void testOCLHTMLExportWithNoElementValidated() throws IOException,
			XPathExpressionException, CoreException {
		exporter.export(TestTool.getIResource(ecoreResource), rootNode,
				new Path(TEST_PROJECT_NAME + GENERATED_FILE_NAME));

		// test output file name
		String expression = "//table[1]/tr/td[2]='testHtml.html'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// test resource validated
		expression = "//ul[1]/li='ecoreTest.ecore'"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// test author
		expression = "//table[1]/tr[2]/td[2]!=''"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// tests validation results
		expression = "//body/table[2]/tr/td[2]=0"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//table[2]/tr[2]/td[2]=0"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//table[2]/tr[3]/td[2]=0"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//table[2]/tr[4]/td[2]=0"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//table[2]/tr[5]/td[2]=0"; //$NON-NLS-1$
		assertXPathTrue(expression);

		expression = "//table[2]/tr[6]/td[2]=0"; //$NON-NLS-1$
		assertXPathTrue(expression);

		// test logs results
		expression = "//p[1]='No log to display: models has been successfully validated.'"; //$NON-NLS-1$
		assertXPathTrue(expression);
	}

	private void assertXPathTrue(String expression)
			throws XPathExpressionException, CoreException, IOException {
		InputStream contents = project.getFile(GENERATED_FILE_NAME)
				.getContents();

		InputSource exportedFile = new InputSource(contents);
		xPathEngine.compile(expression);
		assertTrue((Boolean) xPathEngine.evaluate(expression, exportedFile,
				XPathConstants.BOOLEAN));
		contents.close();
		exportedFile = null;
	}

	private void clearGeneratedReport() throws CoreException {
		project.getFile(GENERATED_FILE_NAME).delete(true,
				new NullProgressMonitor());

	}
}
