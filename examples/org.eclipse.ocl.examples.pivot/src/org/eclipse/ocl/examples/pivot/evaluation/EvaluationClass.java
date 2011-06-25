package org.eclipse.ocl.examples.pivot.evaluation;

public class EvaluationClass
{
	protected final EvaluationPackage evaluationPackage;

	private Integer[] indexes;			// Index in fragments to first super-class of given depth (OclAny is depth 0)
										//  extra final entry points beyond fragments
	private final EvaluationFragment[] fragments;	// OclAny-first, self-last list of super-classes sorted by inheritance depth
	
	protected EvaluationClass(EvaluationPackage evaluationPackage, EvaluationFragment[] fragments) {
		this.evaluationPackage = evaluationPackage;
		this.fragments = fragments;
		int maxDepth = fragments[fragments.length-1].evaluationClass.indexes.length;
		indexes = new Integer[maxDepth];
		int knownDepth = -1;
		for (int i = 0; i < fragments.length; i++) {
			int depth = fragments[i].evaluationClass.indexes.length;
			if (depth != knownDepth) {
				assert depth == knownDepth+1;
				knownDepth = depth;
				indexes[knownDepth] = i;
			}
		}
	}

	public EvaluationClass commonEvaluationClass(EvaluationClass thatClass) {		
		for (int staticDepth = Math.min(indexes.length, thatClass.indexes.length);
				staticDepth > 0; staticDepth--) {
			int iMax = indexes[staticDepth+1];
			int jMax = thatClass.indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				EvaluationClass thisTable = fragments[i].evaluationClass;
				for (int j = thatClass.indexes[staticDepth]; j < jMax; j++) {
					EvaluationClass thatTable = thatClass.fragments[i].evaluationClass;
					if (thisTable == thatTable) {
						return thisTable;
					}
				}
			}
		}
		return fragments[0].evaluationClass;	// Always OclAny at index 0
	}

	public final int getDepth() {
		return indexes.length;
	}
	
	public final EvaluationPackage getEvaluationPackage() {
		return evaluationPackage;
	}
	
	/**
	 * Return true if this EvaluationClass is or is derived from thatEvaluationClass.
	 */
	public boolean isKindOf(EvaluationClass thatEvaluationClass) {
		int staticDepth = thatEvaluationClass.indexes.length;
		if (staticDepth < indexes.length) {
			int iMax = indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				if (fragments[i].evaluationClass == thatEvaluationClass) {
					return true;
				}
			}
		}
		return false;
	}

	public CallableImplementation lookupImplementation(EvaluationOperation staticOperation) {
		EvaluationClass staticClass = staticOperation.evaluationClass;
		int staticDepth = staticClass.indexes.length;
		int iMax = indexes[staticDepth+1];
		for (int i = indexes[staticDepth]; i < iMax; i++) {
			if (fragments[i].evaluationClass == staticClass) {
				return fragments[i].operations[staticOperation.operationIndex].implementation;
			}
		}
		return null;
	}

	public EvaluationOperation lookupOperation(EvaluationOperation staticOperation) {
		EvaluationClass staticClass = staticOperation.evaluationClass;
		int staticDepth = staticClass.indexes.length;
		int iMax = indexes[staticDepth+1];
		for (int i = indexes[staticDepth]; i < iMax; i++) {
			if (fragments[i].evaluationClass == staticClass) {
				return fragments[i].operations[staticOperation.operationIndex];
			}
		}
		return null;
	}
}