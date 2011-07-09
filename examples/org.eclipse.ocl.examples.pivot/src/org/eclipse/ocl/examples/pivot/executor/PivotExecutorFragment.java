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
package org.eclipse.ocl.examples.pivot.executor;

import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;

public class PivotExecutorFragment extends ExecutorFragment
{
	protected final org.eclipse.ocl.examples.pivot.Class pivotClass;

	public PivotExecutorFragment(PivotExecutorClass derivedEvaluationClass, PivotExecutorClass baseEvaluationClass, PivotExecutorOperation[] operations, ExecutorProperty[] properties, org.eclipse.ocl.examples.pivot.Class pivotClass) {
		super(derivedEvaluationClass, baseEvaluationClass, operations, properties);
		this.pivotClass = pivotClass;		
	}
	
	public final org.eclipse.ocl.examples.pivot.Class getPivotClass() {
		return pivotClass;
	}
}