/*
* generated by Xtext
*/
package org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess;

public class CompleteOCLParser extends AbstractContentAssistParser {
	
	@Inject
	private CompleteOCLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal.InternalCompleteOCLParser createParser() {
		org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal.InternalCompleteOCLParser result = new org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal.InternalCompleteOCLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCompleteOCLDocumentCSAccess().getAlternatives_1(), "rule__CompleteOCLDocumentCS__Alternatives_1");
					put(grammarAccess.getRestrictedKeywordsAccess().getAlternatives(), "rule__RestrictedKeywords__Alternatives");
					put(grammarAccess.getClassifierContextDeclCSAccess().getAlternatives_3(), "rule__ClassifierContextDeclCS__Alternatives_3");
					put(grammarAccess.getClassifierRefCSAccess().getAlternatives(), "rule__ClassifierRefCS__Alternatives");
					put(grammarAccess.getContextDeclCSAccess().getAlternatives(), "rule__ContextDeclCS__Alternatives");
					put(grammarAccess.getOperationContextDeclCSAccess().getAlternatives_7(), "rule__OperationContextDeclCS__Alternatives_7");
					put(grammarAccess.getOperationRefCSAccess().getAlternatives(), "rule__OperationRefCS__Alternatives");
					put(grammarAccess.getPackageRefCSAccess().getAlternatives(), "rule__PackageRefCS__Alternatives");
					put(grammarAccess.getPropertyContextDeclCSAccess().getAlternatives_4(), "rule__PropertyContextDeclCS__Alternatives_4");
					put(grammarAccess.getPropertyRefCSAccess().getAlternatives(), "rule__PropertyRefCS__Alternatives");
					put(grammarAccess.getNavigationExpCSAccess().getAlternatives_1(), "rule__NavigationExpCS__Alternatives_1");
					put(grammarAccess.getNavigationExpCSAccess().getOpAlternatives_1_2_1_0(), "rule__NavigationExpCS__OpAlternatives_1_2_1_0");
					put(grammarAccess.getNavigatingExpCSAccess().getAlternatives_1(), "rule__NavigatingExpCS__Alternatives_1");
					put(grammarAccess.getNavigatingExpCSAccess().getOpAlternatives_1_2_1_0(), "rule__NavigatingExpCS__OpAlternatives_1_2_1_0");
					put(grammarAccess.getOclMessageArgCSAccess().getAlternatives(), "rule__OclMessageArgCS__Alternatives");
					put(grammarAccess.getNUMBER_LITERALAccess().getAlternatives_2_0(), "rule__NUMBER_LITERAL__Alternatives_2_0");
					put(grammarAccess.getNUMBER_LITERALAccess().getAlternatives_2_1(), "rule__NUMBER_LITERAL__Alternatives_2_1");
					put(grammarAccess.getEssentialOCLReservedKeywordsAccess().getAlternatives(), "rule__EssentialOCLReservedKeywords__Alternatives");
					put(grammarAccess.getEssentialOCLRestrictedKeywordsAccess().getAlternatives(), "rule__EssentialOCLRestrictedKeywords__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getPrimitiveTypeIdentifierAccess().getAlternatives(), "rule__PrimitiveTypeIdentifier__Alternatives");
					put(grammarAccess.getCollectionTypeIdentifierAccess().getAlternatives(), "rule__CollectionTypeIdentifier__Alternatives");
					put(grammarAccess.getTypeExpCSAccess().getAlternatives(), "rule__TypeExpCS__Alternatives");
					put(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives(), "rule__PrimitiveLiteralExpCS__Alternatives");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives(), "rule__BooleanLiteralExpCS__Alternatives");
					put(grammarAccess.getExpCSAccess().getAlternatives(), "rule__ExpCS__Alternatives");
					put(grammarAccess.getImpliesCSAccess().getArgumentAlternatives_1_2_0(), "rule__ImpliesCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getXorCSAccess().getArgumentAlternatives_1_2_0(), "rule__XorCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getOrCSAccess().getArgumentAlternatives_1_2_0(), "rule__OrCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getAndCSAccess().getArgumentAlternatives_1_2_0(), "rule__AndCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getEqualityCSAccess().getOpAlternatives_1_1_0(), "rule__EqualityCS__OpAlternatives_1_1_0");
					put(grammarAccess.getEqualityCSAccess().getArgumentAlternatives_1_2_0(), "rule__EqualityCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getRelationalCSAccess().getOpAlternatives_1_1_0(), "rule__RelationalCS__OpAlternatives_1_1_0");
					put(grammarAccess.getRelationalCSAccess().getArgumentAlternatives_1_2_0(), "rule__RelationalCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getAdditiveCSAccess().getOpAlternatives_1_1_0(), "rule__AdditiveCS__OpAlternatives_1_1_0");
					put(grammarAccess.getAdditiveCSAccess().getArgumentAlternatives_1_2_0(), "rule__AdditiveCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getMultiplicativeCSAccess().getOpAlternatives_1_1_0(), "rule__MultiplicativeCS__OpAlternatives_1_1_0");
					put(grammarAccess.getMultiplicativeCSAccess().getArgumentAlternatives_1_2_0(), "rule__MultiplicativeCS__ArgumentAlternatives_1_2_0");
					put(grammarAccess.getUnaryCSAccess().getAlternatives(), "rule__UnaryCS__Alternatives");
					put(grammarAccess.getUnaryCSAccess().getOpAlternatives_1_1_0(), "rule__UnaryCS__OpAlternatives_1_1_0");
					put(grammarAccess.getSubNavigationExpCSAccess().getAlternatives(), "rule__SubNavigationExpCS__Alternatives");
					put(grammarAccess.getSubNavigatingExpCSAccess().getAlternatives(), "rule__SubNavigatingExpCS__Alternatives");
					put(grammarAccess.getRoundBracketExpCSAccess().getAlternatives_2_1(), "rule__RoundBracketExpCS__Alternatives_2_1");
					put(grammarAccess.getNameExpCSAccess().getAlternatives(), "rule__NameExpCS__Alternatives");
					put(grammarAccess.getCompleteOCLDocumentCSAccess().getGroup(), "rule__CompleteOCLDocumentCS__Group__0");
					put(grammarAccess.getBodyCSAccess().getGroup(), "rule__BodyCS__Group__0");
					put(grammarAccess.getClassifierContextDeclCSAccess().getGroup(), "rule__ClassifierContextDeclCS__Group__0");
					put(grammarAccess.getClassifierContextDeclCSAccess().getGroup_1(), "rule__ClassifierContextDeclCS__Group_1__0");
					put(grammarAccess.getDefCSAccess().getGroup(), "rule__DefCS__Group__0");
					put(grammarAccess.getDefCSAccess().getGroup_5(), "rule__DefCS__Group_5__0");
					put(grammarAccess.getDefCSAccess().getGroup_5_1(), "rule__DefCS__Group_5_1__0");
					put(grammarAccess.getDefCSAccess().getGroup_5_1_1(), "rule__DefCS__Group_5_1_1__0");
					put(grammarAccess.getDerCSAccess().getGroup(), "rule__DerCS__Group__0");
					put(grammarAccess.getImportCSAccess().getGroup(), "rule__ImportCS__Group__0");
					put(grammarAccess.getImportCSAccess().getGroup_1(), "rule__ImportCS__Group_1__0");
					put(grammarAccess.getInitCSAccess().getGroup(), "rule__InitCS__Group__0");
					put(grammarAccess.getInvCSAccess().getGroup(), "rule__InvCS__Group__0");
					put(grammarAccess.getOperationContextDeclCSAccess().getGroup(), "rule__OperationContextDeclCS__Group__0");
					put(grammarAccess.getOperationContextDeclCSAccess().getGroup_3(), "rule__OperationContextDeclCS__Group_3__0");
					put(grammarAccess.getOperationContextDeclCSAccess().getGroup_3_1(), "rule__OperationContextDeclCS__Group_3_1__0");
					put(grammarAccess.getPackageDeclarationCSAccess().getGroup(), "rule__PackageDeclarationCS__Group__0");
					put(grammarAccess.getParameterCSAccess().getGroup(), "rule__ParameterCS__Group__0");
					put(grammarAccess.getParameterCSAccess().getGroup_1(), "rule__ParameterCS__Group_1__0");
					put(grammarAccess.getParameterCSAccess().getGroup_2(), "rule__ParameterCS__Group_2__0");
					put(grammarAccess.getPostCSAccess().getGroup(), "rule__PostCS__Group__0");
					put(grammarAccess.getPreCSAccess().getGroup(), "rule__PreCS__Group__0");
					put(grammarAccess.getPropertyContextDeclCSAccess().getGroup(), "rule__PropertyContextDeclCS__Group__0");
					put(grammarAccess.getPropertyContextDeclCSAccess().getGroup_4_0(), "rule__PropertyContextDeclCS__Group_4_0__0");
					put(grammarAccess.getPropertyContextDeclCSAccess().getGroup_4_1(), "rule__PropertyContextDeclCS__Group_4_1__0");
					put(grammarAccess.getQualifiedClassifierRefCSAccess().getGroup(), "rule__QualifiedClassifierRefCS__Group__0");
					put(grammarAccess.getQualifiedOperationRefCSAccess().getGroup(), "rule__QualifiedOperationRefCS__Group__0");
					put(grammarAccess.getQualifiedPropertyRefCSAccess().getGroup(), "rule__QualifiedPropertyRefCS__Group__0");
					put(grammarAccess.getQualifiedPackageRefCSAccess().getGroup(), "rule__QualifiedPackageRefCS__Group__0");
					put(grammarAccess.getNavigationExpCSAccess().getGroup(), "rule__NavigationExpCS__Group__0");
					put(grammarAccess.getNavigationExpCSAccess().getGroup_1_0(), "rule__NavigationExpCS__Group_1_0__0");
					put(grammarAccess.getNavigationExpCSAccess().getGroup_1_1(), "rule__NavigationExpCS__Group_1_1__0");
					put(grammarAccess.getNavigationExpCSAccess().getGroup_1_2(), "rule__NavigationExpCS__Group_1_2__0");
					put(grammarAccess.getNavigationExpCSAccess().getGroup_1_2_4(), "rule__NavigationExpCS__Group_1_2_4__0");
					put(grammarAccess.getNavigationExpCSAccess().getGroup_1_2_4_1(), "rule__NavigationExpCS__Group_1_2_4_1__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup(), "rule__NavigatingExpCS__Group__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_0(), "rule__NavigatingExpCS__Group_1_0__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_1(), "rule__NavigatingExpCS__Group_1_1__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2(), "rule__NavigatingExpCS__Group_1_2__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_4(), "rule__NavigatingExpCS__Group_1_2_4__0");
					put(grammarAccess.getNavigatingExpCSAccess().getGroup_1_2_4_1(), "rule__NavigatingExpCS__Group_1_2_4_1__0");
					put(grammarAccess.getOclMessageArgCSAccess().getGroup_0(), "rule__OclMessageArgCS__Group_0__0");
					put(grammarAccess.getOclMessageArgCSAccess().getGroup_0_2(), "rule__OclMessageArgCS__Group_0_2__0");
					put(grammarAccess.getNUMBER_LITERALAccess().getGroup(), "rule__NUMBER_LITERAL__Group__0");
					put(grammarAccess.getNUMBER_LITERALAccess().getGroup_1(), "rule__NUMBER_LITERAL__Group_1__0");
					put(grammarAccess.getNUMBER_LITERALAccess().getGroup_2(), "rule__NUMBER_LITERAL__Group_2__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup(), "rule__CollectionTypeCS__Group__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup_1(), "rule__CollectionTypeCS__Group_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup(), "rule__TupleTypeCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_2(), "rule__TupleTypeCS__Group_2__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_2_1(), "rule__TupleTypeCS__Group_2_1__0");
					put(grammarAccess.getTuplePartCSAccess().getGroup(), "rule__TuplePartCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup(), "rule__CollectionLiteralExpCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_1(), "rule__CollectionLiteralExpCS__Group_1__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_1_2(), "rule__CollectionLiteralExpCS__Group_1_2__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_1_2_1(), "rule__CollectionLiteralExpCS__Group_1_2_1__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup(), "rule__CollectionLiteralPartCS__Group__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1(), "rule__CollectionLiteralPartCS__Group_1__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup(), "rule__TupleLiteralExpCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup_2(), "rule__TupleLiteralExpCS__Group_2__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup_2_2(), "rule__TupleLiteralExpCS__Group_2_2__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup(), "rule__TupleLiteralPartCS__Group__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1(), "rule__TupleLiteralPartCS__Group_1__0");
					put(grammarAccess.getInvalidLiteralExpCSAccess().getGroup(), "rule__InvalidLiteralExpCS__Group__0");
					put(grammarAccess.getNullLiteralExpCSAccess().getGroup(), "rule__NullLiteralExpCS__Group__0");
					put(grammarAccess.getImpliesCSAccess().getGroup(), "rule__ImpliesCS__Group__0");
					put(grammarAccess.getImpliesCSAccess().getGroup_1(), "rule__ImpliesCS__Group_1__0");
					put(grammarAccess.getXorCSAccess().getGroup(), "rule__XorCS__Group__0");
					put(grammarAccess.getXorCSAccess().getGroup_1(), "rule__XorCS__Group_1__0");
					put(grammarAccess.getOrCSAccess().getGroup(), "rule__OrCS__Group__0");
					put(grammarAccess.getOrCSAccess().getGroup_1(), "rule__OrCS__Group_1__0");
					put(grammarAccess.getAndCSAccess().getGroup(), "rule__AndCS__Group__0");
					put(grammarAccess.getAndCSAccess().getGroup_1(), "rule__AndCS__Group_1__0");
					put(grammarAccess.getEqualityCSAccess().getGroup(), "rule__EqualityCS__Group__0");
					put(grammarAccess.getEqualityCSAccess().getGroup_1(), "rule__EqualityCS__Group_1__0");
					put(grammarAccess.getRelationalCSAccess().getGroup(), "rule__RelationalCS__Group__0");
					put(grammarAccess.getRelationalCSAccess().getGroup_1(), "rule__RelationalCS__Group_1__0");
					put(grammarAccess.getAdditiveCSAccess().getGroup(), "rule__AdditiveCS__Group__0");
					put(grammarAccess.getAdditiveCSAccess().getGroup_1(), "rule__AdditiveCS__Group_1__0");
					put(grammarAccess.getMultiplicativeCSAccess().getGroup(), "rule__MultiplicativeCS__Group__0");
					put(grammarAccess.getMultiplicativeCSAccess().getGroup_1(), "rule__MultiplicativeCS__Group_1__0");
					put(grammarAccess.getUnaryCSAccess().getGroup_1(), "rule__UnaryCS__Group_1__0");
					put(grammarAccess.getSubNavigationExpCSAccess().getGroup_8(), "rule__SubNavigationExpCS__Group_8__0");
					put(grammarAccess.getIteratorVariableCSAccess().getGroup(), "rule__IteratorVariableCS__Group__0");
					put(grammarAccess.getIteratorVariableCSAccess().getGroup_1(), "rule__IteratorVariableCS__Group_1__0");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getGroup(), "rule__IteratorAccumulatorCS__Group__0");
					put(grammarAccess.getRoundBracketExpCSAccess().getGroup(), "rule__RoundBracketExpCS__Group__0");
					put(grammarAccess.getRoundBracketExpCSAccess().getGroup_2(), "rule__RoundBracketExpCS__Group_2__0");
					put(grammarAccess.getRoundBracketExpCSAccess().getGroup_2_1_0(), "rule__RoundBracketExpCS__Group_2_1_0__0");
					put(grammarAccess.getRoundBracketExpCSAccess().getGroup_2_1_1(), "rule__RoundBracketExpCS__Group_2_1_1__0");
					put(grammarAccess.getRoundBracketExpCSAccess().getGroup_3(), "rule__RoundBracketExpCS__Group_3__0");
					put(grammarAccess.getRoundBracketExpCSAccess().getGroup_3_1(), "rule__RoundBracketExpCS__Group_3_1__0");
					put(grammarAccess.getSquareBracketExpCSAccess().getGroup(), "rule__SquareBracketExpCS__Group__0");
					put(grammarAccess.getSquareBracketExpCSAccess().getGroup_3(), "rule__SquareBracketExpCS__Group_3__0");
					put(grammarAccess.getSelfExpCSAccess().getGroup(), "rule__SelfExpCS__Group__0");
					put(grammarAccess.getPathNameExpCSAccess().getGroup(), "rule__PathNameExpCS__Group__0");
					put(grammarAccess.getIfExpCSAccess().getGroup(), "rule__IfExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup(), "rule__LetExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup_2(), "rule__LetExpCS__Group_2__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup(), "rule__LetVariableCS__Group__0");
					put(grammarAccess.getCompleteOCLDocumentCSAccess().getImportsAssignment_0(), "rule__CompleteOCLDocumentCS__ImportsAssignment_0");
					put(grammarAccess.getCompleteOCLDocumentCSAccess().getPackagesAssignment_1_0(), "rule__CompleteOCLDocumentCS__PackagesAssignment_1_0");
					put(grammarAccess.getCompleteOCLDocumentCSAccess().getContextsAssignment_1_1(), "rule__CompleteOCLDocumentCS__ContextsAssignment_1_1");
					put(grammarAccess.getBodyCSAccess().getConstraintNameAssignment_1(), "rule__BodyCS__ConstraintNameAssignment_1");
					put(grammarAccess.getBodyCSAccess().getExpressionAssignment_3(), "rule__BodyCS__ExpressionAssignment_3");
					put(grammarAccess.getClassifierContextDeclCSAccess().getSelfNameAssignment_1_0(), "rule__ClassifierContextDeclCS__SelfNameAssignment_1_0");
					put(grammarAccess.getClassifierContextDeclCSAccess().getClassifierAssignment_2(), "rule__ClassifierContextDeclCS__ClassifierAssignment_2");
					put(grammarAccess.getClassifierContextDeclCSAccess().getInvsAssignment_3_0(), "rule__ClassifierContextDeclCS__InvsAssignment_3_0");
					put(grammarAccess.getClassifierContextDeclCSAccess().getDefsAssignment_3_1(), "rule__ClassifierContextDeclCS__DefsAssignment_3_1");
					put(grammarAccess.getDefCSAccess().getStaticAssignment_0(), "rule__DefCS__StaticAssignment_0");
					put(grammarAccess.getDefCSAccess().getConstraintNameAssignment_2(), "rule__DefCS__ConstraintNameAssignment_2");
					put(grammarAccess.getDefCSAccess().getConstrainedNameAssignment_4(), "rule__DefCS__ConstrainedNameAssignment_4");
					put(grammarAccess.getDefCSAccess().getParametersAssignment_5_1_0(), "rule__DefCS__ParametersAssignment_5_1_0");
					put(grammarAccess.getDefCSAccess().getParametersAssignment_5_1_1_1(), "rule__DefCS__ParametersAssignment_5_1_1_1");
					put(grammarAccess.getDefCSAccess().getTypeAssignment_7(), "rule__DefCS__TypeAssignment_7");
					put(grammarAccess.getDefCSAccess().getExpressionAssignment_9(), "rule__DefCS__ExpressionAssignment_9");
					put(grammarAccess.getDerCSAccess().getExpressionAssignment_2(), "rule__DerCS__ExpressionAssignment_2");
					put(grammarAccess.getImportCSAccess().getNameAssignment_1_0(), "rule__ImportCS__NameAssignment_1_0");
					put(grammarAccess.getImportCSAccess().getNamespaceAssignment_2(), "rule__ImportCS__NamespaceAssignment_2");
					put(grammarAccess.getInitCSAccess().getExpressionAssignment_2(), "rule__InitCS__ExpressionAssignment_2");
					put(grammarAccess.getInvCSAccess().getConstraintNameAssignment_1(), "rule__InvCS__ConstraintNameAssignment_1");
					put(grammarAccess.getInvCSAccess().getExpressionAssignment_3(), "rule__InvCS__ExpressionAssignment_3");
					put(grammarAccess.getOperationContextDeclCSAccess().getOperationAssignment_1(), "rule__OperationContextDeclCS__OperationAssignment_1");
					put(grammarAccess.getOperationContextDeclCSAccess().getParametersAssignment_3_0(), "rule__OperationContextDeclCS__ParametersAssignment_3_0");
					put(grammarAccess.getOperationContextDeclCSAccess().getParametersAssignment_3_1_1(), "rule__OperationContextDeclCS__ParametersAssignment_3_1_1");
					put(grammarAccess.getOperationContextDeclCSAccess().getTypeAssignment_6(), "rule__OperationContextDeclCS__TypeAssignment_6");
					put(grammarAccess.getOperationContextDeclCSAccess().getPresAssignment_7_0(), "rule__OperationContextDeclCS__PresAssignment_7_0");
					put(grammarAccess.getOperationContextDeclCSAccess().getPostsAssignment_7_1(), "rule__OperationContextDeclCS__PostsAssignment_7_1");
					put(grammarAccess.getOperationContextDeclCSAccess().getBodiesAssignment_7_2(), "rule__OperationContextDeclCS__BodiesAssignment_7_2");
					put(grammarAccess.getPackageDeclarationCSAccess().getPackageAssignment_1(), "rule__PackageDeclarationCS__PackageAssignment_1");
					put(grammarAccess.getPackageDeclarationCSAccess().getContextsAssignment_2(), "rule__PackageDeclarationCS__ContextsAssignment_2");
					put(grammarAccess.getParameterCSAccess().getNameAssignment_0(), "rule__ParameterCS__NameAssignment_0");
					put(grammarAccess.getParameterCSAccess().getTypeAssignment_1_1(), "rule__ParameterCS__TypeAssignment_1_1");
					put(grammarAccess.getParameterCSAccess().getInitExpressionAssignment_2_1(), "rule__ParameterCS__InitExpressionAssignment_2_1");
					put(grammarAccess.getPostCSAccess().getConstraintNameAssignment_1(), "rule__PostCS__ConstraintNameAssignment_1");
					put(grammarAccess.getPostCSAccess().getExpressionAssignment_3(), "rule__PostCS__ExpressionAssignment_3");
					put(grammarAccess.getPreCSAccess().getConstraintNameAssignment_1(), "rule__PreCS__ConstraintNameAssignment_1");
					put(grammarAccess.getPreCSAccess().getExpressionAssignment_3(), "rule__PreCS__ExpressionAssignment_3");
					put(grammarAccess.getPropertyContextDeclCSAccess().getPropertyAssignment_1(), "rule__PropertyContextDeclCS__PropertyAssignment_1");
					put(grammarAccess.getPropertyContextDeclCSAccess().getTypeAssignment_3(), "rule__PropertyContextDeclCS__TypeAssignment_3");
					put(grammarAccess.getPropertyContextDeclCSAccess().getInitAssignment_4_0_0(), "rule__PropertyContextDeclCS__InitAssignment_4_0_0");
					put(grammarAccess.getPropertyContextDeclCSAccess().getDerAssignment_4_0_1(), "rule__PropertyContextDeclCS__DerAssignment_4_0_1");
					put(grammarAccess.getPropertyContextDeclCSAccess().getDerAssignment_4_1_0(), "rule__PropertyContextDeclCS__DerAssignment_4_1_0");
					put(grammarAccess.getPropertyContextDeclCSAccess().getInitAssignment_4_1_1(), "rule__PropertyContextDeclCS__InitAssignment_4_1_1");
					put(grammarAccess.getQualifiedClassifierRefCSAccess().getNamespaceAssignment_0(), "rule__QualifiedClassifierRefCS__NamespaceAssignment_0");
					put(grammarAccess.getQualifiedClassifierRefCSAccess().getClassifierAssignment_2(), "rule__QualifiedClassifierRefCS__ClassifierAssignment_2");
					put(grammarAccess.getQualifiedOperationRefCSAccess().getNamespaceAssignment_0(), "rule__QualifiedOperationRefCS__NamespaceAssignment_0");
					put(grammarAccess.getQualifiedOperationRefCSAccess().getOperationAssignment_2(), "rule__QualifiedOperationRefCS__OperationAssignment_2");
					put(grammarAccess.getQualifiedPropertyRefCSAccess().getNamespaceAssignment_0(), "rule__QualifiedPropertyRefCS__NamespaceAssignment_0");
					put(grammarAccess.getQualifiedPropertyRefCSAccess().getFeatureAssignment_2(), "rule__QualifiedPropertyRefCS__FeatureAssignment_2");
					put(grammarAccess.getQualifiedPackageRefCSAccess().getNamespaceAssignment_0(), "rule__QualifiedPackageRefCS__NamespaceAssignment_0");
					put(grammarAccess.getQualifiedPackageRefCSAccess().getPackageAssignment_2(), "rule__QualifiedPackageRefCS__PackageAssignment_2");
					put(grammarAccess.getSimpleClassifierRefCSAccess().getClassifierAssignment(), "rule__SimpleClassifierRefCS__ClassifierAssignment");
					put(grammarAccess.getSimpleOperationRefCSAccess().getOperationAssignment(), "rule__SimpleOperationRefCS__OperationAssignment");
					put(grammarAccess.getSimplePackageRefCSAccess().getPackageAssignment(), "rule__SimplePackageRefCS__PackageAssignment");
					put(grammarAccess.getSimplePropertyRefCSAccess().getFeatureAssignment(), "rule__SimplePropertyRefCS__FeatureAssignment");
					put(grammarAccess.getNavigationExpCSAccess().getArgumentAssignment_1_0_2(), "rule__NavigationExpCS__ArgumentAssignment_1_0_2");
					put(grammarAccess.getNavigationExpCSAccess().getArgumentAssignment_1_1_2(), "rule__NavigationExpCS__ArgumentAssignment_1_1_2");
					put(grammarAccess.getNavigationExpCSAccess().getOpAssignment_1_2_1(), "rule__NavigationExpCS__OpAssignment_1_2_1");
					put(grammarAccess.getNavigationExpCSAccess().getMessageNameAssignment_1_2_2(), "rule__NavigationExpCS__MessageNameAssignment_1_2_2");
					put(grammarAccess.getNavigationExpCSAccess().getArgumentsAssignment_1_2_4_0(), "rule__NavigationExpCS__ArgumentsAssignment_1_2_4_0");
					put(grammarAccess.getNavigationExpCSAccess().getArgumentsAssignment_1_2_4_1_1(), "rule__NavigationExpCS__ArgumentsAssignment_1_2_4_1_1");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_0_2(), "rule__NavigatingExpCS__ArgumentAssignment_1_0_2");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentAssignment_1_1_2(), "rule__NavigatingExpCS__ArgumentAssignment_1_1_2");
					put(grammarAccess.getNavigatingExpCSAccess().getOpAssignment_1_2_1(), "rule__NavigatingExpCS__OpAssignment_1_2_1");
					put(grammarAccess.getNavigatingExpCSAccess().getMessageNameAssignment_1_2_2(), "rule__NavigatingExpCS__MessageNameAssignment_1_2_2");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentsAssignment_1_2_4_0(), "rule__NavigatingExpCS__ArgumentsAssignment_1_2_4_0");
					put(grammarAccess.getNavigatingExpCSAccess().getArgumentsAssignment_1_2_4_1_1(), "rule__NavigatingExpCS__ArgumentsAssignment_1_2_4_1_1");
					put(grammarAccess.getOclMessageArgCSAccess().getTypeAssignment_0_2_1(), "rule__OclMessageArgCS__TypeAssignment_0_2_1");
					put(grammarAccess.getPrimitiveTypeCSAccess().getNameAssignment(), "rule__PrimitiveTypeCS__NameAssignment");
					put(grammarAccess.getCollectionTypeCSAccess().getNameAssignment_0(), "rule__CollectionTypeCS__NameAssignment_0");
					put(grammarAccess.getCollectionTypeCSAccess().getTypeCSAssignment_1_1(), "rule__CollectionTypeCS__TypeCSAssignment_1_1");
					put(grammarAccess.getTupleTypeCSAccess().getNameAssignment_0(), "rule__TupleTypeCS__NameAssignment_0");
					put(grammarAccess.getTupleTypeCSAccess().getPartAssignment_2_0(), "rule__TupleTypeCS__PartAssignment_2_0");
					put(grammarAccess.getTupleTypeCSAccess().getPartAssignment_2_1_1(), "rule__TupleTypeCS__PartAssignment_2_1_1");
					put(grammarAccess.getTuplePartCSAccess().getNameAssignment_0(), "rule__TuplePartCS__NameAssignment_0");
					put(grammarAccess.getTuplePartCSAccess().getTypeAssignment_2(), "rule__TuplePartCS__TypeAssignment_2");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsAssignment_1_2_0(), "rule__CollectionLiteralExpCS__CollectionLiteralPartsAssignment_1_2_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getCollectionLiteralPartsAssignment_1_2_1_1(), "rule__CollectionLiteralExpCS__CollectionLiteralPartsAssignment_1_2_1_1");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0(), "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1(), "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1");
					put(grammarAccess.getTupleLiteralExpCSAccess().getPartAssignment_2_1(), "rule__TupleLiteralExpCS__PartAssignment_2_1");
					put(grammarAccess.getTupleLiteralExpCSAccess().getPartAssignment_2_2_1(), "rule__TupleLiteralExpCS__PartAssignment_2_2_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0(), "rule__TupleLiteralPartCS__NameAssignment_0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getTypeAssignment_1_1(), "rule__TupleLiteralPartCS__TypeAssignment_1_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3(), "rule__TupleLiteralPartCS__InitExpressionAssignment_3");
					put(grammarAccess.getNumberLiteralExpCSAccess().getNameAssignment(), "rule__NumberLiteralExpCS__NameAssignment");
					put(grammarAccess.getStringLiteralExpCSAccess().getNameAssignment(), "rule__StringLiteralExpCS__NameAssignment");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_0(), "rule__BooleanLiteralExpCS__NameAssignment_0");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_1(), "rule__BooleanLiteralExpCS__NameAssignment_1");
					put(grammarAccess.getImpliesCSAccess().getOpAssignment_1_1(), "rule__ImpliesCS__OpAssignment_1_1");
					put(grammarAccess.getImpliesCSAccess().getArgumentAssignment_1_2(), "rule__ImpliesCS__ArgumentAssignment_1_2");
					put(grammarAccess.getXorCSAccess().getOpAssignment_1_1(), "rule__XorCS__OpAssignment_1_1");
					put(grammarAccess.getXorCSAccess().getArgumentAssignment_1_2(), "rule__XorCS__ArgumentAssignment_1_2");
					put(grammarAccess.getOrCSAccess().getOpAssignment_1_1(), "rule__OrCS__OpAssignment_1_1");
					put(grammarAccess.getOrCSAccess().getArgumentAssignment_1_2(), "rule__OrCS__ArgumentAssignment_1_2");
					put(grammarAccess.getAndCSAccess().getOpAssignment_1_1(), "rule__AndCS__OpAssignment_1_1");
					put(grammarAccess.getAndCSAccess().getArgumentAssignment_1_2(), "rule__AndCS__ArgumentAssignment_1_2");
					put(grammarAccess.getEqualityCSAccess().getOpAssignment_1_1(), "rule__EqualityCS__OpAssignment_1_1");
					put(grammarAccess.getEqualityCSAccess().getArgumentAssignment_1_2(), "rule__EqualityCS__ArgumentAssignment_1_2");
					put(grammarAccess.getRelationalCSAccess().getOpAssignment_1_1(), "rule__RelationalCS__OpAssignment_1_1");
					put(grammarAccess.getRelationalCSAccess().getArgumentAssignment_1_2(), "rule__RelationalCS__ArgumentAssignment_1_2");
					put(grammarAccess.getAdditiveCSAccess().getOpAssignment_1_1(), "rule__AdditiveCS__OpAssignment_1_1");
					put(grammarAccess.getAdditiveCSAccess().getArgumentAssignment_1_2(), "rule__AdditiveCS__ArgumentAssignment_1_2");
					put(grammarAccess.getMultiplicativeCSAccess().getOpAssignment_1_1(), "rule__MultiplicativeCS__OpAssignment_1_1");
					put(grammarAccess.getMultiplicativeCSAccess().getArgumentAssignment_1_2(), "rule__MultiplicativeCS__ArgumentAssignment_1_2");
					put(grammarAccess.getUnaryCSAccess().getOpAssignment_1_1(), "rule__UnaryCS__OpAssignment_1_1");
					put(grammarAccess.getUnaryCSAccess().getSourceAssignment_1_2(), "rule__UnaryCS__SourceAssignment_1_2");
					put(grammarAccess.getSubNavigationExpCSAccess().getSourceAssignment_8_2(), "rule__SubNavigationExpCS__SourceAssignment_8_2");
					put(grammarAccess.getIteratorVariableCSAccess().getNameAssignment_0(), "rule__IteratorVariableCS__NameAssignment_0");
					put(grammarAccess.getIteratorVariableCSAccess().getTypeAssignment_1_1(), "rule__IteratorVariableCS__TypeAssignment_1_1");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getNameAssignment_0(), "rule__IteratorAccumulatorCS__NameAssignment_0");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getTypeAssignment_2(), "rule__IteratorAccumulatorCS__TypeAssignment_2");
					put(grammarAccess.getIteratorAccumulatorCSAccess().getInitExpressionAssignment_4(), "rule__IteratorAccumulatorCS__InitExpressionAssignment_4");
					put(grammarAccess.getRoundBracketExpCSAccess().getNameAssignment_0(), "rule__RoundBracketExpCS__NameAssignment_0");
					put(grammarAccess.getRoundBracketExpCSAccess().getVariable1Assignment_2_0(), "rule__RoundBracketExpCS__Variable1Assignment_2_0");
					put(grammarAccess.getRoundBracketExpCSAccess().getVariable2Assignment_2_1_0_1(), "rule__RoundBracketExpCS__Variable2Assignment_2_1_0_1");
					put(grammarAccess.getRoundBracketExpCSAccess().getVariable2Assignment_2_1_1_1(), "rule__RoundBracketExpCS__Variable2Assignment_2_1_1_1");
					put(grammarAccess.getRoundBracketExpCSAccess().getArgumentsAssignment_3_0(), "rule__RoundBracketExpCS__ArgumentsAssignment_3_0");
					put(grammarAccess.getRoundBracketExpCSAccess().getArgumentsAssignment_3_1_1(), "rule__RoundBracketExpCS__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getSquareBracketExpCSAccess().getNameAssignment_0(), "rule__SquareBracketExpCS__NameAssignment_0");
					put(grammarAccess.getSquareBracketExpCSAccess().getArgumentsAssignment_2(), "rule__SquareBracketExpCS__ArgumentsAssignment_2");
					put(grammarAccess.getSquareBracketExpCSAccess().getArgumentsAssignment_3_1(), "rule__SquareBracketExpCS__ArgumentsAssignment_3_1");
					put(grammarAccess.getPathNameExpCSAccess().getNamespaceAssignment_0(), "rule__PathNameExpCS__NamespaceAssignment_0");
					put(grammarAccess.getPathNameExpCSAccess().getElementAssignment_2(), "rule__PathNameExpCS__ElementAssignment_2");
					put(grammarAccess.getSimpleNameExpCSAccess().getElementAssignment(), "rule__SimpleNameExpCS__ElementAssignment");
					put(grammarAccess.getIfExpCSAccess().getConditionAssignment_1(), "rule__IfExpCS__ConditionAssignment_1");
					put(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3(), "rule__IfExpCS__ThenExpressionAssignment_3");
					put(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5(), "rule__IfExpCS__ElseExpressionAssignment_5");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_1(), "rule__LetExpCS__VariableAssignment_1");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1(), "rule__LetExpCS__VariableAssignment_2_1");
					put(grammarAccess.getLetExpCSAccess().getInAssignment_4(), "rule__LetExpCS__InAssignment_4");
					put(grammarAccess.getLetVariableCSAccess().getNameAssignment_0(), "rule__LetVariableCS__NameAssignment_0");
					put(grammarAccess.getLetVariableCSAccess().getTypeAssignment_2(), "rule__LetVariableCS__TypeAssignment_2");
					put(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_4(), "rule__LetVariableCS__InitExpressionAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal.InternalCompleteOCLParser typedParser = (org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal.InternalCompleteOCLParser) parser;
			typedParser.entryRuleCompleteOCLDocumentCS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CompleteOCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CompleteOCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}