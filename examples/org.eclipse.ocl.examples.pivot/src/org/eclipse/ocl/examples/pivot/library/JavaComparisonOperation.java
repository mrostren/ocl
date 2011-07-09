/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: JavaComparisonOperation.java,v 1.3 2011/05/07 16:41:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.library;

import java.lang.reflect.Method;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.osgi.util.NLS;

public abstract class JavaComparisonOperation extends AbstractBinaryOperation
{
	protected final Method method;
	
	public JavaComparisonOperation(Method method) {
		this.method = method;
	}

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value leftValue, Value rightValue) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		Object leftObject = leftValue.asObject();
		Object rightObject = rightValue.asObject();
		try {
			Object result = method.invoke(leftObject, rightObject);
			if (!(result instanceof Integer)) {
				return throwInvalidValueException(EvaluatorMessages.TypedResultRequired, "Integer");
			}
			return valueFactory.booleanValueOf(evaluateComparison((Integer) result));
		} catch (Exception e) {
			throw new InvalidValueException(e);
		}
	}

	protected abstract boolean evaluateComparison(Integer result);

	protected Value throwInvalidValueException(String message, Object... bindings) throws InvalidValueException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidValueException(boundMessage);
	}
}