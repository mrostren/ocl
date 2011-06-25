package org.eclipse.ocl.examples.pivot.evaluation;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.values.Value;

public abstract class CallableOperationN extends AbstractCallable
{
	public abstract Value evaluate(EvaluationManager evaluationManager, Value source, Value... arguments) throws InvalidValueException;
}