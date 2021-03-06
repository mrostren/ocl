/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EnumerationCS.java,v 1.2 2011/01/24 20:59:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.baseCST;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS#getOwnedLiterals <em>Owned Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getEnumerationCS()
 * @model
 * @generated
 */
public interface EnumerationCS extends ClassifierCS, NamespaceCS
{
	/**
	 * Returns the value of the '<em><b>Owned Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literals</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getEnumerationCS_OwnedLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteralCS> getOwnedLiterals();

} // EnumCS
