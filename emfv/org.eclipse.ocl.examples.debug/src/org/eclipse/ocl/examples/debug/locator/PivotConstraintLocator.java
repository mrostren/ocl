/**
 * <copyright>
 *
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.debug.locator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.locator.AbstractConstraintLocator;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.BaseResource;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class PivotConstraintLocator extends AbstractConstraintLocator
{
	public @Nullable Map<EModelElement, List<LeafConstrainingNode>> getConstraints(@NonNull ValidityModel validityModel, @NonNull EPackage ePackage, @NonNull Set<Resource> resources) {
		Map<EModelElement, List<LeafConstrainingNode>> map = null;
		for (Resource resource : resources) {
			if (resource instanceof BaseResource) {
				resource = ((BaseResource)resource).getPivotResource(null);
			}
			if (resource != null) {
				MetaModelManager metaModelManager = PivotUtil.findMetaModelManager(resource);
				if (metaModelManager != null) {
					for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
						EObject eObject = tit.next();
						if (eObject instanceof Constraint) {
							Constraint pConstraint = (Constraint)eObject;
							Namespace constrainedElement = pConstraint.getContext();
							if (constrainedElement != null) {
								String label = validityModel.getLabel(pConstraint);
								EModelElement eTarget = metaModelManager.getEcoreOfPivot(EModelElement.class, constrainedElement);
								if (eTarget != null) {
									map = createLeafConstrainingNode(map, validityModel, eTarget, pConstraint, label);
								}
							}
						}
					}
				}
			}
		}
		return map;
	}
}