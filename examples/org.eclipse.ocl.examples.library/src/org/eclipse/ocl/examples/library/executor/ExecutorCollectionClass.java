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
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class ExecutorCollectionClass extends ExecutorType implements DomainCollectionType
{
	protected final ExecutorClass containerClass;
	protected final DomainType elementClass;
	
	public ExecutorCollectionClass(ExecutorClass containerClass, DomainType elementClass) {
		this.containerClass = containerClass;
		this.elementClass = elementClass;
	}

	@Override
	public ExecutorType getCommonType(DomainType type, ValueFactory valueFactory) {
		if (!(type instanceof ExecutorCollectionClass)) {
			return getOclAnyType(valueFactory);
		}
		ExecutorCollectionClass thatClass = (ExecutorCollectionClass) type;
		// FIXME kind
		ExecutorClass commonContainerClass = containerClass;		// FIXME WIP
		DomainType commonElementClass = elementClass.getCommonType(thatClass.elementClass, valueFactory);
		if ((commonContainerClass == containerClass) && (commonElementClass == elementClass)) {
			return this;
		}
		else if ((commonContainerClass == thatClass.containerClass) && (commonElementClass == thatClass.elementClass)) {
			return thatClass;
		}
		else {
			return ((ExecutorStandardLibrary)valueFactory.getStandardLibrary()).getCollectionType(commonContainerClass, commonElementClass);
		}
	}

	public DomainType getElementType() {
		return elementClass;
	}

	public DomainType getInstanceType() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public LibraryFeature lookupImplementation(ExecutorOperation operation) {
		return containerClass.lookupImplementation(operation);
	}

	@Override
	public String toString() {
		return String.valueOf(containerClass) + "<" + String.valueOf(elementClass) + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}