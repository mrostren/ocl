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
 * $Id$
 */
package org.eclipse.ocl.ecore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.IntegerLiteralExp;
import org.eclipse.ocl.ecore.LiteralExp;
import org.eclipse.ocl.ecore.LongLiteralExp;
import org.eclipse.ocl.ecore.NumericLiteralExp;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.PrimitiveLiteralExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getEType <em>EType</em>}</li>
 *   <li>{@link org.eclipse.ocl.ecore.impl.LongLiteralExpImpl#getEGenericType <em>EGeneric Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @since 3.2
 */
public class LongLiteralExpImpl
		extends
		org.eclipse.ocl.expressions.impl.LongLiteralExpImpl<EClassifier>
		implements LongLiteralExp {

	/**
	 * The cached value of the '{@link #getEAnnotations() <em>EAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> eAnnotations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongLiteralExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.LONG_LITERAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getEAnnotations() {
		if (eAnnotations == null) {
			eAnnotations = new EObjectContainmentWithInverseEList<EAnnotation>(
				EAnnotation.class, this,
				EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS,
				org.eclipse.emf.ecore.EcorePackage.EANNOTATION__EMODEL_ELEMENT);
		}
		return eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				EcorePackage.LONG_LITERAL_EXP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				EcorePackage.LONG_LITERAL_EXP__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				EcorePackage.LONG_LITERAL_EXP__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND, oldLowerBound,
				lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND, oldUpperBound,
				upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		// TODO: implement this method to return the 'Many' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		// TODO: implement this method to return the 'Required' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEType() {
		EClassifier eType = basicGetEType();
		return eType != null && eType.eIsProxy()
			? (EClassifier) eResolveProxy((InternalEObject) eType)
			: eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEType() {
		// TODO: implement this method to return the 'EType' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(EClassifier newEType) {
		// TODO: implement this method to set the 'EType' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEType() {
		// TODO: implement this method to unset the 'EType' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEType() {
		// TODO: implement this method to return whether the 'EType' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getEGenericType() {
		// TODO: implement this method to return the 'EGeneric Type' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEGenericType(EGenericType newEGenericType,
			NotificationChain msgs) {
		// TODO: implement this method to set the contained 'EGeneric Type' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGenericType(EGenericType newEGenericType) {
		// TODO: implement this method to set the 'EGeneric Type' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEGenericType(NotificationChain msgs) {
		// TODO: implement this method to unset the contained 'EGeneric Type' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericType() {
		// TODO: implement this method to unset the 'EGeneric Type' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericType() {
		// TODO: implement this method to return whether the 'EGeneric Type' containment reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE :
				return basicUnsetEGenericType(msgs);
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
			case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
				return getEAnnotations();
			case EcorePackage.LONG_LITERAL_EXP__NAME :
				return getName();
			case EcorePackage.LONG_LITERAL_EXP__ORDERED :
				return isOrdered();
			case EcorePackage.LONG_LITERAL_EXP__UNIQUE :
				return isUnique();
			case EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND :
				return getLowerBound();
			case EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND :
				return getUpperBound();
			case EcorePackage.LONG_LITERAL_EXP__MANY :
				return isMany();
			case EcorePackage.LONG_LITERAL_EXP__REQUIRED :
				return isRequired();
			case EcorePackage.LONG_LITERAL_EXP__ETYPE :
				if (resolve)
					return getEType();
				return basicGetEType();
			case EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE :
				return getEGenericType();
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
			case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__NAME :
				setName((String) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__ORDERED :
				setOrdered((Boolean) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__UNIQUE :
				setUnique((Boolean) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND :
				setLowerBound((Integer) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND :
				setUpperBound((Integer) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__ETYPE :
				setEType((EClassifier) newValue);
				return;
			case EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE :
				setEGenericType((EGenericType) newValue);
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
			case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case EcorePackage.LONG_LITERAL_EXP__NAME :
				setName(NAME_EDEFAULT);
				return;
			case EcorePackage.LONG_LITERAL_EXP__ORDERED :
				setOrdered(ORDERED_EDEFAULT);
				return;
			case EcorePackage.LONG_LITERAL_EXP__UNIQUE :
				setUnique(UNIQUE_EDEFAULT);
				return;
			case EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND :
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND :
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case EcorePackage.LONG_LITERAL_EXP__ETYPE :
				unsetEType();
				return;
			case EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE :
				unsetEGenericType();
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
			case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case EcorePackage.LONG_LITERAL_EXP__NAME :
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case EcorePackage.LONG_LITERAL_EXP__ORDERED :
				return ordered != ORDERED_EDEFAULT;
			case EcorePackage.LONG_LITERAL_EXP__UNIQUE :
				return unique != UNIQUE_EDEFAULT;
			case EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND :
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND :
				return upperBound != UPPER_BOUND_EDEFAULT;
			case EcorePackage.LONG_LITERAL_EXP__MANY :
				return isMany() != MANY_EDEFAULT;
			case EcorePackage.LONG_LITERAL_EXP__REQUIRED :
				return isRequired() != REQUIRED_EDEFAULT;
			case EcorePackage.LONG_LITERAL_EXP__ETYPE :
				return isSetEType();
			case EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE :
				return isSetEGenericType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (derivedFeatureID) {
				case EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS :
					return org.eclipse.emf.ecore.EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;
				default :
					return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (derivedFeatureID) {
				case EcorePackage.LONG_LITERAL_EXP__NAME :
					return org.eclipse.emf.ecore.EcorePackage.ENAMED_ELEMENT__NAME;
				default :
					return -1;
			}
		}
		if (baseClass == ETypedElement.class) {
			switch (derivedFeatureID) {
				case EcorePackage.LONG_LITERAL_EXP__ORDERED :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__ORDERED;
				case EcorePackage.LONG_LITERAL_EXP__UNIQUE :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__UNIQUE;
				case EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__LOWER_BOUND;
				case EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__UPPER_BOUND;
				case EcorePackage.LONG_LITERAL_EXP__MANY :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__MANY;
				case EcorePackage.LONG_LITERAL_EXP__REQUIRED :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__REQUIRED;
				case EcorePackage.LONG_LITERAL_EXP__ETYPE :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__ETYPE;
				case EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE :
					return org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == OCLExpression.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == LiteralExp.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == PrimitiveLiteralExp.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == NumericLiteralExp.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == IntegerLiteralExp.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseFeatureID) {
				case org.eclipse.emf.ecore.EcorePackage.EMODEL_ELEMENT__EANNOTATIONS :
					return EcorePackage.LONG_LITERAL_EXP__EANNOTATIONS;
				default :
					return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (baseFeatureID) {
				case org.eclipse.emf.ecore.EcorePackage.ENAMED_ELEMENT__NAME :
					return EcorePackage.LONG_LITERAL_EXP__NAME;
				default :
					return -1;
			}
		}
		if (baseClass == ETypedElement.class) {
			switch (baseFeatureID) {
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__ORDERED :
					return EcorePackage.LONG_LITERAL_EXP__ORDERED;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__UNIQUE :
					return EcorePackage.LONG_LITERAL_EXP__UNIQUE;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__LOWER_BOUND :
					return EcorePackage.LONG_LITERAL_EXP__LOWER_BOUND;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__UPPER_BOUND :
					return EcorePackage.LONG_LITERAL_EXP__UPPER_BOUND;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__MANY :
					return EcorePackage.LONG_LITERAL_EXP__MANY;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__REQUIRED :
					return EcorePackage.LONG_LITERAL_EXP__REQUIRED;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__ETYPE :
					return EcorePackage.LONG_LITERAL_EXP__ETYPE;
				case org.eclipse.emf.ecore.EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE :
					return EcorePackage.LONG_LITERAL_EXP__EGENERIC_TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == OCLExpression.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == LiteralExp.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == PrimitiveLiteralExp.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == NumericLiteralExp.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == IntegerLiteralExp.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", ordered: "); //$NON-NLS-1$
		result.append(ordered);
		result.append(", unique: "); //$NON-NLS-1$
		result.append(unique);
		result.append(", lowerBound: "); //$NON-NLS-1$
		result.append(lowerBound);
		result.append(", upperBound: "); //$NON-NLS-1$
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //LongLiteralExpImpl
