/**
 * <copyright>
 *
 * Copyright (c) 2013,2014 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *  Obeo - Implement constraints validation 
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.debug.locator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.locator.AbstractConstraintLocator;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.Severity;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.BaseResource;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.pivot.validation.PivotEObjectValidator.ValidationAdapter;

public class PivotConstraintLocator extends AbstractConstraintLocator
{
	public @Nullable Map<EModelElement, List<LeafConstrainingNode>> getConstraints(@NonNull ValidityModel validityModel, @NonNull EPackage ePackage, @NonNull Set<Resource> resources) {
		Map<EModelElement, List<LeafConstrainingNode>> map = null;
		for (Resource resource : resources) {
			Resource asResource = null;
			if (resource instanceof BaseResource) {
				asResource = ((BaseResource) resource).getASResource(null);
			}
			if (asResource != null) {
				MetaModelManager metaModelManager = PivotUtil.findMetaModelManager(asResource);
				if (metaModelManager != null) {
					for (TreeIterator<EObject> tit = asResource.getAllContents(); tit.hasNext(); ) {
						EObject eObject = tit.next();
						if (eObject instanceof Constraint) {
							Constraint pConstraint = (Constraint)eObject;
							Namespace constrainedElement = pConstraint.getContext();
							if (constrainedElement != null) {
								String label = validityModel.getLabel(pConstraint);
								EModelElement eTarget = metaModelManager.getEcoreOfPivot(EModelElement.class, constrainedElement);
								if (eTarget != null) {
									assert resource != null;
									PivotConstraintDefinition definition = new PivotConstraintDefinition(pConstraint, resource);
									map = createLeafConstrainingNode(map, validityModel, eTarget, pConstraint, definition, label);
								}
							}
						}
					}
				}
			}
		}
		return map;
	}

	public @NonNull String getName() {
		return "Complete OCL constraints";
	}

	@Override
	public void validate(@NonNull Result result, @NonNull ValidityManager validityManager) {
		Severity severity = Severity.UNKNOWN;
		try {
			Constraint constraint = (Constraint) result.getLeafConstrainingNode().getConstrainingObject();
			if (constraint != null){
				EObject eObject = result.getValidatableNode().getConstrainedObject();
				try {
					ResourceSet resourceSet = eObject.eResource().getResourceSet();
					if (resourceSet != null) {
						ValidationAdapter validationAdapter = ValidationAdapter.findAdapter(resourceSet);
						if (validationAdapter != null) {
							Map<Object, Object> context = validityManager.createDefaultContext();
							Diagnostic diagnostic = validationAdapter.validate(constraint, eObject, context);
							result.setDiagnostic(diagnostic);
							severity = diagnostic != null ? getSeverity(diagnostic) : Severity.OK;
						}
					}
				} catch (Exception e) {
					result.setException(e);
					severity = Severity.FATAL;
				} catch (Throwable e) {
					result.setException(new Exception(e));		// FIXME avoid wrapper
					severity = Severity.FATAL;
				}
			}
		} finally {
			result.setSeverity(severity);
		}
	}
}