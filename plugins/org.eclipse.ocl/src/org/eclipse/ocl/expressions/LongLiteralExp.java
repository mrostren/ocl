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
package org.eclipse.ocl.expressions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.expressions.LongLiteralExp#getLongSymbol <em>Long Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getLongLiteralExp()
 * @model
 * @generated
 */
public interface LongLiteralExp<C>
		extends IntegerLiteralExp<C> {

	/**
	 * Returns the value of the '<em><b>Long Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Symbol</em>' attribute.
	 * @see #setLongSymbol(Long)
	 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getLongLiteralExp_LongSymbol()
	 * @model
	 * @generated
	 */
	Long getLongSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.expressions.LongLiteralExp#getLongSymbol <em>Long Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Symbol</em>' attribute.
	 * @see #getLongSymbol()
	 * @generated
	 */
	void setLongSymbol(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Long getSymbol();

} // LongLiteralExp
