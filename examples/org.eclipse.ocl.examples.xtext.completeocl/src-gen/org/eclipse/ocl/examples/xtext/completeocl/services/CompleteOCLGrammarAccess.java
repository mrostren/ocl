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
 * $Id: CompleteOCLGrammarAccess.java,v 1.1 2010/04/13 06:38:27 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.completeocl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLGrammarAccess;

@Singleton
public class CompleteOCLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportCSParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cPackagesAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cPackagesPackageDeclarationCSParserRuleCall_1_0_0 = (RuleCall)cPackagesAssignment_1_0.eContents().get(0);
		private final Assignment cContextsAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cContextsContextDeclCSParserRuleCall_1_1_0 = (RuleCall)cContextsAssignment_1_1.eContents().get(0);
		
		//Model returns DocumentCS:
		//  imports+=importCS* (packages+=packageDeclarationCS|contexts+=contextDeclCS)*; 
		////generate completeOCL "http://www.eclipse.org/ocl/examples/xtext/completeocl/CompleteOCL"
		public ParserRule getRule() { return rule; }

		//imports+=importCS* (packages+=packageDeclarationCS|contexts+=contextDeclCS)*
		public Group getGroup() { return cGroup; }

		//imports+=importCS*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//importCS
		public RuleCall getImportsImportCSParserRuleCall_0_0() { return cImportsImportCSParserRuleCall_0_0; }

		//(packages+=packageDeclarationCS|contexts+=contextDeclCS)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//packages+=packageDeclarationCS
		public Assignment getPackagesAssignment_1_0() { return cPackagesAssignment_1_0; }

		//packageDeclarationCS
		public RuleCall getPackagesPackageDeclarationCSParserRuleCall_1_0_0() { return cPackagesPackageDeclarationCSParserRuleCall_1_0_0; }

		//contexts+=contextDeclCS
		public Assignment getContextsAssignment_1_1() { return cContextsAssignment_1_1; }

		//contextDeclCS
		public RuleCall getContextsContextDeclCSParserRuleCall_1_1_0() { return cContextsContextDeclCSParserRuleCall_1_1_0; }
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

	public class ImportCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "importCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//importCS returns ImportCS:
		//  "import" importedNamespace=FQN;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=FQN
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=FQN
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//FQN
		public RuleCall getImportedNamespaceFQNParserRuleCall_1_0() { return cImportedNamespaceFQNParserRuleCall_1_0; }
	}

	public class PackageDeclarationCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "packageDeclarationCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNamePathNameCSParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cContextsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContextsContextDeclCSParserRuleCall_2_0 = (RuleCall)cContextsAssignment_2.eContents().get(0);
		private final Keyword cEndpackageKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//packageDeclarationCS returns PackageDeclarationCS:
		//  "package" name=pathNameCS contexts+=contextDeclCS* "endpackage";
		public ParserRule getRule() { return rule; }

		//"package" name=pathNameCS contexts+=contextDeclCS* "endpackage"
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=pathNameCS
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//pathNameCS
		public RuleCall getNamePathNameCSParserRuleCall_1_0() { return cNamePathNameCSParserRuleCall_1_0; }

		//contexts+=contextDeclCS*
		public Assignment getContextsAssignment_2() { return cContextsAssignment_2; }

		//contextDeclCS
		public RuleCall getContextsContextDeclCSParserRuleCall_2_0() { return cContextsContextDeclCSParserRuleCall_2_0; }

		//"endpackage"
		public Keyword getEndpackageKeyword_3() { return cEndpackageKeyword_3; }
	}

	public class ContextDeclCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "contextDeclCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyContextDeclCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClassifierContextDeclCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cOperationContextDeclCSParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//contextDeclCS returns ContextDeclCS:
		//  propertyContextDeclCS|classifierContextDeclCS|operationContextDeclCS;
		public ParserRule getRule() { return rule; }

		//propertyContextDeclCS|classifierContextDeclCS|operationContextDeclCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//propertyContextDeclCS
		public RuleCall getPropertyContextDeclCSParserRuleCall_0() { return cPropertyContextDeclCSParserRuleCall_0; }

		//classifierContextDeclCS
		public RuleCall getClassifierContextDeclCSParserRuleCall_1() { return cClassifierContextDeclCSParserRuleCall_1; }

		//operationContextDeclCS
		public RuleCall getOperationContextDeclCSParserRuleCall_2() { return cOperationContextDeclCSParserRuleCall_2; }
	}

	public class PropertyContextDeclCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "propertyContextDeclCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContextNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContextNamePathNameCSParserRuleCall_1_0 = (RuleCall)cContextNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeCSParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cInitAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final RuleCall cInitInitCSParserRuleCall_4_0_0_0 = (RuleCall)cInitAssignment_4_0_0.eContents().get(0);
		private final Assignment cDerAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cDerDerCSParserRuleCall_4_0_1_0 = (RuleCall)cDerAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Assignment cDerAssignment_4_1_0 = (Assignment)cGroup_4_1.eContents().get(0);
		private final RuleCall cDerDerCSParserRuleCall_4_1_0_0 = (RuleCall)cDerAssignment_4_1_0.eContents().get(0);
		private final Assignment cInitAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cInitInitCSParserRuleCall_4_1_1_0 = (RuleCall)cInitAssignment_4_1_1.eContents().get(0);
		
		//propertyContextDeclCS returns PropertyContextDeclCS:
		//  "context" contextName=pathNameCS ":" type=typeCS ((init=initCS der=derCS?)?|der=derCS
		//  init=initCS?);
		public ParserRule getRule() { return rule; }

		//"context" contextName=pathNameCS ":" type=typeCS ((init=initCS der=derCS?)?|der=derCS
		//init=initCS?)
		public Group getGroup() { return cGroup; }

		//"context"
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }

		//contextName=pathNameCS
		public Assignment getContextNameAssignment_1() { return cContextNameAssignment_1; }

		//pathNameCS
		public RuleCall getContextNamePathNameCSParserRuleCall_1_0() { return cContextNamePathNameCSParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=typeCS
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//typeCS
		public RuleCall getTypeTypeCSParserRuleCall_3_0() { return cTypeTypeCSParserRuleCall_3_0; }

		//(init=initCS der=derCS?)?|der=derCS init=initCS?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//(init=initCS der=derCS?)?
		public Group getGroup_4_0() { return cGroup_4_0; }

		//init=initCS
		public Assignment getInitAssignment_4_0_0() { return cInitAssignment_4_0_0; }

		//initCS
		public RuleCall getInitInitCSParserRuleCall_4_0_0_0() { return cInitInitCSParserRuleCall_4_0_0_0; }

		//der=derCS?
		public Assignment getDerAssignment_4_0_1() { return cDerAssignment_4_0_1; }

		//derCS
		public RuleCall getDerDerCSParserRuleCall_4_0_1_0() { return cDerDerCSParserRuleCall_4_0_1_0; }

		//der=derCS init=initCS?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//der=derCS
		public Assignment getDerAssignment_4_1_0() { return cDerAssignment_4_1_0; }

		//derCS
		public RuleCall getDerDerCSParserRuleCall_4_1_0_0() { return cDerDerCSParserRuleCall_4_1_0_0; }

		//init=initCS?
		public Assignment getInitAssignment_4_1_1() { return cInitAssignment_4_1_1; }

		//initCS
		public RuleCall getInitInitCSParserRuleCall_4_1_1_0() { return cInitInitCSParserRuleCall_4_1_1_0; }
	}

	public class InitCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "initCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//initCS returns InitCS:
		//  "init" ":" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//"init" ":" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//"init"
		public Keyword getInitKeyword_0() { return cInitKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_2_0() { return cExpressionOclExpressionCSParserRuleCall_2_0; }
	}

	public class DerCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "derCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeriveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//derCS returns DerCS:
		//  "derive" ":" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//"derive" ":" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//"derive"
		public Keyword getDeriveKeyword_0() { return cDeriveKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_2_0() { return cExpressionOclExpressionCSParserRuleCall_2_0; }
	}

	public class ClassifierContextDeclCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "classifierContextDeclCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cSelfNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cSelfNameSimpleNameCSParserRuleCall_1_0_0 = (RuleCall)cSelfNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cContextNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContextNamePathNameCSParserRuleCall_2_0 = (RuleCall)cContextNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cInvsAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cInvsInvCSParserRuleCall_3_0_0 = (RuleCall)cInvsAssignment_3_0.eContents().get(0);
		private final Assignment cDefsAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cDefsDefCSParserRuleCall_3_1_0 = (RuleCall)cDefsAssignment_3_1.eContents().get(0);
		
		//classifierContextDeclCS returns ClassifierContextDeclCS:
		//  "context" (selfName=simpleNameCS ":")? contextName=pathNameCS (invs+=invCS|defs+=
		//  defCS)*;
		public ParserRule getRule() { return rule; }

		//"context" (selfName=simpleNameCS ":")? contextName=pathNameCS (invs+=invCS|defs+=
		//defCS)*
		public Group getGroup() { return cGroup; }

		//"context"
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }

		//(selfName=simpleNameCS ":")?
		public Group getGroup_1() { return cGroup_1; }

		//selfName=simpleNameCS
		public Assignment getSelfNameAssignment_1_0() { return cSelfNameAssignment_1_0; }

		//simpleNameCS
		public RuleCall getSelfNameSimpleNameCSParserRuleCall_1_0_0() { return cSelfNameSimpleNameCSParserRuleCall_1_0_0; }

		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }

		//contextName=pathNameCS
		public Assignment getContextNameAssignment_2() { return cContextNameAssignment_2; }

		//pathNameCS
		public RuleCall getContextNamePathNameCSParserRuleCall_2_0() { return cContextNamePathNameCSParserRuleCall_2_0; }

		//(invs+=invCS|defs+=defCS)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//invs+=invCS
		public Assignment getInvsAssignment_3_0() { return cInvsAssignment_3_0; }

		//invCS
		public RuleCall getInvsInvCSParserRuleCall_3_0_0() { return cInvsInvCSParserRuleCall_3_0_0; }

		//defs+=defCS
		public Assignment getDefsAssignment_3_1() { return cDefsAssignment_3_1; }

		//defCS
		public RuleCall getDefsDefCSParserRuleCall_3_1_0() { return cDefsDefCSParserRuleCall_3_1_0; }
	}

	public class InvCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "invCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameSimpleNameCSParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//invCS returns InvCS:
		//  "inv" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//"inv" constraintName=simpleNameCS? ":" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//"inv"
		public Keyword getInvKeyword_0() { return cInvKeyword_0; }

		//constraintName=simpleNameCS?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }

		//simpleNameCS
		public RuleCall getConstraintNameSimpleNameCSParserRuleCall_1_0() { return cConstraintNameSimpleNameCSParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_3_0() { return cExpressionOclExpressionCSParserRuleCall_3_0; }
	}

	public class DefCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "defCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStaticAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cStaticStaticKeyword_0_0 = (Keyword)cStaticAssignment_0.eContents().get(0);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConstraintNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConstraintNameSimpleNameCSParserRuleCall_2_0 = (RuleCall)cConstraintNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConstrainedNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConstrainedNameSimpleNameCSParserRuleCall_4_0 = (RuleCall)cConstrainedNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftParenthesisKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Assignment cParametersAssignment_5_1_0 = (Assignment)cGroup_5_1.eContents().get(0);
		private final RuleCall cParametersParameterCSParserRuleCall_5_1_0_0 = (RuleCall)cParametersAssignment_5_1_0.eContents().get(0);
		private final Group cGroup_5_1_1 = (Group)cGroup_5_1.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_1_0 = (Keyword)cGroup_5_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_5_1_1_1 = (Assignment)cGroup_5_1_1.eContents().get(1);
		private final RuleCall cParametersParameterCSParserRuleCall_5_1_1_1_0 = (RuleCall)cParametersAssignment_5_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeTypeCSParserRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cExpressionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_9_0 = (RuleCall)cExpressionAssignment_9.eContents().get(0);
		
		//defCS returns DefCS:
		//  static?="static"? "def" constraintName=simpleNameCS? ":" constrainedName=
		//  simpleNameCS ("(" (parameters+=parameterCS ("," parameters+=parameterCS)*)? ")")? ":"
		//  type=typeCS? "=" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//static?="static"? "def" constraintName=simpleNameCS? ":" constrainedName=
		//simpleNameCS ("(" (parameters+=parameterCS ("," parameters+=parameterCS)*)? ")")? ":"
		//type=typeCS? "=" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//static?="static"?
		public Assignment getStaticAssignment_0() { return cStaticAssignment_0; }

		//"static"
		public Keyword getStaticStaticKeyword_0_0() { return cStaticStaticKeyword_0_0; }

		//"def"
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }

		//constraintName=simpleNameCS?
		public Assignment getConstraintNameAssignment_2() { return cConstraintNameAssignment_2; }

		//simpleNameCS
		public RuleCall getConstraintNameSimpleNameCSParserRuleCall_2_0() { return cConstraintNameSimpleNameCSParserRuleCall_2_0; }

		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }

		//constrainedName=simpleNameCS
		public Assignment getConstrainedNameAssignment_4() { return cConstrainedNameAssignment_4; }

		//simpleNameCS
		public RuleCall getConstrainedNameSimpleNameCSParserRuleCall_4_0() { return cConstrainedNameSimpleNameCSParserRuleCall_4_0; }

		//("(" (parameters+=parameterCS ("," parameters+=parameterCS)*)? ")")?
		public Group getGroup_5() { return cGroup_5; }

		//"("
		public Keyword getLeftParenthesisKeyword_5_0() { return cLeftParenthesisKeyword_5_0; }

		//(parameters+=parameterCS ("," parameters+=parameterCS)*)?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//parameters+=parameterCS
		public Assignment getParametersAssignment_5_1_0() { return cParametersAssignment_5_1_0; }

		//parameterCS
		public RuleCall getParametersParameterCSParserRuleCall_5_1_0_0() { return cParametersParameterCSParserRuleCall_5_1_0_0; }

		//("," parameters+=parameterCS)*
		public Group getGroup_5_1_1() { return cGroup_5_1_1; }

		//","
		public Keyword getCommaKeyword_5_1_1_0() { return cCommaKeyword_5_1_1_0; }

		//parameters+=parameterCS
		public Assignment getParametersAssignment_5_1_1_1() { return cParametersAssignment_5_1_1_1; }

		//parameterCS
		public RuleCall getParametersParameterCSParserRuleCall_5_1_1_1_0() { return cParametersParameterCSParserRuleCall_5_1_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5_2() { return cRightParenthesisKeyword_5_2; }

		//":"
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }

		//type=typeCS?
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }

		//typeCS
		public RuleCall getTypeTypeCSParserRuleCall_7_0() { return cTypeTypeCSParserRuleCall_7_0; }

		//"="
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_9() { return cExpressionAssignment_9; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_9_0() { return cExpressionOclExpressionCSParserRuleCall_9_0; }
	}

	public class OperationContextDeclCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "operationContextDeclCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContextNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContextNamePathNameCSParserRuleCall_1_0 = (RuleCall)cContextNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterCSParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterCSParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTypeTypeCSParserRuleCall_6_0 = (RuleCall)cTypeAssignment_6.eContents().get(0);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Assignment cPresAssignment_7_0 = (Assignment)cAlternatives_7.eContents().get(0);
		private final RuleCall cPresPreCSParserRuleCall_7_0_0 = (RuleCall)cPresAssignment_7_0.eContents().get(0);
		private final Assignment cPostsAssignment_7_1 = (Assignment)cAlternatives_7.eContents().get(1);
		private final RuleCall cPostsPostCSParserRuleCall_7_1_0 = (RuleCall)cPostsAssignment_7_1.eContents().get(0);
		private final Assignment cBodiesAssignment_7_2 = (Assignment)cAlternatives_7.eContents().get(2);
		private final RuleCall cBodiesBodyCSParserRuleCall_7_2_0 = (RuleCall)cBodiesAssignment_7_2.eContents().get(0);
		
		//operationContextDeclCS returns OperationContextDeclCS:
		//  "context" contextName=pathNameCS "(" (parameters+=parameterCS ("," parameters+=
		//  parameterCS)*)? ")" ":" type=typeCS? (pres+=preCS|posts+=postCS|bodies+=bodyCS)*;
		public ParserRule getRule() { return rule; }

		//"context" contextName=pathNameCS "(" (parameters+=parameterCS ("," parameters+=
		//parameterCS)*)? ")" ":" type=typeCS? (pres+=preCS|posts+=postCS|bodies+=bodyCS)*
		public Group getGroup() { return cGroup; }

		//"context"
		public Keyword getContextKeyword_0() { return cContextKeyword_0; }

		//contextName=pathNameCS
		public Assignment getContextNameAssignment_1() { return cContextNameAssignment_1; }

		//pathNameCS
		public RuleCall getContextNamePathNameCSParserRuleCall_1_0() { return cContextNamePathNameCSParserRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(parameters+=parameterCS ("," parameters+=parameterCS)*)?
		public Group getGroup_3() { return cGroup_3; }

		//parameters+=parameterCS
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }

		//parameterCS
		public RuleCall getParametersParameterCSParserRuleCall_3_0_0() { return cParametersParameterCSParserRuleCall_3_0_0; }

		//("," parameters+=parameterCS)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//parameters+=parameterCS
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }

		//parameterCS
		public RuleCall getParametersParameterCSParserRuleCall_3_1_1_0() { return cParametersParameterCSParserRuleCall_3_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//":"
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }

		//type=typeCS?
		public Assignment getTypeAssignment_6() { return cTypeAssignment_6; }

		//typeCS
		public RuleCall getTypeTypeCSParserRuleCall_6_0() { return cTypeTypeCSParserRuleCall_6_0; }

		//(pres+=preCS|posts+=postCS|bodies+=bodyCS)*
		public Alternatives getAlternatives_7() { return cAlternatives_7; }

		//pres+=preCS
		public Assignment getPresAssignment_7_0() { return cPresAssignment_7_0; }

		//preCS
		public RuleCall getPresPreCSParserRuleCall_7_0_0() { return cPresPreCSParserRuleCall_7_0_0; }

		//posts+=postCS
		public Assignment getPostsAssignment_7_1() { return cPostsAssignment_7_1; }

		//postCS
		public RuleCall getPostsPostCSParserRuleCall_7_1_0() { return cPostsPostCSParserRuleCall_7_1_0; }

		//bodies+=bodyCS
		public Assignment getBodiesAssignment_7_2() { return cBodiesAssignment_7_2; }

		//bodyCS
		public RuleCall getBodiesBodyCSParserRuleCall_7_2_0() { return cBodiesBodyCSParserRuleCall_7_2_0; }
	}

	public class ParameterCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "parameterCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSimpleNameCSParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeTypeCSParserRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInitExpressionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cInitExpressionOclExpressionCSParserRuleCall_2_1_0 = (RuleCall)cInitExpressionAssignment_2_1.eContents().get(0);
		
		//parameterCS returns essentialocl::VariableCS:
		//  name=simpleNameCS (":" type=typeCS)? ("=" initExpression=OclExpressionCS)?;
		public ParserRule getRule() { return rule; }

		//name=simpleNameCS (":" type=typeCS)? ("=" initExpression=OclExpressionCS)?
		public Group getGroup() { return cGroup; }

		//name=simpleNameCS
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//simpleNameCS
		public RuleCall getNameSimpleNameCSParserRuleCall_0_0() { return cNameSimpleNameCSParserRuleCall_0_0; }

		//(":" type=typeCS)?
		public Group getGroup_1() { return cGroup_1; }

		//":"
		public Keyword getColonKeyword_1_0() { return cColonKeyword_1_0; }

		//type=typeCS
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }

		//typeCS
		public RuleCall getTypeTypeCSParserRuleCall_1_1_0() { return cTypeTypeCSParserRuleCall_1_1_0; }

		//("=" initExpression=OclExpressionCS)?
		public Group getGroup_2() { return cGroup_2; }

		//"="
		public Keyword getEqualsSignKeyword_2_0() { return cEqualsSignKeyword_2_0; }

		//initExpression=OclExpressionCS
		public Assignment getInitExpressionAssignment_2_1() { return cInitExpressionAssignment_2_1; }

		//OclExpressionCS
		public RuleCall getInitExpressionOclExpressionCSParserRuleCall_2_1_0() { return cInitExpressionOclExpressionCSParserRuleCall_2_1_0; }
	}

	public class PreCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "preCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameSimpleNameCSParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//preCS returns PreCS:
		//  "pre" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//"pre" constraintName=simpleNameCS? ":" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//"pre"
		public Keyword getPreKeyword_0() { return cPreKeyword_0; }

		//constraintName=simpleNameCS?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }

		//simpleNameCS
		public RuleCall getConstraintNameSimpleNameCSParserRuleCall_1_0() { return cConstraintNameSimpleNameCSParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_3_0() { return cExpressionOclExpressionCSParserRuleCall_3_0; }
	}

	public class PostCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "postCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPostKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameSimpleNameCSParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//postCS returns PostCS:
		//  "post" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//"post" constraintName=simpleNameCS? ":" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//"post"
		public Keyword getPostKeyword_0() { return cPostKeyword_0; }

		//constraintName=simpleNameCS?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }

		//simpleNameCS
		public RuleCall getConstraintNameSimpleNameCSParserRuleCall_1_0() { return cConstraintNameSimpleNameCSParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_3_0() { return cExpressionOclExpressionCSParserRuleCall_3_0; }
	}

	public class BodyCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "bodyCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBodyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConstraintNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintNameSimpleNameCSParserRuleCall_1_0 = (RuleCall)cConstraintNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionOclExpressionCSParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//bodyCS returns BodyCS:
		//  "body" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//"body" constraintName=simpleNameCS? ":" expression=OclExpressionCS
		public Group getGroup() { return cGroup; }

		//"body"
		public Keyword getBodyKeyword_0() { return cBodyKeyword_0; }

		//constraintName=simpleNameCS?
		public Assignment getConstraintNameAssignment_1() { return cConstraintNameAssignment_1; }

		//simpleNameCS
		public RuleCall getConstraintNameSimpleNameCSParserRuleCall_1_0() { return cConstraintNameSimpleNameCSParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//expression=OclExpressionCS
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }

		//OclExpressionCS
		public RuleCall getExpressionOclExpressionCSParserRuleCall_3_0() { return cExpressionOclExpressionCSParserRuleCall_3_0; }
	}

	public class ConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "constraintCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInitCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDerCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNamedConstraintCSParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//constraintCS returns ConstraintCS:
		//  initCS|derCS|namedConstraintCS;
		public ParserRule getRule() { return rule; }

		//initCS|derCS|namedConstraintCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//initCS
		public RuleCall getInitCSParserRuleCall_0() { return cInitCSParserRuleCall_0; }

		//derCS
		public RuleCall getDerCSParserRuleCall_1() { return cDerCSParserRuleCall_1; }

		//namedConstraintCS
		public RuleCall getNamedConstraintCSParserRuleCall_2() { return cNamedConstraintCSParserRuleCall_2; }
	}

	public class NamedConstraintCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "namedConstraintCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBodyCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDefCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInvCSParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPostCSParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPreCSParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//namedConstraintCS returns NamedConstraintCS:
		//  bodyCS|defCS|invCS|postCS|preCS;
		public ParserRule getRule() { return rule; }

		//bodyCS|defCS|invCS|postCS|preCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//bodyCS
		public RuleCall getBodyCSParserRuleCall_0() { return cBodyCSParserRuleCall_0; }

		//defCS
		public RuleCall getDefCSParserRuleCall_1() { return cDefCSParserRuleCall_1; }

		//invCS
		public RuleCall getInvCSParserRuleCall_2() { return cInvCSParserRuleCall_2; }

		//postCS
		public RuleCall getPostCSParserRuleCall_3() { return cPostCSParserRuleCall_3; }

		//preCS
		public RuleCall getPreCSParserRuleCall_4() { return cPreCSParserRuleCall_4; }
	}

	public class ExtendedPrimaryExpCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "extendedPrimaryExpCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimaryExpCSParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOclMessageExpCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//extendedPrimaryExpCS returns essentialocl::OclExpressionCS:
		//  primaryExpCS|OclMessageExpCS; 
		//
		//    
		//	
		//	  	 // OclExpressionCS[E]
		public ParserRule getRule() { return rule; }

		//primaryExpCS|OclMessageExpCS 
		//
		//    
		//	
		//	  	 // OclExpressionCS[E]
		public Alternatives getAlternatives() { return cAlternatives; }

		//primaryExpCS
		public RuleCall getPrimaryExpCSParserRuleCall_0() { return cPrimaryExpCSParserRuleCall_0; }

		//OclMessageExpCS 	  	 // OclExpressionCS[E]
		public RuleCall getOclMessageExpCSParserRuleCall_1() { return cOclMessageExpCSParserRuleCall_1; }
	}

	public class OclMessageExpCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OclMessageExpCS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSourcePrimaryExpCSParserRuleCall_0_0 = (RuleCall)cSourceAssignment_0.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final Keyword cOpCircumflexAccentCircumflexAccentKeyword_1_0_0 = (Keyword)cOpAlternatives_1_0.eContents().get(0);
		private final Keyword cOpCircumflexAccentKeyword_1_0_1 = (Keyword)cOpAlternatives_1_0.eContents().get(1);
		private final Assignment cMessageNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMessageNameSimpleNameCSParserRuleCall_2_0 = (RuleCall)cMessageNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cArgumentsAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cArgumentsOclMessageArgCSParserRuleCall_4_0_0 = (RuleCall)cArgumentsAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cArgumentsOclMessageArgCSParserRuleCall_4_1_1_0 = (RuleCall)cArgumentsAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//OclMessageExpCS returns OclMessageCS:
		//  source=primaryExpCS op=( "^^" | "^" ) messageName=simpleNameCS "(" (arguments+=
		//  OclMessageArgCS ("," arguments+=OclMessageArgCS)*)? ")";
		public ParserRule getRule() { return rule; }

		//source=primaryExpCS op=( "^^" | "^" ) messageName=simpleNameCS "(" (arguments+=
		//OclMessageArgCS ("," arguments+=OclMessageArgCS)*)? ")"
		public Group getGroup() { return cGroup; }

		//source=primaryExpCS
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }

		//primaryExpCS
		public RuleCall getSourcePrimaryExpCSParserRuleCall_0_0() { return cSourcePrimaryExpCSParserRuleCall_0_0; }

		//op=( "^^" | "^" )
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }

		//"^^"|"^"
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }

		//"^^"
		public Keyword getOpCircumflexAccentCircumflexAccentKeyword_1_0_0() { return cOpCircumflexAccentCircumflexAccentKeyword_1_0_0; }

		//"^"
		public Keyword getOpCircumflexAccentKeyword_1_0_1() { return cOpCircumflexAccentKeyword_1_0_1; }

		//messageName=simpleNameCS
		public Assignment getMessageNameAssignment_2() { return cMessageNameAssignment_2; }

		//simpleNameCS
		public RuleCall getMessageNameSimpleNameCSParserRuleCall_2_0() { return cMessageNameSimpleNameCSParserRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//(arguments+=OclMessageArgCS ("," arguments+=OclMessageArgCS)*)?
		public Group getGroup_4() { return cGroup_4; }

		//arguments+=OclMessageArgCS
		public Assignment getArgumentsAssignment_4_0() { return cArgumentsAssignment_4_0; }

		//OclMessageArgCS
		public RuleCall getArgumentsOclMessageArgCSParserRuleCall_4_0_0() { return cArgumentsOclMessageArgCSParserRuleCall_4_0_0; }

		//("," arguments+=OclMessageArgCS)*
		public Group getGroup_4_1() { return cGroup_4_1; }

		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }

		//arguments+=OclMessageArgCS
		public Assignment getArgumentsAssignment_4_1_1() { return cArgumentsAssignment_4_1_1; }

		//OclMessageArgCS
		public RuleCall getArgumentsOclMessageArgCSParserRuleCall_4_1_1_0() { return cArgumentsOclMessageArgCSParserRuleCall_4_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class OclMessageArgCSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OclMessageArgCS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cOclMessageArgCSAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cQuestionMarkKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cColonKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cTypeAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cTypeTypeCSParserRuleCall_0_2_1_0 = (RuleCall)cTypeAssignment_0_2_1.eContents().get(0);
		private final RuleCall cOclExpressionCSParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//OclMessageArgCS returns essentialocl::OclExpressionCS:
		//  {OclMessageArgCS} "?" (":" type=typeCS)?|OclExpressionCS;
		public ParserRule getRule() { return rule; }

		//{OclMessageArgCS} "?" (":" type=typeCS)?|OclExpressionCS
		public Alternatives getAlternatives() { return cAlternatives; }

		//{OclMessageArgCS} "?" (":" type=typeCS)?
		public Group getGroup_0() { return cGroup_0; }

		//{OclMessageArgCS}
		public Action getOclMessageArgCSAction_0_0() { return cOclMessageArgCSAction_0_0; }

		//"?"
		public Keyword getQuestionMarkKeyword_0_1() { return cQuestionMarkKeyword_0_1; }

		//(":" type=typeCS)?
		public Group getGroup_0_2() { return cGroup_0_2; }

		//":"
		public Keyword getColonKeyword_0_2_0() { return cColonKeyword_0_2_0; }

		//type=typeCS
		public Assignment getTypeAssignment_0_2_1() { return cTypeAssignment_0_2_1; }

		//typeCS
		public RuleCall getTypeTypeCSParserRuleCall_0_2_1_0() { return cTypeTypeCSParserRuleCall_0_2_1_0; }

		//OclExpressionCS
		public RuleCall getOclExpressionCSParserRuleCall_1() { return cOclExpressionCSParserRuleCall_1; }
	}
	
	
	private ModelElements pModel;
	private FQNElements pFQN;
	private ImportCSElements pImportCS;
	private PackageDeclarationCSElements pPackageDeclarationCS;
	private ContextDeclCSElements pContextDeclCS;
	private PropertyContextDeclCSElements pPropertyContextDeclCS;
	private InitCSElements pInitCS;
	private DerCSElements pDerCS;
	private ClassifierContextDeclCSElements pClassifierContextDeclCS;
	private InvCSElements pInvCS;
	private DefCSElements pDefCS;
	private OperationContextDeclCSElements pOperationContextDeclCS;
	private ParameterCSElements pParameterCS;
	private PreCSElements pPreCS;
	private PostCSElements pPostCS;
	private BodyCSElements pBodyCS;
	private ConstraintCSElements pConstraintCS;
	private NamedConstraintCSElements pNamedConstraintCS;
	private ExtendedPrimaryExpCSElements pExtendedPrimaryExpCS;
	private OclMessageExpCSElements pOclMessageExpCS;
	private OclMessageArgCSElements pOclMessageArgCS;
	
	private final GrammarProvider grammarProvider;

	private EssentialOCLGrammarAccess gaEssentialOCL;

	@Inject
	public CompleteOCLGrammarAccess(GrammarProvider grammarProvider,
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

	
	//Model returns DocumentCS:
	//  imports+=importCS* (packages+=packageDeclarationCS|contexts+=contextDeclCS)*; 
	////generate completeOCL "http://www.eclipse.org/ocl/examples/xtext/completeocl/CompleteOCL"
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//FQN returns ecore::EString:
	//  ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//importCS returns ImportCS:
	//  "import" importedNamespace=FQN;
	public ImportCSElements getImportCSAccess() {
		return (pImportCS != null) ? pImportCS : (pImportCS = new ImportCSElements());
	}
	
	public ParserRule getImportCSRule() {
		return getImportCSAccess().getRule();
	}

	//packageDeclarationCS returns PackageDeclarationCS:
	//  "package" name=pathNameCS contexts+=contextDeclCS* "endpackage";
	public PackageDeclarationCSElements getPackageDeclarationCSAccess() {
		return (pPackageDeclarationCS != null) ? pPackageDeclarationCS : (pPackageDeclarationCS = new PackageDeclarationCSElements());
	}
	
	public ParserRule getPackageDeclarationCSRule() {
		return getPackageDeclarationCSAccess().getRule();
	}

	//contextDeclCS returns ContextDeclCS:
	//  propertyContextDeclCS|classifierContextDeclCS|operationContextDeclCS;
	public ContextDeclCSElements getContextDeclCSAccess() {
		return (pContextDeclCS != null) ? pContextDeclCS : (pContextDeclCS = new ContextDeclCSElements());
	}
	
	public ParserRule getContextDeclCSRule() {
		return getContextDeclCSAccess().getRule();
	}

	//propertyContextDeclCS returns PropertyContextDeclCS:
	//  "context" contextName=pathNameCS ":" type=typeCS ((init=initCS der=derCS?)?|der=derCS
	//  init=initCS?);
	public PropertyContextDeclCSElements getPropertyContextDeclCSAccess() {
		return (pPropertyContextDeclCS != null) ? pPropertyContextDeclCS : (pPropertyContextDeclCS = new PropertyContextDeclCSElements());
	}
	
	public ParserRule getPropertyContextDeclCSRule() {
		return getPropertyContextDeclCSAccess().getRule();
	}

	//initCS returns InitCS:
	//  "init" ":" expression=OclExpressionCS;
	public InitCSElements getInitCSAccess() {
		return (pInitCS != null) ? pInitCS : (pInitCS = new InitCSElements());
	}
	
	public ParserRule getInitCSRule() {
		return getInitCSAccess().getRule();
	}

	//derCS returns DerCS:
	//  "derive" ":" expression=OclExpressionCS;
	public DerCSElements getDerCSAccess() {
		return (pDerCS != null) ? pDerCS : (pDerCS = new DerCSElements());
	}
	
	public ParserRule getDerCSRule() {
		return getDerCSAccess().getRule();
	}

	//classifierContextDeclCS returns ClassifierContextDeclCS:
	//  "context" (selfName=simpleNameCS ":")? contextName=pathNameCS (invs+=invCS|defs+=
	//  defCS)*;
	public ClassifierContextDeclCSElements getClassifierContextDeclCSAccess() {
		return (pClassifierContextDeclCS != null) ? pClassifierContextDeclCS : (pClassifierContextDeclCS = new ClassifierContextDeclCSElements());
	}
	
	public ParserRule getClassifierContextDeclCSRule() {
		return getClassifierContextDeclCSAccess().getRule();
	}

	//invCS returns InvCS:
	//  "inv" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
	public InvCSElements getInvCSAccess() {
		return (pInvCS != null) ? pInvCS : (pInvCS = new InvCSElements());
	}
	
	public ParserRule getInvCSRule() {
		return getInvCSAccess().getRule();
	}

	//defCS returns DefCS:
	//  static?="static"? "def" constraintName=simpleNameCS? ":" constrainedName=
	//  simpleNameCS ("(" (parameters+=parameterCS ("," parameters+=parameterCS)*)? ")")? ":"
	//  type=typeCS? "=" expression=OclExpressionCS;
	public DefCSElements getDefCSAccess() {
		return (pDefCS != null) ? pDefCS : (pDefCS = new DefCSElements());
	}
	
	public ParserRule getDefCSRule() {
		return getDefCSAccess().getRule();
	}

	//operationContextDeclCS returns OperationContextDeclCS:
	//  "context" contextName=pathNameCS "(" (parameters+=parameterCS ("," parameters+=
	//  parameterCS)*)? ")" ":" type=typeCS? (pres+=preCS|posts+=postCS|bodies+=bodyCS)*;
	public OperationContextDeclCSElements getOperationContextDeclCSAccess() {
		return (pOperationContextDeclCS != null) ? pOperationContextDeclCS : (pOperationContextDeclCS = new OperationContextDeclCSElements());
	}
	
	public ParserRule getOperationContextDeclCSRule() {
		return getOperationContextDeclCSAccess().getRule();
	}

	//parameterCS returns essentialocl::VariableCS:
	//  name=simpleNameCS (":" type=typeCS)? ("=" initExpression=OclExpressionCS)?;
	public ParameterCSElements getParameterCSAccess() {
		return (pParameterCS != null) ? pParameterCS : (pParameterCS = new ParameterCSElements());
	}
	
	public ParserRule getParameterCSRule() {
		return getParameterCSAccess().getRule();
	}

	//preCS returns PreCS:
	//  "pre" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
	public PreCSElements getPreCSAccess() {
		return (pPreCS != null) ? pPreCS : (pPreCS = new PreCSElements());
	}
	
	public ParserRule getPreCSRule() {
		return getPreCSAccess().getRule();
	}

	//postCS returns PostCS:
	//  "post" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
	public PostCSElements getPostCSAccess() {
		return (pPostCS != null) ? pPostCS : (pPostCS = new PostCSElements());
	}
	
	public ParserRule getPostCSRule() {
		return getPostCSAccess().getRule();
	}

	//bodyCS returns BodyCS:
	//  "body" constraintName=simpleNameCS? ":" expression=OclExpressionCS;
	public BodyCSElements getBodyCSAccess() {
		return (pBodyCS != null) ? pBodyCS : (pBodyCS = new BodyCSElements());
	}
	
	public ParserRule getBodyCSRule() {
		return getBodyCSAccess().getRule();
	}

	//constraintCS returns ConstraintCS:
	//  initCS|derCS|namedConstraintCS;
	public ConstraintCSElements getConstraintCSAccess() {
		return (pConstraintCS != null) ? pConstraintCS : (pConstraintCS = new ConstraintCSElements());
	}
	
	public ParserRule getConstraintCSRule() {
		return getConstraintCSAccess().getRule();
	}

	//namedConstraintCS returns NamedConstraintCS:
	//  bodyCS|defCS|invCS|postCS|preCS;
	public NamedConstraintCSElements getNamedConstraintCSAccess() {
		return (pNamedConstraintCS != null) ? pNamedConstraintCS : (pNamedConstraintCS = new NamedConstraintCSElements());
	}
	
	public ParserRule getNamedConstraintCSRule() {
		return getNamedConstraintCSAccess().getRule();
	}

	//extendedPrimaryExpCS returns essentialocl::OclExpressionCS:
	//  primaryExpCS|OclMessageExpCS; 
	//
	//    
	//	
	//	  	 // OclExpressionCS[E]
	public ExtendedPrimaryExpCSElements getExtendedPrimaryExpCSAccess() {
		return (pExtendedPrimaryExpCS != null) ? pExtendedPrimaryExpCS : (pExtendedPrimaryExpCS = new ExtendedPrimaryExpCSElements());
	}
	
	public ParserRule getExtendedPrimaryExpCSRule() {
		return getExtendedPrimaryExpCSAccess().getRule();
	}

	//OclMessageExpCS returns OclMessageCS:
	//  source=primaryExpCS op=( "^^" | "^" ) messageName=simpleNameCS "(" (arguments+=
	//  OclMessageArgCS ("," arguments+=OclMessageArgCS)*)? ")";
	public OclMessageExpCSElements getOclMessageExpCSAccess() {
		return (pOclMessageExpCS != null) ? pOclMessageExpCS : (pOclMessageExpCS = new OclMessageExpCSElements());
	}
	
	public ParserRule getOclMessageExpCSRule() {
		return getOclMessageExpCSAccess().getRule();
	}

	//OclMessageArgCS returns essentialocl::OclExpressionCS:
	//  {OclMessageArgCS} "?" (":" type=typeCS)?|OclExpressionCS;
	public OclMessageArgCSElements getOclMessageArgCSAccess() {
		return (pOclMessageArgCS != null) ? pOclMessageArgCS : (pOclMessageArgCS = new OclMessageArgCSElements());
	}
	
	public ParserRule getOclMessageArgCSRule() {
		return getOclMessageArgCSAccess().getRule();
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