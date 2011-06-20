package org.eclipse.ocl.examples.pivot.evaluation;

public abstract class EvaluationPackage
{
	private EvaluationClass[] classes;

	public EvaluationPackage(EvaluationClass[] classes) {
		this.classes = classes;
	}
	
	public EvaluationClass lookupClass(int classIndex) {
		return classes[classIndex];
	}
}