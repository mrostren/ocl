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
 * $Id: CollectNestedIteration.java,v 1.4 2011/02/21 08:37:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.IterationManager;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * CollectNestedIteration realises the Collection::collectNested() library iteration.
 * 
 */
public class CollectNestedIteration extends AbstractIteration<CollectionValue.Accumulator>
{
	public static final CollectNestedIteration INSTANCE = new CollectNestedIteration();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, CollectionValue sourceVal, DomainExpression body, DomainTypedElement... iterators) {
		CollectionValue.Accumulator accumulatorValue = createAccumulationValue(evaluator, returnType);
		return evaluateIteration(new IterationManager<CollectionValue.Accumulator>(evaluator,
				body, sourceVal, accumulatorValue, iterators));
	}

	@Override
    protected Value updateAccumulator(IterationManager<CollectionValue.Accumulator> iterationManager) {
		CollectionValue.Accumulator accumulatorValue = iterationManager.getAccumulatorValue();
		Value bodyVal = iterationManager.getBodyValue();		
		accumulatorValue.add(bodyVal);
		return null;								// Carry on
	}
}
