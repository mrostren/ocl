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
 * $Id: QualifiedRefCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class QualifiedRefCSScopeAdapter<CS extends QualifiedRefCS<?>, P extends Element> extends ModelElementCSScopeAdapter<CS, P>
{
	public QualifiedRefCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.QUALIFIED_REF_CS__ELEMENT) {
			CS target = getTarget();
			ScopeAdapter scopeAdapter = getScopeAdapter(target.getNamespace());
			if (scopeAdapter != null) {
				scopeAdapter.computeLookup(environmentView, scopeView);
			}
			return null;
		}
		else {
			return scopeView.getOuterScope();
		}
	}
}