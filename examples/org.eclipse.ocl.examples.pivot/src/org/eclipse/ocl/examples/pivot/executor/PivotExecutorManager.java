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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorValueFactory;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;

public class PivotExecutorManager extends ExecutorManager
{
	protected final TypeManager typeManager;
	
	public PivotExecutorManager(TypeManager typeManager) {
		super(new ExecutorValueFactory(typeManager));
		this.typeManager = typeManager;		
	}

	protected int computeBases(List<List<org.eclipse.ocl.examples.pivot.Class>> bases, org.eclipse.ocl.examples.pivot.Class pivotClass) {
		int depth;
		List<org.eclipse.ocl.examples.pivot.Class> superClasses = pivotClass.getSuperClasses();
		if (superClasses.size() > 0) {
			depth = Integer.MAX_VALUE;
			for (org.eclipse.ocl.examples.pivot.Class superClass : superClasses) {
				int superDepth = computeBases(bases, superClass);
				if (superDepth < depth) {
					depth = superDepth;
				}
			}
		}
		else {
			depth = 0;
		}
		List<org.eclipse.ocl.examples.pivot.Class> equiDepthBases;
		if (depth < bases.size()) {
			equiDepthBases = bases.get(depth);
		}
		else {
			assert depth == bases.size()+1;
			equiDepthBases = new ArrayList<org.eclipse.ocl.examples.pivot.Class>();
			bases.add(equiDepthBases);
		}
		equiDepthBases.add(pivotClass);
		return depth+1;
	}
	
	protected PivotExecutorClass[] computeClasses(PivotExecutorManager dispatcher, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		PivotExecutorPackage evaluationPackage = getEvaluationPackage(pivotPackage);
		List<Type> ownedTypes = pivotPackage.getOwnedTypes();
		PivotExecutorClass[] classes = new PivotExecutorClass[ownedTypes.size()];
		for (int i = 0; i < classes.length; i++) {
			org.eclipse.ocl.examples.pivot.Class pivotClass = (org.eclipse.ocl.examples.pivot.Class) ownedTypes.get(i);
			classes[i] = new PivotExecutorClass(evaluationPackage, computeFragments(pivotClass), pivotClass);
		}
		return null;
	}
	
	protected PivotExecutorFragment[] computeFragments(org.eclipse.ocl.examples.pivot.Class pivotClass) {
		List<List<org.eclipse.ocl.examples.pivot.Class>> bases = new ArrayList<List<org.eclipse.ocl.examples.pivot.Class>>();
		computeBases(bases, pivotClass);
		int numFragments = 0;
		for (List<org.eclipse.ocl.examples.pivot.Class> equiDepthBases : bases) {
			numFragments += equiDepthBases.size();
		}
		PivotExecutorFragment[] fragments = new PivotExecutorFragment[numFragments];
		numFragments = 0;
		for (List<org.eclipse.ocl.examples.pivot.Class> equiDepthBases : bases) {
			for (org.eclipse.ocl.examples.pivot.Class  base : equiDepthBases) {
				fragments[numFragments++] = new PivotExecutorFragment(getEvaluationClass(pivotClass), getEvaluationClass(base), computeOperations(base), computeProperties(base), base);
			}
		}
		return fragments;
	}

	protected PivotExecutorOperation[] computeOperations(org.eclipse.ocl.examples.pivot.Class pivotClass) {
		PivotExecutorClass evaluationClass = getEvaluationClass(pivotClass);
		List<Operation> ownedOperations = pivotClass.getOwnedOperations();
		PivotExecutorOperation[] operations = new PivotExecutorOperation[ownedOperations.size()];
		for (int i = 0; i < ownedOperations.size(); i++) {			
			Operation pivotOperation = ownedOperations.get(i);
			operations[i] = new PivotExecutorOperation(evaluationClass, i, pivotOperation);
		}
		return operations;
	}

	protected ExecutorProperty[] computeProperties(org.eclipse.ocl.examples.pivot.Class pivotClass) {
//		PivotExecutorClass evaluationClass = getEvaluationClass(pivotClass);
		List<Property> ownedProperties = pivotClass.getOwnedAttributes();
		ExecutorProperty[] properties = new ExecutorProperty[ownedProperties.size()];
//		for (int i = 0; i < ownedOperations.size(); i++) {			
//			Operation pivotOperation = ownedOperations.get(i);
//			operations[i] = new PivotEvaluationOperation(evaluationClass, i, pivotOperation);
//		}
		return properties;		// WIP FIXME
	}	

	public DomainEvaluator createNestedEvaluator() {
		return new PivotExecutorManager(typeManager);
	}

	public PivotExecutorClass getEvaluationClass(org.eclipse.ocl.examples.pivot.Class pivotClass) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public PivotExecutorPackage getEvaluationPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}