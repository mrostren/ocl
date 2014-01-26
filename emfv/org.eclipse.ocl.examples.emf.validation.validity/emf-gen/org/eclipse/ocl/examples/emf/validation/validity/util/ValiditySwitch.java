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
package org.eclipse.ocl.examples.emf.validation.validity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.ocl.examples.emf.validation.validity.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.emf.validation.validity.ValidityPackage
 * @generated
 */
public class ValiditySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValidityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValiditySwitch() {
		if (modelPackage == null) {
			modelPackage = ValidityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ValidityPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.CONSTRAINING_NODE: {
				ConstrainingNode constrainingNode = (ConstrainingNode)theEObject;
				T result = caseConstrainingNode(constrainingNode);
				if (result == null) result = caseAbstractNode(constrainingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.LEAF_CONSTRAINING_NODE: {
				LeafConstrainingNode leafConstrainingNode = (LeafConstrainingNode)theEObject;
				T result = caseLeafConstrainingNode(leafConstrainingNode);
				if (result == null) result = caseConstrainingNode(leafConstrainingNode);
				if (result == null) result = caseAbstractNode(leafConstrainingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case ValidityPackage.RESULT_CONSTRAINING_NODE: {
				ResultConstrainingNode resultConstrainingNode = (ResultConstrainingNode)theEObject;
				T result = caseResultConstrainingNode(resultConstrainingNode);
				if (result == null) result = caseConstrainingNode(resultConstrainingNode);
				if (result == null) result = caseAbstractNode(resultConstrainingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.RESULT_SET: {
				ResultSet resultSet = (ResultSet)theEObject;
				T result = caseResultSet(resultSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.RESULT_VALIDATABLE_NODE: {
				ResultValidatableNode resultValidatableNode = (ResultValidatableNode)theEObject;
				T result = caseResultValidatableNode(resultValidatableNode);
				if (result == null) result = caseValidatableNode(resultValidatableNode);
				if (result == null) result = caseAbstractNode(resultValidatableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.ROOT_NODE: {
				RootNode rootNode = (RootNode)theEObject;
				T result = caseRootNode(rootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.ROOT_CONSTRAINING_NODE: {
				RootConstrainingNode rootConstrainingNode = (RootConstrainingNode)theEObject;
				T result = caseRootConstrainingNode(rootConstrainingNode);
				if (result == null) result = caseConstrainingNode(rootConstrainingNode);
				if (result == null) result = caseAbstractNode(rootConstrainingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.ROOT_VALIDATABLE_NODE: {
				RootValidatableNode rootValidatableNode = (RootValidatableNode)theEObject;
				T result = caseRootValidatableNode(rootValidatableNode);
				if (result == null) result = caseValidatableNode(rootValidatableNode);
				if (result == null) result = caseAbstractNode(rootValidatableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidityPackage.VALIDATABLE_NODE: {
				ValidatableNode validatableNode = (ValidatableNode)theEObject;
				T result = caseValidatableNode(validatableNode);
				if (result == null) result = caseAbstractNode(validatableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraining Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraining Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainingNode(ConstrainingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Constraining Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Constraining Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafConstrainingNode(LeafConstrainingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Constraining Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Constraining Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultConstrainingNode(ResultConstrainingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultSet(ResultSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Validatable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Validatable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultValidatableNode(ResultValidatableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootNode(RootNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Constraining Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Constraining Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootConstrainingNode(RootConstrainingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Validatable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Validatable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootValidatableNode(RootValidatableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validatable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validatable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidatableNode(ValidatableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ValidationSwitch
