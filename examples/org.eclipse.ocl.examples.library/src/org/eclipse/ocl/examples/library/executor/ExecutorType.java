/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class ExecutorType implements DomainType
{
	public abstract ExecutorType getCommonType(DomainType type, ValueFactory valueFactory);

	public ExecutorType getOclAnyType(ValueFactory valueFactory) {
		return (ExecutorType) valueFactory.getStandardLibrary().getOclAnyType(); 	// FIXME cast
	}

	public abstract LibraryFeature lookupImplementation(ExecutorOperation staticOperation);
}