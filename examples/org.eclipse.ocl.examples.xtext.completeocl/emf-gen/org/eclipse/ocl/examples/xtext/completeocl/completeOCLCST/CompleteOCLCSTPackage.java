/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CompleteOCLCSTPackage.java,v 1.12 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTFactory
 * @model kind="package"
 * @generated
 */
public interface CompleteOCLCSTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "completeOCLCST";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/3.1.0/CompleteOCLCST";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "completeOCLCST";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteOCLCSTPackage eINSTANCE = org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextConstraintCSImpl <em>Context Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextConstraintCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getContextConstraintCS()
	 * @generated
	 */
	int CONTEXT_CONSTRAINT_CS = 3;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION = BaseCSTPackage.CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__PIVOT = BaseCSTPackage.CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID = BaseCSTPackage.CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__MONIKER = BaseCSTPackage.CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__NAME = BaseCSTPackage.CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__STEREOTYPE = BaseCSTPackage.CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__SPECIFICATION = BaseCSTPackage.CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION = BaseCSTPackage.CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS__CONTEXT_DECL = BaseCSTPackage.CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONSTRAINT_CS_FEATURE_COUNT = BaseCSTPackage.CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PackageDeclarationCSImpl <em>Package Declaration CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PackageDeclarationCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPackageDeclarationCS()
	 * @generated
	 */
	int PACKAGE_DECLARATION_CS = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextDeclCSImpl <em>Context Decl CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextDeclCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getContextDeclCS()
	 * @generated
	 */
	int CONTEXT_DECL_CS = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PropertyContextDeclCSImpl <em>Property Context Decl CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PropertyContextDeclCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPropertyContextDeclCS()
	 * @generated
	 */
	int PROPERTY_CONTEXT_DECL_CS = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InitCSImpl <em>Init CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InitCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getInitCS()
	 * @generated
	 */
	int INIT_CS = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DerCSImpl <em>Der CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DerCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getDerCS()
	 * @generated
	 */
	int DER_CS = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ClassifierContextDeclCSImpl <em>Classifier Context Decl CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ClassifierContextDeclCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getClassifierContextDeclCS()
	 * @generated
	 */
	int CLASSIFIER_CONTEXT_DECL_CS = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InvCSImpl <em>Inv CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InvCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getInvCS()
	 * @generated
	 */
	int INV_CS = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DefCSImpl <em>Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DefCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getDefCS()
	 * @generated
	 */
	int DEF_CS = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OperationContextDeclCSImpl <em>Operation Context Decl CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OperationContextDeclCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getOperationContextDeclCS()
	 * @generated
	 */
	int OPERATION_CONTEXT_DECL_CS = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreCSImpl <em>Pre CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPreCS()
	 * @generated
	 */
	int PRE_CS = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PostCSImpl <em>Post CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PostCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPostCS()
	 * @generated
	 */
	int POST_CS = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.BodyCSImpl <em>Body CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.BodyCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getBodyCS()
	 * @generated
	 */
	int BODY_CS = 0;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The number of structural features of the '<em>Body CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS__OWNED_ANNOTATION = BaseCSTPackage.MONIKERED_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS__PIVOT = BaseCSTPackage.MONIKERED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS__ORIGINAL_XMI_ID = BaseCSTPackage.MONIKERED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS__MONIKER = BaseCSTPackage.MONIKERED_ELEMENT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS__NAMESPACE = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS__RULES = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Decl CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DECL_CS_FEATURE_COUNT = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__OWNED_ANNOTATION = CONTEXT_DECL_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__PIVOT = CONTEXT_DECL_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__ORIGINAL_XMI_ID = CONTEXT_DECL_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__MONIKER = CONTEXT_DECL_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__NAMESPACE = CONTEXT_DECL_CS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__RULES = CONTEXT_DECL_CS__RULES;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__CLASSIFIER = CONTEXT_DECL_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Self Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS__SELF_NAME = CONTEXT_DECL_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier Context Decl CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_CONTEXT_DECL_CS_FEATURE_COUNT = CONTEXT_DECL_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl <em>Complete OCL Document CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getCompleteOCLDocumentCS()
	 * @generated
	 */
	int COMPLETE_OCL_DOCUMENT_CS = 2;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__OWNED_ANNOTATION = BaseCSTPackage.ROOT_PACKAGE_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__PIVOT = BaseCSTPackage.ROOT_PACKAGE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__ORIGINAL_XMI_ID = BaseCSTPackage.ROOT_PACKAGE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__MONIKER = BaseCSTPackage.ROOT_PACKAGE_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__NAME = BaseCSTPackage.ROOT_PACKAGE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__OWNED_TYPE = BaseCSTPackage.ROOT_PACKAGE_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__OWNED_NESTED_PACKAGE = BaseCSTPackage.ROOT_PACKAGE_CS__OWNED_NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__NS_PREFIX = BaseCSTPackage.ROOT_PACKAGE_CS__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__NS_URI = BaseCSTPackage.ROOT_PACKAGE_CS__NS_URI;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT = BaseCSTPackage.ROOT_PACKAGE_CS__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY = BaseCSTPackage.ROOT_PACKAGE_CS__OWNED_LIBRARY;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__PACKAGES = BaseCSTPackage.ROOT_PACKAGE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__CONTEXTS = BaseCSTPackage.ROOT_PACKAGE_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE = BaseCSTPackage.ROOT_PACKAGE_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complete OCL Document CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT = BaseCSTPackage.ROOT_PACKAGE_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextSpecificationCSImpl <em>Context Specification CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextSpecificationCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getContextSpecificationCS()
	 * @generated
	 */
	int CONTEXT_SPECIFICATION_CS = 5;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS__OWNED_ANNOTATION = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS__PIVOT = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS__ORIGINAL_XMI_ID = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS__MONIKER = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Expr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS__EXPR_STRING = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS__EXPR_STRING;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS__OWNED_EXPRESSION = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS__OWNED_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Context Specification CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SPECIFICATION_CS_FEATURE_COUNT = EssentialOCLCSTPackage.EXP_SPECIFICATION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__STATIC = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constrained Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__CONSTRAINED_NAME = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__OPERATION = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__PARAMETERS = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS__OWNED_TYPE = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Def CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The number of structural features of the '<em>Der CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.FeatureContextDeclCSImpl <em>Feature Context Decl CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.FeatureContextDeclCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getFeatureContextDeclCS()
	 * @generated
	 */
	int FEATURE_CONTEXT_DECL_CS = 8;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__OWNED_ANNOTATION = CONTEXT_DECL_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__PIVOT = CONTEXT_DECL_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__ORIGINAL_XMI_ID = CONTEXT_DECL_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__MONIKER = CONTEXT_DECL_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__NAMESPACE = CONTEXT_DECL_CS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__RULES = CONTEXT_DECL_CS__RULES;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__CLASS = CONTEXT_DECL_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS__OWNED_TYPE = CONTEXT_DECL_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Context Decl CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT = CONTEXT_DECL_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.IncludeCSImpl <em>Include CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.IncludeCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getIncludeCS()
	 * @generated
	 */
	int INCLUDE_CS = 9;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS__OWNED_ANNOTATION = BaseCSTPackage.NAMESPACE_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS__PIVOT = BaseCSTPackage.NAMESPACE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS__ORIGINAL_XMI_ID = BaseCSTPackage.NAMESPACE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS__MONIKER = BaseCSTPackage.NAMESPACE_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS__NAME = BaseCSTPackage.NAMESPACE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS__NAMESPACE = BaseCSTPackage.NAMESPACE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CS_FEATURE_COUNT = BaseCSTPackage.NAMESPACE_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The number of structural features of the '<em>Init CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The number of structural features of the '<em>Inv CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INV_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OclMessageArgCSImpl <em>Ocl Message Arg CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OclMessageArgCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getOclMessageArgCS()
	 * @generated
	 */
	int OCL_MESSAGE_ARG_CS = 12;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS__OWNED_ANNOTATION = EssentialOCLCSTPackage.EXP_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS__PIVOT = EssentialOCLCSTPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS__ORIGINAL_XMI_ID = EssentialOCLCSTPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS__MONIKER = EssentialOCLCSTPackage.EXP_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS__PARENT = EssentialOCLCSTPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS__TYPE = EssentialOCLCSTPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Message Arg CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_ARG_CS_FEATURE_COUNT = EssentialOCLCSTPackage.EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__OWNED_ANNOTATION = FEATURE_CONTEXT_DECL_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__PIVOT = FEATURE_CONTEXT_DECL_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__ORIGINAL_XMI_ID = FEATURE_CONTEXT_DECL_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__MONIKER = FEATURE_CONTEXT_DECL_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__NAMESPACE = FEATURE_CONTEXT_DECL_CS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__RULES = FEATURE_CONTEXT_DECL_CS__RULES;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__CLASS = FEATURE_CONTEXT_DECL_CS__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__OWNED_TYPE = FEATURE_CONTEXT_DECL_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__OPERATION = FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__PARAMETERS = FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS__RESULT = FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Context Decl CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_DECL_CS_FEATURE_COUNT = FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__OWNED_ANNOTATION = BaseCSTPackage.MONIKERED_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__PIVOT = BaseCSTPackage.MONIKERED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__ORIGINAL_XMI_ID = BaseCSTPackage.MONIKERED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__MONIKER = BaseCSTPackage.MONIKERED_ELEMENT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__NAMESPACE = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__PACKAGE = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS__CONTEXTS = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Declaration CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_CS_FEATURE_COUNT = BaseCSTPackage.MONIKERED_ELEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The number of structural features of the '<em>Post CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__OWNED_ANNOTATION = CONTEXT_CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__PIVOT = CONTEXT_CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__ORIGINAL_XMI_ID = CONTEXT_CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__MONIKER = CONTEXT_CONSTRAINT_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__NAME = CONTEXT_CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__STEREOTYPE = CONTEXT_CONSTRAINT_CS__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__SPECIFICATION = CONTEXT_CONSTRAINT_CS__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Message Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__MESSAGE_SPECIFICATION = CONTEXT_CONSTRAINT_CS__MESSAGE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context Decl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS__CONTEXT_DECL = CONTEXT_CONSTRAINT_CS__CONTEXT_DECL;

	/**
	 * The number of structural features of the '<em>Pre CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CS_FEATURE_COUNT = CONTEXT_CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreExpCSImpl <em>Pre Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreExpCSImpl
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPreExpCS()
	 * @generated
	 */
	int PRE_EXP_CS = 17;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS__OWNED_ANNOTATION = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS__PIVOT = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS__MONIKER = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS__PARENT = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Named Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS__NAMED_EXP = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS__NAMED_EXP;

	/**
	 * The number of structural features of the '<em>Pre Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXP_CS_FEATURE_COUNT = EssentialOCLCSTPackage.DECORATED_NAMED_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__OWNED_ANNOTATION = FEATURE_CONTEXT_DECL_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__PIVOT = FEATURE_CONTEXT_DECL_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__ORIGINAL_XMI_ID = FEATURE_CONTEXT_DECL_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Moniker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__MONIKER = FEATURE_CONTEXT_DECL_CS__MONIKER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__NAMESPACE = FEATURE_CONTEXT_DECL_CS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__RULES = FEATURE_CONTEXT_DECL_CS__RULES;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__CLASS = FEATURE_CONTEXT_DECL_CS__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__OWNED_TYPE = FEATURE_CONTEXT_DECL_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS__PROPERTY = FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Context Decl CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_DECL_CS_FEATURE_COUNT = FEATURE_CONTEXT_DECL_CS_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS <em>Feature Context Decl CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Context Decl CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS
	 * @generated
	 */
	EClass getFeatureContextDeclCS();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS#getClass_()
	 * @see #getFeatureContextDeclCS()
	 * @generated
	 */
	EReference getFeatureContextDeclCS_Class();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Type</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS#getOwnedType()
	 * @see #getFeatureContextDeclCS()
	 * @generated
	 */
	EReference getFeatureContextDeclCS_OwnedType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS <em>Include CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS
	 * @generated
	 */
	EClass getIncludeCS();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS#getNamespace()
	 * @see #getIncludeCS()
	 * @generated
	 */
	EReference getIncludeCS_Namespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS <em>Package Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Declaration CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS
	 * @generated
	 */
	EClass getPackageDeclarationCS();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namespace</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS#getNamespace()
	 * @see #getPackageDeclarationCS()
	 * @generated
	 */
	EReference getPackageDeclarationCS_Namespace();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS#getPackage()
	 * @see #getPackageDeclarationCS()
	 * @generated
	 */
	EReference getPackageDeclarationCS_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS#getContexts()
	 * @see #getPackageDeclarationCS()
	 * @generated
	 */
	EReference getPackageDeclarationCS_Contexts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS <em>Context Decl CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Decl CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS
	 * @generated
	 */
	EClass getContextDeclCS();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namespace</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS#getNamespace()
	 * @see #getContextDeclCS()
	 * @generated
	 */
	EReference getContextDeclCS_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS#getRules()
	 * @see #getContextDeclCS()
	 * @generated
	 */
	EReference getContextDeclCS_Rules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextSpecificationCS <em>Context Specification CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Specification CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextSpecificationCS
	 * @generated
	 */
	EClass getContextSpecificationCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS <em>Property Context Decl CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Context Decl CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS
	 * @generated
	 */
	EClass getPropertyContextDeclCS();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS#getProperty()
	 * @see #getPropertyContextDeclCS()
	 * @generated
	 */
	EReference getPropertyContextDeclCS_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS <em>Init CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS
	 * @generated
	 */
	EClass getInitCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS <em>Der CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Der CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS
	 * @generated
	 */
	EClass getDerCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS <em>Classifier Context Decl CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Context Decl CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS
	 * @generated
	 */
	EClass getClassifierContextDeclCS();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS#getClassifier()
	 * @see #getClassifierContextDeclCS()
	 * @generated
	 */
	EReference getClassifierContextDeclCS_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS#getSelfName <em>Self Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Name</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS#getSelfName()
	 * @see #getClassifierContextDeclCS()
	 * @generated
	 */
	EAttribute getClassifierContextDeclCS_SelfName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS <em>Complete OCL Document CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete OCL Document CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS
	 * @generated
	 */
	EClass getCompleteOCLDocumentCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS#getPackages()
	 * @see #getCompleteOCLDocumentCS()
	 * @generated
	 */
	EReference getCompleteOCLDocumentCS_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS#getContexts()
	 * @see #getCompleteOCLDocumentCS()
	 * @generated
	 */
	EReference getCompleteOCLDocumentCS_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS#getOwnedInclude <em>Owned Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Include</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS#getOwnedInclude()
	 * @see #getCompleteOCLDocumentCS()
	 * @generated
	 */
	EReference getCompleteOCLDocumentCS_OwnedInclude();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS <em>Context Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Constraint CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS
	 * @generated
	 */
	EClass getContextConstraintCS();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS#getContextDecl <em>Context Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context Decl</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS#getContextDecl()
	 * @see #getContextConstraintCS()
	 * @generated
	 */
	EReference getContextConstraintCS_ContextDecl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS <em>Inv CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inv CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS
	 * @generated
	 */
	EClass getInvCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS <em>Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS
	 * @generated
	 */
	EClass getDefCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#isStatic()
	 * @see #getDefCS()
	 * @generated
	 */
	EAttribute getDefCS_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getConstrainedName <em>Constrained Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrained Name</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getConstrainedName()
	 * @see #getDefCS()
	 * @generated
	 */
	EAttribute getDefCS_ConstrainedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#isOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#isOperation()
	 * @see #getDefCS()
	 * @generated
	 */
	EAttribute getDefCS_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getParameters()
	 * @see #getDefCS()
	 * @generated
	 */
	EReference getDefCS_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Type</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getOwnedType()
	 * @see #getDefCS()
	 * @generated
	 */
	EReference getDefCS_OwnedType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS <em>Operation Context Decl CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Context Decl CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS
	 * @generated
	 */
	EClass getOperationContextDeclCS();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS#getOperation()
	 * @see #getOperationContextDeclCS()
	 * @generated
	 */
	EReference getOperationContextDeclCS_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS#getParameters()
	 * @see #getOperationContextDeclCS()
	 * @generated
	 */
	EReference getOperationContextDeclCS_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS#getResult()
	 * @see #getOperationContextDeclCS()
	 * @generated
	 */
	EReference getOperationContextDeclCS_Result();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS <em>Pre CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS
	 * @generated
	 */
	EClass getPreCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreExpCS <em>Pre Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Exp CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreExpCS
	 * @generated
	 */
	EClass getPreExpCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS <em>Post CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS
	 * @generated
	 */
	EClass getPostCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS <em>Body CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS
	 * @generated
	 */
	EClass getBodyCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS <em>Ocl Message Arg CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Message Arg CS</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS
	 * @generated
	 */
	EClass getOclMessageArgCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS#getType()
	 * @see #getOclMessageArgCS()
	 * @generated
	 */
	EReference getOclMessageArgCS_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompleteOCLCSTFactory getCompleteOCLCSTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.FeatureContextDeclCSImpl <em>Feature Context Decl CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.FeatureContextDeclCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getFeatureContextDeclCS()
		 * @generated
		 */
		EClass FEATURE_CONTEXT_DECL_CS = eINSTANCE.getFeatureContextDeclCS();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTEXT_DECL_CS__CLASS = eINSTANCE.getFeatureContextDeclCS_Class();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTEXT_DECL_CS__OWNED_TYPE = eINSTANCE.getFeatureContextDeclCS_OwnedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.IncludeCSImpl <em>Include CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.IncludeCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getIncludeCS()
		 * @generated
		 */
		EClass INCLUDE_CS = eINSTANCE.getIncludeCS();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_CS__NAMESPACE = eINSTANCE.getIncludeCS_Namespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PackageDeclarationCSImpl <em>Package Declaration CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PackageDeclarationCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPackageDeclarationCS()
		 * @generated
		 */
		EClass PACKAGE_DECLARATION_CS = eINSTANCE.getPackageDeclarationCS();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION_CS__NAMESPACE = eINSTANCE.getPackageDeclarationCS_Namespace();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION_CS__PACKAGE = eINSTANCE.getPackageDeclarationCS_Package();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION_CS__CONTEXTS = eINSTANCE.getPackageDeclarationCS_Contexts();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextDeclCSImpl <em>Context Decl CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextDeclCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getContextDeclCS()
		 * @generated
		 */
		EClass CONTEXT_DECL_CS = eINSTANCE.getContextDeclCS();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DECL_CS__NAMESPACE = eINSTANCE.getContextDeclCS_Namespace();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DECL_CS__RULES = eINSTANCE.getContextDeclCS_Rules();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextSpecificationCSImpl <em>Context Specification CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextSpecificationCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getContextSpecificationCS()
		 * @generated
		 */
		EClass CONTEXT_SPECIFICATION_CS = eINSTANCE.getContextSpecificationCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PropertyContextDeclCSImpl <em>Property Context Decl CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PropertyContextDeclCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPropertyContextDeclCS()
		 * @generated
		 */
		EClass PROPERTY_CONTEXT_DECL_CS = eINSTANCE.getPropertyContextDeclCS();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONTEXT_DECL_CS__PROPERTY = eINSTANCE.getPropertyContextDeclCS_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InitCSImpl <em>Init CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InitCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getInitCS()
		 * @generated
		 */
		EClass INIT_CS = eINSTANCE.getInitCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DerCSImpl <em>Der CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DerCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getDerCS()
		 * @generated
		 */
		EClass DER_CS = eINSTANCE.getDerCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ClassifierContextDeclCSImpl <em>Classifier Context Decl CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ClassifierContextDeclCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getClassifierContextDeclCS()
		 * @generated
		 */
		EClass CLASSIFIER_CONTEXT_DECL_CS = eINSTANCE.getClassifierContextDeclCS();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_CONTEXT_DECL_CS__CLASSIFIER = eINSTANCE.getClassifierContextDeclCS_Classifier();

		/**
		 * The meta object literal for the '<em><b>Self Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_CONTEXT_DECL_CS__SELF_NAME = eINSTANCE.getClassifierContextDeclCS_SelfName();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl <em>Complete OCL Document CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getCompleteOCLDocumentCS()
		 * @generated
		 */
		EClass COMPLETE_OCL_DOCUMENT_CS = eINSTANCE.getCompleteOCLDocumentCS();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_OCL_DOCUMENT_CS__PACKAGES = eINSTANCE.getCompleteOCLDocumentCS_Packages();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_OCL_DOCUMENT_CS__CONTEXTS = eINSTANCE.getCompleteOCLDocumentCS_Contexts();

		/**
		 * The meta object literal for the '<em><b>Owned Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE = eINSTANCE.getCompleteOCLDocumentCS_OwnedInclude();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextConstraintCSImpl <em>Context Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.ContextConstraintCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getContextConstraintCS()
		 * @generated
		 */
		EClass CONTEXT_CONSTRAINT_CS = eINSTANCE.getContextConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Context Decl</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_CONSTRAINT_CS__CONTEXT_DECL = eINSTANCE.getContextConstraintCS_ContextDecl();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InvCSImpl <em>Inv CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.InvCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getInvCS()
		 * @generated
		 */
		EClass INV_CS = eINSTANCE.getInvCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DefCSImpl <em>Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.DefCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getDefCS()
		 * @generated
		 */
		EClass DEF_CS = eINSTANCE.getDefCS();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF_CS__STATIC = eINSTANCE.getDefCS_Static();

		/**
		 * The meta object literal for the '<em><b>Constrained Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF_CS__CONSTRAINED_NAME = eINSTANCE.getDefCS_ConstrainedName();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF_CS__OPERATION = eINSTANCE.getDefCS_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_CS__PARAMETERS = eINSTANCE.getDefCS_Parameters();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_CS__OWNED_TYPE = eINSTANCE.getDefCS_OwnedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OperationContextDeclCSImpl <em>Operation Context Decl CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OperationContextDeclCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getOperationContextDeclCS()
		 * @generated
		 */
		EClass OPERATION_CONTEXT_DECL_CS = eINSTANCE.getOperationContextDeclCS();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTEXT_DECL_CS__OPERATION = eINSTANCE.getOperationContextDeclCS_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTEXT_DECL_CS__PARAMETERS = eINSTANCE.getOperationContextDeclCS_Parameters();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTEXT_DECL_CS__RESULT = eINSTANCE.getOperationContextDeclCS_Result();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreCSImpl <em>Pre CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPreCS()
		 * @generated
		 */
		EClass PRE_CS = eINSTANCE.getPreCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreExpCSImpl <em>Pre Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PreExpCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPreExpCS()
		 * @generated
		 */
		EClass PRE_EXP_CS = eINSTANCE.getPreExpCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PostCSImpl <em>Post CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.PostCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getPostCS()
		 * @generated
		 */
		EClass POST_CS = eINSTANCE.getPostCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.BodyCSImpl <em>Body CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.BodyCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getBodyCS()
		 * @generated
		 */
		EClass BODY_CS = eINSTANCE.getBodyCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OclMessageArgCSImpl <em>Ocl Message Arg CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.OclMessageArgCSImpl
		 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLCSTPackageImpl#getOclMessageArgCS()
		 * @generated
		 */
		EClass OCL_MESSAGE_ARG_CS = eINSTANCE.getOclMessageArgCS();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MESSAGE_ARG_CS__TYPE = eINSTANCE.getOclMessageArgCS_Type();

	}

} //CompleteOCLCSTPackage
