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
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluationEnvironment;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluationVisitor;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;

public abstract class ExecutorManager implements DomainEvaluator
{	
	protected final ExecutorValueFactory valueFactory;
	
	public ExecutorManager(ExecutorValueFactory valueFactory) {
		this.valueFactory = valueFactory;
	}

	public ExecutorValueFactory getValueFactory() {
		return valueFactory;
	}
	
	public ExecutorType typeOf(Value value, Value... values) {
		ExecutorType type = (ExecutorType) value.getType();
		for (Value anotherValue : values) {
			ExecutorType anotherType = (ExecutorType) anotherValue.getType();
			type = type.getCommonType(anotherType, valueFactory);
		}
		return type;
	}

	public Value evaluate(DomainElement body) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainEvaluationEnvironment getEvaluationEnvironment() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainEvaluationVisitor getEvaluationVisitor() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainModelManager getModelManager() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public NullValue throwInvalidEvaluation(InvalidValueException e)
			throws InvalidEvaluationException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public NullValue throwInvalidEvaluation(Throwable e,
			DomainExpression expression, Object context, String message,
			Object... bindings)
			throws InvalidEvaluationException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}
