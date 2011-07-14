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
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.expressions.operations;

import org.eclipse.ocl.expressions.LongLiteralExp;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Long Literal Exp</b></em>' model objects.
 * @since 3.2
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.expressions.LongLiteralExp#getSymbol() <em>Get Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LongLiteralExpOperations
		extends IntegerLiteralExpOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongLiteralExpOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * The "legacy" integerSymbol is preferably fetched. If a non-null value is present there, it will
	 * be returned as a long. Otherwise, the value of {@link LongLiteralExp#getLongSymbol()} will be
	 * returned.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static <C> Long getSymbol(LongLiteralExp<C> longLiteralExp) {
		Long result;
		Integer integerSymbol = longLiteralExp.getIntegerSymbol();
		if (integerSymbol != null) {
			result = integerSymbol.longValue();
		} else {
			result = longLiteralExp.getLongSymbol();
		}
		return result;
	}

} // LongLiteralExpOperations