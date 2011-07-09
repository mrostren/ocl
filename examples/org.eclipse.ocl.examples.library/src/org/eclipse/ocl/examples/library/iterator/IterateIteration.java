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
 * $Id: IterateIteration.java,v 1.5 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIterate;
import org.eclipse.ocl.examples.domain.library.IterationManager;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * IsUniqueIteration realizes the Collection::isUnique() library iteration.
 * 
 */
public class IterateIteration extends AbstractIterate<Value>
{
	public static final IterateIteration INSTANCE = new IterateIteration();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, CollectionValue sourceVal, DomainTypedElement accumulator, Value initValue, DomainExpression body, DomainTypedElement... iterators) throws InvalidValueException {
		return evaluateIteration(new IterationManager<Value>(evaluator, body, sourceVal, accumulator, initValue, iterators));
	}

	@Override
    protected Value updateAccumulator(IterationManager<Value> iterationManager) {
		Value bodyVal = iterationManager.getBodyValue();		
		iterationManager.replaceAccumulator(bodyVal);		
		return null;					// carry on
	}
}
