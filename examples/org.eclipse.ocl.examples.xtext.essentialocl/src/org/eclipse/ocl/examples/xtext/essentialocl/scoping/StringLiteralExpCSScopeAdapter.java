/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: StringLiteralExpCSScopeAdapter.java,v 1.1.2.2 2010/10/05 17:52:12 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;

public class StringLiteralExpCSScopeAdapter extends ExpCSScopeAdapter<StringLiteralExpCS, StringLiteralExp>
{
	private Type type = null;
	
	public StringLiteralExpCSScopeAdapter(StringLiteralExpCS csElement) {
		super(csElement, StringLiteralExp.class);
	}
	
	@Override
	public Type getSynthesizedType() {
		if (type == null) {
			type = getStringType();
		}
		return type;
	}
}