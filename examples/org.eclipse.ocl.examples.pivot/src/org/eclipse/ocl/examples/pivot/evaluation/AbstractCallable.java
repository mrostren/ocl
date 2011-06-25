package org.eclipse.ocl.examples.pivot.evaluation;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.InvalidEvaluationException;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.values.Value;

public abstract class AbstractCallable implements CallableImplementation
{

	public Value evaluate(EvaluationVisitor evaluationVisitor,
			Value sourceValue, CallExp call)
			throws InvalidEvaluationException {
		// TODO Auto-generated method stub
		return null;
	}

	public Diagnostic validate(TypeManager typeManager, CallExp callExp) {
		// TODO Auto-generated method stub
		return null;
	}
}