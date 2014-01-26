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
 *  Obeo - Fix the severity set
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.emf.validation.validity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.emf.validation.validity.LeafConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.ResultConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.ResultValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.Severity;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidityPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getResultSet <em>Result Set</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getResultValidatableNode <em>Result Validatable Node</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getDiagnostic <em>Diagnostic</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getValidatableNode <em>Validatable Node</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getLeafConstrainingNode <em>Leaf Constraining Node</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getResultConstrainingNode <em>Result Constraining Node</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.ResultImpl#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
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
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.UNKNOWN;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagnostic() <em>Diagnostic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostic()
	 * @generated
	 * @ordered
	 */
	protected static final Object DIAGNOSTIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnostic() <em>Diagnostic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostic()
	 * @generated
	 * @ordered
	 */
	protected Object diagnostic = DIAGNOSTIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected static final Exception EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected Exception exception = EXCEPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidityPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSet getResultSet() {
		if (eContainerFeatureID() != ValidityPackage.RESULT__RESULT_SET) return null;
		return (ResultSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultSet(ResultSet newResultSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResultSet, ValidityPackage.RESULT__RESULT_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultSet(ResultSet newResultSet) {
		if (newResultSet != eInternalContainer() || (eContainerFeatureID() != ValidityPackage.RESULT__RESULT_SET && newResultSet != null)) {
			if (EcoreUtil.isAncestor(this, newResultSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResultSet != null)
				msgs = ((InternalEObject)newResultSet).eInverseAdd(this, ValidityPackage.RESULT_SET__RESULTS, ResultSet.class, msgs);
			msgs = basicSetResultSet(newResultSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT__RESULT_SET, newResultSet, newResultSet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValidityPackage.RESULT__RESULT_VALIDATABLE_NODE, oldResultValidatableNode, resultValidatableNode));
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
	public void setResultValidatableNode(ResultValidatableNode newResultValidatableNode) {
		ResultValidatableNode oldResultValidatableNode = resultValidatableNode;
		resultValidatableNode = newResultValidatableNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT__RESULT_VALIDATABLE_NODE, oldResultValidatableNode, resultValidatableNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityGen(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT__SEVERITY, oldSeverity, severity));
	}
	public void setSeverity(Severity newSeverity) {
		if (newSeverity != severity || newSeverity == SEVERITY_EDEFAULT) {
			setSeverityGen(newSeverity);
			getResultValidatableNode().setWorstResult(this);
			getResultConstrainingNode().setWorstResult(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDiagnostic() {
		return diagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostic(Object newDiagnostic) {
		Object oldDiagnostic = diagnostic;
		diagnostic = newDiagnostic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT__DIAGNOSTIC, oldDiagnostic, diagnostic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValidatableNode getValidatableNode() {
		return getResultValidatableNode().getParent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("null")
	public @NonNull LeafConstrainingNode getLeafConstrainingNode() {
		return (LeafConstrainingNode) getResultConstrainingNode().getParent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("null")
	public @NonNull ResultConstrainingNode getResultConstrainingNode() {
		return getResultValidatableNode().getResultConstrainingNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(Exception newException) {
		Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidityPackage.RESULT__EXCEPTION, oldException, exception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidityPackage.RESULT__RESULT_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResultSet((ResultSet)otherEnd, msgs);
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
			case ValidityPackage.RESULT__RESULT_SET:
				return basicSetResultSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ValidityPackage.RESULT__RESULT_SET:
				return eInternalContainer().eInverseRemove(this, ValidityPackage.RESULT_SET__RESULTS, ResultSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidityPackage.RESULT__RESULT_SET:
				return getResultSet();
			case ValidityPackage.RESULT__RESULT_VALIDATABLE_NODE:
				if (resolve) return getResultValidatableNode();
				return basicGetResultValidatableNode();
			case ValidityPackage.RESULT__SEVERITY:
				return getSeverity();
			case ValidityPackage.RESULT__DIAGNOSTIC:
				return getDiagnostic();
			case ValidityPackage.RESULT__VALIDATABLE_NODE:
				return getValidatableNode();
			case ValidityPackage.RESULT__LEAF_CONSTRAINING_NODE:
				return getLeafConstrainingNode();
			case ValidityPackage.RESULT__RESULT_CONSTRAINING_NODE:
				return getResultConstrainingNode();
			case ValidityPackage.RESULT__EXCEPTION:
				return getException();
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
			case ValidityPackage.RESULT__RESULT_SET:
				setResultSet((ResultSet)newValue);
				return;
			case ValidityPackage.RESULT__RESULT_VALIDATABLE_NODE:
				setResultValidatableNode((ResultValidatableNode)newValue);
				return;
			case ValidityPackage.RESULT__SEVERITY:
				setSeverity((Severity)newValue);
				return;
			case ValidityPackage.RESULT__DIAGNOSTIC:
				setDiagnostic(newValue);
				return;
			case ValidityPackage.RESULT__EXCEPTION:
				setException((Exception)newValue);
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
			case ValidityPackage.RESULT__RESULT_SET:
				setResultSet((ResultSet)null);
				return;
			case ValidityPackage.RESULT__RESULT_VALIDATABLE_NODE:
				setResultValidatableNode((ResultValidatableNode)null);
				return;
			case ValidityPackage.RESULT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case ValidityPackage.RESULT__DIAGNOSTIC:
				setDiagnostic(DIAGNOSTIC_EDEFAULT);
				return;
			case ValidityPackage.RESULT__EXCEPTION:
				setException(EXCEPTION_EDEFAULT);
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
			case ValidityPackage.RESULT__RESULT_SET:
				return getResultSet() != null;
			case ValidityPackage.RESULT__RESULT_VALIDATABLE_NODE:
				return resultValidatableNode != null;
			case ValidityPackage.RESULT__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case ValidityPackage.RESULT__DIAGNOSTIC:
				return DIAGNOSTIC_EDEFAULT == null ? diagnostic != null : !DIAGNOSTIC_EDEFAULT.equals(diagnostic);
			case ValidityPackage.RESULT__VALIDATABLE_NODE:
				return getValidatableNode() != null;
			case ValidityPackage.RESULT__LEAF_CONSTRAINING_NODE:
				return getLeafConstrainingNode() != null;
			case ValidityPackage.RESULT__RESULT_CONSTRAINING_NODE:
				return getResultConstrainingNode() != null;
			case ValidityPackage.RESULT__EXCEPTION:
				return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append(getLeafConstrainingNode());
		result.append(": ");
		result.append(getValidatableNode());
		result.append(" => ");
		result.append(severity);
		result.append(" : ");
		result.append(diagnostic);
		result.append(" : ");
		result.append(exception);
		return result.toString();
	}

} //ResultImpl
