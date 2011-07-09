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

import java.util.List;

import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.library.LibraryFeature;
import org.eclipse.ocl.examples.domain.types.DomainTupleType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class ExecutorTupleType extends ExecutorType implements DomainTupleType
{
	private List<? extends DomainTypedElement> parts;
	
	public ExecutorTupleType(List<? extends DomainTypedElement> parts) {
		this.parts = parts;
	}

	public List<? extends DomainTypedElement> getOwnedAttributes() {
		return parts;
	}

	@Override
	public ExecutorType getCommonType(DomainType type, ValueFactory valueFactory) {
		if (type != this) {
			return getOclAnyType(valueFactory);
		}
		return this;
	}

	@Override
	public LibraryFeature lookupImplementation(ExecutorOperation staticOperation) {
		// TODO Auto-generated method stub
		return null;
	}
}