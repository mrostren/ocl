/**
 * <copyright>
 *
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.emf.validation.validity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.emf.validation.validity.ResultConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.ResultValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result ValidatableNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultValidatableNodeImpl#getResultConstrainingNode <em>Result Constraining Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultValidatableNodeImpl extends ValidatableNodeImpl implements ResultValidatableNode {
	/**
	 * The cached value of the '{@link #getResultConstrainingNode() <em>Result Constraining Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultConstrainingNode()
	 * @generated
	 * @ordered
	 */
	protected ResultConstrainingNode resultConstrainingNode;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultValidatableNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidityPackage.Literals.RESULT_VALIDATABLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConstrainingNode getResultConstrainingNode() {
		if (resultConstrainingNode != null && resultConstrainingNode.eIsProxy()) {
			InternalEObject oldResultConstrainingNode = (InternalEObject)resultConstrainingNode;
			resultConstrainingNode = (ResultConstrainingNode)eResolveProxy(oldResultConstrainingNode);
			if (resultConstrainingNode != oldResultConstrainingNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE, oldResultConstrainingNode, resultConstrainingNode));
			}
		}
		return resultConstrainingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConstrainingNode basicGetResultConstrainingNode() {
		return resultConstrainingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultConstrainingNode(ResultConstrainingNode newResultConstrainingNode, NotificationChain msgs) {
		ResultConstrainingNode oldResultConstrainingNode = resultConstrainingNode;
		resultConstrainingNode = newResultConstrainingNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE, oldResultConstrainingNode, newResultConstrainingNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultConstrainingNode(ResultConstrainingNode newResultConstrainingNode) {
		if (newResultConstrainingNode != resultConstrainingNode) {
			NotificationChain msgs = null;
			if (resultConstrainingNode != null)
				msgs = ((InternalEObject)resultConstrainingNode).eInverseRemove(this, ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE, ResultConstrainingNode.class, msgs);
			if (newResultConstrainingNode != null)
				msgs = ((InternalEObject)newResultConstrainingNode).eInverseAdd(this, ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE, ResultConstrainingNode.class, msgs);
			msgs = basicSetResultConstrainingNode(newResultConstrainingNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE, newResultConstrainingNode, newResultConstrainingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE:
				if (resultConstrainingNode != null)
					msgs = ((InternalEObject)resultConstrainingNode).eInverseRemove(this, ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE, ResultConstrainingNode.class, msgs);
				return basicSetResultConstrainingNode((ResultConstrainingNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE:
				return basicSetResultConstrainingNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE:
				if (resolve) return getResultConstrainingNode();
				return basicGetResultConstrainingNode();
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
			case ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE:
				setResultConstrainingNode((ResultConstrainingNode)newValue);
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
			case ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE:
				setResultConstrainingNode((ResultConstrainingNode)null);
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
			case ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE:
				return resultConstrainingNode != null;
		}
		return super.eIsSet(featureID);
	}
} //ResultValidatableNodeImpl
