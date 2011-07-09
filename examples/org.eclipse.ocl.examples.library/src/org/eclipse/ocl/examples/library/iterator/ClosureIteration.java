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
 * $Id: ClosureIteration.java,v 1.7 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.IterationManager;
import org.eclipse.ocl.examples.domain.library.LibraryValidator;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * ClosureIteration realizes the Collection::closure() library iteration.
 * 
 */
public class ClosureIteration extends AbstractIteration<CollectionValue.Accumulator>
{
	public static final ClosureIteration INSTANCE = new ClosureIteration();
	private static LibraryValidator validator = null; 

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, CollectionValue sourceVal, DomainExpression body, DomainTypedElement... iterators) {
		CollectionValue.Accumulator accumulatorValue = createAccumulationValue(evaluator, returnType);
		return evaluateIteration(new IterationManager<CollectionValue.Accumulator>(evaluator,
				body, sourceVal, accumulatorValue, iterators));
	}

	/**
	 * Recursively evaluates the iterator body expression.
	 */
    @Override
	protected Value updateAccumulator(IterationManager<CollectionValue.Accumulator> iterationManager) {
		CollectionValue.Accumulator accumulatorValue = iterationManager.getAccumulatorValue();
		if (!iterationManager.isOuterIteration()) {
			// If there is the parent is the iterator
			Value value = iterationManager.get(0);
			if (!accumulatorValue.add(value)) {
				return accumulatorValue;
			}
		}
		Value bodyVal = iterationManager.getBodyValue();		
		if (bodyVal.isInvalid()) {
			return bodyVal;									// Invalid body is invalid
		}
		else if (bodyVal.isUndefined()) {
			return accumulatorValue;						// Null body is termination
		}
		else {
			try {
				evaluateIteration(new IterationManager<CollectionValue.Accumulator>(iterationManager, bodyVal));
			} catch (InvalidValueException e) {
				iterationManager.throwInvalidEvaluation(e);
			}
			return null;
		}
	}

	@Override
	public LibraryValidator getValidator(DomainStandardLibrary standardLibrary) {
		if (validator == null) {
			validator = getLibraryValidator(standardLibrary, "org.eclipse.ocl.examples.pivot.library.validators.ValidateClosureIteration"); //$NON-NLS-1$
		}
		return validator;
	}
}
