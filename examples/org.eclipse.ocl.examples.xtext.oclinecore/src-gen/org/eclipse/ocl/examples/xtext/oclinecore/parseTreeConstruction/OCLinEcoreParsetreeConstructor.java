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
 * $Id: OCLinEcoreParsetreeConstructor.java,v 1.1 2010/04/13 06:44:12 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IInstanceDescription;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import org.eclipse.ocl.examples.xtext.oclinecore.services.OCLinEcoreGrammarAccess;

import com.google.inject.Inject;

public class OCLinEcoreParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private OCLinEcoreGrammarAccess grammarAccess;
	
	@Override	
	public OCLinEcoreGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}

	@Override
	protected AbstractToken getRootToken(IInstanceDescription inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IInstanceDescription inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DocumentCS_Group(this, this, 0, inst);
			case 1: return new BodyConstraintCS_Group(this, this, 1, inst);
			case 2: return new DerivedConstraintCS_Group(this, this, 2, inst);
			case 3: return new InitialConstraintCS_Group(this, this, 3, inst);
			case 4: return new InvariantConstraintCS_Group(this, this, 4, inst);
			case 5: return new PostconditionConstraintCS_Group(this, this, 5, inst);
			case 6: return new PreconditionConstraintCS_Group(this, this, 6, inst);
			case 7: return new EClassRef_RefAssignment(this, this, 7, inst);
			case 8: return new EClassifierRef_RefAssignment(this, this, 8, inst);
			case 9: return new EDataTypeRef_RefAssignment(this, this, 9, inst);
			case 10: return new EReferenceRef_RefAssignment(this, this, 10, inst);
			case 11: return new AnnotationCS_Group(this, this, 11, inst);
			case 12: return new AttributeCS_Group(this, this, 12, inst);
			case 13: return new ClassCS_Group(this, this, 13, inst);
			case 14: return new ClassRef_Alternatives(this, this, 14, inst);
			case 15: return new ClassCSRef_RefAssignment(this, this, 15, inst);
			case 16: return new ClassifierCS_Alternatives(this, this, 16, inst);
			case 17: return new DataTypeCS_Group(this, this, 17, inst);
			case 18: return new DataTypeRef_Alternatives(this, this, 18, inst);
			case 19: return new DataTypeCSRef_RefAssignment(this, this, 19, inst);
			case 20: return new DetailCS_Group(this, this, 20, inst);
			case 21: return new EClassifierCSRef_Group(this, this, 21, inst);
			case 22: return new EnumCS_Group(this, this, 22, inst);
			case 23: return new EnumLiteralCS_Group(this, this, 23, inst);
			case 24: return new ImportCS_Group(this, this, 24, inst);
			case 25: return new OperationCS_Group(this, this, 25, inst);
			case 26: return new PackageCS_Group(this, this, 26, inst);
			case 27: return new ParameterCS_Group(this, this, 27, inst);
			case 28: return new ReferenceCS_Group(this, this, 28, inst);
			case 29: return new ReferenceRef_Alternatives(this, this, 29, inst);
			case 30: return new ReferenceCSRef_RefAssignment(this, this, 30, inst);
			case 31: return new StructuralFeatureCS_Alternatives(this, this, 31, inst);
			case 32: return new TypeCSRef_RefAssignment(this, this, 32, inst);
			case 33: return new TypeParameterCS_Group(this, this, 33, inst);
			case 34: return new TypeRef_Alternatives(this, this, 34, inst);
			case 35: return new TypeRefCS_Alternatives(this, this, 35, inst);
			case 36: return new TypedTypeRefCS_Group(this, this, 36, inst);
			case 37: return new WildcardTypeRefCS_Group(this, this, 37, inst);
			case 38: return new Model_OclExpressionCSParserRuleCall(this, this, 38, inst);
			case 39: return new TupleKeywordCS_ValueAssignment(this, this, 39, inst);
			case 40: return new RestrictedKeywordCS_Alternatives(this, this, 40, inst);
			case 41: return new SelfKeywordCS_ValueAssignment(this, this, 41, inst);
			case 42: return new SimpleNameCS_ValueAssignment(this, this, 42, inst);
			case 43: return new UnreservedSimpleNameCS_Alternatives(this, this, 43, inst);
			case 44: return new PathNameCS_Group(this, this, 44, inst);
			case 45: return new PrimitiveTypeCS_Alternatives(this, this, 45, inst);
			case 46: return new CollectionTypeIdentifierCS_Alternatives(this, this, 46, inst);
			case 47: return new TypeCS_Alternatives(this, this, 47, inst);
			case 48: return new CollectionTypeCS_Group(this, this, 48, inst);
			case 49: return new TupleTypeCS_Group(this, this, 49, inst);
			case 50: return new TuplePartCS_Group(this, this, 50, inst);
			case 51: return new LiteralExpCS_Alternatives(this, this, 51, inst);
			case 52: return new CollectionLiteralExpCS_Group(this, this, 52, inst);
			case 53: return new CollectionLiteralPartCS_Group(this, this, 53, inst);
			case 54: return new PrimitiveLiteralExpCS_Alternatives(this, this, 54, inst);
			case 55: return new TupleLiteralExpCS_Group(this, this, 55, inst);
			case 56: return new TupleLiteralPartCS_Group(this, this, 56, inst);
			case 57: return new IntegerLiteralExpCS_IntegerSymbolAssignment(this, this, 57, inst);
			case 58: return new RealLiteralExpCS_RealSymbolAssignment(this, this, 58, inst);
			case 59: return new StringLiteralExpCS_StringSymbolAssignment(this, this, 59, inst);
			case 60: return new BooleanLiteralExpCS_Alternatives(this, this, 60, inst);
			case 61: return new UnlimitedNaturalLiteralExpCS_Group(this, this, 61, inst);
			case 62: return new InvalidLiteralExpCS_Group(this, this, 62, inst);
			case 63: return new NullLiteralExpCS_Group(this, this, 63, inst);
			case 64: return new TypeLiteralExpCS_Alternatives(this, this, 64, inst);
			case 65: return new OclExpressionCS_Alternatives(this, this, 65, inst);
			case 66: return new ImpliesCS_Group(this, this, 66, inst);
			case 67: return new XorCS_Group(this, this, 67, inst);
			case 68: return new OrCS_Group(this, this, 68, inst);
			case 69: return new AndCS_Group(this, this, 69, inst);
			case 70: return new EqualityCS_Group(this, this, 70, inst);
			case 71: return new RelationalCS_Group(this, this, 71, inst);
			case 72: return new AdditiveCS_Group(this, this, 72, inst);
			case 73: return new MultiplicativeCS_Group(this, this, 73, inst);
			case 74: return new UnaryCS_Alternatives(this, this, 74, inst);
			case 75: return new CalledExpCS_Group(this, this, 75, inst);
			case 76: return new CallArgumentsCS_Alternatives(this, this, 76, inst);
			case 77: return new IteratorVariableCS_Group(this, this, 77, inst);
			case 78: return new IteratorAccumulatorCS_Group(this, this, 78, inst);
			case 79: return new ImplicitCallExpCS_PreCallExpCSParserRuleCall(this, this, 79, inst);
			case 80: return new PreCallExpCS_ExtendedPrimaryExpCSParserRuleCall(this, this, 80, inst);
			case 81: return new SimpleNameExpCS_SimpleNameCSParserRuleCall(this, this, 81, inst);
			case 82: return new ExtendedPrimaryExpCS_PrimaryExpCSParserRuleCall(this, this, 82, inst);
			case 83: return new PrimaryExpCS_Alternatives(this, this, 83, inst);
			case 84: return new IfExpCS_Group(this, this, 84, inst);
			case 85: return new LetExpCS_Group(this, this, 85, inst);
			case 86: return new LetVariableCS_Group(this, this, 86, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule DocumentCS ****************
 *
 * DocumentCS:
 *   imports+=ImportCS* packages+=PackageCS*; 
 * //generate oclinEcore2 "http://www.eclipse.org/ocl/examples/xtext/oclinecore/OCLinEcore"
 *
 **/

// imports+=ImportCS* packages+=PackageCS*
protected class DocumentCS_Group extends GroupToken {
	
	public DocumentCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDocumentCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DocumentCS_PackagesAssignment_1(parent, this, 0, inst);
			case 1: return new DocumentCS_ImportsAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getDocumentCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// imports+=ImportCS*
protected class DocumentCS_ImportsAssignment_0 extends AssignmentToken  {
	
	public DocumentCS_ImportsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDocumentCSAccess().getImportsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("imports",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getImportCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDocumentCSAccess().getImportsImportCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DocumentCS_ImportsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// packages+=PackageCS*
protected class DocumentCS_PackagesAssignment_1 extends AssignmentToken  {
	
	public DocumentCS_PackagesAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDocumentCSAccess().getPackagesAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("packages",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("packages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPackageCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDocumentCSAccess().getPackagesPackageCSParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DocumentCS_PackagesAssignment_1(parent, next, actIndex, consumed);
			case 1: return new DocumentCS_ImportsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 2, consumed);
		}	
	}	
}


/************ end Rule DocumentCS ****************/






/************ begin Rule BodyConstraintCS ****************
 *
 * BodyConstraintCS returns ConstraintCS:
 *   stereotype="body" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
 *
 **/

// stereotype="body" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
protected class BodyConstraintCS_Group extends GroupToken {
	
	public BodyConstraintCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BodyConstraintCS_SemicolonKeyword_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getBodyConstraintCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// stereotype="body"
protected class BodyConstraintCS_StereotypeAssignment_0 extends AssignmentToken  {
	
	public BodyConstraintCS_StereotypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getStereotypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stereotype",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stereotype");
		if("body".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getBodyConstraintCSAccess().getStereotypeBodyKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// name=ID?
protected class BodyConstraintCS_NameAssignment_1 extends AssignmentToken  {
	
	public BodyConstraintCS_NameAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BodyConstraintCS_StereotypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getBodyConstraintCSAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class BodyConstraintCS_ColonKeyword_2 extends KeywordToken  {
	
	public BodyConstraintCS_ColonKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BodyConstraintCS_NameAssignment_1(parent, this, 0, inst);
			case 1: return new BodyConstraintCS_StereotypeAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS|exprString=OCL
protected class BodyConstraintCS_Alternatives_3 extends AlternativesToken {

	public BodyConstraintCS_Alternatives_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getAlternatives_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BodyConstraintCS_ExprValueAssignment_3_0(parent, this, 0, inst);
			case 1: return new BodyConstraintCS_ExprStringAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS
protected class BodyConstraintCS_ExprValueAssignment_3_0 extends AssignmentToken  {
	
	public BodyConstraintCS_ExprValueAssignment_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getExprValueAssignment_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprValue",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getBodyConstraintCSAccess().getExprValueOclExpressionCSParserRuleCall_3_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new BodyConstraintCS_ColonKeyword_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// exprString=OCL
protected class BodyConstraintCS_ExprStringAssignment_3_1 extends AssignmentToken  {
	
	public BodyConstraintCS_ExprStringAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getExprStringAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BodyConstraintCS_ColonKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprString",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprString");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getBodyConstraintCSAccess().getExprStringOCLTerminalRuleCall_3_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class BodyConstraintCS_SemicolonKeyword_4 extends KeywordToken  {
	
	public BodyConstraintCS_SemicolonKeyword_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getBodyConstraintCSAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BodyConstraintCS_Alternatives_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule BodyConstraintCS ****************/


/************ begin Rule DerivedConstraintCS ****************
 *
 * DerivedConstraintCS returns ConstraintCS:
 *   stereotype="derivation" ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
 *
 **/

// stereotype="derivation" ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
protected class DerivedConstraintCS_Group extends GroupToken {
	
	public DerivedConstraintCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DerivedConstraintCS_SemicolonKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getDerivedConstraintCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// stereotype="derivation"
protected class DerivedConstraintCS_StereotypeAssignment_0 extends AssignmentToken  {
	
	public DerivedConstraintCS_StereotypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getStereotypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stereotype",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stereotype");
		if("derivation".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getDerivedConstraintCSAccess().getStereotypeDerivationKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class DerivedConstraintCS_ColonKeyword_1 extends KeywordToken  {
	
	public DerivedConstraintCS_ColonKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DerivedConstraintCS_StereotypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS|exprString=OCL
protected class DerivedConstraintCS_Alternatives_2 extends AlternativesToken {

	public DerivedConstraintCS_Alternatives_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getAlternatives_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DerivedConstraintCS_ExprValueAssignment_2_0(parent, this, 0, inst);
			case 1: return new DerivedConstraintCS_ExprStringAssignment_2_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS
protected class DerivedConstraintCS_ExprValueAssignment_2_0 extends AssignmentToken  {
	
	public DerivedConstraintCS_ExprValueAssignment_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getExprValueAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprValue",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDerivedConstraintCSAccess().getExprValueOclExpressionCSParserRuleCall_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DerivedConstraintCS_ColonKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// exprString=OCL
protected class DerivedConstraintCS_ExprStringAssignment_2_1 extends AssignmentToken  {
	
	public DerivedConstraintCS_ExprStringAssignment_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getExprStringAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DerivedConstraintCS_ColonKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprString",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprString");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getDerivedConstraintCSAccess().getExprStringOCLTerminalRuleCall_2_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class DerivedConstraintCS_SemicolonKeyword_3 extends KeywordToken  {
	
	public DerivedConstraintCS_SemicolonKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDerivedConstraintCSAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DerivedConstraintCS_Alternatives_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule DerivedConstraintCS ****************/


/************ begin Rule InitialConstraintCS ****************
 *
 * InitialConstraintCS returns ConstraintCS:
 *   stereotype="initial" ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
 *
 **/

// stereotype="initial" ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
protected class InitialConstraintCS_Group extends GroupToken {
	
	public InitialConstraintCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_SemicolonKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getInitialConstraintCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// stereotype="initial"
protected class InitialConstraintCS_StereotypeAssignment_0 extends AssignmentToken  {
	
	public InitialConstraintCS_StereotypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getStereotypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stereotype",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stereotype");
		if("initial".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getInitialConstraintCSAccess().getStereotypeInitialKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class InitialConstraintCS_ColonKeyword_1 extends KeywordToken  {
	
	public InitialConstraintCS_ColonKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_StereotypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS|exprString=OCL
protected class InitialConstraintCS_Alternatives_2 extends AlternativesToken {

	public InitialConstraintCS_Alternatives_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getAlternatives_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_ExprValueAssignment_2_0(parent, this, 0, inst);
			case 1: return new InitialConstraintCS_ExprStringAssignment_2_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS
protected class InitialConstraintCS_ExprValueAssignment_2_0 extends AssignmentToken  {
	
	public InitialConstraintCS_ExprValueAssignment_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getExprValueAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprValue",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getInitialConstraintCSAccess().getExprValueOclExpressionCSParserRuleCall_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new InitialConstraintCS_ColonKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// exprString=OCL
protected class InitialConstraintCS_ExprStringAssignment_2_1 extends AssignmentToken  {
	
	public InitialConstraintCS_ExprStringAssignment_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getExprStringAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_ColonKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprString",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprString");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getInitialConstraintCSAccess().getExprStringOCLTerminalRuleCall_2_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class InitialConstraintCS_SemicolonKeyword_3 extends KeywordToken  {
	
	public InitialConstraintCS_SemicolonKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInitialConstraintCSAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_Alternatives_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule InitialConstraintCS ****************/


/************ begin Rule InvariantConstraintCS ****************
 *
 * InvariantConstraintCS returns ConstraintCS:
 *   stereotype="invariant" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
 *
 **/

// stereotype="invariant" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
protected class InvariantConstraintCS_Group extends GroupToken {
	
	public InvariantConstraintCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_SemicolonKeyword_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getInvariantConstraintCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// stereotype="invariant"
protected class InvariantConstraintCS_StereotypeAssignment_0 extends AssignmentToken  {
	
	public InvariantConstraintCS_StereotypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getStereotypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stereotype",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stereotype");
		if("invariant".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getInvariantConstraintCSAccess().getStereotypeInvariantKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// name=ID?
protected class InvariantConstraintCS_NameAssignment_1 extends AssignmentToken  {
	
	public InvariantConstraintCS_NameAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_StereotypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getInvariantConstraintCSAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class InvariantConstraintCS_ColonKeyword_2 extends KeywordToken  {
	
	public InvariantConstraintCS_ColonKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_NameAssignment_1(parent, this, 0, inst);
			case 1: return new InvariantConstraintCS_StereotypeAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS|exprString=OCL
protected class InvariantConstraintCS_Alternatives_3 extends AlternativesToken {

	public InvariantConstraintCS_Alternatives_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getAlternatives_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_ExprValueAssignment_3_0(parent, this, 0, inst);
			case 1: return new InvariantConstraintCS_ExprStringAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS
protected class InvariantConstraintCS_ExprValueAssignment_3_0 extends AssignmentToken  {
	
	public InvariantConstraintCS_ExprValueAssignment_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getExprValueAssignment_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprValue",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getInvariantConstraintCSAccess().getExprValueOclExpressionCSParserRuleCall_3_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new InvariantConstraintCS_ColonKeyword_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// exprString=OCL
protected class InvariantConstraintCS_ExprStringAssignment_3_1 extends AssignmentToken  {
	
	public InvariantConstraintCS_ExprStringAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getExprStringAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_ColonKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprString",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprString");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getInvariantConstraintCSAccess().getExprStringOCLTerminalRuleCall_3_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class InvariantConstraintCS_SemicolonKeyword_4 extends KeywordToken  {
	
	public InvariantConstraintCS_SemicolonKeyword_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInvariantConstraintCSAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_Alternatives_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule InvariantConstraintCS ****************/


/************ begin Rule PostconditionConstraintCS ****************
 *
 * PostconditionConstraintCS returns ConstraintCS:
 *   stereotype="postcondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
 *   ";";
 *
 **/

// stereotype="postcondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
// ";"
protected class PostconditionConstraintCS_Group extends GroupToken {
	
	public PostconditionConstraintCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PostconditionConstraintCS_SemicolonKeyword_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPostconditionConstraintCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// stereotype="postcondition"
protected class PostconditionConstraintCS_StereotypeAssignment_0 extends AssignmentToken  {
	
	public PostconditionConstraintCS_StereotypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getStereotypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stereotype",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stereotype");
		if("postcondition".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPostconditionConstraintCSAccess().getStereotypePostconditionKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// name=ID?
protected class PostconditionConstraintCS_NameAssignment_1 extends AssignmentToken  {
	
	public PostconditionConstraintCS_NameAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PostconditionConstraintCS_StereotypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getPostconditionConstraintCSAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class PostconditionConstraintCS_ColonKeyword_2 extends KeywordToken  {
	
	public PostconditionConstraintCS_ColonKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PostconditionConstraintCS_NameAssignment_1(parent, this, 0, inst);
			case 1: return new PostconditionConstraintCS_StereotypeAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS|exprString=OCL
protected class PostconditionConstraintCS_Alternatives_3 extends AlternativesToken {

	public PostconditionConstraintCS_Alternatives_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getAlternatives_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PostconditionConstraintCS_ExprValueAssignment_3_0(parent, this, 0, inst);
			case 1: return new PostconditionConstraintCS_ExprStringAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS
protected class PostconditionConstraintCS_ExprValueAssignment_3_0 extends AssignmentToken  {
	
	public PostconditionConstraintCS_ExprValueAssignment_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getExprValueAssignment_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprValue",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPostconditionConstraintCSAccess().getExprValueOclExpressionCSParserRuleCall_3_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new PostconditionConstraintCS_ColonKeyword_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// exprString=OCL
protected class PostconditionConstraintCS_ExprStringAssignment_3_1 extends AssignmentToken  {
	
	public PostconditionConstraintCS_ExprStringAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getExprStringAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PostconditionConstraintCS_ColonKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprString",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprString");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getPostconditionConstraintCSAccess().getExprStringOCLTerminalRuleCall_3_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class PostconditionConstraintCS_SemicolonKeyword_4 extends KeywordToken  {
	
	public PostconditionConstraintCS_SemicolonKeyword_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPostconditionConstraintCSAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PostconditionConstraintCS_Alternatives_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule PostconditionConstraintCS ****************/


/************ begin Rule PreconditionConstraintCS ****************
 *
 * PreconditionConstraintCS returns ConstraintCS:
 *   stereotype="precondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
 *   ";";
 *
 **/

// stereotype="precondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
// ";"
protected class PreconditionConstraintCS_Group extends GroupToken {
	
	public PreconditionConstraintCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_SemicolonKeyword_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPreconditionConstraintCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// stereotype="precondition"
protected class PreconditionConstraintCS_StereotypeAssignment_0 extends AssignmentToken  {
	
	public PreconditionConstraintCS_StereotypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getStereotypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stereotype",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stereotype");
		if("precondition".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPreconditionConstraintCSAccess().getStereotypePreconditionKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// name=ID?
protected class PreconditionConstraintCS_NameAssignment_1 extends AssignmentToken  {
	
	public PreconditionConstraintCS_NameAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_StereotypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getPreconditionConstraintCSAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ":"
protected class PreconditionConstraintCS_ColonKeyword_2 extends KeywordToken  {
	
	public PreconditionConstraintCS_ColonKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_NameAssignment_1(parent, this, 0, inst);
			case 1: return new PreconditionConstraintCS_StereotypeAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS|exprString=OCL
protected class PreconditionConstraintCS_Alternatives_3 extends AlternativesToken {

	public PreconditionConstraintCS_Alternatives_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getAlternatives_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_ExprValueAssignment_3_0(parent, this, 0, inst);
			case 1: return new PreconditionConstraintCS_ExprStringAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// exprValue=OclExpressionCS
protected class PreconditionConstraintCS_ExprValueAssignment_3_0 extends AssignmentToken  {
	
	public PreconditionConstraintCS_ExprValueAssignment_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getExprValueAssignment_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprValue",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPreconditionConstraintCSAccess().getExprValueOclExpressionCSParserRuleCall_3_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new PreconditionConstraintCS_ColonKeyword_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// exprString=OCL
protected class PreconditionConstraintCS_ExprStringAssignment_3_1 extends AssignmentToken  {
	
	public PreconditionConstraintCS_ExprStringAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getExprStringAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_ColonKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("exprString",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("exprString");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getPreconditionConstraintCSAccess().getExprStringOCLTerminalRuleCall_3_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class PreconditionConstraintCS_SemicolonKeyword_4 extends KeywordToken  {
	
	public PreconditionConstraintCS_SemicolonKeyword_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPreconditionConstraintCSAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_Alternatives_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule PreconditionConstraintCS ****************/


/************ begin Rule EClassRef ****************
 *
 * EClassRef:
 *   ref=[ecore::EClass];
 *
 **/

// ref=[ecore::EClass]
protected class EClassRef_RefAssignment extends AssignmentToken  {
	
	public EClassRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEClassRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEClassRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEClassRefAccess().getRefEClassCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getEClassRefAccess().getRefEClassCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule EClassRef ****************/


/************ begin Rule EClassifierRef ****************
 *
 * EClassifierRef:
 *   ref=[ecore::EClassifier];
 *
 **/

// ref=[ecore::EClassifier]
protected class EClassifierRef_RefAssignment extends AssignmentToken  {
	
	public EClassifierRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEClassifierRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEClassifierRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEClassifierRefAccess().getRefEClassifierCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getEClassifierRefAccess().getRefEClassifierCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule EClassifierRef ****************/


/************ begin Rule EDataTypeRef ****************
 *
 * EDataTypeRef:
 *   ref=[ecore::EDataType];
 *
 **/

// ref=[ecore::EDataType]
protected class EDataTypeRef_RefAssignment extends AssignmentToken  {
	
	public EDataTypeRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDataTypeRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEDataTypeRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDataTypeRefAccess().getRefEDataTypeCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getEDataTypeRefAccess().getRefEDataTypeCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule EDataTypeRef ****************/


/************ begin Rule EReferenceRef ****************
 *
 * EReferenceRef:
 *   ref=[ecore::EReference];
 *
 **/

// ref=[ecore::EReference]
protected class EReferenceRef_RefAssignment extends AssignmentToken  {
	
	public EReferenceRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEReferenceRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEReferenceRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEReferenceRefAccess().getRefEReferenceCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getEReferenceRefAccess().getRefEReferenceCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule EReferenceRef ****************/


/************ begin Rule AnnotationCS ****************
 *
 * AnnotationCS:
 *   "@" (idSource=ID|stringSource=URL) ("(" details+=DetailCS ("," details+=DetailCS)* ")"
 *   )?;  
 * 
 *     
 * 	
 * //	(annotations+=AnnotationCS)*
 *
 **/

// "@" (idSource=ID|stringSource=URL) ("(" details+=DetailCS ("," details+=DetailCS)* ")"
// )? 
// 	
// //	(annotations+=AnnotationCS)*
protected class AnnotationCS_Group extends GroupToken {
	
	public AnnotationCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group_2(parent, this, 0, inst);
			case 1: return new AnnotationCS_Alternatives_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// "@" 
// 	
// //	(annotations+=AnnotationCS)*
protected class AnnotationCS_CommercialAtKeyword_0 extends KeywordToken  {
	
	public AnnotationCS_CommercialAtKeyword_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getCommercialAtKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
}

// idSource=ID|stringSource=URL 
// //	(annotations+=AnnotationCS)*
protected class AnnotationCS_Alternatives_1 extends AlternativesToken {

	public AnnotationCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_IdSourceAssignment_1_0(parent, this, 0, inst);
			case 1: return new AnnotationCS_StringSourceAssignment_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// idSource=ID
protected class AnnotationCS_IdSourceAssignment_1_0 extends AssignmentToken  {
	
	public AnnotationCS_IdSourceAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getIdSourceAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_CommercialAtKeyword_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("idSource",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("idSource");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getAnnotationCSAccess().getIdSourceIDTerminalRuleCall_1_0_0();
			return obj;
		}
		return null;
	}

}

// stringSource=URL
protected class AnnotationCS_StringSourceAssignment_1_1 extends AssignmentToken  {
	
	public AnnotationCS_StringSourceAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getStringSourceAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_CommercialAtKeyword_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stringSource",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stringSource");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getAnnotationCSAccess().getStringSourceURLTerminalRuleCall_1_1_0();
			return obj;
		}
		return null;
	}

}


// ("(" details+=DetailCS ("," details+=DetailCS)* ")")?
protected class AnnotationCS_Group_2 extends GroupToken {
	
	public AnnotationCS_Group_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_RightParenthesisKeyword_2_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "("
protected class AnnotationCS_LeftParenthesisKeyword_2_0 extends KeywordToken  {
	
	public AnnotationCS_LeftParenthesisKeyword_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getLeftParenthesisKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Alternatives_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// details+=DetailCS
protected class AnnotationCS_DetailsAssignment_2_1 extends AssignmentToken  {
	
	public AnnotationCS_DetailsAssignment_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getDetailsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DetailCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("details",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("details");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDetailCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAnnotationCSAccess().getDetailsDetailCSParserRuleCall_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AnnotationCS_LeftParenthesisKeyword_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," details+=DetailCS)*
protected class AnnotationCS_Group_2_2 extends GroupToken {
	
	public AnnotationCS_Group_2_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_DetailsAssignment_2_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class AnnotationCS_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public AnnotationCS_CommaKeyword_2_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group_2_2(parent, this, 0, inst);
			case 1: return new AnnotationCS_DetailsAssignment_2_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// details+=DetailCS
protected class AnnotationCS_DetailsAssignment_2_2_1 extends AssignmentToken  {
	
	public AnnotationCS_DetailsAssignment_2_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getDetailsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DetailCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("details",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("details");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDetailCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAnnotationCSAccess().getDetailsDetailCSParserRuleCall_2_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AnnotationCS_CommaKeyword_2_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ")"
protected class AnnotationCS_RightParenthesisKeyword_2_3 extends KeywordToken  {
	
	public AnnotationCS_RightParenthesisKeyword_2_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAnnotationCSAccess().getRightParenthesisKeyword_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group_2_2(parent, this, 0, inst);
			case 1: return new AnnotationCS_DetailsAssignment_2_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule AnnotationCS ****************/


/************ begin Rule AttributeCS ****************
 *
 * AttributeCS:
 *   annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
 *   qualifiers+="id"|qualifiers+="!id"|qualifiers+="ordered"|qualifiers+="!ordered"|
 *   qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="transient"|
 *   qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers+=
 *   "unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
 *   "!volatile")* "attribute" name=ID (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=
 *   UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{"
 *   constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";");
 *
 **/

// annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
// qualifiers+="id"|qualifiers+="!id"|qualifiers+="ordered"|qualifiers+="!ordered"|
// qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="transient"|
// qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers+=
// "unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
// "!volatile")* "attribute" name=ID (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=
// UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{"
// constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";")
protected class AttributeCS_Group extends GroupToken {
	
	public AttributeCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_6(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getAttributeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class AttributeCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public AttributeCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAttributeCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AttributeCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// (qualifiers+="derived"|qualifiers+="!derived"|qualifiers+="id"|qualifiers+="!id"
// |qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers
// +="!readonly"|qualifiers+="transient"|qualifiers+="!transient"|qualifiers+=
// "unique"|qualifiers+="!unique"|qualifiers+="unsettable"|qualifiers+=
// "!unsettable"|qualifiers+="volatile"|qualifiers+="!volatile")*
protected class AttributeCS_Alternatives_1 extends AlternativesToken {

	public AttributeCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_QualifiersAssignment_1_0(parent, this, 0, inst);
			case 1: return new AttributeCS_QualifiersAssignment_1_1(parent, this, 1, inst);
			case 2: return new AttributeCS_QualifiersAssignment_1_2(parent, this, 2, inst);
			case 3: return new AttributeCS_QualifiersAssignment_1_3(parent, this, 3, inst);
			case 4: return new AttributeCS_QualifiersAssignment_1_4(parent, this, 4, inst);
			case 5: return new AttributeCS_QualifiersAssignment_1_5(parent, this, 5, inst);
			case 6: return new AttributeCS_QualifiersAssignment_1_6(parent, this, 6, inst);
			case 7: return new AttributeCS_QualifiersAssignment_1_7(parent, this, 7, inst);
			case 8: return new AttributeCS_QualifiersAssignment_1_8(parent, this, 8, inst);
			case 9: return new AttributeCS_QualifiersAssignment_1_9(parent, this, 9, inst);
			case 10: return new AttributeCS_QualifiersAssignment_1_10(parent, this, 10, inst);
			case 11: return new AttributeCS_QualifiersAssignment_1_11(parent, this, 11, inst);
			case 12: return new AttributeCS_QualifiersAssignment_1_12(parent, this, 12, inst);
			case 13: return new AttributeCS_QualifiersAssignment_1_13(parent, this, 13, inst);
			case 14: return new AttributeCS_QualifiersAssignment_1_14(parent, this, 14, inst);
			case 15: return new AttributeCS_QualifiersAssignment_1_15(parent, this, 15, inst);
			default: return null;
		}	
	}	
		
}

// qualifiers+="derived"
protected class AttributeCS_QualifiersAssignment_1_0 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("derived".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersDerivedKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!derived"
protected class AttributeCS_QualifiersAssignment_1_1 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!derived".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersDerivedKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="id"
protected class AttributeCS_QualifiersAssignment_1_2 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("id".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersIdKeyword_1_2_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!id"
protected class AttributeCS_QualifiersAssignment_1_3 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!id".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersIdKeyword_1_3_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="ordered"
protected class AttributeCS_QualifiersAssignment_1_4 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersOrderedKeyword_1_4_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!ordered"
protected class AttributeCS_QualifiersAssignment_1_5 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersOrderedKeyword_1_5_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="readonly"
protected class AttributeCS_QualifiersAssignment_1_6 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("readonly".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersReadonlyKeyword_1_6_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!readonly"
protected class AttributeCS_QualifiersAssignment_1_7 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_7(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_7();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!readonly".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersReadonlyKeyword_1_7_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="transient"
protected class AttributeCS_QualifiersAssignment_1_8 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_8(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_8();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("transient".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersTransientKeyword_1_8_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!transient"
protected class AttributeCS_QualifiersAssignment_1_9 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_9(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_9();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!transient".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersTransientKeyword_1_9_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="unique"
protected class AttributeCS_QualifiersAssignment_1_10 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_10(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_10();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersUniqueKeyword_1_10_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!unique"
protected class AttributeCS_QualifiersAssignment_1_11 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_11(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_11();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersUniqueKeyword_1_11_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="unsettable"
protected class AttributeCS_QualifiersAssignment_1_12 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_12(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_12();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("unsettable".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersUnsettableKeyword_1_12_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!unsettable"
protected class AttributeCS_QualifiersAssignment_1_13 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_13(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_13();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!unsettable".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersUnsettableKeyword_1_13_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="volatile"
protected class AttributeCS_QualifiersAssignment_1_14 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_14(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_14();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("volatile".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersVolatileKeyword_1_14_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!volatile"
protected class AttributeCS_QualifiersAssignment_1_15 extends AssignmentToken  {
	
	public AttributeCS_QualifiersAssignment_1_15(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getQualifiersAssignment_1_15();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!volatile".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getQualifiersVolatileKeyword_1_15_0();
			return obj;
		}
		return null;
	}

}


// "attribute"
protected class AttributeCS_AttributeKeyword_2 extends KeywordToken  {
	
	public AttributeCS_AttributeKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getAttributeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new AttributeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
}

// name=ID
protected class AttributeCS_NameAssignment_3 extends AssignmentToken  {
	
	public AttributeCS_NameAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_AttributeKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getAttributeCSAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
// "]")?)?
protected class AttributeCS_Group_4 extends GroupToken {
	
	public AttributeCS_Group_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_4_2(parent, this, 0, inst);
			case 1: return new AttributeCS_TypeAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class AttributeCS_ColonKeyword_4_0 extends KeywordToken  {
	
	public AttributeCS_ColonKeyword_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getColonKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_NameAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=TypeRefCS
protected class AttributeCS_TypeAssignment_4_1 extends AssignmentToken  {
	
	public AttributeCS_TypeAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getTypeAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAttributeCSAccess().getTypeTypeRefCSParserRuleCall_4_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AttributeCS_ColonKeyword_4_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
protected class AttributeCS_Group_4_2 extends GroupToken {
	
	public AttributeCS_Group_4_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_RightSquareBracketKeyword_4_2_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "["
protected class AttributeCS_LeftSquareBracketKeyword_4_2_0 extends KeywordToken  {
	
	public AttributeCS_LeftSquareBracketKeyword_4_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getLeftSquareBracketKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_TypeAssignment_4_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
protected class AttributeCS_Alternatives_4_2_1 extends AlternativesToken {

	public AttributeCS_Alternatives_4_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getAlternatives_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_4_2_1_0(parent, this, 0, inst);
			case 1: return new AttributeCS_MultiplicityAssignment_4_2_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?
protected class AttributeCS_Group_4_2_1_0 extends GroupToken {
	
	public AttributeCS_Group_4_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup_4_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_4_2_1_0_1(parent, this, 0, inst);
			case 1: return new AttributeCS_LowerAssignment_4_2_1_0_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER
protected class AttributeCS_LowerAssignment_4_2_1_0_0 extends AssignmentToken  {
	
	public AttributeCS_LowerAssignment_4_2_1_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getLowerAssignment_4_2_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_LeftSquareBracketKeyword_4_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("lower",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("lower");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getAttributeCSAccess().getLowerLOWERParserRuleCall_4_2_1_0_0_0();
			return obj;
		}
		return null;
	}

}

// (".." upper=UPPER)?
protected class AttributeCS_Group_4_2_1_0_1 extends GroupToken {
	
	public AttributeCS_Group_4_2_1_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup_4_2_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_UpperAssignment_4_2_1_0_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ".."
protected class AttributeCS_FullStopFullStopKeyword_4_2_1_0_1_0 extends KeywordToken  {
	
	public AttributeCS_FullStopFullStopKeyword_4_2_1_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getFullStopFullStopKeyword_4_2_1_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_LowerAssignment_4_2_1_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// upper=UPPER
protected class AttributeCS_UpperAssignment_4_2_1_0_1_1 extends AssignmentToken  {
	
	public AttributeCS_UpperAssignment_4_2_1_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getUpperAssignment_4_2_1_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_FullStopFullStopKeyword_4_2_1_0_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("upper",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("upper");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getAttributeCSAccess().getUpperUPPERParserRuleCall_4_2_1_0_1_1_0();
			return obj;
		}
		return null;
	}

}



// multiplicity=( "*" | "+" | "?" )
protected class AttributeCS_MultiplicityAssignment_4_2_1_1 extends AssignmentToken  {
	
	public AttributeCS_MultiplicityAssignment_4_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getMultiplicityAssignment_4_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_LeftSquareBracketKeyword_4_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("multiplicity",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("multiplicity");
		if("*".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getMultiplicityAsteriskKeyword_4_2_1_1_0_0();
			return obj;
		}
		if("+".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getMultiplicityPlusSignKeyword_4_2_1_1_0_1();
			return obj;
		}
		if("?".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAttributeCSAccess().getMultiplicityQuestionMarkKeyword_4_2_1_1_0_2();
			return obj;
		}
		return null;
	}

}


// "]"
protected class AttributeCS_RightSquareBracketKeyword_4_2_2 extends KeywordToken  {
	
	public AttributeCS_RightSquareBracketKeyword_4_2_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getRightSquareBracketKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Alternatives_4_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}



// ("=" defaultValueLiteral=URL)?
protected class AttributeCS_Group_5 extends GroupToken {
	
	public AttributeCS_Group_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_DefaultValueLiteralAssignment_5_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "="
protected class AttributeCS_EqualsSignKeyword_5_0 extends KeywordToken  {
	
	public AttributeCS_EqualsSignKeyword_5_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getEqualsSignKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_4(parent, this, 0, inst);
			case 1: return new AttributeCS_NameAssignment_3(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// defaultValueLiteral=URL
protected class AttributeCS_DefaultValueLiteralAssignment_5_1 extends AssignmentToken  {
	
	public AttributeCS_DefaultValueLiteralAssignment_5_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getDefaultValueLiteralAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_EqualsSignKeyword_5_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("defaultValueLiteral",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("defaultValueLiteral");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getAttributeCSAccess().getDefaultValueLiteralURLTerminalRuleCall_5_1_0();
			return obj;
		}
		return null;
	}

}


// "{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";"
protected class AttributeCS_Alternatives_6 extends AlternativesToken {

	public AttributeCS_Alternatives_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getAlternatives_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_6_0(parent, this, 0, inst);
			case 1: return new AttributeCS_SemicolonKeyword_6_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"
protected class AttributeCS_Group_6_0 extends GroupToken {
	
	public AttributeCS_Group_6_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_RightCurlyBracketKeyword_6_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "{"
protected class AttributeCS_LeftCurlyBracketKeyword_6_0_0 extends KeywordToken  {
	
	public AttributeCS_LeftCurlyBracketKeyword_6_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getLeftCurlyBracketKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_5(parent, this, 0, inst);
			case 1: return new AttributeCS_Group_4(parent, this, 1, inst);
			case 2: return new AttributeCS_NameAssignment_3(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// constraints+=( InitialConstraintCS | DerivedConstraintCS )*
protected class AttributeCS_ConstraintsAssignment_6_0_1 extends AssignmentToken  {
	
	public AttributeCS_ConstraintsAssignment_6_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getConstraintsAssignment_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_Group(this, this, 0, inst);
			case 1: return new DerivedConstraintCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("constraints",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("constraints");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInitialConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAttributeCSAccess().getConstraintsInitialConstraintCSParserRuleCall_6_0_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDerivedConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAttributeCSAccess().getConstraintsDerivedConstraintCSParserRuleCall_6_0_1_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AttributeCS_ConstraintsAssignment_6_0_1(parent, next, actIndex, consumed);
			case 1: return new AttributeCS_LeftCurlyBracketKeyword_6_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class AttributeCS_RightCurlyBracketKeyword_6_0_2 extends KeywordToken  {
	
	public AttributeCS_RightCurlyBracketKeyword_6_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getRightCurlyBracketKeyword_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_ConstraintsAssignment_6_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ";"
protected class AttributeCS_SemicolonKeyword_6_1 extends KeywordToken  {
	
	public AttributeCS_SemicolonKeyword_6_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAttributeCSAccess().getSemicolonKeyword_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group_5(parent, this, 0, inst);
			case 1: return new AttributeCS_Group_4(parent, this, 1, inst);
			case 2: return new AttributeCS_NameAssignment_3(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule AttributeCS ****************/


/************ begin Rule ClassCS ****************
 *
 * ClassCS:
 *   annotations+=AnnotationCS* (qualifiers+="abstract"|qualifiers+="!abstract"|
 *   qualifiers+="interface"|qualifiers+="!interface")* "class" name=ID ("<"
 *   typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")? (
 *   "extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)? (":" instanceClassName
 *   =FQN)? ("{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|
 *   constraints+=InvariantConstraintCS)* "}"|";");
 *
 **/

// annotations+=AnnotationCS* (qualifiers+="abstract"|qualifiers+="!abstract"|
// qualifiers+="interface"|qualifiers+="!interface")* "class" name=ID ("<"
// typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")? (
// "extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)? (":" instanceClassName
// =FQN)? ("{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|
// constraints+=InvariantConstraintCS)* "}"|";")
protected class ClassCS_Group extends GroupToken {
	
	public ClassCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_7(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getClassCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class ClassCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public ClassCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// (qualifiers+="abstract"|qualifiers+="!abstract"|qualifiers+="interface"|
// qualifiers+="!interface")*
protected class ClassCS_Alternatives_1 extends AlternativesToken {

	public ClassCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getClassCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_QualifiersAssignment_1_0(parent, this, 0, inst);
			case 1: return new ClassCS_QualifiersAssignment_1_1(parent, this, 1, inst);
			case 2: return new ClassCS_QualifiersAssignment_1_2(parent, this, 2, inst);
			case 3: return new ClassCS_QualifiersAssignment_1_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}

// qualifiers+="abstract"
protected class ClassCS_QualifiersAssignment_1_0 extends AssignmentToken  {
	
	public ClassCS_QualifiersAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getQualifiersAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ClassCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("abstract".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getClassCSAccess().getQualifiersAbstractKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!abstract"
protected class ClassCS_QualifiersAssignment_1_1 extends AssignmentToken  {
	
	public ClassCS_QualifiersAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getQualifiersAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ClassCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!abstract".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getClassCSAccess().getQualifiersAbstractKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="interface"
protected class ClassCS_QualifiersAssignment_1_2 extends AssignmentToken  {
	
	public ClassCS_QualifiersAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getQualifiersAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ClassCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("interface".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getClassCSAccess().getQualifiersInterfaceKeyword_1_2_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!interface"
protected class ClassCS_QualifiersAssignment_1_3 extends AssignmentToken  {
	
	public ClassCS_QualifiersAssignment_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getQualifiersAssignment_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ClassCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!interface".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getClassCSAccess().getQualifiersInterfaceKeyword_1_3_0();
			return obj;
		}
		return null;
	}

}


// "class"
protected class ClassCS_ClassKeyword_2 extends KeywordToken  {
	
	public ClassCS_ClassKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getClassKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ClassCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
}

// name=ID
protected class ClassCS_NameAssignment_3 extends AssignmentToken  {
	
	public ClassCS_NameAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_ClassKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getClassCSAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
protected class ClassCS_Group_4 extends GroupToken {
	
	public ClassCS_Group_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_GreaterThanSignKeyword_4_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "<"
protected class ClassCS_LessThanSignKeyword_4_0 extends KeywordToken  {
	
	public ClassCS_LessThanSignKeyword_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getLessThanSignKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_NameAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class ClassCS_TypeParametersAssignment_4_1 extends AssignmentToken  {
	
	public ClassCS_TypeParametersAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getTypeParametersAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getTypeParametersTypeParameterCSParserRuleCall_4_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_LessThanSignKeyword_4_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," typeParameters+=TypeParameterCS)*
protected class ClassCS_Group_4_2 extends GroupToken {
	
	public ClassCS_Group_4_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_TypeParametersAssignment_4_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class ClassCS_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public ClassCS_CommaKeyword_4_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_4_2(parent, this, 0, inst);
			case 1: return new ClassCS_TypeParametersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class ClassCS_TypeParametersAssignment_4_2_1 extends AssignmentToken  {
	
	public ClassCS_TypeParametersAssignment_4_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getTypeParametersAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getTypeParametersTypeParameterCSParserRuleCall_4_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_CommaKeyword_4_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ">"
protected class ClassCS_GreaterThanSignKeyword_4_3 extends KeywordToken  {
	
	public ClassCS_GreaterThanSignKeyword_4_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGreaterThanSignKeyword_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_4_2(parent, this, 0, inst);
			case 1: return new ClassCS_TypeParametersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


// ("extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)?
protected class ClassCS_Group_5 extends GroupToken {
	
	public ClassCS_Group_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_5_2(parent, this, 0, inst);
			case 1: return new ClassCS_SuperTypesAssignment_5_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "extends"
protected class ClassCS_ExtendsKeyword_5_0 extends KeywordToken  {
	
	public ClassCS_ExtendsKeyword_5_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getExtendsKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_4(parent, this, 0, inst);
			case 1: return new ClassCS_NameAssignment_3(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// superTypes+=TypeRefCS
protected class ClassCS_SuperTypesAssignment_5_1 extends AssignmentToken  {
	
	public ClassCS_SuperTypesAssignment_5_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getSuperTypesAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("superTypes",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("superTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getSuperTypesTypeRefCSParserRuleCall_5_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_ExtendsKeyword_5_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," superTypes+=TypeRefCS)*
protected class ClassCS_Group_5_2 extends GroupToken {
	
	public ClassCS_Group_5_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_SuperTypesAssignment_5_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class ClassCS_CommaKeyword_5_2_0 extends KeywordToken  {
	
	public ClassCS_CommaKeyword_5_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getCommaKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_5_2(parent, this, 0, inst);
			case 1: return new ClassCS_SuperTypesAssignment_5_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// superTypes+=TypeRefCS
protected class ClassCS_SuperTypesAssignment_5_2_1 extends AssignmentToken  {
	
	public ClassCS_SuperTypesAssignment_5_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getSuperTypesAssignment_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("superTypes",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("superTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getSuperTypesTypeRefCSParserRuleCall_5_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_CommaKeyword_5_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// (":" instanceClassName=FQN)?
protected class ClassCS_Group_6 extends GroupToken {
	
	public ClassCS_Group_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_InstanceClassNameAssignment_6_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class ClassCS_ColonKeyword_6_0 extends KeywordToken  {
	
	public ClassCS_ColonKeyword_6_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getColonKeyword_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_5(parent, this, 0, inst);
			case 1: return new ClassCS_Group_4(parent, this, 1, inst);
			case 2: return new ClassCS_NameAssignment_3(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// instanceClassName=FQN
protected class ClassCS_InstanceClassNameAssignment_6_1 extends AssignmentToken  {
	
	public ClassCS_InstanceClassNameAssignment_6_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getInstanceClassNameAssignment_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_ColonKeyword_6_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("instanceClassName",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("instanceClassName");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getClassCSAccess().getInstanceClassNameFQNParserRuleCall_6_1_0();
			return obj;
		}
		return null;
	}

}


// "{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|constraints
// +=InvariantConstraintCS)* "}"|";"
protected class ClassCS_Alternatives_7 extends AlternativesToken {

	public ClassCS_Alternatives_7(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getClassCSAccess().getAlternatives_7();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_7_0(parent, this, 0, inst);
			case 1: return new ClassCS_SemicolonKeyword_7_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|constraints
// +=InvariantConstraintCS)* "}"
protected class ClassCS_Group_7_0 extends GroupToken {
	
	public ClassCS_Group_7_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getClassCSAccess().getGroup_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_RightCurlyBracketKeyword_7_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "{"
protected class ClassCS_LeftCurlyBracketKeyword_7_0_0 extends KeywordToken  {
	
	public ClassCS_LeftCurlyBracketKeyword_7_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getLeftCurlyBracketKeyword_7_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_6(parent, this, 0, inst);
			case 1: return new ClassCS_Group_5(parent, this, 1, inst);
			case 2: return new ClassCS_Group_4(parent, this, 2, inst);
			case 3: return new ClassCS_NameAssignment_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}

// (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|constraints+=
// InvariantConstraintCS)*
protected class ClassCS_Alternatives_7_0_1 extends AlternativesToken {

	public ClassCS_Alternatives_7_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getClassCSAccess().getAlternatives_7_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_OperationsAssignment_7_0_1_0(parent, this, 0, inst);
			case 1: return new ClassCS_StructuralFeaturesAssignment_7_0_1_1(parent, this, 1, inst);
			case 2: return new ClassCS_ConstraintsAssignment_7_0_1_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// operations+=OperationCS
protected class ClassCS_OperationsAssignment_7_0_1_0 extends AssignmentToken  {
	
	public ClassCS_OperationsAssignment_7_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getOperationsAssignment_7_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("operations",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("operations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOperationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getOperationsOperationCSParserRuleCall_7_0_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_Alternatives_7_0_1(parent, next, actIndex, consumed);
			case 1: return new ClassCS_LeftCurlyBracketKeyword_7_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// structuralFeatures+=StructuralFeatureCS
protected class ClassCS_StructuralFeaturesAssignment_7_0_1_1 extends AssignmentToken  {
	
	public ClassCS_StructuralFeaturesAssignment_7_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getStructuralFeaturesAssignment_7_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new StructuralFeatureCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("structuralFeatures",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("structuralFeatures");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getStructuralFeatureCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getStructuralFeaturesStructuralFeatureCSParserRuleCall_7_0_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_Alternatives_7_0_1(parent, next, actIndex, consumed);
			case 1: return new ClassCS_LeftCurlyBracketKeyword_7_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// constraints+=InvariantConstraintCS
protected class ClassCS_ConstraintsAssignment_7_0_1_2 extends AssignmentToken  {
	
	public ClassCS_ConstraintsAssignment_7_0_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSAccess().getConstraintsAssignment_7_0_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("constraints",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("constraints");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInvariantConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getClassCSAccess().getConstraintsInvariantConstraintCSParserRuleCall_7_0_1_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ClassCS_Alternatives_7_0_1(parent, next, actIndex, consumed);
			case 1: return new ClassCS_LeftCurlyBracketKeyword_7_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class ClassCS_RightCurlyBracketKeyword_7_0_2 extends KeywordToken  {
	
	public ClassCS_RightCurlyBracketKeyword_7_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getRightCurlyBracketKeyword_7_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Alternatives_7_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ";"
protected class ClassCS_SemicolonKeyword_7_1 extends KeywordToken  {
	
	public ClassCS_SemicolonKeyword_7_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getClassCSAccess().getSemicolonKeyword_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group_6(parent, this, 0, inst);
			case 1: return new ClassCS_Group_5(parent, this, 1, inst);
			case 2: return new ClassCS_Group_4(parent, this, 2, inst);
			case 3: return new ClassCS_NameAssignment_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule ClassCS ****************/


/************ begin Rule ClassRef ****************
 *
 * ClassRef:
 *   ClassCSRef|EClassRef;
 *
 **/

// ClassCSRef|EClassRef
protected class ClassRef_Alternatives extends AlternativesToken {

	public ClassRef_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getClassRefAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassRef_ClassCSRefParserRuleCall_0(parent, this, 0, inst);
			case 1: return new ClassRef_EClassRefParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getClassRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// ClassCSRef
protected class ClassRef_ClassCSRefParserRuleCall_0 extends RuleCallToken {
	
	public ClassRef_ClassCSRefParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getClassRefAccess().getClassCSRefParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCSRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ClassCSRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getClassCSRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// EClassRef
protected class ClassRef_EClassRefParserRuleCall_1 extends RuleCallToken {
	
	public ClassRef_EClassRefParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getClassRefAccess().getEClassRefParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EClassRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EClassRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEClassRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule ClassRef ****************/


/************ begin Rule ClassCSRef ****************
 *
 * ClassCSRef:
 *   ref=[ClassCS];
 *
 **/

// ref=[ClassCS]
protected class ClassCSRef_RefAssignment extends AssignmentToken  {
	
	public ClassCSRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getClassCSRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getClassCSRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getClassCSRefAccess().getRefClassCSCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getClassCSRefAccess().getRefClassCSCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule ClassCSRef ****************/


/************ begin Rule ClassifierCS ****************
 *
 * ClassifierCS:
 *   ClassCS|DataTypeCS|EnumCS;
 *
 **/

// ClassCS|DataTypeCS|EnumCS
protected class ClassifierCS_Alternatives extends AlternativesToken {

	public ClassifierCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getClassifierCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassifierCS_ClassCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new ClassifierCS_DataTypeCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new ClassifierCS_EnumCSParserRuleCall_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getClassifierCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// ClassCS
protected class ClassifierCS_ClassCSParserRuleCall_0 extends RuleCallToken {
	
	public ClassifierCS_ClassCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getClassifierCSAccess().getClassCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ClassCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getClassCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// DataTypeCS
protected class ClassifierCS_DataTypeCSParserRuleCall_1 extends RuleCallToken {
	
	public ClassifierCS_DataTypeCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getClassifierCSAccess().getDataTypeCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(DataTypeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getDataTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// EnumCS
protected class ClassifierCS_EnumCSParserRuleCall_2 extends RuleCallToken {
	
	public ClassifierCS_EnumCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getClassifierCSAccess().getEnumCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EnumCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEnumCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule ClassifierCS ****************/


/************ begin Rule DataTypeCS ****************
 *
 * DataTypeCS:
 *   annotations+=AnnotationCS* (qualifiers+="transient"|qualifiers+="!transient")*
 *   "datatype" name=ID ("<" typeParameters+=TypeParameterCS ("," typeParameters+=
 *   TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" constraints+=
 *   InvariantConstraintCS* "}"|";");
 *
 **/

// annotations+=AnnotationCS* (qualifiers+="transient"|qualifiers+="!transient")*
// "datatype" name=ID ("<" typeParameters+=TypeParameterCS ("," typeParameters+=
// TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" constraints+=
// InvariantConstraintCS* "}"|";")
protected class DataTypeCS_Group extends GroupToken {
	
	public DataTypeCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Alternatives_6(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getDataTypeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class DataTypeCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public DataTypeCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDataTypeCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DataTypeCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// (qualifiers+="transient"|qualifiers+="!transient")*
protected class DataTypeCS_Alternatives_1 extends AlternativesToken {

	public DataTypeCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_QualifiersAssignment_1_0(parent, this, 0, inst);
			case 1: return new DataTypeCS_QualifiersAssignment_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// qualifiers+="transient"
protected class DataTypeCS_QualifiersAssignment_1_0 extends AssignmentToken  {
	
	public DataTypeCS_QualifiersAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getQualifiersAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new DataTypeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("transient".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getDataTypeCSAccess().getQualifiersTransientKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!transient"
protected class DataTypeCS_QualifiersAssignment_1_1 extends AssignmentToken  {
	
	public DataTypeCS_QualifiersAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getQualifiersAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new DataTypeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!transient".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getDataTypeCSAccess().getQualifiersTransientKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}


// "datatype"
protected class DataTypeCS_DatatypeKeyword_2 extends KeywordToken  {
	
	public DataTypeCS_DatatypeKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getDatatypeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new DataTypeCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
}

// name=ID
protected class DataTypeCS_NameAssignment_3 extends AssignmentToken  {
	
	public DataTypeCS_NameAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_DatatypeKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getDataTypeCSAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
protected class DataTypeCS_Group_4 extends GroupToken {
	
	public DataTypeCS_Group_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_GreaterThanSignKeyword_4_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "<"
protected class DataTypeCS_LessThanSignKeyword_4_0 extends KeywordToken  {
	
	public DataTypeCS_LessThanSignKeyword_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getLessThanSignKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_NameAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class DataTypeCS_TypeParametersAssignment_4_1 extends AssignmentToken  {
	
	public DataTypeCS_TypeParametersAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getTypeParametersAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDataTypeCSAccess().getTypeParametersTypeParameterCSParserRuleCall_4_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DataTypeCS_LessThanSignKeyword_4_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," typeParameters+=TypeParameterCS)*
protected class DataTypeCS_Group_4_2 extends GroupToken {
	
	public DataTypeCS_Group_4_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_TypeParametersAssignment_4_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class DataTypeCS_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public DataTypeCS_CommaKeyword_4_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group_4_2(parent, this, 0, inst);
			case 1: return new DataTypeCS_TypeParametersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class DataTypeCS_TypeParametersAssignment_4_2_1 extends AssignmentToken  {
	
	public DataTypeCS_TypeParametersAssignment_4_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getTypeParametersAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDataTypeCSAccess().getTypeParametersTypeParameterCSParserRuleCall_4_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DataTypeCS_CommaKeyword_4_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ">"
protected class DataTypeCS_GreaterThanSignKeyword_4_3 extends KeywordToken  {
	
	public DataTypeCS_GreaterThanSignKeyword_4_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getGreaterThanSignKeyword_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group_4_2(parent, this, 0, inst);
			case 1: return new DataTypeCS_TypeParametersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


// (":" instanceClassName=FQN)?
protected class DataTypeCS_Group_5 extends GroupToken {
	
	public DataTypeCS_Group_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_InstanceClassNameAssignment_5_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class DataTypeCS_ColonKeyword_5_0 extends KeywordToken  {
	
	public DataTypeCS_ColonKeyword_5_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getColonKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group_4(parent, this, 0, inst);
			case 1: return new DataTypeCS_NameAssignment_3(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// instanceClassName=FQN
protected class DataTypeCS_InstanceClassNameAssignment_5_1 extends AssignmentToken  {
	
	public DataTypeCS_InstanceClassNameAssignment_5_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getInstanceClassNameAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_ColonKeyword_5_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("instanceClassName",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("instanceClassName");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getDataTypeCSAccess().getInstanceClassNameFQNParserRuleCall_5_1_0();
			return obj;
		}
		return null;
	}

}


// "{" constraints+=InvariantConstraintCS* "}"|";"
protected class DataTypeCS_Alternatives_6 extends AlternativesToken {

	public DataTypeCS_Alternatives_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getAlternatives_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group_6_0(parent, this, 0, inst);
			case 1: return new DataTypeCS_SemicolonKeyword_6_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "{" constraints+=InvariantConstraintCS* "}"
protected class DataTypeCS_Group_6_0 extends GroupToken {
	
	public DataTypeCS_Group_6_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_RightCurlyBracketKeyword_6_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "{"
protected class DataTypeCS_LeftCurlyBracketKeyword_6_0_0 extends KeywordToken  {
	
	public DataTypeCS_LeftCurlyBracketKeyword_6_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getLeftCurlyBracketKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group_5(parent, this, 0, inst);
			case 1: return new DataTypeCS_Group_4(parent, this, 1, inst);
			case 2: return new DataTypeCS_NameAssignment_3(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// constraints+=InvariantConstraintCS*
protected class DataTypeCS_ConstraintsAssignment_6_0_1 extends AssignmentToken  {
	
	public DataTypeCS_ConstraintsAssignment_6_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getConstraintsAssignment_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("constraints",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("constraints");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInvariantConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getDataTypeCSAccess().getConstraintsInvariantConstraintCSParserRuleCall_6_0_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new DataTypeCS_ConstraintsAssignment_6_0_1(parent, next, actIndex, consumed);
			case 1: return new DataTypeCS_LeftCurlyBracketKeyword_6_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class DataTypeCS_RightCurlyBracketKeyword_6_0_2 extends KeywordToken  {
	
	public DataTypeCS_RightCurlyBracketKeyword_6_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getRightCurlyBracketKeyword_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_ConstraintsAssignment_6_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ";"
protected class DataTypeCS_SemicolonKeyword_6_1 extends KeywordToken  {
	
	public DataTypeCS_SemicolonKeyword_6_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDataTypeCSAccess().getSemicolonKeyword_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCS_Group_5(parent, this, 0, inst);
			case 1: return new DataTypeCS_Group_4(parent, this, 1, inst);
			case 2: return new DataTypeCS_NameAssignment_3(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule DataTypeCS ****************/


/************ begin Rule DataTypeRef ****************
 *
 * DataTypeRef:
 *   DataTypeCSRef|EDataTypeRef;
 *
 **/

// DataTypeCSRef|EDataTypeRef
protected class DataTypeRef_Alternatives extends AlternativesToken {

	public DataTypeRef_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getDataTypeRefAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeRef_DataTypeCSRefParserRuleCall_0(parent, this, 0, inst);
			case 1: return new DataTypeRef_EDataTypeRefParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getDataTypeRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// DataTypeCSRef
protected class DataTypeRef_DataTypeCSRefParserRuleCall_0 extends RuleCallToken {
	
	public DataTypeRef_DataTypeCSRefParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getDataTypeRefAccess().getDataTypeCSRefParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DataTypeCSRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(DataTypeCSRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getDataTypeCSRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// EDataTypeRef
protected class DataTypeRef_EDataTypeRefParserRuleCall_1 extends RuleCallToken {
	
	public DataTypeRef_EDataTypeRefParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getDataTypeRefAccess().getEDataTypeRefParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EDataTypeRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EDataTypeRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEDataTypeRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule DataTypeRef ****************/


/************ begin Rule DataTypeCSRef ****************
 *
 * DataTypeCSRef:
 *   ref=[DataTypeOrEnumCS];
 *
 **/

// ref=[DataTypeOrEnumCS]
protected class DataTypeCSRef_RefAssignment extends AssignmentToken  {
	
	public DataTypeCSRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDataTypeCSRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getDataTypeCSRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDataTypeCSRefAccess().getRefDataTypeOrEnumCSCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getDataTypeCSRefAccess().getRefDataTypeOrEnumCSCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule DataTypeCSRef ****************/


/************ begin Rule DetailCS ****************
 *
 * DetailCS:
 *   (idName=ID|stringName=URL) "=" value=STRING_LITERAL;
 *
 **/

// (idName=ID|stringName=URL) "=" value=STRING_LITERAL
protected class DetailCS_Group extends GroupToken {
	
	public DetailCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getDetailCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DetailCS_ValueAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getDetailCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// idName=ID|stringName=URL
protected class DetailCS_Alternatives_0 extends AlternativesToken {

	public DetailCS_Alternatives_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getDetailCSAccess().getAlternatives_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DetailCS_IdNameAssignment_0_0(parent, this, 0, inst);
			case 1: return new DetailCS_StringNameAssignment_0_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// idName=ID
protected class DetailCS_IdNameAssignment_0_0 extends AssignmentToken  {
	
	public DetailCS_IdNameAssignment_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDetailCSAccess().getIdNameAssignment_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("idName",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("idName");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getDetailCSAccess().getIdNameIDTerminalRuleCall_0_0_0();
			return obj;
		}
		return null;
	}

}

// stringName=URL
protected class DetailCS_StringNameAssignment_0_1 extends AssignmentToken  {
	
	public DetailCS_StringNameAssignment_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDetailCSAccess().getStringNameAssignment_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stringName",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stringName");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getDetailCSAccess().getStringNameURLTerminalRuleCall_0_1_0();
			return obj;
		}
		return null;
	}

}


// "="
protected class DetailCS_EqualsSignKeyword_1 extends KeywordToken  {
	
	public DetailCS_EqualsSignKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getDetailCSAccess().getEqualsSignKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DetailCS_Alternatives_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// value=STRING_LITERAL
protected class DetailCS_ValueAssignment_2 extends AssignmentToken  {
	
	public DetailCS_ValueAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getDetailCSAccess().getValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new DetailCS_EqualsSignKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getDetailCSAccess().getValueSTRING_LITERALTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule DetailCS ****************/


/************ begin Rule EClassifierCSRef ****************
 *
 * EClassifierCSRef:
 *   modelName=ID "::" ref=[ecore::EClassifier];
 *
 **/

// modelName=ID "::" ref=[ecore::EClassifier]
protected class EClassifierCSRef_Group extends GroupToken {
	
	public EClassifierCSRef_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEClassifierCSRefAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EClassifierCSRef_RefAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEClassifierCSRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// modelName=ID
protected class EClassifierCSRef_ModelNameAssignment_0 extends AssignmentToken  {
	
	public EClassifierCSRef_ModelNameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEClassifierCSRefAccess().getModelNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("modelName",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("modelName");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getEClassifierCSRefAccess().getModelNameIDTerminalRuleCall_0_0();
			return obj;
		}
		return null;
	}

}

// "::"
protected class EClassifierCSRef_ColonColonKeyword_1 extends KeywordToken  {
	
	public EClassifierCSRef_ColonColonKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEClassifierCSRefAccess().getColonColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EClassifierCSRef_ModelNameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ref=[ecore::EClassifier]
protected class EClassifierCSRef_RefAssignment_2 extends AssignmentToken  {
	
	public EClassifierCSRef_RefAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEClassifierCSRefAccess().getRefAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EClassifierCSRef_ColonColonKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEClassifierCSRefAccess().getRefEClassifierCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getEClassifierCSRefAccess().getRefEClassifierCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule EClassifierCSRef ****************/


/************ begin Rule EnumCS ****************
 *
 * EnumCS:
 *   annotations+=AnnotationCS* "enum" name=ID ("<" typeParameters+=TypeParameterCS (","
 *   typeParameters+=TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" (literals+=
 *   EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";");
 *
 **/

// annotations+=AnnotationCS* "enum" name=ID ("<" typeParameters+=TypeParameterCS (","
// typeParameters+=TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" (literals+=
// EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";")
protected class EnumCS_Group extends GroupToken {
	
	public EnumCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Alternatives_5(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEnumCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class EnumCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public EnumCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEnumCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EnumCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// "enum"
protected class EnumCS_EnumKeyword_1 extends KeywordToken  {
	
	public EnumCS_EnumKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_AnnotationsAssignment_0(parent, this, 0, inst);
			default: return parent.createParentFollower(this, index, index - 1, inst);
		}	
	}	
		
}

// name=ID
protected class EnumCS_NameAssignment_2 extends AssignmentToken  {
	
	public EnumCS_NameAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_EnumKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getEnumCSAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
protected class EnumCS_Group_3 extends GroupToken {
	
	public EnumCS_Group_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_GreaterThanSignKeyword_3_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "<"
protected class EnumCS_LessThanSignKeyword_3_0 extends KeywordToken  {
	
	public EnumCS_LessThanSignKeyword_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getLessThanSignKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_NameAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class EnumCS_TypeParametersAssignment_3_1 extends AssignmentToken  {
	
	public EnumCS_TypeParametersAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getTypeParametersAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEnumCSAccess().getTypeParametersTypeParameterCSParserRuleCall_3_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EnumCS_LessThanSignKeyword_3_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," typeParameters+=TypeParameterCS)*
protected class EnumCS_Group_3_2 extends GroupToken {
	
	public EnumCS_Group_3_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_TypeParametersAssignment_3_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class EnumCS_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public EnumCS_CommaKeyword_3_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group_3_2(parent, this, 0, inst);
			case 1: return new EnumCS_TypeParametersAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class EnumCS_TypeParametersAssignment_3_2_1 extends AssignmentToken  {
	
	public EnumCS_TypeParametersAssignment_3_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getTypeParametersAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEnumCSAccess().getTypeParametersTypeParameterCSParserRuleCall_3_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EnumCS_CommaKeyword_3_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ">"
protected class EnumCS_GreaterThanSignKeyword_3_3 extends KeywordToken  {
	
	public EnumCS_GreaterThanSignKeyword_3_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getGreaterThanSignKeyword_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group_3_2(parent, this, 0, inst);
			case 1: return new EnumCS_TypeParametersAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


// (":" instanceClassName=FQN)?
protected class EnumCS_Group_4 extends GroupToken {
	
	public EnumCS_Group_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_InstanceClassNameAssignment_4_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class EnumCS_ColonKeyword_4_0 extends KeywordToken  {
	
	public EnumCS_ColonKeyword_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getColonKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group_3(parent, this, 0, inst);
			case 1: return new EnumCS_NameAssignment_2(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// instanceClassName=FQN
protected class EnumCS_InstanceClassNameAssignment_4_1 extends AssignmentToken  {
	
	public EnumCS_InstanceClassNameAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getInstanceClassNameAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_ColonKeyword_4_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("instanceClassName",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("instanceClassName");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getEnumCSAccess().getInstanceClassNameFQNParserRuleCall_4_1_0();
			return obj;
		}
		return null;
	}

}


// "{" (literals+=EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";"
protected class EnumCS_Alternatives_5 extends AlternativesToken {

	public EnumCS_Alternatives_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getAlternatives_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group_5_0(parent, this, 0, inst);
			case 1: return new EnumCS_SemicolonKeyword_5_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "{" (literals+=EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"
protected class EnumCS_Group_5_0 extends GroupToken {
	
	public EnumCS_Group_5_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_RightCurlyBracketKeyword_5_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "{"
protected class EnumCS_LeftCurlyBracketKeyword_5_0_0 extends KeywordToken  {
	
	public EnumCS_LeftCurlyBracketKeyword_5_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getLeftCurlyBracketKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group_4(parent, this, 0, inst);
			case 1: return new EnumCS_Group_3(parent, this, 1, inst);
			case 2: return new EnumCS_NameAssignment_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// (literals+=EnumLiteralCS|constraints+=InvariantConstraintCS)*
protected class EnumCS_Alternatives_5_0_1 extends AlternativesToken {

	public EnumCS_Alternatives_5_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getAlternatives_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_LiteralsAssignment_5_0_1_0(parent, this, 0, inst);
			case 1: return new EnumCS_ConstraintsAssignment_5_0_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// literals+=EnumLiteralCS
protected class EnumCS_LiteralsAssignment_5_0_1_0 extends AssignmentToken  {
	
	public EnumCS_LiteralsAssignment_5_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getLiteralsAssignment_5_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("literals",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("literals");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEnumLiteralCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEnumCSAccess().getLiteralsEnumLiteralCSParserRuleCall_5_0_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EnumCS_Alternatives_5_0_1(parent, next, actIndex, consumed);
			case 1: return new EnumCS_LeftCurlyBracketKeyword_5_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// constraints+=InvariantConstraintCS
protected class EnumCS_ConstraintsAssignment_5_0_1_1 extends AssignmentToken  {
	
	public EnumCS_ConstraintsAssignment_5_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getConstraintsAssignment_5_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvariantConstraintCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("constraints",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("constraints");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInvariantConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEnumCSAccess().getConstraintsInvariantConstraintCSParserRuleCall_5_0_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EnumCS_Alternatives_5_0_1(parent, next, actIndex, consumed);
			case 1: return new EnumCS_LeftCurlyBracketKeyword_5_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class EnumCS_RightCurlyBracketKeyword_5_0_2 extends KeywordToken  {
	
	public EnumCS_RightCurlyBracketKeyword_5_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getRightCurlyBracketKeyword_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Alternatives_5_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ";"
protected class EnumCS_SemicolonKeyword_5_1 extends KeywordToken  {
	
	public EnumCS_SemicolonKeyword_5_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumCSAccess().getSemicolonKeyword_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumCS_Group_4(parent, this, 0, inst);
			case 1: return new EnumCS_Group_3(parent, this, 1, inst);
			case 2: return new EnumCS_NameAssignment_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule EnumCS ****************/


/************ begin Rule EnumLiteralCS ****************
 *
 * EnumLiteralCS:
 *   annotations+=AnnotationCS* name=ID ("=" value=INTEGER)? ";";
 *
 **/

// annotations+=AnnotationCS* name=ID ("=" value=INTEGER)? ";"
protected class EnumLiteralCS_Group extends GroupToken {
	
	public EnumLiteralCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_SemicolonKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEnumLiteralCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class EnumLiteralCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public EnumLiteralCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEnumLiteralCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EnumLiteralCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// name=ID
protected class EnumLiteralCS_NameAssignment_1 extends AssignmentToken  {
	
	public EnumLiteralCS_NameAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_AnnotationsAssignment_0(parent, this, 0, inst);
			default: return parent.createParentFollower(this, index, index - 1, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getEnumLiteralCSAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("=" value=INTEGER)?
protected class EnumLiteralCS_Group_2 extends GroupToken {
	
	public EnumLiteralCS_Group_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_ValueAssignment_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "="
protected class EnumLiteralCS_EqualsSignKeyword_2_0 extends KeywordToken  {
	
	public EnumLiteralCS_EqualsSignKeyword_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getEqualsSignKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_NameAssignment_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// value=INTEGER
protected class EnumLiteralCS_ValueAssignment_2_1 extends AssignmentToken  {
	
	public EnumLiteralCS_ValueAssignment_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getValueAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_EqualsSignKeyword_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getEnumLiteralCSAccess().getValueINTEGERParserRuleCall_2_1_0();
			return obj;
		}
		return null;
	}

}


// ";"
protected class EnumLiteralCS_SemicolonKeyword_3 extends KeywordToken  {
	
	public EnumLiteralCS_SemicolonKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEnumLiteralCSAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EnumLiteralCS_Group_2(parent, this, 0, inst);
			case 1: return new EnumLiteralCS_NameAssignment_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule EnumLiteralCS ****************/


/************ begin Rule ImportCS ****************
 *
 * ImportCS:
 *   "import" (alias=ID "=") ePackage=[ecore::EPackage|URL] ";";
 *
 **/

// "import" (alias=ID "=") ePackage=[ecore::EPackage|URL] ";"
protected class ImportCS_Group extends GroupToken {
	
	public ImportCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getImportCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_SemicolonKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getImportCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// "import"
protected class ImportCS_ImportKeyword_0 extends KeywordToken  {
	
	public ImportCS_ImportKeyword_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getImportCSAccess().getImportKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
}

// alias=ID "="
protected class ImportCS_Group_1 extends GroupToken {
	
	public ImportCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getImportCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_EqualsSignKeyword_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// alias=ID
protected class ImportCS_AliasAssignment_1_0 extends AssignmentToken  {
	
	public ImportCS_AliasAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getImportCSAccess().getAliasAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_ImportKeyword_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("alias",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("alias");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getImportCSAccess().getAliasIDTerminalRuleCall_1_0_0();
			return obj;
		}
		return null;
	}

}

// "="
protected class ImportCS_EqualsSignKeyword_1_1 extends KeywordToken  {
	
	public ImportCS_EqualsSignKeyword_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getImportCSAccess().getEqualsSignKeyword_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_AliasAssignment_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ePackage=[ecore::EPackage|URL]
protected class ImportCS_EPackageAssignment_2 extends AssignmentToken  {
	
	public ImportCS_EPackageAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getImportCSAccess().getEPackageAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_Group_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ePackage",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ePackage");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getImportCSAccess().getEPackageEPackageCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getImportCSAccess().getEPackageEPackageCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class ImportCS_SemicolonKeyword_3 extends KeywordToken  {
	
	public ImportCS_SemicolonKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getImportCSAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImportCS_EPackageAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule ImportCS ****************/


/************ begin Rule OperationCS ****************
 *
 * OperationCS:
 *   annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
 *   qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
 *   "!unique")* "operation" name=ID ("<" typeParameters+=TypeParameterCS (","
 *   typeParameters+=TypeParameterCS)* ">")? "(" (parameters+=ParameterCS ("," parameters
 *   +=ParameterCS)*)? ")" (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|
 *   multiplicity=( "*" | "+" | "?" )) "]")?)? ("{" constraints+=( PreconditionConstraintCS |
 *   BodyConstraintCS | PostconditionConstraintCS )* "}"|";");
 *
 **/

// annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
// qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
// "!unique")* "operation" name=ID ("<" typeParameters+=TypeParameterCS (","
// typeParameters+=TypeParameterCS)* ">")? "(" (parameters+=ParameterCS ("," parameters
// +=ParameterCS)*)? ")" (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|
// multiplicity=( "*" | "+" | "?" )) "]")?)? ("{" constraints+=( PreconditionConstraintCS |
// BodyConstraintCS | PostconditionConstraintCS )* "}"|";")
protected class OperationCS_Group extends GroupToken {
	
	public OperationCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_9(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getOperationCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class OperationCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public OperationCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// (qualifiers+="derived"|qualifiers+="!derived"|qualifiers+="ordered"|qualifiers+=
// "!ordered"|qualifiers+="unique"|qualifiers+="!unique")*
protected class OperationCS_Alternatives_1 extends AlternativesToken {

	public OperationCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_QualifiersAssignment_1_0(parent, this, 0, inst);
			case 1: return new OperationCS_QualifiersAssignment_1_1(parent, this, 1, inst);
			case 2: return new OperationCS_QualifiersAssignment_1_2(parent, this, 2, inst);
			case 3: return new OperationCS_QualifiersAssignment_1_3(parent, this, 3, inst);
			case 4: return new OperationCS_QualifiersAssignment_1_4(parent, this, 4, inst);
			case 5: return new OperationCS_QualifiersAssignment_1_5(parent, this, 5, inst);
			default: return null;
		}	
	}	
		
}

// qualifiers+="derived"
protected class OperationCS_QualifiersAssignment_1_0 extends AssignmentToken  {
	
	public OperationCS_QualifiersAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("derived".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getQualifiersDerivedKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!derived"
protected class OperationCS_QualifiersAssignment_1_1 extends AssignmentToken  {
	
	public OperationCS_QualifiersAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!derived".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getQualifiersDerivedKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="ordered"
protected class OperationCS_QualifiersAssignment_1_2 extends AssignmentToken  {
	
	public OperationCS_QualifiersAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getQualifiersOrderedKeyword_1_2_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!ordered"
protected class OperationCS_QualifiersAssignment_1_3 extends AssignmentToken  {
	
	public OperationCS_QualifiersAssignment_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getQualifiersOrderedKeyword_1_3_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="unique"
protected class OperationCS_QualifiersAssignment_1_4 extends AssignmentToken  {
	
	public OperationCS_QualifiersAssignment_1_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getQualifiersUniqueKeyword_1_4_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!unique"
protected class OperationCS_QualifiersAssignment_1_5 extends AssignmentToken  {
	
	public OperationCS_QualifiersAssignment_1_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getQualifiersAssignment_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getQualifiersUniqueKeyword_1_5_0();
			return obj;
		}
		return null;
	}

}


// "operation"
protected class OperationCS_OperationKeyword_2 extends KeywordToken  {
	
	public OperationCS_OperationKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getOperationKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new OperationCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
}

// name=ID
protected class OperationCS_NameAssignment_3 extends AssignmentToken  {
	
	public OperationCS_NameAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_OperationKeyword_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getOperationCSAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
protected class OperationCS_Group_4 extends GroupToken {
	
	public OperationCS_Group_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_GreaterThanSignKeyword_4_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "<"
protected class OperationCS_LessThanSignKeyword_4_0 extends KeywordToken  {
	
	public OperationCS_LessThanSignKeyword_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getLessThanSignKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_NameAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class OperationCS_TypeParametersAssignment_4_1 extends AssignmentToken  {
	
	public OperationCS_TypeParametersAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getTypeParametersAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getTypeParametersTypeParameterCSParserRuleCall_4_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_LessThanSignKeyword_4_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," typeParameters+=TypeParameterCS)*
protected class OperationCS_Group_4_2 extends GroupToken {
	
	public OperationCS_Group_4_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_TypeParametersAssignment_4_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class OperationCS_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public OperationCS_CommaKeyword_4_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_4_2(parent, this, 0, inst);
			case 1: return new OperationCS_TypeParametersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// typeParameters+=TypeParameterCS
protected class OperationCS_TypeParametersAssignment_4_2_1 extends AssignmentToken  {
	
	public OperationCS_TypeParametersAssignment_4_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getTypeParametersAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeParameters",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeParameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getTypeParametersTypeParameterCSParserRuleCall_4_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_CommaKeyword_4_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ">"
protected class OperationCS_GreaterThanSignKeyword_4_3 extends KeywordToken  {
	
	public OperationCS_GreaterThanSignKeyword_4_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGreaterThanSignKeyword_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_4_2(parent, this, 0, inst);
			case 1: return new OperationCS_TypeParametersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


// "("
protected class OperationCS_LeftParenthesisKeyword_5 extends KeywordToken  {
	
	public OperationCS_LeftParenthesisKeyword_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getLeftParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_4(parent, this, 0, inst);
			case 1: return new OperationCS_NameAssignment_3(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// (parameters+=ParameterCS ("," parameters+=ParameterCS)*)?
protected class OperationCS_Group_6 extends GroupToken {
	
	public OperationCS_Group_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_6_1(parent, this, 0, inst);
			case 1: return new OperationCS_ParametersAssignment_6_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// parameters+=ParameterCS
protected class OperationCS_ParametersAssignment_6_0 extends AssignmentToken  {
	
	public OperationCS_ParametersAssignment_6_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getParametersAssignment_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("parameters",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getParametersParameterCSParserRuleCall_6_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_LeftParenthesisKeyword_5(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," parameters+=ParameterCS)*
protected class OperationCS_Group_6_1 extends GroupToken {
	
	public OperationCS_Group_6_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_ParametersAssignment_6_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class OperationCS_CommaKeyword_6_1_0 extends KeywordToken  {
	
	public OperationCS_CommaKeyword_6_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getCommaKeyword_6_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_6_1(parent, this, 0, inst);
			case 1: return new OperationCS_ParametersAssignment_6_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// parameters+=ParameterCS
protected class OperationCS_ParametersAssignment_6_1_1 extends AssignmentToken  {
	
	public OperationCS_ParametersAssignment_6_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getParametersAssignment_6_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("parameters",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getParameterCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getParametersParameterCSParserRuleCall_6_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_CommaKeyword_6_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// ")"
protected class OperationCS_RightParenthesisKeyword_7 extends KeywordToken  {
	
	public OperationCS_RightParenthesisKeyword_7(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getRightParenthesisKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_6(parent, this, 0, inst);
			case 1: return new OperationCS_LeftParenthesisKeyword_5(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
// "]")?)?
protected class OperationCS_Group_8 extends GroupToken {
	
	public OperationCS_Group_8(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_8();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_8_2(parent, this, 0, inst);
			case 1: return new OperationCS_TypeAssignment_8_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class OperationCS_ColonKeyword_8_0 extends KeywordToken  {
	
	public OperationCS_ColonKeyword_8_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getColonKeyword_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_RightParenthesisKeyword_7(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=TypeRefCS
protected class OperationCS_TypeAssignment_8_1 extends AssignmentToken  {
	
	public OperationCS_TypeAssignment_8_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getTypeAssignment_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getTypeTypeRefCSParserRuleCall_8_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_ColonKeyword_8_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
protected class OperationCS_Group_8_2 extends GroupToken {
	
	public OperationCS_Group_8_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_RightSquareBracketKeyword_8_2_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "["
protected class OperationCS_LeftSquareBracketKeyword_8_2_0 extends KeywordToken  {
	
	public OperationCS_LeftSquareBracketKeyword_8_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getLeftSquareBracketKeyword_8_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_TypeAssignment_8_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
protected class OperationCS_Alternatives_8_2_1 extends AlternativesToken {

	public OperationCS_Alternatives_8_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getAlternatives_8_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_8_2_1_0(parent, this, 0, inst);
			case 1: return new OperationCS_MultiplicityAssignment_8_2_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?
protected class OperationCS_Group_8_2_1_0 extends GroupToken {
	
	public OperationCS_Group_8_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_8_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_8_2_1_0_1(parent, this, 0, inst);
			case 1: return new OperationCS_LowerAssignment_8_2_1_0_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER
protected class OperationCS_LowerAssignment_8_2_1_0_0 extends AssignmentToken  {
	
	public OperationCS_LowerAssignment_8_2_1_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getLowerAssignment_8_2_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_LeftSquareBracketKeyword_8_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("lower",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("lower");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getOperationCSAccess().getLowerLOWERParserRuleCall_8_2_1_0_0_0();
			return obj;
		}
		return null;
	}

}

// (".." upper=UPPER)?
protected class OperationCS_Group_8_2_1_0_1 extends GroupToken {
	
	public OperationCS_Group_8_2_1_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_8_2_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_UpperAssignment_8_2_1_0_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ".."
protected class OperationCS_FullStopFullStopKeyword_8_2_1_0_1_0 extends KeywordToken  {
	
	public OperationCS_FullStopFullStopKeyword_8_2_1_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getFullStopFullStopKeyword_8_2_1_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_LowerAssignment_8_2_1_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// upper=UPPER
protected class OperationCS_UpperAssignment_8_2_1_0_1_1 extends AssignmentToken  {
	
	public OperationCS_UpperAssignment_8_2_1_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getUpperAssignment_8_2_1_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_FullStopFullStopKeyword_8_2_1_0_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("upper",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("upper");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getOperationCSAccess().getUpperUPPERParserRuleCall_8_2_1_0_1_1_0();
			return obj;
		}
		return null;
	}

}



// multiplicity=( "*" | "+" | "?" )
protected class OperationCS_MultiplicityAssignment_8_2_1_1 extends AssignmentToken  {
	
	public OperationCS_MultiplicityAssignment_8_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getMultiplicityAssignment_8_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_LeftSquareBracketKeyword_8_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("multiplicity",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("multiplicity");
		if("*".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getMultiplicityAsteriskKeyword_8_2_1_1_0_0();
			return obj;
		}
		if("+".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getMultiplicityPlusSignKeyword_8_2_1_1_0_1();
			return obj;
		}
		if("?".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOperationCSAccess().getMultiplicityQuestionMarkKeyword_8_2_1_1_0_2();
			return obj;
		}
		return null;
	}

}


// "]"
protected class OperationCS_RightSquareBracketKeyword_8_2_2 extends KeywordToken  {
	
	public OperationCS_RightSquareBracketKeyword_8_2_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getRightSquareBracketKeyword_8_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Alternatives_8_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}



// "{" constraints+=( PreconditionConstraintCS | BodyConstraintCS |
// PostconditionConstraintCS )* "}"|";"
protected class OperationCS_Alternatives_9 extends AlternativesToken {

	public OperationCS_Alternatives_9(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getAlternatives_9();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_9_0(parent, this, 0, inst);
			case 1: return new OperationCS_SemicolonKeyword_9_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "{" constraints+=( PreconditionConstraintCS | BodyConstraintCS |
// PostconditionConstraintCS )* "}"
protected class OperationCS_Group_9_0 extends GroupToken {
	
	public OperationCS_Group_9_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getGroup_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_RightCurlyBracketKeyword_9_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "{"
protected class OperationCS_LeftCurlyBracketKeyword_9_0_0 extends KeywordToken  {
	
	public OperationCS_LeftCurlyBracketKeyword_9_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getLeftCurlyBracketKeyword_9_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_8(parent, this, 0, inst);
			case 1: return new OperationCS_RightParenthesisKeyword_7(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// constraints+=( PreconditionConstraintCS | BodyConstraintCS |
// PostconditionConstraintCS )*
protected class OperationCS_ConstraintsAssignment_9_0_1 extends AssignmentToken  {
	
	public OperationCS_ConstraintsAssignment_9_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getConstraintsAssignment_9_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreconditionConstraintCS_Group(this, this, 0, inst);
			case 1: return new BodyConstraintCS_Group(this, this, 1, inst);
			case 2: return new PostconditionConstraintCS_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("constraints",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("constraints");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPreconditionConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getConstraintsPreconditionConstraintCSParserRuleCall_9_0_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getBodyConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getConstraintsBodyConstraintCSParserRuleCall_9_0_1_0_1(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPostconditionConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOperationCSAccess().getConstraintsPostconditionConstraintCSParserRuleCall_9_0_1_0_2(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OperationCS_ConstraintsAssignment_9_0_1(parent, next, actIndex, consumed);
			case 1: return new OperationCS_LeftCurlyBracketKeyword_9_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class OperationCS_RightCurlyBracketKeyword_9_0_2 extends KeywordToken  {
	
	public OperationCS_RightCurlyBracketKeyword_9_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getRightCurlyBracketKeyword_9_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_ConstraintsAssignment_9_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ";"
protected class OperationCS_SemicolonKeyword_9_1 extends KeywordToken  {
	
	public OperationCS_SemicolonKeyword_9_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getOperationCSAccess().getSemicolonKeyword_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OperationCS_Group_8(parent, this, 0, inst);
			case 1: return new OperationCS_RightParenthesisKeyword_7(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule OperationCS ****************/


/************ begin Rule PackageCS ****************
 *
 * PackageCS:
 *   annotations+=AnnotationCS* "package" name=ID "{" (subpackages+=PackageCS|classifiers
 *   +=ClassifierCS)* "}";
 *
 **/

// annotations+=AnnotationCS* "package" name=ID "{" (subpackages+=PackageCS|classifiers
// +=ClassifierCS)* "}"
protected class PackageCS_Group extends GroupToken {
	
	public PackageCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_RightCurlyBracketKeyword_5(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPackageCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class PackageCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public PackageCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPackageCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new PackageCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// "package"
protected class PackageCS_PackageKeyword_1 extends KeywordToken  {
	
	public PackageCS_PackageKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getPackageKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_AnnotationsAssignment_0(parent, this, 0, inst);
			default: return parent.createParentFollower(this, index, index - 1, inst);
		}	
	}	
		
}

// name=ID
protected class PackageCS_NameAssignment_2 extends AssignmentToken  {
	
	public PackageCS_NameAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_PackageKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getPackageCSAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class PackageCS_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public PackageCS_LeftCurlyBracketKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_NameAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// (subpackages+=PackageCS|classifiers+=ClassifierCS)*
protected class PackageCS_Alternatives_4 extends AlternativesToken {

	public PackageCS_Alternatives_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getAlternatives_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_SubpackagesAssignment_4_0(parent, this, 0, inst);
			case 1: return new PackageCS_ClassifiersAssignment_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// subpackages+=PackageCS
protected class PackageCS_SubpackagesAssignment_4_0 extends AssignmentToken  {
	
	public PackageCS_SubpackagesAssignment_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getSubpackagesAssignment_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("subpackages",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("subpackages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPackageCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPackageCSAccess().getSubpackagesPackageCSParserRuleCall_4_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new PackageCS_Alternatives_4(parent, next, actIndex, consumed);
			case 1: return new PackageCS_LeftCurlyBracketKeyword_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// classifiers+=ClassifierCS
protected class PackageCS_ClassifiersAssignment_4_1 extends AssignmentToken  {
	
	public PackageCS_ClassifiersAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getClassifiersAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ClassifierCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("classifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("classifiers");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getClassifierCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPackageCSAccess().getClassifiersClassifierCSParserRuleCall_4_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new PackageCS_Alternatives_4(parent, next, actIndex, consumed);
			case 1: return new PackageCS_LeftCurlyBracketKeyword_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class PackageCS_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public PackageCS_RightCurlyBracketKeyword_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPackageCSAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PackageCS_Alternatives_4(parent, this, 0, inst);
			case 1: return new PackageCS_LeftCurlyBracketKeyword_3(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule PackageCS ****************/


/************ begin Rule ParameterCS ****************
 *
 * ParameterCS:
 *   annotations+=AnnotationCS* (qualifiers+="ordered"|qualifiers+="!ordered"|
 *   qualifiers+="unique"|qualifiers+="!unique")* name=ID (":" type=TypeRefCS ("[" (lower=
 *   LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)?;
 *
 **/

// annotations+=AnnotationCS* (qualifiers+="ordered"|qualifiers+="!ordered"|
// qualifiers+="unique"|qualifiers+="!unique")* name=ID (":" type=TypeRefCS ("[" (lower=
// LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)?
protected class ParameterCS_Group extends GroupToken {
	
	public ParameterCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Group_3(parent, this, 0, inst);
			case 1: return new ParameterCS_NameAssignment_2(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getParameterCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class ParameterCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public ParameterCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getParameterCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ParameterCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// (qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
// "!unique")*
protected class ParameterCS_Alternatives_1 extends AlternativesToken {

	public ParameterCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_QualifiersAssignment_1_0(parent, this, 0, inst);
			case 1: return new ParameterCS_QualifiersAssignment_1_1(parent, this, 1, inst);
			case 2: return new ParameterCS_QualifiersAssignment_1_2(parent, this, 2, inst);
			case 3: return new ParameterCS_QualifiersAssignment_1_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}

// qualifiers+="ordered"
protected class ParameterCS_QualifiersAssignment_1_0 extends AssignmentToken  {
	
	public ParameterCS_QualifiersAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ParameterCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getQualifiersOrderedKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!ordered"
protected class ParameterCS_QualifiersAssignment_1_1 extends AssignmentToken  {
	
	public ParameterCS_QualifiersAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ParameterCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getQualifiersOrderedKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="unique"
protected class ParameterCS_QualifiersAssignment_1_2 extends AssignmentToken  {
	
	public ParameterCS_QualifiersAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ParameterCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getQualifiersUniqueKeyword_1_2_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!unique"
protected class ParameterCS_QualifiersAssignment_1_3 extends AssignmentToken  {
	
	public ParameterCS_QualifiersAssignment_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getQualifiersAssignment_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ParameterCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getQualifiersUniqueKeyword_1_3_0();
			return obj;
		}
		return null;
	}

}


// name=ID
protected class ParameterCS_NameAssignment_2 extends AssignmentToken  {
	
	public ParameterCS_NameAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ParameterCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getParameterCSAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
// "]")?)?
protected class ParameterCS_Group_3 extends GroupToken {
	
	public ParameterCS_Group_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Group_3_2(parent, this, 0, inst);
			case 1: return new ParameterCS_TypeAssignment_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class ParameterCS_ColonKeyword_3_0 extends KeywordToken  {
	
	public ParameterCS_ColonKeyword_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getColonKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_NameAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=TypeRefCS
protected class ParameterCS_TypeAssignment_3_1 extends AssignmentToken  {
	
	public ParameterCS_TypeAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getTypeAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getParameterCSAccess().getTypeTypeRefCSParserRuleCall_3_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ParameterCS_ColonKeyword_3_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
protected class ParameterCS_Group_3_2 extends GroupToken {
	
	public ParameterCS_Group_3_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_RightSquareBracketKeyword_3_2_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "["
protected class ParameterCS_LeftSquareBracketKeyword_3_2_0 extends KeywordToken  {
	
	public ParameterCS_LeftSquareBracketKeyword_3_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getLeftSquareBracketKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_TypeAssignment_3_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
protected class ParameterCS_Alternatives_3_2_1 extends AlternativesToken {

	public ParameterCS_Alternatives_3_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getAlternatives_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Group_3_2_1_0(parent, this, 0, inst);
			case 1: return new ParameterCS_MultiplicityAssignment_3_2_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?
protected class ParameterCS_Group_3_2_1_0 extends GroupToken {
	
	public ParameterCS_Group_3_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getGroup_3_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Group_3_2_1_0_1(parent, this, 0, inst);
			case 1: return new ParameterCS_LowerAssignment_3_2_1_0_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER
protected class ParameterCS_LowerAssignment_3_2_1_0_0 extends AssignmentToken  {
	
	public ParameterCS_LowerAssignment_3_2_1_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getLowerAssignment_3_2_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_LeftSquareBracketKeyword_3_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("lower",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("lower");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getParameterCSAccess().getLowerLOWERParserRuleCall_3_2_1_0_0_0();
			return obj;
		}
		return null;
	}

}

// (".." upper=UPPER)?
protected class ParameterCS_Group_3_2_1_0_1 extends GroupToken {
	
	public ParameterCS_Group_3_2_1_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getGroup_3_2_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_UpperAssignment_3_2_1_0_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ".."
protected class ParameterCS_FullStopFullStopKeyword_3_2_1_0_1_0 extends KeywordToken  {
	
	public ParameterCS_FullStopFullStopKeyword_3_2_1_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getFullStopFullStopKeyword_3_2_1_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_LowerAssignment_3_2_1_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// upper=UPPER
protected class ParameterCS_UpperAssignment_3_2_1_0_1_1 extends AssignmentToken  {
	
	public ParameterCS_UpperAssignment_3_2_1_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getUpperAssignment_3_2_1_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_FullStopFullStopKeyword_3_2_1_0_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("upper",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("upper");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getParameterCSAccess().getUpperUPPERParserRuleCall_3_2_1_0_1_1_0();
			return obj;
		}
		return null;
	}

}



// multiplicity=( "*" | "+" | "?" )
protected class ParameterCS_MultiplicityAssignment_3_2_1_1 extends AssignmentToken  {
	
	public ParameterCS_MultiplicityAssignment_3_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getMultiplicityAssignment_3_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_LeftSquareBracketKeyword_3_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("multiplicity",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("multiplicity");
		if("*".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getMultiplicityAsteriskKeyword_3_2_1_1_0_0();
			return obj;
		}
		if("+".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getMultiplicityPlusSignKeyword_3_2_1_1_0_1();
			return obj;
		}
		if("?".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getParameterCSAccess().getMultiplicityQuestionMarkKeyword_3_2_1_1_0_2();
			return obj;
		}
		return null;
	}

}


// "]"
protected class ParameterCS_RightSquareBracketKeyword_3_2_2 extends KeywordToken  {
	
	public ParameterCS_RightSquareBracketKeyword_3_2_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getParameterCSAccess().getRightSquareBracketKeyword_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ParameterCS_Alternatives_3_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}




/************ end Rule ParameterCS ****************/


/************ begin Rule ReferenceCS ****************
 *
 * ReferenceCS:
 *   annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
 *   qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers+=
 *   "!readonly"|qualifiers+="resolve"|qualifiers+="!resolve"|qualifiers+="transient"
 *   |qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers
 *   +="unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
 *   "!volatile")* ("reference"|containment?="property") name=ID ("#" opposite=
 *   ReferenceRef)? (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=
 *   ( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{" constraints+=(
 *   InitialConstraintCS | DerivedConstraintCS )* "}"|";");
 *
 **/

// annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
// qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers+=
// "!readonly"|qualifiers+="resolve"|qualifiers+="!resolve"|qualifiers+="transient"
// |qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers
// +="unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
// "!volatile")* ("reference"|containment?="property") name=ID ("#" opposite=
// ReferenceRef)? (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=
// ( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{" constraints+=(
// InitialConstraintCS | DerivedConstraintCS )* "}"|";")
protected class ReferenceCS_Group extends GroupToken {
	
	public ReferenceCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_7(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getReferenceCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// annotations+=AnnotationCS*
protected class ReferenceCS_AnnotationsAssignment_0 extends AssignmentToken  {
	
	public ReferenceCS_AnnotationsAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getAnnotationsAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AnnotationCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("annotations",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("annotations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnnotationCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getReferenceCSAccess().getAnnotationsAnnotationCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ReferenceCS_AnnotationsAssignment_0(parent, next, actIndex, consumed);
			default: return parent.createParentFollower(next, actIndex , index - 1, consumed);
		}	
	}	
}

// (qualifiers+="derived"|qualifiers+="!derived"|qualifiers+="ordered"|qualifiers+=
// "!ordered"|qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="resolve"|
// qualifiers+="!resolve"|qualifiers+="transient"|qualifiers+="!transient"|
// qualifiers+="unique"|qualifiers+="!unique"|qualifiers+="unsettable"|qualifiers+=
// "!unsettable"|qualifiers+="volatile"|qualifiers+="!volatile")*
protected class ReferenceCS_Alternatives_1 extends AlternativesToken {

	public ReferenceCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_QualifiersAssignment_1_0(parent, this, 0, inst);
			case 1: return new ReferenceCS_QualifiersAssignment_1_1(parent, this, 1, inst);
			case 2: return new ReferenceCS_QualifiersAssignment_1_2(parent, this, 2, inst);
			case 3: return new ReferenceCS_QualifiersAssignment_1_3(parent, this, 3, inst);
			case 4: return new ReferenceCS_QualifiersAssignment_1_4(parent, this, 4, inst);
			case 5: return new ReferenceCS_QualifiersAssignment_1_5(parent, this, 5, inst);
			case 6: return new ReferenceCS_QualifiersAssignment_1_6(parent, this, 6, inst);
			case 7: return new ReferenceCS_QualifiersAssignment_1_7(parent, this, 7, inst);
			case 8: return new ReferenceCS_QualifiersAssignment_1_8(parent, this, 8, inst);
			case 9: return new ReferenceCS_QualifiersAssignment_1_9(parent, this, 9, inst);
			case 10: return new ReferenceCS_QualifiersAssignment_1_10(parent, this, 10, inst);
			case 11: return new ReferenceCS_QualifiersAssignment_1_11(parent, this, 11, inst);
			case 12: return new ReferenceCS_QualifiersAssignment_1_12(parent, this, 12, inst);
			case 13: return new ReferenceCS_QualifiersAssignment_1_13(parent, this, 13, inst);
			case 14: return new ReferenceCS_QualifiersAssignment_1_14(parent, this, 14, inst);
			case 15: return new ReferenceCS_QualifiersAssignment_1_15(parent, this, 15, inst);
			default: return null;
		}	
	}	
		
}

// qualifiers+="derived"
protected class ReferenceCS_QualifiersAssignment_1_0 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("derived".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersDerivedKeyword_1_0_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!derived"
protected class ReferenceCS_QualifiersAssignment_1_1 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!derived".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersDerivedKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="ordered"
protected class ReferenceCS_QualifiersAssignment_1_2 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersOrderedKeyword_1_2_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!ordered"
protected class ReferenceCS_QualifiersAssignment_1_3 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!ordered".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersOrderedKeyword_1_3_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="readonly"
protected class ReferenceCS_QualifiersAssignment_1_4 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("readonly".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersReadonlyKeyword_1_4_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!readonly"
protected class ReferenceCS_QualifiersAssignment_1_5 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!readonly".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersReadonlyKeyword_1_5_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="resolve"
protected class ReferenceCS_QualifiersAssignment_1_6 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("resolve".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersResolveKeyword_1_6_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!resolve"
protected class ReferenceCS_QualifiersAssignment_1_7 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_7(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_7();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!resolve".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersResolveKeyword_1_7_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="transient"
protected class ReferenceCS_QualifiersAssignment_1_8 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_8(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_8();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("transient".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersTransientKeyword_1_8_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!transient"
protected class ReferenceCS_QualifiersAssignment_1_9 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_9(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_9();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!transient".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersTransientKeyword_1_9_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="unique"
protected class ReferenceCS_QualifiersAssignment_1_10 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_10(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_10();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersUniqueKeyword_1_10_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!unique"
protected class ReferenceCS_QualifiersAssignment_1_11 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_11(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_11();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!unique".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersUniqueKeyword_1_11_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="unsettable"
protected class ReferenceCS_QualifiersAssignment_1_12 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_12(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_12();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("unsettable".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersUnsettableKeyword_1_12_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!unsettable"
protected class ReferenceCS_QualifiersAssignment_1_13 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_13(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_13();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!unsettable".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersUnsettableKeyword_1_13_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="volatile"
protected class ReferenceCS_QualifiersAssignment_1_14 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_14(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_14();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("volatile".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersVolatileKeyword_1_14_0();
			return obj;
		}
		return null;
	}

}

// qualifiers+="!volatile"
protected class ReferenceCS_QualifiersAssignment_1_15 extends AssignmentToken  {
	
	public ReferenceCS_QualifiersAssignment_1_15(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getQualifiersAssignment_1_15();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("qualifiers",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("qualifiers");
		if("!volatile".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getQualifiersVolatileKeyword_1_15_0();
			return obj;
		}
		return null;
	}

}


// "reference"|containment?="property"
protected class ReferenceCS_Alternatives_2 extends AlternativesToken {

	public ReferenceCS_Alternatives_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getAlternatives_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_ReferenceKeyword_2_0(parent, this, 0, inst);
			case 1: return new ReferenceCS_ContainmentAssignment_2_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "reference"
protected class ReferenceCS_ReferenceKeyword_2_0 extends KeywordToken  {
	
	public ReferenceCS_ReferenceKeyword_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getReferenceKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
}

// containment?="property"
protected class ReferenceCS_ContainmentAssignment_2_1 extends AssignmentToken  {
	
	public ReferenceCS_ContainmentAssignment_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getContainmentAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_AnnotationsAssignment_0(parent, this, 1, inst);
			default: return parent.createParentFollower(this, index, index - 2, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("containment",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("containment");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getContainmentPropertyKeyword_2_1_0();
			return obj;
		}
		return null;
	}

}


// name=ID
protected class ReferenceCS_NameAssignment_3 extends AssignmentToken  {
	
	public ReferenceCS_NameAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getReferenceCSAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ("#" opposite=ReferenceRef)?
protected class ReferenceCS_Group_4 extends GroupToken {
	
	public ReferenceCS_Group_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_OppositeAssignment_4_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "#"
protected class ReferenceCS_NumberSignKeyword_4_0 extends KeywordToken  {
	
	public ReferenceCS_NumberSignKeyword_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getNumberSignKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_NameAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// opposite=ReferenceRef
protected class ReferenceCS_OppositeAssignment_4_1 extends AssignmentToken  {
	
	public ReferenceCS_OppositeAssignment_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getOppositeAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceRef_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("opposite",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("opposite");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getReferenceRefRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getReferenceCSAccess().getOppositeReferenceRefParserRuleCall_4_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ReferenceCS_NumberSignKeyword_4_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
// "]")?)?
protected class ReferenceCS_Group_5 extends GroupToken {
	
	public ReferenceCS_Group_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_5_2(parent, this, 0, inst);
			case 1: return new ReferenceCS_TypeAssignment_5_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class ReferenceCS_ColonKeyword_5_0 extends KeywordToken  {
	
	public ReferenceCS_ColonKeyword_5_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getColonKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_4(parent, this, 0, inst);
			case 1: return new ReferenceCS_NameAssignment_3(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// type=TypeRefCS
protected class ReferenceCS_TypeAssignment_5_1 extends AssignmentToken  {
	
	public ReferenceCS_TypeAssignment_5_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getTypeAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getReferenceCSAccess().getTypeTypeRefCSParserRuleCall_5_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ReferenceCS_ColonKeyword_5_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
protected class ReferenceCS_Group_5_2 extends GroupToken {
	
	public ReferenceCS_Group_5_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_RightSquareBracketKeyword_5_2_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "["
protected class ReferenceCS_LeftSquareBracketKeyword_5_2_0 extends KeywordToken  {
	
	public ReferenceCS_LeftSquareBracketKeyword_5_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getLeftSquareBracketKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_TypeAssignment_5_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
protected class ReferenceCS_Alternatives_5_2_1 extends AlternativesToken {

	public ReferenceCS_Alternatives_5_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getAlternatives_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_5_2_1_0(parent, this, 0, inst);
			case 1: return new ReferenceCS_MultiplicityAssignment_5_2_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER (".." upper=UPPER)?
protected class ReferenceCS_Group_5_2_1_0 extends GroupToken {
	
	public ReferenceCS_Group_5_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_5_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_5_2_1_0_1(parent, this, 0, inst);
			case 1: return new ReferenceCS_LowerAssignment_5_2_1_0_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// lower=LOWER
protected class ReferenceCS_LowerAssignment_5_2_1_0_0 extends AssignmentToken  {
	
	public ReferenceCS_LowerAssignment_5_2_1_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getLowerAssignment_5_2_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_LeftSquareBracketKeyword_5_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("lower",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("lower");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getReferenceCSAccess().getLowerLOWERParserRuleCall_5_2_1_0_0_0();
			return obj;
		}
		return null;
	}

}

// (".." upper=UPPER)?
protected class ReferenceCS_Group_5_2_1_0_1 extends GroupToken {
	
	public ReferenceCS_Group_5_2_1_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_5_2_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_UpperAssignment_5_2_1_0_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ".."
protected class ReferenceCS_FullStopFullStopKeyword_5_2_1_0_1_0 extends KeywordToken  {
	
	public ReferenceCS_FullStopFullStopKeyword_5_2_1_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getFullStopFullStopKeyword_5_2_1_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_LowerAssignment_5_2_1_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// upper=UPPER
protected class ReferenceCS_UpperAssignment_5_2_1_0_1_1 extends AssignmentToken  {
	
	public ReferenceCS_UpperAssignment_5_2_1_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getUpperAssignment_5_2_1_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_FullStopFullStopKeyword_5_2_1_0_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("upper",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("upper");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getReferenceCSAccess().getUpperUPPERParserRuleCall_5_2_1_0_1_1_0();
			return obj;
		}
		return null;
	}

}



// multiplicity=( "*" | "+" | "?" )
protected class ReferenceCS_MultiplicityAssignment_5_2_1_1 extends AssignmentToken  {
	
	public ReferenceCS_MultiplicityAssignment_5_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getMultiplicityAssignment_5_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_LeftSquareBracketKeyword_5_2_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("multiplicity",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("multiplicity");
		if("*".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getMultiplicityAsteriskKeyword_5_2_1_1_0_0();
			return obj;
		}
		if("+".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getMultiplicityPlusSignKeyword_5_2_1_1_0_1();
			return obj;
		}
		if("?".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getReferenceCSAccess().getMultiplicityQuestionMarkKeyword_5_2_1_1_0_2();
			return obj;
		}
		return null;
	}

}


// "]"
protected class ReferenceCS_RightSquareBracketKeyword_5_2_2 extends KeywordToken  {
	
	public ReferenceCS_RightSquareBracketKeyword_5_2_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getRightSquareBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Alternatives_5_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}



// ("=" defaultValueLiteral=URL)?
protected class ReferenceCS_Group_6 extends GroupToken {
	
	public ReferenceCS_Group_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_DefaultValueLiteralAssignment_6_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "="
protected class ReferenceCS_EqualsSignKeyword_6_0 extends KeywordToken  {
	
	public ReferenceCS_EqualsSignKeyword_6_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getEqualsSignKeyword_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_5(parent, this, 0, inst);
			case 1: return new ReferenceCS_Group_4(parent, this, 1, inst);
			case 2: return new ReferenceCS_NameAssignment_3(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// defaultValueLiteral=URL
protected class ReferenceCS_DefaultValueLiteralAssignment_6_1 extends AssignmentToken  {
	
	public ReferenceCS_DefaultValueLiteralAssignment_6_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getDefaultValueLiteralAssignment_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_EqualsSignKeyword_6_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("defaultValueLiteral",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("defaultValueLiteral");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getReferenceCSAccess().getDefaultValueLiteralURLTerminalRuleCall_6_1_0();
			return obj;
		}
		return null;
	}

}


// "{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";"
protected class ReferenceCS_Alternatives_7 extends AlternativesToken {

	public ReferenceCS_Alternatives_7(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getAlternatives_7();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_7_0(parent, this, 0, inst);
			case 1: return new ReferenceCS_SemicolonKeyword_7_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"
protected class ReferenceCS_Group_7_0 extends GroupToken {
	
	public ReferenceCS_Group_7_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getGroup_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_RightCurlyBracketKeyword_7_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "{"
protected class ReferenceCS_LeftCurlyBracketKeyword_7_0_0 extends KeywordToken  {
	
	public ReferenceCS_LeftCurlyBracketKeyword_7_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getLeftCurlyBracketKeyword_7_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_6(parent, this, 0, inst);
			case 1: return new ReferenceCS_Group_5(parent, this, 1, inst);
			case 2: return new ReferenceCS_Group_4(parent, this, 2, inst);
			case 3: return new ReferenceCS_NameAssignment_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}

// constraints+=( InitialConstraintCS | DerivedConstraintCS )*
protected class ReferenceCS_ConstraintsAssignment_7_0_1 extends AssignmentToken  {
	
	public ReferenceCS_ConstraintsAssignment_7_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getConstraintsAssignment_7_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InitialConstraintCS_Group(this, this, 0, inst);
			case 1: return new DerivedConstraintCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("constraints",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("constraints");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getInitialConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getReferenceCSAccess().getConstraintsInitialConstraintCSParserRuleCall_7_0_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDerivedConstraintCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getReferenceCSAccess().getConstraintsDerivedConstraintCSParserRuleCall_7_0_1_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ReferenceCS_ConstraintsAssignment_7_0_1(parent, next, actIndex, consumed);
			case 1: return new ReferenceCS_LeftCurlyBracketKeyword_7_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class ReferenceCS_RightCurlyBracketKeyword_7_0_2 extends KeywordToken  {
	
	public ReferenceCS_RightCurlyBracketKeyword_7_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getRightCurlyBracketKeyword_7_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_ConstraintsAssignment_7_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// ";"
protected class ReferenceCS_SemicolonKeyword_7_1 extends KeywordToken  {
	
	public ReferenceCS_SemicolonKeyword_7_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getReferenceCSAccess().getSemicolonKeyword_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group_6(parent, this, 0, inst);
			case 1: return new ReferenceCS_Group_5(parent, this, 1, inst);
			case 2: return new ReferenceCS_Group_4(parent, this, 2, inst);
			case 3: return new ReferenceCS_NameAssignment_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule ReferenceCS ****************/


/************ begin Rule ReferenceRef ****************
 *
 * ReferenceRef:
 *   ReferenceCSRef|EReferenceRef;
 *
 **/

// ReferenceCSRef|EReferenceRef
protected class ReferenceRef_Alternatives extends AlternativesToken {

	public ReferenceRef_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getReferenceRefAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceRef_ReferenceCSRefParserRuleCall_0(parent, this, 0, inst);
			case 1: return new ReferenceRef_EReferenceRefParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getReferenceRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// ReferenceCSRef
protected class ReferenceRef_ReferenceCSRefParserRuleCall_0 extends RuleCallToken {
	
	public ReferenceRef_ReferenceCSRefParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getReferenceRefAccess().getReferenceCSRefParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCSRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ReferenceCSRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getReferenceCSRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// EReferenceRef
protected class ReferenceRef_EReferenceRefParserRuleCall_1 extends RuleCallToken {
	
	public ReferenceRef_EReferenceRefParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getReferenceRefAccess().getEReferenceRefParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EReferenceRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EReferenceRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEReferenceRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule ReferenceRef ****************/


/************ begin Rule ReferenceCSRef ****************
 *
 * ReferenceCSRef:
 *   ref=[ReferenceCS];
 *
 **/

// ref=[ReferenceCS]
protected class ReferenceCSRef_RefAssignment extends AssignmentToken  {
	
	public ReferenceCSRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getReferenceCSRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getReferenceCSRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getReferenceCSRefAccess().getRefReferenceCSCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getReferenceCSRefAccess().getRefReferenceCSCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule ReferenceCSRef ****************/


/************ begin Rule StructuralFeatureCS ****************
 *
 * StructuralFeatureCS:
 *   AttributeCS|ReferenceCS;
 *
 **/

// AttributeCS|ReferenceCS
protected class StructuralFeatureCS_Alternatives extends AlternativesToken {

	public StructuralFeatureCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getStructuralFeatureCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new StructuralFeatureCS_AttributeCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new StructuralFeatureCS_ReferenceCSParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getStructuralFeatureCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// AttributeCS
protected class StructuralFeatureCS_AttributeCSParserRuleCall_0 extends RuleCallToken {
	
	public StructuralFeatureCS_AttributeCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getStructuralFeatureCSAccess().getAttributeCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AttributeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(AttributeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getAttributeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ReferenceCS
protected class StructuralFeatureCS_ReferenceCSParserRuleCall_1 extends RuleCallToken {
	
	public StructuralFeatureCS_ReferenceCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getStructuralFeatureCSAccess().getReferenceCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ReferenceCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ReferenceCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getReferenceCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule StructuralFeatureCS ****************/


/************ begin Rule TypeCSRef ****************
 *
 * TypeCSRef:
 *   ref=[TypeCS];
 *
 **/

// ref=[TypeCS]
protected class TypeCSRef_RefAssignment extends AssignmentToken  {
	
	public TypeCSRef_RefAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypeCSRefAccess().getRefAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypeCSRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("ref",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("ref");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRefAccess().getRefTypeCSCrossReference_0().getType().getClassifier())) {
				type = AssignmentType.CR;
				element = grammarAccess.getTypeCSRefAccess().getRefTypeCSCrossReference_0(); 
				return obj;
			}
		}
		return null;
	}

}

/************ end Rule TypeCSRef ****************/


/************ begin Rule TypeParameterCS ****************
 *
 * TypeParameterCS:
 *   name=ID ("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=
 *   TypeRefCS)?;
 *
 **/

// name=ID ("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=
// TypeRefCS)?
protected class TypeParameterCS_Group extends GroupToken {
	
	public TypeParameterCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Alternatives_1(parent, this, 0, inst);
			case 1: return new TypeParameterCS_NameAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypeParameterCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// name=ID
protected class TypeParameterCS_NameAssignment_0 extends AssignmentToken  {
	
	public TypeParameterCS_NameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getTypeParameterCSAccess().getNameIDTerminalRuleCall_0_0();
			return obj;
		}
		return null;
	}

}

// ("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=TypeRefCS)?
protected class TypeParameterCS_Alternatives_1 extends AlternativesToken {

	public TypeParameterCS_Alternatives_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getAlternatives_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group_1_0(parent, this, 0, inst);
			case 1: return new TypeParameterCS_Group_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*
protected class TypeParameterCS_Group_1_0 extends GroupToken {
	
	public TypeParameterCS_Group_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getGroup_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group_1_0_2(parent, this, 0, inst);
			case 1: return new TypeParameterCS_ExtendsAssignment_1_0_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "extends"
protected class TypeParameterCS_ExtendsKeyword_1_0_0 extends KeywordToken  {
	
	public TypeParameterCS_ExtendsKeyword_1_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// extends+=TypeRefCS
protected class TypeParameterCS_ExtendsAssignment_1_0_1 extends AssignmentToken  {
	
	public TypeParameterCS_ExtendsAssignment_1_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getExtendsAssignment_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("extends",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTypeParameterCSAccess().getExtendsTypeRefCSParserRuleCall_1_0_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TypeParameterCS_ExtendsKeyword_1_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("&&" extends+=TypeRefCS)*
protected class TypeParameterCS_Group_1_0_2 extends GroupToken {
	
	public TypeParameterCS_Group_1_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getGroup_1_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_ExtendsAssignment_1_0_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "&&"
protected class TypeParameterCS_AmpersandAmpersandKeyword_1_0_2_0 extends KeywordToken  {
	
	public TypeParameterCS_AmpersandAmpersandKeyword_1_0_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_Group_1_0_2(parent, this, 0, inst);
			case 1: return new TypeParameterCS_ExtendsAssignment_1_0_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// extends+=TypeRefCS
protected class TypeParameterCS_ExtendsAssignment_1_0_2_1 extends AssignmentToken  {
	
	public TypeParameterCS_ExtendsAssignment_1_0_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getExtendsAssignment_1_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("extends",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTypeParameterCSAccess().getExtendsTypeRefCSParserRuleCall_1_0_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TypeParameterCS_AmpersandAmpersandKeyword_1_0_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// "super" super=TypeRefCS
protected class TypeParameterCS_Group_1_1 extends GroupToken {
	
	public TypeParameterCS_Group_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getGroup_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_SuperAssignment_1_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "super"
protected class TypeParameterCS_SuperKeyword_1_1_0 extends KeywordToken  {
	
	public TypeParameterCS_SuperKeyword_1_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getSuperKeyword_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeParameterCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// super=TypeRefCS
protected class TypeParameterCS_SuperAssignment_1_1_1 extends AssignmentToken  {
	
	public TypeParameterCS_SuperAssignment_1_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypeParameterCSAccess().getSuperAssignment_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("super",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("super");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTypeParameterCSAccess().getSuperTypeRefCSParserRuleCall_1_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TypeParameterCS_SuperKeyword_1_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}




/************ end Rule TypeParameterCS ****************/


/************ begin Rule TypeRef ****************
 *
 * TypeRef:
 *   TypeCSRef|EClassifierRef|EClassifierCSRef;
 *
 **/

// TypeCSRef|EClassifierRef|EClassifierCSRef
protected class TypeRef_Alternatives extends AlternativesToken {

	public TypeRef_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTypeRefAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRef_TypeCSRefParserRuleCall_0(parent, this, 0, inst);
			case 1: return new TypeRef_EClassifierRefParserRuleCall_1(parent, this, 1, inst);
			case 2: return new TypeRef_EClassifierCSRefParserRuleCall_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypeRefRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// TypeCSRef
protected class TypeRef_TypeCSRefParserRuleCall_0 extends RuleCallToken {
	
	public TypeRef_TypeCSRefParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeRefAccess().getTypeCSRefParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCSRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TypeCSRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTypeCSRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// EClassifierRef
protected class TypeRef_EClassifierRefParserRuleCall_1 extends RuleCallToken {
	
	public TypeRef_EClassifierRefParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeRefAccess().getEClassifierRefParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EClassifierRef_RefAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EClassifierRef_RefAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEClassifierRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// EClassifierCSRef
protected class TypeRef_EClassifierCSRefParserRuleCall_2 extends RuleCallToken {
	
	public TypeRef_EClassifierCSRefParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeRefAccess().getEClassifierCSRefParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EClassifierCSRef_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EClassifierCSRef_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEClassifierCSRefRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule TypeRef ****************/


/************ begin Rule TypeRefCS ****************
 *
 * TypeRefCS:
 *   TypedTypeRefCS|WildcardTypeRefCS;
 *
 **/

// TypedTypeRefCS|WildcardTypeRefCS
protected class TypeRefCS_Alternatives extends AlternativesToken {

	public TypeRefCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTypeRefCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_TypedTypeRefCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new TypeRefCS_WildcardTypeRefCSParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// TypedTypeRefCS
protected class TypeRefCS_TypedTypeRefCSParserRuleCall_0 extends RuleCallToken {
	
	public TypeRefCS_TypedTypeRefCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeRefCSAccess().getTypedTypeRefCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TypedTypeRefCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTypedTypeRefCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// WildcardTypeRefCS
protected class TypeRefCS_WildcardTypeRefCSParserRuleCall_1 extends RuleCallToken {
	
	public TypeRefCS_WildcardTypeRefCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(WildcardTypeRefCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getWildcardTypeRefCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule TypeRefCS ****************/


/************ begin Rule TypedTypeRefCS ****************
 *
 * TypedTypeRefCS:
 *   type=TypeRef ("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?;
 *
 **/

// type=TypeRef ("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?
protected class TypedTypeRefCS_Group extends GroupToken {
	
	public TypedTypeRefCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_Group_1(parent, this, 0, inst);
			case 1: return new TypedTypeRefCS_TypeAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypedTypeRefCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// type=TypeRef
protected class TypedTypeRefCS_TypeAssignment_0 extends AssignmentToken  {
	
	public TypedTypeRefCS_TypeAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getTypeAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRef_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTypedTypeRefCSAccess().getTypeTypeRefParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// ("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?
protected class TypedTypeRefCS_Group_1 extends GroupToken {
	
	public TypedTypeRefCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_GreaterThanSignKeyword_1_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "<"
protected class TypedTypeRefCS_LessThanSignKeyword_1_0 extends KeywordToken  {
	
	public TypedTypeRefCS_LessThanSignKeyword_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getLessThanSignKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_TypeAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// typeArguments+=TypeRefCS
protected class TypedTypeRefCS_TypeArgumentsAssignment_1_1 extends AssignmentToken  {
	
	public TypedTypeRefCS_TypeArgumentsAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getTypeArgumentsAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeArguments",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeArguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTypedTypeRefCSAccess().getTypeArgumentsTypeRefCSParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TypedTypeRefCS_LessThanSignKeyword_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," typeArguments+=TypeRefCS)*
protected class TypedTypeRefCS_Group_1_2 extends GroupToken {
	
	public TypedTypeRefCS_Group_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getGroup_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_TypeArgumentsAssignment_1_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class TypedTypeRefCS_CommaKeyword_1_2_0 extends KeywordToken  {
	
	public TypedTypeRefCS_CommaKeyword_1_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getCommaKeyword_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_Group_1_2(parent, this, 0, inst);
			case 1: return new TypedTypeRefCS_TypeArgumentsAssignment_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// typeArguments+=TypeRefCS
protected class TypedTypeRefCS_TypeArgumentsAssignment_1_2_1 extends AssignmentToken  {
	
	public TypedTypeRefCS_TypeArgumentsAssignment_1_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getTypeArgumentsAssignment_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeArguments",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeArguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTypedTypeRefCSAccess().getTypeArgumentsTypeRefCSParserRuleCall_1_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TypedTypeRefCS_CommaKeyword_1_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ">"
protected class TypedTypeRefCS_GreaterThanSignKeyword_1_3 extends KeywordToken  {
	
	public TypedTypeRefCS_GreaterThanSignKeyword_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTypedTypeRefCSAccess().getGreaterThanSignKeyword_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypedTypeRefCS_Group_1_2(parent, this, 0, inst);
			case 1: return new TypedTypeRefCS_TypeArgumentsAssignment_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule TypedTypeRefCS ****************/


/************ begin Rule WildcardTypeRefCS ****************
 *
 * WildcardTypeRefCS:
 *   {WildcardTypeRefCS} "?" ("extends" extends=TypeRefCS|"super" super=TypeRefCS)?;
 *
 **/

// {WildcardTypeRefCS} "?" ("extends" extends=TypeRefCS|"super" super=TypeRefCS)?
protected class WildcardTypeRefCS_Group extends GroupToken {
	
	public WildcardTypeRefCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_Alternatives_2(parent, this, 0, inst);
			case 1: return new WildcardTypeRefCS_QuestionMarkKeyword_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getWildcardTypeRefCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// {WildcardTypeRefCS}
protected class WildcardTypeRefCS_WildcardTypeRefCSAction_0 extends ActionToken  {

	public WildcardTypeRefCS_WildcardTypeRefCSAction_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// "?"
protected class WildcardTypeRefCS_QuestionMarkKeyword_1 extends KeywordToken  {
	
	public WildcardTypeRefCS_QuestionMarkKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_WildcardTypeRefCSAction_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ("extends" extends=TypeRefCS|"super" super=TypeRefCS)?
protected class WildcardTypeRefCS_Alternatives_2 extends AlternativesToken {

	public WildcardTypeRefCS_Alternatives_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getAlternatives_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_Group_2_0(parent, this, 0, inst);
			case 1: return new WildcardTypeRefCS_Group_2_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "extends" extends=TypeRefCS
protected class WildcardTypeRefCS_Group_2_0 extends GroupToken {
	
	public WildcardTypeRefCS_Group_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getGroup_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_ExtendsAssignment_2_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "extends"
protected class WildcardTypeRefCS_ExtendsKeyword_2_0_0 extends KeywordToken  {
	
	public WildcardTypeRefCS_ExtendsKeyword_2_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_QuestionMarkKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// extends=TypeRefCS
protected class WildcardTypeRefCS_ExtendsAssignment_2_0_1 extends AssignmentToken  {
	
	public WildcardTypeRefCS_ExtendsAssignment_2_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getExtendsAssignment_2_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("extends",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getWildcardTypeRefCSAccess().getExtendsTypeRefCSParserRuleCall_2_0_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new WildcardTypeRefCS_ExtendsKeyword_2_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "super" super=TypeRefCS
protected class WildcardTypeRefCS_Group_2_1 extends GroupToken {
	
	public WildcardTypeRefCS_Group_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getGroup_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_SuperAssignment_2_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "super"
protected class WildcardTypeRefCS_SuperKeyword_2_1_0 extends KeywordToken  {
	
	public WildcardTypeRefCS_SuperKeyword_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getSuperKeyword_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new WildcardTypeRefCS_QuestionMarkKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// super=TypeRefCS
protected class WildcardTypeRefCS_SuperAssignment_2_1_1 extends AssignmentToken  {
	
	public WildcardTypeRefCS_SuperAssignment_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getWildcardTypeRefCSAccess().getSuperAssignment_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeRefCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("super",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("super");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeRefCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getWildcardTypeRefCSAccess().getSuperTypeRefCSParserRuleCall_2_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new WildcardTypeRefCS_SuperKeyword_2_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}




/************ end Rule WildcardTypeRefCS ****************/


/************ begin Rule Model ****************
 *
 * Model returns OclExpressionCS:
 *   OclExpressionCS;  
 * //generate essentialOCLCST "http://www.eclipse.org/ocl/3.0.0/EssentialOCLCST"
 *
 **/

// OclExpressionCS
protected class Model_OclExpressionCSParserRuleCall extends RuleCallToken {
	
	public Model_OclExpressionCSParserRuleCall(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getModelAccess().getOclExpressionCSParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getModelRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(OclExpressionCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule Model ****************/




/************ begin Rule tupleKeywordCS ****************
 *
 * tupleKeywordCS returns SimpleNameCS:
 *   value="Tuple"; 
 * 	
 * //---------------------------------------------------------------------
 * //  Names
 * //---------------------------------------------------------------------
 * / *  Temporary backward compatibility support for 7.4.8 conceptual usage 
 *     conceptualOperationName returns SimpleNameCS:
 *     	value='and'
 *     	| value='implies'
 *     	| value='not'
 *     	| value='or'
 *     	| value='xor'
 *     	| value='<'
 *     	| value='<='
 *     	| value='>='
 *     	| value='>'
 *     	| value='='
 *     	| value='<>'
 *     	| value='+'
 *     	| value='-'
 *     	| value='*'
 *     	| value='/';
 *     conceptualOperationNameCS returns SimpleNameCS:
 *     	conceptualOperationName; * /
 *     
 * / *    reservedKeyword returns SimpleNameCS: 
 *     	value='and'
 *     	| value='else'
 *     	| value='endif'
 *     	| value='if'
 *     	| value='implies'
 *     	| value='in'
 *     	| value='let'
 *     	| value='not'
 *     	| value='or'
 *     	| value='then'
 *     	| value='xor'; * /
 * 
 *         
 *     	
 *     
 * //    reservedKeywordCS returns SimpleNameCS:
 * //    	reservedKeyword;
 *
 **/

// value="Tuple"
protected class TupleKeywordCS_ValueAssignment extends AssignmentToken  {
	
	public TupleKeywordCS_ValueAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleKeywordCSAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTupleKeywordCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Tuple".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getTupleKeywordCSAccess().getValueTupleKeyword_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule tupleKeywordCS ****************/


/************ begin Rule restrictedKeywordCS ****************
 *
 * restrictedKeywordCS returns SimpleNameCS:
 *   CollectionTypeIdentifierCS|primitiveTypeCS|tupleKeywordCS; 
 *     
 * //    reservedKeywordCS returns SimpleNameCS:
 * //    	reservedKeyword;
 *     
 *          
 *     	
 * //  restrictedKeywordCS -> BooleanLiteralExpCS
 * //  restrictedKeywordCS -> InvalidLiteralExpCS
 * //  restrictedKeywordCS -> NullLiteralExpCS
 * //-  restrictedKeywordCS -> selfKeywordCS
 *
 **/

// CollectionTypeIdentifierCS|primitiveTypeCS|tupleKeywordCS 
//     
// //    reservedKeywordCS returns SimpleNameCS:
// //    	reservedKeyword;
//     
//          
//     	
// //  restrictedKeywordCS -> BooleanLiteralExpCS
// //  restrictedKeywordCS -> InvalidLiteralExpCS
// //  restrictedKeywordCS -> NullLiteralExpCS
// //-  restrictedKeywordCS -> selfKeywordCS
protected class RestrictedKeywordCS_Alternatives extends AlternativesToken {

	public RestrictedKeywordCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getRestrictedKeywordCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RestrictedKeywordCS_CollectionTypeIdentifierCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new RestrictedKeywordCS_PrimitiveTypeCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new RestrictedKeywordCS_TupleKeywordCSParserRuleCall_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getRestrictedKeywordCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// CollectionTypeIdentifierCS  
//     	
// //  restrictedKeywordCS -> BooleanLiteralExpCS
// //  restrictedKeywordCS -> InvalidLiteralExpCS
// //  restrictedKeywordCS -> NullLiteralExpCS
// //-  restrictedKeywordCS -> selfKeywordCS
protected class RestrictedKeywordCS_CollectionTypeIdentifierCSParserRuleCall_0 extends RuleCallToken {
	
	public RestrictedKeywordCS_CollectionTypeIdentifierCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getRestrictedKeywordCSAccess().getCollectionTypeIdentifierCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeIdentifierCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CollectionTypeIdentifierCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeIdentifierCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// primitiveTypeCS
protected class RestrictedKeywordCS_PrimitiveTypeCSParserRuleCall_1 extends RuleCallToken {
	
	public RestrictedKeywordCS_PrimitiveTypeCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getRestrictedKeywordCSAccess().getPrimitiveTypeCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimitiveTypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PrimitiveTypeCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPrimitiveTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// tupleKeywordCS
protected class RestrictedKeywordCS_TupleKeywordCSParserRuleCall_2 extends RuleCallToken {
	
	public RestrictedKeywordCS_TupleKeywordCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getRestrictedKeywordCSAccess().getTupleKeywordCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleKeywordCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TupleKeywordCS_ValueAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTupleKeywordCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule restrictedKeywordCS ****************/


/************ begin Rule selfKeywordCS ****************
 *
 * selfKeywordCS returns SimpleNameCS:
 *   value="self";
 *
 **/

// value="self"
protected class SelfKeywordCS_ValueAssignment extends AssignmentToken  {
	
	public SelfKeywordCS_ValueAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSelfKeywordCSAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getSelfKeywordCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("self".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getSelfKeywordCSAccess().getValueSelfKeyword_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule selfKeywordCS ****************/


/************ begin Rule simpleNameCS ****************
 *
 * simpleNameCS returns SimpleNameCS:
 *   value=ID;
 *
 **/

// value=ID
protected class SimpleNameCS_ValueAssignment extends AssignmentToken  {
	
	public SimpleNameCS_ValueAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSimpleNameCSAccess().getValueAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getSimpleNameCSAccess().getValueIDTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule simpleNameCS ****************/


/************ begin Rule unreservedSimpleNameCS ****************
 *
 * unreservedSimpleNameCS returns SimpleNameCS:
 *   simpleNameCS|restrictedKeywordCS;
 *
 **/

// simpleNameCS|restrictedKeywordCS
protected class UnreservedSimpleNameCS_Alternatives extends AlternativesToken {

	public UnreservedSimpleNameCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getUnreservedSimpleNameCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnreservedSimpleNameCS_SimpleNameCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new UnreservedSimpleNameCS_RestrictedKeywordCSParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getUnreservedSimpleNameCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// simpleNameCS
protected class UnreservedSimpleNameCS_SimpleNameCSParserRuleCall_0 extends RuleCallToken {
	
	public UnreservedSimpleNameCS_SimpleNameCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getUnreservedSimpleNameCSAccess().getSimpleNameCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(SimpleNameCS_ValueAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// restrictedKeywordCS
protected class UnreservedSimpleNameCS_RestrictedKeywordCSParserRuleCall_1 extends RuleCallToken {
	
	public UnreservedSimpleNameCS_RestrictedKeywordCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getUnreservedSimpleNameCSAccess().getRestrictedKeywordCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RestrictedKeywordCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(RestrictedKeywordCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getRestrictedKeywordCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule unreservedSimpleNameCS ****************/


/************ begin Rule pathNameCS ****************
 *
 * pathNameCS returns PathNameCS:
 *   simpleNames+=simpleNameCS ("::" simpleNames+=unreservedSimpleNameCS)*; 
 * 
 *         
 *     	    
 * 
 *         
 * //---------------------------------------------------------------------
 * //  Types
 * //---------------------------------------------------------------------
 *
 **/

// simpleNames+=simpleNameCS ("::" simpleNames+=unreservedSimpleNameCS)*
protected class PathNameCS_Group extends GroupToken {
	
	public PathNameCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPathNameCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_Group_1(parent, this, 0, inst);
			case 1: return new PathNameCS_SimpleNamesAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPathNameCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// simpleNames+=simpleNameCS
protected class PathNameCS_SimpleNamesAssignment_0 extends AssignmentToken  {
	
	public PathNameCS_SimpleNamesAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPathNameCSAccess().getSimpleNamesAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("simpleNames",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("simpleNames");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPathNameCSAccess().getSimpleNamesSimpleNameCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// ("::" simpleNames+=unreservedSimpleNameCS)*
protected class PathNameCS_Group_1 extends GroupToken {
	
	public PathNameCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPathNameCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_SimpleNamesAssignment_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "::"
protected class PathNameCS_ColonColonKeyword_1_0 extends KeywordToken  {
	
	public PathNameCS_ColonColonKeyword_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_Group_1(parent, this, 0, inst);
			case 1: return new PathNameCS_SimpleNamesAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// simpleNames+=unreservedSimpleNameCS
protected class PathNameCS_SimpleNamesAssignment_1_1 extends AssignmentToken  {
	
	public PathNameCS_SimpleNamesAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPathNameCSAccess().getSimpleNamesAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnreservedSimpleNameCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("simpleNames",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("simpleNames");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getUnreservedSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getPathNameCSAccess().getSimpleNamesUnreservedSimpleNameCSParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new PathNameCS_ColonColonKeyword_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule pathNameCS ****************/


/************ begin Rule primitiveTypeCS ****************
 *
 * primitiveTypeCS returns SimpleNameCS:
 *   value="Boolean"|value="Integer"|value="Real"|value="String"|value=
 *   "UnlimitedNatural"|value="OclAny"|value="OclInvalid"|value="OclVoid"; 
 * 
 *         
 * //---------------------------------------------------------------------
 * //  Types
 * //---------------------------------------------------------------------
 *
 **/

// value="Boolean"|value="Integer"|value="Real"|value="String"|value=
// "UnlimitedNatural"|value="OclAny"|value="OclInvalid"|value="OclVoid" 
// 
//         
// //---------------------------------------------------------------------
// //  Types
// //---------------------------------------------------------------------
protected class PrimitiveTypeCS_Alternatives extends AlternativesToken {

	public PrimitiveTypeCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimitiveTypeCS_ValueAssignment_0(parent, this, 0, inst);
			case 1: return new PrimitiveTypeCS_ValueAssignment_1(parent, this, 1, inst);
			case 2: return new PrimitiveTypeCS_ValueAssignment_2(parent, this, 2, inst);
			case 3: return new PrimitiveTypeCS_ValueAssignment_3(parent, this, 3, inst);
			case 4: return new PrimitiveTypeCS_ValueAssignment_4(parent, this, 4, inst);
			case 5: return new PrimitiveTypeCS_ValueAssignment_5(parent, this, 5, inst);
			case 6: return new PrimitiveTypeCS_ValueAssignment_6(parent, this, 6, inst);
			case 7: return new PrimitiveTypeCS_ValueAssignment_7(parent, this, 7, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPrimitiveTypeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// value="Boolean"
protected class PrimitiveTypeCS_ValueAssignment_0 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Boolean".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueBooleanKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// value="Integer"
protected class PrimitiveTypeCS_ValueAssignment_1 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Integer".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueIntegerKeyword_1_0();
			return obj;
		}
		return null;
	}

}

// value="Real"
protected class PrimitiveTypeCS_ValueAssignment_2 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Real".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueRealKeyword_2_0();
			return obj;
		}
		return null;
	}

}

// value="String"
protected class PrimitiveTypeCS_ValueAssignment_3 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("String".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueStringKeyword_3_0();
			return obj;
		}
		return null;
	}

}

// value="UnlimitedNatural"
protected class PrimitiveTypeCS_ValueAssignment_4 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("UnlimitedNatural".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueUnlimitedNaturalKeyword_4_0();
			return obj;
		}
		return null;
	}

}

// value="OclAny"
protected class PrimitiveTypeCS_ValueAssignment_5 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("OclAny".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueOclAnyKeyword_5_0();
			return obj;
		}
		return null;
	}

}

// value="OclInvalid"
protected class PrimitiveTypeCS_ValueAssignment_6 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("OclInvalid".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueOclInvalidKeyword_6_0();
			return obj;
		}
		return null;
	}

}

// value="OclVoid"
protected class PrimitiveTypeCS_ValueAssignment_7 extends AssignmentToken  {
	
	public PrimitiveTypeCS_ValueAssignment_7(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrimitiveTypeCSAccess().getValueAssignment_7();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("OclVoid".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getPrimitiveTypeCSAccess().getValueOclVoidKeyword_7_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule primitiveTypeCS ****************/


/************ begin Rule CollectionTypeIdentifierCS ****************
 *
 * CollectionTypeIdentifierCS returns SimpleNameCS:
 *   value="Set"|value="Bag"|value="Sequence"|value="Collection"|value="OrderedSet";
 *
 **/

// value="Set"|value="Bag"|value="Sequence"|value="Collection"|value="OrderedSet"
protected class CollectionTypeIdentifierCS_Alternatives extends AlternativesToken {

	public CollectionTypeIdentifierCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getCollectionTypeIdentifierCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeIdentifierCS_ValueAssignment_0(parent, this, 0, inst);
			case 1: return new CollectionTypeIdentifierCS_ValueAssignment_1(parent, this, 1, inst);
			case 2: return new CollectionTypeIdentifierCS_ValueAssignment_2(parent, this, 2, inst);
			case 3: return new CollectionTypeIdentifierCS_ValueAssignment_3(parent, this, 3, inst);
			case 4: return new CollectionTypeIdentifierCS_ValueAssignment_4(parent, this, 4, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeIdentifierCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// value="Set"
protected class CollectionTypeIdentifierCS_ValueAssignment_0 extends AssignmentToken  {
	
	public CollectionTypeIdentifierCS_ValueAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Set".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getCollectionTypeIdentifierCSAccess().getValueSetKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// value="Bag"
protected class CollectionTypeIdentifierCS_ValueAssignment_1 extends AssignmentToken  {
	
	public CollectionTypeIdentifierCS_ValueAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Bag".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getCollectionTypeIdentifierCSAccess().getValueBagKeyword_1_0();
			return obj;
		}
		return null;
	}

}

// value="Sequence"
protected class CollectionTypeIdentifierCS_ValueAssignment_2 extends AssignmentToken  {
	
	public CollectionTypeIdentifierCS_ValueAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Sequence".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getCollectionTypeIdentifierCSAccess().getValueSequenceKeyword_2_0();
			return obj;
		}
		return null;
	}

}

// value="Collection"
protected class CollectionTypeIdentifierCS_ValueAssignment_3 extends AssignmentToken  {
	
	public CollectionTypeIdentifierCS_ValueAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Collection".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getCollectionTypeIdentifierCSAccess().getValueCollectionKeyword_3_0();
			return obj;
		}
		return null;
	}

}

// value="OrderedSet"
protected class CollectionTypeIdentifierCS_ValueAssignment_4 extends AssignmentToken  {
	
	public CollectionTypeIdentifierCS_ValueAssignment_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeIdentifierCSAccess().getValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("OrderedSet".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getCollectionTypeIdentifierCSAccess().getValueOrderedSetKeyword_4_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule CollectionTypeIdentifierCS ****************/


/************ begin Rule typeCS ****************
 *
 * typeCS returns TypeCS:
 *   primitiveTypeCS|pathNameCS|collectionTypeCS|tupleTypeCS;
 *
 **/

// primitiveTypeCS|pathNameCS|collectionTypeCS|tupleTypeCS
protected class TypeCS_Alternatives extends AlternativesToken {

	public TypeCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTypeCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_PrimitiveTypeCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new TypeCS_PathNameCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new TypeCS_CollectionTypeCSParserRuleCall_2(parent, this, 2, inst);
			case 3: return new TypeCS_TupleTypeCSParserRuleCall_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// primitiveTypeCS
protected class TypeCS_PrimitiveTypeCSParserRuleCall_0 extends RuleCallToken {
	
	public TypeCS_PrimitiveTypeCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeCSAccess().getPrimitiveTypeCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimitiveTypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PrimitiveTypeCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPrimitiveTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// pathNameCS
protected class TypeCS_PathNameCSParserRuleCall_1 extends RuleCallToken {
	
	public TypeCS_PathNameCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeCSAccess().getPathNameCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PathNameCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPathNameCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// collectionTypeCS
protected class TypeCS_CollectionTypeCSParserRuleCall_2 extends RuleCallToken {
	
	public TypeCS_CollectionTypeCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeCSAccess().getCollectionTypeCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CollectionTypeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// tupleTypeCS
protected class TypeCS_TupleTypeCSParserRuleCall_3 extends RuleCallToken {
	
	public TypeCS_TupleTypeCSParserRuleCall_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeCSAccess().getTupleTypeCSParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TupleTypeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTupleTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule typeCS ****************/


/************ begin Rule collectionTypeCS ****************
 *
 * collectionTypeCS returns CollectionTypeCS:
 *   value=CollectionTypeIdentifierCS "(" typeCS=typeCS ")";
 *
 **/

// value=CollectionTypeIdentifierCS "(" typeCS=typeCS ")"
protected class CollectionTypeCS_Group extends GroupToken {
	
	public CollectionTypeCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionTypeCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeCS_RightParenthesisKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// value=CollectionTypeIdentifierCS
protected class CollectionTypeCS_ValueAssignment_0 extends AssignmentToken  {
	
	public CollectionTypeCS_ValueAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeCSAccess().getValueAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeIdentifierCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getCollectionTypeIdentifierCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCollectionTypeCSAccess().getValueCollectionTypeIdentifierCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// "("
protected class CollectionTypeCS_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public CollectionTypeCS_LeftParenthesisKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeCS_ValueAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// typeCS=typeCS
protected class CollectionTypeCS_TypeCSAssignment_2 extends AssignmentToken  {
	
	public CollectionTypeCS_TypeCSAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionTypeCSAccess().getTypeCSAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("typeCS",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("typeCS");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCollectionTypeCSAccess().getTypeCSTypeCSParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CollectionTypeCS_LeftParenthesisKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class CollectionTypeCS_RightParenthesisKeyword_3 extends KeywordToken  {
	
	public CollectionTypeCS_RightParenthesisKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeCS_TypeCSAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule collectionTypeCS ****************/


/************ begin Rule tupleTypeCS ****************
 *
 * tupleTypeCS returns TupleTypeCS:
 *   value="Tuple" "(" (part+=tuplePartCS ("," part+=tuplePartCS)*)? ")";
 *
 **/

// value="Tuple" "(" (part+=tuplePartCS ("," part+=tuplePartCS)*)? ")"
protected class TupleTypeCS_Group extends GroupToken {
	
	public TupleTypeCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_RightParenthesisKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTupleTypeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// value="Tuple"
protected class TupleTypeCS_ValueAssignment_0 extends AssignmentToken  {
	
	public TupleTypeCS_ValueAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getValueAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("Tuple".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getTupleTypeCSAccess().getValueTupleKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class TupleTypeCS_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public TupleTypeCS_LeftParenthesisKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_ValueAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// (part+=tuplePartCS ("," part+=tuplePartCS)*)?
protected class TupleTypeCS_Group_2 extends GroupToken {
	
	public TupleTypeCS_Group_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_Group_2_1(parent, this, 0, inst);
			case 1: return new TupleTypeCS_PartAssignment_2_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// part+=tuplePartCS
protected class TupleTypeCS_PartAssignment_2_0 extends AssignmentToken  {
	
	public TupleTypeCS_PartAssignment_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getPartAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TuplePartCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("part",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("part");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTuplePartCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleTypeCSAccess().getPartTuplePartCSParserRuleCall_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TupleTypeCS_LeftParenthesisKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," part+=tuplePartCS)*
protected class TupleTypeCS_Group_2_1 extends GroupToken {
	
	public TupleTypeCS_Group_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getGroup_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_PartAssignment_2_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class TupleTypeCS_CommaKeyword_2_1_0 extends KeywordToken  {
	
	public TupleTypeCS_CommaKeyword_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getCommaKeyword_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_Group_2_1(parent, this, 0, inst);
			case 1: return new TupleTypeCS_PartAssignment_2_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// part+=tuplePartCS
protected class TupleTypeCS_PartAssignment_2_1_1 extends AssignmentToken  {
	
	public TupleTypeCS_PartAssignment_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getPartAssignment_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TuplePartCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("part",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("part");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTuplePartCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleTypeCSAccess().getPartTuplePartCSParserRuleCall_2_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TupleTypeCS_CommaKeyword_2_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// ")"
protected class TupleTypeCS_RightParenthesisKeyword_3 extends KeywordToken  {
	
	public TupleTypeCS_RightParenthesisKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_Group_2(parent, this, 0, inst);
			case 1: return new TupleTypeCS_LeftParenthesisKeyword_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule tupleTypeCS ****************/


/************ begin Rule tuplePartCS ****************
 *
 * tuplePartCS returns VariableCS:
 *   name=simpleNameCS ":" type=typeCS; 
 *         
 *     
 * 	    
 * 
 * 
 * //---------------------------------------------------------------------
 * //  Literals
 * //---------------------------------------------------------------------
 * // EnumLiteralExpCS is parsed as a PropertyCallExpCS[C]
 * //  LiteralExpCS -> EnumLiteralExpCS
 *
 **/

// name=simpleNameCS ":" type=typeCS
protected class TuplePartCS_Group extends GroupToken {
	
	public TuplePartCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTuplePartCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TuplePartCS_TypeAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTuplePartCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// name=simpleNameCS
protected class TuplePartCS_NameAssignment_0 extends AssignmentToken  {
	
	public TuplePartCS_NameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTuplePartCSAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTuplePartCSAccess().getNameSimpleNameCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// ":"
protected class TuplePartCS_ColonKeyword_1 extends KeywordToken  {
	
	public TuplePartCS_ColonKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTuplePartCSAccess().getColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TuplePartCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=typeCS
protected class TuplePartCS_TypeAssignment_2 extends AssignmentToken  {
	
	public TuplePartCS_TypeAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTuplePartCSAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTuplePartCSAccess().getTypeTypeCSParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TuplePartCS_ColonKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule tuplePartCS ****************/


/************ begin Rule LiteralExpCS ****************
 *
 * LiteralExpCS:
 *   CollectionLiteralExpCS|TupleLiteralExpCS|PrimitiveLiteralExpCS|TypeLiteralExpCS; 
 * 
 * //---------------------------------------------------------------------
 * //  Literals
 * //---------------------------------------------------------------------
 * // EnumLiteralExpCS is parsed as a PropertyCallExpCS[C]
 * //  LiteralExpCS -> EnumLiteralExpCS
 *
 **/

// CollectionLiteralExpCS|TupleLiteralExpCS|PrimitiveLiteralExpCS|TypeLiteralExpCS 
// 
// //---------------------------------------------------------------------
// //  Literals
// //---------------------------------------------------------------------
// // EnumLiteralExpCS is parsed as a PropertyCallExpCS[C]
// //  LiteralExpCS -> EnumLiteralExpCS
protected class LiteralExpCS_Alternatives extends AlternativesToken {

	public LiteralExpCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getLiteralExpCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LiteralExpCS_CollectionLiteralExpCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new LiteralExpCS_TupleLiteralExpCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new LiteralExpCS_PrimitiveLiteralExpCSParserRuleCall_2(parent, this, 2, inst);
			case 3: return new LiteralExpCS_TypeLiteralExpCSParserRuleCall_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// CollectionLiteralExpCS
protected class LiteralExpCS_CollectionLiteralExpCSParserRuleCall_0 extends RuleCallToken {
	
	public LiteralExpCS_CollectionLiteralExpCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralExpCSAccess().getCollectionLiteralExpCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CollectionLiteralExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCollectionLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// TupleLiteralExpCS
protected class LiteralExpCS_TupleLiteralExpCSParserRuleCall_1 extends RuleCallToken {
	
	public LiteralExpCS_TupleLiteralExpCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralExpCSAccess().getTupleLiteralExpCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TupleLiteralExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTupleLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// PrimitiveLiteralExpCS
protected class LiteralExpCS_PrimitiveLiteralExpCSParserRuleCall_2 extends RuleCallToken {
	
	public LiteralExpCS_PrimitiveLiteralExpCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimitiveLiteralExpCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PrimitiveLiteralExpCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPrimitiveLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// TypeLiteralExpCS
protected class LiteralExpCS_TypeLiteralExpCSParserRuleCall_3 extends RuleCallToken {
	
	public LiteralExpCS_TypeLiteralExpCSParserRuleCall_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getLiteralExpCSAccess().getTypeLiteralExpCSParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeLiteralExpCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TypeLiteralExpCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTypeLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule LiteralExpCS ****************/


/************ begin Rule CollectionLiteralExpCS ****************
 *
 * CollectionLiteralExpCS:
 *   (CollectionTypeIdentifierCS|collectionTypeCS) "{" (collectionLiteralParts+=
 *   CollectionLiteralPartCS ("," collectionLiteralParts+=CollectionLiteralPartCS)*)?
 *   "}";
 *
 **/

// (CollectionTypeIdentifierCS|collectionTypeCS) "{" (collectionLiteralParts+=
// CollectionLiteralPartCS ("," collectionLiteralParts+=CollectionLiteralPartCS)*)?
// "}"
protected class CollectionLiteralExpCS_Group extends GroupToken {
	
	public CollectionLiteralExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_RightCurlyBracketKeyword_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getCollectionLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// CollectionTypeIdentifierCS|collectionTypeCS
protected class CollectionLiteralExpCS_Alternatives_0 extends AlternativesToken {

	public CollectionLiteralExpCS_Alternatives_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getAlternatives_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_CollectionTypeIdentifierCSParserRuleCall_0_0(parent, this, 0, inst);
			case 1: return new CollectionLiteralExpCS_CollectionTypeCSParserRuleCall_0_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// CollectionTypeIdentifierCS
protected class CollectionLiteralExpCS_CollectionTypeIdentifierCSParserRuleCall_0_0 extends RuleCallToken {
	
	public CollectionLiteralExpCS_CollectionTypeIdentifierCSParserRuleCall_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getCollectionTypeIdentifierCSParserRuleCall_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeIdentifierCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CollectionTypeIdentifierCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeIdentifierCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// collectionTypeCS
protected class CollectionLiteralExpCS_CollectionTypeCSParserRuleCall_0_1 extends RuleCallToken {
	
	public CollectionLiteralExpCS_CollectionTypeCSParserRuleCall_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getCollectionTypeCSParserRuleCall_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CollectionTypeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


// "{"
protected class CollectionLiteralExpCS_LeftCurlyBracketKeyword_1 extends KeywordToken  {
	
	public CollectionLiteralExpCS_LeftCurlyBracketKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_Alternatives_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// (collectionLiteralParts+=CollectionLiteralPartCS ("," collectionLiteralParts+=
// CollectionLiteralPartCS)*)?
protected class CollectionLiteralExpCS_Group_2 extends GroupToken {
	
	public CollectionLiteralExpCS_Group_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_Group_2_1(parent, this, 0, inst);
			case 1: return new CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// collectionLiteralParts+=CollectionLiteralPartCS
protected class CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_0 extends AssignmentToken  {
	
	public CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralPartCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("collectionLiteralParts",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("collectionLiteralParts");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getCollectionLiteralPartCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsCollectionLiteralPartCSParserRuleCall_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CollectionLiteralExpCS_LeftCurlyBracketKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," collectionLiteralParts+=CollectionLiteralPartCS)*
protected class CollectionLiteralExpCS_Group_2_1 extends GroupToken {
	
	public CollectionLiteralExpCS_Group_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class CollectionLiteralExpCS_CommaKeyword_2_1_0 extends KeywordToken  {
	
	public CollectionLiteralExpCS_CommaKeyword_2_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_Group_2_1(parent, this, 0, inst);
			case 1: return new CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// collectionLiteralParts+=CollectionLiteralPartCS
protected class CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_1_1 extends AssignmentToken  {
	
	public CollectionLiteralExpCS_CollectionLiteralPartsAssignment_2_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsAssignment_2_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralPartCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("collectionLiteralParts",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("collectionLiteralParts");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getCollectionLiteralPartCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CollectionLiteralExpCS_CommaKeyword_2_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// "}"
protected class CollectionLiteralExpCS_RightCurlyBracketKeyword_3 extends KeywordToken  {
	
	public CollectionLiteralExpCS_RightCurlyBracketKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralExpCS_Group_2(parent, this, 0, inst);
			case 1: return new CollectionLiteralExpCS_LeftCurlyBracketKeyword_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule CollectionLiteralExpCS ****************/


/************ begin Rule CollectionLiteralPartCS ****************
 *
 * CollectionLiteralPartCS:
 *   expressionCS=OclExpressionCS (".." lastExpressionCS=OclExpressionCS)?;
 *
 **/

// expressionCS=OclExpressionCS (".." lastExpressionCS=OclExpressionCS)?
protected class CollectionLiteralPartCS_Group extends GroupToken {
	
	public CollectionLiteralPartCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionLiteralPartCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralPartCS_Group_1(parent, this, 0, inst);
			case 1: return new CollectionLiteralPartCS_ExpressionCSAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getCollectionLiteralPartCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// expressionCS=OclExpressionCS
protected class CollectionLiteralPartCS_ExpressionCSAssignment_0 extends AssignmentToken  {
	
	public CollectionLiteralPartCS_ExpressionCSAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("expressionCS",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("expressionCS");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSOclExpressionCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// (".." lastExpressionCS=OclExpressionCS)?
protected class CollectionLiteralPartCS_Group_1 extends GroupToken {
	
	public CollectionLiteralPartCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralPartCS_LastExpressionCSAssignment_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ".."
protected class CollectionLiteralPartCS_FullStopFullStopKeyword_1_0 extends KeywordToken  {
	
	public CollectionLiteralPartCS_FullStopFullStopKeyword_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionLiteralPartCS_ExpressionCSAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// lastExpressionCS=OclExpressionCS
protected class CollectionLiteralPartCS_LastExpressionCSAssignment_1_1 extends AssignmentToken  {
	
	public CollectionLiteralPartCS_LastExpressionCSAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("lastExpressionCS",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("lastExpressionCS");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSOclExpressionCSParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CollectionLiteralPartCS_FullStopFullStopKeyword_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule CollectionLiteralPartCS ****************/


/************ begin Rule PrimitiveLiteralExpCS ****************
 *
 * PrimitiveLiteralExpCS:
 *   IntegerLiteralExpCS|RealLiteralExpCS|StringLiteralExpCS|BooleanLiteralExpCS|
 *   UnlimitedNaturalLiteralExpCS|InvalidLiteralExpCS|NullLiteralExpCS;
 *
 **/

// IntegerLiteralExpCS|RealLiteralExpCS|StringLiteralExpCS|BooleanLiteralExpCS|
// UnlimitedNaturalLiteralExpCS|InvalidLiteralExpCS|NullLiteralExpCS
protected class PrimitiveLiteralExpCS_Alternatives extends AlternativesToken {

	public PrimitiveLiteralExpCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimitiveLiteralExpCS_IntegerLiteralExpCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new PrimitiveLiteralExpCS_RealLiteralExpCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new PrimitiveLiteralExpCS_StringLiteralExpCSParserRuleCall_2(parent, this, 2, inst);
			case 3: return new PrimitiveLiteralExpCS_BooleanLiteralExpCSParserRuleCall_3(parent, this, 3, inst);
			case 4: return new PrimitiveLiteralExpCS_UnlimitedNaturalLiteralExpCSParserRuleCall_4(parent, this, 4, inst);
			case 5: return new PrimitiveLiteralExpCS_InvalidLiteralExpCSParserRuleCall_5(parent, this, 5, inst);
			case 6: return new PrimitiveLiteralExpCS_NullLiteralExpCSParserRuleCall_6(parent, this, 6, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPrimitiveLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// IntegerLiteralExpCS
protected class PrimitiveLiteralExpCS_IntegerLiteralExpCSParserRuleCall_0 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_IntegerLiteralExpCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getIntegerLiteralExpCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IntegerLiteralExpCS_IntegerSymbolAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(IntegerLiteralExpCS_IntegerSymbolAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getIntegerLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// RealLiteralExpCS
protected class PrimitiveLiteralExpCS_RealLiteralExpCSParserRuleCall_1 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_RealLiteralExpCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getRealLiteralExpCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RealLiteralExpCS_RealSymbolAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(RealLiteralExpCS_RealSymbolAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getRealLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// StringLiteralExpCS
protected class PrimitiveLiteralExpCS_StringLiteralExpCSParserRuleCall_2 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_StringLiteralExpCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new StringLiteralExpCS_StringSymbolAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(StringLiteralExpCS_StringSymbolAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getStringLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// BooleanLiteralExpCS
protected class PrimitiveLiteralExpCS_BooleanLiteralExpCSParserRuleCall_3 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_BooleanLiteralExpCSParserRuleCall_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BooleanLiteralExpCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(BooleanLiteralExpCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getBooleanLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// UnlimitedNaturalLiteralExpCS
protected class PrimitiveLiteralExpCS_UnlimitedNaturalLiteralExpCSParserRuleCall_4 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_UnlimitedNaturalLiteralExpCSParserRuleCall_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnlimitedNaturalLiteralExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(UnlimitedNaturalLiteralExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getUnlimitedNaturalLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// InvalidLiteralExpCS
protected class PrimitiveLiteralExpCS_InvalidLiteralExpCSParserRuleCall_5 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_InvalidLiteralExpCSParserRuleCall_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvalidLiteralExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(InvalidLiteralExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getInvalidLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// NullLiteralExpCS
protected class PrimitiveLiteralExpCS_NullLiteralExpCSParserRuleCall_6 extends RuleCallToken {
	
	public PrimitiveLiteralExpCS_NullLiteralExpCSParserRuleCall_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new NullLiteralExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(NullLiteralExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getNullLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule PrimitiveLiteralExpCS ****************/


/************ begin Rule TupleLiteralExpCS ****************
 *
 * TupleLiteralExpCS:
 *   "Tuple" "{" part+=TupleLiteralPartCS ("," part+=TupleLiteralPartCS)* "}";
 *
 **/

// "Tuple" "{" part+=TupleLiteralPartCS ("," part+=TupleLiteralPartCS)* "}"
protected class TupleLiteralExpCS_Group extends GroupToken {
	
	public TupleLiteralExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralExpCS_RightCurlyBracketKeyword_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTupleLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// "Tuple"
protected class TupleLiteralExpCS_TupleKeyword_0 extends KeywordToken  {
	
	public TupleLiteralExpCS_TupleKeyword_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
}

// "{"
protected class TupleLiteralExpCS_LeftCurlyBracketKeyword_1 extends KeywordToken  {
	
	public TupleLiteralExpCS_LeftCurlyBracketKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralExpCS_TupleKeyword_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// part+=TupleLiteralPartCS
protected class TupleLiteralExpCS_PartAssignment_2 extends AssignmentToken  {
	
	public TupleLiteralExpCS_PartAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getPartAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralPartCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("part",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("part");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTupleLiteralPartCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleLiteralExpCSAccess().getPartTupleLiteralPartCSParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TupleLiteralExpCS_LeftCurlyBracketKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," part+=TupleLiteralPartCS)*
protected class TupleLiteralExpCS_Group_3 extends GroupToken {
	
	public TupleLiteralExpCS_Group_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralExpCS_PartAssignment_3_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class TupleLiteralExpCS_CommaKeyword_3_0 extends KeywordToken  {
	
	public TupleLiteralExpCS_CommaKeyword_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralExpCS_Group_3(parent, this, 0, inst);
			case 1: return new TupleLiteralExpCS_PartAssignment_2(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// part+=TupleLiteralPartCS
protected class TupleLiteralExpCS_PartAssignment_3_1 extends AssignmentToken  {
	
	public TupleLiteralExpCS_PartAssignment_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getPartAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralPartCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("part",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("part");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTupleLiteralPartCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleLiteralExpCSAccess().getPartTupleLiteralPartCSParserRuleCall_3_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TupleLiteralExpCS_CommaKeyword_3_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class TupleLiteralExpCS_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public TupleLiteralExpCS_RightCurlyBracketKeyword_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralExpCS_Group_3(parent, this, 0, inst);
			case 1: return new TupleLiteralExpCS_PartAssignment_2(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule TupleLiteralExpCS ****************/


/************ begin Rule TupleLiteralPartCS ****************
 *
 * TupleLiteralPartCS returns VariableCS:
 *   name=simpleNameCS (":" type=typeCS)? "=" initExpression=OclExpressionCS;
 *
 **/

// name=simpleNameCS (":" type=typeCS)? "=" initExpression=OclExpressionCS
protected class TupleLiteralPartCS_Group extends GroupToken {
	
	public TupleLiteralPartCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralPartCS_InitExpressionAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTupleLiteralPartCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// name=simpleNameCS
protected class TupleLiteralPartCS_NameAssignment_0 extends AssignmentToken  {
	
	public TupleLiteralPartCS_NameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleLiteralPartCSAccess().getNameSimpleNameCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// (":" type=typeCS)?
protected class TupleLiteralPartCS_Group_1 extends GroupToken {
	
	public TupleLiteralPartCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralPartCS_TypeAssignment_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class TupleLiteralPartCS_ColonKeyword_1_0 extends KeywordToken  {
	
	public TupleLiteralPartCS_ColonKeyword_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralPartCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=typeCS
protected class TupleLiteralPartCS_TypeAssignment_1_1 extends AssignmentToken  {
	
	public TupleLiteralPartCS_TypeAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getTypeAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleLiteralPartCSAccess().getTypeTypeCSParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TupleLiteralPartCS_ColonKeyword_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "="
protected class TupleLiteralPartCS_EqualsSignKeyword_2 extends KeywordToken  {
	
	public TupleLiteralPartCS_EqualsSignKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleLiteralPartCS_Group_1(parent, this, 0, inst);
			case 1: return new TupleLiteralPartCS_NameAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// initExpression=OclExpressionCS
protected class TupleLiteralPartCS_InitExpressionAssignment_3 extends AssignmentToken  {
	
	public TupleLiteralPartCS_InitExpressionAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("initExpression",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("initExpression");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionOclExpressionCSParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new TupleLiteralPartCS_EqualsSignKeyword_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule TupleLiteralPartCS ****************/


/************ begin Rule IntegerLiteralExpCS ****************
 *
 * IntegerLiteralExpCS:
 *   integerSymbol=INTEGER_LITERAL;
 *
 **/

// integerSymbol=INTEGER_LITERAL
protected class IntegerLiteralExpCS_IntegerSymbolAssignment extends AssignmentToken  {
	
	public IntegerLiteralExpCS_IntegerSymbolAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIntegerLiteralExpCSAccess().getIntegerSymbolAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getIntegerLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("integerSymbol",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("integerSymbol");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getIntegerLiteralExpCSAccess().getIntegerSymbolINTEGER_LITERALParserRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule IntegerLiteralExpCS ****************/


/************ begin Rule RealLiteralExpCS ****************
 *
 * RealLiteralExpCS:
 *   realSymbol=REAL_LITERAL;
 *
 **/

// realSymbol=REAL_LITERAL
protected class RealLiteralExpCS_RealSymbolAssignment extends AssignmentToken  {
	
	public RealLiteralExpCS_RealSymbolAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRealLiteralExpCSAccess().getRealSymbolAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getRealLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("realSymbol",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("realSymbol");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.DRC;
			element = grammarAccess.getRealLiteralExpCSAccess().getRealSymbolREAL_LITERALParserRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule RealLiteralExpCS ****************/


/************ begin Rule StringLiteralExpCS ****************
 *
 * StringLiteralExpCS:
 *   stringSymbol+=STRING_LITERAL+;
 *
 **/

// stringSymbol+=STRING_LITERAL+
protected class StringLiteralExpCS_StringSymbolAssignment extends AssignmentToken  {
	
	public StringLiteralExpCS_StringSymbolAssignment(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getStringLiteralExpCSAccess().getStringSymbolAssignment();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new StringLiteralExpCS_StringSymbolAssignment(parent, this, 0, inst);
			default: return parent.createParentFollower(this, index, index - 1, inst);
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getStringLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("stringSymbol",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("stringSymbol");
		if(Boolean.TRUE.booleanValue()) { 
			type = AssignmentType.LRC;
			element = grammarAccess.getStringLiteralExpCSAccess().getStringSymbolSTRING_LITERALTerminalRuleCall_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule StringLiteralExpCS ****************/


/************ begin Rule BooleanLiteralExpCS ****************
 *
 * BooleanLiteralExpCS:
 *   value="true"|value="false";
 *
 **/

// value="true"|value="false"
protected class BooleanLiteralExpCS_Alternatives extends AlternativesToken {

	public BooleanLiteralExpCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new BooleanLiteralExpCS_ValueAssignment_0(parent, this, 0, inst);
			case 1: return new BooleanLiteralExpCS_ValueAssignment_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getBooleanLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// value="true"
protected class BooleanLiteralExpCS_ValueAssignment_0 extends AssignmentToken  {
	
	public BooleanLiteralExpCS_ValueAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBooleanLiteralExpCSAccess().getValueAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("true".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getBooleanLiteralExpCSAccess().getValueTrueKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// value="false"
protected class BooleanLiteralExpCS_ValueAssignment_1 extends AssignmentToken  {
	
	public BooleanLiteralExpCS_ValueAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getBooleanLiteralExpCSAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("value",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if("false".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getBooleanLiteralExpCSAccess().getValueFalseKeyword_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule BooleanLiteralExpCS ****************/


/************ begin Rule UnlimitedNaturalLiteralExpCS ****************
 *
 * UnlimitedNaturalLiteralExpCS:
 *   {UnlimitedNaturalLiteralExpCS} "*";
 *
 **/

// {UnlimitedNaturalLiteralExpCS} "*"
protected class UnlimitedNaturalLiteralExpCS_Group extends GroupToken {
	
	public UnlimitedNaturalLiteralExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnlimitedNaturalLiteralExpCS_AsteriskKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getUnlimitedNaturalLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// {UnlimitedNaturalLiteralExpCS}
protected class UnlimitedNaturalLiteralExpCS_UnlimitedNaturalLiteralExpCSAction_0 extends ActionToken  {

	public UnlimitedNaturalLiteralExpCS_UnlimitedNaturalLiteralExpCSAction_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// "*"
protected class UnlimitedNaturalLiteralExpCS_AsteriskKeyword_1 extends KeywordToken  {
	
	public UnlimitedNaturalLiteralExpCS_AsteriskKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnlimitedNaturalLiteralExpCS_UnlimitedNaturalLiteralExpCSAction_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule UnlimitedNaturalLiteralExpCS ****************/


/************ begin Rule InvalidLiteralExpCS ****************
 *
 * InvalidLiteralExpCS:
 *   {InvalidLiteralExpCS} "invalid";
 *
 **/

// {InvalidLiteralExpCS} "invalid"
protected class InvalidLiteralExpCS_Group extends GroupToken {
	
	public InvalidLiteralExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getInvalidLiteralExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvalidLiteralExpCS_InvalidKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getInvalidLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// {InvalidLiteralExpCS}
protected class InvalidLiteralExpCS_InvalidLiteralExpCSAction_0 extends ActionToken  {

	public InvalidLiteralExpCS_InvalidLiteralExpCSAction_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// "invalid"
protected class InvalidLiteralExpCS_InvalidKeyword_1 extends KeywordToken  {
	
	public InvalidLiteralExpCS_InvalidKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new InvalidLiteralExpCS_InvalidLiteralExpCSAction_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule InvalidLiteralExpCS ****************/


/************ begin Rule NullLiteralExpCS ****************
 *
 * NullLiteralExpCS:
 *   {NullLiteralExpCS} "null";
 *
 **/

// {NullLiteralExpCS} "null"
protected class NullLiteralExpCS_Group extends GroupToken {
	
	public NullLiteralExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNullLiteralExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new NullLiteralExpCS_NullKeyword_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getNullLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// {NullLiteralExpCS}
protected class NullLiteralExpCS_NullLiteralExpCSAction_0 extends ActionToken  {

	public NullLiteralExpCS_NullLiteralExpCSAction_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// "null"
protected class NullLiteralExpCS_NullKeyword_1 extends KeywordToken  {
	
	public NullLiteralExpCS_NullKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new NullLiteralExpCS_NullLiteralExpCSAction_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule NullLiteralExpCS ****************/


/************ begin Rule TypeLiteralExpCS ****************
 *
 * TypeLiteralExpCS:
 *   pathNameCS|primitiveTypeCS|collectionTypeCS|tupleTypeCS; 
 *         
 *         
 * 		
 * 		 
 * 		 
 * 		 
 * 
 * //---------------------------------------------------------------------
 * //  Expressions
 * //---------------------------------------------------------------------
 *      // An OclExpressionCS comprising one or more LetExpCS is kept separate to ensure
 *      //  that let is right associative, whereas infix operators are left associative.
 *      //   a = 64 / 16 / let b : Integer in 8 / let c : Integer in 4 
 *      // is
 *      //   a = (64 / 16) / (let b : Integer in 8 / (let c : Integer in 4 ))
 *
 **/

// pathNameCS|primitiveTypeCS|collectionTypeCS|tupleTypeCS 
//         
//         
// 		
// 		 
// 		 
// 		 
// 
// //---------------------------------------------------------------------
// //  Expressions
// //---------------------------------------------------------------------
//      // An OclExpressionCS comprising one or more LetExpCS is kept separate to ensure
//      //  that let is right associative, whereas infix operators are left associative.
//      //   a = 64 / 16 / let b : Integer in 8 / let c : Integer in 4 
//      // is
//      //   a = (64 / 16) / (let b : Integer in 8 / (let c : Integer in 4 ))
protected class TypeLiteralExpCS_Alternatives extends AlternativesToken {

	public TypeLiteralExpCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getTypeLiteralExpCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeLiteralExpCS_PathNameCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new TypeLiteralExpCS_PrimitiveTypeCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new TypeLiteralExpCS_CollectionTypeCSParserRuleCall_2(parent, this, 2, inst);
			case 3: return new TypeLiteralExpCS_TupleTypeCSParserRuleCall_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getTypeLiteralExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// pathNameCS
protected class TypeLiteralExpCS_PathNameCSParserRuleCall_0 extends RuleCallToken {
	
	public TypeLiteralExpCS_PathNameCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeLiteralExpCSAccess().getPathNameCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PathNameCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPathNameCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// primitiveTypeCS
protected class TypeLiteralExpCS_PrimitiveTypeCSParserRuleCall_1 extends RuleCallToken {
	
	public TypeLiteralExpCS_PrimitiveTypeCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeLiteralExpCSAccess().getPrimitiveTypeCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimitiveTypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PrimitiveTypeCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPrimitiveTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// collectionTypeCS
protected class TypeLiteralExpCS_CollectionTypeCSParserRuleCall_2 extends RuleCallToken {
	
	public TypeLiteralExpCS_CollectionTypeCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeLiteralExpCSAccess().getCollectionTypeCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CollectionTypeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CollectionTypeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCollectionTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// tupleTypeCS
protected class TypeLiteralExpCS_TupleTypeCSParserRuleCall_3 extends RuleCallToken {
	
	public TypeLiteralExpCS_TupleTypeCSParserRuleCall_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getTypeLiteralExpCSAccess().getTupleTypeCSParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TupleTypeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(TupleTypeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getTupleTypeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule TypeLiteralExpCS ****************/


/************ begin Rule OclExpressionCS ****************
 *
 * OclExpressionCS:
 *   impliesCS|LetExpCS; 
 * 
 * //---------------------------------------------------------------------
 * //  Expressions
 * //---------------------------------------------------------------------
 *      // An OclExpressionCS comprising one or more LetExpCS is kept separate to ensure
 *      //  that let is right associative, whereas infix operators are left associative.
 *      //   a = 64 / 16 / let b : Integer in 8 / let c : Integer in 4 
 *      // is
 *      //   a = (64 / 16) / (let b : Integer in 8 / (let c : Integer in 4 ))
 *
 **/

// impliesCS|LetExpCS 
// 
// //---------------------------------------------------------------------
// //  Expressions
// //---------------------------------------------------------------------
//      // An OclExpressionCS comprising one or more LetExpCS is kept separate to ensure
//      //  that let is right associative, whereas infix operators are left associative.
//      //   a = 64 / 16 / let b : Integer in 8 / let c : Integer in 4 
//      // is
//      //   a = (64 / 16) / (let b : Integer in 8 / (let c : Integer in 4 ))
protected class OclExpressionCS_Alternatives extends AlternativesToken {

	public OclExpressionCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getOclExpressionCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_ImpliesCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new OclExpressionCS_LetExpCSParserRuleCall_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// impliesCS
protected class OclExpressionCS_ImpliesCSParserRuleCall_0 extends RuleCallToken {
	
	public OclExpressionCS_ImpliesCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getOclExpressionCSAccess().getImpliesCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImpliesCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ImpliesCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getImpliesCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// LetExpCS
protected class OclExpressionCS_LetExpCSParserRuleCall_1 extends RuleCallToken {
	
	public OclExpressionCS_LetExpCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getOclExpressionCSAccess().getLetExpCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(LetExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule OclExpressionCS ****************/


/************ begin Rule impliesCS ****************
 *
 * impliesCS returns OclExpressionCS:
 *   xorCS ({BinaryExpressionCS.left=current} op="implies" right=( impliesCS | LetExpCS ))?;
 *
 **/

// xorCS ({BinaryExpressionCS.left=current} op="implies" right=( impliesCS | LetExpCS ))?
protected class ImpliesCS_Group extends GroupToken {
	
	public ImpliesCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getImpliesCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImpliesCS_Group_1(parent, this, 0, inst);
			case 1: return new ImpliesCS_XorCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getImpliesCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// xorCS
protected class ImpliesCS_XorCSParserRuleCall_0 extends RuleCallToken {
	
	public ImpliesCS_XorCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getImpliesCSAccess().getXorCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new XorCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(XorCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getXorCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op="implies" right=( impliesCS | LetExpCS ))?
protected class ImpliesCS_Group_1 extends GroupToken {
	
	public ImpliesCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getImpliesCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImpliesCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class ImpliesCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public ImpliesCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getImpliesCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImpliesCS_XorCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getImpliesCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op="implies"
protected class ImpliesCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public ImpliesCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getImpliesCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImpliesCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("implies".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getImpliesCSAccess().getOpImpliesKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// right=( impliesCS | LetExpCS )
protected class ImpliesCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public ImpliesCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getImpliesCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImpliesCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getImpliesCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getImpliesCSAccess().getRightImpliesCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getImpliesCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new ImpliesCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule impliesCS ****************/


/************ begin Rule xorCS ****************
 *
 * xorCS returns OclExpressionCS:
 *   orCS ({BinaryExpressionCS.left=current} op="xor" right=( xorCS | LetExpCS ))?;
 *
 **/

// orCS ({BinaryExpressionCS.left=current} op="xor" right=( xorCS | LetExpCS ))?
protected class XorCS_Group extends GroupToken {
	
	public XorCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getXorCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new XorCS_Group_1(parent, this, 0, inst);
			case 1: return new XorCS_OrCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getXorCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// orCS
protected class XorCS_OrCSParserRuleCall_0 extends RuleCallToken {
	
	public XorCS_OrCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getXorCSAccess().getOrCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OrCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(OrCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getOrCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op="xor" right=( xorCS | LetExpCS ))?
protected class XorCS_Group_1 extends GroupToken {
	
	public XorCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getXorCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new XorCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class XorCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public XorCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getXorCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new XorCS_OrCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getXorCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op="xor"
protected class XorCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public XorCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getXorCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new XorCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("xor".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getXorCSAccess().getOpXorKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// right=( xorCS | LetExpCS )
protected class XorCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public XorCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getXorCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new XorCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getXorCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getXorCSAccess().getRightXorCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getXorCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new XorCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule xorCS ****************/


/************ begin Rule orCS ****************
 *
 * orCS returns OclExpressionCS:
 *   andCS ({BinaryExpressionCS.left=current} op="or" right=( orCS | LetExpCS ))?;
 *
 **/

// andCS ({BinaryExpressionCS.left=current} op="or" right=( orCS | LetExpCS ))?
protected class OrCS_Group extends GroupToken {
	
	public OrCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOrCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OrCS_Group_1(parent, this, 0, inst);
			case 1: return new OrCS_AndCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getOrCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// andCS
protected class OrCS_AndCSParserRuleCall_0 extends RuleCallToken {
	
	public OrCS_AndCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getOrCSAccess().getAndCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AndCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(AndCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getAndCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op="or" right=( orCS | LetExpCS ))?
protected class OrCS_Group_1 extends GroupToken {
	
	public OrCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getOrCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OrCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class OrCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public OrCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getOrCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OrCS_AndCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getOrCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op="or"
protected class OrCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public OrCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOrCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OrCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("or".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getOrCSAccess().getOpOrKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// right=( orCS | LetExpCS )
protected class OrCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public OrCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getOrCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OrCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOrCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOrCSAccess().getRightOrCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getOrCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new OrCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule orCS ****************/


/************ begin Rule andCS ****************
 *
 * andCS returns OclExpressionCS:
 *   equalityCS ({BinaryExpressionCS.left=current} op="and" right=( andCS | LetExpCS ))?;
 *
 **/

// equalityCS ({BinaryExpressionCS.left=current} op="and" right=( andCS | LetExpCS ))?
protected class AndCS_Group extends GroupToken {
	
	public AndCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAndCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AndCS_Group_1(parent, this, 0, inst);
			case 1: return new AndCS_EqualityCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getAndCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// equalityCS
protected class AndCS_EqualityCSParserRuleCall_0 extends RuleCallToken {
	
	public AndCS_EqualityCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getAndCSAccess().getEqualityCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EqualityCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(EqualityCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getEqualityCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op="and" right=( andCS | LetExpCS ))?
protected class AndCS_Group_1 extends GroupToken {
	
	public AndCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAndCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AndCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class AndCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public AndCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getAndCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AndCS_EqualityCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getAndCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op="and"
protected class AndCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public AndCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAndCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AndCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("and".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAndCSAccess().getOpAndKeyword_1_1_0();
			return obj;
		}
		return null;
	}

}

// right=( andCS | LetExpCS )
protected class AndCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public AndCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAndCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AndCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAndCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAndCSAccess().getRightAndCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAndCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AndCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule andCS ****************/


/************ begin Rule equalityCS ****************
 *
 * equalityCS returns OclExpressionCS:
 *   relationalCS ({BinaryExpressionCS.left=current} op=( "=" | "<>" ) right=( equalityCS |
 *   LetExpCS ))?;
 *
 **/

// relationalCS ({BinaryExpressionCS.left=current} op=( "=" | "<>" ) right=( equalityCS |
// LetExpCS ))?
protected class EqualityCS_Group extends GroupToken {
	
	public EqualityCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEqualityCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EqualityCS_Group_1(parent, this, 0, inst);
			case 1: return new EqualityCS_RelationalCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getEqualityCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// relationalCS
protected class EqualityCS_RelationalCSParserRuleCall_0 extends RuleCallToken {
	
	public EqualityCS_RelationalCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEqualityCSAccess().getRelationalCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RelationalCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(RelationalCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getRelationalCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op=( "=" | "<>" ) right=( equalityCS | LetExpCS ))?
protected class EqualityCS_Group_1 extends GroupToken {
	
	public EqualityCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEqualityCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EqualityCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class EqualityCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public EqualityCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEqualityCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EqualityCS_RelationalCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getEqualityCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op=( "=" | "<>" )
protected class EqualityCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public EqualityCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEqualityCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EqualityCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("=".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getEqualityCSAccess().getOpEqualsSignKeyword_1_1_0_0();
			return obj;
		}
		if("<>".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getEqualityCSAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1();
			return obj;
		}
		return null;
	}

}

// right=( equalityCS | LetExpCS )
protected class EqualityCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public EqualityCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEqualityCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new EqualityCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEqualityCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEqualityCSAccess().getRightEqualityCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getEqualityCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EqualityCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule equalityCS ****************/


/************ begin Rule relationalCS ****************
 *
 * relationalCS returns OclExpressionCS:
 *   additiveCS ({BinaryExpressionCS.left=current} op=( ">" | "<" | ">=" | "<=" ) right=(
 *   relationalCS | LetExpCS ))?;
 *
 **/

// additiveCS ({BinaryExpressionCS.left=current} op=( ">" | "<" | ">=" | "<=" ) right=(
// relationalCS | LetExpCS ))?
protected class RelationalCS_Group extends GroupToken {
	
	public RelationalCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRelationalCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RelationalCS_Group_1(parent, this, 0, inst);
			case 1: return new RelationalCS_AdditiveCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getRelationalCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// additiveCS
protected class RelationalCS_AdditiveCSParserRuleCall_0 extends RuleCallToken {
	
	public RelationalCS_AdditiveCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getRelationalCSAccess().getAdditiveCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AdditiveCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(AdditiveCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getAdditiveCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op=( ">" | "<" | ">=" | "<=" ) right=( relationalCS |
// LetExpCS ))?
protected class RelationalCS_Group_1 extends GroupToken {
	
	public RelationalCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRelationalCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RelationalCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class RelationalCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public RelationalCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getRelationalCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RelationalCS_AdditiveCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getRelationalCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op=( ">" | "<" | ">=" | "<=" )
protected class RelationalCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public RelationalCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRelationalCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RelationalCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if(">".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getRelationalCSAccess().getOpGreaterThanSignKeyword_1_1_0_0();
			return obj;
		}
		if("<".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getRelationalCSAccess().getOpLessThanSignKeyword_1_1_0_1();
			return obj;
		}
		if(">=".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getRelationalCSAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_2();
			return obj;
		}
		if("<=".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getRelationalCSAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_3();
			return obj;
		}
		return null;
	}

}

// right=( relationalCS | LetExpCS )
protected class RelationalCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public RelationalCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRelationalCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new RelationalCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getRelationalCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getRelationalCSAccess().getRightRelationalCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getRelationalCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new RelationalCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule relationalCS ****************/


/************ begin Rule additiveCS ****************
 *
 * additiveCS returns OclExpressionCS:
 *   multiplicativeCS ({BinaryExpressionCS.left=current} op=( "+" | "-" ) right=( additiveCS |
 *   LetExpCS ))?;
 *
 **/

// multiplicativeCS ({BinaryExpressionCS.left=current} op=( "+" | "-" ) right=( additiveCS |
// LetExpCS ))?
protected class AdditiveCS_Group extends GroupToken {
	
	public AdditiveCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAdditiveCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AdditiveCS_Group_1(parent, this, 0, inst);
			case 1: return new AdditiveCS_MultiplicativeCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getAdditiveCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// multiplicativeCS
protected class AdditiveCS_MultiplicativeCSParserRuleCall_0 extends RuleCallToken {
	
	public AdditiveCS_MultiplicativeCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getAdditiveCSAccess().getMultiplicativeCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new MultiplicativeCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(MultiplicativeCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getMultiplicativeCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op=( "+" | "-" ) right=( additiveCS | LetExpCS ))?
protected class AdditiveCS_Group_1 extends GroupToken {
	
	public AdditiveCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAdditiveCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AdditiveCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class AdditiveCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public AdditiveCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getAdditiveCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AdditiveCS_MultiplicativeCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getAdditiveCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op=( "+" | "-" )
protected class AdditiveCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public AdditiveCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAdditiveCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AdditiveCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("+".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAdditiveCSAccess().getOpPlusSignKeyword_1_1_0_0();
			return obj;
		}
		if("-".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getAdditiveCSAccess().getOpHyphenMinusKeyword_1_1_0_1();
			return obj;
		}
		return null;
	}

}

// right=( additiveCS | LetExpCS )
protected class AdditiveCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public AdditiveCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAdditiveCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new AdditiveCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAdditiveCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAdditiveCSAccess().getRightAdditiveCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getAdditiveCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new AdditiveCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule additiveCS ****************/


/************ begin Rule multiplicativeCS ****************
 *
 * multiplicativeCS returns OclExpressionCS:
 *   unaryCS ({BinaryExpressionCS.left=current} op=( "*" | "/" ) right=( multiplicativeCS |
 *   LetExpCS ))?;
 *
 **/

// unaryCS ({BinaryExpressionCS.left=current} op=( "*" | "/" ) right=( multiplicativeCS |
// LetExpCS ))?
protected class MultiplicativeCS_Group extends GroupToken {
	
	public MultiplicativeCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMultiplicativeCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new MultiplicativeCS_Group_1(parent, this, 0, inst);
			case 1: return new MultiplicativeCS_UnaryCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getMultiplicativeCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// unaryCS
protected class MultiplicativeCS_UnaryCSParserRuleCall_0 extends RuleCallToken {
	
	public MultiplicativeCS_UnaryCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMultiplicativeCSAccess().getUnaryCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnaryCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(UnaryCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getUnaryCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({BinaryExpressionCS.left=current} op=( "*" | "/" ) right=( multiplicativeCS | LetExpCS ))
// ?
protected class MultiplicativeCS_Group_1 extends GroupToken {
	
	public MultiplicativeCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMultiplicativeCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new MultiplicativeCS_RightAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {BinaryExpressionCS.left=current}
protected class MultiplicativeCS_BinaryExpressionCSLeftAction_1_0 extends ActionToken  {

	public MultiplicativeCS_BinaryExpressionCSLeftAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMultiplicativeCSAccess().getBinaryExpressionCSLeftAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new MultiplicativeCS_UnaryCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getMultiplicativeCSAccess().getBinaryExpressionCSLeftAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("left", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("left")) return null;
		return getDescr((EObject) val);
	}
}

// op=( "*" | "/" )
protected class MultiplicativeCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public MultiplicativeCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMultiplicativeCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new MultiplicativeCS_BinaryExpressionCSLeftAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("*".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getMultiplicativeCSAccess().getOpAsteriskKeyword_1_1_0_0();
			return obj;
		}
		if("/".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getMultiplicativeCSAccess().getOpSolidusKeyword_1_1_0_1();
			return obj;
		}
		return null;
	}

}

// right=( multiplicativeCS | LetExpCS )
protected class MultiplicativeCS_RightAssignment_1_2 extends AssignmentToken  {
	
	public MultiplicativeCS_RightAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMultiplicativeCSAccess().getRightAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new MultiplicativeCS_Group(this, this, 0, inst);
			case 1: return new LetExpCS_Group(this, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("right",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMultiplicativeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getMultiplicativeCSAccess().getRightMultiplicativeCSParserRuleCall_1_2_0_0(); 
				consumed = obj;
				return param;
			}
		}
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getMultiplicativeCSAccess().getRightLetExpCSParserRuleCall_1_2_0_1(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MultiplicativeCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule multiplicativeCS ****************/


/************ begin Rule unaryCS ****************
 *
 * unaryCS returns OclExpressionCS:
 *   calledExpCS|{UnaryExpressionCS} op=( "-" | "not" ) source=unaryCS;
 *
 **/

// calledExpCS|{UnaryExpressionCS} op=( "-" | "not" ) source=unaryCS
protected class UnaryCS_Alternatives extends AlternativesToken {

	public UnaryCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getUnaryCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnaryCS_CalledExpCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new UnaryCS_Group_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getUnaryCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// calledExpCS
protected class UnaryCS_CalledExpCSParserRuleCall_0 extends RuleCallToken {
	
	public UnaryCS_CalledExpCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getUnaryCSAccess().getCalledExpCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CalledExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(CalledExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getCalledExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// {UnaryExpressionCS} op=( "-" | "not" ) source=unaryCS
protected class UnaryCS_Group_1 extends GroupToken {
	
	public UnaryCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getUnaryCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnaryCS_SourceAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {UnaryExpressionCS}
protected class UnaryCS_UnaryExpressionCSAction_1_0 extends ActionToken  {

	public UnaryCS_UnaryExpressionCSAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getUnaryCSAccess().getUnaryExpressionCSAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getUnaryCSAccess().getUnaryExpressionCSAction_1_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// op=( "-" | "not" )
protected class UnaryCS_OpAssignment_1_1 extends AssignmentToken  {
	
	public UnaryCS_OpAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getUnaryCSAccess().getOpAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnaryCS_UnaryExpressionCSAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("op",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("op");
		if("-".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getUnaryCSAccess().getOpHyphenMinusKeyword_1_1_0_0();
			return obj;
		}
		if("not".equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getUnaryCSAccess().getOpNotKeyword_1_1_0_1();
			return obj;
		}
		return null;
	}

}

// source=unaryCS
protected class UnaryCS_SourceAssignment_1_2 extends AssignmentToken  {
	
	public UnaryCS_SourceAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getUnaryCSAccess().getSourceAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new UnaryCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("source",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("source");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getUnaryCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getUnaryCSAccess().getSourceUnaryCSParserRuleCall_1_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new UnaryCS_OpAssignment_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule unaryCS ****************/


/************ begin Rule calledExpCS ****************
 *
 * calledExpCS returns OclExpressionCS:
 *   implicitCallExpCS ({CallExpCS.source=current} callArguments+=CallArgumentsCS+)?;
 *
 **/

// implicitCallExpCS ({CallExpCS.source=current} callArguments+=CallArgumentsCS+)?
protected class CalledExpCS_Group extends GroupToken {
	
	public CalledExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCalledExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CalledExpCS_Group_1(parent, this, 0, inst);
			case 1: return new CalledExpCS_ImplicitCallExpCSParserRuleCall_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getCalledExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// implicitCallExpCS
protected class CalledExpCS_ImplicitCallExpCSParserRuleCall_0 extends RuleCallToken {
	
	public CalledExpCS_ImplicitCallExpCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getCalledExpCSAccess().getImplicitCallExpCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ImplicitCallExpCS_PreCallExpCSParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ImplicitCallExpCS_PreCallExpCSParserRuleCall.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getImplicitCallExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// ({CallExpCS.source=current} callArguments+=CallArgumentsCS+)?
protected class CalledExpCS_Group_1 extends GroupToken {
	
	public CalledExpCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCalledExpCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CalledExpCS_CallArgumentsAssignment_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {CallExpCS.source=current}
protected class CalledExpCS_CallExpCSSourceAction_1_0 extends ActionToken  {

	public CalledExpCS_CallExpCSSourceAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getCalledExpCSAccess().getCallExpCSSourceAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CalledExpCS_ImplicitCallExpCSParserRuleCall_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getCalledExpCSAccess().getCallExpCSSourceAction_1_0().getType().getClassifier())) return null;
		Object val = current.getConsumable("source", false);
		if(val == null) return null;
		if(!current.isConsumedWithLastConsumtion("source")) return null;
		return getDescr((EObject) val);
	}
}

// callArguments+=CallArgumentsCS+
protected class CalledExpCS_CallArgumentsAssignment_1_1 extends AssignmentToken  {
	
	public CalledExpCS_CallArgumentsAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCalledExpCSAccess().getCallArgumentsAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("callArguments",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("callArguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getCallArgumentsCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCalledExpCSAccess().getCallArgumentsCallArgumentsCSParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CalledExpCS_CallArgumentsAssignment_1_1(parent, next, actIndex, consumed);
			case 1: return new CalledExpCS_CallExpCSSourceAction_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule calledExpCS ****************/


/************ begin Rule CallArgumentsCS ****************
 *
 * CallArgumentsCS:
 *   {ArrowCallArgumentsCS} "->" pathName=pathNameCS "(" (variable1=iteratorVariableCS (
 *   "," variable2=iteratorVariableCS|";" variable2=iteratorAccumulatorCS)? "|" body=
 *   OclExpressionCS|(arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)?)
 *   ")"|{DotIndexArgumentsCS} "." pathName=pathNameCS ("[" indexes+=OclExpressionCS (","
 *   indexes+=OclExpressionCS)* "]")? isPre?="@pre"? ("(" (arguments+=OclExpressionCS (","
 *   arguments+=OclExpressionCS)*)? ")")?;
 *
 **/

// {ArrowCallArgumentsCS} "->" pathName=pathNameCS "(" (variable1=iteratorVariableCS (
// "," variable2=iteratorVariableCS|";" variable2=iteratorAccumulatorCS)? "|" body=
// OclExpressionCS|(arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)?)
// ")"|{DotIndexArgumentsCS} "." pathName=pathNameCS ("[" indexes+=OclExpressionCS (","
// indexes+=OclExpressionCS)* "]")? isPre?="@pre"? ("(" (arguments+=OclExpressionCS (","
// arguments+=OclExpressionCS)*)? ")")?
protected class CallArgumentsCS_Alternatives extends AlternativesToken {

	public CallArgumentsCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_0(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_Group_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getCallArgumentsCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// {ArrowCallArgumentsCS} "->" pathName=pathNameCS "(" (variable1=iteratorVariableCS (
// "," variable2=iteratorVariableCS|";" variable2=iteratorAccumulatorCS)? "|" body=
// OclExpressionCS|(arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)?)
// ")"
protected class CallArgumentsCS_Group_0 extends GroupToken {
	
	public CallArgumentsCS_Group_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_RightParenthesisKeyword_0_5(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// {ArrowCallArgumentsCS}
protected class CallArgumentsCS_ArrowCallArgumentsCSAction_0_0 extends ActionToken  {

	public CallArgumentsCS_ArrowCallArgumentsCSAction_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getArrowCallArgumentsCSAction_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getCallArgumentsCSAccess().getArrowCallArgumentsCSAction_0_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// "->"
protected class CallArgumentsCS_HyphenMinusGreaterThanSignKeyword_0_1 extends KeywordToken  {
	
	public CallArgumentsCS_HyphenMinusGreaterThanSignKeyword_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getHyphenMinusGreaterThanSignKeyword_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_ArrowCallArgumentsCSAction_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// pathName=pathNameCS
protected class CallArgumentsCS_PathNameAssignment_0_2 extends AssignmentToken  {
	
	public CallArgumentsCS_PathNameAssignment_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getPathNameAssignment_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("pathName",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("pathName");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPathNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getPathNamePathNameCSParserRuleCall_0_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_HyphenMinusGreaterThanSignKeyword_0_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "("
protected class CallArgumentsCS_LeftParenthesisKeyword_0_3 extends KeywordToken  {
	
	public CallArgumentsCS_LeftParenthesisKeyword_0_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getLeftParenthesisKeyword_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_PathNameAssignment_0_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// variable1=iteratorVariableCS ("," variable2=iteratorVariableCS|";" variable2=
// iteratorAccumulatorCS)? "|" body=OclExpressionCS|(arguments+=OclExpressionCS (","
// arguments+=OclExpressionCS)*)?
protected class CallArgumentsCS_Alternatives_0_4 extends AlternativesToken {

	public CallArgumentsCS_Alternatives_0_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getAlternatives_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_0_4_0(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_Group_0_4_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// variable1=iteratorVariableCS ("," variable2=iteratorVariableCS|";" variable2=
// iteratorAccumulatorCS)? "|" body=OclExpressionCS
protected class CallArgumentsCS_Group_0_4_0 extends GroupToken {
	
	public CallArgumentsCS_Group_0_4_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_BodyAssignment_0_4_0_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// variable1=iteratorVariableCS
protected class CallArgumentsCS_Variable1Assignment_0_4_0_0 extends AssignmentToken  {
	
	public CallArgumentsCS_Variable1Assignment_0_4_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getVariable1Assignment_0_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorVariableCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("variable1",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("variable1");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getIteratorVariableCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getVariable1IteratorVariableCSParserRuleCall_0_4_0_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_LeftParenthesisKeyword_0_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," variable2=iteratorVariableCS|";" variable2=iteratorAccumulatorCS)?
protected class CallArgumentsCS_Alternatives_0_4_0_1 extends AlternativesToken {

	public CallArgumentsCS_Alternatives_0_4_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getAlternatives_0_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_0_4_0_1_0(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_Group_0_4_0_1_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// "," variable2=iteratorVariableCS
protected class CallArgumentsCS_Group_0_4_0_1_0 extends GroupToken {
	
	public CallArgumentsCS_Group_0_4_0_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_0_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Variable2Assignment_0_4_0_1_0_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class CallArgumentsCS_CommaKeyword_0_4_0_1_0_0 extends KeywordToken  {
	
	public CallArgumentsCS_CommaKeyword_0_4_0_1_0_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getCommaKeyword_0_4_0_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Variable1Assignment_0_4_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// variable2=iteratorVariableCS
protected class CallArgumentsCS_Variable2Assignment_0_4_0_1_0_1 extends AssignmentToken  {
	
	public CallArgumentsCS_Variable2Assignment_0_4_0_1_0_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getVariable2Assignment_0_4_0_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorVariableCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("variable2",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("variable2");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getIteratorVariableCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getVariable2IteratorVariableCSParserRuleCall_0_4_0_1_0_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_CommaKeyword_0_4_0_1_0_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";" variable2=iteratorAccumulatorCS
protected class CallArgumentsCS_Group_0_4_0_1_1 extends GroupToken {
	
	public CallArgumentsCS_Group_0_4_0_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_0_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Variable2Assignment_0_4_0_1_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ";"
protected class CallArgumentsCS_SemicolonKeyword_0_4_0_1_1_0 extends KeywordToken  {
	
	public CallArgumentsCS_SemicolonKeyword_0_4_0_1_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getSemicolonKeyword_0_4_0_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Variable1Assignment_0_4_0_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// variable2=iteratorAccumulatorCS
protected class CallArgumentsCS_Variable2Assignment_0_4_0_1_1_1 extends AssignmentToken  {
	
	public CallArgumentsCS_Variable2Assignment_0_4_0_1_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getVariable2Assignment_0_4_0_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorAccumulatorCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("variable2",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("variable2");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getIteratorAccumulatorCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getVariable2IteratorAccumulatorCSParserRuleCall_0_4_0_1_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_SemicolonKeyword_0_4_0_1_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// "|"
protected class CallArgumentsCS_VerticalLineKeyword_0_4_0_2 extends KeywordToken  {
	
	public CallArgumentsCS_VerticalLineKeyword_0_4_0_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getVerticalLineKeyword_0_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Alternatives_0_4_0_1(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_Variable1Assignment_0_4_0_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// body=OclExpressionCS
protected class CallArgumentsCS_BodyAssignment_0_4_0_3 extends AssignmentToken  {
	
	public CallArgumentsCS_BodyAssignment_0_4_0_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getBodyAssignment_0_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("body",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("body");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getBodyOclExpressionCSParserRuleCall_0_4_0_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_VerticalLineKeyword_0_4_0_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// (arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)?
protected class CallArgumentsCS_Group_0_4_1 extends GroupToken {
	
	public CallArgumentsCS_Group_0_4_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_0_4_1_1(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_ArgumentsAssignment_0_4_1_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// arguments+=OclExpressionCS
protected class CallArgumentsCS_ArgumentsAssignment_0_4_1_0 extends AssignmentToken  {
	
	public CallArgumentsCS_ArgumentsAssignment_0_4_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_0_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("arguments",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("arguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getArgumentsOclExpressionCSParserRuleCall_0_4_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_LeftParenthesisKeyword_0_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," arguments+=OclExpressionCS)*
protected class CallArgumentsCS_Group_0_4_1_1 extends GroupToken {
	
	public CallArgumentsCS_Group_0_4_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_0_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_ArgumentsAssignment_0_4_1_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class CallArgumentsCS_CommaKeyword_0_4_1_1_0 extends KeywordToken  {
	
	public CallArgumentsCS_CommaKeyword_0_4_1_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getCommaKeyword_0_4_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_0_4_1_1(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_ArgumentsAssignment_0_4_1_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// arguments+=OclExpressionCS
protected class CallArgumentsCS_ArgumentsAssignment_0_4_1_1_1 extends AssignmentToken  {
	
	public CallArgumentsCS_ArgumentsAssignment_0_4_1_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_0_4_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("arguments",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("arguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getArgumentsOclExpressionCSParserRuleCall_0_4_1_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_CommaKeyword_0_4_1_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}




// ")"
protected class CallArgumentsCS_RightParenthesisKeyword_0_5 extends KeywordToken  {
	
	public CallArgumentsCS_RightParenthesisKeyword_0_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getRightParenthesisKeyword_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Alternatives_0_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


// {DotIndexArgumentsCS} "." pathName=pathNameCS ("[" indexes+=OclExpressionCS (","
// indexes+=OclExpressionCS)* "]")? isPre?="@pre"? ("(" (arguments+=OclExpressionCS (","
// arguments+=OclExpressionCS)*)? ")")?
protected class CallArgumentsCS_Group_1 extends GroupToken {
	
	public CallArgumentsCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_5(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_IsPreAssignment_1_4(parent, this, 1, inst);
			case 2: return new CallArgumentsCS_Group_1_3(parent, this, 2, inst);
			case 3: return new CallArgumentsCS_PathNameAssignment_1_2(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
}

// {DotIndexArgumentsCS}
protected class CallArgumentsCS_DotIndexArgumentsCSAction_1_0 extends ActionToken  {

	public CallArgumentsCS_DotIndexArgumentsCSAction_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getDotIndexArgumentsCSAction_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
	
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(!current.isInstanceOf(grammarAccess.getCallArgumentsCSAccess().getDotIndexArgumentsCSAction_1_0().getType().getClassifier())) return null;
		if(!current.isConsumed()) return null;
		return current;
	}
}

// "."
protected class CallArgumentsCS_FullStopKeyword_1_1 extends KeywordToken  {
	
	public CallArgumentsCS_FullStopKeyword_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getFullStopKeyword_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_DotIndexArgumentsCSAction_1_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// pathName=pathNameCS
protected class CallArgumentsCS_PathNameAssignment_1_2 extends AssignmentToken  {
	
	public CallArgumentsCS_PathNameAssignment_1_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getPathNameAssignment_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PathNameCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("pathName",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("pathName");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPathNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getPathNamePathNameCSParserRuleCall_1_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_FullStopKeyword_1_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("[" indexes+=OclExpressionCS ("," indexes+=OclExpressionCS)* "]")?
protected class CallArgumentsCS_Group_1_3 extends GroupToken {
	
	public CallArgumentsCS_Group_1_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_RightSquareBracketKeyword_1_3_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "["
protected class CallArgumentsCS_LeftSquareBracketKeyword_1_3_0 extends KeywordToken  {
	
	public CallArgumentsCS_LeftSquareBracketKeyword_1_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getLeftSquareBracketKeyword_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_PathNameAssignment_1_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// indexes+=OclExpressionCS
protected class CallArgumentsCS_IndexesAssignment_1_3_1 extends AssignmentToken  {
	
	public CallArgumentsCS_IndexesAssignment_1_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getIndexesAssignment_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("indexes",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("indexes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getIndexesOclExpressionCSParserRuleCall_1_3_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_LeftSquareBracketKeyword_1_3_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," indexes+=OclExpressionCS)*
protected class CallArgumentsCS_Group_1_3_2 extends GroupToken {
	
	public CallArgumentsCS_Group_1_3_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_1_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_IndexesAssignment_1_3_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class CallArgumentsCS_CommaKeyword_1_3_2_0 extends KeywordToken  {
	
	public CallArgumentsCS_CommaKeyword_1_3_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getCommaKeyword_1_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_3_2(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_IndexesAssignment_1_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// indexes+=OclExpressionCS
protected class CallArgumentsCS_IndexesAssignment_1_3_2_1 extends AssignmentToken  {
	
	public CallArgumentsCS_IndexesAssignment_1_3_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getIndexesAssignment_1_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("indexes",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("indexes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getIndexesOclExpressionCSParserRuleCall_1_3_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_CommaKeyword_1_3_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "]"
protected class CallArgumentsCS_RightSquareBracketKeyword_1_3_3 extends KeywordToken  {
	
	public CallArgumentsCS_RightSquareBracketKeyword_1_3_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getRightSquareBracketKeyword_1_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_3_2(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_IndexesAssignment_1_3_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}


// isPre?="@pre"?
protected class CallArgumentsCS_IsPreAssignment_1_4 extends AssignmentToken  {
	
	public CallArgumentsCS_IsPreAssignment_1_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getIsPreAssignment_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_3(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_PathNameAssignment_1_2(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("isPre",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("isPre");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KW;
			element = grammarAccess.getCallArgumentsCSAccess().getIsPrePreKeyword_1_4_0();
			return obj;
		}
		return null;
	}

}

// ("(" (arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)? ")")?
protected class CallArgumentsCS_Group_1_5 extends GroupToken {
	
	public CallArgumentsCS_Group_1_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_RightParenthesisKeyword_1_5_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "("
protected class CallArgumentsCS_LeftParenthesisKeyword_1_5_0 extends KeywordToken  {
	
	public CallArgumentsCS_LeftParenthesisKeyword_1_5_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getLeftParenthesisKeyword_1_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_IsPreAssignment_1_4(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_Group_1_3(parent, this, 1, inst);
			case 2: return new CallArgumentsCS_PathNameAssignment_1_2(parent, this, 2, inst);
			default: return null;
		}	
	}	
		
}

// (arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)?
protected class CallArgumentsCS_Group_1_5_1 extends GroupToken {
	
	public CallArgumentsCS_Group_1_5_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_1_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_5_1_1(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_ArgumentsAssignment_1_5_1_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// arguments+=OclExpressionCS
protected class CallArgumentsCS_ArgumentsAssignment_1_5_1_0 extends AssignmentToken  {
	
	public CallArgumentsCS_ArgumentsAssignment_1_5_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_1_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("arguments",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("arguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getArgumentsOclExpressionCSParserRuleCall_1_5_1_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_LeftParenthesisKeyword_1_5_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," arguments+=OclExpressionCS)*
protected class CallArgumentsCS_Group_1_5_1_1 extends GroupToken {
	
	public CallArgumentsCS_Group_1_5_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getGroup_1_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_ArgumentsAssignment_1_5_1_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class CallArgumentsCS_CommaKeyword_1_5_1_1_0 extends KeywordToken  {
	
	public CallArgumentsCS_CommaKeyword_1_5_1_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getCommaKeyword_1_5_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_5_1_1(parent, this, 0, inst);
			case 1: return new CallArgumentsCS_ArgumentsAssignment_1_5_1_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// arguments+=OclExpressionCS
protected class CallArgumentsCS_ArgumentsAssignment_1_5_1_1_1 extends AssignmentToken  {
	
	public CallArgumentsCS_ArgumentsAssignment_1_5_1_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getArgumentsAssignment_1_5_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("arguments",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("arguments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getCallArgumentsCSAccess().getArgumentsOclExpressionCSParserRuleCall_1_5_1_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new CallArgumentsCS_CommaKeyword_1_5_1_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



// ")"
protected class CallArgumentsCS_RightParenthesisKeyword_1_5_2 extends KeywordToken  {
	
	public CallArgumentsCS_RightParenthesisKeyword_1_5_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCallArgumentsCSAccess().getRightParenthesisKeyword_1_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new CallArgumentsCS_Group_1_5_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}




/************ end Rule CallArgumentsCS ****************/


/************ begin Rule iteratorVariableCS ****************
 *
 * iteratorVariableCS returns VariableCS:
 *   name=simpleNameCS (":" type=typeCS)?;
 *
 **/

// name=simpleNameCS (":" type=typeCS)?
protected class IteratorVariableCS_Group extends GroupToken {
	
	public IteratorVariableCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getIteratorVariableCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorVariableCS_Group_1(parent, this, 0, inst);
			case 1: return new IteratorVariableCS_NameAssignment_0(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getIteratorVariableCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// name=simpleNameCS
protected class IteratorVariableCS_NameAssignment_0 extends AssignmentToken  {
	
	public IteratorVariableCS_NameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIteratorVariableCSAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIteratorVariableCSAccess().getNameSimpleNameCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// (":" type=typeCS)?
protected class IteratorVariableCS_Group_1 extends GroupToken {
	
	public IteratorVariableCS_Group_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getIteratorVariableCSAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorVariableCS_TypeAssignment_1_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ":"
protected class IteratorVariableCS_ColonKeyword_1_0 extends KeywordToken  {
	
	public IteratorVariableCS_ColonKeyword_1_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIteratorVariableCSAccess().getColonKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorVariableCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=typeCS
protected class IteratorVariableCS_TypeAssignment_1_1 extends AssignmentToken  {
	
	public IteratorVariableCS_TypeAssignment_1_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIteratorVariableCSAccess().getTypeAssignment_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIteratorVariableCSAccess().getTypeTypeCSParserRuleCall_1_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new IteratorVariableCS_ColonKeyword_1_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule iteratorVariableCS ****************/


/************ begin Rule iteratorAccumulatorCS ****************
 *
 * iteratorAccumulatorCS returns VariableCS:
 *   name=simpleNameCS ":" type=typeCS "=" initExpression=OclExpressionCS;
 *
 **/

// name=simpleNameCS ":" type=typeCS "=" initExpression=OclExpressionCS
protected class IteratorAccumulatorCS_Group extends GroupToken {
	
	public IteratorAccumulatorCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getIteratorAccumulatorCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorAccumulatorCS_InitExpressionAssignment_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getIteratorAccumulatorCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// name=simpleNameCS
protected class IteratorAccumulatorCS_NameAssignment_0 extends AssignmentToken  {
	
	public IteratorAccumulatorCS_NameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIteratorAccumulatorCSAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIteratorAccumulatorCSAccess().getNameSimpleNameCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// ":"
protected class IteratorAccumulatorCS_ColonKeyword_1 extends KeywordToken  {
	
	public IteratorAccumulatorCS_ColonKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIteratorAccumulatorCSAccess().getColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorAccumulatorCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=typeCS
protected class IteratorAccumulatorCS_TypeAssignment_2 extends AssignmentToken  {
	
	public IteratorAccumulatorCS_TypeAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIteratorAccumulatorCSAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIteratorAccumulatorCSAccess().getTypeTypeCSParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new IteratorAccumulatorCS_ColonKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "="
protected class IteratorAccumulatorCS_EqualsSignKeyword_3 extends KeywordToken  {
	
	public IteratorAccumulatorCS_EqualsSignKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIteratorAccumulatorCSAccess().getEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IteratorAccumulatorCS_TypeAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// initExpression=OclExpressionCS
protected class IteratorAccumulatorCS_InitExpressionAssignment_4 extends AssignmentToken  {
	
	public IteratorAccumulatorCS_InitExpressionAssignment_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIteratorAccumulatorCSAccess().getInitExpressionAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("initExpression",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("initExpression");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIteratorAccumulatorCSAccess().getInitExpressionOclExpressionCSParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new IteratorAccumulatorCS_EqualsSignKeyword_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule iteratorAccumulatorCS ****************/


/************ begin Rule implicitCallExpCS ****************
 *
 * implicitCallExpCS returns OclExpressionCS:
 *   preCallExpCS; 
 * 
 * 	    
 * 		
 * //    	(	(({ImplicitIndexExpCS.calls=current} '[' indexes+=OclExpressionCS (',' indexes+=OclExpressionCS)* ']')?)
 * //    	|	(({ImplicitCallExpCS.calls=current} '(' (arguments+=OclExpressionCS (',' arguments+=OclExpressionCS)*)? ')')?)
 * //    	)
 *
 **/

// preCallExpCS 
// 		
// //    	(	(({ImplicitIndexExpCS.calls=current} '[' indexes+=OclExpressionCS (',' indexes+=OclExpressionCS)* ']')?)
// //    	|	(({ImplicitCallExpCS.calls=current} '(' (arguments+=OclExpressionCS (',' arguments+=OclExpressionCS)*)? ')')?)
// //    	)
protected class ImplicitCallExpCS_PreCallExpCSParserRuleCall extends RuleCallToken {
	
	public ImplicitCallExpCS_PreCallExpCSParserRuleCall(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getImplicitCallExpCSAccess().getPreCallExpCSParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PreCallExpCS_ExtendedPrimaryExpCSParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getImplicitCallExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PreCallExpCS_ExtendedPrimaryExpCSParserRuleCall.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPreCallExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule implicitCallExpCS ****************/


/************ begin Rule preCallExpCS ****************
 *
 * preCallExpCS returns OclExpressionCS:
 *   extendedPrimaryExpCS; 
 * 	
 * 	    
 * 		
 * //	|	source=primaryExpCS isPre?='@pre'
 *
 **/

// extendedPrimaryExpCS 
// 		
// //	|	source=primaryExpCS isPre?='@pre'
protected class PreCallExpCS_ExtendedPrimaryExpCSParserRuleCall extends RuleCallToken {
	
	public PreCallExpCS_ExtendedPrimaryExpCSParserRuleCall(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPreCallExpCSAccess().getExtendedPrimaryExpCSParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new ExtendedPrimaryExpCS_PrimaryExpCSParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPreCallExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(ExtendedPrimaryExpCS_PrimaryExpCSParserRuleCall.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getExtendedPrimaryExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule preCallExpCS ****************/


/************ begin Rule SimpleNameExpCS ****************
 *
 * SimpleNameExpCS returns OclExpressionCS:
 *   simpleNameCS; 
 *         
 *           // AssociationClassCallExpCS[B.1.1],
 *                          // PropertyCallExpCS[B],VariableExpCS[.1]
 *
 **/

// simpleNameCS   // AssociationClassCallExpCS[B.1.1],
//                          // PropertyCallExpCS[B],VariableExpCS[.1]
protected class SimpleNameExpCS_SimpleNameCSParserRuleCall extends RuleCallToken {
	
	public SimpleNameExpCS_SimpleNameCSParserRuleCall(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getSimpleNameExpCSAccess().getSimpleNameCSParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getSimpleNameExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(SimpleNameCS_ValueAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule SimpleNameExpCS ****************/


/************ begin Rule extendedPrimaryExpCS ****************
 *
 * extendedPrimaryExpCS returns OclExpressionCS:
 *   primaryExpCS; 
 * 
 *         
 * 		
 * //  |	OclMessageExpCS // OclExpressionCS[E] is added by CompleteOCL
 *
 **/

// primaryExpCS 
// 		
// //  |	OclMessageExpCS // OclExpressionCS[E] is added by CompleteOCL
protected class ExtendedPrimaryExpCS_PrimaryExpCSParserRuleCall extends RuleCallToken {
	
	public ExtendedPrimaryExpCS_PrimaryExpCSParserRuleCall(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getExtendedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimaryExpCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getExtendedPrimaryExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(PrimaryExpCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getPrimaryExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule extendedPrimaryExpCS ****************/


/************ begin Rule primaryExpCS ****************
 *
 * primaryExpCS returns OclExpressionCS:
 *   selfKeywordCS|LiteralExpCS|IfExpCS|"(" OclExpressionCS ")"; 
 * 
 *         
 * 			 // The only VariableExpCS not parsed as a TypeLiteralExpCS
 *      	      // OclExpressionCS[C]
 *      	           // OclExpressionCS[F]
 *
 **/

// selfKeywordCS|LiteralExpCS|IfExpCS|"(" OclExpressionCS ")" 
// 
//         
// 			 // The only VariableExpCS not parsed as a TypeLiteralExpCS
//      	      // OclExpressionCS[C]
//      	           // OclExpressionCS[F]
protected class PrimaryExpCS_Alternatives extends AlternativesToken {

	public PrimaryExpCS_Alternatives(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimaryExpCS_SelfKeywordCSParserRuleCall_0(parent, this, 0, inst);
			case 1: return new PrimaryExpCS_LiteralExpCSParserRuleCall_1(parent, this, 1, inst);
			case 2: return new PrimaryExpCS_IfExpCSParserRuleCall_2(parent, this, 2, inst);
			case 3: return new PrimaryExpCS_Group_3(parent, this, 3, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getPrimaryExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// selfKeywordCS 
// 			 // The only VariableExpCS not parsed as a TypeLiteralExpCS
protected class PrimaryExpCS_SelfKeywordCSParserRuleCall_0 extends RuleCallToken {
	
	public PrimaryExpCS_SelfKeywordCSParserRuleCall_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getSelfKeywordCSParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SelfKeywordCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(SelfKeywordCS_ValueAssignment.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getSelfKeywordCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// LiteralExpCS 	      // OclExpressionCS[C]
protected class PrimaryExpCS_LiteralExpCSParserRuleCall_1 extends RuleCallToken {
	
	public PrimaryExpCS_LiteralExpCSParserRuleCall_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getLiteralExpCSParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LiteralExpCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(LiteralExpCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getLiteralExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// IfExpCS 	           // OclExpressionCS[F]
protected class PrimaryExpCS_IfExpCSParserRuleCall_2 extends RuleCallToken {
	
	public PrimaryExpCS_IfExpCSParserRuleCall_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IfExpCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(IfExpCS_Group.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getIfExpCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, inst);
		}	
	}	
}

// "(" OclExpressionCS ")"
protected class PrimaryExpCS_Group_3 extends GroupToken {
	
	public PrimaryExpCS_Group_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimaryExpCS_RightParenthesisKeyword_3_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// "("
protected class PrimaryExpCS_LeftParenthesisKeyword_3_0 extends KeywordToken  {
	
	public PrimaryExpCS_LeftParenthesisKeyword_3_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getLeftParenthesisKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
}

// OclExpressionCS
protected class PrimaryExpCS_OclExpressionCSParserRuleCall_3_1 extends RuleCallToken {
	
	public PrimaryExpCS_OclExpressionCSParserRuleCall_3_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getOclExpressionCSParserRuleCall_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	protected IInstanceDescription tryConsumeVal() {
		if(checkForRecursion(OclExpressionCS_Alternatives.class, current)) return null;
		if(!current.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) return null;
		return current;
	}
	
    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimaryExpCS_LeftParenthesisKeyword_3_0(parent, next, actIndex, inst);
			default: return null;
		}	
	}	
}

// ")"
protected class PrimaryExpCS_RightParenthesisKeyword_3_2 extends KeywordToken  {
	
	public PrimaryExpCS_RightParenthesisKeyword_3_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPrimaryExpCSAccess().getRightParenthesisKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new PrimaryExpCS_OclExpressionCSParserRuleCall_3_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}



/************ end Rule primaryExpCS ****************/


/************ begin Rule IfExpCS ****************
 *
 * IfExpCS:
 *   "if" condition=OclExpressionCS "then" thenExpression=OclExpressionCS "else"
 *   elseExpression=OclExpressionCS "endif";
 *
 **/

// "if" condition=OclExpressionCS "then" thenExpression=OclExpressionCS "else"
// elseExpression=OclExpressionCS "endif"
protected class IfExpCS_Group extends GroupToken {
	
	public IfExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IfExpCS_EndifKeyword_6(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getIfExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// "if"
protected class IfExpCS_IfKeyword_0 extends KeywordToken  {
	
	public IfExpCS_IfKeyword_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getIfKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
}

// condition=OclExpressionCS
protected class IfExpCS_ConditionAssignment_1 extends AssignmentToken  {
	
	public IfExpCS_ConditionAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getConditionAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("condition",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("condition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIfExpCSAccess().getConditionOclExpressionCSParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new IfExpCS_IfKeyword_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "then"
protected class IfExpCS_ThenKeyword_2 extends KeywordToken  {
	
	public IfExpCS_ThenKeyword_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getThenKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IfExpCS_ConditionAssignment_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// thenExpression=OclExpressionCS
protected class IfExpCS_ThenExpressionAssignment_3 extends AssignmentToken  {
	
	public IfExpCS_ThenExpressionAssignment_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("thenExpression",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("thenExpression");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIfExpCSAccess().getThenExpressionOclExpressionCSParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new IfExpCS_ThenKeyword_2(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "else"
protected class IfExpCS_ElseKeyword_4 extends KeywordToken  {
	
	public IfExpCS_ElseKeyword_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getElseKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IfExpCS_ThenExpressionAssignment_3(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// elseExpression=OclExpressionCS
protected class IfExpCS_ElseExpressionAssignment_5 extends AssignmentToken  {
	
	public IfExpCS_ElseExpressionAssignment_5(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("elseExpression",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("elseExpression");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getIfExpCSAccess().getElseExpressionOclExpressionCSParserRuleCall_5_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new IfExpCS_ElseKeyword_4(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "endif"
protected class IfExpCS_EndifKeyword_6 extends KeywordToken  {
	
	public IfExpCS_EndifKeyword_6(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getIfExpCSAccess().getEndifKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new IfExpCS_ElseExpressionAssignment_5(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}


/************ end Rule IfExpCS ****************/


/************ begin Rule LetExpCS ****************
 *
 * LetExpCS:
 *   "let" variable+=LetVariableCS ("," variable+=LetVariableCS)* "in" in=OclExpressionCS;
 *
 **/

// "let" variable+=LetVariableCS ("," variable+=LetVariableCS)* "in" in=OclExpressionCS
protected class LetExpCS_Group extends GroupToken {
	
	public LetExpCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetExpCS_InAssignment_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getLetExpCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// "let"
protected class LetExpCS_LetKeyword_0 extends KeywordToken  {
	
	public LetExpCS_LetKeyword_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getLetKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			default: return parent.createParentFollower(this, index, index, inst);
		}	
	}	
		
}

// variable+=LetVariableCS
protected class LetExpCS_VariableAssignment_1 extends AssignmentToken  {
	
	public LetExpCS_VariableAssignment_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getVariableAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetVariableCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("variable",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("variable");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetVariableCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new LetExpCS_LetKeyword_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," variable+=LetVariableCS)*
protected class LetExpCS_Group_2 extends GroupToken {
	
	public LetExpCS_Group_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetExpCS_VariableAssignment_2_1(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// ","
protected class LetExpCS_CommaKeyword_2_0 extends KeywordToken  {
	
	public LetExpCS_CommaKeyword_2_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetExpCS_Group_2(parent, this, 0, inst);
			case 1: return new LetExpCS_VariableAssignment_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// variable+=LetVariableCS
protected class LetExpCS_VariableAssignment_2_1 extends AssignmentToken  {
	
	public LetExpCS_VariableAssignment_2_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetVariableCS_Group(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("variable",false)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("variable");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getLetVariableCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new LetExpCS_CommaKeyword_2_0(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "in"
protected class LetExpCS_InKeyword_3 extends KeywordToken  {
	
	public LetExpCS_InKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getInKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetExpCS_Group_2(parent, this, 0, inst);
			case 1: return new LetExpCS_VariableAssignment_1(parent, this, 1, inst);
			default: return null;
		}	
	}	
		
}

// in=OclExpressionCS
protected class LetExpCS_InAssignment_4 extends AssignmentToken  {
	
	public LetExpCS_InAssignment_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getLetExpCSAccess().getInAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("in",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("in");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getLetExpCSAccess().getInOclExpressionCSParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new LetExpCS_InKeyword_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule LetExpCS ****************/


/************ begin Rule LetVariableCS ****************
 *
 * LetVariableCS returns VariableCS:
 *   name=simpleNameCS ":" type=typeCS "=" initExpression=OclExpressionCS;
 *
 **/

// name=simpleNameCS ":" type=typeCS "=" initExpression=OclExpressionCS
protected class LetVariableCS_Group extends GroupToken {
	
	public LetVariableCS_Group(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getLetVariableCSAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetVariableCS_InitExpressionAssignment_4(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override
	public IInstanceDescription tryConsume() {
		if(!current.isInstanceOf(grammarAccess.getLetVariableCSRule().getType().getClassifier())) return null;
		return tryConsumeVal();
	}
}

// name=simpleNameCS
protected class LetVariableCS_NameAssignment_0 extends AssignmentToken  {
	
	public LetVariableCS_NameAssignment_0(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getLetVariableCSAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new SimpleNameCS_ValueAssignment(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("name",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getSimpleNameCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getLetVariableCSAccess().getNameSimpleNameCSParserRuleCall_0_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			default: return parent.createParentFollower(next, actIndex , index, consumed);
		}	
	}	
}

// ":"
protected class LetVariableCS_ColonKeyword_1 extends KeywordToken  {
	
	public LetVariableCS_ColonKeyword_1(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getLetVariableCSAccess().getColonKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetVariableCS_NameAssignment_0(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// type=typeCS
protected class LetVariableCS_TypeAssignment_2 extends AssignmentToken  {
	
	public LetVariableCS_TypeAssignment_2(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getLetVariableCSAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new TypeCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("type",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getTypeCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getLetVariableCSAccess().getTypeTypeCSParserRuleCall_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new LetVariableCS_ColonKeyword_1(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "="
protected class LetVariableCS_EqualsSignKeyword_3 extends KeywordToken  {
	
	public LetVariableCS_EqualsSignKeyword_3(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new LetVariableCS_TypeAssignment_2(parent, this, 0, inst);
			default: return null;
		}	
	}	
		
}

// initExpression=OclExpressionCS
protected class LetVariableCS_InitExpressionAssignment_4 extends AssignmentToken  {
	
	public LetVariableCS_InitExpressionAssignment_4(AbstractToken parent, AbstractToken next, int no, IInstanceDescription current) {
		super(parent, next, no, current);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IInstanceDescription inst) {
		switch(index) {
			case 0: return new OclExpressionCS_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}	
		
    @Override	
	protected IInstanceDescription tryConsumeVal() {
		if((value = current.getConsumable("initExpression",true)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("initExpression");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf(grammarAccess.getOclExpressionCSRule().getType().getClassifier())) {
				type = AssignmentType.PRC;
				element = grammarAccess.getLetVariableCSAccess().getInitExpressionOclExpressionCSParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createParentFollower(AbstractToken next,	int actIndex, int index, IInstanceDescription inst) {
		if(value == inst.getDelegate() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new LetVariableCS_EqualsSignKeyword_3(parent, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule LetVariableCS ****************/

}