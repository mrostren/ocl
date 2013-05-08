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
package org.eclipse.emf.validation.debug.ui.actions;

import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.debug.validity.ValidatableNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public final class SelectAllValidatableNodesAction extends Action
{
	protected final @NonNull ValidityManager validityManager;
	
	public SelectAllValidatableNodesAction(@NonNull ValidityManager validityManager) {
		super("Select All Model Elements");
		this.validityManager = validityManager;
		setToolTipText("Select All Model Elements for Validation");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
		getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
	}
	
	@Override
	public void run() {
		RootNode rootNode = validityManager.getRootNode();
		if (rootNode != null) {
			selectAll(rootNode.getValidatableNodes());
		}
	}

	protected void selectAll(@NonNull Iterable<? extends ValidatableNode> validatableNodes) {
		for (ValidatableNode validatable : validatableNodes) {
			validatable.setEnabled(true);
			selectAll(validatable.getChildren());
		}
	}
}