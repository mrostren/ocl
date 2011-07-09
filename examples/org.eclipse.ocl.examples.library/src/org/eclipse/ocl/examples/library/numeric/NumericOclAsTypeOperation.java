/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: NumericOclAsTypeOperation.java,v 1.6 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.RealValue;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;

/**
 * NumericOclAsTypeOperation realises the Real::oclAsType() library operation.
 * 
 */
public class NumericOclAsTypeOperation extends OclAnyOclAsTypeOperation
{
	public static final NumericOclAsTypeOperation INSTANCE = new NumericOclAsTypeOperation();

	@Override
	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal, Value argVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		DomainType sourceType = sourceVal.getType();
		if (sourceType == null) {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.MissingSourceType);
		}
		TypeValue typeVal = argVal.asTypeValue();
		DomainType argType = typeVal.getInstanceType();
		if (valueFactory.conformsTo(sourceType, argType)) {
			if (sourceVal.isUnlimited() && ((argType == standardLibrary.getIntegerType()) || (argType == standardLibrary.getRealType()))) {
				return valueFactory.throwInvalidValueException(EvaluatorMessages.NonFiniteIntegerValue);
			}
			else if ((sourceVal instanceof IntegerValue) && (argType == standardLibrary.getRealType())) {
				return ((IntegerValue)sourceVal).toRealValue();
			}
			else {
				return sourceVal;
			}
		}
		else {
			RealValue realValue = sourceVal.asRealValue();
			if (realValue != null) {
				if (argType == standardLibrary.getUnlimitedNaturalType()) {
					if (realValue.signum() < 0) {
						return valueFactory.throwInvalidValueException(EvaluatorMessages.NonPositiveUnlimitedNaturalValue);
					}
					return realValue.toIntegerValue();
				}
				else if (argType == standardLibrary.getIntegerType()) {
					return realValue.toIntegerValue();
				}
				else {
					return valueFactory.throwInvalidValueException(EvaluatorMessages.IncompatibleArgumentType, argType);
				}
			}
			IntegerValue integerValue = sourceVal.asIntegerValue();
			if (integerValue != null) {
				if (argType == standardLibrary.getUnlimitedNaturalType()) {
					if (integerValue.signum() < 0) {
						return valueFactory.throwInvalidValueException(EvaluatorMessages.NonPositiveUnlimitedNaturalValue);
					}
					return integerValue;
				}
			}
			return valueFactory.throwInvalidValueException(EvaluatorMessages.UnknownSourceType);
		}
	}
}
