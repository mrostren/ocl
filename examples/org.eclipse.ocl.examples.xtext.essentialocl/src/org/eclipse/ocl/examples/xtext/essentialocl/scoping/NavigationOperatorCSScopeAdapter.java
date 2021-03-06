/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: NavigationOperatorCSScopeAdapter.java,v 1.13 2011/05/05 17:52:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;

public class NavigationOperatorCSScopeAdapter extends ExpCSScopeAdapter<NavigationOperatorCS, CallExp>
{
	public NavigationOperatorCSScopeAdapter(TypeManager typeManager, NavigationOperatorCS eObject) {
		super(typeManager, eObject, CallExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EObject child = scopeView.getChild();
		if (child == target.getArgument()) {
			OclExpression source = PivotUtil.getPivot(OclExpression.class, target.getSource());
			if (source != null) {
				Type type = source.getType();
				if (!target.getName().equals(PivotConstants.COLLECTION_NAVIGATION_OPERATOR)) {
					environmentView.addElementsOfScope(type, scopeView);			// object.object-operation, collection.collection-as-object-operation		
					if (type instanceof CollectionType) {
						environmentView.addElementsOfScope(((CollectionType)type).getElementType(), scopeView); // collection->collect(object-operation)
					}
				}
				else if (scopeView.getContainmentFeature() != PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT){
					if (type instanceof CollectionType) {		// collection->collection-operation
						environmentView.addElementsOfScope(type, scopeView);
					}
					else {										// object.oclAsSet()->collection-operation
						Type setType = typeManager.getSetType(type);
						environmentView.addElementsOfScope(setType, scopeView);
					}
				}
				else {
					if (type instanceof CollectionType) {		// collection->iteration-operation(iterator-feature)
						environmentView.addElementsOfScope(((CollectionType)type).getElementType(), scopeView);
					}
					else {										// object.oclAsSet()->iteration-operation(iterator-feature)
						environmentView.addElementsOfScope(type, scopeView);
					}
					
				}
				if (scopeView.getContainmentFeature() != PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT) {
					return null;				// No further outer scope lookup				
				}
			}
			return scopeView.getOuterScope();
		}
		else {
			ExpCS parent = target.getParent();
			ScopeAdapter scopeAdapter = getScopeCSAdapter(parent != null ? parent : (ElementCS)target.eContainer());
			EnvironmentView.Filter filter = ContextCSScopeAdapter.NoImplicitProperties.INSTANCE;
			try {
				environmentView.addFilter(filter);
				BaseScopeView baseScopeView = new BaseScopeView(typeManager, scopeAdapter, target, PivotPackage.Literals.CALL_EXP__SOURCE, null);
				environmentView.computeLookups(baseScopeView);
				return null;
			}
			finally {
				environmentView.removeFilter(filter);
			}
		}
	}
}
