/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: MultipleContinuation.java,v 1.1.2.2 2011/01/07 12:13:17 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.NamedElement;

public abstract class MultipleContinuation<T extends EObject> extends BasicContinuation<List<? extends T>>
{
	public MultipleContinuation(CS2PivotConversion context,
			NamedElement pivotParent, EStructuralFeature pivotFeature,
			List<? extends T> csElements, Dependency... dependencies) {
		super(context, pivotParent, pivotFeature, csElements, dependencies);
	}
}