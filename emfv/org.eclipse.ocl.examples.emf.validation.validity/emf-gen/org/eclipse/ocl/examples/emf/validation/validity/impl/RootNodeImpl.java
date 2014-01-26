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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.emf.validation.validity.ResultSet;
import org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidityPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.RootNodeImpl#getResultSets <em>Result Sets</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.RootNodeImpl#getConstrainingNodes <em>Constraining Nodes</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.emf.validation.validity.impl.RootNodeImpl#getValidatableNodes <em>Validatable Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootNodeImpl extends MinimalEObjectImpl.Container implements RootNode {
	/**
	 * The cached value of the '{@link #getResultSets() <em>Result Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultSet> resultSets;

	/**
	 * The cached value of the '{@link #getConstrainingNodes() <em>Constraining Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<RootConstrainingNode> constrainingNodes;

	/**
	 * The cached value of the '{@link #getValidatableNodes() <em>Validatable Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<RootValidatableNode> validatableNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidityPackage.Literals.ROOT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("null")
	public @NonNull EList<ResultSet> getResultSets() {
		if (resultSets == null) {
			resultSets = new EObjectContainmentWithInverseEList<ResultSet>(ResultSet.class, this, ValidityPackage.ROOT_NODE__RESULT_SETS, ValidityPackage.RESULT_SET__ROOT);
		}
		return resultSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("null")
	public @NonNull EList<RootConstrainingNode> getConstrainingNodes() {
		if (constrainingNodes == null) {
			constrainingNodes = new EObjectContainmentWithInverseEList<RootConstrainingNode>(RootConstrainingNode.class, this, ValidityPackage.ROOT_NODE__CONSTRAINING_NODES, ValidityPackage.ROOT_CONSTRAINING_NODE__ROOT_NODE);
		}
		return constrainingNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("null")
	public @NonNull EList<RootValidatableNode> getValidatableNodes() {
		if (validatableNodes == null) {
			validatableNodes = new EObjectContainmentWithInverseEList<RootValidatableNode>(RootValidatableNode.class, this, ValidityPackage.ROOT_NODE__VALIDATABLE_NODES, ValidityPackage.ROOT_VALIDATABLE_NODE__ROOT_NODE);
		}
		return validatableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidityPackage.ROOT_NODE__RESULT_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultSets()).basicAdd(otherEnd, msgs);
			case ValidityPackage.ROOT_NODE__CONSTRAINING_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstrainingNodes()).basicAdd(otherEnd, msgs);
			case ValidityPackage.ROOT_NODE__VALIDATABLE_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidatableNodes()).basicAdd(otherEnd, msgs);
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
			case ValidityPackage.ROOT_NODE__RESULT_SETS:
				return ((InternalEList<?>)getResultSets()).basicRemove(otherEnd, msgs);
			case ValidityPackage.ROOT_NODE__CONSTRAINING_NODES:
				return ((InternalEList<?>)getConstrainingNodes()).basicRemove(otherEnd, msgs);
			case ValidityPackage.ROOT_NODE__VALIDATABLE_NODES:
				return ((InternalEList<?>)getValidatableNodes()).basicRemove(otherEnd, msgs);
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
			case ValidityPackage.ROOT_NODE__RESULT_SETS:
				return getResultSets();
			case ValidityPackage.ROOT_NODE__CONSTRAINING_NODES:
				return getConstrainingNodes();
			case ValidityPackage.ROOT_NODE__VALIDATABLE_NODES:
				return getValidatableNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValidityPackage.ROOT_NODE__RESULT_SETS:
				getResultSets().clear();
				getResultSets().addAll((Collection<? extends ResultSet>)newValue);
				return;
			case ValidityPackage.ROOT_NODE__CONSTRAINING_NODES:
				getConstrainingNodes().clear();
				getConstrainingNodes().addAll((Collection<? extends RootConstrainingNode>)newValue);
				return;
			case ValidityPackage.ROOT_NODE__VALIDATABLE_NODES:
				getValidatableNodes().clear();
				getValidatableNodes().addAll((Collection<? extends RootValidatableNode>)newValue);
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
			case ValidityPackage.ROOT_NODE__RESULT_SETS:
				getResultSets().clear();
				return;
			case ValidityPackage.ROOT_NODE__CONSTRAINING_NODES:
				getConstrainingNodes().clear();
				return;
			case ValidityPackage.ROOT_NODE__VALIDATABLE_NODES:
				getValidatableNodes().clear();
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
			case ValidityPackage.ROOT_NODE__RESULT_SETS:
				return resultSets != null && !resultSets.isEmpty();
			case ValidityPackage.ROOT_NODE__CONSTRAINING_NODES:
				return constrainingNodes != null && !constrainingNodes.isEmpty();
			case ValidityPackage.ROOT_NODE__VALIDATABLE_NODES:
				return validatableNodes != null && !validatableNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
