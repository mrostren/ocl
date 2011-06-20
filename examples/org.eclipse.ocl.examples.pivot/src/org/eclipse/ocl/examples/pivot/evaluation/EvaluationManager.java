package org.eclipse.ocl.examples.pivot.evaluation;

import java.util.Map;

import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.impl.ValueFactoryImpl;

public abstract class EvaluationManager extends ValueFactoryImpl
{	
//	private Map<String, EvaluationPackage> packages = new HashMap<String, EvaluationPackage>();
	
	
//	public EvaluationPackage lookupPackage(String packageMoniker) {
//		return packages.get(packageMoniker);
//	}
	
//	public EvaluationClass lookupClass(String packageMoniker, int classIndex) {
//		return packages.get(packageMoniker).lookupClass(classIndex);
//	}
	
	public EvaluationManager(String name) {
		super(name);
	}

	//	public OperationTable lookupOperation(String packageMoniker, int classIndex, int operationIndex) {
//		return packages.get(packageMoniker).lookupClass(classIndex).lookupOperation(operationIndex);
//	}
	public Value dispatch(Value source, String operationMoniker, Value... arguments) throws InvalidValueException {
		return null;		// TODO implement me
	}
	
	public Value dispatch(Value source, String iterationMoniker, Value initial, EvaluationOperation body) throws InvalidValueException {
		return null;		// TODO implement me
	}
	
//	public abstract Value evaluate(EvaluationManager evaluationManager, Value sourceValue, Value... argValues) throws InvalidValueException;

	public Value navigate(Value source, String propertyMoniker) {
		return null;		// TODO implement me
	}
	
	public Value tupleFor(String tupleMoniker, Map<String, Value> partMap) {
		return null;		// TODO implement me
	}
	
	public Value typeOf(String typeMoniker) {
		return null;		// TODO implement me
	}
	
	public EvaluationClass typeOf(Value value) {
		return null;		// TODO implement me
	}
	
	public EvaluationClass typeOf(Value value, Value... values) {
		EvaluationClass type = typeOf(value);
		for (Value anotherValue : values) {
			EvaluationClass anotherType = typeOf(anotherValue);
			type = type.commonClassTable(anotherType);
		}
		return type;
	}

	public EvaluationIteration lookupIteration(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperation0 lookupOperation0(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperation1 lookupOperation1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperation2 lookupOperation2(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperationN lookupOperationN(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
