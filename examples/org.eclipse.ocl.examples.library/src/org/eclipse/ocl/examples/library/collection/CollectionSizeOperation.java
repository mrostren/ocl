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
 * $Id: CollectionSizeOperation.java,v 1.1.2.4 2011/01/08 15:34:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * CollectionSizeOperation realises the Collection::size() library operation.
 * 
 * @since 3.1
 */
public class CollectionSizeOperation extends AbstractCollectionUnaryOperation
{
	public static final CollectionSizeOperation INSTANCE = new CollectionSizeOperation();

	@Override
	protected IntegerValue evaluateCollection(ValueFactory valueFactory, CollectionValue sourceVal) {
		return sourceVal.size();
	}
}