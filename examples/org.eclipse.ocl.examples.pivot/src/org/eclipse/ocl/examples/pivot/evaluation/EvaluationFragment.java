package org.eclipse.ocl.examples.pivot.evaluation;

public abstract class EvaluationFragment
{
	final EvaluationClass evaluationClass;
	final EvaluationOperation[] operations;

	protected EvaluationFragment(EvaluationClass evaluationClass, EvaluationOperation[] operations) {
		this.evaluationClass = evaluationClass;
		this.operations = operations;
	}
}