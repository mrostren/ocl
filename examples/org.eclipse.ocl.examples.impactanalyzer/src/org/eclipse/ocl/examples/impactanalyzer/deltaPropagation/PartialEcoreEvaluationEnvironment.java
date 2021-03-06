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
package org.eclipse.ocl.examples.impactanalyzer.deltaPropagation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.opposites.ExtentMap;
import org.eclipse.ocl.examples.impactanalyzer.ValueNotFoundException;
import org.eclipse.ocl.examples.impactanalyzer.util.EcoreEvaluationEnvironmentWithScopedExtentMap;
import org.eclipse.ocl.expressions.VariableExp;



public class PartialEcoreEvaluationEnvironment extends EcoreEvaluationEnvironmentWithScopedExtentMap {
    private final Map<String, Object> map = new HashMap<String, Object>();
    
    /**
     * Passed by the constructing environment factory; used to construct a useful {@link ExtentMap}
     * in case the <code>context</code> object is null.
     */
    private final Object valueOfSourceExpression;
    
    public PartialEcoreEvaluationEnvironment(PartialEcoreEnvironmentFactory factory, Object valueOfSourceExpression) {
        super(factory);
        this.valueOfSourceExpression = valueOfSourceExpression;
    }
    
    public PartialEcoreEvaluationEnvironment(
            EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
        super(parent);
        this.valueOfSourceExpression = ((PartialEcoreEvaluationEnvironment) parent).valueOfSourceExpression;
    }

    /**
     * In addition to the base class implementation, an {@link ExtentMap} is also used if
     * <code>context</code> is null but the 
     */
    @Override
    public Map<EClass, Set<EObject>> createExtentMap(Object context) {
        if (context != null || !(valueOfSourceExpression instanceof Notifier)) {
            return super.createExtentMap(context);
        } else {
            // try with value of source expression instead
            return new ExtentMap((Notifier) valueOfSourceExpression, getFactory().getOppositeEndFinder());
        }
    }

    /**
     * Returns the value associated with the supplied name. If no value has been set
     * previously, a {@link ValueNotFoundException} is thrown.
     * 
     * @param name
     *            the name whose value is to be returned
     * @return the value associated with the name
     */
    @Override
    public Object getValueOf(String name) {
        if (!map.containsKey(name)) {
            throw new ValueNotFoundException(name);
        }
        return map.get(name);
    }

    public Object getValueOf(VariableExp<EClassifier, EParameter> v) {
        String name = v.getReferredVariable().getName();
        if (!map.containsKey(name)) {
            throw new ValueNotFoundException(name, v);
        }
        return map.get(name);
    }

    /**
     * Replaces the current value of the supplied name with the supplied value.
     * 
     * @param name
     *            the name
     * @param value
     *            the new value
     */
    public void replace(String name, Object value) {
        map.put(name, value);
    }

    /**
     * Adds the supplied name and value binding to the environment
     * 
     * @param name
     *            the name to add
     * @param value
     *            the associated binding
     */
    public void add(String name, Object value) {
        if (map.containsKey(name)) {
            String message = "The name: "+name+" already has a binding: "+map.get(name);
            throw new IllegalArgumentException(message);
        }
        // A null value for self means that no context is being set during partial evaluation.
        // To cause an exception to be thrown upon access to self, we don't enter it.
        if (!Environment.SELF_VARIABLE_NAME.equals(name) || value != null) {
            map.put(name, value);
        }
    }

    /**
     * Removes the supplied name and binding from the environment (if it exists)
     * and returns it.
     * 
     * @param name
     *            the name to remove
     * @return the value associated with the removed name
     */
    public Object remove(String name) {
        return map.remove(name);
    }

    /**
     * Clears the environment of variables.
     */
    public void clear() {
        map.clear();
    }

    /**
     * Returns a string representation of the bindings
     */
    @Override
    public String toString() {
        return map.toString();
    }

}
