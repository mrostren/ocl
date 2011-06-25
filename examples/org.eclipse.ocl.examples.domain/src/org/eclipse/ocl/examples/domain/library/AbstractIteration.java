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
 * $Id: AbstractIteration.java,v 1.4 2011/02/21 08:37:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.library;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.BagValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.OrderedSetValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.SequenceValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.SetValueImpl;

/**
 * AbstractIteration realises shared characteristics of library iterations.
 */
public abstract class AbstractIteration<ACC extends Value> extends AbstractFeature implements LibraryIteration
{
	protected CollectionValue.Accumulator createAccumulationValue(DomainEvaluator evaluator, DomainType type) {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		if (type instanceof DomainCollectionType) {
			DomainCollectionType collectionValueType = (DomainCollectionType)type;
			boolean isOrdered = standardLibrary.isOrdered(collectionValueType);
			boolean isUnique = standardLibrary.isUnique(collectionValueType);
			if (isOrdered) {
				if (isUnique) {
					return new OrderedSetValueImpl.Accumulator(valueFactory, collectionValueType);
				}
				else {
					return new SequenceValueImpl.Accumulator(valueFactory, collectionValueType);
				}
			}
			else {
				if (isUnique) {
					return new SetValueImpl.Accumulator(valueFactory, collectionValueType);
				}
				else {
					return new BagValueImpl.Accumulator(valueFactory, collectionValueType);
				}
			}
		}
		else {
			return new SetValueImpl.Accumulator(valueFactory, standardLibrary.getSetType(type));		// WIP used by "any"
		}
	}
	
	protected Value evaluateIteration(IterationManager<ACC> iterationManager) {
		for ( ; iterationManager.hasCurrent(); iterationManager.advance()) {
			// evaluate the body of the expression in the nested environment
			Value resultVal = updateAccumulator(iterationManager);
			if (resultVal != null) {
				return resultVal;
			}
		}
		return resolveTerminalValue(iterationManager);			
	}


	/**
	 * Return the value appropriate to an iteration over all the source elements. The
	 * default implementation just returns the accumulator. Derived iterations should
	 * override.
	 * 
	 * @param iterationManager the iteration context
	 * @return
	 * @throws InvalidEvaluationException 
	 */
	protected Value resolveTerminalValue(IterationManager<ACC> iterationManager) {
		return iterationManager.getAccumulatorValue();		// FIXME is this safe
	}
	
	/**
	 * Update the accumulatorValue with the bodyValue resulting from the current iteration
	 * for which the iterators define the context in the environment.
	 * 
	 * @param iterationManager the iteration context
	 * @return non-null premature result of iteration, or null if complete
	 * @throws InvalidEvaluationException 
	 */
	protected abstract Value updateAccumulator(IterationManager<ACC> iterationManager);
}
