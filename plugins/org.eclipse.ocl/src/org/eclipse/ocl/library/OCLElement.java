/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLElement.java,v 1.1.2.4 2010/01/30 07:49:20 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Element</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLElement()
 * @model abstract="true"
 * @generated
 */
public interface OCLElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQualifiedSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isTypeParameter(OCLTypeParameter typeParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OCLLibrary getLibrary();
	
	void appendName(StringBuffer s);
	void appendQualifiedName(StringBuffer s);
	void appendQualifiedSignature(StringBuffer s);
	void appendSignature(StringBuffer s);
} // OCLElement