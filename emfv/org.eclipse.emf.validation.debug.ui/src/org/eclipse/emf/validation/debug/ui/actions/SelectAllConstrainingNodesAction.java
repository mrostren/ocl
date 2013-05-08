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
import org.eclipse.emf.validation.debug.validity.ConstrainingNode;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public final class SelectAllConstrainingNodesAction extends Action
{
	protected final @NonNull ValidityManager validityManager;
	
	public SelectAllConstrainingNodesAction(@NonNull ValidityManager validityManager) {
		super("Select All Constraints");
		this.validityManager = validityManager;
		setToolTipText("Select All Constraints for Validation");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
		getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	}

	@Override
	public void run() {
		RootNode rootNode = validityManager.getRootNode();
		if (rootNode != null) {
			selectAll(rootNode.getConstrainingNodes());
		}
	}

	protected void selectAll(@NonNull Iterable<? extends ConstrainingNode> constrainingNodes) {
		for (ConstrainingNode constrainingNode : constrainingNodes) {
			constrainingNode.setEnabled(true);
			selectAll(constrainingNode.getChildren());
		}
	}
}