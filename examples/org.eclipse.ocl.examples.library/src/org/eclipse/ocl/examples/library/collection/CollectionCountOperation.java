/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: CollectionCountOperation.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.ocl.examples.pivot.values.CollectionUtil;

/**
 * CollectionCountOperation realises the Collection::count() library operation.
 * 
 * @since 3.1
 */
public class CollectionCountOperation extends AbstractCollectionBinaryOperation
{
	public static final CollectionCountOperation INSTANCE = new CollectionCountOperation();

	@Override
	protected Object evaluateCollection(Collection<?> sourceVal, Object argVal) {
		return BigInteger.valueOf(CollectionUtil.count(sourceVal, argVal));
	}
}