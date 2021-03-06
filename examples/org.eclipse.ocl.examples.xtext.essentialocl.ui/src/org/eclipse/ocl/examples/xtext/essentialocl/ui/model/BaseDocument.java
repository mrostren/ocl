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
 * $Id: BaseDocument.java,v 1.8 2011/03/18 18:19:06 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.model;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.RootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

public class BaseDocument extends XtextDocument implements ConsoleContext
{
	@Inject
	public BaseDocument(DocumentTokenSource tokenSource, ITextEditComposer composer) {
		super(tokenSource, composer);
	}

	private EObject context;
    private Map<String, EClassifier> parameters;

	protected RootCSScopeAdapter getDocumentScopeAdapter() {
		return readOnly(new IUnitOfWork<RootCSScopeAdapter, XtextResource>()
			{
				public RootCSScopeAdapter exec(XtextResource resource) throws Exception {
					if (!resource.getContents().isEmpty()) {
						ElementCS csElement = (ElementCS) resource.getContents().get(0);
						ScopeCSAdapter scopeAdapter = ElementUtil.getScopeCSAdapter(csElement);
						if (scopeAdapter != null) {
							return scopeAdapter.getRootScopeAdapter();
						}
					}
					return null;
				}
			});
	}

    public EObject getOCLContext() {
        return context;
    }

    public Map<String, EClassifier> getOCLParameters() {
		return parameters;
	}

	public ResourceSet getResourceSet() {
		return readOnly(new IUnitOfWork<ResourceSet, XtextResource>()
			{
				public ResourceSet exec(XtextResource resource) throws Exception {
					return resource.getResourceSet();
				}
			});
	}

	public void setContext(final EClassifier ecoreContext, final Map<String, EClassifier> ecoreParameters) {
		modify(new IUnitOfWork<Object, XtextResource>()
		{
			public Object exec(XtextResource resource) throws Exception {
				return setContext((EssentialOCLCSResource) resource, ecoreContext, ecoreParameters);
			}
		});

        this.context = ecoreContext;
        this.parameters = ecoreParameters;
    }

	public Object setContext(EssentialOCLCSResource resource, EClassifier ecoreContext, Map<String, EClassifier> ecoreParameters) {
		CS2PivotResourceAdapter csAdapter = CS2PivotResourceAdapter.getAdapter(resource, null);
		TypeManager typeManager = csAdapter.getTypeManager();
		NamedElement pivotContext = ecoreContext != null ? typeManager.getPivotOfEcore(NamedElement.class, ecoreContext) : null;
		Map<String, Type> pivotParameters = null;
		if (ecoreParameters != null) {
			pivotParameters = new HashMap<String, Type>();
			for (String key : ecoreParameters.keySet()) {
				EClassifier ecoreParameterType = ecoreParameters.get(key);
				Type pivotParameterType = typeManager.getPivotOfEcore(Type.class, ecoreParameterType);
				pivotParameters.put(key, pivotParameterType);
			}
		}
		resource.setContext(pivotContext, pivotParameters);
		return null;
	}
}
