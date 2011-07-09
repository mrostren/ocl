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

public class ExecutorFragment
{
	public final ExecutorClass derivedEvaluationClass;
	public final ExecutorClass baseEvaluationClass;
	public ExecutorOperation[] operations;
	public ExecutorProperty[] properties;

	public ExecutorFragment(ExecutorClass derivedEvaluationClass, ExecutorClass baseEvaluationClass, ExecutorOperation[] operations, ExecutorProperty[] properties) {
		this.derivedEvaluationClass = derivedEvaluationClass;
		this.baseEvaluationClass = baseEvaluationClass;
		this.operations = operations;
		this.properties = properties;
	}

	public void initOperations(ExecutorOperation[] operations) {
		assert this.operations == null;
		this.operations = operations;
	}

	public void initProperties(ExecutorProperty[] properties) {
		assert this.properties == null;
		this.properties = properties;
	}

	@Override
	public String toString() {
		return derivedEvaluationClass.getName() + "__" + baseEvaluationClass.getName(); //$NON-NLS-1$
	}
}