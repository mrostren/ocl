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
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AbstractFeature.java,v 1.1.2.1 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library.features;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.library.LibraryFeature;

/**
 * @since 3.0
 */
public abstract class AbstractFeature implements LibraryFeature
{
	public static BigDecimal bigDecimalValueOf(Object val) {
		if (val instanceof BigDecimal) {
			return (BigDecimal) val;
		}
		else if (val instanceof BigInteger) {
			return new BigDecimal((BigInteger)val);
		}
		else if (val instanceof Number) {
			return BigDecimal.valueOf(((Number)val).doubleValue());
		}
		else {
			return null;
		}
	}

	public static BigInteger bigIntegerValueOf(Object val) {
		if (val instanceof UnlimitedNaturalLiteralExp<?>) {
			val = ((UnlimitedNaturalLiteralExp<?>)val).getUnlimitedNaturalSymbol();
		}
		if (val instanceof BigInteger) {
			return (BigInteger) val;
		}
		else if (val instanceof Number) {
			return BigInteger.valueOf(((Number)val).longValue());
		}
		else {
			return null;
		}
	}

	public static Collection<?> convertToCollection(Object object) {
		if (isInvalid(object)) {
			return null;
		}
		else if (isNull(object)) {
			return null;
		}
		else if (object instanceof Collection<?>) {
			return (Collection<?>)object;
		}
		else {
//			Set<Object> sourceSet = CollectionUtil.createNewSet();
//			sourceSet.add(object);
			return null;
		}
	}

	public static<T>  T createInvalid(T invalid, String reason) {
		return invalid;
	}
	
	public static boolean isBoolean(Object value) {
		return value instanceof Boolean;
	}

	public static boolean isInteger(Object value) {
		return value instanceof BigInteger;
	}
	
	/**
	 * Convenience method to determine whether the specified value is the <tt>invalid</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	public static boolean isInvalid(Object value) {
		return (value == null) || 		// FIXME Deprecated null
			(value instanceof InvalidLiteralExp<?>);
	}

	/**
	 * Convenience method to determine whether the specified value is the <tt>null</tt>
     * or <tt>invalid</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	public static boolean isUndefined(Object value) {
		return (value == null) || 		// FIXME Deprecated null
		(value instanceof NullLiteralExp<?>) || 
		(value instanceof InvalidLiteralExp<?>);
	}
	
	/**
	 * Convenience method to determine whether the specified value is the <tt>null</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	public static boolean isNull(Object value) {
		return value instanceof NullLiteralExp<?>;
	}
	
	public static boolean isOrderedCollection(Object sourceVal) {
		return (sourceVal instanceof LinkedHashSet<?>) || (sourceVal instanceof List<?>);
	}

	public static boolean isString(Object value) {
		return (value instanceof String) || (value instanceof StringBuffer);
	}
	
	public static boolean isUnlimited(Object value) {
		return (value instanceof UnlimitedNaturalLiteralExp<?>) && ((UnlimitedNaturalLiteralExp<?>)value).isUnlimited();
	}

	public static boolean isUnlimited(BigInteger value) {
		return value.signum() < 0;
	}

	public static boolean isUnlimitedNatural(Object value) {
		return isUnlimited(value) || ((value instanceof BigInteger) && (((BigInteger)value).signum() >= 0));
	}
	
//	public String toString() {
//		Environment<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
//		UMLReflection<?, C, O, ?, ?, ?, ?, ?, ?, ?> reflection = environment.getUMLReflection();
//		return "::" + reflection.getName(operation);
//	}
}