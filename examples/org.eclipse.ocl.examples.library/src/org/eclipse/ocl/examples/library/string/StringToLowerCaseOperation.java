/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: StringToLowerCaseOperation.java,v 1.1.2.4 2011/01/08 15:34:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.pivot.values.StringValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * StringToLowerCaseOperation realises the String::toLowerCase() library operation.
 * 
 * @since 3.1
 */
public class StringToLowerCaseOperation extends AbstractStringUnaryOperation
{
	public static final StringToLowerCaseOperation INSTANCE = new StringToLowerCaseOperation();

	@Override
	public StringValue evaluateString(ValueFactory valueFactory, String sourceVal) {
		return valueFactory.stringValueOf(sourceVal.toLowerCase());
	}
}