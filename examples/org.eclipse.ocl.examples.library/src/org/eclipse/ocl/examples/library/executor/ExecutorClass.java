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

import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.DomainClassifierType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class ExecutorClass extends ExecutorType implements DomainClassifierType
{
	protected final String name;
	protected final ExecutorPackage evaluationPackage;

	private Integer[] indexes;			// Index in fragments to first super-class of given depth (OclAny is depth 0)
										//  extra final entry points beyond fragments
	private ExecutorFragment[] fragments;	// OclAny-first, self-last list of super-classes sorted by inheritance depth
	
	public ExecutorClass(String name, ExecutorPackage evaluationPackage, ExecutorFragment[] fragments, int[] depthCounts) {
		this.name = name;
		this.evaluationPackage = evaluationPackage;
		this.fragments = null;
		initFragments(fragments, depthCounts);
	}

	@Override
	public ExecutorType getCommonType(DomainType type, ValueFactory valueFactory) {
		if (!(type instanceof ExecutorClass)) {
			return getOclAnyType(valueFactory);
		}
		ExecutorClass thatClass = (ExecutorClass) type;
		for (int staticDepth = Math.min(indexes.length-1, thatClass.indexes.length-1);
				staticDepth > 0; staticDepth--) {
			int iMax = indexes[staticDepth];
			int jMax = thatClass.indexes[staticDepth];
			for (int i = indexes[staticDepth-1]; i < iMax; i++) {
				ExecutorClass thisTable = fragments[i].baseEvaluationClass;
				for (int j = thatClass.indexes[staticDepth-1]; j < jMax; j++) {
					ExecutorClass thatTable = thatClass.fragments[i].baseEvaluationClass;
					if (thisTable == thatTable) {
						return thisTable;
					}
				}
			}
		}
		return fragments[0].baseEvaluationClass;	// Always OclAny at index 0
	}

	public final int getDepth() {
		return indexes.length-1;
	}
	
	public final ExecutorPackage getEvaluationPackage() {
		return evaluationPackage;
	}

	public DomainType getInstanceType() {
		throw new UnsupportedOperationException();		// WIP
	}

	public final String getName() {
		return name;
	}

	public void initFragments(ExecutorFragment[] fragments, int[] depthCounts) {
		assert this.fragments == null;
		this.fragments = fragments;
		if (fragments != null) {
			this.indexes = new Integer[depthCounts.length+1];
			this.indexes[0] = 0;
			for (int i = 0; i <  depthCounts.length; i++) {
				this.indexes[i+1] = this.indexes[i] + depthCounts[i];
			}
/*			int maxDepth = fragments[fragments.length-1].evaluationClass.indexes.length;
			indexes = new Integer[maxDepth];
			int knownDepth = -1;
			for (int i = 0; i < fragments.length; i++) {
				int depth = fragments[i].evaluationClass.indexes.length;
				if (depth != knownDepth) {
					assert depth == knownDepth+1;
					knownDepth = depth;
					indexes[knownDepth] = i;
				}
			} */
		}
	}
	
	/**
	 * Return true if this EvaluationClass is or is derived from thatEvaluationClass.
	 */
	public boolean isKindOf(ExecutorClass thatEvaluationClass) {
		int staticDepth = thatEvaluationClass.indexes.length;
		if (staticDepth < indexes.length) {
			int iMax = indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				if (fragments[i].baseEvaluationClass == thatEvaluationClass) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public LibraryFeature lookupImplementation(ExecutorOperation staticOperation) {
		ExecutorClass staticClass = staticOperation.evaluationClass;
		int staticDepth = staticClass.indexes.length;
		int iMax = indexes[staticDepth-1];
		for (int i = indexes[staticDepth-2]; i < iMax; i++) {
			if (fragments[i].baseEvaluationClass == staticClass) {
				return fragments[i].operations[staticOperation.operationIndex].implementation;
			}
		}
		return null;
	}

	public ExecutorOperation lookupOperation(ExecutorOperation staticOperation) {
		ExecutorClass staticClass = staticOperation.evaluationClass;
		int staticDepth = staticClass.indexes.length;
		int iMax = indexes[staticDepth+1];
		for (int i = indexes[staticDepth]; i < iMax; i++) {
			if (fragments[i].baseEvaluationClass == staticClass) {
				return fragments[i].operations[staticOperation.operationIndex];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return evaluationPackage.toString() + "::" + name; //$NON-NLS-1$
	}
}