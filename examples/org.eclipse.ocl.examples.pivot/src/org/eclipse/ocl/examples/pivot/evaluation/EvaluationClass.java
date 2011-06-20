package org.eclipse.ocl.examples.pivot.evaluation;

public class EvaluationClass
{
	private EvaluationPackage packageTable;
	private Integer[] indexes;			// Index in fragments to first super-class of given depth (OclAny is depth 0)
										//  extra final entry points beyond fragments
	private final EvaluationFragment[] fragments;	// OclAny-first, self-last list of super-classes sorted by inheritance depth
	
	protected EvaluationClass(EvaluationFragment[] fragments) {
		this.fragments = fragments;
		int maxDepth = fragments[fragments.length-1].classTable.indexes.length;
		indexes = new Integer[maxDepth];
		int knownDepth = -1;
		for (int i = 0; i < fragments.length; i++) {
			int depth = fragments[i].classTable.indexes.length;
			if (depth != knownDepth) {
				assert depth == knownDepth+1;
				knownDepth = depth;
				indexes[knownDepth] = i;
			}
		}
	}

	public EvaluationClass commonClassTable(EvaluationClass thatClass) {		
		for (int staticDepth = Math.min(indexes.length, thatClass.indexes.length);
				staticDepth > 0; staticDepth--) {
			int iMax = indexes[staticDepth+1];
			int jMax = thatClass.indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				EvaluationClass thisTable = fragments[i].classTable;
				for (int j = thatClass.indexes[staticDepth]; j < jMax; j++) {
					EvaluationClass thatTable = thatClass.fragments[i].classTable;
					if (thisTable == thatTable) {
						return thisTable;
					}
				}
			}
		}
		return fragments[0].classTable;	// Always OclAny at index 0
	}

	public int getDepth() {
		return indexes.length;
	}
	
	public boolean isKindOf(EvaluationClass staticClass) {
		int staticDepth = staticClass.indexes.length;
		if (staticDepth < indexes.length) {
			int iMax = indexes[staticDepth+1];
			for (int i = indexes[staticDepth]; i < iMax; i++) {
				if (fragments[i].classTable == staticClass) {
					return true;
				}
			}
		}
		return false;
	}
	
	public EvaluationOperation lookupOperation(EvaluationClass staticClass, int operationIndex) {
		int staticDepth = staticClass.indexes.length;
		int iMax = indexes[staticDepth+1];
		for (int i = indexes[staticDepth]; i < iMax; i++) {
			if (fragments[i].classTable == staticClass) {
				return fragments[i].operations[operationIndex];
			}
		}
		return null;
	}

	public EvaluationIteration lookupOperation(EvaluationIteration staticIteration) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperation0 lookupOperation(EvaluationOperation0 staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperation1 lookupOperation(EvaluationOperation1 staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperation2 lookupOperation(EvaluationOperation2 staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationOperationN lookupOperation(EvaluationOperationN staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}
}