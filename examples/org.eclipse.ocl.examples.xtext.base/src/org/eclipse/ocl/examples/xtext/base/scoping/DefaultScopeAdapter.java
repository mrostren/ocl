/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: DefaultScopeAdapter.java,v 1.1 2010/05/03 05:24:44 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping;

import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.AbstractScopeAdapter;

/**
 * Scopes that are accidentally empty; a debugging aid.
 */
public class DefaultScopeAdapter extends AbstractScopeAdapter<ElementCS>
{
	public DefaultScopeAdapter(ElementCS csElement) {
		super(csElement);
	}
}