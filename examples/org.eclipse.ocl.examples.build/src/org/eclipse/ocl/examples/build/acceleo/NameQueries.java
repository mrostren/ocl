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
 * $Id: NameQueries.java,v 1.2 2011/01/24 20:54:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.acceleo;

import java.util.List;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.SelfType;

public class NameQueries
{
	private static int counter = 1;
	
	/**
	 * Return a symbol name for an eObject. This method is invoked from an
	 * Acceleo script and so there is only one call per distinct object. Acceleo
	 * maintains the cache that returns the symbol for old objects.
	 * 
	 * @param eObject the object in question
	 * @return the symbol name
	 */
	public static String getClassName(Class<?> javaClass) {
		return javaClass.getCanonicalName();
	}
	
	/**
	 * Return a symbol name for an eObject. This method is invoked from an
	 * Acceleo script and so there is only one call per distinct object. Acceleo
	 * maintains the cache that returns the symbol for old objects.
	 * 
	 * @param eObject the object in question
	 * @return the symbol name
	 */
	public static String getSymbolName(Object eObject) {
		return "symbol_" + counter++;
	}
	
	public static Boolean isBinarySelf(OperationCallExp callExp) {
		if (callExp == null) {
			return false;
		}
		Operation operation = callExp.getReferredOperation();
		if (operation == null) {
			return false;
		}
		List<Parameter> parameters = operation.getOwnedParameters();
		if (parameters.size() != 1) {
			return false;
		}
		return parameters.get(0).getType() instanceof SelfType;
	}
}
