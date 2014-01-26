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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.validation.debug.ui.ValidityUIPlugin;
import org.eclipse.emf.validation.debug.ui.messages.ValidationDebugMessages;
import org.eclipse.emf.validation.debug.ui.view.IDEValidityManager;
import org.eclipse.emf.validation.debug.ui.view.ValidityView;
import org.eclipse.emf.validation.debug.ui.wizards.ExportValidationResultsFileWizard;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.emf.validation.export.ExportResultsDescriptor;
import org.eclipse.emf.validation.export.ExportResultsRegistry;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

public final class ExportValidationResultAction extends Action implements IMenuCreator
{
	private final @NonNull IDEValidityManager validityManager;
	private final @NonNull ValidityView validityView;

	/** Menu manager for this action. */
	private MenuManager menuManager = new MenuManager();
	
	public ExportValidationResultAction(@NonNull IDEValidityManager validityManager, @NonNull ValidityView validityView) {
		super(ValidationDebugMessages.ValidityView_Action_ExportResult_Title);
		this.validityManager = validityManager;
		this.validityView = validityView;
		URL image = (URL) ValidityUIPlugin.INSTANCE.getImage(ValidationDebugMessages.ValidityView_Action_ExportResult_ImageLocation);
		setImageDescriptor(ImageDescriptor.createFromURL(image));
		
		if (ExportResultsRegistry.getRegisteredExtensions().isEmpty()) {
			setToolTipText(ValidationDebugMessages.ValidityView_Action_ExportResult_ToolTipText_NoExporter);
		} else {
			setToolTipText(ValidationDebugMessages.ValidityView_Action_ExportResult_ToolTipText_NeedsRun);
			setMenuCreator(this);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuCreator#dispose()
	 */
	public void dispose() {
		if (menuManager.getMenu() != null) {
			menuManager.getMenu().dispose();
		}
		menuManager.dispose();

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Control)
	 */
	public Menu getMenu(Control parent) {
		// Creates the menu if needed, or removes all elements
		if (menuManager.getMenu() == null) {
			menuManager.createContextMenu(parent);
		} else {
			menuManager.removeAll();
		}
		
		// look for additional actions to add to the contextual menu.
		for (ExportResultsDescriptor descriptor : ExportResultsRegistry.getRegisteredExtensions()) {
			if (descriptor != null) {
				final Action exportAction = new SpecificExportResultsAction(descriptor);
				menuManager.add(new ActionContributionItem(exportAction));
			}
		}

		return menuManager.getMenu();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Menu)
	 */
	public Menu getMenu(Menu parent) {
		if (menuManager.getMenu() != null) {
			return menuManager.getMenu();
		}
		return null;
	}
	
	private final class SpecificExportResultsAction extends Action
	{
		private final @NonNull ExportResultsDescriptor exportDescriptor;

		public SpecificExportResultsAction(@NonNull ExportResultsDescriptor exportDescriptor) {
			super(ValidationDebugMessages.ValidityView_Action_ExportResult_Title, IAction.AS_CHECK_BOX);
			this.exportDescriptor = exportDescriptor;
			setText(exportDescriptor.getExtensionName());
			setToolTipText(ValidationDebugMessages.ValidityView_Action_ExportResult_ToolTipText);
		}

		@Override
		public void run() {
			IWorkbenchPage page = validityView.getSite().getPage();
			IStructuredSelection selection = null;
			IEditorPart editorPart = page.getActiveEditor();
			if (editorPart.getSite() != null) {
				ISelectionProvider selectionProvider = editorPart.getSite().getSelectionProvider();
				if (selectionProvider != null) {
					ISelection selection2 = selectionProvider.getSelection();
					if (!selection2.isEmpty() && selection2 instanceof IStructuredSelection)
						selection = (IStructuredSelection) selection2;
				}
			}
			if (selection != null) {
				try {
					openExportWizard(selection);
				} catch (CoreException e) {
					ValidityUIPlugin.getPlugin().getLog().log(e.getStatus());
				}
			}
		}
		
		/**
		 * Opens the export wizard for the receiver.
		 * 
		 * @param currentSelection
		 *            The current selection in the active editor part
		 * @throws CoreException
		 */
		private void openExportWizard(@NonNull final IStructuredSelection currentSelection)
				throws CoreException {
			final IWorkbenchWindow window = validityView.getSite().getWorkbenchWindow();

			if (window.getShell() != null && window.getWorkbench() != null) {
				final Display display = window.getShell().getDisplay();
				final IWorkbench workbench = window.getWorkbench();
				final RootNode rootNode = validityManager.getRootNode();
				if (display != null && workbench != null && rootNode != null) {
					display.syncExec(new Runnable() {
						public void run() {
							ExportValidationResultsFileWizard wizard = new ExportValidationResultsFileWizard(workbench, currentSelection, rootNode, exportDescriptor);
							WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
							if (dialog.open() != Window.OK) {
								return;
							}
						}
					});
				} else {
					// DO NOTHING 
				}
			}
		}
	}
}