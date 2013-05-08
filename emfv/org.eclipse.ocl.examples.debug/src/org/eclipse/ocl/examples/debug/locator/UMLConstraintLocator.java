/**
 * <copyright>
 *
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.debug.locator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.debug.ValidityManager;
import org.eclipse.emf.validation.debug.ValidityModel;
import org.eclipse.emf.validation.debug.locator.AbstractConstraintLocator;
import org.eclipse.emf.validation.debug.validity.LeafConstrainingNode;
import org.eclipse.emf.validation.debug.validity.Result;
import org.eclipse.emf.validation.debug.validity.Severity;
import org.eclipse.emf.validation.debug.validity.ValidatableNode;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.EnvironmentFactory;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;

public class UMLConstraintLocator extends AbstractConstraintLocator
{
	public @Nullable Map<EModelElement, List<LeafConstrainingNode>> getConstraints(@NonNull ValidityModel validityModel, @NonNull EPackage ePackage, @NonNull Set<Resource> resources) {
		Map<EModelElement, List<LeafConstrainingNode>> map = null;
		for (Resource resource : resources) {
			for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
				EObject eObject = tit.next();
				if (eObject instanceof Constraint) {
					Constraint umlConstraint = (Constraint)eObject;
					Element constrainedElement = umlConstraint.getContext();
					if (constrainedElement != null) {
						String label = validityModel.getLabel(umlConstraint);
/*					LeafConstrainingNode constraint = validityModel.createLeafConstrainingNode();
					constraint.setConstraintLocator(this);
					constraint.setConstrainingObject(umlConstraint);
					constraint.setLabel(label);
					ConstrainingNode constrainingNode = validityModel.getConstrainingNode(constrainedElement);
					constrainingNode.getChildren().add(constraint);
					if (map == null) {
						map = new HashMap<EModelElement, List<LeafConstrainingNode>>();
					}
					List<LeafConstrainingNode> constraints = map.get(constrainedElement);
					if (constraints == null) {
						constraints = new ArrayList<LeafConstrainingNode>();
						map.put(constrainedElement, constraints);
					}
					constraints.add(constraint); */
					
						map = createLeafConstrainingNode(map, validityModel, constrainedElement, umlConstraint, label);
					}
				}
			}
		}
		return map;
	}

	@Override
	public void validate(@NonNull Result result, @NonNull ValidityManager validityManager) {
		ValidatableNode validatableNode = result.getValidatableNode();
		EObject constrainedObject = validatableNode.getConstrainedObject();
		LeafConstrainingNode leafConstrainingNode = result.getLeafConstrainingNode();
		org.eclipse.uml2.uml.Constraint umlConstraint = (org.eclipse.uml2.uml.Constraint)leafConstrainingNode.getConstrainingObject();
		if (umlConstraint == null) {
			return;
		}
		MetaModelManager metaModelManager = PivotUtil.findMetaModelManager(umlConstraint);
		if (metaModelManager == null) {
			Resource eResource = umlConstraint.eResource();
			if (eResource == null) {
				return;
			}
			metaModelManager = PivotUtil.getMetaModelManager(eResource);
		}
		try {
			org.eclipse.ocl.examples.pivot.Constraint pivotConstraint = metaModelManager.getPivotOf(org.eclipse.ocl.examples.pivot.Constraint.class, umlConstraint);
			if (pivotConstraint == null) {
				throw new ParserException("Failed to create pivot Constraint");
			}
			OpaqueExpression specification = pivotConstraint.getSpecification();
			if (specification == null) {
				throw new ParserException("Failed to create pivot Specification");
			}
			ExpressionInOCL query = PivotUtil.getExpressionInOCL(pivotConstraint, specification);
			if (query == null) {
				throw new ParserException("Failed to create pivot Query");
			}
			EnvironmentFactory environmentFactory = new PivotEnvironmentFactory(null, metaModelManager);
			Environment rootEnvironment = environmentFactory.createEnvironment();
			EvaluationEnvironment evaluationEnvironment = environmentFactory.createEvaluationEnvironment();
			DomainModelManager modelManager = evaluationEnvironment.createModelManager(constrainedObject);
			EvaluationVisitor evaluationVisitor = environmentFactory.createEvaluationVisitor(rootEnvironment, evaluationEnvironment, modelManager);
			Object verdict = evaluationVisitor.evaluate(query);
			if (verdict == Boolean.TRUE) {
				result.setSeverity(Severity.OK);
			}
			else if (verdict == Boolean.FALSE) {
				result.setSeverity(Severity.WARNING);
			}
			else if (verdict == null) {
				result.setSeverity(Severity.ERROR);
			}
			else {
				result.setSeverity(Severity.FATAL);
			}
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setSeverity(Severity.FATAL);
		}
	}
}