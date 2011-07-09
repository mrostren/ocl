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
 * $Id: SortedByIteration.java,v 1.9 2011/05/20 15:26:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.IterationManager;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryValidator;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValue;

/**
 * SelectIteration realises the Collection::sortedBy() library iteration.
 * 
 */
public class SortedByIteration extends AbstractIteration<SortedByIteration.SortingValue>
{
	protected static class SortingValue extends AbstractValue implements Comparator<Value>
	{
		private final DomainEvaluator evaluator;
		private final Map<Value, Value> content = new HashMap<Value, Value>();	// User object to sortedBy value
		private final DomainType sourceType;
		private final DomainType returnType;
		private final LibraryBinaryOperation binaryImplementation;

		public SortingValue(DomainEvaluator evaluator, Value sourceVal, DomainType returnType, LibraryBinaryOperation binaryImplementation) {
			super(evaluator.getValueFactory(), returnType);
			this.evaluator = evaluator;
			this.sourceType = sourceVal.getType();
			this.returnType = returnType;
			this.binaryImplementation = binaryImplementation;
		}

		public Object asObject() {
			return content;
		}

		public Value asValidValue() {
			return this;
		}
		
		public int compare(Value o1, Value o2) {
			if (o1 == o2) {
				return 0;
			}
			Value v1 = content.get(o1);
			Value v2 = content.get(o2);
			if (v1 == v2) {
				return 0;
			}
			try {
				BooleanValue lessThan = binaryImplementation.evaluate(evaluator, returnType, v1, v2).asBooleanValue();
				if (lessThan.isTrue()) {
					return -1;
				}
				BooleanValue greaterThan = binaryImplementation.evaluate(evaluator, returnType, v2, v1).asBooleanValue();
				if (greaterThan.isTrue()) {
					return 1;
				}
				return 0;
			} catch (InvalidValueException e) {
	//			evaluationEnvironment.throwInvalidEvaluation("'<' evaluation failed", e);
				evaluator.throwInvalidEvaluation(e);
				return 0;
			}
		}

		public Value createSortedValue() {
			List<Value> result = new ArrayList<Value>(content.keySet());
	//		try {
				Collections.sort(result, this);
	//		}
	//		catch (WrappedInvalidValueException e) {
//	//			evaluationEnvironment.throwInvalidEvaluation(sourceVal, iteratorExp, "'<' evaluation failed", e);
	//			evaluationEnvironment.throwInvalidEvaluation(e);
	//		}
	//		catch (Exception e) {
	//			evaluationEnvironment.throwInvalidEvaluation(sourceVal, iteratorExp, "'<' evaluation failed", e);
	//		}
			// create result from the sorted collection
			boolean isUnique = valueFactory.getStandardLibrary().isUnique((DomainCollectionType) sourceType);
			return valueFactory.createCollectionValue(true, isUnique, type, result);
		}

		public void put(Value iterVal, Value comparable) {
			content.put(iterVal, comparable);
		}

		@Override
		public String toString() {
			return content.toString();
		}
	}

	public static final SortedByIteration INSTANCE = new SortedByIteration();
	private static LibraryValidator validator = null; 

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, CollectionValue sourceVal, DomainExpression body, DomainTypedElement... iterators) {
		throw new UnsupportedOperationException();		// WIP
/*		EvaluationEnvironment evaluationEnvironment = (EvaluationEnvironment) evaluator.getEvaluationEnvironment();
		TypeManager typeManager = evaluationEnvironment.getTypeManager();
		DomainType staticValueType = PivotUtil.getBehavioralType((Type) body.getType());
//		CompleteType completeStaticValueType = completeManager.getCompleteType(staticValueType);
		Operation staticLessThanOperation = typeManager.resolveOperation(staticValueType, PivotConstants.LESS_THAN_OPERATOR, staticValueType);
		if (staticLessThanOperation == null) {
			return evaluator.throwInvalidEvaluation(null, body, sourceVal, EvaluatorMessages.UndefinedOperation, PivotConstants.LESS_THAN_OPERATOR);
		}
//		CompleteOperation staticCompleteOperation = typeManager.getCompleteOperation(staticLessThanOperation);
//		Type dynamicSourceType = sourceValue.getType(getStandardLibrary(), staticSourceType);
//		CompleteType dynamicCompleteType = completeManager.getCompleteType(dynamicSourceType);
//		CompleteOperation dynamicOperation = dynamicCompleteType.getDynamicOperation(staticCompleteOperation);
		LibraryFeature implementation = null;
		try {
			implementation = typeManager.getImplementation(staticLessThanOperation);
		} catch (Exception e) {
			evaluator.throwInvalidEvaluation(e, body, sourceVal, EvaluatorMessages.ImplementationClassLoadFailure, staticLessThanOperation.getImplementationClass());
		}
		if (implementation == null) {
			evaluator.throwInvalidEvaluation(null, body, sourceVal, EvaluatorMessages.ImplementationClassLoadFailure, staticLessThanOperation.getImplementationClass());
		}
		if (!(implementation instanceof LibraryBinaryOperation)) {
			evaluator.throwInvalidEvaluation(null, body, sourceVal, EvaluatorMessages.NonBinaryOperation, staticValueType, PivotConstants.LESS_THAN_OPERATOR);
		}
		LibraryBinaryOperation binaryImplementation = (LibraryBinaryOperation) implementation;
		SortingValue accumulatorValue = new SortingValue(evaluator, sourceVal, returnType, binaryImplementation);
//		IterationManager iterationManager = new IterationManager(evaluationVisitor, iteratorExp, (CollectionValue) sourceVal);
//		return evaluateIteration(iterationManager, accumulatorValue);
//		Accumulator accumulatorValue = createAccumulationValue(valueFactory, true, false);
		return evaluateIteration(new IterationManager<SortingValue>(evaluator, body, sourceVal, accumulatorValue, iterators));
*/	}
	
	@Override
	protected Value resolveTerminalValue(IterationManager<SortingValue> iterationManager) {
		SortingValue accumulatorValue = iterationManager.getAccumulatorValue();
		return accumulatorValue.createSortedValue();
	}

	@Override
    protected Value updateAccumulator(IterationManager<SortingValue> iterationManager) {
		SortingValue accumulatorValue = iterationManager.getAccumulatorValue();
		Value bodyVal = iterationManager.getBodyValue();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "sortedBy"); 	// Null body is invalid //$NON-NLS-1$
	}
		// must have exactly one iterator
		Value iterValue = iterationManager.get(0);
		accumulatorValue.put(iterValue, bodyVal);
		return null;										// Carry on
	}

	@Override
	public LibraryValidator getValidator(DomainStandardLibrary standardLibrary) {
		if (validator == null) {
			validator = getLibraryValidator(standardLibrary, "org.eclipse.ocl.examples.pivot.library.validators.ValidateSortedByIteration"); //$NON-NLS-1$
		}
		return validator;
	}
}
