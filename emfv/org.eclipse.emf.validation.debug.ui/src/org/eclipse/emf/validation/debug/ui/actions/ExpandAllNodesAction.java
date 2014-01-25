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
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;

public final class ExpandAllNodesAction extends Action {

	private final @NonNull ValidityManager validityManager;
	private final @NonNull ValidityView validityView;
	private final boolean isValidatableExpandAction;
	private final boolean isConstrainingExpandAction;
	
	public ExpandAllNodesAction(@NonNull ValidityManager validityManager, @NonNull ValidityView validityView, 
			boolean isValidatableExpandAction, boolean isConstrainingExpandAction) {
		super(ValidationDebugMessages.ValidityView_Action_ExpandAllNodes_Title);
		this.validityManager = validityManager;
		this.validityView = validityView;
		this.isValidatableExpandAction = isValidatableExpandAction;
		this.isConstrainingExpandAction = isConstrainingExpandAction;
		if (isValidatableExpandAction && isConstrainingExpandAction){
			setToolTipText(ValidationDebugMessages.ValidityView_Action_ExpandAllNodes_ToolTipText);
		} else if (isValidatableExpandAction){
			setToolTipText(ValidationDebugMessages.ValidityView_Action_ExpandAllValidatableNodes_ToolTipText);
		} else if (isConstrainingExpandAction) {
			setToolTipText(ValidationDebugMessages.ValidityView_Action_ExpandAllConstrainingNodes_ToolTipText);
		}
		
		URL image = (URL) ValidityUIPlugin.INSTANCE.getImage(ValidationDebugMessages.ValidityView_Action_ExpandAllNodes_ImageLocation);
		setImageDescriptor(ImageDescriptor.createFromURL(image));
	}

	@Override
	public void run() {
		RootNode rootNode = validityManager.getRootNode();
		if (rootNode != null) {
			if (isValidatableExpandAction && isConstrainingExpandAction) {
				validityView.getValidatableNodesViewer().expandAll();
				validityView.getConstrainingNodesViewer().expandAll();
			} else if (isValidatableExpandAction) {
				validityView.getValidatableNodesViewer().expandAll();
			} else if (isConstrainingExpandAction) {
				validityView.getConstrainingNodesViewer().expandAll();
			}
		}
	}
}