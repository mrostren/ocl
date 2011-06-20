package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import org.eclipse.ocl.examples.pivot.evaluation.EvaluationClass;

public class PivotEvaluationClass extends EvaluationClass
{
	protected final org.eclipse.ocl.examples.pivot.Class pivotClass;
	
	public PivotEvaluationClass(PivotEvaluationFragment[] fragments, org.eclipse.ocl.examples.pivot.Class pivotClass) {
		super(fragments);
		this.pivotClass = pivotClass;		
	}
	
	public final org.eclipse.ocl.examples.pivot.Class getPivotClass() {
		return pivotClass;
	}
}