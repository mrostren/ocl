package org.eclipse.ocl.examples.xtext.base.ui.contentassist.antlr.internal; 

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
import org.eclipse.ocl.examples.xtext.base.services.MarkupGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMarkupParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_NL", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'</i>'", "'<img'", "'src'", "'='", "'/>'", "'alt'", "'def'", "'</b1>'", "'</b2>'", "'<ref'", "'<i>'", "'<b1>'", "'<b2>'"
    };
    public static final int T__12=12;
    public static final int T__20=20;
    public static final int RULE_TEXT=4;
    public static final int T__13=13;
    public static final int RULE_STRING=6;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__9=9;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int RULE_WS=7;
    public static final int T__17=17;
    public static final int RULE_NL=5;
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__10=10;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__18=18;
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
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g"; }


     
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:62:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:63:1: ( ruleMarkup EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:64:1: ruleMarkup EOF
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:71:1: ruleMarkup : ( ( rule__Markup__ElementsAssignment )* ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:75:2: ( ( ( rule__Markup__ElementsAssignment )* ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( ( rule__Markup__ElementsAssignment )* )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:76:1: ( ( rule__Markup__ElementsAssignment )* )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:77:1: ( rule__Markup__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:78:1: ( rule__Markup__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_TEXT && LA1_0<=RULE_NL)||LA1_0==10||(LA1_0>=18 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:78:2: rule__Markup__ElementsAssignment
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:90:1: entryRuleMarkupElement : ruleMarkupElement EOF ;
    public final void entryRuleMarkupElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:91:1: ( ruleMarkupElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:92:1: ruleMarkupElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:99:1: ruleMarkupElement : ( ( rule__MarkupElement__Alternatives ) ) ;
    public final void ruleMarkupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:103:2: ( ( ( rule__MarkupElement__Alternatives ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( ( rule__MarkupElement__Alternatives ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:104:1: ( ( rule__MarkupElement__Alternatives ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:105:1: ( rule__MarkupElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupElementAccess().getAlternatives()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:106:1: ( rule__MarkupElement__Alternatives )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:106:2: rule__MarkupElement__Alternatives
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:118:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:119:1: ( ruleTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:120:1: ruleTextElement EOF
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:127:1: ruleTextElement : ( ( rule__TextElement__TextAssignment ) ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:131:2: ( ( ( rule__TextElement__TextAssignment ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( rule__TextElement__TextAssignment ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:132:1: ( ( rule__TextElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:133:1: ( rule__TextElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:134:1: ( rule__TextElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:134:2: rule__TextElement__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement221);
            rule__TextElement__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextAssignment()); 
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:146:1: entryRuleNewLineElement : ruleNewLineElement EOF ;
    public final void entryRuleNewLineElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:147:1: ( ruleNewLineElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:148:1: ruleNewLineElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement248);
            ruleNewLineElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewLineElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNewLineElement255); if (state.failed) return ;

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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:155:1: ruleNewLineElement : ( ( rule__NewLineElement__TextAssignment ) ) ;
    public final void ruleNewLineElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:159:2: ( ( ( rule__NewLineElement__TextAssignment ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:160:1: ( ( rule__NewLineElement__TextAssignment ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:160:1: ( ( rule__NewLineElement__TextAssignment ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:161:1: ( rule__NewLineElement__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextAssignment()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:162:1: ( rule__NewLineElement__TextAssignment )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:162:2: rule__NewLineElement__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NewLineElement__TextAssignment_in_ruleNewLineElement281);
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:174:1: entryRuleFontElement : ruleFontElement EOF ;
    public final void entryRuleFontElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:175:1: ( ruleFontElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:176:1: ruleFontElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_entryRuleFontElement308);
            ruleFontElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFontElement315); if (state.failed) return ;

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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:183:1: ruleFontElement : ( ( rule__FontElement__Group__0 ) ) ;
    public final void ruleFontElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:187:2: ( ( ( rule__FontElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:188:1: ( ( rule__FontElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:188:1: ( ( rule__FontElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:189:1: ( rule__FontElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:190:1: ( rule__FontElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:190:2: rule__FontElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0_in_ruleFontElement341);
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


    // $ANTLR start "entryRuleImageElement"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:202:1: entryRuleImageElement : ruleImageElement EOF ;
    public final void entryRuleImageElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:203:1: ( ruleImageElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:204:1: ruleImageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImageElement_in_entryRuleImageElement368);
            ruleImageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImageElement375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImageElement"


    // $ANTLR start "ruleImageElement"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:211:1: ruleImageElement : ( ( rule__ImageElement__Group__0 ) ) ;
    public final void ruleImageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:215:2: ( ( ( rule__ImageElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:216:1: ( ( rule__ImageElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:216:1: ( ( rule__ImageElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:217:1: ( rule__ImageElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:218:1: ( rule__ImageElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:218:2: rule__ImageElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__0_in_ruleImageElement401);
            rule__ImageElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getGroup()); 
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
    // $ANTLR end "ruleImageElement"


    // $ANTLR start "entryRuleStyleElement"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:230:1: entryRuleStyleElement : ruleStyleElement EOF ;
    public final void entryRuleStyleElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:231:1: ( ruleStyleElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:232:1: ruleStyleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStyleElement_in_entryRuleStyleElement428);
            ruleStyleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStyleElement435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStyleElement"


    // $ANTLR start "ruleStyleElement"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:239:1: ruleStyleElement : ( ( rule__StyleElement__Alternatives ) ) ;
    public final void ruleStyleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:243:2: ( ( ( rule__StyleElement__Alternatives ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:244:1: ( ( rule__StyleElement__Alternatives ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:244:1: ( ( rule__StyleElement__Alternatives ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:245:1: ( rule__StyleElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getAlternatives()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:246:1: ( rule__StyleElement__Alternatives )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:246:2: rule__StyleElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Alternatives_in_ruleStyleElement461);
            rule__StyleElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStyleElement"


    // $ANTLR start "entryRuleRefElement"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:258:1: entryRuleRefElement : ruleRefElement EOF ;
    public final void entryRuleRefElement() throws RecognitionException {
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:259:1: ( ruleRefElement EOF )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:260:1: ruleRefElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRefElement_in_entryRuleRefElement488);
            ruleRefElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRefElement495); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRefElement"


    // $ANTLR start "ruleRefElement"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:267:1: ruleRefElement : ( ( rule__RefElement__Group__0 ) ) ;
    public final void ruleRefElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:271:2: ( ( ( rule__RefElement__Group__0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:272:1: ( ( rule__RefElement__Group__0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:272:1: ( ( rule__RefElement__Group__0 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:273:1: ( rule__RefElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefElementAccess().getGroup()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:274:1: ( rule__RefElement__Group__0 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:274:2: rule__RefElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__Group__0_in_ruleRefElement521);
            rule__RefElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefElementAccess().getGroup()); 
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
    // $ANTLR end "ruleRefElement"


    // $ANTLR start "rule__MarkupElement__Alternatives"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:286:1: rule__MarkupElement__Alternatives : ( ( ruleFontElement ) | ( ruleTextElement ) | ( ruleNewLineElement ) | ( ruleImageElement ) | ( ruleRefElement ) | ( ruleStyleElement ) );
    public final void rule__MarkupElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:290:1: ( ( ruleFontElement ) | ( ruleTextElement ) | ( ruleNewLineElement ) | ( ruleImageElement ) | ( ruleRefElement ) | ( ruleStyleElement ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case RULE_TEXT:
                {
                alt2=2;
                }
                break;
            case RULE_NL:
                {
                alt2=3;
                }
                break;
            case 10:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 20:
            case 21:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:291:1: ( ruleFontElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:291:1: ( ruleFontElement )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:292:1: ruleFontElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives557);
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
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:297:6: ( ruleTextElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:297:6: ( ruleTextElement )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:298:1: ruleTextElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives574);
                    ruleTextElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:303:6: ( ruleNewLineElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:303:6: ( ruleNewLineElement )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:304:1: ruleNewLineElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives591);
                    ruleNewLineElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:309:6: ( ruleImageElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:309:6: ( ruleImageElement )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:310:1: ruleImageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getImageElementParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleImageElement_in_rule__MarkupElement__Alternatives608);
                    ruleImageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getImageElementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:315:6: ( ruleRefElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:315:6: ( ruleRefElement )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:316:1: ruleRefElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getRefElementParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRefElement_in_rule__MarkupElement__Alternatives625);
                    ruleRefElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getRefElementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:321:6: ( ruleStyleElement )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:321:6: ( ruleStyleElement )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:322:1: ruleStyleElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMarkupElementAccess().getStyleElementParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStyleElement_in_rule__MarkupElement__Alternatives642);
                    ruleStyleElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMarkupElementAccess().getStyleElementParserRuleCall_5()); 
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


    // $ANTLR start "rule__StyleElement__Alternatives"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:332:1: rule__StyleElement__Alternatives : ( ( ( rule__StyleElement__Group_0__0 ) ) | ( ( rule__StyleElement__Group_1__0 ) ) );
    public final void rule__StyleElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:336:1: ( ( ( rule__StyleElement__Group_0__0 ) ) | ( ( rule__StyleElement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:337:1: ( ( rule__StyleElement__Group_0__0 ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:337:1: ( ( rule__StyleElement__Group_0__0 ) )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:338:1: ( rule__StyleElement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStyleElementAccess().getGroup_0()); 
                    }
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:339:1: ( rule__StyleElement__Group_0__0 )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:339:2: rule__StyleElement__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_0__0_in_rule__StyleElement__Alternatives674);
                    rule__StyleElement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStyleElementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:343:6: ( ( rule__StyleElement__Group_1__0 ) )
                    {
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:343:6: ( ( rule__StyleElement__Group_1__0 ) )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:344:1: ( rule__StyleElement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStyleElementAccess().getGroup_1()); 
                    }
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:345:1: ( rule__StyleElement__Group_1__0 )
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:345:2: rule__StyleElement__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_1__0_in_rule__StyleElement__Alternatives692);
                    rule__StyleElement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStyleElementAccess().getGroup_1()); 
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
    // $ANTLR end "rule__StyleElement__Alternatives"


    // $ANTLR start "rule__FontElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:356:1: rule__FontElement__Group__0 : rule__FontElement__Group__0__Impl rule__FontElement__Group__1 ;
    public final void rule__FontElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:360:1: ( rule__FontElement__Group__0__Impl rule__FontElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:361:2: rule__FontElement__Group__0__Impl rule__FontElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__0723);
            rule__FontElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__0726);
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:368:1: rule__FontElement__Group__0__Impl : ( ( rule__FontElement__FontAssignment_0 ) ) ;
    public final void rule__FontElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:372:1: ( ( ( rule__FontElement__FontAssignment_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:373:1: ( ( rule__FontElement__FontAssignment_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:373:1: ( ( rule__FontElement__FontAssignment_0 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:374:1: ( rule__FontElement__FontAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontAssignment_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:375:1: ( rule__FontElement__FontAssignment_0 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:375:2: rule__FontElement__FontAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl753);
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:385:1: rule__FontElement__Group__1 : rule__FontElement__Group__1__Impl rule__FontElement__Group__2 ;
    public final void rule__FontElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:389:1: ( rule__FontElement__Group__1__Impl rule__FontElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:390:2: rule__FontElement__Group__1__Impl rule__FontElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__1783);
            rule__FontElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__1786);
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:397:1: rule__FontElement__Group__1__Impl : ( ( rule__FontElement__ElementsAssignment_1 )* ) ;
    public final void rule__FontElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:401:1: ( ( ( rule__FontElement__ElementsAssignment_1 )* ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:402:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:402:1: ( ( rule__FontElement__ElementsAssignment_1 )* )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:403:1: ( rule__FontElement__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:404:1: ( rule__FontElement__ElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_TEXT && LA4_0<=RULE_NL)||LA4_0==10||(LA4_0>=18 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:404:2: rule__FontElement__ElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl813);
            	    rule__FontElement__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:414:1: rule__FontElement__Group__2 : rule__FontElement__Group__2__Impl ;
    public final void rule__FontElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:418:1: ( rule__FontElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:419:2: rule__FontElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__2844);
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:425:1: rule__FontElement__Group__2__Impl : ( '</i>' ) ;
    public final void rule__FontElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:429:1: ( ( '</i>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:430:1: ( '</i>' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:430:1: ( '</i>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:431:1: '</i>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getIKeyword_2()); 
            }
            match(input,9,FollowSets000.FOLLOW_9_in_rule__FontElement__Group__2__Impl872); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getIKeyword_2()); 
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


    // $ANTLR start "rule__ImageElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:450:1: rule__ImageElement__Group__0 : rule__ImageElement__Group__0__Impl rule__ImageElement__Group__1 ;
    public final void rule__ImageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:454:1: ( rule__ImageElement__Group__0__Impl rule__ImageElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:455:2: rule__ImageElement__Group__0__Impl rule__ImageElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__0__Impl_in_rule__ImageElement__Group__0909);
            rule__ImageElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__1_in_rule__ImageElement__Group__0912);
            rule__ImageElement__Group__1();

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
    // $ANTLR end "rule__ImageElement__Group__0"


    // $ANTLR start "rule__ImageElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:462:1: rule__ImageElement__Group__0__Impl : ( '<img' ) ;
    public final void rule__ImageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:466:1: ( ( '<img' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:467:1: ( '<img' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:467:1: ( '<img' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:468:1: '<img'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getImgKeyword_0()); 
            }
            match(input,10,FollowSets000.FOLLOW_10_in_rule__ImageElement__Group__0__Impl940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getImgKeyword_0()); 
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
    // $ANTLR end "rule__ImageElement__Group__0__Impl"


    // $ANTLR start "rule__ImageElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:481:1: rule__ImageElement__Group__1 : rule__ImageElement__Group__1__Impl rule__ImageElement__Group__2 ;
    public final void rule__ImageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:485:1: ( rule__ImageElement__Group__1__Impl rule__ImageElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:486:2: rule__ImageElement__Group__1__Impl rule__ImageElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__1__Impl_in_rule__ImageElement__Group__1971);
            rule__ImageElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__2_in_rule__ImageElement__Group__1974);
            rule__ImageElement__Group__2();

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
    // $ANTLR end "rule__ImageElement__Group__1"


    // $ANTLR start "rule__ImageElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:493:1: rule__ImageElement__Group__1__Impl : ( 'src' ) ;
    public final void rule__ImageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:497:1: ( ( 'src' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:498:1: ( 'src' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:498:1: ( 'src' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:499:1: 'src'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getSrcKeyword_1()); 
            }
            match(input,11,FollowSets000.FOLLOW_11_in_rule__ImageElement__Group__1__Impl1002); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getSrcKeyword_1()); 
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
    // $ANTLR end "rule__ImageElement__Group__1__Impl"


    // $ANTLR start "rule__ImageElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:512:1: rule__ImageElement__Group__2 : rule__ImageElement__Group__2__Impl rule__ImageElement__Group__3 ;
    public final void rule__ImageElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:516:1: ( rule__ImageElement__Group__2__Impl rule__ImageElement__Group__3 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:517:2: rule__ImageElement__Group__2__Impl rule__ImageElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__2__Impl_in_rule__ImageElement__Group__21033);
            rule__ImageElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__3_in_rule__ImageElement__Group__21036);
            rule__ImageElement__Group__3();

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
    // $ANTLR end "rule__ImageElement__Group__2"


    // $ANTLR start "rule__ImageElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:524:1: rule__ImageElement__Group__2__Impl : ( '=' ) ;
    public final void rule__ImageElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:528:1: ( ( '=' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:529:1: ( '=' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:529:1: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:530:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getEqualsSignKeyword_2()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ImageElement__Group__2__Impl1064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__ImageElement__Group__2__Impl"


    // $ANTLR start "rule__ImageElement__Group__3"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:543:1: rule__ImageElement__Group__3 : rule__ImageElement__Group__3__Impl rule__ImageElement__Group__4 ;
    public final void rule__ImageElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:547:1: ( rule__ImageElement__Group__3__Impl rule__ImageElement__Group__4 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:548:2: rule__ImageElement__Group__3__Impl rule__ImageElement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__3__Impl_in_rule__ImageElement__Group__31095);
            rule__ImageElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__4_in_rule__ImageElement__Group__31098);
            rule__ImageElement__Group__4();

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
    // $ANTLR end "rule__ImageElement__Group__3"


    // $ANTLR start "rule__ImageElement__Group__3__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:555:1: rule__ImageElement__Group__3__Impl : ( ( rule__ImageElement__SrcAssignment_3 ) ) ;
    public final void rule__ImageElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:559:1: ( ( ( rule__ImageElement__SrcAssignment_3 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:560:1: ( ( rule__ImageElement__SrcAssignment_3 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:560:1: ( ( rule__ImageElement__SrcAssignment_3 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:561:1: ( rule__ImageElement__SrcAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getSrcAssignment_3()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:562:1: ( rule__ImageElement__SrcAssignment_3 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:562:2: rule__ImageElement__SrcAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__SrcAssignment_3_in_rule__ImageElement__Group__3__Impl1125);
            rule__ImageElement__SrcAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getSrcAssignment_3()); 
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
    // $ANTLR end "rule__ImageElement__Group__3__Impl"


    // $ANTLR start "rule__ImageElement__Group__4"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:572:1: rule__ImageElement__Group__4 : rule__ImageElement__Group__4__Impl rule__ImageElement__Group__5 ;
    public final void rule__ImageElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:576:1: ( rule__ImageElement__Group__4__Impl rule__ImageElement__Group__5 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:577:2: rule__ImageElement__Group__4__Impl rule__ImageElement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__4__Impl_in_rule__ImageElement__Group__41155);
            rule__ImageElement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__5_in_rule__ImageElement__Group__41158);
            rule__ImageElement__Group__5();

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
    // $ANTLR end "rule__ImageElement__Group__4"


    // $ANTLR start "rule__ImageElement__Group__4__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:584:1: rule__ImageElement__Group__4__Impl : ( ( rule__ImageElement__Group_4__0 )? ) ;
    public final void rule__ImageElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:588:1: ( ( ( rule__ImageElement__Group_4__0 )? ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:589:1: ( ( rule__ImageElement__Group_4__0 )? )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:589:1: ( ( rule__ImageElement__Group_4__0 )? )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:590:1: ( rule__ImageElement__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getGroup_4()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:591:1: ( rule__ImageElement__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:591:2: rule__ImageElement__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_4__0_in_rule__ImageElement__Group__4__Impl1185);
                    rule__ImageElement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getGroup_4()); 
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
    // $ANTLR end "rule__ImageElement__Group__4__Impl"


    // $ANTLR start "rule__ImageElement__Group__5"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:601:1: rule__ImageElement__Group__5 : rule__ImageElement__Group__5__Impl rule__ImageElement__Group__6 ;
    public final void rule__ImageElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:605:1: ( rule__ImageElement__Group__5__Impl rule__ImageElement__Group__6 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:606:2: rule__ImageElement__Group__5__Impl rule__ImageElement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__5__Impl_in_rule__ImageElement__Group__51216);
            rule__ImageElement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__6_in_rule__ImageElement__Group__51219);
            rule__ImageElement__Group__6();

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
    // $ANTLR end "rule__ImageElement__Group__5"


    // $ANTLR start "rule__ImageElement__Group__5__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:613:1: rule__ImageElement__Group__5__Impl : ( ( rule__ImageElement__Group_5__0 )? ) ;
    public final void rule__ImageElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:617:1: ( ( ( rule__ImageElement__Group_5__0 )? ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:618:1: ( ( rule__ImageElement__Group_5__0 )? )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:618:1: ( ( rule__ImageElement__Group_5__0 )? )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:619:1: ( rule__ImageElement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getGroup_5()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:620:1: ( rule__ImageElement__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:620:2: rule__ImageElement__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_5__0_in_rule__ImageElement__Group__5__Impl1246);
                    rule__ImageElement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getGroup_5()); 
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
    // $ANTLR end "rule__ImageElement__Group__5__Impl"


    // $ANTLR start "rule__ImageElement__Group__6"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:630:1: rule__ImageElement__Group__6 : rule__ImageElement__Group__6__Impl ;
    public final void rule__ImageElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:634:1: ( rule__ImageElement__Group__6__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:635:2: rule__ImageElement__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group__6__Impl_in_rule__ImageElement__Group__61277);
            rule__ImageElement__Group__6__Impl();

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
    // $ANTLR end "rule__ImageElement__Group__6"


    // $ANTLR start "rule__ImageElement__Group__6__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:641:1: rule__ImageElement__Group__6__Impl : ( '/>' ) ;
    public final void rule__ImageElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:645:1: ( ( '/>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:646:1: ( '/>' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:646:1: ( '/>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:647:1: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getSolidusGreaterThanSignKeyword_6()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ImageElement__Group__6__Impl1305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getSolidusGreaterThanSignKeyword_6()); 
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
    // $ANTLR end "rule__ImageElement__Group__6__Impl"


    // $ANTLR start "rule__ImageElement__Group_4__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:674:1: rule__ImageElement__Group_4__0 : rule__ImageElement__Group_4__0__Impl rule__ImageElement__Group_4__1 ;
    public final void rule__ImageElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:678:1: ( rule__ImageElement__Group_4__0__Impl rule__ImageElement__Group_4__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:679:2: rule__ImageElement__Group_4__0__Impl rule__ImageElement__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_4__0__Impl_in_rule__ImageElement__Group_4__01350);
            rule__ImageElement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_4__1_in_rule__ImageElement__Group_4__01353);
            rule__ImageElement__Group_4__1();

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
    // $ANTLR end "rule__ImageElement__Group_4__0"


    // $ANTLR start "rule__ImageElement__Group_4__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:686:1: rule__ImageElement__Group_4__0__Impl : ( 'alt' ) ;
    public final void rule__ImageElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:690:1: ( ( 'alt' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:691:1: ( 'alt' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:691:1: ( 'alt' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:692:1: 'alt'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getAltKeyword_4_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ImageElement__Group_4__0__Impl1381); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getAltKeyword_4_0()); 
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
    // $ANTLR end "rule__ImageElement__Group_4__0__Impl"


    // $ANTLR start "rule__ImageElement__Group_4__1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:705:1: rule__ImageElement__Group_4__1 : rule__ImageElement__Group_4__1__Impl rule__ImageElement__Group_4__2 ;
    public final void rule__ImageElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:709:1: ( rule__ImageElement__Group_4__1__Impl rule__ImageElement__Group_4__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:710:2: rule__ImageElement__Group_4__1__Impl rule__ImageElement__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_4__1__Impl_in_rule__ImageElement__Group_4__11412);
            rule__ImageElement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_4__2_in_rule__ImageElement__Group_4__11415);
            rule__ImageElement__Group_4__2();

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
    // $ANTLR end "rule__ImageElement__Group_4__1"


    // $ANTLR start "rule__ImageElement__Group_4__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:717:1: rule__ImageElement__Group_4__1__Impl : ( '=' ) ;
    public final void rule__ImageElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:721:1: ( ( '=' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:722:1: ( '=' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:722:1: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:723:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getEqualsSignKeyword_4_1()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ImageElement__Group_4__1__Impl1443); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getEqualsSignKeyword_4_1()); 
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
    // $ANTLR end "rule__ImageElement__Group_4__1__Impl"


    // $ANTLR start "rule__ImageElement__Group_4__2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:736:1: rule__ImageElement__Group_4__2 : rule__ImageElement__Group_4__2__Impl ;
    public final void rule__ImageElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:740:1: ( rule__ImageElement__Group_4__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:741:2: rule__ImageElement__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_4__2__Impl_in_rule__ImageElement__Group_4__21474);
            rule__ImageElement__Group_4__2__Impl();

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
    // $ANTLR end "rule__ImageElement__Group_4__2"


    // $ANTLR start "rule__ImageElement__Group_4__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:747:1: rule__ImageElement__Group_4__2__Impl : ( ( rule__ImageElement__AltAssignment_4_2 ) ) ;
    public final void rule__ImageElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:751:1: ( ( ( rule__ImageElement__AltAssignment_4_2 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:752:1: ( ( rule__ImageElement__AltAssignment_4_2 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:752:1: ( ( rule__ImageElement__AltAssignment_4_2 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:753:1: ( rule__ImageElement__AltAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getAltAssignment_4_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:754:1: ( rule__ImageElement__AltAssignment_4_2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:754:2: rule__ImageElement__AltAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__AltAssignment_4_2_in_rule__ImageElement__Group_4__2__Impl1501);
            rule__ImageElement__AltAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getAltAssignment_4_2()); 
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
    // $ANTLR end "rule__ImageElement__Group_4__2__Impl"


    // $ANTLR start "rule__ImageElement__Group_5__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:770:1: rule__ImageElement__Group_5__0 : rule__ImageElement__Group_5__0__Impl rule__ImageElement__Group_5__1 ;
    public final void rule__ImageElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:774:1: ( rule__ImageElement__Group_5__0__Impl rule__ImageElement__Group_5__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:775:2: rule__ImageElement__Group_5__0__Impl rule__ImageElement__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_5__0__Impl_in_rule__ImageElement__Group_5__01537);
            rule__ImageElement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_5__1_in_rule__ImageElement__Group_5__01540);
            rule__ImageElement__Group_5__1();

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
    // $ANTLR end "rule__ImageElement__Group_5__0"


    // $ANTLR start "rule__ImageElement__Group_5__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:782:1: rule__ImageElement__Group_5__0__Impl : ( 'def' ) ;
    public final void rule__ImageElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:786:1: ( ( 'def' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:787:1: ( 'def' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:787:1: ( 'def' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:788:1: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getDefKeyword_5_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ImageElement__Group_5__0__Impl1568); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getDefKeyword_5_0()); 
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
    // $ANTLR end "rule__ImageElement__Group_5__0__Impl"


    // $ANTLR start "rule__ImageElement__Group_5__1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:801:1: rule__ImageElement__Group_5__1 : rule__ImageElement__Group_5__1__Impl rule__ImageElement__Group_5__2 ;
    public final void rule__ImageElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:805:1: ( rule__ImageElement__Group_5__1__Impl rule__ImageElement__Group_5__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:806:2: rule__ImageElement__Group_5__1__Impl rule__ImageElement__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_5__1__Impl_in_rule__ImageElement__Group_5__11599);
            rule__ImageElement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_5__2_in_rule__ImageElement__Group_5__11602);
            rule__ImageElement__Group_5__2();

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
    // $ANTLR end "rule__ImageElement__Group_5__1"


    // $ANTLR start "rule__ImageElement__Group_5__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:813:1: rule__ImageElement__Group_5__1__Impl : ( '=' ) ;
    public final void rule__ImageElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:817:1: ( ( '=' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:818:1: ( '=' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:818:1: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:819:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getEqualsSignKeyword_5_1()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ImageElement__Group_5__1__Impl1630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getEqualsSignKeyword_5_1()); 
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
    // $ANTLR end "rule__ImageElement__Group_5__1__Impl"


    // $ANTLR start "rule__ImageElement__Group_5__2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:832:1: rule__ImageElement__Group_5__2 : rule__ImageElement__Group_5__2__Impl ;
    public final void rule__ImageElement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:836:1: ( rule__ImageElement__Group_5__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:837:2: rule__ImageElement__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__Group_5__2__Impl_in_rule__ImageElement__Group_5__21661);
            rule__ImageElement__Group_5__2__Impl();

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
    // $ANTLR end "rule__ImageElement__Group_5__2"


    // $ANTLR start "rule__ImageElement__Group_5__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:843:1: rule__ImageElement__Group_5__2__Impl : ( ( rule__ImageElement__DefAssignment_5_2 ) ) ;
    public final void rule__ImageElement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:847:1: ( ( ( rule__ImageElement__DefAssignment_5_2 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:848:1: ( ( rule__ImageElement__DefAssignment_5_2 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:848:1: ( ( rule__ImageElement__DefAssignment_5_2 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:849:1: ( rule__ImageElement__DefAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getDefAssignment_5_2()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:850:1: ( rule__ImageElement__DefAssignment_5_2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:850:2: rule__ImageElement__DefAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ImageElement__DefAssignment_5_2_in_rule__ImageElement__Group_5__2__Impl1688);
            rule__ImageElement__DefAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getDefAssignment_5_2()); 
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
    // $ANTLR end "rule__ImageElement__Group_5__2__Impl"


    // $ANTLR start "rule__StyleElement__Group_0__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:866:1: rule__StyleElement__Group_0__0 : rule__StyleElement__Group_0__0__Impl rule__StyleElement__Group_0__1 ;
    public final void rule__StyleElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:870:1: ( rule__StyleElement__Group_0__0__Impl rule__StyleElement__Group_0__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:871:2: rule__StyleElement__Group_0__0__Impl rule__StyleElement__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_0__0__Impl_in_rule__StyleElement__Group_0__01724);
            rule__StyleElement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_0__1_in_rule__StyleElement__Group_0__01727);
            rule__StyleElement__Group_0__1();

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
    // $ANTLR end "rule__StyleElement__Group_0__0"


    // $ANTLR start "rule__StyleElement__Group_0__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:878:1: rule__StyleElement__Group_0__0__Impl : ( ( rule__StyleElement__StyleAssignment_0_0 ) ) ;
    public final void rule__StyleElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:882:1: ( ( ( rule__StyleElement__StyleAssignment_0_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:883:1: ( ( rule__StyleElement__StyleAssignment_0_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:883:1: ( ( rule__StyleElement__StyleAssignment_0_0 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:884:1: ( rule__StyleElement__StyleAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getStyleAssignment_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:885:1: ( rule__StyleElement__StyleAssignment_0_0 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:885:2: rule__StyleElement__StyleAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__StyleAssignment_0_0_in_rule__StyleElement__Group_0__0__Impl1754);
            rule__StyleElement__StyleAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getStyleAssignment_0_0()); 
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
    // $ANTLR end "rule__StyleElement__Group_0__0__Impl"


    // $ANTLR start "rule__StyleElement__Group_0__1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:895:1: rule__StyleElement__Group_0__1 : rule__StyleElement__Group_0__1__Impl rule__StyleElement__Group_0__2 ;
    public final void rule__StyleElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:899:1: ( rule__StyleElement__Group_0__1__Impl rule__StyleElement__Group_0__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:900:2: rule__StyleElement__Group_0__1__Impl rule__StyleElement__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_0__1__Impl_in_rule__StyleElement__Group_0__11784);
            rule__StyleElement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_0__2_in_rule__StyleElement__Group_0__11787);
            rule__StyleElement__Group_0__2();

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
    // $ANTLR end "rule__StyleElement__Group_0__1"


    // $ANTLR start "rule__StyleElement__Group_0__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:907:1: rule__StyleElement__Group_0__1__Impl : ( ( rule__StyleElement__ElementsAssignment_0_1 )* ) ;
    public final void rule__StyleElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:911:1: ( ( ( rule__StyleElement__ElementsAssignment_0_1 )* ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:912:1: ( ( rule__StyleElement__ElementsAssignment_0_1 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:912:1: ( ( rule__StyleElement__ElementsAssignment_0_1 )* )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:913:1: ( rule__StyleElement__ElementsAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getElementsAssignment_0_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:914:1: ( rule__StyleElement__ElementsAssignment_0_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_TEXT && LA7_0<=RULE_NL)||LA7_0==10||(LA7_0>=18 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:914:2: rule__StyleElement__ElementsAssignment_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StyleElement__ElementsAssignment_0_1_in_rule__StyleElement__Group_0__1__Impl1814);
            	    rule__StyleElement__ElementsAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getElementsAssignment_0_1()); 
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
    // $ANTLR end "rule__StyleElement__Group_0__1__Impl"


    // $ANTLR start "rule__StyleElement__Group_0__2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:924:1: rule__StyleElement__Group_0__2 : rule__StyleElement__Group_0__2__Impl ;
    public final void rule__StyleElement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:928:1: ( rule__StyleElement__Group_0__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:929:2: rule__StyleElement__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_0__2__Impl_in_rule__StyleElement__Group_0__21845);
            rule__StyleElement__Group_0__2__Impl();

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
    // $ANTLR end "rule__StyleElement__Group_0__2"


    // $ANTLR start "rule__StyleElement__Group_0__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:935:1: rule__StyleElement__Group_0__2__Impl : ( '</b1>' ) ;
    public final void rule__StyleElement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:939:1: ( ( '</b1>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:940:1: ( '</b1>' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:940:1: ( '</b1>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:941:1: '</b1>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getB1Keyword_0_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__StyleElement__Group_0__2__Impl1873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getB1Keyword_0_2()); 
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
    // $ANTLR end "rule__StyleElement__Group_0__2__Impl"


    // $ANTLR start "rule__StyleElement__Group_1__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:960:1: rule__StyleElement__Group_1__0 : rule__StyleElement__Group_1__0__Impl rule__StyleElement__Group_1__1 ;
    public final void rule__StyleElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:964:1: ( rule__StyleElement__Group_1__0__Impl rule__StyleElement__Group_1__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:965:2: rule__StyleElement__Group_1__0__Impl rule__StyleElement__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_1__0__Impl_in_rule__StyleElement__Group_1__01910);
            rule__StyleElement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_1__1_in_rule__StyleElement__Group_1__01913);
            rule__StyleElement__Group_1__1();

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
    // $ANTLR end "rule__StyleElement__Group_1__0"


    // $ANTLR start "rule__StyleElement__Group_1__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:972:1: rule__StyleElement__Group_1__0__Impl : ( ( rule__StyleElement__StyleAssignment_1_0 ) ) ;
    public final void rule__StyleElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:976:1: ( ( ( rule__StyleElement__StyleAssignment_1_0 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:977:1: ( ( rule__StyleElement__StyleAssignment_1_0 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:977:1: ( ( rule__StyleElement__StyleAssignment_1_0 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:978:1: ( rule__StyleElement__StyleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getStyleAssignment_1_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:979:1: ( rule__StyleElement__StyleAssignment_1_0 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:979:2: rule__StyleElement__StyleAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__StyleAssignment_1_0_in_rule__StyleElement__Group_1__0__Impl1940);
            rule__StyleElement__StyleAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getStyleAssignment_1_0()); 
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
    // $ANTLR end "rule__StyleElement__Group_1__0__Impl"


    // $ANTLR start "rule__StyleElement__Group_1__1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:989:1: rule__StyleElement__Group_1__1 : rule__StyleElement__Group_1__1__Impl rule__StyleElement__Group_1__2 ;
    public final void rule__StyleElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:993:1: ( rule__StyleElement__Group_1__1__Impl rule__StyleElement__Group_1__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:994:2: rule__StyleElement__Group_1__1__Impl rule__StyleElement__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_1__1__Impl_in_rule__StyleElement__Group_1__11970);
            rule__StyleElement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_1__2_in_rule__StyleElement__Group_1__11973);
            rule__StyleElement__Group_1__2();

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
    // $ANTLR end "rule__StyleElement__Group_1__1"


    // $ANTLR start "rule__StyleElement__Group_1__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1001:1: rule__StyleElement__Group_1__1__Impl : ( ( rule__StyleElement__ElementsAssignment_1_1 )* ) ;
    public final void rule__StyleElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1005:1: ( ( ( rule__StyleElement__ElementsAssignment_1_1 )* ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1006:1: ( ( rule__StyleElement__ElementsAssignment_1_1 )* )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1006:1: ( ( rule__StyleElement__ElementsAssignment_1_1 )* )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1007:1: ( rule__StyleElement__ElementsAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getElementsAssignment_1_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1008:1: ( rule__StyleElement__ElementsAssignment_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_TEXT && LA8_0<=RULE_NL)||LA8_0==10||(LA8_0>=18 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1008:2: rule__StyleElement__ElementsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StyleElement__ElementsAssignment_1_1_in_rule__StyleElement__Group_1__1__Impl2000);
            	    rule__StyleElement__ElementsAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getElementsAssignment_1_1()); 
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
    // $ANTLR end "rule__StyleElement__Group_1__1__Impl"


    // $ANTLR start "rule__StyleElement__Group_1__2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1018:1: rule__StyleElement__Group_1__2 : rule__StyleElement__Group_1__2__Impl ;
    public final void rule__StyleElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1022:1: ( rule__StyleElement__Group_1__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1023:2: rule__StyleElement__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StyleElement__Group_1__2__Impl_in_rule__StyleElement__Group_1__22031);
            rule__StyleElement__Group_1__2__Impl();

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
    // $ANTLR end "rule__StyleElement__Group_1__2"


    // $ANTLR start "rule__StyleElement__Group_1__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1029:1: rule__StyleElement__Group_1__2__Impl : ( '</b2>' ) ;
    public final void rule__StyleElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1033:1: ( ( '</b2>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1034:1: ( '</b2>' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1034:1: ( '</b2>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1035:1: '</b2>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getB2Keyword_1_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__StyleElement__Group_1__2__Impl2059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getB2Keyword_1_2()); 
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
    // $ANTLR end "rule__StyleElement__Group_1__2__Impl"


    // $ANTLR start "rule__RefElement__Group__0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1054:1: rule__RefElement__Group__0 : rule__RefElement__Group__0__Impl rule__RefElement__Group__1 ;
    public final void rule__RefElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1058:1: ( rule__RefElement__Group__0__Impl rule__RefElement__Group__1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1059:2: rule__RefElement__Group__0__Impl rule__RefElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__Group__0__Impl_in_rule__RefElement__Group__02096);
            rule__RefElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__Group__1_in_rule__RefElement__Group__02099);
            rule__RefElement__Group__1();

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
    // $ANTLR end "rule__RefElement__Group__0"


    // $ANTLR start "rule__RefElement__Group__0__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1066:1: rule__RefElement__Group__0__Impl : ( '<ref' ) ;
    public final void rule__RefElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1070:1: ( ( '<ref' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1071:1: ( '<ref' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1071:1: ( '<ref' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1072:1: '<ref'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefElementAccess().getRefKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RefElement__Group__0__Impl2127); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefElementAccess().getRefKeyword_0()); 
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
    // $ANTLR end "rule__RefElement__Group__0__Impl"


    // $ANTLR start "rule__RefElement__Group__1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1085:1: rule__RefElement__Group__1 : rule__RefElement__Group__1__Impl rule__RefElement__Group__2 ;
    public final void rule__RefElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1089:1: ( rule__RefElement__Group__1__Impl rule__RefElement__Group__2 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1090:2: rule__RefElement__Group__1__Impl rule__RefElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__Group__1__Impl_in_rule__RefElement__Group__12158);
            rule__RefElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__Group__2_in_rule__RefElement__Group__12161);
            rule__RefElement__Group__2();

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
    // $ANTLR end "rule__RefElement__Group__1"


    // $ANTLR start "rule__RefElement__Group__1__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1097:1: rule__RefElement__Group__1__Impl : ( ( rule__RefElement__RefAssignment_1 ) ) ;
    public final void rule__RefElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1101:1: ( ( ( rule__RefElement__RefAssignment_1 ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1102:1: ( ( rule__RefElement__RefAssignment_1 ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1102:1: ( ( rule__RefElement__RefAssignment_1 ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1103:1: ( rule__RefElement__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefElementAccess().getRefAssignment_1()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1104:1: ( rule__RefElement__RefAssignment_1 )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1104:2: rule__RefElement__RefAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__RefAssignment_1_in_rule__RefElement__Group__1__Impl2188);
            rule__RefElement__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefElementAccess().getRefAssignment_1()); 
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
    // $ANTLR end "rule__RefElement__Group__1__Impl"


    // $ANTLR start "rule__RefElement__Group__2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1114:1: rule__RefElement__Group__2 : rule__RefElement__Group__2__Impl ;
    public final void rule__RefElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1118:1: ( rule__RefElement__Group__2__Impl )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1119:2: rule__RefElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RefElement__Group__2__Impl_in_rule__RefElement__Group__22218);
            rule__RefElement__Group__2__Impl();

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
    // $ANTLR end "rule__RefElement__Group__2"


    // $ANTLR start "rule__RefElement__Group__2__Impl"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1125:1: rule__RefElement__Group__2__Impl : ( '/>' ) ;
    public final void rule__RefElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1129:1: ( ( '/>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1130:1: ( '/>' )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1130:1: ( '/>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1131:1: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefElementAccess().getSolidusGreaterThanSignKeyword_2()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RefElement__Group__2__Impl2246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefElementAccess().getSolidusGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__RefElement__Group__2__Impl"


    // $ANTLR start "rule__Markup__ElementsAssignment"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1151:1: rule__Markup__ElementsAssignment : ( ruleMarkupElement ) ;
    public final void rule__Markup__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1155:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1156:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1156:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1157:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment2288);
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1166:1: rule__TextElement__TextAssignment : ( RULE_TEXT ) ;
    public final void rule__TextElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1170:1: ( ( RULE_TEXT ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1171:1: ( RULE_TEXT )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1171:1: ( RULE_TEXT )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1172:1: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextElementAccess().getTextTEXTTerminalRuleCall_0()); 
            }
            match(input,RULE_TEXT,FollowSets000.FOLLOW_RULE_TEXT_in_rule__TextElement__TextAssignment2319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextElementAccess().getTextTEXTTerminalRuleCall_0()); 
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1181:1: rule__NewLineElement__TextAssignment : ( RULE_NL ) ;
    public final void rule__NewLineElement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1185:1: ( ( RULE_NL ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1186:1: ( RULE_NL )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1186:1: ( RULE_NL )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1187:1: RULE_NL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
            }
            match(input,RULE_NL,FollowSets000.FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment2350); if (state.failed) return ;
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1196:1: rule__FontElement__FontAssignment_0 : ( ( '<i>' ) ) ;
    public final void rule__FontElement__FontAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1200:1: ( ( ( '<i>' ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1201:1: ( ( '<i>' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1201:1: ( ( '<i>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1202:1: ( '<i>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontIKeyword_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1203:1: ( '<i>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1204:1: '<i>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getFontIKeyword_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FontElement__FontAssignment_02386); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getFontIKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontElementAccess().getFontIKeyword_0_0()); 
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
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1219:1: rule__FontElement__ElementsAssignment_1 : ( ruleMarkupElement ) ;
    public final void rule__FontElement__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1223:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1224:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1224:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1225:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_12425);
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


    // $ANTLR start "rule__ImageElement__SrcAssignment_3"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1234:1: rule__ImageElement__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ImageElement__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1238:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1239:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1239:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1240:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getSrcSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ImageElement__SrcAssignment_32456); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getSrcSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__ImageElement__SrcAssignment_3"


    // $ANTLR start "rule__ImageElement__AltAssignment_4_2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1249:1: rule__ImageElement__AltAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ImageElement__AltAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1253:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1254:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1254:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1255:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getAltSTRINGTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ImageElement__AltAssignment_4_22487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getAltSTRINGTerminalRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__ImageElement__AltAssignment_4_2"


    // $ANTLR start "rule__ImageElement__DefAssignment_5_2"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1264:1: rule__ImageElement__DefAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__ImageElement__DefAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1268:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1269:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1269:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1270:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageElementAccess().getDefSTRINGTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ImageElement__DefAssignment_5_22518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageElementAccess().getDefSTRINGTerminalRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__ImageElement__DefAssignment_5_2"


    // $ANTLR start "rule__StyleElement__StyleAssignment_0_0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1279:1: rule__StyleElement__StyleAssignment_0_0 : ( ( '<b1>' ) ) ;
    public final void rule__StyleElement__StyleAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1283:1: ( ( ( '<b1>' ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1284:1: ( ( '<b1>' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1284:1: ( ( '<b1>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1285:1: ( '<b1>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getStyleB1Keyword_0_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1286:1: ( '<b1>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1287:1: '<b1>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getStyleB1Keyword_0_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__StyleElement__StyleAssignment_0_02554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getStyleB1Keyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getStyleB1Keyword_0_0_0()); 
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
    // $ANTLR end "rule__StyleElement__StyleAssignment_0_0"


    // $ANTLR start "rule__StyleElement__ElementsAssignment_0_1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1302:1: rule__StyleElement__ElementsAssignment_0_1 : ( ruleMarkupElement ) ;
    public final void rule__StyleElement__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1306:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1307:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1307:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1308:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getElementsMarkupElementParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__StyleElement__ElementsAssignment_0_12593);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getElementsMarkupElementParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__StyleElement__ElementsAssignment_0_1"


    // $ANTLR start "rule__StyleElement__StyleAssignment_1_0"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1317:1: rule__StyleElement__StyleAssignment_1_0 : ( ( '<b2>' ) ) ;
    public final void rule__StyleElement__StyleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1321:1: ( ( ( '<b2>' ) ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1322:1: ( ( '<b2>' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1322:1: ( ( '<b2>' ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1323:1: ( '<b2>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getStyleB2Keyword_1_0_0()); 
            }
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1324:1: ( '<b2>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1325:1: '<b2>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getStyleB2Keyword_1_0_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__StyleElement__StyleAssignment_1_02629); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getStyleB2Keyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getStyleB2Keyword_1_0_0()); 
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
    // $ANTLR end "rule__StyleElement__StyleAssignment_1_0"


    // $ANTLR start "rule__StyleElement__ElementsAssignment_1_1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1340:1: rule__StyleElement__ElementsAssignment_1_1 : ( ruleMarkupElement ) ;
    public final void rule__StyleElement__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1344:1: ( ( ruleMarkupElement ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1345:1: ( ruleMarkupElement )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1345:1: ( ruleMarkupElement )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1346:1: ruleMarkupElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleElementAccess().getElementsMarkupElementParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_rule__StyleElement__ElementsAssignment_1_12668);
            ruleMarkupElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleElementAccess().getElementsMarkupElementParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__StyleElement__ElementsAssignment_1_1"


    // $ANTLR start "rule__RefElement__RefAssignment_1"
    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1355:1: rule__RefElement__RefAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RefElement__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1359:1: ( ( RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1360:1: ( RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1360:1: ( RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1361:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefElementAccess().getRefSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__RefElement__RefAssignment_12699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefElementAccess().getRefSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__RefElement__RefAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkup74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Markup__ElementsAssignment_in_ruleMarkup100 = new BitSet(new long[]{0x00000000003C0432L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkupElement135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MarkupElement__Alternatives_in_ruleMarkupElement161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextElement195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextElement__TextAssignment_in_ruleTextElement221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNewLineElement255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NewLineElement__TextAssignment_in_ruleNewLineElement281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_entryRuleFontElement308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFontElement315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0_in_ruleFontElement341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImageElement_in_entryRuleImageElement368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImageElement375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__0_in_ruleImageElement401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStyleElement_in_entryRuleStyleElement428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStyleElement435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Alternatives_in_ruleStyleElement461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefElement_in_entryRuleRefElement488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRefElement495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefElement__Group__0_in_ruleRefElement521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_rule__MarkupElement__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_rule__MarkupElement__Alternatives574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_rule__MarkupElement__Alternatives591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImageElement_in_rule__MarkupElement__Alternatives608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRefElement_in_rule__MarkupElement__Alternatives625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStyleElement_in_rule__MarkupElement__Alternatives642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_0__0_in_rule__StyleElement__Alternatives674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_1__0_in_rule__StyleElement__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__0__Impl_in_rule__FontElement__Group__0723 = new BitSet(new long[]{0x00000000003C0630L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1_in_rule__FontElement__Group__0726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__FontAssignment_0_in_rule__FontElement__Group__0__Impl753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__Group__1__Impl_in_rule__FontElement__Group__1783 = new BitSet(new long[]{0x00000000003C0630L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2_in_rule__FontElement__Group__1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FontElement__ElementsAssignment_1_in_rule__FontElement__Group__1__Impl813 = new BitSet(new long[]{0x00000000003C0432L});
        public static final BitSet FOLLOW_rule__FontElement__Group__2__Impl_in_rule__FontElement__Group__2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_9_in_rule__FontElement__Group__2__Impl872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__0__Impl_in_rule__ImageElement__Group__0909 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__1_in_rule__ImageElement__Group__0912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_rule__ImageElement__Group__0__Impl940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__1__Impl_in_rule__ImageElement__Group__1971 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__2_in_rule__ImageElement__Group__1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__ImageElement__Group__1__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__2__Impl_in_rule__ImageElement__Group__21033 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__3_in_rule__ImageElement__Group__21036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ImageElement__Group__2__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__3__Impl_in_rule__ImageElement__Group__31095 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__4_in_rule__ImageElement__Group__31098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__SrcAssignment_3_in_rule__ImageElement__Group__3__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__4__Impl_in_rule__ImageElement__Group__41155 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__5_in_rule__ImageElement__Group__41158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_4__0_in_rule__ImageElement__Group__4__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__5__Impl_in_rule__ImageElement__Group__51216 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__6_in_rule__ImageElement__Group__51219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_5__0_in_rule__ImageElement__Group__5__Impl1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group__6__Impl_in_rule__ImageElement__Group__61277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ImageElement__Group__6__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_4__0__Impl_in_rule__ImageElement__Group_4__01350 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_4__1_in_rule__ImageElement__Group_4__01353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ImageElement__Group_4__0__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_4__1__Impl_in_rule__ImageElement__Group_4__11412 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_4__2_in_rule__ImageElement__Group_4__11415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ImageElement__Group_4__1__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_4__2__Impl_in_rule__ImageElement__Group_4__21474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__AltAssignment_4_2_in_rule__ImageElement__Group_4__2__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_5__0__Impl_in_rule__ImageElement__Group_5__01537 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_5__1_in_rule__ImageElement__Group_5__01540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ImageElement__Group_5__0__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_5__1__Impl_in_rule__ImageElement__Group_5__11599 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_5__2_in_rule__ImageElement__Group_5__11602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ImageElement__Group_5__1__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__Group_5__2__Impl_in_rule__ImageElement__Group_5__21661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ImageElement__DefAssignment_5_2_in_rule__ImageElement__Group_5__2__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_0__0__Impl_in_rule__StyleElement__Group_0__01724 = new BitSet(new long[]{0x00000000003D0430L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_0__1_in_rule__StyleElement__Group_0__01727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__StyleAssignment_0_0_in_rule__StyleElement__Group_0__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_0__1__Impl_in_rule__StyleElement__Group_0__11784 = new BitSet(new long[]{0x00000000003D0430L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_0__2_in_rule__StyleElement__Group_0__11787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__ElementsAssignment_0_1_in_rule__StyleElement__Group_0__1__Impl1814 = new BitSet(new long[]{0x00000000003C0432L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_0__2__Impl_in_rule__StyleElement__Group_0__21845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__StyleElement__Group_0__2__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_1__0__Impl_in_rule__StyleElement__Group_1__01910 = new BitSet(new long[]{0x00000000003E0430L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_1__1_in_rule__StyleElement__Group_1__01913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__StyleAssignment_1_0_in_rule__StyleElement__Group_1__0__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_1__1__Impl_in_rule__StyleElement__Group_1__11970 = new BitSet(new long[]{0x00000000003E0430L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_1__2_in_rule__StyleElement__Group_1__11973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StyleElement__ElementsAssignment_1_1_in_rule__StyleElement__Group_1__1__Impl2000 = new BitSet(new long[]{0x00000000003C0432L});
        public static final BitSet FOLLOW_rule__StyleElement__Group_1__2__Impl_in_rule__StyleElement__Group_1__22031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__StyleElement__Group_1__2__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefElement__Group__0__Impl_in_rule__RefElement__Group__02096 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RefElement__Group__1_in_rule__RefElement__Group__02099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RefElement__Group__0__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefElement__Group__1__Impl_in_rule__RefElement__Group__12158 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RefElement__Group__2_in_rule__RefElement__Group__12161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefElement__RefAssignment_1_in_rule__RefElement__Group__1__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RefElement__Group__2__Impl_in_rule__RefElement__Group__22218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RefElement__Group__2__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__Markup__ElementsAssignment2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TEXT_in_rule__TextElement__TextAssignment2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NL_in_rule__NewLineElement__TextAssignment2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FontElement__FontAssignment_02386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__FontElement__ElementsAssignment_12425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageElement__SrcAssignment_32456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageElement__AltAssignment_4_22487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageElement__DefAssignment_5_22518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__StyleElement__StyleAssignment_0_02554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__StyleElement__ElementsAssignment_0_12593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__StyleElement__StyleAssignment_1_02629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_rule__StyleElement__ElementsAssignment_1_12668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__RefElement__RefAssignment_12699 = new BitSet(new long[]{0x0000000000000002L});
    }


}