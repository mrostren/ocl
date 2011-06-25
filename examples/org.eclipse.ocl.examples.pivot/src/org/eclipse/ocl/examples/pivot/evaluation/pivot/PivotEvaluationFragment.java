package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import org.eclipse.ocl.examples.pivot.evaluation.EvaluationFragment;

public class PivotEvaluationFragment extends EvaluationFragment
{
	protected final org.eclipse.ocl.examples.pivot.Class pivotClass;

	public PivotEvaluationFragment(PivotEvaluationClass evaluationClass, PivotEvaluationOperation[] operations, org.eclipse.ocl.examples.pivot.Class pivotClass) {
		super(evaluationClass, operations);
		this.pivotClass = pivotClass;		
	}
	
	public final org.eclipse.ocl.examples.pivot.Class getPivotClass() {
		return pivotClass;
	}
}