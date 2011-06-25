/**
 * <copyright>
 *
 * Copyright (c) 2005,2011 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   C.Damus - 291365
 *
 * </copyright>
 *
 * $Id: PivotEvaluationEnvironment.java,v 1.4 2011/02/11 20:00:29 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.evaluation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;

/**
 * Implementation of the {@link EvaluationEnvironment} for evaluation of OCL
 * expressions on instances of Ecore models (i.e., on M0 models).
 * 
 * @author Tim Klinger (tklinger)
 * @author Christian W. Damus (cdamus)
 */
public class PivotEvaluationEnvironment extends AbstractEvaluationEnvironment {

    /**
     * Initializes me.
     */
    public PivotEvaluationEnvironment(TypeManager typeManager) {
        super(typeManager);
    }

    /**
     * Initializes me with my parent evaluation environment (nesting scope).
     * 
     * @param parent
     *            my parent (nesting scope); must not be <code>null</code>
     */
    public PivotEvaluationEnvironment(EvaluationEnvironment parent) {
        super(parent);
    }
    
    // implements the inherited specification
    public DomainModelManager createModelManager(Object object) {
        if (object instanceof ObjectValue) {
            object = ((ObjectValue) object).getObject();
        }
        if (object instanceof EObject) {
            return new PivotModelManager(typeManager, (EObject) object);
        }
        return DomainModelManager.NULL;
    }

    public Value navigateAssociationClass(Type associationClass,
    		Property navigationSource, Object source)
    		throws IllegalArgumentException {
    	throw new UnsupportedOperationException(getClass().getName() + ".navigateAssociationClass");
    }

    public Type getType(Object object) {
    	throw new UnsupportedOperationException(getClass().getName() + ".getType");
    }

	public ValueFactory getValueFactory() {
		return typeManager.getValueFactory();
	}
}