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
 * $Id: StringLessThanEqualOperation.java,v 1.1.2.4 2011/01/08 15:34:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;


/**
 * StringLessThanEqualOperation realises the String::<=() library operation.
 * 
 * @since 3.1
 */
public class StringLessThanEqualOperation extends AbstractStringBinaryOperation
{
	public static final StringLessThanEqualOperation INSTANCE = new StringLessThanEqualOperation();

	@Override
	protected BooleanValue evaluateString(ValueFactory valueFactory, String left, String right) {
		return valueFactory.booleanValueOf(left.compareTo(right) <= 0);
	}
}