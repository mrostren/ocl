/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: ValueFactoryImpl.java,v 1.9 2011/05/07 16:41:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainClassifierType;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainTupleType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.values.Bag;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.InvalidValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.NumericValue;
import org.eclipse.ocl.examples.domain.values.OrderedSet;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.RealValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.UnlimitedValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.osgi.util.NLS;

public abstract class AbstractValueFactory implements ValueFactory
{
	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();	
	
	private BooleanValue falseValue; 
	private InvalidValue invalidValue; 
	private NullValue nullValue; 
	private BooleanValue trueValue; 
	private UnlimitedValue unlimitedValue; 
	private NumericValue zeroValue;

	protected final DomainStandardLibrary standardLibrary;

	public AbstractValueFactory(DomainStandardLibrary standardLibrary) {
		this.standardLibrary = standardLibrary;
	}

	public BooleanValue booleanValueOf(boolean value) {
		return value ? getTrue() : getFalse();
	}

    public BagValue createBagOf(Object... objects) {
    	Bag<Value> collection = new BagImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createBagValue(standardLibrary.getBagType(elementType), collection);
    }

    public BagValue createBagOf(Iterable<?> objects) {
    	Bag<Value> collection = new BagImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createBagValue(standardLibrary.getBagType(elementType), collection);
    }
	
	public BagValue createBagValue(DomainCollectionType type, Value... values) {
		return new BagValueImpl(this, type, values);
	}

	public BagValue createBagValue(DomainCollectionType type, Bag<? extends Value> values) {
		return new BagValueImpl(this, type, values);
	}

	public BagValue createBagValue(DomainCollectionType type, Collection<? extends Value> values) {
		return new BagValueImpl(this, type, values);
	}
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @param values the required collection contents
	 * @return the new collection
		 */
	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Value... values) {
		return createCollectionValue(isOrdered, isUnique, getElementType(values), values);
	}

	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Collection<Value> values) {
		return createCollectionValue(isOrdered, isUnique, getElementType(values), values);
	}

	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, DomainType elementType, Value... values) {
		if (isOrdered) {
			if (isUnique) {
				return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), values);
			}
			else {
				return createSequenceValue(standardLibrary.getSequenceType(elementType), values);
			}
		}
		else {
			if (isUnique) {
				return createSetValue(standardLibrary.getSetType(elementType), values);
			}
			else {
				return createBagValue(standardLibrary.getBagType(elementType), values);
			}
		}
	}
   
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @param values the required collection contents
	 * @return the new collection
		 */
	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, DomainType elementType, Collection<Value> values) {
		if (isOrdered) {
			if (isUnique) {
				return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), values);
			}
			else {
				return createSequenceValue(standardLibrary.getSequenceType(elementType), values);
			}
		}
		else {
			if (isUnique) {
				return createSetValue(standardLibrary.getSetType(elementType), values);
			}
			else {
				return createBagValue(standardLibrary.getBagType(elementType), values);
			}
		}
	}

    public OrderedSetValue createOrderedSetOf(Object... objects) {
    	OrderedSet<Value> collection = new OrderedSetImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), collection);
    }

    public OrderedSetValue createOrderedSetOf(Iterable<?> objects) {
    	OrderedSet<Value> collection = new OrderedSetImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), collection);
    }

	public OrderedSetValue createOrderedSetValue(DomainCollectionType type, Value... values) {
		return new OrderedSetValueImpl(this, type, values);
	}

	public OrderedSetValue createOrderedSetValue(DomainCollectionType type, LinkedHashSet<? extends Value> values) {
		return new OrderedSetValueImpl(this, type, values);
	}

	public OrderedSetValue createOrderedSetValue(DomainCollectionType type, Collection<? extends Value> values) {
		return new OrderedSetValueImpl(this, type, values);
	}

    public SequenceValue createSequenceOf(Object... objects) {
    	List<Value> collection = new ArrayList<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createSequenceValue(standardLibrary.getSequenceType(elementType), collection);
    }

    public SequenceValue createSequenceOf(Iterable<?> objects) {
    	List<Value> collection = new ArrayList<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createSequenceValue(standardLibrary.getSequenceType(elementType), collection);
    }

	public SequenceValue createSequenceValue(DomainCollectionType type, Value... values) {
		return new SequenceValueImpl(this, type, values);
	}

	public SequenceValue createSequenceValue(DomainCollectionType type, List<? extends Value> values) {
		return new SequenceValueImpl(this, type, values);
	}

	public SequenceValue createSequenceValue(DomainCollectionType type, Collection<? extends Value> values) {
		return new SequenceValueImpl(this, type, values);
	}

    public SetValue createSetOf(Object... objects) {
    	Set<Value> collection = new HashSet<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createSetValue(standardLibrary.getSetType(elementType), collection);
    }

    public SetValue createSetOf(Iterable<?> objects) {
    	Set<Value> collection = new HashSet<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	DomainType elementType = getElementType(collection);
    	return createSetValue(standardLibrary.getSetType(elementType), collection);
    }

	public SetValue createSetValue(DomainCollectionType type, Value... values) {
		return new SetValueImpl(this, type, values);
	}

	public SetValue createSetValue(DomainCollectionType type, Set<? extends Value> values) {
		return new SetValueImpl(this, type, values);
	}

	public SetValue createSetValue(DomainCollectionType type, Collection<? extends Value> values) {
		return new SetValueImpl(this, type, values);
	}

	public Value createTupleValue(DomainTupleType type, Map<? extends DomainTypedElement, Value> values) {
		return new TupleValueImpl(this, type, (Map<? extends DomainTypedElement, Value>) values);
	}

	public Value createTypeValue(DomainClassifierType type) {
		return new TypeValueImpl(this, type);
	}

    public DomainType getElementType(Value... values) {
    	DomainType elementType = standardLibrary.getOclVoidType();
    	for (Value value : values) {
    		elementType = getCommonType(elementType, value.getType());
    	}
     	return elementType;
    }

    public DomainType getElementType(Iterable<Value> values) {
    	DomainType elementType = standardLibrary.getOclVoidType();
    	for (Value value : values) {
    		elementType = getCommonType(elementType, value.getType());
    	}
     	return elementType;
    }

//	public BagValue getEmptyBagValue() {
//		return emptyBagValue;
//	}

//	public OrderedSetValue getEmptyOrderedSetValue() {
//		return emptyOrderedSetValue;
//	}

//	public SequenceValue getEmptySequenceValue() {
//		return emptySequenceValue;
//	}

//	public SetValue getEmptySetValue() {
//		return emptySetValue;
//	}

	public BooleanValue getFalse() {
		if (falseValue == null) {
			falseValue = new BooleanValueImpl(this, standardLibrary.getBooleanType(), false); 
		}
		return falseValue;
	}

	public InvalidValue getInvalid() {
		if (invalidValue == null) {
			invalidValue = new InvalidValueImpl(this, standardLibrary.getOclInvalidType()); 
		}
		return invalidValue;
	}

	public NullValue getNull() {
		if (nullValue == null) {
			nullValue = new NullValueImpl(this, standardLibrary.getOclVoidType()); 
		}
		return nullValue;
	}
	
	public final DomainStandardLibrary getStandardLibrary() {
		return standardLibrary;
	}

	public BooleanValue getTrue() {
		if (trueValue == null) {
			trueValue = new BooleanValueImpl(this, standardLibrary.getBooleanType(), true); 
		}
		return trueValue;
	}

	public UnlimitedValue getUnlimited() {
		if (unlimitedValue == null) {
			unlimitedValue = new UnlimitedValueImpl(this, standardLibrary.getUnlimitedNaturalType());
		}
		return unlimitedValue;
	}

	public NumericValue getZero() {
		if (zeroValue == null) {
			zeroValue = integerValueOf(0);
		}
		return zeroValue;
	}

	public IntegerValue integerValueOf(long value) {
		DomainType type = value >= 0 ? standardLibrary.getUnlimitedNaturalType() : standardLibrary.getIntegerType();
		return new IntegerValueImpl(this, type, value);
	}
	
	public IntegerValue integerValueOf(BigInteger value) {
		DomainType type = value.signum() >= 0 ? standardLibrary.getUnlimitedNaturalType() : standardLibrary.getIntegerType();
		return new IntegerValueImpl(this, type, value);
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws InvalidValueException if representation cannot be created
		 */
	public IntegerValue integerValueOf(String aValue) throws InvalidValueException {
		try {
			int len = aValue.length();
			if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
				return integerValueOf(BigInteger.valueOf(Long.parseLong(aValue)));
			}
			else {
				return integerValueOf(new BigInteger(aValue));
			}
		}
		catch (NumberFormatException e) {
			return throwInvalidValueException(e, EvaluatorMessages.InvalidInteger, aValue);
		}
	}

	public RealValue realValueOf(double value) {
		return new RealValueImpl(this, standardLibrary.getRealType(), value);
	}

	public RealValue realValueOf(BigDecimal value) {
		return new RealValueImpl(this, standardLibrary.getRealType(), value);
	}

//	public static RealValue realValueOf(IntegerValue value) {
//		return new RealValueImpl(value.bigDecimalValue());
//	}

	public RealValue realValueOf(IntegerValue integerValue) {
		return realValueOf(integerValue.bigDecimalValue());
	}
	
	public RealValue realValueOf(String aValue) throws InvalidValueException {
		try {
			return new RealValueImpl(this, standardLibrary.getRealType(), new BigDecimal(aValue.trim()));
		}
		catch (NumberFormatException e) {
			return throwInvalidValueException(e, EvaluatorMessages.InvalidReal, aValue);
		}
	}
	
	public StringValue stringValueOf(String value) {
		return new StringValueImpl(this, standardLibrary.getStringType(), value);
	}

	public InvalidValue throwInvalidValueException(String message, Object... bindings) throws InvalidValueException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidValueException(boundMessage);
	}

	public InvalidValue throwInvalidValueException(Throwable e, String message, Object... bindings) throws InvalidValueException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidValueException(boundMessage, e);
	}
	
//	@Override
//	public String toString() {
//		return "ValueFactory : " + name;
//	}

	public Value valueOf(Object object) {
		if (object instanceof Value) {
			return (Value) object;
		}
		if (object instanceof Number) {
			if ((object instanceof Integer) || (object instanceof Long) || (object instanceof Short)) {
				return integerValueOf(((Number) object).longValue());
			}
			if ((object instanceof Float) || (object instanceof Double)) {
				return realValueOf(((Number) object).doubleValue());
			}
			if (object instanceof BigDecimal) {
				return realValueOf((BigDecimal) object);
			}
			if (object instanceof BigInteger) {
				return integerValueOf((BigInteger) object);
			}			
		}
		if (object instanceof String) {
			return stringValueOf((String) object);
		}
		if (object instanceof Boolean) {
			return booleanValueOf((Boolean) object);
		}
		if (object instanceof DomainElement) {
			if (object instanceof DomainClassifierType) {
				return createTypeValue((DomainClassifierType) object);
			}
			return createElementValue((DomainElement) object);
		}
		if (object == null) {
			return getNull();
		}
		if (object.getClass().isArray()) {
			try {
//				int length = Array.getLength(object);
//				List<Value> values = new ArrayList<Value>();
//				for (int i = 0; i < length; i++) {
//					Value v = valueOf(Array.get(object, i));
//					values.add(v);
//				}
				return createSequenceOf((Object[])object);
			} 
			catch (IllegalArgumentException e) {}
		}
		if (object instanceof Iterable<?>) {
			if ((object instanceof LinkedHashSet) || (object instanceof OrderedSet)) {
				return createOrderedSetOf((Iterable<?>)object);
			}
			else if (object instanceof Bag) {
				return createBagOf((Iterable<?>)object);
			}
			else if (object instanceof Set) {
				return createSetOf((Iterable<?>)object);
			}
			else {
				return createSequenceOf((Iterable<?>)object);
			}
		}
		return null;
	}

	public Value valueOf(Object eValue, ETypedElement eFeature) {
		if (eFeature.isMany()) {
			Collection<?> eValues = (Collection<?>) eValue;
			ArrayList<Value> values = new ArrayList<Value>(eValues.size());
			for (Object eVal : eValues) {
				values.add(valueOf(eVal));
			}
			boolean isOrdered = eFeature.isOrdered();
			boolean isUnique = eFeature.isUnique();
			return createCollectionValue(isOrdered, isUnique, values);
		}
		else if (eValue instanceof Value) {
			return (Value) eValue;		
		}
		else {
			return valueOf(eValue);
		}
	}
}
 