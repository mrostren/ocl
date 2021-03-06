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
 * $Id: ClassifierContextScopeAdapter.java,v 1.8 2011/02/08 17:53:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;

public class ClassifierContextScopeAdapter extends ModelElementCSScopeAdapter<ClassifierContextDeclCS, Type>
{
	public ClassifierContextScopeAdapter(TypeManager typeManager, ClassifierContextDeclCS csElement) {
		super(typeManager, csElement, Type.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == CompleteOCLCSTPackage.Literals.CLASSIFIER_CONTEXT_DECL_CS__CLASSIFIER) {
			return getNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		else if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		return scopeView.getOuterScope();

		
/*		if (containmentFeature == CompleteOCLCSTPackage.Literals.CLASSIFIER_CONTEXT_DECL_CS__CLASSIFIER) {
			return scopeView.getOuterScope();
		}
		else {
			ClassifierRefCS csClassifierRef = target.getClassifier();
			if (csClassifierRef != null) {
				ClassifierCS csClassifier = csClassifierRef.getClassifier();
				environmentView.addElementsOfScope(csClassifier, scopeView);
				String selfName = target.getSelfName();
				if (selfName == null) {
					selfName = Environment.SELF_VARIABLE_NAME;
				}
				environmentView.addElement(selfName, csClassifier);
				RootCS document = getRootScopeAdapter().getTarget();
				for (Iterator<EObject> it = document.eAllContents(); it.hasNext(); ) {
					EObject eObject = it.next();	// FIXME Need to create the csClassifier features
					if (eObject instanceof ClassifierContextDeclCS) {
						ClassifierContextDeclCS csClassifierContext2 = (ClassifierContextDeclCS)eObject;
						ClassifierRefCS csClassifierRef2 = csClassifierContext2.getClassifier();
						ClassifierCS csClassifier2 = csClassifierRef2 != null ? csClassifierRef2.getClassifier() : null;
						if (csClassifier == csClassifier2) {
							for (DefCS def : csClassifierContext2.getDefs()) {
								environmentView.addElement(def.getConstrainedName(), def);
							}
						}
					}
				}
			}
			return scopeView.getOuterScope();
		} */
	}
}
