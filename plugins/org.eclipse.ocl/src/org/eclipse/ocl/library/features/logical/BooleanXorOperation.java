/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: BooleanXorOperation.java,v 1.1.2.1 2010/01/31 22:23:45 ewillink Exp $
 */
package org.eclipse.ocl.library.features.logical;

import org.eclipse.ocl.library.features.AbstractBinaryOperation;

/**
 * BooleanXorOperation realises the Boolean::xor() library operation.
 * 
 * @since 3.0
 */
public class BooleanXorOperation extends AbstractBinaryOperation
{
	public Object evaluate(Object left, Object right) {
		if (left == Boolean.TRUE) {
			if (right == Boolean.TRUE) {
				return Boolean.FALSE;
			}
			else if (right == Boolean.FALSE) {
				return Boolean.TRUE;
			}
		}
		else if (left == Boolean.FALSE) {
			if (right == Boolean.TRUE) {
				return Boolean.TRUE;
			}
			else if (right == Boolean.FALSE) {
				return Boolean.FALSE;
			}
		}
		return null;
	}
}