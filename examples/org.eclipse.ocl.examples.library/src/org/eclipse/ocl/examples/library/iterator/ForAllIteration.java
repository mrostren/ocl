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
 * $Id: ForAllIteration.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainCallExp;
import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainVariableDeclaration;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.IterationManager;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * ForAllIteration realises the Collection::forAll() library iteration.
 * 
 */
public class ForAllIteration extends AbstractIteration<CollectionValue.Accumulator>
{
	public static final ForAllIteration INSTANCE = new ForAllIteration();

	public Value evaluate(DomainEvaluator evaluator, DomainCallExp callExp, CollectionValue sourceVal, DomainExpression body, DomainVariableDeclaration... iterators) {
		CollectionValue.Accumulator accumulatorValue = createAccumulationValue(evaluator, callExp.getType());
		return evaluateIteration(new IterationManager<CollectionValue.Accumulator>(evaluator,
				body, sourceVal, accumulatorValue, iterators));
	}
	
	@Override
	protected Value resolveTerminalValue(IterationManager<CollectionValue.Accumulator> iterationManager) {
		return iterationManager.getTrue();
	}

	@Override
    protected Value updateAccumulator(IterationManager<CollectionValue.Accumulator> iterationManager) {
		Value bodyVal = iterationManager.getBodyValue();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "forAll"); 	// Null body is invalid //$NON-NLS-1$
		}
		else if (bodyVal.isTrue()) {
			return null;							// Carry on for nothing found
		}
		else {
			return iterationManager.getFalse();			// Abort after a fail
		}
	}
}
