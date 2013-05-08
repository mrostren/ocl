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
package org.eclipse.emf.validation.debug.ui.view;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.DecoratingColumLabelProvider;
import org.eclipse.emf.validation.debug.ui.actions.LockValidatableNodesAction;
import org.eclipse.emf.validation.debug.ui.actions.RunValidityAction;
import org.eclipse.emf.validation.debug.ui.actions.SelectAllConstrainingNodesAction;
import org.eclipse.emf.validation.debug.ui.actions.SelectAllValidatableNodesAction;
import org.eclipse.emf.validation.debug.ui.actions.StopValidityAction;
import org.eclipse.emf.validation.debug.validity.AbstractNode;
import org.eclipse.emf.validation.debug.validity.ResultConstrainingNode;
import org.eclipse.emf.validation.debug.validity.ResultValidatableNode;
import org.eclipse.emf.validation.debug.validity.RootNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

/**
 * The ValidityView provides a dual view of ValidatableNode model elements and
 * ConstrainingNode model classes to browse, filter and control model validation. 
 */
public class ValidityView extends ViewPart implements ISelectionListener
{
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final @NonNull String ID = "org.eclipse.emf.validation.debug.ui.validity";

	protected final @NonNull IDEValidityManager validityManager;
	private final @NonNull ValidityViewRefreshJob refreshJob = new ValidityViewRefreshJob();
	protected ResourceSet modelResourceSet = null;
	private CheckboxTreeViewer validatableNodesViewer;
	private CheckboxTreeViewer constrainingNodesViewer;
	private Action lockValidatableNodesAction;
	private Action runValidationAction;
	private Action stopValidationAction;
	private Action selectAllValidatableNodesAction;
	private Action selectAllConstrainingNodesAction;
	private Action constrainingNodesDoubleClickAction;
	private Action validatableNodesDoubleClickAction;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view.
	 */
	 
	private static final class AbstractNodeCheckStateListener implements ICheckStateListener
	{
		public void checkStateChanged(CheckStateChangedEvent event) {
			AbstractNode element = (AbstractNode) event.getElement();
			boolean checked = event.getChecked();
			element.setEnabled(checked);
		}
	}

	class DecoratingNodeLabelProvider extends DecoratingColumLabelProvider
	{
		public DecoratingNodeLabelProvider(@NonNull ILabelProvider nodeLabelProvider,
				@NonNull SeveritiesDecorator severitiesDecorator) {
			super(nodeLabelProvider, new SeveritiesDecorator(validityManager));
			cellLabelProvider = (CellLabelProvider) nodeLabelProvider;
		}
	}

//	class NameSorter extends ViewerSorter {
//	}

	public ValidityView() {
		validityManager = new IDEValidityManager(refreshJob);
	    modelResourceSet = new ResourceSetImpl();
	}

	private void contributeToActionBars() {
		@SuppressWarnings("null")@NonNull IActionBars bars = getViewSite().getActionBars();
		@SuppressWarnings("null")@NonNull IMenuManager menuManager = bars.getMenuManager();
		fillLocalPullDown(menuManager);
		@SuppressWarnings("null")@NonNull IToolBarManager toolBarManager = bars.getToolBarManager();
		fillLocalToolBar(toolBarManager);
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {
		Color blackColor = parent.getDisplay().getSystemColor(SWT.COLOR_BLACK);
		Color blueColor = parent.getDisplay().getSystemColor(SWT.COLOR_BLUE);
	    ILabelProvider labelProvider = new AdapterFactoryLabelProvider(validityManager.getAdapterFactory());
		ILabelProvider nodeLabelProvider = new AbstractNodeLabelProvider(labelProvider, blackColor, blueColor);
		IContentProvider validatableContentProvider = new ValidatableNodeContentProvider(validityManager, nodeLabelProvider);
		IContentProvider constrainingNodeContentProvider = new ConstrainingNodeContentProvider(validityManager, nodeLabelProvider);
		ICheckStateProvider nodeCheckStateProvider = new AbstractNodeCheckStateProvider();
		ICheckStateListener nodeCheckStateListener = new AbstractNodeCheckStateListener();
	    ILabelProvider nodeDecoratingLabelProvider = new DecoratingNodeLabelProvider(nodeLabelProvider, new SeveritiesDecorator(validityManager));
        Composite sash = new SashForm(parent, SWT.NONE);
/*        {
	        GridLayout layout = new GridLayout(2, true);
	        layout.marginBottom = 0;
	        layout.marginLeft = 0;
	        layout.marginRight = 0;
	        layout.marginTop = 0;
			composite.setLayout(layout);        
	        GridData gridData = new GridData(GridData.FILL_BOTH);
	        gridData.grabExcessHorizontalSpace = true;
	        gridData.grabExcessVerticalSpace = true;
	        composite.setLayoutData(gridData);
        } */
        CheckboxTreeViewer validatableNodesViewer2;
		{
            Composite validatableNodesComposite = new Composite(sash, SWT.BORDER);
            {
    	        GridLayout layout = new GridLayout(1, true);
    	        layout.marginBottom = 0;
    	        layout.marginLeft = 0;
    	        layout.marginRight = 0;
    	        layout.marginTop = 0;
    	        validatableNodesComposite.setLayout(layout);
    	        GridData gridData = new GridData(GridData.FILL_BOTH);
    	        gridData.grabExcessHorizontalSpace = true;
    	        gridData.grabExcessVerticalSpace = true;
    	        validatableNodesComposite.setLayoutData(gridData);
            }
            Label validatableNodesTitle = new Label(validatableNodesComposite, 0);
            validatableNodesTitle.setText("Validateable Model Elements");
			Tree validatableNodesTree = new Tree(validatableNodesComposite, SWT.CHECK | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	        GridData gridData = new GridData(GridData.FILL_BOTH);
	        gridData.grabExcessHorizontalSpace = true;
	        gridData.grabExcessVerticalSpace = true;
	        validatableNodesTree.setLayoutData(gridData);
		    validatableNodesViewer = validatableNodesViewer2 = new CheckboxTreeViewer(validatableNodesTree);
		    validatableNodesViewer2.addCheckStateListener(nodeCheckStateListener);
        }
		CheckboxTreeViewer constrainingNodesViewer2;
		{
            Composite constrainingNodesComposite = new Composite(sash, SWT.BORDER);
            {
    	        GridLayout layout = new GridLayout(1, true);
    	        layout.marginBottom = 0;
    	        layout.marginLeft = 0;
    	        layout.marginRight = 0;
    	        layout.marginTop = 0;
    	        constrainingNodesComposite.setLayout(layout);        
    	        GridData gridData = new GridData(GridData.FILL_BOTH);
    	        gridData.grabExcessHorizontalSpace = true;
    	        gridData.grabExcessVerticalSpace = true;
    	        constrainingNodesComposite.setLayoutData(gridData);
            }
            Label constrainingNodesTitle = new Label(constrainingNodesComposite, 0);
            constrainingNodesTitle.setText("Constraining Model Elements");
			Tree constrainingNodesTree = new Tree(constrainingNodesComposite, SWT.CHECK | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	        GridData gridData = new GridData(GridData.FILL_BOTH);
	        gridData.grabExcessHorizontalSpace = true;
	        gridData.grabExcessVerticalSpace = true;
	        constrainingNodesTree.setLayoutData(gridData);
		    constrainingNodesViewer = constrainingNodesViewer2 = new CheckboxTreeViewer(constrainingNodesTree);
			constrainingNodesViewer2.addCheckStateListener(nodeCheckStateListener);
		}
		
		
		
		validatableNodesViewer2.setContentProvider(validatableContentProvider);
		validatableNodesViewer2.setLabelProvider(nodeDecoratingLabelProvider);
		validatableNodesViewer2.setCheckStateProvider(nodeCheckStateProvider);
	    
		constrainingNodesViewer2.setContentProvider(constrainingNodeContentProvider);
	    constrainingNodesViewer2.setLabelProvider(nodeDecoratingLabelProvider);
	    constrainingNodesViewer2.setCheckStateProvider(nodeCheckStateProvider);
	    
/*	    validatableNodesViewer.getTree().addMouseTrackListener(new MouseTrackListener(){

			public void mouseEnter(MouseEvent e) {}

			public void mouseExit(MouseEvent e) {}

			public void mouseHover(MouseEvent e) {
				showMessage("Mouse hover at " + e.x + " : " + e.y);
//				validatableNodesViewer.getTree().g
			}
		}); */
//		viewer.setSorter(new NameSorter());
		
		// Create the help context id for the viewer's control
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.eclipse.ocl.modelregistry.explorer.viewer");
		makeActions();
		hookContextMenu();
		hookConstrainingNodesDoubleClickAction();
		hookValidatableNodesDoubleClickAction();
		contributeToActionBars();
		ISelectionService service = (ISelectionService) getSite().getService(ISelectionService.class);
		if (service != null) {
			service.addSelectionListener(this);
			ISelection selection = service.getSelection();
			Notifier input = SelectionUtil.getNotifierSelection(selection, this);
			validityManager.setInput(input);
		}
		refreshJob.initViewers(validatableNodesViewer2, constrainingNodesViewer2);
		Dialog.applyDialogFont(parent);
		ColumnViewerToolTipSupport.enableFor(validatableNodesViewer2);
		ColumnViewerToolTipSupport.enableFor(constrainingNodesViewer2);
	}

	@Override
	public void dispose() {
		ISelectionService service = (ISelectionService) getSite().getService(ISelectionService.class);
		if (service != null) {
			service.removeSelectionListener(this);
		}
		super.dispose();
	}

	private void fillContextMenu(@NonNull IMenuManager manager) {
		manager.add(lockValidatableNodesAction);
		manager.add(selectAllValidatableNodesAction);
		manager.add(selectAllConstrainingNodesAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		manager.add(runValidationAction);
		manager.add(stopValidationAction);
	}

	private void fillLocalPullDown(@NonNull IMenuManager manager) {
		manager.add(lockValidatableNodesAction);
		manager.add(new Separator());
		manager.add(selectAllValidatableNodesAction);
		manager.add(selectAllConstrainingNodesAction);
		manager.add(new Separator());
		manager.add(runValidationAction);
		manager.add(stopValidationAction);
	}
	
	private void fillLocalToolBar(@NonNull IToolBarManager manager) {
		manager.add(lockValidatableNodesAction);
		manager.add(runValidationAction);
		manager.add(stopValidationAction);
		manager.add(selectAllValidatableNodesAction);
		manager.add(selectAllConstrainingNodesAction);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				@SuppressWarnings("null")@NonNull IMenuManager manager2 = manager;
				ValidityView.this.fillContextMenu(manager2);
			}
		});
		Menu menu = menuMgr.createContextMenu(validatableNodesViewer.getControl());
		validatableNodesViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, validatableNodesViewer);
	}

	private void hookConstrainingNodesDoubleClickAction() {
		constrainingNodesViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				constrainingNodesDoubleClickAction.run();
			}
		});
	}

	private void hookValidatableNodesDoubleClickAction() {
		validatableNodesViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				validatableNodesDoubleClickAction.run();
			}
		});
	}

	private void makeActions() {
		lockValidatableNodesAction = new LockValidatableNodesAction();
		runValidationAction = new RunValidityAction(validityManager);
		stopValidationAction = new StopValidityAction(validityManager);
		selectAllValidatableNodesAction = new SelectAllValidatableNodesAction(validityManager);		
		selectAllConstrainingNodesAction = new SelectAllConstrainingNodesAction(validityManager);
		constrainingNodesDoubleClickAction = new Action() {
			@Override
			public void run() {
				ISelection selection = constrainingNodesViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
				if (obj instanceof ResultConstrainingNode) {
					ResultValidatableNode resultValidatableNode = ((ResultConstrainingNode)obj).getResultValidatableNode();
					validatableNodesViewer.setSelection(new StructuredSelection(resultValidatableNode), true);
				}
			}
		};
		validatableNodesDoubleClickAction = new Action() {
			@Override
			public void run() {
				ISelection selection = validatableNodesViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
				if (obj instanceof ResultValidatableNode) {
					ResultConstrainingNode resultConstrainingNode = ((ResultValidatableNode)obj).getResultConstrainingNode();
					constrainingNodesViewer.setSelection(new StructuredSelection(resultConstrainingNode), true);
				}
			}
		};
	}

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
//		System.out.println("selectionChanged to " + selection);
		if (lockValidatableNodesAction.isChecked()) {
			return;
		}
		Notifier input = SelectionUtil.getNotifierSelection(selection, part);
		validityManager.setInput(input);
		if (validatableNodesViewer.getInput() != input) {
			RootNode rootNode = validityManager.getRootNode();
			validatableNodesViewer.setInput(rootNode);
			constrainingNodesViewer.setInput(rootNode);
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		validatableNodesViewer.getControl().setFocus();
	}

/*	private void showMessage(String message) {
		MessageDialog.openInformation(
			validatableNodesViewer.getControl().getShell(),
			"Validations View",
			message);
	} */
}