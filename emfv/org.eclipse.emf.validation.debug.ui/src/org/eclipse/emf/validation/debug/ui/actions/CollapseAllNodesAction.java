/**
 * <copyright>
 *
 * Copyright (c) 2014 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	 Obeo - initial API and implementation
 *  
 * </copyright>
 */
package org.eclipse.emf.validation.debug.ui.actions;

import java.net.URL;

import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.ui.ValidityUIPlugin;
import org.eclipse.emf.validation.debug.ui.messages.ValidationDebugMessages;
import org.eclipse.emf.validation.debug.ui.view.ValidityView;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

public final class CollapseAllNodesAction extends Action {

	private final @NonNull ValidityManager validityManager;
	private final @NonNull ValidityView validityView;
	private final boolean isValidatableCollapseAction;
	private final boolean isConstrainingCollapseAction;

	public CollapseAllNodesAction(@NonNull ValidityManager validityManager, @NonNull ValidityView validityView, 
			boolean isValidatableCollapseAction, boolean isConstrainingCollapseAction) {
		super(ValidationDebugMessages.ValidityView_Action_CollapseAllNodes_Title);
		this.validityManager = validityManager;
		this.validityView = validityView;
		this.isValidatableCollapseAction = isValidatableCollapseAction;
		this.isConstrainingCollapseAction = isConstrainingCollapseAction;
		if (isValidatableCollapseAction && isConstrainingCollapseAction){
			setToolTipText(ValidationDebugMessages.ValidityView_Action_CollapseAllNodes_ToolTipText);
		} else if (isValidatableCollapseAction){
			setToolTipText(ValidationDebugMessages.ValidityView_Action_CollapseAllValidatableNodes_ToolTipText);
		} else if (isConstrainingCollapseAction) {
			setToolTipText(ValidationDebugMessages.ValidityView_Action_CollapseAllConstrainingNodes_ToolTipText);
		}

		URL image = (URL) ValidityUIPlugin.INSTANCE.getImage(ValidationDebugMessages.ValidityView_Action_CollapseAllNodes_ImageLocation);
		setImageDescriptor(ImageDescriptor.createFromURL(image));
	}

	@Override
	public void run() {
		RootNode rootNode = validityManager.getRootNode();
		if (rootNode != null) {
			if (isValidatableCollapseAction && isConstrainingCollapseAction) {
				validityView.getValidatableNodesViewer().collapseAll();
				validityView.getConstrainingNodesViewer().collapseAll();
			} else if (isValidatableCollapseAction) {
				validityView.getValidatableNodesViewer().collapseAll();
			} else if (isConstrainingCollapseAction) {
				validityView.getConstrainingNodesViewer().collapseAll();
			}
		}
	}
}