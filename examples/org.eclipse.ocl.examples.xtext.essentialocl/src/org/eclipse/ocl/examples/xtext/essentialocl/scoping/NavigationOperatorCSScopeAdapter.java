/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: NavigationOperatorCSScopeAdapter.java,v 1.1.2.8 2011/01/15 19:03:06 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationRole;

public class NavigationOperatorCSScopeAdapter extends ExpCSScopeAdapter<NavigationOperatorCS, CallExp>
{
	public NavigationOperatorCSScopeAdapter(PivotManager pivotManager, NavigationOperatorCS eObject) {
		super(pivotManager, eObject, CallExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		BinaryOperatorCS csOperator = getTarget();
		if (containmentFeature == PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT) {
			OclExpression csSource = PivotUtil.getPivot(OclExpression.class, csOperator.getSource());
//			ScopeAdapter typeScopeAdapter = getScopeAdapter(pivotManager, source.getType());
			if (csSource instanceof TypeExp) {
				environmentView.addElementsOfScope(pivotManager, ((TypeExp)csSource).getReferredType(), scopeView);
			}
			else {
				Type type = csSource.getType();
				EnvironmentView.Filter filter = null;
				try {
					if (target.getArgument() instanceof NavigatingExpCS) {
						filter = new ArgumentCountFilter((NavigatingExpCS)target.getArgument());
						environmentView.addFilter(filter);
					}
					if (target.getName().equals(PivotConstants.COLLECTION_NAVIGATION_OPERATOR)) {
						environmentView.addElementsOfScope(pivotManager, type, scopeView);					
						if (!(type instanceof CollectionType)) {
							Type setType = pivotManager.getSetType(type);
							environmentView.addElementsOfScope(pivotManager, setType, scopeView);
						}
					}
					else {
						environmentView.addElementsOfScope(pivotManager, type, scopeView);					
						if (type instanceof CollectionType) {
							environmentView.addElementsOfScope(pivotManager, ((CollectionType)type).getElementType(), scopeView);
						}
					}
				}
				finally {
					if (filter != null) {
						environmentView.removeFilter(filter);
					}
				}
			}
//			return typeScopeAdapter.compute Lookup(environmentView, typeScopeAdapter.getInnerScopeView(null));
//			return getScopeCSAdapter(parent).getOuterScopeView(null);
			return scopeView.getOuterScope();
		}
		else {
			ExpCS parent = target.getParent();
			return getScopeAdapter(parent != null ? parent : (ModelElementCS)target.eContainer()).getOuterScopeView(null);
		}
	}
	
	private class ArgumentCountFilter implements EnvironmentView.Filter
	{
		private final int iterators;
		
		public ArgumentCountFilter(NavigatingExpCS csNavigatingExp) {
			int iterators = 0;
			for (NavigatingArgCS csNavigatingArg : csNavigatingExp.getArgument()) {
				if (csNavigatingArg.getRole() == NavigationRole.ITERATOR) {
					iterators++;
				}
			}
			this.iterators = iterators;
		}

		public boolean filter(EObject eObject) {
			if (eObject instanceof Iteration) {
				int iteratorCount = ((Iteration)eObject).getOwnedIterators().size();
				if ((0 < iterators) && (iteratorCount != iterators)) {
					return false;
				}
			}
			return true;
		}
	}
}