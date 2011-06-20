package org.eclipse.ocl.examples.pivot.evaluation;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.values.Value;


public abstract class EvaluationIteration extends EvaluationOperation
{
	public abstract Value evaluate(EvaluationManager evaluationManager, Value source, Value accumulator, EvaluationOperation body) throws InvalidValueException;
}