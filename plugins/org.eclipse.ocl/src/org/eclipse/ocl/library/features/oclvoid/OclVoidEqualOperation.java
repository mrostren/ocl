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
 * $Id: OclVoidEqualOperation.java,v 1.1.2.1 2010/01/31 22:23:48 ewillink Exp $
 */
package org.eclipse.ocl.library.features.oclvoid;

import org.eclipse.ocl.library.features.AbstractBinaryOperation;

/**
 * OclVoidEqualOperation realises the OclVoid::=() library operation.
 * 
 * @since 3.0
 */
public class OclVoidEqualOperation extends AbstractBinaryOperation
{
	public Boolean evaluate(Object left, Object right) {
		if (isNull(right)) {
			return true;
		}
		return false;
	}
}