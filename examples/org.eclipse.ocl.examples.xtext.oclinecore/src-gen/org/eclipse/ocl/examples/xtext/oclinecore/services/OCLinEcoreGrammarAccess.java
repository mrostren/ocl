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
 * $Id: OCLinEcoreGrammarAccess.java,v 1.1 2010/04/13 06:44:12 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.oclinecore.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLGrammarAccess;

@Singleton
public class OCLinEcoreGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DocumentCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DocumentCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportCSParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cPackagesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPackagesPackageCSParserRuleCall_1_0 = (RuleCall)cPackagesAssignment_1.eContents().get(0);
		
		//DocumentCS:
		//  imports+=ImportCS* packages+=PackageCS*; 
		////generate oclinEcore2 "http://www.eclipse.org/ocl/examples/xtext/oclinecore/OCLinEcore"
		public ParserRule getRule() { return rule; }

		//imports+=ImportCS* packages+=PackageCS*
		public Group getGroup() { return cGroup; }

		//imports+=ImportCS*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//ImportCS
		public RuleCall getImportsImportCSParserRuleCall_0_0() { return cImportsImportCSParserRuleCall_0_0; }

		//packages+=PackageCS*
		public Assignment getPackagesAssignment_1() { return cPackagesAssignment_1; }

		//PackageCS
		public RuleCall getPackagesPackageCSParserRuleCall_1_0() { return cPackagesPackageCSParserRuleCall_1_0; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN returns ecore::EString:
		//  ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//INTEGER returns ecore::EInt:
		//  INT;
		public ParserRule getRule() { return rule; }

		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}

	public class LOWERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LOWER");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//LOWER returns ecore::EInt:
		//  INT;
		public ParserRule getRule() { return rule; }

		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}

	public class UPPERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UPPER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Keyword cAsteriskKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//UPPER returns ecore::EInt:
		//  INT|"*";
		public ParserRule getRule() { return rule; }

		//INT|"*"
		public Alternatives getAlternatives() { return cAlternatives; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//"*"
		public Keyword getAsteriskKeyword_1() { return cAsteriskKeyword_1; }
	}

	public class BodyConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BodyConstraintCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStereotypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStereotypeBodyKeyword_0_0 = (Keyword)cStereotypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cExprValueAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cExprValueOclExpressionCSParserRuleCall_3_0_0 = (RuleCall)cExprValueAssignment_3_0.eContents().get(0);
		private final Assignment cExprStringAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cExprStringOCLTerminalRuleCall_3_1_0 = (RuleCall)cExprStringAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//BodyConstraintCS returns ConstraintCS:
		//  stereotype="body" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
		public ParserRule getRule() { return rule; }

		//stereotype="body" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
		public Group getGroup() { return cGroup; }

		//stereotype="body"
		public Assignment getStereotypeAssignment_0() { return cStereotypeAssignment_0; }

		//"body"
		public Keyword getStereotypeBodyKeyword_0_0() { return cStereotypeBodyKeyword_0_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//exprValue=OclExpressionCS|exprString=OCL
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//exprValue=OclExpressionCS
		public Assignment getExprValueAssignment_3_0() { return cExprValueAssignment_3_0; }

		//OclExpressionCS
		public RuleCall getExprValueOclExpressionCSParserRuleCall_3_0_0() { return cExprValueOclExpressionCSParserRuleCall_3_0_0; }

		//exprString=OCL
		public Assignment getExprStringAssignment_3_1() { return cExprStringAssignment_3_1; }

		//OCL
		public RuleCall getExprStringOCLTerminalRuleCall_3_1_0() { return cExprStringOCLTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class DerivedConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DerivedConstraintCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStereotypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStereotypeDerivationKeyword_0_0 = (Keyword)cStereotypeAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cExprValueAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cExprValueOclExpressionCSParserRuleCall_2_0_0 = (RuleCall)cExprValueAssignment_2_0.eContents().get(0);
		private final Assignment cExprStringAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cExprStringOCLTerminalRuleCall_2_1_0 = (RuleCall)cExprStringAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DerivedConstraintCS returns ConstraintCS:
		//  stereotype="derivation" ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
		public ParserRule getRule() { return rule; }

		//stereotype="derivation" ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
		public Group getGroup() { return cGroup; }

		//stereotype="derivation"
		public Assignment getStereotypeAssignment_0() { return cStereotypeAssignment_0; }

		//"derivation"
		public Keyword getStereotypeDerivationKeyword_0_0() { return cStereotypeDerivationKeyword_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//exprValue=OclExpressionCS|exprString=OCL
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//exprValue=OclExpressionCS
		public Assignment getExprValueAssignment_2_0() { return cExprValueAssignment_2_0; }

		//OclExpressionCS
		public RuleCall getExprValueOclExpressionCSParserRuleCall_2_0_0() { return cExprValueOclExpressionCSParserRuleCall_2_0_0; }

		//exprString=OCL
		public Assignment getExprStringAssignment_2_1() { return cExprStringAssignment_2_1; }

		//OCL
		public RuleCall getExprStringOCLTerminalRuleCall_2_1_0() { return cExprStringOCLTerminalRuleCall_2_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class InitialConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InitialConstraintCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStereotypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStereotypeInitialKeyword_0_0 = (Keyword)cStereotypeAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cExprValueAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cExprValueOclExpressionCSParserRuleCall_2_0_0 = (RuleCall)cExprValueAssignment_2_0.eContents().get(0);
		private final Assignment cExprStringAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cExprStringOCLTerminalRuleCall_2_1_0 = (RuleCall)cExprStringAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//InitialConstraintCS returns ConstraintCS:
		//  stereotype="initial" ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
		public ParserRule getRule() { return rule; }

		//stereotype="initial" ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
		public Group getGroup() { return cGroup; }

		//stereotype="initial"
		public Assignment getStereotypeAssignment_0() { return cStereotypeAssignment_0; }

		//"initial"
		public Keyword getStereotypeInitialKeyword_0_0() { return cStereotypeInitialKeyword_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//exprValue=OclExpressionCS|exprString=OCL
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//exprValue=OclExpressionCS
		public Assignment getExprValueAssignment_2_0() { return cExprValueAssignment_2_0; }

		//OclExpressionCS
		public RuleCall getExprValueOclExpressionCSParserRuleCall_2_0_0() { return cExprValueOclExpressionCSParserRuleCall_2_0_0; }

		//exprString=OCL
		public Assignment getExprStringAssignment_2_1() { return cExprStringAssignment_2_1; }

		//OCL
		public RuleCall getExprStringOCLTerminalRuleCall_2_1_0() { return cExprStringOCLTerminalRuleCall_2_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class InvariantConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InvariantConstraintCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStereotypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStereotypeInvariantKeyword_0_0 = (Keyword)cStereotypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cExprValueAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cExprValueOclExpressionCSParserRuleCall_3_0_0 = (RuleCall)cExprValueAssignment_3_0.eContents().get(0);
		private final Assignment cExprStringAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cExprStringOCLTerminalRuleCall_3_1_0 = (RuleCall)cExprStringAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InvariantConstraintCS returns ConstraintCS:
		//  stereotype="invariant" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
		public ParserRule getRule() { return rule; }

		//stereotype="invariant" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";"
		public Group getGroup() { return cGroup; }

		//stereotype="invariant"
		public Assignment getStereotypeAssignment_0() { return cStereotypeAssignment_0; }

		//"invariant"
		public Keyword getStereotypeInvariantKeyword_0_0() { return cStereotypeInvariantKeyword_0_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//exprValue=OclExpressionCS|exprString=OCL
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//exprValue=OclExpressionCS
		public Assignment getExprValueAssignment_3_0() { return cExprValueAssignment_3_0; }

		//OclExpressionCS
		public RuleCall getExprValueOclExpressionCSParserRuleCall_3_0_0() { return cExprValueOclExpressionCSParserRuleCall_3_0_0; }

		//exprString=OCL
		public Assignment getExprStringAssignment_3_1() { return cExprStringAssignment_3_1; }

		//OCL
		public RuleCall getExprStringOCLTerminalRuleCall_3_1_0() { return cExprStringOCLTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class PostconditionConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PostconditionConstraintCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStereotypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStereotypePostconditionKeyword_0_0 = (Keyword)cStereotypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cExprValueAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cExprValueOclExpressionCSParserRuleCall_3_0_0 = (RuleCall)cExprValueAssignment_3_0.eContents().get(0);
		private final Assignment cExprStringAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cExprStringOCLTerminalRuleCall_3_1_0 = (RuleCall)cExprStringAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PostconditionConstraintCS returns ConstraintCS:
		//  stereotype="postcondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
		//  ";";
		public ParserRule getRule() { return rule; }

		//stereotype="postcondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
		//";"
		public Group getGroup() { return cGroup; }

		//stereotype="postcondition"
		public Assignment getStereotypeAssignment_0() { return cStereotypeAssignment_0; }

		//"postcondition"
		public Keyword getStereotypePostconditionKeyword_0_0() { return cStereotypePostconditionKeyword_0_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//exprValue=OclExpressionCS|exprString=OCL
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//exprValue=OclExpressionCS
		public Assignment getExprValueAssignment_3_0() { return cExprValueAssignment_3_0; }

		//OclExpressionCS
		public RuleCall getExprValueOclExpressionCSParserRuleCall_3_0_0() { return cExprValueOclExpressionCSParserRuleCall_3_0_0; }

		//exprString=OCL
		public Assignment getExprStringAssignment_3_1() { return cExprStringAssignment_3_1; }

		//OCL
		public RuleCall getExprStringOCLTerminalRuleCall_3_1_0() { return cExprStringOCLTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class PreconditionConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PreconditionConstraintCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStereotypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStereotypePreconditionKeyword_0_0 = (Keyword)cStereotypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cExprValueAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cExprValueOclExpressionCSParserRuleCall_3_0_0 = (RuleCall)cExprValueAssignment_3_0.eContents().get(0);
		private final Assignment cExprStringAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cExprStringOCLTerminalRuleCall_3_1_0 = (RuleCall)cExprStringAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PreconditionConstraintCS returns ConstraintCS:
		//  stereotype="precondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
		//  ";";
		public ParserRule getRule() { return rule; }

		//stereotype="precondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
		//";"
		public Group getGroup() { return cGroup; }

		//stereotype="precondition"
		public Assignment getStereotypeAssignment_0() { return cStereotypeAssignment_0; }

		//"precondition"
		public Keyword getStereotypePreconditionKeyword_0_0() { return cStereotypePreconditionKeyword_0_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//exprValue=OclExpressionCS|exprString=OCL
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//exprValue=OclExpressionCS
		public Assignment getExprValueAssignment_3_0() { return cExprValueAssignment_3_0; }

		//OclExpressionCS
		public RuleCall getExprValueOclExpressionCSParserRuleCall_3_0_0() { return cExprValueOclExpressionCSParserRuleCall_3_0_0; }

		//exprString=OCL
		public Assignment getExprStringAssignment_3_1() { return cExprStringAssignment_3_1; }

		//OCL
		public RuleCall getExprStringOCLTerminalRuleCall_3_1_0() { return cExprStringOCLTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class EClassRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EClassRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefEClassCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefEClassIDTerminalRuleCall_0_1 = (RuleCall)cRefEClassCrossReference_0.eContents().get(1);
		
		//EClassRef:
		//  ref=[ecore::EClass];
		public ParserRule getRule() { return rule; }

		//ref=[ecore::EClass]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[ecore::EClass]
		public CrossReference getRefEClassCrossReference_0() { return cRefEClassCrossReference_0; }

		//ID
		public RuleCall getRefEClassIDTerminalRuleCall_0_1() { return cRefEClassIDTerminalRuleCall_0_1; }
	}

	public class EClassifierRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EClassifierRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefEClassifierCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefEClassifierIDTerminalRuleCall_0_1 = (RuleCall)cRefEClassifierCrossReference_0.eContents().get(1);
		
		//EClassifierRef:
		//  ref=[ecore::EClassifier];
		public ParserRule getRule() { return rule; }

		//ref=[ecore::EClassifier]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[ecore::EClassifier]
		public CrossReference getRefEClassifierCrossReference_0() { return cRefEClassifierCrossReference_0; }

		//ID
		public RuleCall getRefEClassifierIDTerminalRuleCall_0_1() { return cRefEClassifierIDTerminalRuleCall_0_1; }
	}

	public class EDataTypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDataTypeRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefEDataTypeCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefEDataTypeIDTerminalRuleCall_0_1 = (RuleCall)cRefEDataTypeCrossReference_0.eContents().get(1);
		
		//EDataTypeRef:
		//  ref=[ecore::EDataType];
		public ParserRule getRule() { return rule; }

		//ref=[ecore::EDataType]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[ecore::EDataType]
		public CrossReference getRefEDataTypeCrossReference_0() { return cRefEDataTypeCrossReference_0; }

		//ID
		public RuleCall getRefEDataTypeIDTerminalRuleCall_0_1() { return cRefEDataTypeIDTerminalRuleCall_0_1; }
	}

	public class EReferenceRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EReferenceRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefEReferenceCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefEReferenceIDTerminalRuleCall_0_1 = (RuleCall)cRefEReferenceCrossReference_0.eContents().get(1);
		
		//EReferenceRef:
		//  ref=[ecore::EReference];
		public ParserRule getRule() { return rule; }

		//ref=[ecore::EReference]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[ecore::EReference]
		public CrossReference getRefEReferenceCrossReference_0() { return cRefEReferenceCrossReference_0; }

		//ID
		public RuleCall getRefEReferenceIDTerminalRuleCall_0_1() { return cRefEReferenceIDTerminalRuleCall_0_1; }
	}

	public class AnnotationCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnotationCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cIdSourceAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cIdSourceIDTerminalRuleCall_1_0_0 = (RuleCall)cIdSourceAssignment_1_0.eContents().get(0);
		private final Assignment cStringSourceAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStringSourceURLTerminalRuleCall_1_1_0 = (RuleCall)cStringSourceAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDetailsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDetailsDetailCSParserRuleCall_2_1_0 = (RuleCall)cDetailsAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cDetailsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cDetailsDetailCSParserRuleCall_2_2_1_0 = (RuleCall)cDetailsAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//AnnotationCS:
		//  "@" (idSource=ID|stringSource=URL) ("(" details+=DetailCS ("," details+=DetailCS)* ")"
		//  )?;  
		//
		//    
		//	
		////	(annotations+=AnnotationCS)*
		public ParserRule getRule() { return rule; }

		//"@" (idSource=ID|stringSource=URL) ("(" details+=DetailCS ("," details+=DetailCS)* ")"
		//)? 
		//	
		////	(annotations+=AnnotationCS)*
		public Group getGroup() { return cGroup; }

		//"@" 
		//	
		////	(annotations+=AnnotationCS)*
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }

		//idSource=ID|stringSource=URL 
		////	(annotations+=AnnotationCS)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//idSource=ID
		public Assignment getIdSourceAssignment_1_0() { return cIdSourceAssignment_1_0; }

		//ID
		public RuleCall getIdSourceIDTerminalRuleCall_1_0_0() { return cIdSourceIDTerminalRuleCall_1_0_0; }

		//stringSource=URL
		public Assignment getStringSourceAssignment_1_1() { return cStringSourceAssignment_1_1; }

		//URL
		public RuleCall getStringSourceURLTerminalRuleCall_1_1_0() { return cStringSourceURLTerminalRuleCall_1_1_0; }

		//("(" details+=DetailCS ("," details+=DetailCS)* ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//details+=DetailCS
		public Assignment getDetailsAssignment_2_1() { return cDetailsAssignment_2_1; }

		//DetailCS
		public RuleCall getDetailsDetailCSParserRuleCall_2_1_0() { return cDetailsDetailCSParserRuleCall_2_1_0; }

		//("," details+=DetailCS)*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//details+=DetailCS
		public Assignment getDetailsAssignment_2_2_1() { return cDetailsAssignment_2_2_1; }

		//DetailCS
		public RuleCall getDetailsDetailCSParserRuleCall_2_2_1_0() { return cDetailsDetailCSParserRuleCall_2_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
	}

	public class AttributeCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cQualifiersAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cQualifiersDerivedKeyword_1_0_0 = (Keyword)cQualifiersAssignment_1_0.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cQualifiersDerivedKeyword_1_1_0 = (Keyword)cQualifiersAssignment_1_1.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final Keyword cQualifiersIdKeyword_1_2_0 = (Keyword)cQualifiersAssignment_1_2.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final Keyword cQualifiersIdKeyword_1_3_0 = (Keyword)cQualifiersAssignment_1_3.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_4 = (Assignment)cAlternatives_1.eContents().get(4);
		private final Keyword cQualifiersOrderedKeyword_1_4_0 = (Keyword)cQualifiersAssignment_1_4.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_5 = (Assignment)cAlternatives_1.eContents().get(5);
		private final Keyword cQualifiersOrderedKeyword_1_5_0 = (Keyword)cQualifiersAssignment_1_5.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_6 = (Assignment)cAlternatives_1.eContents().get(6);
		private final Keyword cQualifiersReadonlyKeyword_1_6_0 = (Keyword)cQualifiersAssignment_1_6.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_7 = (Assignment)cAlternatives_1.eContents().get(7);
		private final Keyword cQualifiersReadonlyKeyword_1_7_0 = (Keyword)cQualifiersAssignment_1_7.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_8 = (Assignment)cAlternatives_1.eContents().get(8);
		private final Keyword cQualifiersTransientKeyword_1_8_0 = (Keyword)cQualifiersAssignment_1_8.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_9 = (Assignment)cAlternatives_1.eContents().get(9);
		private final Keyword cQualifiersTransientKeyword_1_9_0 = (Keyword)cQualifiersAssignment_1_9.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_10 = (Assignment)cAlternatives_1.eContents().get(10);
		private final Keyword cQualifiersUniqueKeyword_1_10_0 = (Keyword)cQualifiersAssignment_1_10.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_11 = (Assignment)cAlternatives_1.eContents().get(11);
		private final Keyword cQualifiersUniqueKeyword_1_11_0 = (Keyword)cQualifiersAssignment_1_11.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_12 = (Assignment)cAlternatives_1.eContents().get(12);
		private final Keyword cQualifiersUnsettableKeyword_1_12_0 = (Keyword)cQualifiersAssignment_1_12.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_13 = (Assignment)cAlternatives_1.eContents().get(13);
		private final Keyword cQualifiersUnsettableKeyword_1_13_0 = (Keyword)cQualifiersAssignment_1_13.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_14 = (Assignment)cAlternatives_1.eContents().get(14);
		private final Keyword cQualifiersVolatileKeyword_1_14_0 = (Keyword)cQualifiersAssignment_1_14.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_15 = (Assignment)cAlternatives_1.eContents().get(15);
		private final Keyword cQualifiersVolatileKeyword_1_15_0 = (Keyword)cQualifiersAssignment_1_15.eContents().get(0);
		private final Keyword cAttributeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypeTypeRefCSParserRuleCall_4_1_0 = (RuleCall)cTypeAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Alternatives cAlternatives_4_2_1 = (Alternatives)cGroup_4_2.eContents().get(1);
		private final Group cGroup_4_2_1_0 = (Group)cAlternatives_4_2_1.eContents().get(0);
		private final Assignment cLowerAssignment_4_2_1_0_0 = (Assignment)cGroup_4_2_1_0.eContents().get(0);
		private final RuleCall cLowerLOWERParserRuleCall_4_2_1_0_0_0 = (RuleCall)cLowerAssignment_4_2_1_0_0.eContents().get(0);
		private final Group cGroup_4_2_1_0_1 = (Group)cGroup_4_2_1_0.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_4_2_1_0_1_0 = (Keyword)cGroup_4_2_1_0_1.eContents().get(0);
		private final Assignment cUpperAssignment_4_2_1_0_1_1 = (Assignment)cGroup_4_2_1_0_1.eContents().get(1);
		private final RuleCall cUpperUPPERParserRuleCall_4_2_1_0_1_1_0 = (RuleCall)cUpperAssignment_4_2_1_0_1_1.eContents().get(0);
		private final Assignment cMultiplicityAssignment_4_2_1_1 = (Assignment)cAlternatives_4_2_1.eContents().get(1);
		private final Alternatives cMultiplicityAlternatives_4_2_1_1_0 = (Alternatives)cMultiplicityAssignment_4_2_1_1.eContents().get(0);
		private final Keyword cMultiplicityAsteriskKeyword_4_2_1_1_0_0 = (Keyword)cMultiplicityAlternatives_4_2_1_1_0.eContents().get(0);
		private final Keyword cMultiplicityPlusSignKeyword_4_2_1_1_0_1 = (Keyword)cMultiplicityAlternatives_4_2_1_1_0.eContents().get(1);
		private final Keyword cMultiplicityQuestionMarkKeyword_4_2_1_1_0_2 = (Keyword)cMultiplicityAlternatives_4_2_1_1_0.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDefaultValueLiteralAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDefaultValueLiteralURLTerminalRuleCall_5_1_0 = (RuleCall)cDefaultValueLiteralAssignment_5_1.eContents().get(0);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cAlternatives_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cConstraintsAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final Alternatives cConstraintsAlternatives_6_0_1_0 = (Alternatives)cConstraintsAssignment_6_0_1.eContents().get(0);
		private final RuleCall cConstraintsInitialConstraintCSParserRuleCall_6_0_1_0_0 = (RuleCall)cConstraintsAlternatives_6_0_1_0.eContents().get(0);
		private final RuleCall cConstraintsDerivedConstraintCSParserRuleCall_6_0_1_0_1 = (RuleCall)cConstraintsAlternatives_6_0_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6_0_2 = (Keyword)cGroup_6_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_6_1 = (Keyword)cAlternatives_6.eContents().get(1);
		
		//AttributeCS:
		//  annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
		//  qualifiers+="id"|qualifiers+="!id"|qualifiers+="ordered"|qualifiers+="!ordered"|
		//  qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="transient"|
		//  qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers+=
		//  "unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
		//  "!volatile")* "attribute" name=ID (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=
		//  UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{"
		//  constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";");
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
		//qualifiers+="id"|qualifiers+="!id"|qualifiers+="ordered"|qualifiers+="!ordered"|
		//qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="transient"|
		//qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers+=
		//"unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
		//"!volatile")* "attribute" name=ID (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=
		//UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{"
		//constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";")
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//(qualifiers+="derived"|qualifiers+="!derived"|qualifiers+="id"|qualifiers+="!id"
		//|qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers
		//+="!readonly"|qualifiers+="transient"|qualifiers+="!transient"|qualifiers+=
		//"unique"|qualifiers+="!unique"|qualifiers+="unsettable"|qualifiers+=
		//"!unsettable"|qualifiers+="volatile"|qualifiers+="!volatile")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiers+="derived"
		public Assignment getQualifiersAssignment_1_0() { return cQualifiersAssignment_1_0; }

		//"derived"
		public Keyword getQualifiersDerivedKeyword_1_0_0() { return cQualifiersDerivedKeyword_1_0_0; }

		//qualifiers+="!derived"
		public Assignment getQualifiersAssignment_1_1() { return cQualifiersAssignment_1_1; }

		//"!derived"
		public Keyword getQualifiersDerivedKeyword_1_1_0() { return cQualifiersDerivedKeyword_1_1_0; }

		//qualifiers+="id"
		public Assignment getQualifiersAssignment_1_2() { return cQualifiersAssignment_1_2; }

		//"id"
		public Keyword getQualifiersIdKeyword_1_2_0() { return cQualifiersIdKeyword_1_2_0; }

		//qualifiers+="!id"
		public Assignment getQualifiersAssignment_1_3() { return cQualifiersAssignment_1_3; }

		//"!id"
		public Keyword getQualifiersIdKeyword_1_3_0() { return cQualifiersIdKeyword_1_3_0; }

		//qualifiers+="ordered"
		public Assignment getQualifiersAssignment_1_4() { return cQualifiersAssignment_1_4; }

		//"ordered"
		public Keyword getQualifiersOrderedKeyword_1_4_0() { return cQualifiersOrderedKeyword_1_4_0; }

		//qualifiers+="!ordered"
		public Assignment getQualifiersAssignment_1_5() { return cQualifiersAssignment_1_5; }

		//"!ordered"
		public Keyword getQualifiersOrderedKeyword_1_5_0() { return cQualifiersOrderedKeyword_1_5_0; }

		//qualifiers+="readonly"
		public Assignment getQualifiersAssignment_1_6() { return cQualifiersAssignment_1_6; }

		//"readonly"
		public Keyword getQualifiersReadonlyKeyword_1_6_0() { return cQualifiersReadonlyKeyword_1_6_0; }

		//qualifiers+="!readonly"
		public Assignment getQualifiersAssignment_1_7() { return cQualifiersAssignment_1_7; }

		//"!readonly"
		public Keyword getQualifiersReadonlyKeyword_1_7_0() { return cQualifiersReadonlyKeyword_1_7_0; }

		//qualifiers+="transient"
		public Assignment getQualifiersAssignment_1_8() { return cQualifiersAssignment_1_8; }

		//"transient"
		public Keyword getQualifiersTransientKeyword_1_8_0() { return cQualifiersTransientKeyword_1_8_0; }

		//qualifiers+="!transient"
		public Assignment getQualifiersAssignment_1_9() { return cQualifiersAssignment_1_9; }

		//"!transient"
		public Keyword getQualifiersTransientKeyword_1_9_0() { return cQualifiersTransientKeyword_1_9_0; }

		//qualifiers+="unique"
		public Assignment getQualifiersAssignment_1_10() { return cQualifiersAssignment_1_10; }

		//"unique"
		public Keyword getQualifiersUniqueKeyword_1_10_0() { return cQualifiersUniqueKeyword_1_10_0; }

		//qualifiers+="!unique"
		public Assignment getQualifiersAssignment_1_11() { return cQualifiersAssignment_1_11; }

		//"!unique"
		public Keyword getQualifiersUniqueKeyword_1_11_0() { return cQualifiersUniqueKeyword_1_11_0; }

		//qualifiers+="unsettable"
		public Assignment getQualifiersAssignment_1_12() { return cQualifiersAssignment_1_12; }

		//"unsettable"
		public Keyword getQualifiersUnsettableKeyword_1_12_0() { return cQualifiersUnsettableKeyword_1_12_0; }

		//qualifiers+="!unsettable"
		public Assignment getQualifiersAssignment_1_13() { return cQualifiersAssignment_1_13; }

		//"!unsettable"
		public Keyword getQualifiersUnsettableKeyword_1_13_0() { return cQualifiersUnsettableKeyword_1_13_0; }

		//qualifiers+="volatile"
		public Assignment getQualifiersAssignment_1_14() { return cQualifiersAssignment_1_14; }

		//"volatile"
		public Keyword getQualifiersVolatileKeyword_1_14_0() { return cQualifiersVolatileKeyword_1_14_0; }

		//qualifiers+="!volatile"
		public Assignment getQualifiersAssignment_1_15() { return cQualifiersAssignment_1_15; }

		//"!volatile"
		public Keyword getQualifiersVolatileKeyword_1_15_0() { return cQualifiersVolatileKeyword_1_15_0; }

		//"attribute"
		public Keyword getAttributeKeyword_2() { return cAttributeKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//(":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
		//"]")?)?
		public Group getGroup_4() { return cGroup_4; }

		//":"
		public Keyword getColonKeyword_4_0() { return cColonKeyword_4_0; }

		//type=TypeRefCS
		public Assignment getTypeAssignment_4_1() { return cTypeAssignment_4_1; }

		//TypeRefCS
		public RuleCall getTypeTypeRefCSParserRuleCall_4_1_0() { return cTypeTypeRefCSParserRuleCall_4_1_0; }

		//("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4_2_0() { return cLeftSquareBracketKeyword_4_2_0; }

		//lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
		public Alternatives getAlternatives_4_2_1() { return cAlternatives_4_2_1; }

		//lower=LOWER (".." upper=UPPER)?
		public Group getGroup_4_2_1_0() { return cGroup_4_2_1_0; }

		//lower=LOWER
		public Assignment getLowerAssignment_4_2_1_0_0() { return cLowerAssignment_4_2_1_0_0; }

		//LOWER
		public RuleCall getLowerLOWERParserRuleCall_4_2_1_0_0_0() { return cLowerLOWERParserRuleCall_4_2_1_0_0_0; }

		//(".." upper=UPPER)?
		public Group getGroup_4_2_1_0_1() { return cGroup_4_2_1_0_1; }

		//".."
		public Keyword getFullStopFullStopKeyword_4_2_1_0_1_0() { return cFullStopFullStopKeyword_4_2_1_0_1_0; }

		//upper=UPPER
		public Assignment getUpperAssignment_4_2_1_0_1_1() { return cUpperAssignment_4_2_1_0_1_1; }

		//UPPER
		public RuleCall getUpperUPPERParserRuleCall_4_2_1_0_1_1_0() { return cUpperUPPERParserRuleCall_4_2_1_0_1_1_0; }

		//multiplicity=( "*" | "+" | "?" )
		public Assignment getMultiplicityAssignment_4_2_1_1() { return cMultiplicityAssignment_4_2_1_1; }

		//"*"|"+"|"?"
		public Alternatives getMultiplicityAlternatives_4_2_1_1_0() { return cMultiplicityAlternatives_4_2_1_1_0; }

		//"*"
		public Keyword getMultiplicityAsteriskKeyword_4_2_1_1_0_0() { return cMultiplicityAsteriskKeyword_4_2_1_1_0_0; }

		//"+"
		public Keyword getMultiplicityPlusSignKeyword_4_2_1_1_0_1() { return cMultiplicityPlusSignKeyword_4_2_1_1_0_1; }

		//"?"
		public Keyword getMultiplicityQuestionMarkKeyword_4_2_1_1_0_2() { return cMultiplicityQuestionMarkKeyword_4_2_1_1_0_2; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4_2_2() { return cRightSquareBracketKeyword_4_2_2; }

		//("=" defaultValueLiteral=URL)?
		public Group getGroup_5() { return cGroup_5; }

		//"="
		public Keyword getEqualsSignKeyword_5_0() { return cEqualsSignKeyword_5_0; }

		//defaultValueLiteral=URL
		public Assignment getDefaultValueLiteralAssignment_5_1() { return cDefaultValueLiteralAssignment_5_1; }

		//URL
		public RuleCall getDefaultValueLiteralURLTerminalRuleCall_5_1_0() { return cDefaultValueLiteralURLTerminalRuleCall_5_1_0; }

		//"{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";"
		public Alternatives getAlternatives_6() { return cAlternatives_6; }

		//"{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"
		public Group getGroup_6_0() { return cGroup_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_0_0() { return cLeftCurlyBracketKeyword_6_0_0; }

		//constraints+=( InitialConstraintCS | DerivedConstraintCS )*
		public Assignment getConstraintsAssignment_6_0_1() { return cConstraintsAssignment_6_0_1; }

		//InitialConstraintCS|DerivedConstraintCS
		public Alternatives getConstraintsAlternatives_6_0_1_0() { return cConstraintsAlternatives_6_0_1_0; }

		//InitialConstraintCS
		public RuleCall getConstraintsInitialConstraintCSParserRuleCall_6_0_1_0_0() { return cConstraintsInitialConstraintCSParserRuleCall_6_0_1_0_0; }

		//DerivedConstraintCS
		public RuleCall getConstraintsDerivedConstraintCSParserRuleCall_6_0_1_0_1() { return cConstraintsDerivedConstraintCSParserRuleCall_6_0_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_0_2() { return cRightCurlyBracketKeyword_6_0_2; }

		//";"
		public Keyword getSemicolonKeyword_6_1() { return cSemicolonKeyword_6_1; }
	}

	public class ClassCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cQualifiersAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cQualifiersAbstractKeyword_1_0_0 = (Keyword)cQualifiersAssignment_1_0.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cQualifiersAbstractKeyword_1_1_0 = (Keyword)cQualifiersAssignment_1_1.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final Keyword cQualifiersInterfaceKeyword_1_2_0 = (Keyword)cQualifiersAssignment_1_2.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final Keyword cQualifiersInterfaceKeyword_1_3_0 = (Keyword)cQualifiersAssignment_1_3.eContents().get(0);
		private final Keyword cClassKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLessThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeParametersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_4_1_0 = (RuleCall)cTypeParametersAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cTypeParametersAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_4_2_1_0 = (RuleCall)cTypeParametersAssignment_4_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cExtendsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSuperTypesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSuperTypesTypeRefCSParserRuleCall_5_1_0 = (RuleCall)cSuperTypesAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cSuperTypesAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cSuperTypesTypeRefCSParserRuleCall_5_2_1_0 = (RuleCall)cSuperTypesAssignment_5_2_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cInstanceClassNameAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cInstanceClassNameFQNParserRuleCall_6_1_0 = (RuleCall)cInstanceClassNameAssignment_6_1.eContents().get(0);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Alternatives cAlternatives_7_0_1 = (Alternatives)cGroup_7_0.eContents().get(1);
		private final Assignment cOperationsAssignment_7_0_1_0 = (Assignment)cAlternatives_7_0_1.eContents().get(0);
		private final RuleCall cOperationsOperationCSParserRuleCall_7_0_1_0_0 = (RuleCall)cOperationsAssignment_7_0_1_0.eContents().get(0);
		private final Assignment cStructuralFeaturesAssignment_7_0_1_1 = (Assignment)cAlternatives_7_0_1.eContents().get(1);
		private final RuleCall cStructuralFeaturesStructuralFeatureCSParserRuleCall_7_0_1_1_0 = (RuleCall)cStructuralFeaturesAssignment_7_0_1_1.eContents().get(0);
		private final Assignment cConstraintsAssignment_7_0_1_2 = (Assignment)cAlternatives_7_0_1.eContents().get(2);
		private final RuleCall cConstraintsInvariantConstraintCSParserRuleCall_7_0_1_2_0 = (RuleCall)cConstraintsAssignment_7_0_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_0_2 = (Keyword)cGroup_7_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_7_1 = (Keyword)cAlternatives_7.eContents().get(1);
		
		//ClassCS:
		//  annotations+=AnnotationCS* (qualifiers+="abstract"|qualifiers+="!abstract"|
		//  qualifiers+="interface"|qualifiers+="!interface")* "class" name=ID ("<"
		//  typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")? (
		//  "extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)? (":" instanceClassName
		//  =FQN)? ("{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|
		//  constraints+=InvariantConstraintCS)* "}"|";");
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* (qualifiers+="abstract"|qualifiers+="!abstract"|
		//qualifiers+="interface"|qualifiers+="!interface")* "class" name=ID ("<"
		//typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")? (
		//"extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)? (":" instanceClassName
		//=FQN)? ("{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|
		//constraints+=InvariantConstraintCS)* "}"|";")
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//(qualifiers+="abstract"|qualifiers+="!abstract"|qualifiers+="interface"|
		//qualifiers+="!interface")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiers+="abstract"
		public Assignment getQualifiersAssignment_1_0() { return cQualifiersAssignment_1_0; }

		//"abstract"
		public Keyword getQualifiersAbstractKeyword_1_0_0() { return cQualifiersAbstractKeyword_1_0_0; }

		//qualifiers+="!abstract"
		public Assignment getQualifiersAssignment_1_1() { return cQualifiersAssignment_1_1; }

		//"!abstract"
		public Keyword getQualifiersAbstractKeyword_1_1_0() { return cQualifiersAbstractKeyword_1_1_0; }

		//qualifiers+="interface"
		public Assignment getQualifiersAssignment_1_2() { return cQualifiersAssignment_1_2; }

		//"interface"
		public Keyword getQualifiersInterfaceKeyword_1_2_0() { return cQualifiersInterfaceKeyword_1_2_0; }

		//qualifiers+="!interface"
		public Assignment getQualifiersAssignment_1_3() { return cQualifiersAssignment_1_3; }

		//"!interface"
		public Keyword getQualifiersInterfaceKeyword_1_3_0() { return cQualifiersInterfaceKeyword_1_3_0; }

		//"class"
		public Keyword getClassKeyword_2() { return cClassKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
		public Group getGroup_4() { return cGroup_4; }

		//"<"
		public Keyword getLessThanSignKeyword_4_0() { return cLessThanSignKeyword_4_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_4_1() { return cTypeParametersAssignment_4_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_4_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_4_1_0; }

		//("," typeParameters+=TypeParameterCS)*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_4_2_1() { return cTypeParametersAssignment_4_2_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_4_2_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_4_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_4_3() { return cGreaterThanSignKeyword_4_3; }

		//("extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)?
		public Group getGroup_5() { return cGroup_5; }

		//"extends"
		public Keyword getExtendsKeyword_5_0() { return cExtendsKeyword_5_0; }

		//superTypes+=TypeRefCS
		public Assignment getSuperTypesAssignment_5_1() { return cSuperTypesAssignment_5_1; }

		//TypeRefCS
		public RuleCall getSuperTypesTypeRefCSParserRuleCall_5_1_0() { return cSuperTypesTypeRefCSParserRuleCall_5_1_0; }

		//("," superTypes+=TypeRefCS)*
		public Group getGroup_5_2() { return cGroup_5_2; }

		//","
		public Keyword getCommaKeyword_5_2_0() { return cCommaKeyword_5_2_0; }

		//superTypes+=TypeRefCS
		public Assignment getSuperTypesAssignment_5_2_1() { return cSuperTypesAssignment_5_2_1; }

		//TypeRefCS
		public RuleCall getSuperTypesTypeRefCSParserRuleCall_5_2_1_0() { return cSuperTypesTypeRefCSParserRuleCall_5_2_1_0; }

		//(":" instanceClassName=FQN)?
		public Group getGroup_6() { return cGroup_6; }

		//":"
		public Keyword getColonKeyword_6_0() { return cColonKeyword_6_0; }

		//instanceClassName=FQN
		public Assignment getInstanceClassNameAssignment_6_1() { return cInstanceClassNameAssignment_6_1; }

		//FQN
		public RuleCall getInstanceClassNameFQNParserRuleCall_6_1_0() { return cInstanceClassNameFQNParserRuleCall_6_1_0; }

		//"{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|constraints
		//+=InvariantConstraintCS)* "}"|";"
		public Alternatives getAlternatives_7() { return cAlternatives_7; }

		//"{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|constraints
		//+=InvariantConstraintCS)* "}"
		public Group getGroup_7_0() { return cGroup_7_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7_0_0() { return cLeftCurlyBracketKeyword_7_0_0; }

		//(operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|constraints+=
		//InvariantConstraintCS)*
		public Alternatives getAlternatives_7_0_1() { return cAlternatives_7_0_1; }

		//operations+=OperationCS
		public Assignment getOperationsAssignment_7_0_1_0() { return cOperationsAssignment_7_0_1_0; }

		//OperationCS
		public RuleCall getOperationsOperationCSParserRuleCall_7_0_1_0_0() { return cOperationsOperationCSParserRuleCall_7_0_1_0_0; }

		//structuralFeatures+=StructuralFeatureCS
		public Assignment getStructuralFeaturesAssignment_7_0_1_1() { return cStructuralFeaturesAssignment_7_0_1_1; }

		//StructuralFeatureCS
		public RuleCall getStructuralFeaturesStructuralFeatureCSParserRuleCall_7_0_1_1_0() { return cStructuralFeaturesStructuralFeatureCSParserRuleCall_7_0_1_1_0; }

		//constraints+=InvariantConstraintCS
		public Assignment getConstraintsAssignment_7_0_1_2() { return cConstraintsAssignment_7_0_1_2; }

		//InvariantConstraintCS
		public RuleCall getConstraintsInvariantConstraintCSParserRuleCall_7_0_1_2_0() { return cConstraintsInvariantConstraintCSParserRuleCall_7_0_1_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7_0_2() { return cRightCurlyBracketKeyword_7_0_2; }

		//";"
		public Keyword getSemicolonKeyword_7_1() { return cSemicolonKeyword_7_1; }
	}

	public class ClassRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassCSRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEClassRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ClassRef:
		//  ClassCSRef|EClassRef;
		public ParserRule getRule() { return rule; }

		//ClassCSRef|EClassRef
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClassCSRef
		public RuleCall getClassCSRefParserRuleCall_0() { return cClassCSRefParserRuleCall_0; }

		//EClassRef
		public RuleCall getEClassRefParserRuleCall_1() { return cEClassRefParserRuleCall_1; }
	}

	public class ClassCSRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassCSRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefClassCSCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefClassCSIDTerminalRuleCall_0_1 = (RuleCall)cRefClassCSCrossReference_0.eContents().get(1);
		
		//ClassCSRef:
		//  ref=[ClassCS];
		public ParserRule getRule() { return rule; }

		//ref=[ClassCS]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[ClassCS]
		public CrossReference getRefClassCSCrossReference_0() { return cRefClassCSCrossReference_0; }

		//ID
		public RuleCall getRefClassCSIDTerminalRuleCall_0_1() { return cRefClassCSIDTerminalRuleCall_0_1; }
	}

	public class ClassifierCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassifierCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDataTypeCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumCSParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ClassifierCS:
		//  ClassCS|DataTypeCS|EnumCS;
		public ParserRule getRule() { return rule; }

		//ClassCS|DataTypeCS|EnumCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//ClassCS
		public RuleCall getClassCSParserRuleCall_0() { return cClassCSParserRuleCall_0; }

		//DataTypeCS
		public RuleCall getDataTypeCSParserRuleCall_1() { return cDataTypeCSParserRuleCall_1; }

		//EnumCS
		public RuleCall getEnumCSParserRuleCall_2() { return cEnumCSParserRuleCall_2; }
	}

	public class DataTypeCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cQualifiersAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cQualifiersTransientKeyword_1_0_0 = (Keyword)cQualifiersAssignment_1_0.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cQualifiersTransientKeyword_1_1_0 = (Keyword)cQualifiersAssignment_1_1.eContents().get(0);
		private final Keyword cDatatypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLessThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeParametersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_4_1_0 = (RuleCall)cTypeParametersAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cTypeParametersAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_4_2_1_0 = (RuleCall)cTypeParametersAssignment_4_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cInstanceClassNameAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cInstanceClassNameFQNParserRuleCall_5_1_0 = (RuleCall)cInstanceClassNameAssignment_5_1.eContents().get(0);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cAlternatives_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cConstraintsAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final RuleCall cConstraintsInvariantConstraintCSParserRuleCall_6_0_1_0 = (RuleCall)cConstraintsAssignment_6_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_0_2 = (Keyword)cGroup_6_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_6_1 = (Keyword)cAlternatives_6.eContents().get(1);
		
		//DataTypeCS:
		//  annotations+=AnnotationCS* (qualifiers+="transient"|qualifiers+="!transient")*
		//  "datatype" name=ID ("<" typeParameters+=TypeParameterCS ("," typeParameters+=
		//  TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" constraints+=
		//  InvariantConstraintCS* "}"|";");
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* (qualifiers+="transient"|qualifiers+="!transient")*
		//"datatype" name=ID ("<" typeParameters+=TypeParameterCS ("," typeParameters+=
		//TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" constraints+=
		//InvariantConstraintCS* "}"|";")
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//(qualifiers+="transient"|qualifiers+="!transient")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiers+="transient"
		public Assignment getQualifiersAssignment_1_0() { return cQualifiersAssignment_1_0; }

		//"transient"
		public Keyword getQualifiersTransientKeyword_1_0_0() { return cQualifiersTransientKeyword_1_0_0; }

		//qualifiers+="!transient"
		public Assignment getQualifiersAssignment_1_1() { return cQualifiersAssignment_1_1; }

		//"!transient"
		public Keyword getQualifiersTransientKeyword_1_1_0() { return cQualifiersTransientKeyword_1_1_0; }

		//"datatype"
		public Keyword getDatatypeKeyword_2() { return cDatatypeKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
		public Group getGroup_4() { return cGroup_4; }

		//"<"
		public Keyword getLessThanSignKeyword_4_0() { return cLessThanSignKeyword_4_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_4_1() { return cTypeParametersAssignment_4_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_4_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_4_1_0; }

		//("," typeParameters+=TypeParameterCS)*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_4_2_1() { return cTypeParametersAssignment_4_2_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_4_2_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_4_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_4_3() { return cGreaterThanSignKeyword_4_3; }

		//(":" instanceClassName=FQN)?
		public Group getGroup_5() { return cGroup_5; }

		//":"
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//instanceClassName=FQN
		public Assignment getInstanceClassNameAssignment_5_1() { return cInstanceClassNameAssignment_5_1; }

		//FQN
		public RuleCall getInstanceClassNameFQNParserRuleCall_5_1_0() { return cInstanceClassNameFQNParserRuleCall_5_1_0; }

		//"{" constraints+=InvariantConstraintCS* "}"|";"
		public Alternatives getAlternatives_6() { return cAlternatives_6; }

		//"{" constraints+=InvariantConstraintCS* "}"
		public Group getGroup_6_0() { return cGroup_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_0_0() { return cLeftCurlyBracketKeyword_6_0_0; }

		//constraints+=InvariantConstraintCS*
		public Assignment getConstraintsAssignment_6_0_1() { return cConstraintsAssignment_6_0_1; }

		//InvariantConstraintCS
		public RuleCall getConstraintsInvariantConstraintCSParserRuleCall_6_0_1_0() { return cConstraintsInvariantConstraintCSParserRuleCall_6_0_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_0_2() { return cRightCurlyBracketKeyword_6_0_2; }

		//";"
		public Keyword getSemicolonKeyword_6_1() { return cSemicolonKeyword_6_1; }
	}

	public class DataTypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeCSRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEDataTypeRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DataTypeRef:
		//  DataTypeCSRef|EDataTypeRef;
		public ParserRule getRule() { return rule; }

		//DataTypeCSRef|EDataTypeRef
		public Alternatives getAlternatives() { return cAlternatives; }

		//DataTypeCSRef
		public RuleCall getDataTypeCSRefParserRuleCall_0() { return cDataTypeCSRefParserRuleCall_0; }

		//EDataTypeRef
		public RuleCall getEDataTypeRefParserRuleCall_1() { return cEDataTypeRefParserRuleCall_1; }
	}

	public class DataTypeCSRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypeCSRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefDataTypeOrEnumCSCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefDataTypeOrEnumCSIDTerminalRuleCall_0_1 = (RuleCall)cRefDataTypeOrEnumCSCrossReference_0.eContents().get(1);
		
		//DataTypeCSRef:
		//  ref=[DataTypeOrEnumCS];
		public ParserRule getRule() { return rule; }

		//ref=[DataTypeOrEnumCS]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[DataTypeOrEnumCS]
		public CrossReference getRefDataTypeOrEnumCSCrossReference_0() { return cRefDataTypeOrEnumCSCrossReference_0; }

		//ID
		public RuleCall getRefDataTypeOrEnumCSIDTerminalRuleCall_0_1() { return cRefDataTypeOrEnumCSIDTerminalRuleCall_0_1; }
	}

	public class DetailCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DetailCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cIdNameAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cIdNameIDTerminalRuleCall_0_0_0 = (RuleCall)cIdNameAssignment_0_0.eContents().get(0);
		private final Assignment cStringNameAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cStringNameURLTerminalRuleCall_0_1_0 = (RuleCall)cStringNameAssignment_0_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRING_LITERALTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//DetailCS:
		//  (idName=ID|stringName=URL) "=" value=STRING_LITERAL;
		public ParserRule getRule() { return rule; }

		//(idName=ID|stringName=URL) "=" value=STRING_LITERAL
		public Group getGroup() { return cGroup; }

		//idName=ID|stringName=URL
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//idName=ID
		public Assignment getIdNameAssignment_0_0() { return cIdNameAssignment_0_0; }

		//ID
		public RuleCall getIdNameIDTerminalRuleCall_0_0_0() { return cIdNameIDTerminalRuleCall_0_0_0; }

		//stringName=URL
		public Assignment getStringNameAssignment_0_1() { return cStringNameAssignment_0_1; }

		//URL
		public RuleCall getStringNameURLTerminalRuleCall_0_1_0() { return cStringNameURLTerminalRuleCall_0_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=STRING_LITERAL
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING_LITERAL
		public RuleCall getValueSTRING_LITERALTerminalRuleCall_2_0() { return cValueSTRING_LITERALTerminalRuleCall_2_0; }
	}

	public class EClassifierCSRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EClassifierCSRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModelNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModelNameIDTerminalRuleCall_0_0 = (RuleCall)cModelNameAssignment_0.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRefEClassifierCrossReference_2_0 = (CrossReference)cRefAssignment_2.eContents().get(0);
		private final RuleCall cRefEClassifierIDTerminalRuleCall_2_0_1 = (RuleCall)cRefEClassifierCrossReference_2_0.eContents().get(1);
		
		//EClassifierCSRef:
		//  modelName=ID "::" ref=[ecore::EClassifier];
		public ParserRule getRule() { return rule; }

		//modelName=ID "::" ref=[ecore::EClassifier]
		public Group getGroup() { return cGroup; }

		//modelName=ID
		public Assignment getModelNameAssignment_0() { return cModelNameAssignment_0; }

		//ID
		public RuleCall getModelNameIDTerminalRuleCall_0_0() { return cModelNameIDTerminalRuleCall_0_0; }

		//"::"
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }

		//ref=[ecore::EClassifier]
		public Assignment getRefAssignment_2() { return cRefAssignment_2; }

		//[ecore::EClassifier]
		public CrossReference getRefEClassifierCrossReference_2_0() { return cRefEClassifierCrossReference_2_0; }

		//ID
		public RuleCall getRefEClassifierIDTerminalRuleCall_2_0_1() { return cRefEClassifierIDTerminalRuleCall_2_0_1; }
	}

	public class EnumCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLessThanSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTypeParametersAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_3_1_0 = (RuleCall)cTypeParametersAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cTypeParametersAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_3_2_1_0 = (RuleCall)cTypeParametersAssignment_3_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInstanceClassNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cInstanceClassNameFQNParserRuleCall_4_1_0 = (RuleCall)cInstanceClassNameAssignment_4_1.eContents().get(0);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Alternatives cAlternatives_5_0_1 = (Alternatives)cGroup_5_0.eContents().get(1);
		private final Assignment cLiteralsAssignment_5_0_1_0 = (Assignment)cAlternatives_5_0_1.eContents().get(0);
		private final RuleCall cLiteralsEnumLiteralCSParserRuleCall_5_0_1_0_0 = (RuleCall)cLiteralsAssignment_5_0_1_0.eContents().get(0);
		private final Assignment cConstraintsAssignment_5_0_1_1 = (Assignment)cAlternatives_5_0_1.eContents().get(1);
		private final RuleCall cConstraintsInvariantConstraintCSParserRuleCall_5_0_1_1_0 = (RuleCall)cConstraintsAssignment_5_0_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_5_1 = (Keyword)cAlternatives_5.eContents().get(1);
		
		//EnumCS:
		//  annotations+=AnnotationCS* "enum" name=ID ("<" typeParameters+=TypeParameterCS (","
		//  typeParameters+=TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" (literals+=
		//  EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";");
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* "enum" name=ID ("<" typeParameters+=TypeParameterCS (","
		//typeParameters+=TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" (literals+=
		//EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";")
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
		public Group getGroup_3() { return cGroup_3; }

		//"<"
		public Keyword getLessThanSignKeyword_3_0() { return cLessThanSignKeyword_3_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_3_1() { return cTypeParametersAssignment_3_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_3_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_3_1_0; }

		//("," typeParameters+=TypeParameterCS)*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_3_2_1() { return cTypeParametersAssignment_3_2_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_3_2_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_3_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_3_3() { return cGreaterThanSignKeyword_3_3; }

		//(":" instanceClassName=FQN)?
		public Group getGroup_4() { return cGroup_4; }

		//":"
		public Keyword getColonKeyword_4_0() { return cColonKeyword_4_0; }

		//instanceClassName=FQN
		public Assignment getInstanceClassNameAssignment_4_1() { return cInstanceClassNameAssignment_4_1; }

		//FQN
		public RuleCall getInstanceClassNameFQNParserRuleCall_4_1_0() { return cInstanceClassNameFQNParserRuleCall_4_1_0; }

		//"{" (literals+=EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";"
		public Alternatives getAlternatives_5() { return cAlternatives_5; }

		//"{" (literals+=EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"
		public Group getGroup_5_0() { return cGroup_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_0_0() { return cLeftCurlyBracketKeyword_5_0_0; }

		//(literals+=EnumLiteralCS|constraints+=InvariantConstraintCS)*
		public Alternatives getAlternatives_5_0_1() { return cAlternatives_5_0_1; }

		//literals+=EnumLiteralCS
		public Assignment getLiteralsAssignment_5_0_1_0() { return cLiteralsAssignment_5_0_1_0; }

		//EnumLiteralCS
		public RuleCall getLiteralsEnumLiteralCSParserRuleCall_5_0_1_0_0() { return cLiteralsEnumLiteralCSParserRuleCall_5_0_1_0_0; }

		//constraints+=InvariantConstraintCS
		public Assignment getConstraintsAssignment_5_0_1_1() { return cConstraintsAssignment_5_0_1_1; }

		//InvariantConstraintCS
		public RuleCall getConstraintsInvariantConstraintCSParserRuleCall_5_0_1_1_0() { return cConstraintsInvariantConstraintCSParserRuleCall_5_0_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_0_2() { return cRightCurlyBracketKeyword_5_0_2; }

		//";"
		public Keyword getSemicolonKeyword_5_1() { return cSemicolonKeyword_5_1; }
	}

	public class EnumLiteralCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumLiteralCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueINTEGERParserRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EnumLiteralCS:
		//  annotations+=AnnotationCS* name=ID ("=" value=INTEGER)? ";";
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* name=ID ("=" value=INTEGER)? ";"
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("=" value=INTEGER)?
		public Group getGroup_2() { return cGroup_2; }

		//"="
		public Keyword getEqualsSignKeyword_2_0() { return cEqualsSignKeyword_2_0; }

		//value=INTEGER
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_2_1_0() { return cValueINTEGERParserRuleCall_2_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ImportCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ImportCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cAliasAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cAliasIDTerminalRuleCall_1_0_0 = (RuleCall)cAliasAssignment_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cEPackageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEPackageEPackageCrossReference_2_0 = (CrossReference)cEPackageAssignment_2.eContents().get(0);
		private final RuleCall cEPackageEPackageURLTerminalRuleCall_2_0_1 = (RuleCall)cEPackageEPackageCrossReference_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ImportCS:
		//  "import" (alias=ID "=") ePackage=[ecore::EPackage|URL] ";";
		public ParserRule getRule() { return rule; }

		//"import" (alias=ID "=") ePackage=[ecore::EPackage|URL] ";"
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//alias=ID "="
		public Group getGroup_1() { return cGroup_1; }

		//alias=ID
		public Assignment getAliasAssignment_1_0() { return cAliasAssignment_1_0; }

		//ID
		public RuleCall getAliasIDTerminalRuleCall_1_0_0() { return cAliasIDTerminalRuleCall_1_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }

		//ePackage=[ecore::EPackage|URL]
		public Assignment getEPackageAssignment_2() { return cEPackageAssignment_2; }

		//[ecore::EPackage|URL]
		public CrossReference getEPackageEPackageCrossReference_2_0() { return cEPackageEPackageCrossReference_2_0; }

		//URL
		public RuleCall getEPackageEPackageURLTerminalRuleCall_2_0_1() { return cEPackageEPackageURLTerminalRuleCall_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class OperationCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OperationCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cQualifiersAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cQualifiersDerivedKeyword_1_0_0 = (Keyword)cQualifiersAssignment_1_0.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cQualifiersDerivedKeyword_1_1_0 = (Keyword)cQualifiersAssignment_1_1.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final Keyword cQualifiersOrderedKeyword_1_2_0 = (Keyword)cQualifiersAssignment_1_2.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final Keyword cQualifiersOrderedKeyword_1_3_0 = (Keyword)cQualifiersAssignment_1_3.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_4 = (Assignment)cAlternatives_1.eContents().get(4);
		private final Keyword cQualifiersUniqueKeyword_1_4_0 = (Keyword)cQualifiersAssignment_1_4.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_5 = (Assignment)cAlternatives_1.eContents().get(5);
		private final Keyword cQualifiersUniqueKeyword_1_5_0 = (Keyword)cQualifiersAssignment_1_5.eContents().get(0);
		private final Keyword cOperationKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLessThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeParametersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_4_1_0 = (RuleCall)cTypeParametersAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cTypeParametersAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cTypeParametersTypeParameterCSParserRuleCall_4_2_1_0 = (RuleCall)cTypeParametersAssignment_4_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cParametersAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final RuleCall cParametersParameterCSParserRuleCall_6_0_0 = (RuleCall)cParametersAssignment_6_0.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Keyword cCommaKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cParametersAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cParametersParameterCSParserRuleCall_6_1_1_0 = (RuleCall)cParametersAssignment_6_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cColonKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cTypeAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cTypeTypeRefCSParserRuleCall_8_1_0 = (RuleCall)cTypeAssignment_8_1.eContents().get(0);
		private final Group cGroup_8_2 = (Group)cGroup_8.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_8_2_0 = (Keyword)cGroup_8_2.eContents().get(0);
		private final Alternatives cAlternatives_8_2_1 = (Alternatives)cGroup_8_2.eContents().get(1);
		private final Group cGroup_8_2_1_0 = (Group)cAlternatives_8_2_1.eContents().get(0);
		private final Assignment cLowerAssignment_8_2_1_0_0 = (Assignment)cGroup_8_2_1_0.eContents().get(0);
		private final RuleCall cLowerLOWERParserRuleCall_8_2_1_0_0_0 = (RuleCall)cLowerAssignment_8_2_1_0_0.eContents().get(0);
		private final Group cGroup_8_2_1_0_1 = (Group)cGroup_8_2_1_0.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_8_2_1_0_1_0 = (Keyword)cGroup_8_2_1_0_1.eContents().get(0);
		private final Assignment cUpperAssignment_8_2_1_0_1_1 = (Assignment)cGroup_8_2_1_0_1.eContents().get(1);
		private final RuleCall cUpperUPPERParserRuleCall_8_2_1_0_1_1_0 = (RuleCall)cUpperAssignment_8_2_1_0_1_1.eContents().get(0);
		private final Assignment cMultiplicityAssignment_8_2_1_1 = (Assignment)cAlternatives_8_2_1.eContents().get(1);
		private final Alternatives cMultiplicityAlternatives_8_2_1_1_0 = (Alternatives)cMultiplicityAssignment_8_2_1_1.eContents().get(0);
		private final Keyword cMultiplicityAsteriskKeyword_8_2_1_1_0_0 = (Keyword)cMultiplicityAlternatives_8_2_1_1_0.eContents().get(0);
		private final Keyword cMultiplicityPlusSignKeyword_8_2_1_1_0_1 = (Keyword)cMultiplicityAlternatives_8_2_1_1_0.eContents().get(1);
		private final Keyword cMultiplicityQuestionMarkKeyword_8_2_1_1_0_2 = (Keyword)cMultiplicityAlternatives_8_2_1_1_0.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_8_2_2 = (Keyword)cGroup_8_2.eContents().get(2);
		private final Alternatives cAlternatives_9 = (Alternatives)cGroup.eContents().get(9);
		private final Group cGroup_9_0 = (Group)cAlternatives_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_9_0_0 = (Keyword)cGroup_9_0.eContents().get(0);
		private final Assignment cConstraintsAssignment_9_0_1 = (Assignment)cGroup_9_0.eContents().get(1);
		private final Alternatives cConstraintsAlternatives_9_0_1_0 = (Alternatives)cConstraintsAssignment_9_0_1.eContents().get(0);
		private final RuleCall cConstraintsPreconditionConstraintCSParserRuleCall_9_0_1_0_0 = (RuleCall)cConstraintsAlternatives_9_0_1_0.eContents().get(0);
		private final RuleCall cConstraintsBodyConstraintCSParserRuleCall_9_0_1_0_1 = (RuleCall)cConstraintsAlternatives_9_0_1_0.eContents().get(1);
		private final RuleCall cConstraintsPostconditionConstraintCSParserRuleCall_9_0_1_0_2 = (RuleCall)cConstraintsAlternatives_9_0_1_0.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_9_0_2 = (Keyword)cGroup_9_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_9_1 = (Keyword)cAlternatives_9.eContents().get(1);
		
		//OperationCS:
		//  annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
		//  qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
		//  "!unique")* "operation" name=ID ("<" typeParameters+=TypeParameterCS (","
		//  typeParameters+=TypeParameterCS)* ">")? "(" (parameters+=ParameterCS ("," parameters
		//  +=ParameterCS)*)? ")" (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|
		//  multiplicity=( "*" | "+" | "?" )) "]")?)? ("{" constraints+=( PreconditionConstraintCS |
		//  BodyConstraintCS | PostconditionConstraintCS )* "}"|";");
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
		//qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
		//"!unique")* "operation" name=ID ("<" typeParameters+=TypeParameterCS (","
		//typeParameters+=TypeParameterCS)* ">")? "(" (parameters+=ParameterCS ("," parameters
		//+=ParameterCS)*)? ")" (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|
		//multiplicity=( "*" | "+" | "?" )) "]")?)? ("{" constraints+=( PreconditionConstraintCS |
		//BodyConstraintCS | PostconditionConstraintCS )* "}"|";")
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//(qualifiers+="derived"|qualifiers+="!derived"|qualifiers+="ordered"|qualifiers+=
		//"!ordered"|qualifiers+="unique"|qualifiers+="!unique")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiers+="derived"
		public Assignment getQualifiersAssignment_1_0() { return cQualifiersAssignment_1_0; }

		//"derived"
		public Keyword getQualifiersDerivedKeyword_1_0_0() { return cQualifiersDerivedKeyword_1_0_0; }

		//qualifiers+="!derived"
		public Assignment getQualifiersAssignment_1_1() { return cQualifiersAssignment_1_1; }

		//"!derived"
		public Keyword getQualifiersDerivedKeyword_1_1_0() { return cQualifiersDerivedKeyword_1_1_0; }

		//qualifiers+="ordered"
		public Assignment getQualifiersAssignment_1_2() { return cQualifiersAssignment_1_2; }

		//"ordered"
		public Keyword getQualifiersOrderedKeyword_1_2_0() { return cQualifiersOrderedKeyword_1_2_0; }

		//qualifiers+="!ordered"
		public Assignment getQualifiersAssignment_1_3() { return cQualifiersAssignment_1_3; }

		//"!ordered"
		public Keyword getQualifiersOrderedKeyword_1_3_0() { return cQualifiersOrderedKeyword_1_3_0; }

		//qualifiers+="unique"
		public Assignment getQualifiersAssignment_1_4() { return cQualifiersAssignment_1_4; }

		//"unique"
		public Keyword getQualifiersUniqueKeyword_1_4_0() { return cQualifiersUniqueKeyword_1_4_0; }

		//qualifiers+="!unique"
		public Assignment getQualifiersAssignment_1_5() { return cQualifiersAssignment_1_5; }

		//"!unique"
		public Keyword getQualifiersUniqueKeyword_1_5_0() { return cQualifiersUniqueKeyword_1_5_0; }

		//"operation"
		public Keyword getOperationKeyword_2() { return cOperationKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("<" typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")?
		public Group getGroup_4() { return cGroup_4; }

		//"<"
		public Keyword getLessThanSignKeyword_4_0() { return cLessThanSignKeyword_4_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_4_1() { return cTypeParametersAssignment_4_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_4_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_4_1_0; }

		//("," typeParameters+=TypeParameterCS)*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//typeParameters+=TypeParameterCS
		public Assignment getTypeParametersAssignment_4_2_1() { return cTypeParametersAssignment_4_2_1; }

		//TypeParameterCS
		public RuleCall getTypeParametersTypeParameterCSParserRuleCall_4_2_1_0() { return cTypeParametersTypeParameterCSParserRuleCall_4_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_4_3() { return cGreaterThanSignKeyword_4_3; }

		//"("
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }

		//(parameters+=ParameterCS ("," parameters+=ParameterCS)*)?
		public Group getGroup_6() { return cGroup_6; }

		//parameters+=ParameterCS
		public Assignment getParametersAssignment_6_0() { return cParametersAssignment_6_0; }

		//ParameterCS
		public RuleCall getParametersParameterCSParserRuleCall_6_0_0() { return cParametersParameterCSParserRuleCall_6_0_0; }

		//("," parameters+=ParameterCS)*
		public Group getGroup_6_1() { return cGroup_6_1; }

		//","
		public Keyword getCommaKeyword_6_1_0() { return cCommaKeyword_6_1_0; }

		//parameters+=ParameterCS
		public Assignment getParametersAssignment_6_1_1() { return cParametersAssignment_6_1_1; }

		//ParameterCS
		public RuleCall getParametersParameterCSParserRuleCall_6_1_1_0() { return cParametersParameterCSParserRuleCall_6_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }

		//(":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
		//"]")?)?
		public Group getGroup_8() { return cGroup_8; }

		//":"
		public Keyword getColonKeyword_8_0() { return cColonKeyword_8_0; }

		//type=TypeRefCS
		public Assignment getTypeAssignment_8_1() { return cTypeAssignment_8_1; }

		//TypeRefCS
		public RuleCall getTypeTypeRefCSParserRuleCall_8_1_0() { return cTypeTypeRefCSParserRuleCall_8_1_0; }

		//("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
		public Group getGroup_8_2() { return cGroup_8_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_8_2_0() { return cLeftSquareBracketKeyword_8_2_0; }

		//lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
		public Alternatives getAlternatives_8_2_1() { return cAlternatives_8_2_1; }

		//lower=LOWER (".." upper=UPPER)?
		public Group getGroup_8_2_1_0() { return cGroup_8_2_1_0; }

		//lower=LOWER
		public Assignment getLowerAssignment_8_2_1_0_0() { return cLowerAssignment_8_2_1_0_0; }

		//LOWER
		public RuleCall getLowerLOWERParserRuleCall_8_2_1_0_0_0() { return cLowerLOWERParserRuleCall_8_2_1_0_0_0; }

		//(".." upper=UPPER)?
		public Group getGroup_8_2_1_0_1() { return cGroup_8_2_1_0_1; }

		//".."
		public Keyword getFullStopFullStopKeyword_8_2_1_0_1_0() { return cFullStopFullStopKeyword_8_2_1_0_1_0; }

		//upper=UPPER
		public Assignment getUpperAssignment_8_2_1_0_1_1() { return cUpperAssignment_8_2_1_0_1_1; }

		//UPPER
		public RuleCall getUpperUPPERParserRuleCall_8_2_1_0_1_1_0() { return cUpperUPPERParserRuleCall_8_2_1_0_1_1_0; }

		//multiplicity=( "*" | "+" | "?" )
		public Assignment getMultiplicityAssignment_8_2_1_1() { return cMultiplicityAssignment_8_2_1_1; }

		//"*"|"+"|"?"
		public Alternatives getMultiplicityAlternatives_8_2_1_1_0() { return cMultiplicityAlternatives_8_2_1_1_0; }

		//"*"
		public Keyword getMultiplicityAsteriskKeyword_8_2_1_1_0_0() { return cMultiplicityAsteriskKeyword_8_2_1_1_0_0; }

		//"+"
		public Keyword getMultiplicityPlusSignKeyword_8_2_1_1_0_1() { return cMultiplicityPlusSignKeyword_8_2_1_1_0_1; }

		//"?"
		public Keyword getMultiplicityQuestionMarkKeyword_8_2_1_1_0_2() { return cMultiplicityQuestionMarkKeyword_8_2_1_1_0_2; }

		//"]"
		public Keyword getRightSquareBracketKeyword_8_2_2() { return cRightSquareBracketKeyword_8_2_2; }

		//"{" constraints+=( PreconditionConstraintCS | BodyConstraintCS |
		//PostconditionConstraintCS )* "}"|";"
		public Alternatives getAlternatives_9() { return cAlternatives_9; }

		//"{" constraints+=( PreconditionConstraintCS | BodyConstraintCS |
		//PostconditionConstraintCS )* "}"
		public Group getGroup_9_0() { return cGroup_9_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_9_0_0() { return cLeftCurlyBracketKeyword_9_0_0; }

		//constraints+=( PreconditionConstraintCS | BodyConstraintCS |
		//PostconditionConstraintCS )*
		public Assignment getConstraintsAssignment_9_0_1() { return cConstraintsAssignment_9_0_1; }

		//PreconditionConstraintCS|BodyConstraintCS|PostconditionConstraintCS
		public Alternatives getConstraintsAlternatives_9_0_1_0() { return cConstraintsAlternatives_9_0_1_0; }

		//PreconditionConstraintCS
		public RuleCall getConstraintsPreconditionConstraintCSParserRuleCall_9_0_1_0_0() { return cConstraintsPreconditionConstraintCSParserRuleCall_9_0_1_0_0; }

		//BodyConstraintCS
		public RuleCall getConstraintsBodyConstraintCSParserRuleCall_9_0_1_0_1() { return cConstraintsBodyConstraintCSParserRuleCall_9_0_1_0_1; }

		//PostconditionConstraintCS
		public RuleCall getConstraintsPostconditionConstraintCSParserRuleCall_9_0_1_0_2() { return cConstraintsPostconditionConstraintCSParserRuleCall_9_0_1_0_2; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9_0_2() { return cRightCurlyBracketKeyword_9_0_2; }

		//";"
		public Keyword getSemicolonKeyword_9_1() { return cSemicolonKeyword_9_1; }
	}

	public class PackageCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cSubpackagesAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cSubpackagesPackageCSParserRuleCall_4_0_0 = (RuleCall)cSubpackagesAssignment_4_0.eContents().get(0);
		private final Assignment cClassifiersAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cClassifiersClassifierCSParserRuleCall_4_1_0 = (RuleCall)cClassifiersAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PackageCS:
		//  annotations+=AnnotationCS* "package" name=ID "{" (subpackages+=PackageCS|classifiers
		//  +=ClassifierCS)* "}";
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* "package" name=ID "{" (subpackages+=PackageCS|classifiers
		//+=ClassifierCS)* "}"
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//"package"
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//(subpackages+=PackageCS|classifiers+=ClassifierCS)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//subpackages+=PackageCS
		public Assignment getSubpackagesAssignment_4_0() { return cSubpackagesAssignment_4_0; }

		//PackageCS
		public RuleCall getSubpackagesPackageCSParserRuleCall_4_0_0() { return cSubpackagesPackageCSParserRuleCall_4_0_0; }

		//classifiers+=ClassifierCS
		public Assignment getClassifiersAssignment_4_1() { return cClassifiersAssignment_4_1; }

		//ClassifierCS
		public RuleCall getClassifiersClassifierCSParserRuleCall_4_1_0() { return cClassifiersClassifierCSParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class ParameterCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ParameterCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cQualifiersAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cQualifiersOrderedKeyword_1_0_0 = (Keyword)cQualifiersAssignment_1_0.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cQualifiersOrderedKeyword_1_1_0 = (Keyword)cQualifiersAssignment_1_1.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final Keyword cQualifiersUniqueKeyword_1_2_0 = (Keyword)cQualifiersAssignment_1_2.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final Keyword cQualifiersUniqueKeyword_1_3_0 = (Keyword)cQualifiersAssignment_1_3.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTypeTypeRefCSParserRuleCall_3_1_0 = (RuleCall)cTypeAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Alternatives cAlternatives_3_2_1 = (Alternatives)cGroup_3_2.eContents().get(1);
		private final Group cGroup_3_2_1_0 = (Group)cAlternatives_3_2_1.eContents().get(0);
		private final Assignment cLowerAssignment_3_2_1_0_0 = (Assignment)cGroup_3_2_1_0.eContents().get(0);
		private final RuleCall cLowerLOWERParserRuleCall_3_2_1_0_0_0 = (RuleCall)cLowerAssignment_3_2_1_0_0.eContents().get(0);
		private final Group cGroup_3_2_1_0_1 = (Group)cGroup_3_2_1_0.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_3_2_1_0_1_0 = (Keyword)cGroup_3_2_1_0_1.eContents().get(0);
		private final Assignment cUpperAssignment_3_2_1_0_1_1 = (Assignment)cGroup_3_2_1_0_1.eContents().get(1);
		private final RuleCall cUpperUPPERParserRuleCall_3_2_1_0_1_1_0 = (RuleCall)cUpperAssignment_3_2_1_0_1_1.eContents().get(0);
		private final Assignment cMultiplicityAssignment_3_2_1_1 = (Assignment)cAlternatives_3_2_1.eContents().get(1);
		private final Alternatives cMultiplicityAlternatives_3_2_1_1_0 = (Alternatives)cMultiplicityAssignment_3_2_1_1.eContents().get(0);
		private final Keyword cMultiplicityAsteriskKeyword_3_2_1_1_0_0 = (Keyword)cMultiplicityAlternatives_3_2_1_1_0.eContents().get(0);
		private final Keyword cMultiplicityPlusSignKeyword_3_2_1_1_0_1 = (Keyword)cMultiplicityAlternatives_3_2_1_1_0.eContents().get(1);
		private final Keyword cMultiplicityQuestionMarkKeyword_3_2_1_1_0_2 = (Keyword)cMultiplicityAlternatives_3_2_1_1_0.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		
		//ParameterCS:
		//  annotations+=AnnotationCS* (qualifiers+="ordered"|qualifiers+="!ordered"|
		//  qualifiers+="unique"|qualifiers+="!unique")* name=ID (":" type=TypeRefCS ("[" (lower=
		//  LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)?;
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* (qualifiers+="ordered"|qualifiers+="!ordered"|
		//qualifiers+="unique"|qualifiers+="!unique")* name=ID (":" type=TypeRefCS ("[" (lower=
		//LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)?
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//(qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
		//"!unique")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiers+="ordered"
		public Assignment getQualifiersAssignment_1_0() { return cQualifiersAssignment_1_0; }

		//"ordered"
		public Keyword getQualifiersOrderedKeyword_1_0_0() { return cQualifiersOrderedKeyword_1_0_0; }

		//qualifiers+="!ordered"
		public Assignment getQualifiersAssignment_1_1() { return cQualifiersAssignment_1_1; }

		//"!ordered"
		public Keyword getQualifiersOrderedKeyword_1_1_0() { return cQualifiersOrderedKeyword_1_1_0; }

		//qualifiers+="unique"
		public Assignment getQualifiersAssignment_1_2() { return cQualifiersAssignment_1_2; }

		//"unique"
		public Keyword getQualifiersUniqueKeyword_1_2_0() { return cQualifiersUniqueKeyword_1_2_0; }

		//qualifiers+="!unique"
		public Assignment getQualifiersAssignment_1_3() { return cQualifiersAssignment_1_3; }

		//"!unique"
		public Keyword getQualifiersUniqueKeyword_1_3_0() { return cQualifiersUniqueKeyword_1_3_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//(":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
		//"]")?)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//type=TypeRefCS
		public Assignment getTypeAssignment_3_1() { return cTypeAssignment_3_1; }

		//TypeRefCS
		public RuleCall getTypeTypeRefCSParserRuleCall_3_1_0() { return cTypeTypeRefCSParserRuleCall_3_1_0; }

		//("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3_2_0() { return cLeftSquareBracketKeyword_3_2_0; }

		//lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
		public Alternatives getAlternatives_3_2_1() { return cAlternatives_3_2_1; }

		//lower=LOWER (".." upper=UPPER)?
		public Group getGroup_3_2_1_0() { return cGroup_3_2_1_0; }

		//lower=LOWER
		public Assignment getLowerAssignment_3_2_1_0_0() { return cLowerAssignment_3_2_1_0_0; }

		//LOWER
		public RuleCall getLowerLOWERParserRuleCall_3_2_1_0_0_0() { return cLowerLOWERParserRuleCall_3_2_1_0_0_0; }

		//(".." upper=UPPER)?
		public Group getGroup_3_2_1_0_1() { return cGroup_3_2_1_0_1; }

		//".."
		public Keyword getFullStopFullStopKeyword_3_2_1_0_1_0() { return cFullStopFullStopKeyword_3_2_1_0_1_0; }

		//upper=UPPER
		public Assignment getUpperAssignment_3_2_1_0_1_1() { return cUpperAssignment_3_2_1_0_1_1; }

		//UPPER
		public RuleCall getUpperUPPERParserRuleCall_3_2_1_0_1_1_0() { return cUpperUPPERParserRuleCall_3_2_1_0_1_1_0; }

		//multiplicity=( "*" | "+" | "?" )
		public Assignment getMultiplicityAssignment_3_2_1_1() { return cMultiplicityAssignment_3_2_1_1; }

		//"*"|"+"|"?"
		public Alternatives getMultiplicityAlternatives_3_2_1_1_0() { return cMultiplicityAlternatives_3_2_1_1_0; }

		//"*"
		public Keyword getMultiplicityAsteriskKeyword_3_2_1_1_0_0() { return cMultiplicityAsteriskKeyword_3_2_1_1_0_0; }

		//"+"
		public Keyword getMultiplicityPlusSignKeyword_3_2_1_1_0_1() { return cMultiplicityPlusSignKeyword_3_2_1_1_0_1; }

		//"?"
		public Keyword getMultiplicityQuestionMarkKeyword_3_2_1_1_0_2() { return cMultiplicityQuestionMarkKeyword_3_2_1_1_0_2; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3_2_2() { return cRightSquareBracketKeyword_3_2_2; }
	}

	public class ReferenceCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReferenceCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationCSParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cQualifiersAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cQualifiersDerivedKeyword_1_0_0 = (Keyword)cQualifiersAssignment_1_0.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cQualifiersDerivedKeyword_1_1_0 = (Keyword)cQualifiersAssignment_1_1.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final Keyword cQualifiersOrderedKeyword_1_2_0 = (Keyword)cQualifiersAssignment_1_2.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_3 = (Assignment)cAlternatives_1.eContents().get(3);
		private final Keyword cQualifiersOrderedKeyword_1_3_0 = (Keyword)cQualifiersAssignment_1_3.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_4 = (Assignment)cAlternatives_1.eContents().get(4);
		private final Keyword cQualifiersReadonlyKeyword_1_4_0 = (Keyword)cQualifiersAssignment_1_4.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_5 = (Assignment)cAlternatives_1.eContents().get(5);
		private final Keyword cQualifiersReadonlyKeyword_1_5_0 = (Keyword)cQualifiersAssignment_1_5.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_6 = (Assignment)cAlternatives_1.eContents().get(6);
		private final Keyword cQualifiersResolveKeyword_1_6_0 = (Keyword)cQualifiersAssignment_1_6.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_7 = (Assignment)cAlternatives_1.eContents().get(7);
		private final Keyword cQualifiersResolveKeyword_1_7_0 = (Keyword)cQualifiersAssignment_1_7.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_8 = (Assignment)cAlternatives_1.eContents().get(8);
		private final Keyword cQualifiersTransientKeyword_1_8_0 = (Keyword)cQualifiersAssignment_1_8.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_9 = (Assignment)cAlternatives_1.eContents().get(9);
		private final Keyword cQualifiersTransientKeyword_1_9_0 = (Keyword)cQualifiersAssignment_1_9.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_10 = (Assignment)cAlternatives_1.eContents().get(10);
		private final Keyword cQualifiersUniqueKeyword_1_10_0 = (Keyword)cQualifiersAssignment_1_10.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_11 = (Assignment)cAlternatives_1.eContents().get(11);
		private final Keyword cQualifiersUniqueKeyword_1_11_0 = (Keyword)cQualifiersAssignment_1_11.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_12 = (Assignment)cAlternatives_1.eContents().get(12);
		private final Keyword cQualifiersUnsettableKeyword_1_12_0 = (Keyword)cQualifiersAssignment_1_12.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_13 = (Assignment)cAlternatives_1.eContents().get(13);
		private final Keyword cQualifiersUnsettableKeyword_1_13_0 = (Keyword)cQualifiersAssignment_1_13.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_14 = (Assignment)cAlternatives_1.eContents().get(14);
		private final Keyword cQualifiersVolatileKeyword_1_14_0 = (Keyword)cQualifiersAssignment_1_14.eContents().get(0);
		private final Assignment cQualifiersAssignment_1_15 = (Assignment)cAlternatives_1.eContents().get(15);
		private final Keyword cQualifiersVolatileKeyword_1_15_0 = (Keyword)cQualifiersAssignment_1_15.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cReferenceKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Assignment cContainmentAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final Keyword cContainmentPropertyKeyword_2_1_0 = (Keyword)cContainmentAssignment_2_1.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cNumberSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOppositeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOppositeReferenceRefParserRuleCall_4_1_0 = (RuleCall)cOppositeAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cTypeTypeRefCSParserRuleCall_5_1_0 = (RuleCall)cTypeAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Alternatives cAlternatives_5_2_1 = (Alternatives)cGroup_5_2.eContents().get(1);
		private final Group cGroup_5_2_1_0 = (Group)cAlternatives_5_2_1.eContents().get(0);
		private final Assignment cLowerAssignment_5_2_1_0_0 = (Assignment)cGroup_5_2_1_0.eContents().get(0);
		private final RuleCall cLowerLOWERParserRuleCall_5_2_1_0_0_0 = (RuleCall)cLowerAssignment_5_2_1_0_0.eContents().get(0);
		private final Group cGroup_5_2_1_0_1 = (Group)cGroup_5_2_1_0.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_5_2_1_0_1_0 = (Keyword)cGroup_5_2_1_0_1.eContents().get(0);
		private final Assignment cUpperAssignment_5_2_1_0_1_1 = (Assignment)cGroup_5_2_1_0_1.eContents().get(1);
		private final RuleCall cUpperUPPERParserRuleCall_5_2_1_0_1_1_0 = (RuleCall)cUpperAssignment_5_2_1_0_1_1.eContents().get(0);
		private final Assignment cMultiplicityAssignment_5_2_1_1 = (Assignment)cAlternatives_5_2_1.eContents().get(1);
		private final Alternatives cMultiplicityAlternatives_5_2_1_1_0 = (Alternatives)cMultiplicityAssignment_5_2_1_1.eContents().get(0);
		private final Keyword cMultiplicityAsteriskKeyword_5_2_1_1_0_0 = (Keyword)cMultiplicityAlternatives_5_2_1_1_0.eContents().get(0);
		private final Keyword cMultiplicityPlusSignKeyword_5_2_1_1_0_1 = (Keyword)cMultiplicityAlternatives_5_2_1_1_0.eContents().get(1);
		private final Keyword cMultiplicityQuestionMarkKeyword_5_2_1_1_0_2 = (Keyword)cMultiplicityAlternatives_5_2_1_1_0.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cEqualsSignKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDefaultValueLiteralAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDefaultValueLiteralURLTerminalRuleCall_6_1_0 = (RuleCall)cDefaultValueLiteralAssignment_6_1.eContents().get(0);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cConstraintsAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final Alternatives cConstraintsAlternatives_7_0_1_0 = (Alternatives)cConstraintsAssignment_7_0_1.eContents().get(0);
		private final RuleCall cConstraintsInitialConstraintCSParserRuleCall_7_0_1_0_0 = (RuleCall)cConstraintsAlternatives_7_0_1_0.eContents().get(0);
		private final RuleCall cConstraintsDerivedConstraintCSParserRuleCall_7_0_1_0_1 = (RuleCall)cConstraintsAlternatives_7_0_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7_0_2 = (Keyword)cGroup_7_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_7_1 = (Keyword)cAlternatives_7.eContents().get(1);
		
		//ReferenceCS:
		//  annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
		//  qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers+=
		//  "!readonly"|qualifiers+="resolve"|qualifiers+="!resolve"|qualifiers+="transient"
		//  |qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers
		//  +="unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
		//  "!volatile")* ("reference"|containment?="property") name=ID ("#" opposite=
		//  ReferenceRef)? (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=
		//  ( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{" constraints+=(
		//  InitialConstraintCS | DerivedConstraintCS )* "}"|";");
		public ParserRule getRule() { return rule; }

		//annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
		//qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers+=
		//"!readonly"|qualifiers+="resolve"|qualifiers+="!resolve"|qualifiers+="transient"
		//|qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers
		//+="unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
		//"!volatile")* ("reference"|containment?="property") name=ID ("#" opposite=
		//ReferenceRef)? (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=
		//( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{" constraints+=(
		//InitialConstraintCS | DerivedConstraintCS )* "}"|";")
		public Group getGroup() { return cGroup; }

		//annotations+=AnnotationCS*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//AnnotationCS
		public RuleCall getAnnotationsAnnotationCSParserRuleCall_0_0() { return cAnnotationsAnnotationCSParserRuleCall_0_0; }

		//(qualifiers+="derived"|qualifiers+="!derived"|qualifiers+="ordered"|qualifiers+=
		//"!ordered"|qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="resolve"|
		//qualifiers+="!resolve"|qualifiers+="transient"|qualifiers+="!transient"|
		//qualifiers+="unique"|qualifiers+="!unique"|qualifiers+="unsettable"|qualifiers+=
		//"!unsettable"|qualifiers+="volatile"|qualifiers+="!volatile")*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//qualifiers+="derived"
		public Assignment getQualifiersAssignment_1_0() { return cQualifiersAssignment_1_0; }

		//"derived"
		public Keyword getQualifiersDerivedKeyword_1_0_0() { return cQualifiersDerivedKeyword_1_0_0; }

		//qualifiers+="!derived"
		public Assignment getQualifiersAssignment_1_1() { return cQualifiersAssignment_1_1; }

		//"!derived"
		public Keyword getQualifiersDerivedKeyword_1_1_0() { return cQualifiersDerivedKeyword_1_1_0; }

		//qualifiers+="ordered"
		public Assignment getQualifiersAssignment_1_2() { return cQualifiersAssignment_1_2; }

		//"ordered"
		public Keyword getQualifiersOrderedKeyword_1_2_0() { return cQualifiersOrderedKeyword_1_2_0; }

		//qualifiers+="!ordered"
		public Assignment getQualifiersAssignment_1_3() { return cQualifiersAssignment_1_3; }

		//"!ordered"
		public Keyword getQualifiersOrderedKeyword_1_3_0() { return cQualifiersOrderedKeyword_1_3_0; }

		//qualifiers+="readonly"
		public Assignment getQualifiersAssignment_1_4() { return cQualifiersAssignment_1_4; }

		//"readonly"
		public Keyword getQualifiersReadonlyKeyword_1_4_0() { return cQualifiersReadonlyKeyword_1_4_0; }

		//qualifiers+="!readonly"
		public Assignment getQualifiersAssignment_1_5() { return cQualifiersAssignment_1_5; }

		//"!readonly"
		public Keyword getQualifiersReadonlyKeyword_1_5_0() { return cQualifiersReadonlyKeyword_1_5_0; }

		//qualifiers+="resolve"
		public Assignment getQualifiersAssignment_1_6() { return cQualifiersAssignment_1_6; }

		//"resolve"
		public Keyword getQualifiersResolveKeyword_1_6_0() { return cQualifiersResolveKeyword_1_6_0; }

		//qualifiers+="!resolve"
		public Assignment getQualifiersAssignment_1_7() { return cQualifiersAssignment_1_7; }

		//"!resolve"
		public Keyword getQualifiersResolveKeyword_1_7_0() { return cQualifiersResolveKeyword_1_7_0; }

		//qualifiers+="transient"
		public Assignment getQualifiersAssignment_1_8() { return cQualifiersAssignment_1_8; }

		//"transient"
		public Keyword getQualifiersTransientKeyword_1_8_0() { return cQualifiersTransientKeyword_1_8_0; }

		//qualifiers+="!transient"
		public Assignment getQualifiersAssignment_1_9() { return cQualifiersAssignment_1_9; }

		//"!transient"
		public Keyword getQualifiersTransientKeyword_1_9_0() { return cQualifiersTransientKeyword_1_9_0; }

		//qualifiers+="unique"
		public Assignment getQualifiersAssignment_1_10() { return cQualifiersAssignment_1_10; }

		//"unique"
		public Keyword getQualifiersUniqueKeyword_1_10_0() { return cQualifiersUniqueKeyword_1_10_0; }

		//qualifiers+="!unique"
		public Assignment getQualifiersAssignment_1_11() { return cQualifiersAssignment_1_11; }

		//"!unique"
		public Keyword getQualifiersUniqueKeyword_1_11_0() { return cQualifiersUniqueKeyword_1_11_0; }

		//qualifiers+="unsettable"
		public Assignment getQualifiersAssignment_1_12() { return cQualifiersAssignment_1_12; }

		//"unsettable"
		public Keyword getQualifiersUnsettableKeyword_1_12_0() { return cQualifiersUnsettableKeyword_1_12_0; }

		//qualifiers+="!unsettable"
		public Assignment getQualifiersAssignment_1_13() { return cQualifiersAssignment_1_13; }

		//"!unsettable"
		public Keyword getQualifiersUnsettableKeyword_1_13_0() { return cQualifiersUnsettableKeyword_1_13_0; }

		//qualifiers+="volatile"
		public Assignment getQualifiersAssignment_1_14() { return cQualifiersAssignment_1_14; }

		//"volatile"
		public Keyword getQualifiersVolatileKeyword_1_14_0() { return cQualifiersVolatileKeyword_1_14_0; }

		//qualifiers+="!volatile"
		public Assignment getQualifiersAssignment_1_15() { return cQualifiersAssignment_1_15; }

		//"!volatile"
		public Keyword getQualifiersVolatileKeyword_1_15_0() { return cQualifiersVolatileKeyword_1_15_0; }

		//"reference"|containment?="property"
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//"reference"
		public Keyword getReferenceKeyword_2_0() { return cReferenceKeyword_2_0; }

		//containment?="property"
		public Assignment getContainmentAssignment_2_1() { return cContainmentAssignment_2_1; }

		//"property"
		public Keyword getContainmentPropertyKeyword_2_1_0() { return cContainmentPropertyKeyword_2_1_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("#" opposite=ReferenceRef)?
		public Group getGroup_4() { return cGroup_4; }

		//"#"
		public Keyword getNumberSignKeyword_4_0() { return cNumberSignKeyword_4_0; }

		//opposite=ReferenceRef
		public Assignment getOppositeAssignment_4_1() { return cOppositeAssignment_4_1; }

		//ReferenceRef
		public RuleCall getOppositeReferenceRefParserRuleCall_4_1_0() { return cOppositeReferenceRefParserRuleCall_4_1_0; }

		//(":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" ))
		//"]")?)?
		public Group getGroup_5() { return cGroup_5; }

		//":"
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//type=TypeRefCS
		public Assignment getTypeAssignment_5_1() { return cTypeAssignment_5_1; }

		//TypeRefCS
		public RuleCall getTypeTypeRefCSParserRuleCall_5_1_0() { return cTypeTypeRefCSParserRuleCall_5_1_0; }

		//("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_5_2_0() { return cLeftSquareBracketKeyword_5_2_0; }

		//lower=LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )
		public Alternatives getAlternatives_5_2_1() { return cAlternatives_5_2_1; }

		//lower=LOWER (".." upper=UPPER)?
		public Group getGroup_5_2_1_0() { return cGroup_5_2_1_0; }

		//lower=LOWER
		public Assignment getLowerAssignment_5_2_1_0_0() { return cLowerAssignment_5_2_1_0_0; }

		//LOWER
		public RuleCall getLowerLOWERParserRuleCall_5_2_1_0_0_0() { return cLowerLOWERParserRuleCall_5_2_1_0_0_0; }

		//(".." upper=UPPER)?
		public Group getGroup_5_2_1_0_1() { return cGroup_5_2_1_0_1; }

		//".."
		public Keyword getFullStopFullStopKeyword_5_2_1_0_1_0() { return cFullStopFullStopKeyword_5_2_1_0_1_0; }

		//upper=UPPER
		public Assignment getUpperAssignment_5_2_1_0_1_1() { return cUpperAssignment_5_2_1_0_1_1; }

		//UPPER
		public RuleCall getUpperUPPERParserRuleCall_5_2_1_0_1_1_0() { return cUpperUPPERParserRuleCall_5_2_1_0_1_1_0; }

		//multiplicity=( "*" | "+" | "?" )
		public Assignment getMultiplicityAssignment_5_2_1_1() { return cMultiplicityAssignment_5_2_1_1; }

		//"*"|"+"|"?"
		public Alternatives getMultiplicityAlternatives_5_2_1_1_0() { return cMultiplicityAlternatives_5_2_1_1_0; }

		//"*"
		public Keyword getMultiplicityAsteriskKeyword_5_2_1_1_0_0() { return cMultiplicityAsteriskKeyword_5_2_1_1_0_0; }

		//"+"
		public Keyword getMultiplicityPlusSignKeyword_5_2_1_1_0_1() { return cMultiplicityPlusSignKeyword_5_2_1_1_0_1; }

		//"?"
		public Keyword getMultiplicityQuestionMarkKeyword_5_2_1_1_0_2() { return cMultiplicityQuestionMarkKeyword_5_2_1_1_0_2; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5_2_2() { return cRightSquareBracketKeyword_5_2_2; }

		//("=" defaultValueLiteral=URL)?
		public Group getGroup_6() { return cGroup_6; }

		//"="
		public Keyword getEqualsSignKeyword_6_0() { return cEqualsSignKeyword_6_0; }

		//defaultValueLiteral=URL
		public Assignment getDefaultValueLiteralAssignment_6_1() { return cDefaultValueLiteralAssignment_6_1; }

		//URL
		public RuleCall getDefaultValueLiteralURLTerminalRuleCall_6_1_0() { return cDefaultValueLiteralURLTerminalRuleCall_6_1_0; }

		//"{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";"
		public Alternatives getAlternatives_7() { return cAlternatives_7; }

		//"{" constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"
		public Group getGroup_7_0() { return cGroup_7_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7_0_0() { return cLeftCurlyBracketKeyword_7_0_0; }

		//constraints+=( InitialConstraintCS | DerivedConstraintCS )*
		public Assignment getConstraintsAssignment_7_0_1() { return cConstraintsAssignment_7_0_1; }

		//InitialConstraintCS|DerivedConstraintCS
		public Alternatives getConstraintsAlternatives_7_0_1_0() { return cConstraintsAlternatives_7_0_1_0; }

		//InitialConstraintCS
		public RuleCall getConstraintsInitialConstraintCSParserRuleCall_7_0_1_0_0() { return cConstraintsInitialConstraintCSParserRuleCall_7_0_1_0_0; }

		//DerivedConstraintCS
		public RuleCall getConstraintsDerivedConstraintCSParserRuleCall_7_0_1_0_1() { return cConstraintsDerivedConstraintCSParserRuleCall_7_0_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7_0_2() { return cRightCurlyBracketKeyword_7_0_2; }

		//";"
		public Keyword getSemicolonKeyword_7_1() { return cSemicolonKeyword_7_1; }
	}

	public class ReferenceRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReferenceRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cReferenceCSRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEReferenceRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ReferenceRef:
		//  ReferenceCSRef|EReferenceRef;
		public ParserRule getRule() { return rule; }

		//ReferenceCSRef|EReferenceRef
		public Alternatives getAlternatives() { return cAlternatives; }

		//ReferenceCSRef
		public RuleCall getReferenceCSRefParserRuleCall_0() { return cReferenceCSRefParserRuleCall_0; }

		//EReferenceRef
		public RuleCall getEReferenceRefParserRuleCall_1() { return cEReferenceRefParserRuleCall_1; }
	}

	public class ReferenceCSRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReferenceCSRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefReferenceCSCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefReferenceCSIDTerminalRuleCall_0_1 = (RuleCall)cRefReferenceCSCrossReference_0.eContents().get(1);
		
		//ReferenceCSRef:
		//  ref=[ReferenceCS];
		public ParserRule getRule() { return rule; }

		//ref=[ReferenceCS]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[ReferenceCS]
		public CrossReference getRefReferenceCSCrossReference_0() { return cRefReferenceCSCrossReference_0; }

		//ID
		public RuleCall getRefReferenceCSIDTerminalRuleCall_0_1() { return cRefReferenceCSIDTerminalRuleCall_0_1; }
	}

	public class StructuralFeatureCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StructuralFeatureCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cReferenceCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//StructuralFeatureCS:
		//  AttributeCS|ReferenceCS;
		public ParserRule getRule() { return rule; }

		//AttributeCS|ReferenceCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//AttributeCS
		public RuleCall getAttributeCSParserRuleCall_0() { return cAttributeCSParserRuleCall_0; }

		//ReferenceCS
		public RuleCall getReferenceCSParserRuleCall_1() { return cReferenceCSParserRuleCall_1; }
	}

	public class TypeCSRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeCSRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefTypeCSCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefTypeCSIDTerminalRuleCall_0_1 = (RuleCall)cRefTypeCSCrossReference_0.eContents().get(1);
		
		//TypeCSRef:
		//  ref=[TypeCS];
		public ParserRule getRule() { return rule; }

		//ref=[TypeCS]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[TypeCS]
		public CrossReference getRefTypeCSCrossReference_0() { return cRefTypeCSCrossReference_0; }

		//ID
		public RuleCall getRefTypeCSIDTerminalRuleCall_0_1() { return cRefTypeCSIDTerminalRuleCall_0_1; }
	}

	public class TypeParameterCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeParameterCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cExtendsKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cExtendsAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cExtendsTypeRefCSParserRuleCall_1_0_1_0 = (RuleCall)cExtendsAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_0_2 = (Group)cGroup_1_0.eContents().get(2);
		private final Keyword cAmpersandAmpersandKeyword_1_0_2_0 = (Keyword)cGroup_1_0_2.eContents().get(0);
		private final Assignment cExtendsAssignment_1_0_2_1 = (Assignment)cGroup_1_0_2.eContents().get(1);
		private final RuleCall cExtendsTypeRefCSParserRuleCall_1_0_2_1_0 = (RuleCall)cExtendsAssignment_1_0_2_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cSuperKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cSuperAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cSuperTypeRefCSParserRuleCall_1_1_1_0 = (RuleCall)cSuperAssignment_1_1_1.eContents().get(0);
		
		//TypeParameterCS:
		//  name=ID ("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=
		//  TypeRefCS)?;
		public ParserRule getRule() { return rule; }

		//name=ID ("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=
		//TypeRefCS)?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=TypeRefCS)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*
		public Group getGroup_1_0() { return cGroup_1_0; }

		//"extends"
		public Keyword getExtendsKeyword_1_0_0() { return cExtendsKeyword_1_0_0; }

		//extends+=TypeRefCS
		public Assignment getExtendsAssignment_1_0_1() { return cExtendsAssignment_1_0_1; }

		//TypeRefCS
		public RuleCall getExtendsTypeRefCSParserRuleCall_1_0_1_0() { return cExtendsTypeRefCSParserRuleCall_1_0_1_0; }

		//("&&" extends+=TypeRefCS)*
		public Group getGroup_1_0_2() { return cGroup_1_0_2; }

		//"&&"
		public Keyword getAmpersandAmpersandKeyword_1_0_2_0() { return cAmpersandAmpersandKeyword_1_0_2_0; }

		//extends+=TypeRefCS
		public Assignment getExtendsAssignment_1_0_2_1() { return cExtendsAssignment_1_0_2_1; }

		//TypeRefCS
		public RuleCall getExtendsTypeRefCSParserRuleCall_1_0_2_1_0() { return cExtendsTypeRefCSParserRuleCall_1_0_2_1_0; }

		//"super" super=TypeRefCS
		public Group getGroup_1_1() { return cGroup_1_1; }

		//"super"
		public Keyword getSuperKeyword_1_1_0() { return cSuperKeyword_1_1_0; }

		//super=TypeRefCS
		public Assignment getSuperAssignment_1_1_1() { return cSuperAssignment_1_1_1; }

		//TypeRefCS
		public RuleCall getSuperTypeRefCSParserRuleCall_1_1_1_0() { return cSuperTypeRefCSParserRuleCall_1_1_1_0; }
	}

	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeRef");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeCSRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEClassifierRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEClassifierCSRefParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TypeRef:
		//  TypeCSRef|EClassifierRef|EClassifierCSRef;
		public ParserRule getRule() { return rule; }

		//TypeCSRef|EClassifierRef|EClassifierCSRef
		public Alternatives getAlternatives() { return cAlternatives; }

		//TypeCSRef
		public RuleCall getTypeCSRefParserRuleCall_0() { return cTypeCSRefParserRuleCall_0; }

		//EClassifierRef
		public RuleCall getEClassifierRefParserRuleCall_1() { return cEClassifierRefParserRuleCall_1; }

		//EClassifierCSRef
		public RuleCall getEClassifierCSRefParserRuleCall_2() { return cEClassifierCSRefParserRuleCall_2; }
	}

	public class TypeRefCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeRefCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypedTypeRefCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWildcardTypeRefCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypeRefCS:
		//  TypedTypeRefCS|WildcardTypeRefCS;
		public ParserRule getRule() { return rule; }

		//TypedTypeRefCS|WildcardTypeRefCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//TypedTypeRefCS
		public RuleCall getTypedTypeRefCSParserRuleCall_0() { return cTypedTypeRefCSParserRuleCall_0; }

		//WildcardTypeRefCS
		public RuleCall getWildcardTypeRefCSParserRuleCall_1() { return cWildcardTypeRefCSParserRuleCall_1; }
	}

	public class TypedTypeRefCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypedTypeRefCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeRefParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeArgumentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeArgumentsTypeRefCSParserRuleCall_1_1_0 = (RuleCall)cTypeArgumentsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cTypeArgumentsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cTypeArgumentsTypeRefCSParserRuleCall_1_2_1_0 = (RuleCall)cTypeArgumentsAssignment_1_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//TypedTypeRefCS:
		//  type=TypeRef ("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?;
		public ParserRule getRule() { return rule; }

		//type=TypeRef ("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?
		public Group getGroup() { return cGroup; }

		//type=TypeRef
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_0_0() { return cTypeTypeRefParserRuleCall_0_0; }

		//("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?
		public Group getGroup_1() { return cGroup_1; }

		//"<"
		public Keyword getLessThanSignKeyword_1_0() { return cLessThanSignKeyword_1_0; }

		//typeArguments+=TypeRefCS
		public Assignment getTypeArgumentsAssignment_1_1() { return cTypeArgumentsAssignment_1_1; }

		//TypeRefCS
		public RuleCall getTypeArgumentsTypeRefCSParserRuleCall_1_1_0() { return cTypeArgumentsTypeRefCSParserRuleCall_1_1_0; }

		//("," typeArguments+=TypeRefCS)*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//","
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }

		//typeArguments+=TypeRefCS
		public Assignment getTypeArgumentsAssignment_1_2_1() { return cTypeArgumentsAssignment_1_2_1; }

		//TypeRefCS
		public RuleCall getTypeArgumentsTypeRefCSParserRuleCall_1_2_1_0() { return cTypeArgumentsTypeRefCSParserRuleCall_1_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_1_3() { return cGreaterThanSignKeyword_1_3; }
	}

	public class WildcardTypeRefCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WildcardTypeRefCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWildcardTypeRefCSAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQuestionMarkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cExtendsKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cExtendsAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cExtendsTypeRefCSParserRuleCall_2_0_1_0 = (RuleCall)cExtendsAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cSuperKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cSuperAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cSuperTypeRefCSParserRuleCall_2_1_1_0 = (RuleCall)cSuperAssignment_2_1_1.eContents().get(0);
		
		//WildcardTypeRefCS:
		//  {WildcardTypeRefCS} "?" ("extends" extends=TypeRefCS|"super" super=TypeRefCS)?;
		public ParserRule getRule() { return rule; }

		//{WildcardTypeRefCS} "?" ("extends" extends=TypeRefCS|"super" super=TypeRefCS)?
		public Group getGroup() { return cGroup; }

		//{WildcardTypeRefCS}
		public Action getWildcardTypeRefCSAction_0() { return cWildcardTypeRefCSAction_0; }

		//"?"
		public Keyword getQuestionMarkKeyword_1() { return cQuestionMarkKeyword_1; }

		//("extends" extends=TypeRefCS|"super" super=TypeRefCS)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//"extends" extends=TypeRefCS
		public Group getGroup_2_0() { return cGroup_2_0; }

		//"extends"
		public Keyword getExtendsKeyword_2_0_0() { return cExtendsKeyword_2_0_0; }

		//extends=TypeRefCS
		public Assignment getExtendsAssignment_2_0_1() { return cExtendsAssignment_2_0_1; }

		//TypeRefCS
		public RuleCall getExtendsTypeRefCSParserRuleCall_2_0_1_0() { return cExtendsTypeRefCSParserRuleCall_2_0_1_0; }

		//"super" super=TypeRefCS
		public Group getGroup_2_1() { return cGroup_2_1; }

		//"super"
		public Keyword getSuperKeyword_2_1_0() { return cSuperKeyword_2_1_0; }

		//super=TypeRefCS
		public Assignment getSuperAssignment_2_1_1() { return cSuperAssignment_2_1_1; }

		//TypeRefCS
		public RuleCall getSuperTypeRefCSParserRuleCall_2_1_1_0() { return cSuperTypeRefCSParserRuleCall_2_1_1_0; }
	}
	
	
	private DocumentCSElements pDocumentCS;
	private TerminalRule tURL;
	private TerminalRule tOCL;
	private FQNElements pFQN;
	private INTEGERElements pINTEGER;
	private LOWERElements pLOWER;
	private UPPERElements pUPPER;
	private BodyConstraintCSElements pBodyConstraintCS;
	private DerivedConstraintCSElements pDerivedConstraintCS;
	private InitialConstraintCSElements pInitialConstraintCS;
	private InvariantConstraintCSElements pInvariantConstraintCS;
	private PostconditionConstraintCSElements pPostconditionConstraintCS;
	private PreconditionConstraintCSElements pPreconditionConstraintCS;
	private EClassRefElements pEClassRef;
	private EClassifierRefElements pEClassifierRef;
	private EDataTypeRefElements pEDataTypeRef;
	private EReferenceRefElements pEReferenceRef;
	private AnnotationCSElements pAnnotationCS;
	private AttributeCSElements pAttributeCS;
	private ClassCSElements pClassCS;
	private ClassRefElements pClassRef;
	private ClassCSRefElements pClassCSRef;
	private ClassifierCSElements pClassifierCS;
	private DataTypeCSElements pDataTypeCS;
	private DataTypeRefElements pDataTypeRef;
	private DataTypeCSRefElements pDataTypeCSRef;
	private DetailCSElements pDetailCS;
	private EClassifierCSRefElements pEClassifierCSRef;
	private EnumCSElements pEnumCS;
	private EnumLiteralCSElements pEnumLiteralCS;
	private ImportCSElements pImportCS;
	private OperationCSElements pOperationCS;
	private PackageCSElements pPackageCS;
	private ParameterCSElements pParameterCS;
	private ReferenceCSElements pReferenceCS;
	private ReferenceRefElements pReferenceRef;
	private ReferenceCSRefElements pReferenceCSRef;
	private StructuralFeatureCSElements pStructuralFeatureCS;
	private TypeCSRefElements pTypeCSRef;
	private TypeParameterCSElements pTypeParameterCS;
	private TypeRefElements pTypeRef;
	private TypeRefCSElements pTypeRefCS;
	private TypedTypeRefCSElements pTypedTypeRefCS;
	private WildcardTypeRefCSElements pWildcardTypeRefCS;
	
	private final GrammarProvider grammarProvider;

	private EssentialOCLGrammarAccess gaEssentialOCL;

	@Inject
	public OCLinEcoreGrammarAccess(GrammarProvider grammarProvider,
		EssentialOCLGrammarAccess gaEssentialOCL) {
		this.grammarProvider = grammarProvider;
		this.gaEssentialOCL = gaEssentialOCL;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public EssentialOCLGrammarAccess getEssentialOCLGrammarAccess() {
		return gaEssentialOCL;
	}

	
	//DocumentCS:
	//  imports+=ImportCS* packages+=PackageCS*; 
	////generate oclinEcore2 "http://www.eclipse.org/ocl/examples/xtext/oclinecore/OCLinEcore"
	public DocumentCSElements getDocumentCSAccess() {
		return (pDocumentCS != null) ? pDocumentCS : (pDocumentCS = new DocumentCSElements());
	}
	
	public ParserRule getDocumentCSRule() {
		return getDocumentCSAccess().getRule();
	}

	//terminal URL:
	//  "\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"";
	public TerminalRule getURLRule() {
		return (tURL != null) ? tURL : (tURL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "URL"));
	} 

	//terminal OCL:
	//  "�" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "�";
	public TerminalRule getOCLRule() {
		return (tOCL != null) ? tOCL : (tOCL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "OCL"));
	} 

	//FQN returns ecore::EString:
	//  ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//INTEGER returns ecore::EInt:
	//  INT;
	public INTEGERElements getINTEGERAccess() {
		return (pINTEGER != null) ? pINTEGER : (pINTEGER = new INTEGERElements());
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}

	//LOWER returns ecore::EInt:
	//  INT;
	public LOWERElements getLOWERAccess() {
		return (pLOWER != null) ? pLOWER : (pLOWER = new LOWERElements());
	}
	
	public ParserRule getLOWERRule() {
		return getLOWERAccess().getRule();
	}

	//UPPER returns ecore::EInt:
	//  INT|"*";
	public UPPERElements getUPPERAccess() {
		return (pUPPER != null) ? pUPPER : (pUPPER = new UPPERElements());
	}
	
	public ParserRule getUPPERRule() {
		return getUPPERAccess().getRule();
	}

	//BodyConstraintCS returns ConstraintCS:
	//  stereotype="body" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
	public BodyConstraintCSElements getBodyConstraintCSAccess() {
		return (pBodyConstraintCS != null) ? pBodyConstraintCS : (pBodyConstraintCS = new BodyConstraintCSElements());
	}
	
	public ParserRule getBodyConstraintCSRule() {
		return getBodyConstraintCSAccess().getRule();
	}

	//DerivedConstraintCS returns ConstraintCS:
	//  stereotype="derivation" ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
	public DerivedConstraintCSElements getDerivedConstraintCSAccess() {
		return (pDerivedConstraintCS != null) ? pDerivedConstraintCS : (pDerivedConstraintCS = new DerivedConstraintCSElements());
	}
	
	public ParserRule getDerivedConstraintCSRule() {
		return getDerivedConstraintCSAccess().getRule();
	}

	//InitialConstraintCS returns ConstraintCS:
	//  stereotype="initial" ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
	public InitialConstraintCSElements getInitialConstraintCSAccess() {
		return (pInitialConstraintCS != null) ? pInitialConstraintCS : (pInitialConstraintCS = new InitialConstraintCSElements());
	}
	
	public ParserRule getInitialConstraintCSRule() {
		return getInitialConstraintCSAccess().getRule();
	}

	//InvariantConstraintCS returns ConstraintCS:
	//  stereotype="invariant" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL) ";";
	public InvariantConstraintCSElements getInvariantConstraintCSAccess() {
		return (pInvariantConstraintCS != null) ? pInvariantConstraintCS : (pInvariantConstraintCS = new InvariantConstraintCSElements());
	}
	
	public ParserRule getInvariantConstraintCSRule() {
		return getInvariantConstraintCSAccess().getRule();
	}

	//PostconditionConstraintCS returns ConstraintCS:
	//  stereotype="postcondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
	//  ";";
	public PostconditionConstraintCSElements getPostconditionConstraintCSAccess() {
		return (pPostconditionConstraintCS != null) ? pPostconditionConstraintCS : (pPostconditionConstraintCS = new PostconditionConstraintCSElements());
	}
	
	public ParserRule getPostconditionConstraintCSRule() {
		return getPostconditionConstraintCSAccess().getRule();
	}

	//PreconditionConstraintCS returns ConstraintCS:
	//  stereotype="precondition" name=ID? ":" (exprValue=OclExpressionCS|exprString=OCL)
	//  ";";
	public PreconditionConstraintCSElements getPreconditionConstraintCSAccess() {
		return (pPreconditionConstraintCS != null) ? pPreconditionConstraintCS : (pPreconditionConstraintCS = new PreconditionConstraintCSElements());
	}
	
	public ParserRule getPreconditionConstraintCSRule() {
		return getPreconditionConstraintCSAccess().getRule();
	}

	//EClassRef:
	//  ref=[ecore::EClass];
	public EClassRefElements getEClassRefAccess() {
		return (pEClassRef != null) ? pEClassRef : (pEClassRef = new EClassRefElements());
	}
	
	public ParserRule getEClassRefRule() {
		return getEClassRefAccess().getRule();
	}

	//EClassifierRef:
	//  ref=[ecore::EClassifier];
	public EClassifierRefElements getEClassifierRefAccess() {
		return (pEClassifierRef != null) ? pEClassifierRef : (pEClassifierRef = new EClassifierRefElements());
	}
	
	public ParserRule getEClassifierRefRule() {
		return getEClassifierRefAccess().getRule();
	}

	//EDataTypeRef:
	//  ref=[ecore::EDataType];
	public EDataTypeRefElements getEDataTypeRefAccess() {
		return (pEDataTypeRef != null) ? pEDataTypeRef : (pEDataTypeRef = new EDataTypeRefElements());
	}
	
	public ParserRule getEDataTypeRefRule() {
		return getEDataTypeRefAccess().getRule();
	}

	//EReferenceRef:
	//  ref=[ecore::EReference];
	public EReferenceRefElements getEReferenceRefAccess() {
		return (pEReferenceRef != null) ? pEReferenceRef : (pEReferenceRef = new EReferenceRefElements());
	}
	
	public ParserRule getEReferenceRefRule() {
		return getEReferenceRefAccess().getRule();
	}

	//AnnotationCS:
	//  "@" (idSource=ID|stringSource=URL) ("(" details+=DetailCS ("," details+=DetailCS)* ")"
	//  )?;  
	//
	//    
	//	
	////	(annotations+=AnnotationCS)*
	public AnnotationCSElements getAnnotationCSAccess() {
		return (pAnnotationCS != null) ? pAnnotationCS : (pAnnotationCS = new AnnotationCSElements());
	}
	
	public ParserRule getAnnotationCSRule() {
		return getAnnotationCSAccess().getRule();
	}

	//AttributeCS:
	//  annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
	//  qualifiers+="id"|qualifiers+="!id"|qualifiers+="ordered"|qualifiers+="!ordered"|
	//  qualifiers+="readonly"|qualifiers+="!readonly"|qualifiers+="transient"|
	//  qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers+=
	//  "unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
	//  "!volatile")* "attribute" name=ID (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=
	//  UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{"
	//  constraints+=( InitialConstraintCS | DerivedConstraintCS )* "}"|";");
	public AttributeCSElements getAttributeCSAccess() {
		return (pAttributeCS != null) ? pAttributeCS : (pAttributeCS = new AttributeCSElements());
	}
	
	public ParserRule getAttributeCSRule() {
		return getAttributeCSAccess().getRule();
	}

	//ClassCS:
	//  annotations+=AnnotationCS* (qualifiers+="abstract"|qualifiers+="!abstract"|
	//  qualifiers+="interface"|qualifiers+="!interface")* "class" name=ID ("<"
	//  typeParameters+=TypeParameterCS ("," typeParameters+=TypeParameterCS)* ">")? (
	//  "extends" superTypes+=TypeRefCS ("," superTypes+=TypeRefCS)*)? (":" instanceClassName
	//  =FQN)? ("{" (operations+=OperationCS|structuralFeatures+=StructuralFeatureCS|
	//  constraints+=InvariantConstraintCS)* "}"|";");
	public ClassCSElements getClassCSAccess() {
		return (pClassCS != null) ? pClassCS : (pClassCS = new ClassCSElements());
	}
	
	public ParserRule getClassCSRule() {
		return getClassCSAccess().getRule();
	}

	//ClassRef:
	//  ClassCSRef|EClassRef;
	public ClassRefElements getClassRefAccess() {
		return (pClassRef != null) ? pClassRef : (pClassRef = new ClassRefElements());
	}
	
	public ParserRule getClassRefRule() {
		return getClassRefAccess().getRule();
	}

	//ClassCSRef:
	//  ref=[ClassCS];
	public ClassCSRefElements getClassCSRefAccess() {
		return (pClassCSRef != null) ? pClassCSRef : (pClassCSRef = new ClassCSRefElements());
	}
	
	public ParserRule getClassCSRefRule() {
		return getClassCSRefAccess().getRule();
	}

	//ClassifierCS:
	//  ClassCS|DataTypeCS|EnumCS;
	public ClassifierCSElements getClassifierCSAccess() {
		return (pClassifierCS != null) ? pClassifierCS : (pClassifierCS = new ClassifierCSElements());
	}
	
	public ParserRule getClassifierCSRule() {
		return getClassifierCSAccess().getRule();
	}

	//DataTypeCS:
	//  annotations+=AnnotationCS* (qualifiers+="transient"|qualifiers+="!transient")*
	//  "datatype" name=ID ("<" typeParameters+=TypeParameterCS ("," typeParameters+=
	//  TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" constraints+=
	//  InvariantConstraintCS* "}"|";");
	public DataTypeCSElements getDataTypeCSAccess() {
		return (pDataTypeCS != null) ? pDataTypeCS : (pDataTypeCS = new DataTypeCSElements());
	}
	
	public ParserRule getDataTypeCSRule() {
		return getDataTypeCSAccess().getRule();
	}

	//DataTypeRef:
	//  DataTypeCSRef|EDataTypeRef;
	public DataTypeRefElements getDataTypeRefAccess() {
		return (pDataTypeRef != null) ? pDataTypeRef : (pDataTypeRef = new DataTypeRefElements());
	}
	
	public ParserRule getDataTypeRefRule() {
		return getDataTypeRefAccess().getRule();
	}

	//DataTypeCSRef:
	//  ref=[DataTypeOrEnumCS];
	public DataTypeCSRefElements getDataTypeCSRefAccess() {
		return (pDataTypeCSRef != null) ? pDataTypeCSRef : (pDataTypeCSRef = new DataTypeCSRefElements());
	}
	
	public ParserRule getDataTypeCSRefRule() {
		return getDataTypeCSRefAccess().getRule();
	}

	//DetailCS:
	//  (idName=ID|stringName=URL) "=" value=STRING_LITERAL;
	public DetailCSElements getDetailCSAccess() {
		return (pDetailCS != null) ? pDetailCS : (pDetailCS = new DetailCSElements());
	}
	
	public ParserRule getDetailCSRule() {
		return getDetailCSAccess().getRule();
	}

	//EClassifierCSRef:
	//  modelName=ID "::" ref=[ecore::EClassifier];
	public EClassifierCSRefElements getEClassifierCSRefAccess() {
		return (pEClassifierCSRef != null) ? pEClassifierCSRef : (pEClassifierCSRef = new EClassifierCSRefElements());
	}
	
	public ParserRule getEClassifierCSRefRule() {
		return getEClassifierCSRefAccess().getRule();
	}

	//EnumCS:
	//  annotations+=AnnotationCS* "enum" name=ID ("<" typeParameters+=TypeParameterCS (","
	//  typeParameters+=TypeParameterCS)* ">")? (":" instanceClassName=FQN)? ("{" (literals+=
	//  EnumLiteralCS|constraints+=InvariantConstraintCS)* "}"|";");
	public EnumCSElements getEnumCSAccess() {
		return (pEnumCS != null) ? pEnumCS : (pEnumCS = new EnumCSElements());
	}
	
	public ParserRule getEnumCSRule() {
		return getEnumCSAccess().getRule();
	}

	//EnumLiteralCS:
	//  annotations+=AnnotationCS* name=ID ("=" value=INTEGER)? ";";
	public EnumLiteralCSElements getEnumLiteralCSAccess() {
		return (pEnumLiteralCS != null) ? pEnumLiteralCS : (pEnumLiteralCS = new EnumLiteralCSElements());
	}
	
	public ParserRule getEnumLiteralCSRule() {
		return getEnumLiteralCSAccess().getRule();
	}

	//ImportCS:
	//  "import" (alias=ID "=") ePackage=[ecore::EPackage|URL] ";";
	public ImportCSElements getImportCSAccess() {
		return (pImportCS != null) ? pImportCS : (pImportCS = new ImportCSElements());
	}
	
	public ParserRule getImportCSRule() {
		return getImportCSAccess().getRule();
	}

	//OperationCS:
	//  annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
	//  qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="unique"|qualifiers+=
	//  "!unique")* "operation" name=ID ("<" typeParameters+=TypeParameterCS (","
	//  typeParameters+=TypeParameterCS)* ">")? "(" (parameters+=ParameterCS ("," parameters
	//  +=ParameterCS)*)? ")" (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|
	//  multiplicity=( "*" | "+" | "?" )) "]")?)? ("{" constraints+=( PreconditionConstraintCS |
	//  BodyConstraintCS | PostconditionConstraintCS )* "}"|";");
	public OperationCSElements getOperationCSAccess() {
		return (pOperationCS != null) ? pOperationCS : (pOperationCS = new OperationCSElements());
	}
	
	public ParserRule getOperationCSRule() {
		return getOperationCSAccess().getRule();
	}

	//PackageCS:
	//  annotations+=AnnotationCS* "package" name=ID "{" (subpackages+=PackageCS|classifiers
	//  +=ClassifierCS)* "}";
	public PackageCSElements getPackageCSAccess() {
		return (pPackageCS != null) ? pPackageCS : (pPackageCS = new PackageCSElements());
	}
	
	public ParserRule getPackageCSRule() {
		return getPackageCSAccess().getRule();
	}

	//ParameterCS:
	//  annotations+=AnnotationCS* (qualifiers+="ordered"|qualifiers+="!ordered"|
	//  qualifiers+="unique"|qualifiers+="!unique")* name=ID (":" type=TypeRefCS ("[" (lower=
	//  LOWER (".." upper=UPPER)?|multiplicity=( "*" | "+" | "?" )) "]")?)?;
	public ParameterCSElements getParameterCSAccess() {
		return (pParameterCS != null) ? pParameterCS : (pParameterCS = new ParameterCSElements());
	}
	
	public ParserRule getParameterCSRule() {
		return getParameterCSAccess().getRule();
	}

	//ReferenceCS:
	//  annotations+=AnnotationCS* (qualifiers+="derived"|qualifiers+="!derived"|
	//  qualifiers+="ordered"|qualifiers+="!ordered"|qualifiers+="readonly"|qualifiers+=
	//  "!readonly"|qualifiers+="resolve"|qualifiers+="!resolve"|qualifiers+="transient"
	//  |qualifiers+="!transient"|qualifiers+="unique"|qualifiers+="!unique"|qualifiers
	//  +="unsettable"|qualifiers+="!unsettable"|qualifiers+="volatile"|qualifiers+=
	//  "!volatile")* ("reference"|containment?="property") name=ID ("#" opposite=
	//  ReferenceRef)? (":" type=TypeRefCS ("[" (lower=LOWER (".." upper=UPPER)?|multiplicity=
	//  ( "*" | "+" | "?" )) "]")?)? ("=" defaultValueLiteral=URL)? ("{" constraints+=(
	//  InitialConstraintCS | DerivedConstraintCS )* "}"|";");
	public ReferenceCSElements getReferenceCSAccess() {
		return (pReferenceCS != null) ? pReferenceCS : (pReferenceCS = new ReferenceCSElements());
	}
	
	public ParserRule getReferenceCSRule() {
		return getReferenceCSAccess().getRule();
	}

	//ReferenceRef:
	//  ReferenceCSRef|EReferenceRef;
	public ReferenceRefElements getReferenceRefAccess() {
		return (pReferenceRef != null) ? pReferenceRef : (pReferenceRef = new ReferenceRefElements());
	}
	
	public ParserRule getReferenceRefRule() {
		return getReferenceRefAccess().getRule();
	}

	//ReferenceCSRef:
	//  ref=[ReferenceCS];
	public ReferenceCSRefElements getReferenceCSRefAccess() {
		return (pReferenceCSRef != null) ? pReferenceCSRef : (pReferenceCSRef = new ReferenceCSRefElements());
	}
	
	public ParserRule getReferenceCSRefRule() {
		return getReferenceCSRefAccess().getRule();
	}

	//StructuralFeatureCS:
	//  AttributeCS|ReferenceCS;
	public StructuralFeatureCSElements getStructuralFeatureCSAccess() {
		return (pStructuralFeatureCS != null) ? pStructuralFeatureCS : (pStructuralFeatureCS = new StructuralFeatureCSElements());
	}
	
	public ParserRule getStructuralFeatureCSRule() {
		return getStructuralFeatureCSAccess().getRule();
	}

	//TypeCSRef:
	//  ref=[TypeCS];
	public TypeCSRefElements getTypeCSRefAccess() {
		return (pTypeCSRef != null) ? pTypeCSRef : (pTypeCSRef = new TypeCSRefElements());
	}
	
	public ParserRule getTypeCSRefRule() {
		return getTypeCSRefAccess().getRule();
	}

	//TypeParameterCS:
	//  name=ID ("extends" extends+=TypeRefCS ("&&" extends+=TypeRefCS)*|"super" super=
	//  TypeRefCS)?;
	public TypeParameterCSElements getTypeParameterCSAccess() {
		return (pTypeParameterCS != null) ? pTypeParameterCS : (pTypeParameterCS = new TypeParameterCSElements());
	}
	
	public ParserRule getTypeParameterCSRule() {
		return getTypeParameterCSAccess().getRule();
	}

	//TypeRef:
	//  TypeCSRef|EClassifierRef|EClassifierCSRef;
	public TypeRefElements getTypeRefAccess() {
		return (pTypeRef != null) ? pTypeRef : (pTypeRef = new TypeRefElements());
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}

	//TypeRefCS:
	//  TypedTypeRefCS|WildcardTypeRefCS;
	public TypeRefCSElements getTypeRefCSAccess() {
		return (pTypeRefCS != null) ? pTypeRefCS : (pTypeRefCS = new TypeRefCSElements());
	}
	
	public ParserRule getTypeRefCSRule() {
		return getTypeRefCSAccess().getRule();
	}

	//TypedTypeRefCS:
	//  type=TypeRef ("<" typeArguments+=TypeRefCS ("," typeArguments+=TypeRefCS)* ">")?;
	public TypedTypeRefCSElements getTypedTypeRefCSAccess() {
		return (pTypedTypeRefCS != null) ? pTypedTypeRefCS : (pTypedTypeRefCS = new TypedTypeRefCSElements());
	}
	
	public ParserRule getTypedTypeRefCSRule() {
		return getTypedTypeRefCSAccess().getRule();
	}

	//WildcardTypeRefCS:
	//  {WildcardTypeRefCS} "?" ("extends" extends=TypeRefCS|"super" super=TypeRefCS)?;
	public WildcardTypeRefCSElements getWildcardTypeRefCSAccess() {
		return (pWildcardTypeRefCS != null) ? pWildcardTypeRefCS : (pWildcardTypeRefCS = new WildcardTypeRefCSElements());
	}
	
	public ParserRule getWildcardTypeRefCSRule() {
		return getWildcardTypeRefCSAccess().getRule();
	}

	//Model returns OclExpressionCS:
	//  OclExpressionCS;  
	////generate essentialOCLCST "http://www.eclipse.org/ocl/3.0.0/EssentialOCLCST"
	public EssentialOCLGrammarAccess.ModelElements getModelAccess() {
		return gaEssentialOCL.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//terminal STRING_LITERAL:
	//  "\'" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRING_LITERALRule() {
		return gaEssentialOCL.getSTRING_LITERALRule();
	} 

	//terminal ID:
	//  ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")* | "_" STRING_LITERAL;  
	//	
	//    		 
	//	  
	////| 	("_'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|"'") )* "'")
	public TerminalRule getIDRule() {
		return gaEssentialOCL.getIDRule();
	} 

	//terminal INT:
	//  "0".."9"+; 
	//
	//  											 // String to allow diverse re-use
	public TerminalRule getINTRule() {
		return gaEssentialOCL.getINTRule();
	} 

	//REAL_LITERAL returns ecore::EBigDecimal:
	//  INT ("." INT|("." INT)? ("e"|"E") ("+"|"-")? INT); 
	//
	//    				 // Not terminal to allow parser backtracking to sort out "5..7"
	public EssentialOCLGrammarAccess.REAL_LITERALElements getREAL_LITERALAccess() {
		return gaEssentialOCL.getREAL_LITERALAccess();
	}
	
	public ParserRule getREAL_LITERALRule() {
		return getREAL_LITERALAccess().getRule();
	}

	//INTEGER_LITERAL returns ecore::EBigInteger:
	//  INT;
	public EssentialOCLGrammarAccess.INTEGER_LITERALElements getINTEGER_LITERALAccess() {
		return gaEssentialOCL.getINTEGER_LITERALAccess();
	}
	
	public ParserRule getINTEGER_LITERALRule() {
		return getINTEGER_LITERALAccess().getRule();
	}

	//terminal ML_COMMENT:
	//  "/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaEssentialOCL.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//  "--" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaEssentialOCL.getSL_COMMENTRule();
	} 

	//terminal WS:
	//  (" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaEssentialOCL.getWSRule();
	} 

	//terminal ANY_OTHER:
	//  .; 
	//
	//    
	//	
	////---------------------------------------------------------------------
	////  Names
	////---------------------------------------------------------------------
	/// *  Temporary backward compatibility support for 7.4.8 conceptual usage 
	//    conceptualOperationName returns SimpleNameCS:
	//    	value='and'
	//    	| value='implies'
	//    	| value='not'
	//    	| value='or'
	//    	| value='xor'
	//    	| value='<'
	//    	| value='<='
	//    	| value='>='
	//    	| value='>'
	//    	| value='='
	//    	| value='<>'
	//    	| value='+'
	//    	| value='-'
	//    	| value='*'
	//    	| value='/';
	//    conceptualOperationNameCS returns SimpleNameCS:
	//    	conceptualOperationName; * /
	//    
	/// *    reservedKeyword returns SimpleNameCS: 
	//    	value='and'
	//    	| value='else'
	//    	| value='endif'
	//    	| value='if'
	//    	| value='implies'
	//    	| value='in'
	//    	| value='let'
	//    	| value='not'
	//    	| value='or'
	//    	| value='then'
	//    	| value='xor'; * /
	public TerminalRule getANY_OTHERRule() {
		return gaEssentialOCL.getANY_OTHERRule();
	} 

	//tupleKeywordCS returns SimpleNameCS:
	//  value="Tuple"; 
	//	
	////---------------------------------------------------------------------
	////  Names
	////---------------------------------------------------------------------
	/// *  Temporary backward compatibility support for 7.4.8 conceptual usage 
	//    conceptualOperationName returns SimpleNameCS:
	//    	value='and'
	//    	| value='implies'
	//    	| value='not'
	//    	| value='or'
	//    	| value='xor'
	//    	| value='<'
	//    	| value='<='
	//    	| value='>='
	//    	| value='>'
	//    	| value='='
	//    	| value='<>'
	//    	| value='+'
	//    	| value='-'
	//    	| value='*'
	//    	| value='/';
	//    conceptualOperationNameCS returns SimpleNameCS:
	//    	conceptualOperationName; * /
	//    
	/// *    reservedKeyword returns SimpleNameCS: 
	//    	value='and'
	//    	| value='else'
	//    	| value='endif'
	//    	| value='if'
	//    	| value='implies'
	//    	| value='in'
	//    	| value='let'
	//    	| value='not'
	//    	| value='or'
	//    	| value='then'
	//    	| value='xor'; * /
	//
	//        
	//    	
	//    
	////    reservedKeywordCS returns SimpleNameCS:
	////    	reservedKeyword;
	public EssentialOCLGrammarAccess.TupleKeywordCSElements getTupleKeywordCSAccess() {
		return gaEssentialOCL.getTupleKeywordCSAccess();
	}
	
	public ParserRule getTupleKeywordCSRule() {
		return getTupleKeywordCSAccess().getRule();
	}

	//restrictedKeywordCS returns SimpleNameCS:
	//  CollectionTypeIdentifierCS|primitiveTypeCS|tupleKeywordCS; 
	//    
	////    reservedKeywordCS returns SimpleNameCS:
	////    	reservedKeyword;
	//    
	//         
	//    	
	////  restrictedKeywordCS -> BooleanLiteralExpCS
	////  restrictedKeywordCS -> InvalidLiteralExpCS
	////  restrictedKeywordCS -> NullLiteralExpCS
	////-  restrictedKeywordCS -> selfKeywordCS
	public EssentialOCLGrammarAccess.RestrictedKeywordCSElements getRestrictedKeywordCSAccess() {
		return gaEssentialOCL.getRestrictedKeywordCSAccess();
	}
	
	public ParserRule getRestrictedKeywordCSRule() {
		return getRestrictedKeywordCSAccess().getRule();
	}

	//selfKeywordCS returns SimpleNameCS:
	//  value="self";
	public EssentialOCLGrammarAccess.SelfKeywordCSElements getSelfKeywordCSAccess() {
		return gaEssentialOCL.getSelfKeywordCSAccess();
	}
	
	public ParserRule getSelfKeywordCSRule() {
		return getSelfKeywordCSAccess().getRule();
	}

	//simpleNameCS returns SimpleNameCS:
	//  value=ID;
	public EssentialOCLGrammarAccess.SimpleNameCSElements getSimpleNameCSAccess() {
		return gaEssentialOCL.getSimpleNameCSAccess();
	}
	
	public ParserRule getSimpleNameCSRule() {
		return getSimpleNameCSAccess().getRule();
	}

	//unreservedSimpleNameCS returns SimpleNameCS:
	//  simpleNameCS|restrictedKeywordCS;
	public EssentialOCLGrammarAccess.UnreservedSimpleNameCSElements getUnreservedSimpleNameCSAccess() {
		return gaEssentialOCL.getUnreservedSimpleNameCSAccess();
	}
	
	public ParserRule getUnreservedSimpleNameCSRule() {
		return getUnreservedSimpleNameCSAccess().getRule();
	}

	//pathNameCS returns PathNameCS:
	//  simpleNames+=simpleNameCS ("::" simpleNames+=unreservedSimpleNameCS)*; 
	//
	//        
	//    	    
	//
	//        
	////---------------------------------------------------------------------
	////  Types
	////---------------------------------------------------------------------
	public EssentialOCLGrammarAccess.PathNameCSElements getPathNameCSAccess() {
		return gaEssentialOCL.getPathNameCSAccess();
	}
	
	public ParserRule getPathNameCSRule() {
		return getPathNameCSAccess().getRule();
	}

	//primitiveTypeCS returns SimpleNameCS:
	//  value="Boolean"|value="Integer"|value="Real"|value="String"|value=
	//  "UnlimitedNatural"|value="OclAny"|value="OclInvalid"|value="OclVoid"; 
	//
	//        
	////---------------------------------------------------------------------
	////  Types
	////---------------------------------------------------------------------
	public EssentialOCLGrammarAccess.PrimitiveTypeCSElements getPrimitiveTypeCSAccess() {
		return gaEssentialOCL.getPrimitiveTypeCSAccess();
	}
	
	public ParserRule getPrimitiveTypeCSRule() {
		return getPrimitiveTypeCSAccess().getRule();
	}

	//CollectionTypeIdentifierCS returns SimpleNameCS:
	//  value="Set"|value="Bag"|value="Sequence"|value="Collection"|value="OrderedSet";
	public EssentialOCLGrammarAccess.CollectionTypeIdentifierCSElements getCollectionTypeIdentifierCSAccess() {
		return gaEssentialOCL.getCollectionTypeIdentifierCSAccess();
	}
	
	public ParserRule getCollectionTypeIdentifierCSRule() {
		return getCollectionTypeIdentifierCSAccess().getRule();
	}

	//typeCS returns TypeCS:
	//  primitiveTypeCS|pathNameCS|collectionTypeCS|tupleTypeCS;
	public EssentialOCLGrammarAccess.TypeCSElements getTypeCSAccess() {
		return gaEssentialOCL.getTypeCSAccess();
	}
	
	public ParserRule getTypeCSRule() {
		return getTypeCSAccess().getRule();
	}

	//collectionTypeCS returns CollectionTypeCS:
	//  value=CollectionTypeIdentifierCS "(" typeCS=typeCS ")";
	public EssentialOCLGrammarAccess.CollectionTypeCSElements getCollectionTypeCSAccess() {
		return gaEssentialOCL.getCollectionTypeCSAccess();
	}
	
	public ParserRule getCollectionTypeCSRule() {
		return getCollectionTypeCSAccess().getRule();
	}

	//tupleTypeCS returns TupleTypeCS:
	//  value="Tuple" "(" (part+=tuplePartCS ("," part+=tuplePartCS)*)? ")";
	public EssentialOCLGrammarAccess.TupleTypeCSElements getTupleTypeCSAccess() {
		return gaEssentialOCL.getTupleTypeCSAccess();
	}
	
	public ParserRule getTupleTypeCSRule() {
		return getTupleTypeCSAccess().getRule();
	}

	//tuplePartCS returns VariableCS:
	//  name=simpleNameCS ":" type=typeCS; 
	//        
	//    
	//	    
	//
	//
	////---------------------------------------------------------------------
	////  Literals
	////---------------------------------------------------------------------
	//// EnumLiteralExpCS is parsed as a PropertyCallExpCS[C]
	////  LiteralExpCS -> EnumLiteralExpCS
	public EssentialOCLGrammarAccess.TuplePartCSElements getTuplePartCSAccess() {
		return gaEssentialOCL.getTuplePartCSAccess();
	}
	
	public ParserRule getTuplePartCSRule() {
		return getTuplePartCSAccess().getRule();
	}

	//LiteralExpCS:
	//  CollectionLiteralExpCS|TupleLiteralExpCS|PrimitiveLiteralExpCS|TypeLiteralExpCS; 
	//
	////---------------------------------------------------------------------
	////  Literals
	////---------------------------------------------------------------------
	//// EnumLiteralExpCS is parsed as a PropertyCallExpCS[C]
	////  LiteralExpCS -> EnumLiteralExpCS
	public EssentialOCLGrammarAccess.LiteralExpCSElements getLiteralExpCSAccess() {
		return gaEssentialOCL.getLiteralExpCSAccess();
	}
	
	public ParserRule getLiteralExpCSRule() {
		return getLiteralExpCSAccess().getRule();
	}

	//CollectionLiteralExpCS:
	//  (CollectionTypeIdentifierCS|collectionTypeCS) "{" (collectionLiteralParts+=
	//  CollectionLiteralPartCS ("," collectionLiteralParts+=CollectionLiteralPartCS)*)?
	//  "}";
	public EssentialOCLGrammarAccess.CollectionLiteralExpCSElements getCollectionLiteralExpCSAccess() {
		return gaEssentialOCL.getCollectionLiteralExpCSAccess();
	}
	
	public ParserRule getCollectionLiteralExpCSRule() {
		return getCollectionLiteralExpCSAccess().getRule();
	}

	//CollectionLiteralPartCS:
	//  expressionCS=OclExpressionCS (".." lastExpressionCS=OclExpressionCS)?;
	public EssentialOCLGrammarAccess.CollectionLiteralPartCSElements getCollectionLiteralPartCSAccess() {
		return gaEssentialOCL.getCollectionLiteralPartCSAccess();
	}
	
	public ParserRule getCollectionLiteralPartCSRule() {
		return getCollectionLiteralPartCSAccess().getRule();
	}

	//PrimitiveLiteralExpCS:
	//  IntegerLiteralExpCS|RealLiteralExpCS|StringLiteralExpCS|BooleanLiteralExpCS|
	//  UnlimitedNaturalLiteralExpCS|InvalidLiteralExpCS|NullLiteralExpCS;
	public EssentialOCLGrammarAccess.PrimitiveLiteralExpCSElements getPrimitiveLiteralExpCSAccess() {
		return gaEssentialOCL.getPrimitiveLiteralExpCSAccess();
	}
	
	public ParserRule getPrimitiveLiteralExpCSRule() {
		return getPrimitiveLiteralExpCSAccess().getRule();
	}

	//TupleLiteralExpCS:
	//  "Tuple" "{" part+=TupleLiteralPartCS ("," part+=TupleLiteralPartCS)* "}";
	public EssentialOCLGrammarAccess.TupleLiteralExpCSElements getTupleLiteralExpCSAccess() {
		return gaEssentialOCL.getTupleLiteralExpCSAccess();
	}
	
	public ParserRule getTupleLiteralExpCSRule() {
		return getTupleLiteralExpCSAccess().getRule();
	}

	//TupleLiteralPartCS returns VariableCS:
	//  name=simpleNameCS (":" type=typeCS)? "=" initExpression=OclExpressionCS;
	public EssentialOCLGrammarAccess.TupleLiteralPartCSElements getTupleLiteralPartCSAccess() {
		return gaEssentialOCL.getTupleLiteralPartCSAccess();
	}
	
	public ParserRule getTupleLiteralPartCSRule() {
		return getTupleLiteralPartCSAccess().getRule();
	}

	//IntegerLiteralExpCS:
	//  integerSymbol=INTEGER_LITERAL;
	public EssentialOCLGrammarAccess.IntegerLiteralExpCSElements getIntegerLiteralExpCSAccess() {
		return gaEssentialOCL.getIntegerLiteralExpCSAccess();
	}
	
	public ParserRule getIntegerLiteralExpCSRule() {
		return getIntegerLiteralExpCSAccess().getRule();
	}

	//RealLiteralExpCS:
	//  realSymbol=REAL_LITERAL;
	public EssentialOCLGrammarAccess.RealLiteralExpCSElements getRealLiteralExpCSAccess() {
		return gaEssentialOCL.getRealLiteralExpCSAccess();
	}
	
	public ParserRule getRealLiteralExpCSRule() {
		return getRealLiteralExpCSAccess().getRule();
	}

	//StringLiteralExpCS:
	//  stringSymbol+=STRING_LITERAL+;
	public EssentialOCLGrammarAccess.StringLiteralExpCSElements getStringLiteralExpCSAccess() {
		return gaEssentialOCL.getStringLiteralExpCSAccess();
	}
	
	public ParserRule getStringLiteralExpCSRule() {
		return getStringLiteralExpCSAccess().getRule();
	}

	//BooleanLiteralExpCS:
	//  value="true"|value="false";
	public EssentialOCLGrammarAccess.BooleanLiteralExpCSElements getBooleanLiteralExpCSAccess() {
		return gaEssentialOCL.getBooleanLiteralExpCSAccess();
	}
	
	public ParserRule getBooleanLiteralExpCSRule() {
		return getBooleanLiteralExpCSAccess().getRule();
	}

	//UnlimitedNaturalLiteralExpCS:
	//  {UnlimitedNaturalLiteralExpCS} "*";
	public EssentialOCLGrammarAccess.UnlimitedNaturalLiteralExpCSElements getUnlimitedNaturalLiteralExpCSAccess() {
		return gaEssentialOCL.getUnlimitedNaturalLiteralExpCSAccess();
	}
	
	public ParserRule getUnlimitedNaturalLiteralExpCSRule() {
		return getUnlimitedNaturalLiteralExpCSAccess().getRule();
	}

	//InvalidLiteralExpCS:
	//  {InvalidLiteralExpCS} "invalid";
	public EssentialOCLGrammarAccess.InvalidLiteralExpCSElements getInvalidLiteralExpCSAccess() {
		return gaEssentialOCL.getInvalidLiteralExpCSAccess();
	}
	
	public ParserRule getInvalidLiteralExpCSRule() {
		return getInvalidLiteralExpCSAccess().getRule();
	}

	//NullLiteralExpCS:
	//  {NullLiteralExpCS} "null";
	public EssentialOCLGrammarAccess.NullLiteralExpCSElements getNullLiteralExpCSAccess() {
		return gaEssentialOCL.getNullLiteralExpCSAccess();
	}
	
	public ParserRule getNullLiteralExpCSRule() {
		return getNullLiteralExpCSAccess().getRule();
	}

	//TypeLiteralExpCS:
	//  pathNameCS|primitiveTypeCS|collectionTypeCS|tupleTypeCS; 
	//        
	//        
	//		
	//		 
	//		 
	//		 
	//
	////---------------------------------------------------------------------
	////  Expressions
	////---------------------------------------------------------------------
	//     // An OclExpressionCS comprising one or more LetExpCS is kept separate to ensure
	//     //  that let is right associative, whereas infix operators are left associative.
	//     //   a = 64 / 16 / let b : Integer in 8 / let c : Integer in 4 
	//     // is
	//     //   a = (64 / 16) / (let b : Integer in 8 / (let c : Integer in 4 ))
	public EssentialOCLGrammarAccess.TypeLiteralExpCSElements getTypeLiteralExpCSAccess() {
		return gaEssentialOCL.getTypeLiteralExpCSAccess();
	}
	
	public ParserRule getTypeLiteralExpCSRule() {
		return getTypeLiteralExpCSAccess().getRule();
	}

	//OclExpressionCS:
	//  impliesCS|LetExpCS; 
	//
	////---------------------------------------------------------------------
	////  Expressions
	////---------------------------------------------------------------------
	//     // An OclExpressionCS comprising one or more LetExpCS is kept separate to ensure
	//     //  that let is right associative, whereas infix operators are left associative.
	//     //   a = 64 / 16 / let b : Integer in 8 / let c : Integer in 4 
	//     // is
	//     //   a = (64 / 16) / (let b : Integer in 8 / (let c : Integer in 4 ))
	public EssentialOCLGrammarAccess.OclExpressionCSElements getOclExpressionCSAccess() {
		return gaEssentialOCL.getOclExpressionCSAccess();
	}
	
	public ParserRule getOclExpressionCSRule() {
		return getOclExpressionCSAccess().getRule();
	}

	//impliesCS returns OclExpressionCS:
	//  xorCS ({BinaryExpressionCS.left=current} op="implies" right=( impliesCS | LetExpCS ))?;
	public EssentialOCLGrammarAccess.ImpliesCSElements getImpliesCSAccess() {
		return gaEssentialOCL.getImpliesCSAccess();
	}
	
	public ParserRule getImpliesCSRule() {
		return getImpliesCSAccess().getRule();
	}

	//xorCS returns OclExpressionCS:
	//  orCS ({BinaryExpressionCS.left=current} op="xor" right=( xorCS | LetExpCS ))?;
	public EssentialOCLGrammarAccess.XorCSElements getXorCSAccess() {
		return gaEssentialOCL.getXorCSAccess();
	}
	
	public ParserRule getXorCSRule() {
		return getXorCSAccess().getRule();
	}

	//orCS returns OclExpressionCS:
	//  andCS ({BinaryExpressionCS.left=current} op="or" right=( orCS | LetExpCS ))?;
	public EssentialOCLGrammarAccess.OrCSElements getOrCSAccess() {
		return gaEssentialOCL.getOrCSAccess();
	}
	
	public ParserRule getOrCSRule() {
		return getOrCSAccess().getRule();
	}

	//andCS returns OclExpressionCS:
	//  equalityCS ({BinaryExpressionCS.left=current} op="and" right=( andCS | LetExpCS ))?;
	public EssentialOCLGrammarAccess.AndCSElements getAndCSAccess() {
		return gaEssentialOCL.getAndCSAccess();
	}
	
	public ParserRule getAndCSRule() {
		return getAndCSAccess().getRule();
	}

	//equalityCS returns OclExpressionCS:
	//  relationalCS ({BinaryExpressionCS.left=current} op=( "=" | "<>" ) right=( equalityCS |
	//  LetExpCS ))?;
	public EssentialOCLGrammarAccess.EqualityCSElements getEqualityCSAccess() {
		return gaEssentialOCL.getEqualityCSAccess();
	}
	
	public ParserRule getEqualityCSRule() {
		return getEqualityCSAccess().getRule();
	}

	//relationalCS returns OclExpressionCS:
	//  additiveCS ({BinaryExpressionCS.left=current} op=( ">" | "<" | ">=" | "<=" ) right=(
	//  relationalCS | LetExpCS ))?;
	public EssentialOCLGrammarAccess.RelationalCSElements getRelationalCSAccess() {
		return gaEssentialOCL.getRelationalCSAccess();
	}
	
	public ParserRule getRelationalCSRule() {
		return getRelationalCSAccess().getRule();
	}

	//additiveCS returns OclExpressionCS:
	//  multiplicativeCS ({BinaryExpressionCS.left=current} op=( "+" | "-" ) right=( additiveCS |
	//  LetExpCS ))?;
	public EssentialOCLGrammarAccess.AdditiveCSElements getAdditiveCSAccess() {
		return gaEssentialOCL.getAdditiveCSAccess();
	}
	
	public ParserRule getAdditiveCSRule() {
		return getAdditiveCSAccess().getRule();
	}

	//multiplicativeCS returns OclExpressionCS:
	//  unaryCS ({BinaryExpressionCS.left=current} op=( "*" | "/" ) right=( multiplicativeCS |
	//  LetExpCS ))?;
	public EssentialOCLGrammarAccess.MultiplicativeCSElements getMultiplicativeCSAccess() {
		return gaEssentialOCL.getMultiplicativeCSAccess();
	}
	
	public ParserRule getMultiplicativeCSRule() {
		return getMultiplicativeCSAccess().getRule();
	}

	//unaryCS returns OclExpressionCS:
	//  calledExpCS|{UnaryExpressionCS} op=( "-" | "not" ) source=unaryCS;
	public EssentialOCLGrammarAccess.UnaryCSElements getUnaryCSAccess() {
		return gaEssentialOCL.getUnaryCSAccess();
	}
	
	public ParserRule getUnaryCSRule() {
		return getUnaryCSAccess().getRule();
	}

	//calledExpCS returns OclExpressionCS:
	//  implicitCallExpCS ({CallExpCS.source=current} callArguments+=CallArgumentsCS+)?;
	public EssentialOCLGrammarAccess.CalledExpCSElements getCalledExpCSAccess() {
		return gaEssentialOCL.getCalledExpCSAccess();
	}
	
	public ParserRule getCalledExpCSRule() {
		return getCalledExpCSAccess().getRule();
	}

	//CallArgumentsCS:
	//  {ArrowCallArgumentsCS} "->" pathName=pathNameCS "(" (variable1=iteratorVariableCS (
	//  "," variable2=iteratorVariableCS|";" variable2=iteratorAccumulatorCS)? "|" body=
	//  OclExpressionCS|(arguments+=OclExpressionCS ("," arguments+=OclExpressionCS)*)?)
	//  ")"|{DotIndexArgumentsCS} "." pathName=pathNameCS ("[" indexes+=OclExpressionCS (","
	//  indexes+=OclExpressionCS)* "]")? isPre?="@pre"? ("(" (arguments+=OclExpressionCS (","
	//  arguments+=OclExpressionCS)*)? ")")?;
	public EssentialOCLGrammarAccess.CallArgumentsCSElements getCallArgumentsCSAccess() {
		return gaEssentialOCL.getCallArgumentsCSAccess();
	}
	
	public ParserRule getCallArgumentsCSRule() {
		return getCallArgumentsCSAccess().getRule();
	}

	//iteratorVariableCS returns VariableCS:
	//  name=simpleNameCS (":" type=typeCS)?;
	public EssentialOCLGrammarAccess.IteratorVariableCSElements getIteratorVariableCSAccess() {
		return gaEssentialOCL.getIteratorVariableCSAccess();
	}
	
	public ParserRule getIteratorVariableCSRule() {
		return getIteratorVariableCSAccess().getRule();
	}

	//iteratorAccumulatorCS returns VariableCS:
	//  name=simpleNameCS ":" type=typeCS "=" initExpression=OclExpressionCS;
	public EssentialOCLGrammarAccess.IteratorAccumulatorCSElements getIteratorAccumulatorCSAccess() {
		return gaEssentialOCL.getIteratorAccumulatorCSAccess();
	}
	
	public ParserRule getIteratorAccumulatorCSRule() {
		return getIteratorAccumulatorCSAccess().getRule();
	}

	//implicitCallExpCS returns OclExpressionCS:
	//  preCallExpCS; 
	//
	//	    
	//		
	////    	(	(({ImplicitIndexExpCS.calls=current} '[' indexes+=OclExpressionCS (',' indexes+=OclExpressionCS)* ']')?)
	////    	|	(({ImplicitCallExpCS.calls=current} '(' (arguments+=OclExpressionCS (',' arguments+=OclExpressionCS)*)? ')')?)
	////    	)
	public EssentialOCLGrammarAccess.ImplicitCallExpCSElements getImplicitCallExpCSAccess() {
		return gaEssentialOCL.getImplicitCallExpCSAccess();
	}
	
	public ParserRule getImplicitCallExpCSRule() {
		return getImplicitCallExpCSAccess().getRule();
	}

	//preCallExpCS returns OclExpressionCS:
	//  extendedPrimaryExpCS; 
	//	
	//	    
	//		
	////	|	source=primaryExpCS isPre?='@pre'
	public EssentialOCLGrammarAccess.PreCallExpCSElements getPreCallExpCSAccess() {
		return gaEssentialOCL.getPreCallExpCSAccess();
	}
	
	public ParserRule getPreCallExpCSRule() {
		return getPreCallExpCSAccess().getRule();
	}

	//SimpleNameExpCS returns OclExpressionCS:
	//  simpleNameCS; 
	//        
	//          // AssociationClassCallExpCS[B.1.1],
	//                         // PropertyCallExpCS[B],VariableExpCS[.1]
	public EssentialOCLGrammarAccess.SimpleNameExpCSElements getSimpleNameExpCSAccess() {
		return gaEssentialOCL.getSimpleNameExpCSAccess();
	}
	
	public ParserRule getSimpleNameExpCSRule() {
		return getSimpleNameExpCSAccess().getRule();
	}

	//extendedPrimaryExpCS returns OclExpressionCS:
	//  primaryExpCS; 
	//
	//        
	//		
	////  |	OclMessageExpCS // OclExpressionCS[E] is added by CompleteOCL
	public EssentialOCLGrammarAccess.ExtendedPrimaryExpCSElements getExtendedPrimaryExpCSAccess() {
		return gaEssentialOCL.getExtendedPrimaryExpCSAccess();
	}
	
	public ParserRule getExtendedPrimaryExpCSRule() {
		return getExtendedPrimaryExpCSAccess().getRule();
	}

	//primaryExpCS returns OclExpressionCS:
	//  selfKeywordCS|LiteralExpCS|IfExpCS|"(" OclExpressionCS ")"; 
	//
	//        
	//			 // The only VariableExpCS not parsed as a TypeLiteralExpCS
	//     	      // OclExpressionCS[C]
	//     	           // OclExpressionCS[F]
	public EssentialOCLGrammarAccess.PrimaryExpCSElements getPrimaryExpCSAccess() {
		return gaEssentialOCL.getPrimaryExpCSAccess();
	}
	
	public ParserRule getPrimaryExpCSRule() {
		return getPrimaryExpCSAccess().getRule();
	}

	//IfExpCS:
	//  "if" condition=OclExpressionCS "then" thenExpression=OclExpressionCS "else"
	//  elseExpression=OclExpressionCS "endif";
	public EssentialOCLGrammarAccess.IfExpCSElements getIfExpCSAccess() {
		return gaEssentialOCL.getIfExpCSAccess();
	}
	
	public ParserRule getIfExpCSRule() {
		return getIfExpCSAccess().getRule();
	}

	//LetExpCS:
	//  "let" variable+=LetVariableCS ("," variable+=LetVariableCS)* "in" in=OclExpressionCS;
	public EssentialOCLGrammarAccess.LetExpCSElements getLetExpCSAccess() {
		return gaEssentialOCL.getLetExpCSAccess();
	}
	
	public ParserRule getLetExpCSRule() {
		return getLetExpCSAccess().getRule();
	}

	//LetVariableCS returns VariableCS:
	//  name=simpleNameCS ":" type=typeCS "=" initExpression=OclExpressionCS;
	public EssentialOCLGrammarAccess.LetVariableCSElements getLetVariableCSAccess() {
		return gaEssentialOCL.getLetVariableCSAccess();
	}
	
	public ParserRule getLetVariableCSRule() {
		return getLetVariableCSAccess().getRule();
	}
}