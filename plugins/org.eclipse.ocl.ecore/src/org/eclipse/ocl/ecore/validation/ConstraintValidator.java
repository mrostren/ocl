/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ConstraintValidator.java,v 1.1.2.3 2010/01/31 22:20:18 ewillink Exp $
 */
package org.eclipse.ocl.ecore.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EParameter;

import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * A sample validator interface for {@link org.eclipse.ocl.ecore.Constraint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstraintValidator {

	boolean validate();

	boolean validateSpecification(ExpressionInOCL<EClassifier, EParameter> value);

	boolean validateConstrainedElements(EList<ENamedElement> value);

	boolean validateStereotype(String value);
}