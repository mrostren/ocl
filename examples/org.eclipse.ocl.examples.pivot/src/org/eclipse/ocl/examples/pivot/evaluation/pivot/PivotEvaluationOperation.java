package org.eclipse.ocl.examples.pivot.evaluation.pivot;

import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationOperation;
import org.eclipse.ocl.examples.pivot.values.Value;

public class PivotEvaluationOperation extends EvaluationOperation
{
	protected final Operation pivotOperation;
	
	public PivotEvaluationOperation(Operation pivotOperation) {
		this.pivotOperation = pivotOperation;		
	}
	
	public final Operation getPivotOperation() {
		return pivotOperation;
	}
}