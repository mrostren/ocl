package org.eclipse.ocl.examples.pivot.evaluation.ecore;

import org.eclipse.ocl.examples.pivot.evaluation.EvaluationManager;

public class EcoreEvaluationManager extends EvaluationManager
{
	public static final EcoreEvaluationManager INSTANCE = new EcoreEvaluationManager("Default");

	public EcoreEvaluationManager(String name) {
		super(name);
	}
}