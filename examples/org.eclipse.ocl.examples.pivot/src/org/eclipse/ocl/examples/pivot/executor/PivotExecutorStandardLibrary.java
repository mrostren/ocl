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
package org.eclipse.ocl.examples.pivot.executor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.types.DomainClassifierType;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainTupleType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.library.executor.ExecutorClass;
import org.eclipse.ocl.examples.library.executor.ExecutorCollectionClass;
import org.eclipse.ocl.examples.library.executor.ExecutorTuplePart;
import org.eclipse.ocl.examples.library.executor.ExecutorTupleType;
import org.eclipse.ocl.examples.pivot.PivotTables;


public class PivotExecutorStandardLibrary implements DomainStandardLibrary
{
	public static final PivotExecutorStandardLibrary INSTANCE = new PivotExecutorStandardLibrary();
	
	private Map<DomainType, Map<DomainType, ExecutorCollectionClass>> specializations = new HashMap<DomainType, Map<DomainType, ExecutorCollectionClass>>();
	private Map<String, Map<DomainType, DomainTypedElement>> tupleProperties = new HashMap<String, Map<DomainType, DomainTypedElement>>();
	private Map<String, List<DomainTupleType>> tupleTypeMap = new HashMap<String, List<DomainTupleType>>();

	public PivotExecutorStandardLibrary() {
		PivotTables.PACKAGE.getClass();
	}
	
	public ExecutorClass getBagType() {
		return PivotTables.Classes._Bag;
	}

	public DomainCollectionType getBagType(DomainType elementType) {
		return getCollectionType(getBagType(), elementType);
	}

	public DomainType getBooleanType() {
		return PivotTables.Classes._Boolean;
	}

	public DomainType getClassifierType() {
		return PivotTables.Classes._Classifier;
	}

	public DomainClassifierType getClassifierType(DomainType classType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainType getCollectionType() {
		return PivotTables.Classes._Collection;
	}

	public ExecutorCollectionClass getCollectionType(ExecutorClass genericType, DomainType elementType) {
		ExecutorCollectionClass specializedType = null;
		Map<DomainType, ExecutorCollectionClass> map = specializations.get(genericType);
		if (map == null) {
			map = new HashMap<DomainType, ExecutorCollectionClass>();
			specializations.put(genericType, map);
		}
		else {
			specializedType = map.get(elementType);
		}
		if (specializedType == null) {
			specializedType = new ExecutorCollectionClass(genericType, elementType);
			map.put(elementType, specializedType);
		}
		return specializedType;
	}

	public DomainType getEnumerationType() {
		return PivotTables.Classes._Enumeration;
	}

	public DomainType getIntegerType() {
		return PivotTables.Classes._Integer;
	}

	public DomainType getOclAnyType() {
		return PivotTables.Classes._OclAny;
	}

	public DomainType getOclInvalidType() {
		return PivotTables.Classes._OclInvalid;
	}

	public DomainType getOclMessageType() {
		return PivotTables.Classes._OclMessage;
	}

	public DomainType getOclVoidType() {
		return PivotTables.Classes._OclVoid;
	}

	public ExecutorClass getOrderedSetType() {
		return PivotTables.Classes._OrderedSet;
	}

	public DomainCollectionType getOrderedSetType(DomainType elementType) {
		return getCollectionType(getOrderedSetType(), elementType);
	}

	public DomainType getRealType() {
		return PivotTables.Classes._Real;
	}

	public ExecutorClass getSequenceType() {
		return PivotTables.Classes._Sequence;
	}

	public DomainCollectionType getSequenceType(DomainType elementType) {
		return getCollectionType(getSequenceType(), elementType);
	}

	public ExecutorClass getSetType() {
		return PivotTables.Classes._Set;
	}

	public DomainCollectionType getSetType(DomainType elementType) {
		return getCollectionType(getSetType(), elementType);
	}

	public DomainType getStringType() {
		return PivotTables.Classes._String;
	}

	public DomainType getUnlimitedNaturalType() {
		return PivotTables.Classes._UnlimitedNatural;
	}

	public boolean isOrdered(DomainCollectionType collectionValueType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public boolean isUnique(DomainCollectionType collectionValueType) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public DomainTypedElement getTuplePart(String name, DomainType type) {
		Map<DomainType, DomainTypedElement> typeMap = tupleProperties.get(name);
		if (typeMap == null) {
			typeMap = new HashMap<DomainType, DomainTypedElement>();
			tupleProperties.put(name, typeMap);
		}
		DomainTypedElement tupleProperty = typeMap.get(type);
		if (tupleProperty == null) {
			tupleProperty = new ExecutorTuplePart(type, name);
			typeMap.put(type, tupleProperty);
		}
		return tupleProperty;
	}

	public DomainTupleType getTupleType(List<? extends DomainTypedElement> parts) {
		StringBuffer s = new StringBuffer();
		for (DomainTypedElement part : parts) {
			s.append(part.getName());
			s.append("\n"); //$NON-NLS-1$
		}
		String key = s.toString();
		List<DomainTupleType> tupleTypes = tupleTypeMap.get(key);
		if (tupleTypes != null) {
			for (DomainTupleType tupleType : tupleTypes) {
				int i = 0;
				for (; i < parts.size(); i++) {
					List<? extends DomainTypedElement> ownedAttributes = tupleType.getOwnedAttributes();
					if (ownedAttributes.get(i).getType() != parts.get(i).getType()) {
						break;
					}
				}
				if (i >= parts.size()) {
					return tupleType;
				}
			}
		}
		else {
			tupleTypes = new ArrayList<DomainTupleType>();
			tupleTypeMap.put(key, tupleTypes);
		}
		DomainTupleType tupleType = new ExecutorTupleType(parts);
		tupleTypes.add(tupleType);
		return tupleType;
	}
}
