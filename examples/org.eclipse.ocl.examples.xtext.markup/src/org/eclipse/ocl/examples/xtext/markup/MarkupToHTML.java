/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.xtext.markup;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.markup.util.MarkupSwitch;

/**
 * MarkupToHTML gives an HTML presentation of the markup.
 */
public class MarkupToHTML extends MarkupSwitch<StringBuffer>
{
	public static String toString(MarkupElement element) {
		MarkupToHTML toString = new MarkupToHTML();
		return toString.doSwitch(element).toString();
	}
	
	protected final StringBuffer s = new StringBuffer();

	protected void appendTag(String tag) {
		s.append("<");
		s.append(tag);
		s.append(">");
	}
	
	protected void appendUntag(String tag) {
		s.append("</");
		s.append(tag);
		s.append(">");
	}
	
	@Override
	public StringBuffer caseCompoundElement(CompoundElement object) {
		for (MarkupElement element : object.getElements()) {
			doSwitch(element);
		}
		return s;
	}

	@Override
	public StringBuffer caseFontElement(FontElement object) {
		String font = object.getFont();
		String htmlFont;
		if ("b[".equals(font)) {
			htmlFont = "b";
		}
		else if ("e[".equals(font)) {
			htmlFont = "i";
		}
		else {
			htmlFont = "???";
		}
		appendTag(htmlFont);
		caseCompoundElement(object);
		appendUntag(htmlFont);
		return s;
	}

	@Override
	public StringBuffer caseNewLineElement(NewLineElement object) {
		s.append(object.getText());
		return s;
	}

	@Override
	public StringBuffer caseTextElement(TextElement object) {
		for (String text : object.getText()) {
			char c = text.charAt(0);
			if ((c == ' ') || (c == '\t')) {
				s.append(" ");
			}
			else {
				s.append(text);
			}
		}
		return s;
	}

	@Override
	public StringBuffer defaultCase(EObject object) {
		s.append("<Unsupported ");
		s.append(object.eClass().getName());
		s.append(">");
		return s;
	}
}

