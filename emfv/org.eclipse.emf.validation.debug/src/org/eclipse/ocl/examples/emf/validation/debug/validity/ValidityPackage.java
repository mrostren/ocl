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
package org.eclipse.ocl.examples.emf.validation.debug.validity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ValidityFactory
 * @model kind="package"
 * @generated
 */
public interface ValidityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/validation/2013/Validity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "validity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidityPackage eINSTANCE = org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.AbstractNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__WORST_RESULT = 2;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ALL_CHILDREN_ENABLED = 3;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ALL_CHILDREN_DISABLED = 4;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_PARENT = 0;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE___GET_CHILDREN = 1;

	/**
	 * The number of operations of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ConstrainingNodeImpl <em>Constraining Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ConstrainingNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getConstrainingNode()
	 * @generated
	 */
	int CONSTRAINING_NODE = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__ENABLED = ABSTRACT_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__LABEL = ABSTRACT_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__WORST_RESULT = ABSTRACT_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__ALL_CHILDREN_ENABLED = ABSTRACT_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__ALL_CHILDREN_DISABLED = ABSTRACT_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__PARENT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__CHILDREN = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraining Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE__CONSTRAINING_OBJECT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE___GET_PARENT = ABSTRACT_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE___GET_CHILDREN = ABSTRACT_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.LeafConstrainingNodeImpl <em>Leaf Constraining Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.LeafConstrainingNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getLeafConstrainingNode()
	 * @generated
	 */
	int LEAF_CONSTRAINING_NODE = 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__ENABLED = CONSTRAINING_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__LABEL = CONSTRAINING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__WORST_RESULT = CONSTRAINING_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__ALL_CHILDREN_ENABLED = CONSTRAINING_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__ALL_CHILDREN_DISABLED = CONSTRAINING_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__PARENT = CONSTRAINING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__CHILDREN = CONSTRAINING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Constraining Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__CONSTRAINING_OBJECT = CONSTRAINING_NODE__CONSTRAINING_OBJECT;

	/**
	 * The feature id for the '<em><b>Constraint Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__CONSTRAINT_LOCATOR = CONSTRAINING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE__CONSTRAINT_DEFINITION = CONSTRAINING_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leaf Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE_FEATURE_COUNT = CONSTRAINING_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE___GET_PARENT = CONSTRAINING_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE___GET_CHILDREN = CONSTRAINING_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Leaf Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_CONSTRAINING_NODE_OPERATION_COUNT = CONSTRAINING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 3;

	/**
	 * The feature id for the '<em><b>Result Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__RESULT_SET = 0;

	/**
	 * The feature id for the '<em><b>Result Validatable Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__RESULT_VALIDATABLE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Diagnostic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DIAGNOSTIC = 3;

	/**
	 * The feature id for the '<em><b>Validatable Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALIDATABLE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Leaf Constraining Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__LEAF_CONSTRAINING_NODE = 5;

	/**
	 * The feature id for the '<em><b>Result Constraining Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__RESULT_CONSTRAINING_NODE = 6;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__EXCEPTION = 7;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultConstrainingNodeImpl <em>Result Constraining Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultConstrainingNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResultConstrainingNode()
	 * @generated
	 */
	int RESULT_CONSTRAINING_NODE = 4;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__ENABLED = CONSTRAINING_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__LABEL = CONSTRAINING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__WORST_RESULT = CONSTRAINING_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__ALL_CHILDREN_ENABLED = CONSTRAINING_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__ALL_CHILDREN_DISABLED = CONSTRAINING_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__PARENT = CONSTRAINING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__CHILDREN = CONSTRAINING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Constraining Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__CONSTRAINING_OBJECT = CONSTRAINING_NODE__CONSTRAINING_OBJECT;

	/**
	 * The feature id for the '<em><b>Result Validatable Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE = CONSTRAINING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE_FEATURE_COUNT = CONSTRAINING_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE___GET_PARENT = CONSTRAINING_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE___GET_CHILDREN = CONSTRAINING_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Result Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONSTRAINING_NODE_OPERATION_COUNT = CONSTRAINING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultSetImpl <em>Result Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultSetImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResultSet()
	 * @generated
	 */
	int RESULT_SET = 5;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET__RESULTS = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidatableNodeImpl <em>Validatable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidatableNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getValidatableNode()
	 * @generated
	 */
	int VALIDATABLE_NODE = 10;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__ENABLED = ABSTRACT_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__LABEL = ABSTRACT_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__WORST_RESULT = ABSTRACT_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__ALL_CHILDREN_ENABLED = ABSTRACT_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__ALL_CHILDREN_DISABLED = ABSTRACT_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__PARENT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__CHILDREN = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrained Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE__CONSTRAINED_OBJECT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Validatable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE___GET_PARENT = ABSTRACT_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE___GET_CHILDREN = ABSTRACT_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Validatable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATABLE_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultValidatableNodeImpl <em>Result Validatable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultValidatableNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResultValidatableNode()
	 * @generated
	 */
	int RESULT_VALIDATABLE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__ENABLED = VALIDATABLE_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__LABEL = VALIDATABLE_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__WORST_RESULT = VALIDATABLE_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__ALL_CHILDREN_ENABLED = VALIDATABLE_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__ALL_CHILDREN_DISABLED = VALIDATABLE_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__PARENT = VALIDATABLE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__CHILDREN = VALIDATABLE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Constrained Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__CONSTRAINED_OBJECT = VALIDATABLE_NODE__CONSTRAINED_OBJECT;

	/**
	 * The feature id for the '<em><b>Result Constraining Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE = VALIDATABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Validatable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE_FEATURE_COUNT = VALIDATABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE___GET_PARENT = VALIDATABLE_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE___GET_CHILDREN = VALIDATABLE_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Result Validatable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALIDATABLE_NODE_OPERATION_COUNT = VALIDATABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootNodeImpl <em>Root Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getRootNode()
	 * @generated
	 */
	int ROOT_NODE = 7;

	/**
	 * The feature id for the '<em><b>Result Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE__RESULT_SETS = 0;

	/**
	 * The feature id for the '<em><b>Constraining Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE__CONSTRAINING_NODES = 1;

	/**
	 * The feature id for the '<em><b>Validatable Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE__VALIDATABLE_NODES = 2;

	/**
	 * The number of structural features of the '<em>Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootConstrainingNodeImpl <em>Root Constraining Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootConstrainingNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getRootConstrainingNode()
	 * @generated
	 */
	int ROOT_CONSTRAINING_NODE = 8;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__ENABLED = CONSTRAINING_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__LABEL = CONSTRAINING_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__WORST_RESULT = CONSTRAINING_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__ALL_CHILDREN_ENABLED = CONSTRAINING_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__ALL_CHILDREN_DISABLED = CONSTRAINING_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__PARENT = CONSTRAINING_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__CHILDREN = CONSTRAINING_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Constraining Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__CONSTRAINING_OBJECT = CONSTRAINING_NODE__CONSTRAINING_OBJECT;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE__ROOT_NODE = CONSTRAINING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE_FEATURE_COUNT = CONSTRAINING_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE___GET_PARENT = CONSTRAINING_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE___GET_CHILDREN = CONSTRAINING_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Root Constraining Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONSTRAINING_NODE_OPERATION_COUNT = CONSTRAINING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootValidatableNodeImpl <em>Root Validatable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootValidatableNodeImpl
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getRootValidatableNode()
	 * @generated
	 */
	int ROOT_VALIDATABLE_NODE = 9;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__ENABLED = VALIDATABLE_NODE__ENABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__LABEL = VALIDATABLE_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Worst Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__WORST_RESULT = VALIDATABLE_NODE__WORST_RESULT;

	/**
	 * The feature id for the '<em><b>All Children Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__ALL_CHILDREN_ENABLED = VALIDATABLE_NODE__ALL_CHILDREN_ENABLED;

	/**
	 * The feature id for the '<em><b>All Children Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__ALL_CHILDREN_DISABLED = VALIDATABLE_NODE__ALL_CHILDREN_DISABLED;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__PARENT = VALIDATABLE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__CHILDREN = VALIDATABLE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Constrained Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__CONSTRAINED_OBJECT = VALIDATABLE_NODE__CONSTRAINED_OBJECT;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE__ROOT_NODE = VALIDATABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Validatable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE_FEATURE_COUNT = VALIDATABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE___GET_PARENT = VALIDATABLE_NODE___GET_PARENT;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE___GET_CHILDREN = VALIDATABLE_NODE___GET_CHILDREN;

	/**
	 * The number of operations of the '<em>Root Validatable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_VALIDATABLE_NODE_OPERATION_COUNT = VALIDATABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Severity
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 11;

	/**
	 * The meta object id for the '<em>Constraint Locator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintLocator
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getConstraintLocator()
	 * @generated
	 */
	int CONSTRAINT_LOCATOR = 12;

	/**
	 * The meta object id for the '<em>Constraint Definition</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintDefinition
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getConstraintDefinition()
	 * @generated
	 */
	int CONSTRAINT_DEFINITION = 13;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 14;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 15;

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#isEnabled()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getLabel()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Label();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getWorstResult <em>Worst Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worst Result</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getWorstResult()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_WorstResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#isAllChildrenEnabled <em>All Children Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Children Enabled</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#isAllChildrenEnabled()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_AllChildrenEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#isAllChildrenDisabled <em>All Children Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Children Disabled</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#isAllChildrenDisabled()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_AllChildrenDisabled();

	/**
	 * Returns the meta object for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getParent() <em>Get Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent</em>' operation.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getParent()
	 * @generated
	 */
	EOperation getAbstractNode__GetParent();

	/**
	 * Returns the meta object for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getChildren() <em>Get Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Children</em>' operation.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.AbstractNode#getChildren()
	 * @generated
	 */
	EOperation getAbstractNode__GetChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode <em>Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode
	 * @generated
	 */
	EClass getConstrainingNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode#getParent()
	 * @see #getConstrainingNode()
	 * @generated
	 */
	EReference getConstrainingNode_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode#getChildren()
	 * @see #getConstrainingNode()
	 * @generated
	 */
	EReference getConstrainingNode_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode#getConstrainingObject <em>Constraining Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraining Object</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ConstrainingNode#getConstrainingObject()
	 * @see #getConstrainingNode()
	 * @generated
	 */
	EAttribute getConstrainingNode_ConstrainingObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.LeafConstrainingNode <em>Leaf Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.LeafConstrainingNode
	 * @generated
	 */
	EClass getLeafConstrainingNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.LeafConstrainingNode#getConstraintLocator <em>Constraint Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Locator</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.LeafConstrainingNode#getConstraintLocator()
	 * @see #getLeafConstrainingNode()
	 * @generated
	 */
	EAttribute getLeafConstrainingNode_ConstraintLocator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.LeafConstrainingNode#getConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Definition</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.LeafConstrainingNode#getConstraintDefinition()
	 * @see #getLeafConstrainingNode()
	 * @generated
	 */
	EAttribute getLeafConstrainingNode_ConstraintDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getResultSet <em>Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Result Set</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getResultSet()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_ResultSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getResultValidatableNode <em>Result Validatable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Validatable Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getResultValidatableNode()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_ResultValidatableNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getSeverity()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getDiagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostic</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getDiagnostic()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Diagnostic();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getValidatableNode <em>Validatable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validatable Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getValidatableNode()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_ValidatableNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getLeafConstrainingNode <em>Leaf Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getLeafConstrainingNode()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_LeafConstrainingNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getResultConstrainingNode <em>Result Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getResultConstrainingNode()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_ResultConstrainingNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Result#getException()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Exception();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultConstrainingNode <em>Result Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultConstrainingNode
	 * @generated
	 */
	EClass getResultConstrainingNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultConstrainingNode#getResultValidatableNode <em>Result Validatable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Validatable Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultConstrainingNode#getResultValidatableNode()
	 * @see #getResultConstrainingNode()
	 * @generated
	 */
	EReference getResultConstrainingNode_ResultValidatableNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet <em>Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Set</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet
	 * @generated
	 */
	EClass getResultSet();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet#getRoot()
	 * @see #getResultSet()
	 * @generated
	 */
	EReference getResultSet_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet#getResults()
	 * @see #getResultSet()
	 * @generated
	 */
	EReference getResultSet_Results();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultSet#getTimestamp()
	 * @see #getResultSet()
	 * @generated
	 */
	EAttribute getResultSet_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultValidatableNode <em>Result Validatable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Validatable Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultValidatableNode
	 * @generated
	 */
	EClass getResultValidatableNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ResultValidatableNode#getResultConstrainingNode <em>Result Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ResultValidatableNode#getResultConstrainingNode()
	 * @see #getResultValidatableNode()
	 * @generated
	 */
	EReference getResultValidatableNode_ResultConstrainingNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode
	 * @generated
	 */
	EClass getRootNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode#getResultSets <em>Result Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Sets</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode#getResultSets()
	 * @see #getRootNode()
	 * @generated
	 */
	EReference getRootNode_ResultSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode#getConstrainingNodes <em>Constraining Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraining Nodes</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode#getConstrainingNodes()
	 * @see #getRootNode()
	 * @generated
	 */
	EReference getRootNode_ConstrainingNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode#getValidatableNodes <em>Validatable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validatable Nodes</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootNode#getValidatableNodes()
	 * @see #getRootNode()
	 * @generated
	 */
	EReference getRootNode_ValidatableNodes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootConstrainingNode <em>Root Constraining Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Constraining Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootConstrainingNode
	 * @generated
	 */
	EClass getRootConstrainingNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootConstrainingNode#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootConstrainingNode#getRootNode()
	 * @see #getRootConstrainingNode()
	 * @generated
	 */
	EReference getRootConstrainingNode_RootNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootValidatableNode <em>Root Validatable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Validatable Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootValidatableNode
	 * @generated
	 */
	EClass getRootValidatableNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.RootValidatableNode#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.RootValidatableNode#getRootNode()
	 * @see #getRootValidatableNode()
	 * @generated
	 */
	EReference getRootValidatableNode_RootNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode <em>Validatable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validatable Node</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode
	 * @generated
	 */
	EClass getValidatableNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode#getParent()
	 * @see #getValidatableNode()
	 * @generated
	 */
	EReference getValidatableNode_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode#getChildren()
	 * @see #getValidatableNode()
	 * @generated
	 */
	EReference getValidatableNode_Children();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode#getConstrainedObject <em>Constrained Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Object</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.ValidatableNode#getConstrainedObject()
	 * @see #getValidatableNode()
	 * @generated
	 */
	EReference getValidatableNode_ConstrainedObject();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintLocator <em>Constraint Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Locator</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintLocator
	 * @model instanceClass="org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintLocator" serializeable="false"
	 * @generated
	 */
	EDataType getConstraintLocator();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Definition</em>'.
	 * @see org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintDefinition
	 * @model instanceClass="org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintDefinition" serializeable="false"
	 * @generated
	 */
	EDataType getConstraintDefinition();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidityFactory getValidityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.AbstractNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__ENABLED = eINSTANCE.getAbstractNode_Enabled();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__LABEL = eINSTANCE.getAbstractNode_Label();

		/**
		 * The meta object literal for the '<em><b>Worst Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__WORST_RESULT = eINSTANCE.getAbstractNode_WorstResult();

		/**
		 * The meta object literal for the '<em><b>All Children Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__ALL_CHILDREN_ENABLED = eINSTANCE.getAbstractNode_AllChildrenEnabled();

		/**
		 * The meta object literal for the '<em><b>All Children Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__ALL_CHILDREN_DISABLED = eINSTANCE.getAbstractNode_AllChildrenDisabled();

		/**
		 * The meta object literal for the '<em><b>Get Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_PARENT = eINSTANCE.getAbstractNode__GetParent();

		/**
		 * The meta object literal for the '<em><b>Get Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_NODE___GET_CHILDREN = eINSTANCE.getAbstractNode__GetChildren();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ConstrainingNodeImpl <em>Constraining Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ConstrainingNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getConstrainingNode()
		 * @generated
		 */
		EClass CONSTRAINING_NODE = eINSTANCE.getConstrainingNode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINING_NODE__PARENT = eINSTANCE.getConstrainingNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINING_NODE__CHILDREN = eINSTANCE.getConstrainingNode_Children();

		/**
		 * The meta object literal for the '<em><b>Constraining Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINING_NODE__CONSTRAINING_OBJECT = eINSTANCE.getConstrainingNode_ConstrainingObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.LeafConstrainingNodeImpl <em>Leaf Constraining Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.LeafConstrainingNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getLeafConstrainingNode()
		 * @generated
		 */
		EClass LEAF_CONSTRAINING_NODE = eINSTANCE.getLeafConstrainingNode();

		/**
		 * The meta object literal for the '<em><b>Constraint Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_CONSTRAINING_NODE__CONSTRAINT_LOCATOR = eINSTANCE.getLeafConstrainingNode_ConstraintLocator();

		/**
		 * The meta object literal for the '<em><b>Constraint Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_CONSTRAINING_NODE__CONSTRAINT_DEFINITION = eINSTANCE.getLeafConstrainingNode_ConstraintDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Result Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__RESULT_SET = eINSTANCE.getResult_ResultSet();

		/**
		 * The meta object literal for the '<em><b>Result Validatable Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__RESULT_VALIDATABLE_NODE = eINSTANCE.getResult_ResultValidatableNode();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__SEVERITY = eINSTANCE.getResult_Severity();

		/**
		 * The meta object literal for the '<em><b>Diagnostic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__DIAGNOSTIC = eINSTANCE.getResult_Diagnostic();

		/**
		 * The meta object literal for the '<em><b>Validatable Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__VALIDATABLE_NODE = eINSTANCE.getResult_ValidatableNode();

		/**
		 * The meta object literal for the '<em><b>Leaf Constraining Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__LEAF_CONSTRAINING_NODE = eINSTANCE.getResult_LeafConstrainingNode();

		/**
		 * The meta object literal for the '<em><b>Result Constraining Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__RESULT_CONSTRAINING_NODE = eINSTANCE.getResult_ResultConstrainingNode();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__EXCEPTION = eINSTANCE.getResult_Exception();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultConstrainingNodeImpl <em>Result Constraining Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultConstrainingNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResultConstrainingNode()
		 * @generated
		 */
		EClass RESULT_CONSTRAINING_NODE = eINSTANCE.getResultConstrainingNode();

		/**
		 * The meta object literal for the '<em><b>Result Validatable Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE = eINSTANCE.getResultConstrainingNode_ResultValidatableNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultSetImpl <em>Result Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultSetImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResultSet()
		 * @generated
		 */
		EClass RESULT_SET = eINSTANCE.getResultSet();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_SET__ROOT = eINSTANCE.getResultSet_Root();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_SET__RESULTS = eINSTANCE.getResultSet_Results();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_SET__TIMESTAMP = eINSTANCE.getResultSet_Timestamp();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultValidatableNodeImpl <em>Result Validatable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ResultValidatableNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getResultValidatableNode()
		 * @generated
		 */
		EClass RESULT_VALIDATABLE_NODE = eINSTANCE.getResultValidatableNode();

		/**
		 * The meta object literal for the '<em><b>Result Constraining Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE = eINSTANCE.getResultValidatableNode_ResultConstrainingNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootNodeImpl <em>Root Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getRootNode()
		 * @generated
		 */
		EClass ROOT_NODE = eINSTANCE.getRootNode();

		/**
		 * The meta object literal for the '<em><b>Result Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE__RESULT_SETS = eINSTANCE.getRootNode_ResultSets();

		/**
		 * The meta object literal for the '<em><b>Constraining Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE__CONSTRAINING_NODES = eINSTANCE.getRootNode_ConstrainingNodes();

		/**
		 * The meta object literal for the '<em><b>Validatable Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE__VALIDATABLE_NODES = eINSTANCE.getRootNode_ValidatableNodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootConstrainingNodeImpl <em>Root Constraining Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootConstrainingNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getRootConstrainingNode()
		 * @generated
		 */
		EClass ROOT_CONSTRAINING_NODE = eINSTANCE.getRootConstrainingNode();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_CONSTRAINING_NODE__ROOT_NODE = eINSTANCE.getRootConstrainingNode_RootNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootValidatableNodeImpl <em>Root Validatable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.RootValidatableNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getRootValidatableNode()
		 * @generated
		 */
		EClass ROOT_VALIDATABLE_NODE = eINSTANCE.getRootValidatableNode();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_VALIDATABLE_NODE__ROOT_NODE = eINSTANCE.getRootValidatableNode_RootNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidatableNodeImpl <em>Validatable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidatableNodeImpl
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getValidatableNode()
		 * @generated
		 */
		EClass VALIDATABLE_NODE = eINSTANCE.getValidatableNode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATABLE_NODE__PARENT = eINSTANCE.getValidatableNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATABLE_NODE__CHILDREN = eINSTANCE.getValidatableNode_Children();

		/**
		 * The meta object literal for the '<em><b>Constrained Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATABLE_NODE__CONSTRAINED_OBJECT = eINSTANCE.getValidatableNode_ConstrainedObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.emf.validation.debug.validity.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.Severity
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '<em>Constraint Locator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintLocator
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getConstraintLocator()
		 * @generated
		 */
		EDataType CONSTRAINT_LOCATOR = eINSTANCE.getConstraintLocator();

		/**
		 * The meta object literal for the '<em>Constraint Definition</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.emf.validation.debug.locator.ConstraintDefinition
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getConstraintDefinition()
		 * @generated
		 */
		EDataType CONSTRAINT_DEFINITION = eINSTANCE.getConstraintDefinition();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.ocl.examples.emf.validation.debug.validity.impl.ValidityPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //ValidationPackage
