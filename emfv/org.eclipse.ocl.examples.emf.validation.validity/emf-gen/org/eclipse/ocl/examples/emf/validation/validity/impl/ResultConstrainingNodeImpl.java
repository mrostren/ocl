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
 * An implementation of the model object '<em><b>Result ConstrainingNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultConstrainingNodeImpl#getResultValidatableNode <em>Result Validatable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultConstrainingNodeImpl extends ConstrainingNodeImpl implements ResultConstrainingNode {
	/**
	 * The cached value of the '{@link #getResultValidatableNode() <em>Result Validatable Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValidatableNode()
	 * @generated
	 * @ordered
	 */
	protected ResultValidatableNode resultValidatableNode;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultConstrainingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidityPackage.Literals.RESULT_CONSTRAINING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultValidatableNode getResultValidatableNode() {
		if (resultValidatableNode != null && resultValidatableNode.eIsProxy()) {
			InternalEObject oldResultValidatableNode = (InternalEObject)resultValidatableNode;
			resultValidatableNode = (ResultValidatableNode)eResolveProxy(oldResultValidatableNode);
			if (resultValidatableNode != oldResultValidatableNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE, oldResultValidatableNode, resultValidatableNode));
			}
		}
		return resultValidatableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultValidatableNode basicGetResultValidatableNode() {
		return resultValidatableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultValidatableNode(ResultValidatableNode newResultValidatableNode, NotificationChain msgs) {
		ResultValidatableNode oldResultValidatableNode = resultValidatableNode;
		resultValidatableNode = newResultValidatableNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE, oldResultValidatableNode, newResultValidatableNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValidatableNode(ResultValidatableNode newResultValidatableNode) {
		if (newResultValidatableNode != resultValidatableNode) {
			NotificationChain msgs = null;
			if (resultValidatableNode != null)
				msgs = ((InternalEObject)resultValidatableNode).eInverseRemove(this, ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE, ResultValidatableNode.class, msgs);
			if (newResultValidatableNode != null)
				msgs = ((InternalEObject)newResultValidatableNode).eInverseAdd(this, ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE, ResultValidatableNode.class, msgs);
			msgs = basicSetResultValidatableNode(newResultValidatableNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE, newResultValidatableNode, newResultValidatableNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE:
				if (resultValidatableNode != null)
					msgs = ((InternalEObject)resultValidatableNode).eInverseRemove(this, ValidityPackage.RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE, ResultValidatableNode.class, msgs);
				return basicSetResultValidatableNode((ResultValidatableNode)otherEnd, msgs);
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
			case ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE:
				return basicSetResultValidatableNode(null, msgs);
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
			case ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE:
				if (resolve) return getResultValidatableNode();
				return basicGetResultValidatableNode();
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
			case ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE:
				setResultValidatableNode((ResultValidatableNode)newValue);
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
			case ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE:
				setResultValidatableNode((ResultValidatableNode)null);
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
			case ValidityPackage.RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE:
				return resultValidatableNode != null;
		}
		return super.eIsSet(featureID);
	}
} //ResultConstrainingNodeImpl
