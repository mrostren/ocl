package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import org.eclipse.ocl.examples.pivot.evaluation.EvaluationPackage;


public class PivotEvaluationPackage extends EvaluationPackage
{
	protected final org.eclipse.ocl.examples.pivot.Package pivotPackage;

	public PivotEvaluationPackage(PivotEvaluationClass[] classes, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		super(classes);
		this.pivotPackage = pivotPackage;		
	}
	
	public final org.eclipse.ocl.examples.pivot.Package getPivotPackage() {
		return pivotPackage;
	}
}