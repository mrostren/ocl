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
package org.eclipse.emf.validation.debug.validity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.debug.locator.ConstraintLocator;
import org.eclipse.emf.validation.debug.validity.AbstractNode;
import org.eclipse.emf.validation.debug.validity.ConstrainingNode;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.ResultConstrainingNode;
import org.eclipse.emf.validation.debug.validity.ResultSet;
import org.eclipse.emf.validation.debug.validity.ResultValidatableNode;
import org.eclipse.emf.validation.debug.validity.RootConstrainingNode;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.debug.validity.RootValidatableNode;
import org.eclipse.emf.validation.debug.validity.Severity;
import org.eclipse.emf.validation.debug.validity.ValidatableNode;
import org.eclipse.emf.validation.debug.validity.ValidityFactory;
import org.eclipse.emf.validation.debug.validity.ValidityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidityPackageImpl extends EPackageImpl implements ValidityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafConstrainingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConstrainingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultValidatableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootConstrainingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootValidatableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constraintLocatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.validation.debug.validity.ValidityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidityPackageImpl() {
		super(eNS_URI, ValidityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ValidityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidityPackage init() {
		if (isInited) return (ValidityPackage)EPackage.Registry.INSTANCE.getEPackage(ValidityPackage.eNS_URI);

		// Obtain or create and register package
		ValidityPackageImpl theValidityPackage = (ValidityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValidityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValidityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theValidityPackage.createPackageContents();

		// Initialize created meta-data
		theValidityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidityPackage.eNS_URI, theValidityPackage);
		return theValidityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Enabled() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Label() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_WorstResult() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_AllChildrenEnabled() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_AllChildrenDisabled() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetParent() {
		return abstractNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractNode__GetChildren() {
		return abstractNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainingNode() {
		return constrainingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainingNode_Parent() {
		return (EReference)constrainingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainingNode_Children() {
		return (EReference)constrainingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstrainingNode_ConstrainingObject() {
		return (EAttribute)constrainingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafConstrainingNode() {
		return leafConstrainingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeafConstrainingNode_ConstraintLocator() {
		return (EAttribute)leafConstrainingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeafConstrainingNode_ConstraintResource() {
		return (EAttribute)leafConstrainingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeafConstrainingNode_ConstraintString() {
		return (EAttribute)leafConstrainingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_ResultSet() {
		return (EReference)resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_ResultValidatableNode() {
		return (EReference)resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Severity() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Diagnostic() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_ValidatableNode() {
		return (EReference)resultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_LeafConstrainingNode() {
		return (EReference)resultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResult_ResultConstrainingNode() {
		return (EReference)resultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Exception() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultConstrainingNode() {
		return resultConstrainingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultConstrainingNode_ResultValidatableNode() {
		return (EReference)resultConstrainingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultSet() {
		return resultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultSet_Root() {
		return (EReference)resultSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultSet_Results() {
		return (EReference)resultSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultSet_Timestamp() {
		return (EAttribute)resultSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultValidatableNode() {
		return resultValidatableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultValidatableNode_ResultConstrainingNode() {
		return (EReference)resultValidatableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootNode() {
		return rootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode_ResultSets() {
		return (EReference)rootNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode_ConstrainingNodes() {
		return (EReference)rootNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode_ValidatableNodes() {
		return (EReference)rootNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootConstrainingNode() {
		return rootConstrainingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootConstrainingNode_RootNode() {
		return (EReference)rootConstrainingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootValidatableNode() {
		return rootValidatableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootValidatableNode_RootNode() {
		return (EReference)rootValidatableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidatableNode() {
		return validatableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatableNode_Parent() {
		return (EReference)validatableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatableNode_Children() {
		return (EReference)validatableNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatableNode_ConstrainedObject() {
		return (EReference)validatableNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstraintLocator() {
		return constraintLocatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResource() {
		return resourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityFactory getValidityFactory() {
		return (ValidityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__ENABLED);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__LABEL);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__WORST_RESULT);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__ALL_CHILDREN_ENABLED);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__ALL_CHILDREN_DISABLED);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_PARENT);
		createEOperation(abstractNodeEClass, ABSTRACT_NODE___GET_CHILDREN);

		constrainingNodeEClass = createEClass(CONSTRAINING_NODE);
		createEReference(constrainingNodeEClass, CONSTRAINING_NODE__PARENT);
		createEReference(constrainingNodeEClass, CONSTRAINING_NODE__CHILDREN);
		createEAttribute(constrainingNodeEClass, CONSTRAINING_NODE__CONSTRAINING_OBJECT);

		leafConstrainingNodeEClass = createEClass(LEAF_CONSTRAINING_NODE);
		createEAttribute(leafConstrainingNodeEClass, LEAF_CONSTRAINING_NODE__CONSTRAINT_LOCATOR);
		createEAttribute(leafConstrainingNodeEClass, LEAF_CONSTRAINING_NODE__CONSTRAINT_RESOURCE);
		createEAttribute(leafConstrainingNodeEClass, LEAF_CONSTRAINING_NODE__CONSTRAINT_STRING);

		resultEClass = createEClass(RESULT);
		createEReference(resultEClass, RESULT__RESULT_SET);
		createEReference(resultEClass, RESULT__RESULT_VALIDATABLE_NODE);
		createEAttribute(resultEClass, RESULT__SEVERITY);
		createEAttribute(resultEClass, RESULT__DIAGNOSTIC);
		createEReference(resultEClass, RESULT__VALIDATABLE_NODE);
		createEReference(resultEClass, RESULT__LEAF_CONSTRAINING_NODE);
		createEReference(resultEClass, RESULT__RESULT_CONSTRAINING_NODE);
		createEAttribute(resultEClass, RESULT__EXCEPTION);

		resultConstrainingNodeEClass = createEClass(RESULT_CONSTRAINING_NODE);
		createEReference(resultConstrainingNodeEClass, RESULT_CONSTRAINING_NODE__RESULT_VALIDATABLE_NODE);

		resultSetEClass = createEClass(RESULT_SET);
		createEReference(resultSetEClass, RESULT_SET__ROOT);
		createEReference(resultSetEClass, RESULT_SET__RESULTS);
		createEAttribute(resultSetEClass, RESULT_SET__TIMESTAMP);

		resultValidatableNodeEClass = createEClass(RESULT_VALIDATABLE_NODE);
		createEReference(resultValidatableNodeEClass, RESULT_VALIDATABLE_NODE__RESULT_CONSTRAINING_NODE);

		rootNodeEClass = createEClass(ROOT_NODE);
		createEReference(rootNodeEClass, ROOT_NODE__RESULT_SETS);
		createEReference(rootNodeEClass, ROOT_NODE__CONSTRAINING_NODES);
		createEReference(rootNodeEClass, ROOT_NODE__VALIDATABLE_NODES);

		rootConstrainingNodeEClass = createEClass(ROOT_CONSTRAINING_NODE);
		createEReference(rootConstrainingNodeEClass, ROOT_CONSTRAINING_NODE__ROOT_NODE);

		rootValidatableNodeEClass = createEClass(ROOT_VALIDATABLE_NODE);
		createEReference(rootValidatableNodeEClass, ROOT_VALIDATABLE_NODE__ROOT_NODE);

		validatableNodeEClass = createEClass(VALIDATABLE_NODE);
		createEReference(validatableNodeEClass, VALIDATABLE_NODE__PARENT);
		createEReference(validatableNodeEClass, VALIDATABLE_NODE__CHILDREN);
		createEReference(validatableNodeEClass, VALIDATABLE_NODE__CONSTRAINED_OBJECT);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);

		// Create data types
		constraintLocatorEDataType = createEDataType(CONSTRAINT_LOCATOR);
		exceptionEDataType = createEDataType(EXCEPTION);
		objectEDataType = createEDataType(OBJECT);
		resourceEDataType = createEDataType(RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constrainingNodeEClass.getESuperTypes().add(this.getAbstractNode());
		leafConstrainingNodeEClass.getESuperTypes().add(this.getConstrainingNode());
		resultConstrainingNodeEClass.getESuperTypes().add(this.getConstrainingNode());
		resultValidatableNodeEClass.getESuperTypes().add(this.getValidatableNode());
		rootConstrainingNodeEClass.getESuperTypes().add(this.getConstrainingNode());
		rootValidatableNodeEClass.getESuperTypes().add(this.getValidatableNode());
		validatableNodeEClass.getESuperTypes().add(this.getAbstractNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNode_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 1, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_Label(), theEcorePackage.getEString(), "label", "", 1, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_WorstResult(), this.getResult(), null, "worstResult", null, 0, 1, AbstractNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_AllChildrenEnabled(), ecorePackage.getEBoolean(), "allChildrenEnabled", "true", 1, 1, AbstractNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_AllChildrenDisabled(), ecorePackage.getEBoolean(), "allChildrenDisabled", "true", 1, 1, AbstractNode.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractNode__GetParent(), this.getAbstractNode(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractNode__GetChildren(), this.getAbstractNode(), "getChildren", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(constrainingNodeEClass, ConstrainingNode.class, "ConstrainingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainingNode_Parent(), this.getConstrainingNode(), this.getConstrainingNode_Children(), "parent", null, 0, 1, ConstrainingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstrainingNode_Children(), this.getConstrainingNode(), this.getConstrainingNode_Parent(), "children", null, 0, -1, ConstrainingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstrainingNode_ConstrainingObject(), this.getObject(), "constrainingObject", null, 1, 1, ConstrainingNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafConstrainingNodeEClass, LeafConstrainingNode.class, "LeafConstrainingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeafConstrainingNode_ConstraintLocator(), this.getConstraintLocator(), "constraintLocator", null, 1, 1, LeafConstrainingNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeafConstrainingNode_ConstraintResource(), this.getResource(), "constraintResource", null, 0, 1, LeafConstrainingNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeafConstrainingNode_ConstraintString(), theEcorePackage.getEString(), "constraintString", null, 0, 1, LeafConstrainingNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResult_ResultSet(), this.getResultSet(), this.getResultSet_Results(), "resultSet", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_ResultValidatableNode(), this.getResultValidatableNode(), null, "resultValidatableNode", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Severity(), this.getSeverity(), "severity", "UNKNOWN", 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Diagnostic(), this.getObject(), "diagnostic", null, 0, 1, Result.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_ValidatableNode(), this.getValidatableNode(), null, "validatableNode", null, 1, 1, Result.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResult_LeafConstrainingNode(), this.getLeafConstrainingNode(), null, "leafConstrainingNode", null, 1, 1, Result.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResult_ResultConstrainingNode(), this.getResultConstrainingNode(), null, "resultConstrainingNode", null, 1, 1, Result.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Exception(), this.getException(), "exception", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultConstrainingNodeEClass, ResultConstrainingNode.class, "ResultConstrainingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultConstrainingNode_ResultValidatableNode(), this.getResultValidatableNode(), this.getResultValidatableNode_ResultConstrainingNode(), "resultValidatableNode", null, 1, 1, ResultConstrainingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resultSetEClass, ResultSet.class, "ResultSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultSet_Root(), this.getRootNode(), this.getRootNode_ResultSets(), "root", null, 1, 1, ResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultSet_Results(), this.getResult(), this.getResult_ResultSet(), "results", null, 0, -1, ResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResultSet_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, ResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultValidatableNodeEClass, ResultValidatableNode.class, "ResultValidatableNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultValidatableNode_ResultConstrainingNode(), this.getResultConstrainingNode(), this.getResultConstrainingNode_ResultValidatableNode(), "resultConstrainingNode", null, 1, 1, ResultValidatableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rootNodeEClass, RootNode.class, "RootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootNode_ResultSets(), this.getResultSet(), this.getResultSet_Root(), "resultSets", null, 0, -1, RootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRootNode_ConstrainingNodes(), this.getRootConstrainingNode(), this.getRootConstrainingNode_RootNode(), "constrainingNodes", null, 0, -1, RootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRootNode_ValidatableNodes(), this.getRootValidatableNode(), this.getRootValidatableNode_RootNode(), "validatableNodes", null, 0, -1, RootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rootConstrainingNodeEClass, RootConstrainingNode.class, "RootConstrainingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootConstrainingNode_RootNode(), this.getRootNode(), this.getRootNode_ConstrainingNodes(), "rootNode", null, 1, 1, RootConstrainingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootValidatableNodeEClass, RootValidatableNode.class, "RootValidatableNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootValidatableNode_RootNode(), this.getRootNode(), this.getRootNode_ValidatableNodes(), "rootNode", null, 1, 1, RootValidatableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validatableNodeEClass, ValidatableNode.class, "ValidatableNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidatableNode_Parent(), this.getValidatableNode(), this.getValidatableNode_Children(), "parent", null, 0, 1, ValidatableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidatableNode_Children(), this.getValidatableNode(), this.getValidatableNode_Parent(), "children", null, 0, -1, ValidatableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValidatableNode_ConstrainedObject(), theEcorePackage.getEObject(), null, "constrainedObject", null, 1, 1, ValidatableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.UNKNOWN);
		addEEnumLiteral(severityEEnum, Severity.OK);
		addEEnumLiteral(severityEEnum, Severity.INFO);
		addEEnumLiteral(severityEEnum, Severity.WARNING);
		addEEnumLiteral(severityEEnum, Severity.ERROR);
		addEEnumLiteral(severityEEnum, Severity.FATAL);

		// Initialize data types
		initEDataType(constraintLocatorEDataType, ConstraintLocator.class, "ConstraintLocator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceEDataType, Resource.class, "Resource", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ValidationPackageImpl
