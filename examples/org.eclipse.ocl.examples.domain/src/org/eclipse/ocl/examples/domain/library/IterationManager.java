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
 * $Id: IterationManager.java,v 1.5 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.library;

import java.util.Iterator;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainVariableDeclaration;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluationEnvironment;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.osgi.util.NLS;

public class IterationManager<ACC extends Value>
{
	private static class ValueIterator
	{		// FIXME Make this a delegating value so that evalEnv can update in place
		private final DomainEvaluator evaluator;
		private final CollectionValue collectionValue;
		private final DomainVariableDeclaration variable;
		private Iterator<Value> javaIter;
		private Value value = null;

		public ValueIterator(DomainEvaluator evaluator, CollectionValue collectionValue, DomainVariableDeclaration variable) {
			this.evaluator = evaluator;
			this.collectionValue = collectionValue;
			this.variable = variable;
			reset();
		}
		
		public Value get() {
			return value;
		}

		public boolean hasCurrent() {
			return value != null;
		}
		
		public Value next() {
			if (!javaIter.hasNext()) {
				value = null;
			}
			else {
				value = javaIter.next();
				evaluator.getEvaluationEnvironment().replace(variable, value);
//				System.out.println(name + " = " + value);
			}
			return value;
		}

		public Value reset() {
			javaIter = collectionValue.iterator();
			return next();
		}
	}

	protected static ValueIterator[] createIterators(DomainVariableDeclaration[] referredIterators, DomainEvaluator evaluator, CollectionValue collectionValue) {
		int iMax = referredIterators.length;
		ValueIterator[] iterators = new ValueIterator[iMax];
		for (int i = 0; i < iMax; i++) {
			DomainVariableDeclaration referredIterator = referredIterators[i];
			iterators[i] = new ValueIterator(evaluator, collectionValue, referredIterator);
		}
		return iterators;
	}
	
	private final int depth;
	private final DomainEvaluator evaluator;
	private final CollectionValue collectionValue;
	private final DomainExpression body;
	private ACC accumulatorValue;
	private final DomainVariableDeclaration accumulatorVariable;
	private final DomainVariableDeclaration[] referredIterators;
	private final ValueIterator[] iterators;
	
	public IterationManager(DomainEvaluator evaluator, DomainExpression body, CollectionValue collectionValue, ACC accumulatorValue, DomainVariableDeclaration... iterators) {
		this.depth = 0;
		this.evaluator = evaluator.createNestedEvaluator();
		this.collectionValue = collectionValue;
		this.body = body;
		this.accumulatorValue = accumulatorValue;
		this.accumulatorVariable = null;
		this.referredIterators = iterators;
		this.iterators = createIterators(referredIterators, this.evaluator, collectionValue);
	}
	
	public IterationManager(DomainEvaluator evaluator, DomainExpression body, CollectionValue collectionValue, DomainVariableDeclaration accumulator, ACC accumulatorValue, DomainVariableDeclaration... iterators) {
		this.depth = 0;
		this.evaluator = evaluator.createNestedEvaluator();
		this.collectionValue = collectionValue;
		this.body = body;
		this.accumulatorValue = accumulatorValue;
		this.accumulatorVariable = accumulator;
		getEvaluationEnvironment().add(accumulatorVariable, accumulatorValue);
		this.referredIterators = iterators;
		this.iterators = createIterators(referredIterators, evaluator, collectionValue);
	}

	public IterationManager(IterationManager<ACC> iterationManager, Value value) throws InvalidValueException {
		this.depth = iterationManager.depth+1;
		this.evaluator = iterationManager.evaluator;
		this.body = iterationManager.body;
		if (value instanceof CollectionValue) {
			this.collectionValue = (CollectionValue) value;
		}
		else {
			ValueFactory valueFactory = getValueFactory();
			this.collectionValue = valueFactory.createSequenceValue(valueFactory.getStandardLibrary().getSequenceType(value.getType()), value);
		}
		this.accumulatorValue = iterationManager.accumulatorValue;
		this.accumulatorVariable = iterationManager.accumulatorVariable;
		this.referredIterators = iterationManager.referredIterators;
		this.iterators = createIterators(referredIterators, evaluator, collectionValue);
	}
	
	public void advance() {			
		int curr = getNextUnfinishedIterator();				
		for (int i = 0; i < iterators.length; i++) {
			ValueIterator iterator = iterators[i];			
			if (i < curr) {
				iterator.reset();
			}
			else if (i == curr) {
				iterator.next();
			}
			else {
				iterator.get();
			}
		}
	}

//	public InvalidValue createInvalidValue(String string) {
//		return evaluationVisitor.getValueFactory().createInvalidValue(string);
//	}

	public Value get(int i) {
		return iterators[i].get();		
	}

	public ACC getAccumulatorValue() {
		return accumulatorValue;
	}

	public Value getBodyValue() {
		return evaluator.evaluate(body);
	}
	
	public CollectionValue getCollectionValue() {
		return collectionValue;
	}

	public DomainEvaluationEnvironment getEvaluationEnvironment() {
		return evaluator.getEvaluationEnvironment();
	}

	public Value getFalse() {
		return getValueFactory().getFalse();
	}
	
	private int getNextUnfinishedIterator() {
		int curr;
		int numIters = iterators.length;
		for (curr = 0; curr < numIters; curr++)
			if (iterators[curr].hasCurrent())
				break;
		return curr;
	}

	public Value getTrue() {
		return getValueFactory().getTrue();
	}

	public ValueFactory getValueFactory() {
		return evaluator.getValueFactory();
	}
	
	public boolean hasCurrent() {
		int curr = getNextUnfinishedIterator();				
		return curr < iterators.length;
	}
	
	public boolean isOuterIteration() {
		return depth == 0;
	}

	/**
	 * Associate a new value with the accumulator.
	 * <p>
	 * This is only used by an "iterate" where the accumulator takes on arbitrary
	 * values. Other iterations have an updating accumulator value.
	 * 
	 * @param accumulatorValue
	 */
	public void replaceAccumulator(ACC accumulatorValue) {
		this.accumulatorValue = accumulatorValue;
		if (accumulatorVariable != null) {
			getEvaluationEnvironment().replace(accumulatorVariable, accumulatorValue);
		}
	}

	@Override
	public String toString() {
//		return body.eContainer().toString();
		return body.toString();
	}

	public NullValue throwInvalidEvaluation(String message, Object... bindings) throws InvalidEvaluationException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidEvaluationException(getEvaluationEnvironment(), boundMessage, null, null, null);
	}

	public NullValue throwInvalidEvaluation(InvalidValueException e) {
		return evaluator.throwInvalidEvaluation(e);
	}
}