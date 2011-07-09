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
 * $Id: AnyIteration.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.IterationManager;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue.Accumulator;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * AnyIteration realises the Collection::any() library iteration.
 * 
 */
public class AnyIteration extends AbstractIteration<CollectionValue.Accumulator>
{
	public static final AnyIteration INSTANCE = new AnyIteration();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, CollectionValue sourceVal, DomainExpression body, DomainTypedElement... iterators) {
		Accumulator accumulatorValue = createAccumulationValue(evaluator, returnType);
		return evaluateIteration(new IterationManager<CollectionValue.Accumulator>(evaluator,
				body, sourceVal, accumulatorValue, iterators));
	}
	
	@Override
	protected Value resolveTerminalValue(IterationManager<CollectionValue.Accumulator> iterationManager) {
		CollectionValue.Accumulator accumulatorValue = iterationManager.getAccumulatorValue();
		if (accumulatorValue.intSize() > 0) {
			return accumulatorValue.asList().get(0);		// Normal something found result.
		}
		else {
			return iterationManager.getValueFactory().getNull();
		}
	}
	
	@Override
    protected Value updateAccumulator(IterationManager<CollectionValue.Accumulator> iterationManager) {
		CollectionValue.Accumulator accumulatorValue = iterationManager.getAccumulatorValue();
		Value bodyVal = iterationManager.getBodyValue();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "any"); 	// Null body is invalid //$NON-NLS-1$
		}
		else if (bodyVal.isFalse()) {
			return null;									// Carry on for nothing found
		}
		else if (accumulatorValue.intSize() > 0) {
			return iterationManager.getFalse();				// Abort after second find
		}
		else {
			// should be exactly one iterator
			Value value = iterationManager.get(0);		
			accumulatorValue.add(value);
			return null;									// Carry on after first find
		}
	}
}
