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

import org.eclipse.emf.validation.debug.validity.AbstractNode;
import org.eclipse.jface.viewers.ICheckStateProvider;

public class AbstractNodeCheckStateProvider implements ICheckStateProvider
{
	public boolean isChecked(Object element) {
		AbstractNode node = (AbstractNode) element;
		return node.isEnabled();
	}

	public boolean isGrayed(Object element) {
		AbstractNode node = (AbstractNode) element;
		boolean enabled = node.isEnabled();
		return enabled ? !node.isAllChildrenEnabled() : !node.isAllChildrenDisabled();
	}
}
