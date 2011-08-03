package org.eclipse.ocl.examples.xtext.markup.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.ocl.examples.xtext.markup.services.MarkupGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMarkupParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORD", "RULE_WS", "RULE_NL", "RULE_STRING", "RULE_TEXT", "RULE_ANY_OTHER", "'b['", "'e['", "'fig['", "']'", "'fig:'", "'['", "'fig-['"
    };
    public static final int RULE_ID=4;
    public static final int T__12=12;
    public static final int RULE_WS=6;
    public static final int T__17=17;
    public static final int RULE_NL=7;
    public static final int RULE_TEXT=9;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int RULE_WORD=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__15=15;

    // delegates
    // delegators


        public InternalMarkupParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkupParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkupParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g"; }


     
     	private MarkupGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MarkupGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:62:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:63:1: ( ruleMarkup EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:64:1: ruleMarkup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkup_in_entryRuleMarkup67);
            ruleMarkup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkup74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkup"


    // $ANTLR start "ruleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:71:1: ruleMarkup : ( ( rule__Markup__ElementsAssignment )* ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:75:2: ( ( ( rule__Markup__ElementsAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( ( rule__Markup__ElementsAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( ( rule__Markup__ElementsAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:77:1: ( rule__Markup__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:78:1: ( rule__Markup__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NL)||(LA1_0>=11 && LA1_0<=13)||LA1_0==15||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:78:2: rule__Markup__ElementsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Markup__ElementsAssignment_in_ruleMarkup100);
            	    rule__Markup__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkup"


    // $ANTLR start "entryRuleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:90:1: entryRuleMarkupElement : ruleMarkupElement EOF ;
    public final void entryRuleMarkupElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:91:1: ( ruleMarkupElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:92:1: ruleMarkupElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement128);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkupElement135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkupElement"


    // $ANTLR start "ruleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:99:1: ruleMarkupElement : ( ( rule__MarkupElement__Alternatives ) ) ;
    public final void ruleMarkupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:103:2: ( ( ( rule__MarkupElement__Alternatives ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( ( rule__MarkupElement__Alternatives ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( ( rule__MarkupElement__Alternatives ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:105:1: ( rule__MarkupElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupElementAccess().getAlternatives()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:106:1: ( rule__MarkupElement__Alternatives )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:106:2: rule__MarkupElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MarkupElement__Alternatives_in_ruleMarkupElement161);
            rule__MarkupElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkupElement"


    // $ANTLR start "entryRuleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:118:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:119:1: ( ruleTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:120:1: ruleTextElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_entryRuleTextElement188);
            ruleTextElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextElement195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:127:1: ruleTextElement : ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:131:2: ( ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:133:1: ( ( rule__TextElement__TextAssignment ) ) ( ( rule__TextElement__TextAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:133:1: ( ( rule__TextElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:134:1: ( rule__TextElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:135:1: ( rule__TextElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:135:2: rule__TextElement__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement223);
            rule__TextElement__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }

            }

            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:138:1: ( ( rule__TextElement__TextAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:139:1: ( rule__TextElement__TextAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:1: ( rule__TextElement__TextAssignment )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalMarkup()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_WORD:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (synpred2_InternalMarkup()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_WS:
                    {
                    int LA2_4 = input.LA(2);

                    if ( (synpred2_InternalMarkup()) ) {
                        alt2=1;
                    }


                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:2: rule__TextElement__TextAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement235);
            	    rule__TextElement__TextAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:153:1: entryRuleNewLineElement : ruleNewLineElement EOF ;
    public final void entryRuleNewLineElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:154:1: ( ruleNewLineElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:155:1: ruleNewLineElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement265);
            ruleNewLineElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNewLineElement272); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNewLineElement"


    // $ANTLR start "ruleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:162:1: ruleNewLineElement : ( ( rule__NewLineElement__TextAssignment ) ) ;
    public final void ruleNewLineElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:166:2: ( ( ( rule__NewLineElement__TextAssignment ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:167:1: ( ( rule__NewLineElement__TextAssignment ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:167:1: ( ( rule__NewLineElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:168:1: ( rule__NewLineElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:169:1: ( rule__NewLineElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:169:2: rule__NewLineElement__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NewLineElement__TextAssignment_in_ruleNewLineElement298);
            rule__NewLineElement__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementAccess().getTextAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewLineElement"


    // $ANTLR start "entryRuleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:181:1: entryRuleFontElement : ruleFontElement EOF ;
    public final void entryRuleFontElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:182:1: ( ruleFontElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:183:1: ruleFontElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_entryRuleFontElement325);
            ruleFontElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFontElement332); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFontElement"


    // $ANTLR start "ruleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:190:1: ruleFontElement : ( ( rule__FontElement__Group__0 ) ) ;
    public final void ruleFontElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:194:2: ( ( ( rule__FontElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:195:1: ( ( rule__FontElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:195:1: ( ( rule__FontElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:196:1: ( rule__FontElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:197:1: ( rule__FontElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:197:2: rule__FontElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0_in_ruleFontElement358);
            rule__FontElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontElement"


    // $ANTLR start "entryRuleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:209:1: entryRuleFigElement : ruleFigElement EOF ;
    public final void entryRuleFigElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:210:1: ( ruleFigElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:211:1: ruleFigElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_entryRuleFigElement385);
            ruleFigElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigElement392); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFigElement"


    // $ANTLR start "ruleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:218:1: ruleFigElement : ( ( rule__FigElement__Group__0 ) ) ;
    public final void ruleFigElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:222:2: ( ( ( rule__FigElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:223:1: ( ( rule__FigElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:223:1: ( ( rule__FigElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:224:1: ( rule__FigElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:225:1: ( rule__FigElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:225:2: rule__FigElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__0_in_ruleFigElement418);
            rule__FigElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFigElement"


    // $ANTLR start "entryRuleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:237:1: entryRuleFigRefElement : ruleFigRefElement EOF ;
    public final void entryRuleFigRefElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:238:1: ( ruleFigRefElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:239:1: ruleFigRefElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement445);
            ruleFigRefElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigRefElement452); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFigRefElement"


    // $ANTLR start "ruleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:246:1: ruleFigRefElement : ( ( rule__FigRefElement__Group__0 ) ) ;
    public final void ruleFigRefElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:250:2: ( ( ( rule__FigRefElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:251:1: ( ( rule__FigRefElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:251:1: ( ( rule__FigRefElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:252:1: ( rule__FigRefElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:253:1: ( rule__FigRefElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:253:2: rule__FigRefElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__0_in_ruleFigRefElement478);
            rule__FigRefElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFigRefElement"


    // $ANTLR start "rule__MarkupElement__Alternatives"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:265:1: rule__MarkupElement__Alternatives : ( ( ruleFontElement ) | ( ruleNewLineElement ) | ( ruleTextElement ) | ( ruleFigElement ) | ( ruleFigRefElement ) );
    public final void rule__MarkupElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:269:1: ( ( ruleFontElement ) | ( ruleNewLineElement ) | ( ruleTextElement ) | ( ruleFigElement ) | ( ruleFigRefElement ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt3=1;
                }
                break;
            case RULE_NL:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_WORD:
            case RULE_WS:
                {
                alt3=3;
                }
                break;
            case 13:
            case 15:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:270:1: ( ruleFontElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:270:1: ( ruleFontElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:271:1: ruleFontElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives514);
                    ruleFontElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:276:6: ( ruleNewLineElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:276:6: ( ruleNewLineElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:277:1: ruleNewLineElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives531);
                    ruleNewLineElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:282:6: ( ruleTextElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:282:6: ( ruleTextElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:283:1: ruleTextElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives548);
                    ruleTextElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:288:6: ( ruleFigElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:288:6: ( ruleFigElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:289:1: ruleFigElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_rule__MarkupElement__Alternatives565);
                    ruleFigElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:294:6: ( ruleFigRefElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:294:6: ( ruleFigRefElement )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:295:1: ruleFigRefElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_rule__MarkupElement__Alternatives582);
                    ruleFigRefElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkupElement__Alternatives"


    // $ANTLR start "rule__TextElement__TextAlternatives_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:305:1: rule__TextElement__TextAlternatives_0 : ( ( RULE_ID ) | ( RULE_WORD ) | ( RULE_WS ) );
    public final void rule__TextElement__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:309:1: ( ( RULE_ID ) | ( RULE_WORD ) | ( RULE_WS ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_WORD:
                {
                alt4=2;
                }
                break;
            case RULE_WS:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:310:1: ( RULE_ID )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:310:1: ( RULE_ID )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:311:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextElement__TextAlternatives_0614); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:316:6: ( RULE_WORD )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:316:6: ( RULE_WORD )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:317:1: RULE_WORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_rule__TextElement__TextAlternatives_0631); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:322:6: ( RULE_WS )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:322:6: ( RULE_WS )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:323:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_rule__TextElement__TextAlternatives_0648); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__TextAlternatives_0"


    // $ANTLR start "rule__FontElement__FontAlternatives_0_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:333:1: rule__FontElement__FontAlternatives_0_0 : ( ( 'b[' ) | ( 'e[' ) );
    public final void rule__FontElement__FontAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:337:1: ( ( 'b[' ) | ( 'e[' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:338:1: ( 'b[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:338:1: ( 'b[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:339:1: 'b['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FontElement__FontAlternatives_0_0681); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:346:6: ( 'e[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:346:6: ( 'e[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:347:1: 'e['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FontElement__FontAlternatives_0_0701); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__FontAlternatives_0_0"


    // $ANTLR start "rule__FigElement__Alternatives_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:359:1: rule__FigElement__Alternatives_0 : ( ( 'fig[' ) | ( ( rule__FigElement__Group_0_1__0 ) ) );
    public final void rule__FigElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:363:1: ( ( 'fig[' ) | ( ( rule__FigElement__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:364:1: ( 'fig[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:364:1: ( 'fig[' )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:365:1: 'fig['
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFigElementAccess().getFigKeyword_0_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FigElement__Alternatives_0736); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFigElementAccess().getFigKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:372:6: ( ( rule__FigElement__Group_0_1__0 ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:372:6: ( ( rule__FigElement__Group_0_1__0 ) )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:373:1: ( rule__FigElement__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFigElementAccess().getGroup_0_1()); 
                    }
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:374:1: ( rule__FigElement__Group_0_1__0 )
                    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:374:2: rule__FigElement__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__0_in_rule__FigElement__Alternatives_0755);
                    rule__FigElement__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFigElementAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Alternatives_0"


    // $ANTLR start "rule__FontElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:385:1: rule__FontElement__Group__0 : rule__FontElement__Group__0__Impl rule__FontElement__Group__1 ;
    public final void rule__FontElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:389:1: ( rule__FontElement__Group__0__Impl rule__FontElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:390:2: rule__FontElement__Group__0__Impl rule__FontElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__0786);
            rule__FontElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__0789);
            rule__FontElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__0"


    // $ANTLR start "rule__FontElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:397:1: rule__FontElement__Group__0__Impl : ( ( rule__FontElement__FontAssignment_0 ) ) ;
    public final void rule__FontElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:401:1: ( ( ( rule__FontElement__FontAssignment_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:402:1: ( ( rule__FontElement__FontAssignment_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:402:1: ( ( rule__FontElement__FontAssignment_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:403:1: ( rule__FontElement__FontAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAssignment_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:404:1: ( rule__FontElement__FontAssignment_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:404:2: rule__FontElement__FontAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl816);
            rule__FontElement__FontAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getFontAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__0__Impl"


    // $ANTLR start "rule__FontElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:414:1: rule__FontElement__Group__1 : rule__FontElement__Group__1__Impl rule__FontElement__Group__2 ;
    public final void rule__FontElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:418:1: ( rule__FontElement__Group__1__Impl rule__FontElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:419:2: rule__FontElement__Group__1__Impl rule__FontElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__1846);
            rule__FontElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__1849);
            rule__FontElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__1"


    // $ANTLR start "rule__FontElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:426:1: rule__FontElement__Group__1__Impl : ( ( rule__FontElement__ElementsAssignment_1 )* ) ;
    public final void rule__FontElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:430:1: ( ( ( rule__FontElement__ElementsAssignment_1 )* ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:431:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:431:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:432:1: ( rule__FontElement__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:433:1: ( rule__FontElement__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NL)||(LA7_0>=11 && LA7_0<=13)||LA7_0==15||LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:433:2: rule__FontElement__ElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl876);
            	    rule__FontElement__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__1__Impl"


    // $ANTLR start "rule__FontElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:443:1: rule__FontElement__Group__2 : rule__FontElement__Group__2__Impl ;
    public final void rule__FontElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:447:1: ( rule__FontElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:448:2: rule__FontElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__2907);
            rule__FontElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__2"


    // $ANTLR start "rule__FontElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:454:1: rule__FontElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FontElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:458:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:459:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:459:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:460:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FontElement__Group__2__Impl935); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__Group__2__Impl"


    // $ANTLR start "rule__FigElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:479:1: rule__FigElement__Group__0 : rule__FigElement__Group__0__Impl rule__FigElement__Group__1 ;
    public final void rule__FigElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:483:1: ( rule__FigElement__Group__0__Impl rule__FigElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:484:2: rule__FigElement__Group__0__Impl rule__FigElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__0__Impl_in_rule__FigElement__Group__0972);
            rule__FigElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__1_in_rule__FigElement__Group__0975);
            rule__FigElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__0"


    // $ANTLR start "rule__FigElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:491:1: rule__FigElement__Group__0__Impl : ( ( rule__FigElement__Alternatives_0 ) ) ;
    public final void rule__FigElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:495:1: ( ( ( rule__FigElement__Alternatives_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:496:1: ( ( rule__FigElement__Alternatives_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:496:1: ( ( rule__FigElement__Alternatives_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:497:1: ( rule__FigElement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getAlternatives_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:498:1: ( rule__FigElement__Alternatives_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:498:2: rule__FigElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Alternatives_0_in_rule__FigElement__Group__0__Impl1002);
            rule__FigElement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__0__Impl"


    // $ANTLR start "rule__FigElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:508:1: rule__FigElement__Group__1 : rule__FigElement__Group__1__Impl rule__FigElement__Group__2 ;
    public final void rule__FigElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:512:1: ( rule__FigElement__Group__1__Impl rule__FigElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:513:2: rule__FigElement__Group__1__Impl rule__FigElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__1__Impl_in_rule__FigElement__Group__11032);
            rule__FigElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__2_in_rule__FigElement__Group__11035);
            rule__FigElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__1"


    // $ANTLR start "rule__FigElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:520:1: rule__FigElement__Group__1__Impl : ( ( rule__FigElement__SrcAssignment_1 ) ) ;
    public final void rule__FigElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:524:1: ( ( ( rule__FigElement__SrcAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:525:1: ( ( rule__FigElement__SrcAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:525:1: ( ( rule__FigElement__SrcAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:526:1: ( rule__FigElement__SrcAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getSrcAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:527:1: ( rule__FigElement__SrcAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:527:2: rule__FigElement__SrcAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__SrcAssignment_1_in_rule__FigElement__Group__1__Impl1062);
            rule__FigElement__SrcAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getSrcAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__1__Impl"


    // $ANTLR start "rule__FigElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:537:1: rule__FigElement__Group__2 : rule__FigElement__Group__2__Impl ;
    public final void rule__FigElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:541:1: ( rule__FigElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:542:2: rule__FigElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group__2__Impl_in_rule__FigElement__Group__21092);
            rule__FigElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__2"


    // $ANTLR start "rule__FigElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:548:1: rule__FigElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FigElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:552:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:553:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:553:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:554:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FigElement__Group__2__Impl1120); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group__2__Impl"


    // $ANTLR start "rule__FigElement__Group_0_1__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:573:1: rule__FigElement__Group_0_1__0 : rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1 ;
    public final void rule__FigElement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:577:1: ( rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:578:2: rule__FigElement__Group_0_1__0__Impl rule__FigElement__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__0__Impl_in_rule__FigElement__Group_0_1__01157);
            rule__FigElement__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__1_in_rule__FigElement__Group_0_1__01160);
            rule__FigElement__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__0"


    // $ANTLR start "rule__FigElement__Group_0_1__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:585:1: rule__FigElement__Group_0_1__0__Impl : ( 'fig:' ) ;
    public final void rule__FigElement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:589:1: ( ( 'fig:' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:590:1: ( 'fig:' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:590:1: ( 'fig:' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:591:1: 'fig:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getFigKeyword_0_1_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__FigElement__Group_0_1__0__Impl1188); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getFigKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__0__Impl"


    // $ANTLR start "rule__FigElement__Group_0_1__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:604:1: rule__FigElement__Group_0_1__1 : rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2 ;
    public final void rule__FigElement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:608:1: ( rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:609:2: rule__FigElement__Group_0_1__1__Impl rule__FigElement__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__1__Impl_in_rule__FigElement__Group_0_1__11219);
            rule__FigElement__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__2_in_rule__FigElement__Group_0_1__11222);
            rule__FigElement__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__1"


    // $ANTLR start "rule__FigElement__Group_0_1__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:616:1: rule__FigElement__Group_0_1__1__Impl : ( ( rule__FigElement__IdAssignment_0_1_1 ) ) ;
    public final void rule__FigElement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:620:1: ( ( ( rule__FigElement__IdAssignment_0_1_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:621:1: ( ( rule__FigElement__IdAssignment_0_1_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:621:1: ( ( rule__FigElement__IdAssignment_0_1_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:622:1: ( rule__FigElement__IdAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getIdAssignment_0_1_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:623:1: ( rule__FigElement__IdAssignment_0_1_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:623:2: rule__FigElement__IdAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__IdAssignment_0_1_1_in_rule__FigElement__Group_0_1__1__Impl1249);
            rule__FigElement__IdAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getIdAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__1__Impl"


    // $ANTLR start "rule__FigElement__Group_0_1__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:633:1: rule__FigElement__Group_0_1__2 : rule__FigElement__Group_0_1__2__Impl ;
    public final void rule__FigElement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:637:1: ( rule__FigElement__Group_0_1__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:638:2: rule__FigElement__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigElement__Group_0_1__2__Impl_in_rule__FigElement__Group_0_1__21279);
            rule__FigElement__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__2"


    // $ANTLR start "rule__FigElement__Group_0_1__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:644:1: rule__FigElement__Group_0_1__2__Impl : ( '[' ) ;
    public final void rule__FigElement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:648:1: ( ( '[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:649:1: ( '[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:649:1: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:650:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__FigElement__Group_0_1__2__Impl1307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__Group_0_1__2__Impl"


    // $ANTLR start "rule__FigRefElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:669:1: rule__FigRefElement__Group__0 : rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1 ;
    public final void rule__FigRefElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:673:1: ( rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:674:2: rule__FigRefElement__Group__0__Impl rule__FigRefElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__0__Impl_in_rule__FigRefElement__Group__01344);
            rule__FigRefElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__1_in_rule__FigRefElement__Group__01347);
            rule__FigRefElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__0"


    // $ANTLR start "rule__FigRefElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:681:1: rule__FigRefElement__Group__0__Impl : ( 'fig-[' ) ;
    public final void rule__FigRefElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:685:1: ( ( 'fig-[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:686:1: ( 'fig-[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:686:1: ( 'fig-[' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:687:1: 'fig-['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getFigKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FigRefElement__Group__0__Impl1375); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getFigKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__0__Impl"


    // $ANTLR start "rule__FigRefElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:700:1: rule__FigRefElement__Group__1 : rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2 ;
    public final void rule__FigRefElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:704:1: ( rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:705:2: rule__FigRefElement__Group__1__Impl rule__FigRefElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__1__Impl_in_rule__FigRefElement__Group__11406);
            rule__FigRefElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__2_in_rule__FigRefElement__Group__11409);
            rule__FigRefElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__1"


    // $ANTLR start "rule__FigRefElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:712:1: rule__FigRefElement__Group__1__Impl : ( ( rule__FigRefElement__RefAssignment_1 ) ) ;
    public final void rule__FigRefElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:716:1: ( ( ( rule__FigRefElement__RefAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:717:1: ( ( rule__FigRefElement__RefAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:717:1: ( ( rule__FigRefElement__RefAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:718:1: ( rule__FigRefElement__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:719:1: ( rule__FigRefElement__RefAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:719:2: rule__FigRefElement__RefAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__RefAssignment_1_in_rule__FigRefElement__Group__1__Impl1436);
            rule__FigRefElement__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__1__Impl"


    // $ANTLR start "rule__FigRefElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:729:1: rule__FigRefElement__Group__2 : rule__FigRefElement__Group__2__Impl ;
    public final void rule__FigRefElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:733:1: ( rule__FigRefElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:734:2: rule__FigRefElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FigRefElement__Group__2__Impl_in_rule__FigRefElement__Group__21466);
            rule__FigRefElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__2"


    // $ANTLR start "rule__FigRefElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:740:1: rule__FigRefElement__Group__2__Impl : ( ']' ) ;
    public final void rule__FigRefElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:744:1: ( ( ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:745:1: ( ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:745:1: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:746:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FigRefElement__Group__2__Impl1494); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__Group__2__Impl"


    // $ANTLR start "rule__Markup__ElementsAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:766:1: rule__Markup__ElementsAssignment : ( ruleMarkupElement ) ;
    public final void rule__Markup__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:770:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:771:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:771:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:772:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment1536);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Markup__ElementsAssignment"


    // $ANTLR start "rule__TextElement__TextAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:781:1: rule__TextElement__TextAssignment : ( ( rule__TextElement__TextAlternatives_0 ) ) ;
    public final void rule__TextElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:785:1: ( ( ( rule__TextElement__TextAlternatives_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:786:1: ( ( rule__TextElement__TextAlternatives_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:786:1: ( ( rule__TextElement__TextAlternatives_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:787:1: ( rule__TextElement__TextAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAlternatives_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:788:1: ( rule__TextElement__TextAlternatives_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:788:2: rule__TextElement__TextAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAlternatives_0_in_rule__TextElement__TextAssignment1567);
            rule__TextElement__TextAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__TextAssignment"


    // $ANTLR start "rule__NewLineElement__TextAssignment"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:797:1: rule__NewLineElement__TextAssignment : ( RULE_NL ) ;
    public final void rule__NewLineElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:801:1: ( ( RULE_NL ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:802:1: ( RULE_NL )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:802:1: ( RULE_NL )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:803:1: RULE_NL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
            }
            match(input,RULE_NL,FollowSets000.FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment1600); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewLineElement__TextAssignment"


    // $ANTLR start "rule__FontElement__FontAssignment_0"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:812:1: rule__FontElement__FontAssignment_0 : ( ( rule__FontElement__FontAlternatives_0_0 ) ) ;
    public final void rule__FontElement__FontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:816:1: ( ( ( rule__FontElement__FontAlternatives_0_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:817:1: ( ( rule__FontElement__FontAlternatives_0_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:817:1: ( ( rule__FontElement__FontAlternatives_0_0 ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:818:1: ( rule__FontElement__FontAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAlternatives_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:819:1: ( rule__FontElement__FontAlternatives_0_0 )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:819:2: rule__FontElement__FontAlternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAlternatives_0_0_in_rule__FontElement__FontAssignment_01631);
            rule__FontElement__FontAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getFontAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__FontAssignment_0"


    // $ANTLR start "rule__FontElement__ElementsAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:828:1: rule__FontElement__ElementsAssignment_1 : ( ruleMarkupElement ) ;
    public final void rule__FontElement__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:832:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:833:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:833:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:834:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_11664);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontElement__ElementsAssignment_1"


    // $ANTLR start "rule__FigElement__IdAssignment_0_1_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:843:1: rule__FigElement__IdAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__FigElement__IdAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:847:1: ( ( RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:848:1: ( RULE_ID )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:848:1: ( RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:849:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FigElement__IdAssignment_0_1_11695); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__IdAssignment_0_1_1"


    // $ANTLR start "rule__FigElement__SrcAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:858:1: rule__FigElement__SrcAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FigElement__SrcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:862:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:863:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:863:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:864:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__FigElement__SrcAssignment_11726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigElement__SrcAssignment_1"


    // $ANTLR start "rule__FigRefElement__RefAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:873:1: rule__FigRefElement__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FigRefElement__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:877:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:878:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:878:1: ( ( RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:879:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:880:1: ( RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:881:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFigRefElementAccess().getRefFigElementIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FigRefElement__RefAssignment_11761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRefFigElementIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FigRefElement__RefAssignment_1"

    // $ANTLR start synpred2_InternalMarkup
    public final void synpred2_InternalMarkup_fragment() throws RecognitionException {   
        // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:2: ( rule__TextElement__TextAssignment )
        // ../org.eclipse.ocl.examples.xtext.markup.ui/src-gen/org/eclipse/ocl/examples/xtext/markup/ui/contentassist/antlr/internal/InternalMarkup.g:140:2: rule__TextElement__TextAssignment
        {
        pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_synpred2_InternalMarkup235);
        rule__TextElement__TextAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMarkup

    // Delegated rules

    public final boolean synpred2_InternalMarkup() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMarkup_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkup74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Markup__ElementsAssignment_in_ruleMarkup100 = new BitSet(new long[]{0x000000000002B8F2L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkupElement135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarkupElement__Alternatives_in_ruleMarkupElement161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextElement195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement223 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement235 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNewLineElement272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NewLineElement__TextAssignment_in_ruleNewLineElement298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_entryRuleFontElement325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFontElement332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0_in_ruleFontElement358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_entryRuleFigElement385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigElement392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__0_in_ruleFigElement418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigRefElement452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__0_in_ruleFigRefElement478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_rule__MarkupElement__Alternatives565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_rule__MarkupElement__Alternatives582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextElement__TextAlternatives_0614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WORD_in_rule__TextElement__TextAlternatives_0631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WS_in_rule__TextElement__TextAlternatives_0648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__FontElement__FontAlternatives_0_0681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FontElement__FontAlternatives_0_0701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FigElement__Alternatives_0736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__0_in_rule__FigElement__Alternatives_0755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__0786 = new BitSet(new long[]{0x000000000002F8F0L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__0789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__1846 = new BitSet(new long[]{0x000000000002F8F0L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl876 = new BitSet(new long[]{0x000000000002B8F2L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__2907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FontElement__Group__2__Impl935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__0__Impl_in_rule__FigElement__Group__0972 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__FigElement__Group__1_in_rule__FigElement__Group__0975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Alternatives_0_in_rule__FigElement__Group__0__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__1__Impl_in_rule__FigElement__Group__11032 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FigElement__Group__2_in_rule__FigElement__Group__11035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__SrcAssignment_1_in_rule__FigElement__Group__1__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group__2__Impl_in_rule__FigElement__Group__21092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FigElement__Group__2__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__0__Impl_in_rule__FigElement__Group_0_1__01157 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__1_in_rule__FigElement__Group_0_1__01160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FigElement__Group_0_1__0__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__1__Impl_in_rule__FigElement__Group_0_1__11219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__2_in_rule__FigElement__Group_0_1__11222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__IdAssignment_0_1_1_in_rule__FigElement__Group_0_1__1__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigElement__Group_0_1__2__Impl_in_rule__FigElement__Group_0_1__21279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__FigElement__Group_0_1__2__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__0__Impl_in_rule__FigRefElement__Group__01344 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__1_in_rule__FigRefElement__Group__01347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FigRefElement__Group__0__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__1__Impl_in_rule__FigRefElement__Group__11406 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__2_in_rule__FigRefElement__Group__11409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__RefAssignment_1_in_rule__FigRefElement__Group__1__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FigRefElement__Group__2__Impl_in_rule__FigRefElement__Group__21466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FigRefElement__Group__2__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAlternatives_0_in_rule__TextElement__TextAssignment1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAlternatives_0_0_in_rule__FontElement__FontAssignment_01631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_11664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FigElement__IdAssignment_0_1_11695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__FigElement__SrcAssignment_11726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FigRefElement__RefAssignment_11761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_synpred2_InternalMarkup235 = new BitSet(new long[]{0x0000000000000002L});
    }


}