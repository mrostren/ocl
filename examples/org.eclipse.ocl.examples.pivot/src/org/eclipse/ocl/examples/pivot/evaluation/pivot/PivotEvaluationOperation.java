package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationClass;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationOperation;

public class PivotEvaluationOperation extends EvaluationOperation
{
	protected final Operation pivotOperation;
	
	public PivotEvaluationOperation(EvaluationClass evaluationClass, int operationIndex, Operation pivotOperation) {
		super(evaluationClass, operationIndex, pivotOperation.getImplementation());
		this.pivotOperation = pivotOperation;		
	}
	
	public final Operation getPivotOperation() {
		return pivotOperation;
	}
}