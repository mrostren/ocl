/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: Pivot2MonikerVisitor.java,v 1.1.2.11 2011/01/13 19:15:40 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;

public class Pivot2MonikerVisitor extends AbstractExtendingVisitor<Object, Abstract2Moniker> implements PivotConstants
{	
	private static final Logger logger = Logger.getLogger(Pivot2MonikerVisitor.class);

	private static boolean initialized = false;
	
	private static void initialize() {
		initialized = true;
		roleNames.put(PivotPackage.Literals.LOOP_EXP__BODY, "argument");
		roleNames.put(PivotPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION, "ownedExpression");

		/*		roleNames.put(PivotPackage.Literals.CALL_EXP__SOURCE, "s");
		roleNames.put(PivotPackage.Literals.CONSTRAINT__SPECIFICATION, "z");
		roleNames.put(PivotPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION, "x");
		roleNames.put(PivotPackage.Literals.IF_EXP__CONDITION, "q");
		roleNames.put(PivotPackage.Literals.IF_EXP__THEN_EXPRESSION, "t");
		roleNames.put(PivotPackage.Literals.IF_EXP__ELSE_EXPRESSION, "f");
		roleNames.put(PivotPackage.Literals.LET_EXP__IN, "i");
		roleNames.put(PivotPackage.Literals.LET_EXP__VARIABLE, "v");
		roleNames.put(PivotPackage.Literals.LOOP_EXP__BODY, "b");
		roleNames.put(PivotPackage.Literals.LOOP_EXP__ITERATOR, "i");
		roleNames.put(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT, "a");
		roleNames.put(PivotPackage.Literals.VARIABLE__INIT_EXPRESSION, "i");
*/	}
	
	public Pivot2MonikerVisitor(Abstract2Moniker context) {
		super(context);
		if (!initialized) {
			initialize();
		}
	}

	public void appendExpPrefix(NamedElement object) {
		EObject parent = object.eContainer();
		if (parent instanceof CallExp) {
			CallExp callExpParent = (CallExp)parent;
			if (callExpParent.isImplicit()) {
				if (callExpParent instanceof IteratorExp) {		// Bypass implicit collect
					if (callExpParent.getSource() == object) {
						context.appendElement(((IteratorExp)callExpParent).getBody());
						context.append(MONIKER_SCOPE_SEPARATOR);
						context.appendRole(object);
						context.append(MONIKER_OPERATOR_SEPARATOR);
						return;
					}
					else {
						object = callExpParent;
					}
				}
				else if (callExpParent.getSource() == object) {
					object = callExpParent;
				}
			}
		}
		context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
		context.appendRole(object);
		context.append(MONIKER_OPERATOR_SEPARATOR);
	}

	@Override
	public String toString() {
		return context.toString();
	}

	@Override
	public Object visitAnnotation(Annotation object) {
		context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
		context.append(ANNOTATION_QUOTE);
		context.append(String.valueOf(object.getName()));
		context.append(ANNOTATION_QUOTE);
		return true;
	}

	@Override
	public Object visitBooleanLiteralExp(BooleanLiteralExp object) {
		appendExpPrefix(object);
		context.append(Boolean.toString(object.isBooleanSymbol()));
		return true;
	}

	@Override
	public Object visitClass(org.eclipse.ocl.examples.pivot.Class object) {
		TemplateParameter owningTemplateParameter = object.getOwningTemplateParameter();
		if (owningTemplateParameter != null) {			
			TemplateableElement owningTemplateElement = owningTemplateParameter.getSignature().getTemplate();
			if (!context.hasEmitted(owningTemplateParameter)/* || !context.isTemplateParameter(owningTemplateParameter)*/) {
				context.appendElement(owningTemplateElement);
				context.append(TEMPLATE_PARAMETER_PREFIX);
			}
			context.appendName(object);
		}
		else if (!object.getTemplateBindings().isEmpty()) {
			org.eclipse.ocl.examples.pivot.Class templateableClass = PivotUtil.getUnspecializedTemplateableElement(object);
			context.appendParent(templateableClass, MONIKER_SCOPE_SEPARATOR);
//			context.append(((MonikeredElement) templateableClass.eContainer()).getMoniker());
//			context.append(SCOPE_SEPARATOR);
			context.appendName(templateableClass);
			context.appendTemplateBindings(object);
		}
		else {
			context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
			context.appendName(object);
			context.appendTemplateParameters(object);
		}
		return true;
	}

	@Override
	public Object visitCollectionLiteralExp(CollectionLiteralExp object) {
		appendExpPrefix(object);
		context.appendName(object.getType());
		return true;
	}

	@Override
	public Object visitCollectionLiteralPart(CollectionLiteralPart object) {
		context.appendParent(object, MONIKER_PART_SEPARATOR);
		context.appendIndex(object);
		return true;
	}

	@Override
	public Object visitConstraint(Constraint object) {
		context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
		context.append(object.getStereotype());
		context.append(MONIKER_OPERATOR_SEPARATOR);
		String name = object.getName();
		if (name != null) {
			context.append(name);
		}
		return true;
	}

	@Override
	public Object visitDetail(Detail object) {
		context.appendParent(object, BINDINGS_PREFIX);
		context.append(object.getName());
		return true;
	}

	@Override
	public Object visitEnumerationLiteral(EnumerationLiteral object) {
		appendExpPrefix(object);
		context.appendName(object.getEnumeration());
		return true;
	}

	@Override
	public Object visitExpressionInOcl(ExpressionInOcl object) {
		if (object.eContainer() != null) {
			context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
			context.appendRole(object);		
		}
		else {
			context.append(MONIKER_ROOT_EXP);
		}
		return true;
	}

	@Override
	public Object visitIfExp(IfExp object) {
		appendExpPrefix(object);
		context.append(MONIKER_IF_EXP);
		return true;
	}

	@Override
	public Object visitIntegerLiteralExp(IntegerLiteralExp object) {
		appendExpPrefix(object);
		context.append(object.getIntegerSymbol().toString());
		return true;
	}

	@Override
	public Object visitInvalidLiteralExp(InvalidLiteralExp object) {
		appendExpPrefix(object);
		context.append(MONIKER_INVALID_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitLetExp(LetExp object) {
		appendExpPrefix(object);
		context.append(MONIKER_LET_EXP);
		return true;
	}

	@Override
	public Object visitLoopExp(LoopExp object) {
		appendExpPrefix(object);
		context.appendName(object.getReferredIteration());
		return true;
	}

	@Override
	public Object visitNamedElement(NamedElement object) {
		context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
		context.appendName(object);
		return true;
	}

	@Override
	public Object visitNullLiteralExp(NullLiteralExp object) {
		appendExpPrefix(object);
		context.append(MONIKER_NULL_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitOperation(Operation object) {
		List<TemplateBinding> templateBindings = object.getTemplateBindings();
		if (!templateBindings.isEmpty()) {
			context.appendElement((Element) object.eContainer());
			TemplateSignature signature = templateBindings.get(0).getSignature();
			if (signature != null) {
				context.appendElement(signature.getTemplate());
			}
			return true;
		}
		context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
		context.appendName(object);
		context.appendTemplateParameters(object);
		context.appendParameters(object);
		return true;
	}

	@Override
	public Object visitOperationCallExp(OperationCallExp object) {
		appendExpPrefix(object);
		context.appendName(object.getReferredOperation());
		return true;
	}

	@Override
	public Object visitPackage(org.eclipse.ocl.examples.pivot.Package object) {
		String alias = AliasAdapter.getAlias(object);
		if (alias != null) {
			context.append(alias);
		}
		else {
			context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
			context.appendName(object);
		}
		return true;
	}

	@Override
	public Object visitPrecedence(Precedence object) {
		context.appendParent(object, PRECEDENCE_PREFIX);
		context.appendName(object);
		return true;
	}

	@Override
	public Object visitPrimitiveType(PrimitiveType object) {
		context.appendName(object);
		return true;
	}

	@Override
	public Object visitPropertyCallExp(PropertyCallExp object) {
		appendExpPrefix(object);
		context.appendName(object.getReferredProperty());
		return true;
	}

	@Override
	public Object visitRealLiteralExp(RealLiteralExp object) {
		appendExpPrefix(object);
		context.append(object.getRealSymbol().toString());
		return true;
	}

	@Override
	public Object visitStringLiteralExp(StringLiteralExp object) {
		appendExpPrefix(object);
		context.append(MONIKER_STRING_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitTemplateBinding(TemplateBinding object) {
		TemplateSignature signature = object.getSignature();
		if (signature != null) {
			context.appendElement(signature.getTemplate());
		}
		context.append(BINDINGS_PREFIX);
		return true;
	}

	@Override
	public Object visitTemplateParameter(TemplateParameter object) {
		TemplateableElement owningTemplateElement = object.getSignature().getTemplate();
		context.appendElement(owningTemplateElement);
		context.append(TEMPLATE_PARAMETER_PREFIX);
		context.appendName(object.getParameteredElement());
		return true;
	}

	@Override
	public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution object) {
		context.appendElement(object.getTemplateBinding());
		context.appendName(object.getFormal().getParameteredElement());
		return true;
	}

	@Override
	public Object visitTemplateSignature(TemplateSignature object) {
		context.appendParent(object, MONIKER_SCOPE_SEPARATOR);
		return true;
	}

	@Override
	public Object visitTupleLiteralExp(TupleLiteralExp object) {
		appendExpPrefix(object);
		context.append(MONIKER_TUPLE_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitTupleType(TupleType object) {
		context.appendName(object);
		context.appendTupleType(object.getOwnedAttributes());
		return true;
	}

	@Override
	public Object visitTypeExp(TypeExp object) {
		appendExpPrefix(object);
		context.appendName(object.getReferredType());
		return true;
	}

	@Override
	public Object visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp object) {
		appendExpPrefix(object);
		BigInteger unlimitedNaturalSymbol = object.getUnlimitedNaturalSymbol();
		if (unlimitedNaturalSymbol.signum() < 0) {
			context.append(MONIKER_UNLIMITED_NATURAL_LITERAL_EXP);
		}
		else {
			context.append(unlimitedNaturalSymbol.toString());
		}
		return true;
	}

	@Override
	public Object visitVariable(Variable object) {
		appendExpPrefix(object);
		context.appendName(object);
		return true;
	}

	@Override
	public Object visitVariableExp(VariableExp object) {
		appendExpPrefix(object);
		context.appendName(object.getReferredVariable());
		return true;
	}

	public Object visiting(Visitable visitable) {
		logger.error("Unsupported " + visitable.eClass().getName() + " for " + getClass().getName());
		return null;
	}	
}