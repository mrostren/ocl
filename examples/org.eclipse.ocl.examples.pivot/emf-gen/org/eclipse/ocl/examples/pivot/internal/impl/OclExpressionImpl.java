/**
 * <copyright>
 * </copyright>
 *
 * $Id: OclExpressionImpl.java,v 1.3 2011/03/01 08:47:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OclExpressionImpl
		extends TypedElementImpl
		implements OclExpression {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.OCL_EXPRESSION;
	}

	@Override
	public <R, C> R accept(Visitor<R, C> visitor) {
		return visitor.visitOclExpression(this);
	}

} //OclExpressionImpl

