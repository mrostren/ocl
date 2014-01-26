/**
 * <copyright>
 *
 * Copyright (c) 2014 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Obeo - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.validity.test.ecoreTest2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.validity.test.ecoreTest2.EcoreTest2Package
 * @generated
 */
public interface EcoreTest2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreTest2Factory eINSTANCE = org.eclipse.ocl.examples.validity.test.ecoreTest2.impl.EcoreTest2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eclass5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclass5</em>'.
	 * @generated
	 */
	Eclass5 createEclass5();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreTest2Package getEcoreTest2Package();

} //EcoreTest2Factory
