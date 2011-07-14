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
package org.eclipse.ocl.ecore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.LongLiteralExp;
import org.eclipse.ocl.ecore.utilities.VisitorExtension;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getLongSymbol <em>Long Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @since 3.2
 */
public class LongLiteralExpImpl
		extends IntegerLiteralExpImpl
		implements LongLiteralExp {

	/**
	 * The default value of the '{@link #getLongSymbol() <em>Long Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final Long LONG_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongSymbol() <em>Long Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongSymbol()
	 * @generated
	 * @ordered
	 */
	protected Long longSymbol = LONG_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.2
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.LONG_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLongSymbol() {
		return longSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongSymbol(Long newLongSymbol) {
		Long oldLongSymbol = longSymbol;
		longSymbol = newLongSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL, oldLongSymbol,
				longSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Long getSymbol() {
		Long result;
		Integer integerSymbol = getIntegerSymbol();
		if (integerSymbol != null) {
			result = integerSymbol.longValue();
		} else {
			result = getLongSymbol();
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL :
				return getLongSymbol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL :
				setLongSymbol((Long) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL :
				setLongSymbol(LONG_SYMBOL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL :
				return LONG_SYMBOL_EDEFAULT == null
					? longSymbol != null
					: !LONG_SYMBOL_EDEFAULT.equals(longSymbol);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.LongLiteralExp.class) {
			switch (derivedFeatureID) {
				case EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL :
					return ExpressionsPackage.LONG_LITERAL_EXP__LONG_SYMBOL;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.LongLiteralExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.LONG_LITERAL_EXP__LONG_SYMBOL :
					return EcorePackage.LONG_LITERAL_EXP__LONG_SYMBOL;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (longSymbol: "); //$NON-NLS-1$
		result.append(longSymbol);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		if (v instanceof VisitorExtension<?>) {
			return ((VisitorExtension<T>) v).visitLongLiteralExp(this);
		} else {
			return null;
		}
	}

} //LongLiteralExpImpl
