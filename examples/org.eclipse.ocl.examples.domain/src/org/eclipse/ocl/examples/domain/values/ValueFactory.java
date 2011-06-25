/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: ValueFactory.java,v 1.6 2011/05/07 16:41:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.types.DomainClassifierType;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainTupleType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;

public interface ValueFactory
{
	BooleanValue booleanValueOf(boolean value);
	boolean conformsTo(DomainType firstType, DomainType secondType);
		
    BagValue createBagOf(Object... objects);
    BagValue createBagOf(Iterable<?> objects);
	BagValue createBagValue(DomainCollectionType type, Value... values);
	BagValue createBagValue(DomainCollectionType type, Bag<? extends Value> values);
	BagValue createBagValue(DomainCollectionType type, Collection<? extends Value> values);
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 */
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Value... values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Collection<Value> values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, DomainType elementType, Value... values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, DomainType elementType, Collection<Value> values);
	
	<E extends DomainElement> ElementValue<E> createElementValue(E element);

    OrderedSetValue createOrderedSetOf(Object... objects);
    OrderedSetValue createOrderedSetOf(Iterable<?> objects);
	OrderedSetValue createOrderedSetValue(DomainCollectionType type, Value... values);
	OrderedSetValue createOrderedSetValue(DomainCollectionType type, LinkedHashSet<? extends Value> values);
	OrderedSetValue createOrderedSetValue(DomainCollectionType type, Collection<? extends Value> values);

    SequenceValue createSequenceOf(Object... objects);
    SequenceValue createSequenceOf(Iterable<?> objects);
	SequenceValue createSequenceValue(DomainCollectionType type, Value... values);
	SequenceValue createSequenceValue(DomainCollectionType type, List<? extends Value> values);
	SequenceValue createSequenceValue(DomainCollectionType type, Collection<? extends Value> values);
	
    SetValue createSetOf(Object... objects);
    SetValue createSetOf(Iterable<?> objects);
	SetValue createSetValue(DomainCollectionType type, Value... values);
	SetValue createSetValue(DomainCollectionType type, Set<? extends Value> values);
	SetValue createSetValue(DomainCollectionType type, Collection<? extends Value> values);
	
	Value createTupleValue(DomainTupleType type, Map<? extends DomainTypedElement, Value> values);

	Value createTypeValue(DomainClassifierType type);

	DomainType getCommonType(DomainType firstType, DomainType ssecondType);
	Object getEcoreValueOf(Value result);
    DomainType getElementType(Value... values);
    DomainType getElementType(Iterable<Value> values);

//	BagValue getEmptyBagValue();
//	OrderedSetValue getEmptyOrderedSetValue();
//	SequenceValue getEmptySequenceValue();	
//	SetValue getEmptySetValue();
	BooleanValue getFalse();
	InvalidValue getInvalid();
	NullValue getNull();
	DomainStandardLibrary getStandardLibrary();
	BooleanValue getTrue();
	UnlimitedValue getUnlimited();
	NumericValue getZero();
	
	IntegerValue integerValueOf(long value);
	IntegerValue integerValueOf(BigInteger value);
	IntegerValue integerValueOf(String aValue) throws InvalidValueException;
	
	RealValue realValueOf(double value);
	RealValue realValueOf(BigDecimal value);
	RealValue realValueOf(IntegerValue integerValue);	
	RealValue realValueOf(String aValue) throws InvalidValueException;
	
	StringValue stringValueOf(String value) ;
	
	InvalidValue throwInvalidValueException(String message, Object... bindings) throws InvalidValueException;

	Value valueOf(Object object);
	Value valueOf(Object eValue, ETypedElement eFeature);
}
 