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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.debug.ui.ValidityUIPlugin;
import org.eclipse.emf.validation.debug.ui.messages.ValidationDebugMessages;
import org.eclipse.emf.validation.debug.ui.utils.Logger;
import org.eclipse.emf.validation.debug.ui.view.IDEValidityManager;
import org.eclipse.emf.validation.debug.validity.markers.GoToConstrainingMarker;
import org.eclipse.emf.validation.debug.validity.markers.GoToModelElementMarker;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ocl.examples.emf.validation.validity.AbstractNode;
import org.eclipse.ocl.examples.emf.validation.validity.ConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.LeafConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.ResultConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.ResultValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityModel;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public final class ShowElementInEditorAction extends Action
{
	/**
	 * Returns the {@link IFile} in which the provided {@link Resource} can be
	 * found, if any.
	 * 
	 * @param resource
	 *            the {@link Resource} for which we search the enclosing file
	 * @return the corresponding {@link IFile} or <code>null</code> if one of the following occurs:
	 *         <ul>
	 *         <li>the given resource is null </li>
	 *         <li>the resource {@link URI} cannot be determined</li>
	 *         <li>the resource {@link URI} is not platform oriented</li>
	 *         <li>the project supposed to contain the resource does not actually exist</li>
	 *         <li>the project containing the resource is closed</li>
	 *         </ul>
	 * 
	 */
	private static @Nullable IFile findFile(Resource resource) {
		if (resource == null || resource.getURI() == null || !resource.getURI().isPlatform()) {
			return null;
		}
		
		IPath resourcePath = new Path(resource.getURI().toPlatformString(true));
		IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(resourcePath);

		IProject iProject = iFile.getProject();
		if (!iProject.isAccessible() || !iFile.exists()) {
			return null;
		}
		return iFile;
	}

	private final @NonNull IDEValidityManager validityManager;
	
	private final @NonNull ISelectionProvider selectionProvider;
	
	public ShowElementInEditorAction(@NonNull IDEValidityManager validityManager, @NonNull ISelectionProvider selectionProvider) {
		super(ValidationDebugMessages.ValidityView_Action_ShowInEditor_Title);
		this.validityManager = validityManager;
		this.selectionProvider = selectionProvider;
		setToolTipText(ValidationDebugMessages.ValidityView_Action_ShowInEditor_ToolTipText);
		URL image = (URL) ValidityUIPlugin.INSTANCE.getImage(ValidationDebugMessages.ValidityView_Action_ShowInEditor_ImageLocation);
		setImageDescriptor(ImageDescriptor.createFromURL(image));
	}

	/**
	 * Return the GoToModelElementMarker of a ValidatableNode.
	 * 
	 * @param validatableNode
	 *            the selected ValidatableNode
	 * @return the GoToModelElementMarker of a ValidatableNode.
	 */
	public GoToModelElementMarker getModelElementMarker(@NonNull ValidatableNode validatableNode){
		IFile containingFile = findFile(validatableNode.getConstrainedObject().eResource());
		// create a go to Marker for the selected eObject
		if (containingFile != null) {
			return new GoToModelElementMarker(containingFile, validatableNode.getConstrainedObject());
		}
		return null;
	}
	
	/**
	 * Return the GoToModelElementMarker of a LeafConstrainingNode.
	 * 
	 * @param leafConstrainingNode
	 *            the selected leafConstrainingNode
	 * @return the GoToModelElementMarker of a LeafConstrainingNode.
	 */
	public GoToConstrainingMarker getLeafConstrainingNodeMarker(@NonNull LeafConstrainingNode leafConstrainingNode){
		Resource resource = leafConstrainingNode.getConstraintResource();		
		if (resource != null) {
			IFile file = findFile(resource);
			if (file != null) {
				return new GoToConstrainingMarker(file);
			}
		}
		return null;
	}

	@Override
	public void run() {
		ISelection selection = selectionProvider.getSelection();
		if (selection instanceof StructuredSelection) {
			Object selectedObject = ((StructuredSelection) selection).getFirstElement();
			ValidityModel model = validityManager.getModel();
			IWorkbenchPage activePage = getActivePage();
			if (!(selectedObject instanceof AbstractNode) || activePage == null || model == null) {
				return;
			}
			
			IMarker goToMarker = findGoToMarker(model, (AbstractNode) selectedObject);
			if (goToMarker != null) {
				try {
					IDE.openEditor(activePage, goToMarker);
				} catch (PartInitException exception) {
					Logger.getLogger().log(Logger.SEVERE, "Failed to open in the Editor ", exception); //$NON-NLS-1$
					EcorePlugin.INSTANCE.log(exception);
				}
			}
		}
	}
	
	private @Nullable IMarker findGoToMarker(ValidityModel model, AbstractNode node) {
		IMarker goToMarker = null;
		if (node instanceof ResultConstrainingNode) {
			ResultConstrainingNode resultConstrainingNode = (ResultConstrainingNode) node;
			ValidatableNode validatableNode = resultConstrainingNode.getResultValidatableNode().getParent();
			if (validatableNode != null && getModelElementMarker(validatableNode) != null) {
				goToMarker = getModelElementMarker(validatableNode).getIMarker();
			}
		} else if (node instanceof ResultValidatableNode) {
			ResultValidatableNode validatableNode = (ResultValidatableNode) node;
			ConstrainingNode constrainingNode = validatableNode.getResultConstrainingNode().getParent();
			if (constrainingNode instanceof LeafConstrainingNode && getLeafConstrainingNodeMarker((LeafConstrainingNode) constrainingNode) != null) {
				goToMarker = getLeafConstrainingNodeMarker((LeafConstrainingNode) constrainingNode).getIMarker();
			}
		} else if (node instanceof LeafConstrainingNode && getLeafConstrainingNodeMarker((LeafConstrainingNode) node) !=null){
			goToMarker = getLeafConstrainingNodeMarker((LeafConstrainingNode) node).getIMarker();
		} else if (node instanceof ValidatableNode && getModelElementMarker((ValidatableNode) node) !=null){
			goToMarker = getModelElementMarker((ValidatableNode) node).getIMarker();
		}
		return goToMarker;
	}
	
	private @Nullable IWorkbenchPage getActivePage() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench != null) {
			IWorkbenchWindow activeWindow = workbench.getActiveWorkbenchWindow();
			if (activeWindow != null) {
				return activeWindow.getActivePage();
			}
		}
		return null;
	}
}