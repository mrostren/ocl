/*******************************************************************************
 * Copyright (c) 2009, 2010 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.eventmanager.framework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.eventmanager.filters.NewValueClassFilterIncludingSubclasses;
import org.eclipse.ocl.examples.eventmanager.filters.StructuralFeatureFilter;

/**
 * The AssociationFilterTable manages all Registrations containing
 * {@link StructuralFeatureFilter}.
 * 
 * @see org.eclipse.ocl.examples.eventmanager.framework.TableForEventFilter.tc.moin.repository.events.framework.EventFilterTable
 * @author Daniel Vocke (D044825)
 */
public class TableForNewValueClassFilterIncludingSubclasses extends TableForEventFilter {

    public TableForNewValueClassFilterIncludingSubclasses(int numberOfFilterTables) {
        super(numberOfFilterTables);
    }

    /**
     * @return the affected meta object of <code>LinkChangedEvents</code>. If the event is not of type
     * <code>LinkChangeEvent</code>, <code>null</code> is returned.
     */
    public Object getAffectedObject(Notification event) {
        if (isEmpty() || event.getNewValue() == null)
            return null;
        Collection<EClass> result = new HashSet<EClass>();
        if (event.getNewValue() instanceof EObject) {
            EClass eClass = ((EObject) event.getNewValue()).eClass();
            result.add(eClass);
            result.addAll(eClass.getEAllSuperTypes());
            return result;

        } else if (event.getNewValue() instanceof EList<?>) {
            for (Object o : ((EList<?>) event.getNewValue())) {
                if (o instanceof EObject) {
                    EClass eClass = ((EObject) o).eClass();
                    result.add(eClass);
                    result.addAll(eClass.getEAllSuperTypes());
                }
            }

        } else {
            return null;
        }
        return result;
    }

    @Override
    public Class<NewValueClassFilterIncludingSubclasses> getIdentifier() {
        return NewValueClassFilterIncludingSubclasses.class;
    }

    @Override
    protected String criterionToString(Object criterion) {
        StringBuilder result = new StringBuilder();
        if (criterion instanceof EClass) {
            result.append(((EClass) criterion).getName());
        } else {
            Set<?> eClassSet = (Set<?>) criterion;
            boolean first = true;
            for (Object eClass : eClassSet) {
                if (!first) {
                    result.append(", ");
                } else {
                    result.append(((EClass) eClass).getName());
                }
            }
        }
        return result.toString();
    }
}
