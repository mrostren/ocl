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

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.locator.AbstractConstraintLocator;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
//import org.eclipse.ocl.examples.pivot.Constraint;
//import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotConstraintLocator extends AbstractConstraintLocator
{
	public @Nullable Map<EModelElement, List<LeafConstrainingNode>> getConstraints(@NonNull ValidityModel validityModel, @NonNull EPackage ePackage, @NonNull Set<Resource> resources) {
//		Constraint constraint = (Constraint) eObject;
//		return Collections.singletonList(constraint);
		return null;
	}
}