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
package org.eclipse.emf.validation.debug.ui.messages;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 */
public class ValidationDebugMessages
{	
	static {
		NLS.initializeMessages(ValidationDebugMessages.class.getName(), ValidationDebugMessages.class);
	}

	public static String ValidityView_viewTitle;
	public static String ValidityView_validatableNodesSectionName;
	public static String ValidityView_constrainingNodesSectionName;
	
	public static String ValidityView_Constraints_LabelProvider_UnexistingResource;
	public static String ValidityView_Constraints_LabelProvider_UnattainableExpression;
	public static String ValidityView_Messages_NoModelElement;
	public static String ValidityView_Messages_NoConstraints;
	public static String ValidityView_Messages_NoSelection;

	public static String ValidityView_Action_ShowInEditor_Title;
	public static String ValidityView_Action_ShowInEditor_ToolTipText;
	public static String ValidityView_Action_ShowInEditor_ImageLocation;
	
	public static String ValidityView_Action_RunValidity_Title;
	public static String ValidityView_Action_RunValidity_ImageLocation;
	public static String ValidityView_Action_RunValidity_ToolTipText;

	public static String ValidityView_Action_FilterResult_Title;
	public static String ValidityView_Action_FilterResult_ImageLocation;
	public static String ValidityView_Action_FilterResult_ToolTipText;

	public static String ValidityView_Action_SelectAllNodes_Title;
	public static String ValidityView_Action_SelectAllNodes_ToolTipText;
	public static String ValidityView_Action_SelectAllNodes_ImageLocation;

	public static String ValidityView_Action_DeselectAllNodes_Title;
	public static String ValidityView_Action_DeselectAllNodes_ToolTipText;
	public static String ValidityView_Action_DeselectAllNodes_ImageLocation;
	
	public static String ValidityView_Action_ShowHideUnusedNodes_Title;
	public static String ValidityView_Action_HideUnusedNodes_ToolTipText;
	public static String ValidityView_Action_ShowUnusedNodes_ToolTipText;
	public static String ValidityView_Action_ShowUnusedNodes_ImageLocation;
	public static String ValidityView_Action_HideUnusedNodes_ImageLocation;

	public static String ValidityView_Action_ShowNodesByKind_Title;
	public static String ValidityView_Action_ShowNodesByKind_Kind_Failure;
	public static String ValidityView_Action_ShowNodesByKind_Kind_Error;
	public static String ValidityView_Action_ShowNodesByKind_Kind_Warning;
	public static String ValidityView_Action_ShowNodesByKind_Kind_Info;
	public static String ValidityView_Action_ShowNodesByKind_Kind_OK;
	public static String ValidityView_Action_ShowNodesByKind_ToolTipText;
	public static String ValidityView_Action_ShowFailedElementsNodes_ToolTipText;
}