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
 * MarkupToTree gives a printable one line string presentation of the markup for
 * debugging purposes. New lines are replaced by printables.
 */
public class MarkupToString extends MarkupSwitch<StringBuffer>
{
	public static String toString(MarkupElement element) {
		MarkupToString toString = new MarkupToString();
		return toString.doSwitch(element).toString();
	}
	
	protected final StringBuffer s = new StringBuffer();
	
	@Override
	public StringBuffer caseCompoundElement(CompoundElement object) {
		for (MarkupElement element : object.getElements()) {
			doSwitch(element);
		}
		return s;
	}

	@Override
	public StringBuffer caseFontElement(FontElement object) {
		s.append(object.getFont());
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseNewLineElement(NewLineElement object) {
		s.append(object.getText());
		return s;
	}

	@Override
	public StringBuffer caseTextElement(TextElement object) {
		s.append(object.getText());
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

