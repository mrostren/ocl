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
 * $Id: OCLinEcoreCSTUtils.java,v 1.1 2010/04/13 06:44:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.util;

import org.eclipse.emf.ecore.ETypedElement;

public class OCLinEcoreCSTUtils
{
	public static void setMultiplicity1(ETypedElement typedElement, String newMultiplicity) {
		int lower = 0;
		int upper = 0;
		if ("*".equals(newMultiplicity)) {
			upper = -1;
		}
		else if ("+".equals(newMultiplicity)) {
			lower = -1;
			upper = -1;
		}
		else if ("?".equals(newMultiplicity)) {
			upper = 1;
		}
		else {
			throw new IllegalArgumentException(newMultiplicity);
		}
	}
}