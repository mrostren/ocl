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
package org.eclipse.emf.validation.debug.locator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.Severity;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public abstract class AbstractConstraintLocator implements ConstraintLocator
{
	public @NonNull ConstraintLocator getConstraintLocator() {
		return this;
	}

	protected @NonNull Map<EModelElement, List<LeafConstrainingNode>> createLeafConstrainingNode(@Nullable Map<EModelElement, List<LeafConstrainingNode>> map,
			@NonNull ValidityModel validityModel, @NonNull EModelElement constrainingType, @NonNull Object constrainingObject, @NonNull String label) {
		LeafConstrainingNode constraint = validityModel.createLeafConstrainingNode();
		constraint.setConstraintLocator(this);
		constraint.setLabel(label);
		constraint.setConstrainingObject(constrainingObject);
		if (map == null) {
			map = new HashMap<EModelElement, List<LeafConstrainingNode>>();
		}
		List<LeafConstrainingNode> constraints = map.get(constrainingType);
		if (constraints == null) {
			constraints = new ArrayList<LeafConstrainingNode>();
			map.put(constrainingType, constraints);
		}
		constraints.add(constraint);
		return map;
	}

	public @Nullable Object getImage() {
		return null;
	}

	protected @NonNull Severity getSeverity(@NonNull BasicDiagnostic diagnostic) {
		Severity severity;
		switch (diagnostic.getSeverity()) {
			case Diagnostic.OK: severity = Severity.OK; break;
			case Diagnostic.INFO: severity = Severity.INFO; break;
			case Diagnostic.WARNING: severity = Severity.WARNING; break;
			case Diagnostic.ERROR: severity = Severity.ERROR; break;
			case Diagnostic.CANCEL: severity = Severity.FATAL; break;
			default: severity = Severity.UNKNOWN; break;
		}
		assert severity != null;
		return severity;
	}

	public void validate(@NonNull Result result, @NonNull ValidityManager validityManager) {
		result.setDiagnostic("Unimplemented validate for " + getClass().getName());
		result.setSeverity(Severity.FATAL);
//		System.out.println("Validate '" + result.getValidatableNode() + "' against '" + result.getLeafConstrainingNode() + "'");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {}
	}
}