package org.eclipse.emf.validation.debug.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.debug.test.utils.TestTool;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.export.ExportResultsDescriptor;
import org.eclipse.ocl.examples.emf.validation.validity.export.ExportResultsRegistry;
import org.eclipse.ocl.examples.emf.validation.validity.export.IValidatorExport;
import org.eclipse.ocl.examples.emf.validation.validity.ui.view.IDEValidityManager;
import org.eclipse.ocl.examples.emf.validation.validity.ui.view.ValidityViewRefreshJob;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator.ValidationAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.ui.commands.LoadCompleteOCLResourceHandler.Helper;
import org.junit.Test;
import org.xml.sax.InputSource;

public class AbstractExportOCLValidationResultTests extends TestCase {
	public static final @NonNull
	String PLUGIN_ID = "org.eclipse.emf.validation.debug.test"; //$NON-NLS-1$
	protected static final String ECORE_TEST_MODEL_PATH = "model/ecoreTest.ecore"; //$NON-NLS-1$
	protected static final String ECORE_TEST2_MODEL_PATH = "model/ecoreTest2.ecore"; //$NON-NLS-1$
	protected static final String ECORE_MODEL_PATH = "model/validityModelTest.ecoretest"; //$NON-NLS-1$
	protected static final String FIRST_OCL_CONSTRAINTS_DOCUMENT = "model/ecore.ocl"; //$NON-NLS-1$
	protected static final String SECOND_OCL_CONSTRAINTS_DOCUMENT = "model/ecoreTest.ocl"; //$NON-NLS-1$

	protected RootNode rootNode = null;
	protected Resource ecoreResource = null;
	protected ValidationAdapter validationAdapter = null;
	protected IDEValidityManager validityManager = null;
	protected IProject project = null;
	protected ResourceSet resourceSet = null;

	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();
		// initialize all the needed resource factories to create ecore and ocl
		// resources in the global registry.
		TestTool.doCompleteOCLSetup();

		// Plug the OCL validation mechanism.
		OCLDelegateDomain.initialize(resourceSet);

		URI ecoreTestURI = TestTool.getTestModelURI(ECORE_TEST_MODEL_PATH);
		URI ecoreTest2URI = TestTool.getTestModelURI(ECORE_TEST2_MODEL_PATH);
		URI ecoreModelURI = TestTool.getTestModelURI(ECORE_MODEL_PATH);
		URI firstOclDocumentURI = TestTool
				.getTestModelURI(FIRST_OCL_CONSTRAINTS_DOCUMENT);
		URI secondOclDocumentURI = TestTool
				.getTestModelURI(SECOND_OCL_CONSTRAINTS_DOCUMENT);

		// load model resources
		resourceSet = DomainUtil.nonNullState(resourceSet);
		ecoreResource = resourceSet.getResource(ecoreTestURI, true);
		resourceSet.getResource(ecoreModelURI, true);
		resourceSet.getResource(ecoreTest2URI, true);

		Helper helper = new Helper(resourceSet) {

			@Override
			protected boolean error(@NonNull String primaryMessage,
					@Nullable String detailMessage) {
				return false;
			}
		};

		// load ocl documents
		helper.loadResource(firstOclDocumentURI);
		helper.loadResource(secondOclDocumentURI);

		assertTrue(helper.loadMetaModels());
		helper.installPackages();

		validationAdapter = ValidationAdapter.findAdapter(resourceSet);
		assertNotNull(validationAdapter);
		validityManager = new IDEValidityManager(new ValidityViewRefreshJob());
		validityManager.setInput(resourceSet);
		rootNode = validityManager.getRootNode();

		// create test project to save the exported file.
		project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(PLUGIN_ID); //$NON-NLS-1$
		project.create(new NullProgressMonitor());
		project.open(new NullProgressMonitor());
	}

	protected void tearDown() throws Exception {
		project.delete(true, new NullProgressMonitor());
	}
	
	/**
	 * Tests the
	 * {@link org.eclipse.ocl.examples.emf.validation.validity.ui.export.util.AbstractExport#export(Resource, RootNode, org.eclipse.core.runtime.IPath)}
	 * method this test ensures that the export method invocation produces an
	 * exported file at the expected place.
	 * 
	 * @throws CoreException
	 */
	@Test
	public void testGetFileFullPath() throws CoreException {
		String htmlExportClassName = "org.eclipse.ocl.examples.emf.validation.validity.ui.export.util.HTMLExport"; //$NON-NLS-1$
		String exportedFileName = "testHtml.html"; //$NON-NLS-1$
		
		IValidatorExport exporter = null;
		// initiate the exporter
		for (ExportResultsDescriptor descriptor : ExportResultsRegistry
				.getRegisteredExtensions()) {
			if (htmlExportClassName.equals(descriptor
					.getExtensionClassName())) {
				exporter = descriptor.getExportExtension();
				break;
			}
		}
		assertNotNull(exporter);

		IFile file = project.getFile(exportedFileName);
		assertFalse(file.exists());

		// launch the results export
		exporter.export(ecoreResource, rootNode, file.getFullPath());
		assertTrue(file.exists());
	}

	protected void assertXPathTrue(String expression, IFile exportedFile,
			XPath xPathEngine) throws XPathExpressionException, CoreException,
			IOException {
		InputStream contents = exportedFile.getContents();

		InputSource stream = new InputSource(contents);
		xPathEngine.compile(expression);
		assertTrue((Boolean) xPathEngine.evaluate(expression, stream,
				XPathConstants.BOOLEAN));
		contents.close();
	}

	protected void assertLineContains(int lineNumber, String expression,
			IFile exportedFile) throws CoreException, IOException {
		InputStream contents = exportedFile.getContents();
		InputStream stream = contents;

		Scanner sc = new Scanner(stream);
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
}
