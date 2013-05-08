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

import java.net.URL;

import org.eclipse.emf.validation.debug.ui.ValidityUIPlugin;
import org.eclipse.emf.validation.debug.ui.view.IDEValidityManager;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

public final class RunValidityAction extends Action
{
	protected final @NonNull IDEValidityManager validityManager;
	
	public RunValidityAction(@NonNull IDEValidityManager validityManager) {
		super("Validate Selected Constraints and Elements");
		this.validityManager = validityManager;
		setToolTipText("Perform a Validation of the selected Model Elements using the selected Constraints");
		URL image = (URL) ValidityUIPlugin.INSTANCE.getImage("run_exec.png");
		setImageDescriptor(ImageDescriptor.createFromURL(image));
	}

	@Override
	public void run() {
		validityManager.runValidation();
	}
}