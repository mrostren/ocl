package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationManager;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;



public class PivotEvaluationManager extends EvaluationManager
{
	protected final TypeManager typeManager;
	
	public PivotEvaluationManager(String name, TypeManager typeManager) {
		super(name);
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
	
	protected PivotEvaluationClass[] computeClasses(PivotEvaluationManager dispatcher, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		List<Type> ownedTypes = pivotPackage.getOwnedTypes();
		PivotEvaluationClass[] classes = new PivotEvaluationClass[ownedTypes.size()];
		for (int i = 0; i < classes.length; i++) {
			org.eclipse.ocl.examples.pivot.Class pivotClass = (org.eclipse.ocl.examples.pivot.Class) ownedTypes.get(i);
			classes[i] = new PivotEvaluationClass(computeFragments(pivotClass), pivotClass);
		}
		return null;
	}
	
	protected PivotEvaluationFragment[] computeFragments(org.eclipse.ocl.examples.pivot.Class pivotClass) {
		List<List<org.eclipse.ocl.examples.pivot.Class>> bases = new ArrayList<List<org.eclipse.ocl.examples.pivot.Class>>();
		computeBases(bases, pivotClass);
		int numFragments = 0;
		for (List<org.eclipse.ocl.examples.pivot.Class> equiDepthBases : bases) {
			numFragments += equiDepthBases.size();
		}
		PivotEvaluationFragment[] fragments = new PivotEvaluationFragment[numFragments];
		numFragments = 0;
		for (List<org.eclipse.ocl.examples.pivot.Class> equiDepthBases : bases) {
			for (org.eclipse.ocl.examples.pivot.Class  base : equiDepthBases) {
				fragments[numFragments++] = new PivotEvaluationFragment(getClassTable(base), computeOperations(base), base);
			}
		}
		return fragments;
	}

	protected PivotEvaluationOperation[] computeOperations(org.eclipse.ocl.examples.pivot.Class pivotClass) {
		List<Operation> ownedOperations = pivotClass.getOwnedOperations();
		PivotEvaluationOperation[] operations = new PivotEvaluationOperation[ownedOperations.size()];
		for (int i = 0; i < ownedOperations.size(); i++) {
			operations[i] = new PivotEvaluationOperation(ownedOperations.get(i));
		}
		return operations;
	}


	public PivotEvaluationClass getClassTable(org.eclipse.ocl.examples.pivot.Class pivotClass) {
		// TODO Auto-generated method stub
		return null;
	}
}