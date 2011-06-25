package org.eclipse.ocl.examples.pivot.evaluation;

public abstract class EvaluationOperation
{
	protected final EvaluationClass evaluationClass;
	protected final int operationIndex;
	protected final CallableImplementation implementation;
	
	public EvaluationOperation(EvaluationClass evaluationClass, int operationIndex, CallableImplementation implementation) {
		this.evaluationClass = evaluationClass;
		this.operationIndex = operationIndex;
		this.implementation = implementation;
	}
}