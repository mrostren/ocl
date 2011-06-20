package org.eclipse.ocl.examples.pivot.evaluation;

public abstract class EvaluationFragment
{
	final EvaluationClass classTable;
	final EvaluationOperation[] operations;

	protected EvaluationFragment(EvaluationClass classTable, EvaluationOperation[] operations) {
		this.classTable = classTable;
		this.operations = operations;
	}
}