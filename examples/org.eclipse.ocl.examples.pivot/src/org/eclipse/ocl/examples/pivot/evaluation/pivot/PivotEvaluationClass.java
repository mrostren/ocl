package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import org.eclipse.ocl.examples.pivot.evaluation.EvaluationClass;

public class PivotEvaluationClass extends EvaluationClass
{
	protected final org.eclipse.ocl.examples.pivot.Class pivotClass;
	
	public PivotEvaluationClass(PivotEvaluationPackage evaluationPackage, PivotEvaluationFragment[] fragments, org.eclipse.ocl.examples.pivot.Class pivotClass) {
		super(evaluationPackage, fragments);
		this.pivotClass = pivotClass;		
	}
	
	public final org.eclipse.ocl.examples.pivot.Class getPivotClass() {
		return pivotClass;
	}
}