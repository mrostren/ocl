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
 * $Id: ClassifierOclContainerOperation.java,v 1.2 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.classifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.values.ObjectValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * ClassifierOclContainerOperation realises the Classifier::oclContainer() library operation.
 * 
 * @since 3.1
 */
public class ClassifierOclContainerOperation extends AbstractOperation
{
	public static final ClassifierOclContainerOperation INSTANCE = new ClassifierOclContainerOperation();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, OperationCallExp operationCall) throws InvalidValueException {
		TypeManager typeManager = evaluationVisitor.getTypeManager();
		ValueFactory valueFactory = typeManager.getValueFactory();
		ObjectValue objectVal = sourceVal.asObjectValue();
		Object object = objectVal.getObject();
		if (!(object instanceof EObject)) {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.EObjectRequired, object.getClass().getName());
		}
		EObject eContainer = ((EObject)object).eContainer();
		if (eContainer != null) {
			return valueFactory.createObjectValue(eContainer);
		}
		else {
			return valueFactory.getNull();
		}
	}
}
