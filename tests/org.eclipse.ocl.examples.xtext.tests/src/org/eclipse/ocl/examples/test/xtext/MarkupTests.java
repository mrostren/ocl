/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: LoadTests.java,v 1.25 2011/05/22 21:06:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.test.xtext;

import java.util.List;

import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.xtext.markup.Markup;
import org.eclipse.ocl.examples.xtext.markup.MarkupElement;
import org.eclipse.ocl.examples.xtext.markup.MarkupPackage;
import org.eclipse.ocl.examples.xtext.markup.MarkupToHTML;
import org.eclipse.ocl.examples.xtext.markup.MarkupUtils;
import org.eclipse.ocl.examples.xtext.markup.NewLineElement;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;

public class MarkupTests extends XtextTestCase
{	
	protected TypeManager typeManager = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		MarkupPackage.eINSTANCE.eClass();
	}

	protected void doHtmlTest(String expected, String testString) {
		Markup markup = MarkupUtils.decode(testString);
		String testResult = MarkupToHTML.toString(markup);
		assertEquals(toPrintable(testString), expected, testResult);
	}

	protected void doNewlineCountTest(int expectedCount, String testString) {
		Markup markup = MarkupUtils.decode(testString);		
		List<MarkupElement> elements = markup.getElements();
		assert elements.size() == 1;
		NewLineElement newLineElement = (NewLineElement) elements.get(0);
		int actualCount = MarkupUtils.getNewlineCount(newLineElement);
		if (expectedCount != actualCount) {
			assertEquals(toPrintable(testString), expectedCount, actualCount);
		}
	}

	protected String toPrintable(String testString) {
		return testString.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
	}

	public void testFonts() {
		doHtmlTest("a <b>c</b> d", "a b[c] d");
		doHtmlTest("<b><i> g </i></b>", "b[e[ g ]]");
	}

	public void testNewlines() {
		doNewlineCountTest(1, "\r");
		doNewlineCountTest(1, "\n");
		doNewlineCountTest(1, "\n\r");
		doNewlineCountTest(1, "\r\n");
		doNewlineCountTest(2, "\n\t\r");
		doNewlineCountTest(2, "\r\t\n");
		doNewlineCountTest(2, "\n\r\n");
		doNewlineCountTest(2, "\r\n\r");
		doNewlineCountTest(2, "\n\r\n");
		doNewlineCountTest(2, "\r\n\r");
		doNewlineCountTest(2, "\n\r\n\r");
		doNewlineCountTest(2, "\r\n\r\n");
		doNewlineCountTest(2, "\n\r\n\r");
		doNewlineCountTest(2, "\r\n\r\n");
		doNewlineCountTest(2, "\n\r \n\r");
		doNewlineCountTest(2, "\r\n \r\n");
		doNewlineCountTest(2, "\n\r \n\r");
		doNewlineCountTest(2, "\r\n \r\n");
		doNewlineCountTest(3, "\n\r\n \r");
		doNewlineCountTest(3, "\r\n\r \n");
		doNewlineCountTest(3, "\n\r\n \r");
		doNewlineCountTest(3, "\r\n\r \n");
	}
}
