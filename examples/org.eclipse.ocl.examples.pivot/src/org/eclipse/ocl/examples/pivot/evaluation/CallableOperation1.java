package org.eclipse.ocl.examples.pivot.evaluation;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.values.Value;

public abstract class CallableOperation1 extends AbstractCallable
{
	public abstract Value evaluate(EvaluationManager evaluationManager, Value source, Value argument) throws InvalidValueException;
}