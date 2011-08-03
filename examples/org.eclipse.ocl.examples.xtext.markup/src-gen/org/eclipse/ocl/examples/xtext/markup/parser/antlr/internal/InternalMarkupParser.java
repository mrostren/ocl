package org.eclipse.ocl.examples.xtext.markup.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ocl.examples.xtext.markup.services.MarkupGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMarkupParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORD", "RULE_WS", "RULE_NL", "RULE_STRING", "RULE_TEXT", "RULE_ANY_OTHER", "'b['", "'e['", "']'", "'fig['", "'fig:'", "'['", "'fig-['"
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
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MarkupGrammarAccess grammarAccess;
     	
        public InternalMarkupParser(TokenStream input, MarkupGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Markup";	
       	}
       	
       	@Override
       	protected MarkupGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:73:1: entryRuleMarkup returns [EObject current=null] : iv_ruleMarkup= ruleMarkup EOF ;
    public final EObject entryRuleMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkup = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:74:2: (iv_ruleMarkup= ruleMarkup EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:75:2: iv_ruleMarkup= ruleMarkup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkup_in_entryRuleMarkup81);
            iv_ruleMarkup=ruleMarkup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkup91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkup"


    // $ANTLR start "ruleMarkup"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:82:1: ruleMarkup returns [EObject current=null] : ( (lv_elements_0_0= ruleMarkupElement ) )* ;
    public final EObject ruleMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:85:28: ( ( (lv_elements_0_0= ruleMarkupElement ) )* )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:86:1: ( (lv_elements_0_0= ruleMarkupElement ) )*
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:86:1: ( (lv_elements_0_0= ruleMarkupElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NL)||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=14 && LA1_0<=15)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:87:1: (lv_elements_0_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:87:1: (lv_elements_0_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:88:3: lv_elements_0_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMarkupAccess().getElementsMarkupElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleMarkup136);
            	    lv_elements_0_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMarkupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkup"


    // $ANTLR start "entryRuleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:112:1: entryRuleMarkupElement returns [EObject current=null] : iv_ruleMarkupElement= ruleMarkupElement EOF ;
    public final EObject entryRuleMarkupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:113:2: (iv_ruleMarkupElement= ruleMarkupElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:114:2: iv_ruleMarkupElement= ruleMarkupElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMarkupElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement172);
            iv_ruleMarkupElement=ruleMarkupElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMarkupElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarkupElement182); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkupElement"


    // $ANTLR start "ruleMarkupElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:121:1: ruleMarkupElement returns [EObject current=null] : (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement ) ;
    public final EObject ruleMarkupElement() throws RecognitionException {
        EObject current = null;

        EObject this_FontElement_0 = null;

        EObject this_NewLineElement_1 = null;

        EObject this_TextElement_2 = null;

        EObject this_FigElement_3 = null;

        EObject this_FigRefElement_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:124:28: ( (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:125:1: (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:125:1: (this_FontElement_0= ruleFontElement | this_NewLineElement_1= ruleNewLineElement | this_TextElement_2= ruleTextElement | this_FigElement_3= ruleFigElement | this_FigRefElement_4= ruleFigRefElement )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case RULE_NL:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_WORD:
            case RULE_WS:
                {
                alt2=3;
                }
                break;
            case 14:
            case 15:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:126:2: this_FontElement_0= ruleFontElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getFontElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_ruleMarkupElement232);
                    this_FontElement_0=ruleFontElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FontElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:139:2: this_NewLineElement_1= ruleNewLineElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getNewLineElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_ruleMarkupElement262);
                    this_NewLineElement_1=ruleNewLineElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewLineElement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:152:2: this_TextElement_2= ruleTextElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getTextElementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_ruleMarkupElement292);
                    this_TextElement_2=ruleTextElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextElement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:165:2: this_FigElement_3= ruleFigElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getFigElementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_ruleMarkupElement322);
                    this_FigElement_3=ruleFigElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FigElement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:178:2: this_FigRefElement_4= ruleFigRefElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMarkupElementAccess().getFigRefElementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_ruleMarkupElement352);
                    this_FigRefElement_4=ruleFigRefElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FigRefElement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkupElement"


    // $ANTLR start "entryRuleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:197:1: entryRuleTextElement returns [EObject current=null] : iv_ruleTextElement= ruleTextElement EOF ;
    public final EObject entryRuleTextElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:198:2: (iv_ruleTextElement= ruleTextElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:199:2: iv_ruleTextElement= ruleTextElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextElement_in_entryRuleTextElement387);
            iv_ruleTextElement=ruleTextElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextElement397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:206:1: ruleTextElement returns [EObject current=null] : ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+ ;
    public final EObject ruleTextElement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_1=null;
        Token lv_text_0_2=null;
        Token lv_text_0_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:209:28: ( ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+ )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:210:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:210:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (synpred8_InternalMarkup()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_WORD:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (synpred8_InternalMarkup()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_WS:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (synpred8_InternalMarkup()) ) {
                        alt4=1;
                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:211:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:211:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:212:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:212:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case RULE_WORD:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:213:3: lv_text_0_1= RULE_ID
            	            {
            	            lv_text_0_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextElement440); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_text_0_1, grammarAccess.getTextElementAccess().getTextIDTerminalRuleCall_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTextElementRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"text",
            	                      		lv_text_0_1, 
            	                      		"ID");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:228:8: lv_text_0_2= RULE_WORD
            	            {
            	            lv_text_0_2=(Token)match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_ruleTextElement460); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_text_0_2, grammarAccess.getTextElementAccess().getTextWORDTerminalRuleCall_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTextElementRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"text",
            	                      		lv_text_0_2, 
            	                      		"WORD");
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:243:8: lv_text_0_3= RULE_WS
            	            {
            	            lv_text_0_3=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_ruleTextElement480); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_text_0_3, grammarAccess.getTextElementAccess().getTextWSTerminalRuleCall_0_2()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTextElementRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"text",
            	                      		lv_text_0_3, 
            	                      		"WS");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:269:1: entryRuleNewLineElement returns [EObject current=null] : iv_ruleNewLineElement= ruleNewLineElement EOF ;
    public final EObject entryRuleNewLineElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewLineElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:270:2: (iv_ruleNewLineElement= ruleNewLineElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:271:2: iv_ruleNewLineElement= ruleNewLineElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewLineElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement524);
            iv_ruleNewLineElement=ruleNewLineElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewLineElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNewLineElement534); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewLineElement"


    // $ANTLR start "ruleNewLineElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:278:1: ruleNewLineElement returns [EObject current=null] : ( (lv_text_0_0= RULE_NL ) ) ;
    public final EObject ruleNewLineElement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:281:28: ( ( (lv_text_0_0= RULE_NL ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:282:1: ( (lv_text_0_0= RULE_NL ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:282:1: ( (lv_text_0_0= RULE_NL ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:283:1: (lv_text_0_0= RULE_NL )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:283:1: (lv_text_0_0= RULE_NL )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:284:3: lv_text_0_0= RULE_NL
            {
            lv_text_0_0=(Token)match(input,RULE_NL,FollowSets000.FOLLOW_RULE_NL_in_ruleNewLineElement575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getNewLineElementAccess().getTextNLTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNewLineElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"NL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewLineElement"


    // $ANTLR start "entryRuleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:308:1: entryRuleFontElement returns [EObject current=null] : iv_ruleFontElement= ruleFontElement EOF ;
    public final EObject entryRuleFontElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:309:2: (iv_ruleFontElement= ruleFontElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:310:2: iv_ruleFontElement= ruleFontElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFontElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFontElement_in_entryRuleFontElement615);
            iv_ruleFontElement=ruleFontElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFontElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFontElement625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontElement"


    // $ANTLR start "ruleFontElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:317:1: ruleFontElement returns [EObject current=null] : ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' ) ;
    public final EObject ruleFontElement() throws RecognitionException {
        EObject current = null;

        Token lv_font_0_1=null;
        Token lv_font_0_2=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:320:28: ( ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:321:1: ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:321:1: ( ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:321:2: ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) ) ( (lv_elements_1_0= ruleMarkupElement ) )* otherlv_2= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:321:2: ( ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:322:1: ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:322:1: ( (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:323:1: (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:323:1: (lv_font_0_1= 'b[' | lv_font_0_2= 'e[' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:324:3: lv_font_0_1= 'b['
                    {
                    lv_font_0_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFontElement670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_font_0_1, grammarAccess.getFontElementAccess().getFontBKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFontElementRule());
                      	        }
                             		setWithLastConsumed(current, "font", lv_font_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:336:8: lv_font_0_2= 'e['
                    {
                    lv_font_0_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFontElement699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_font_0_2, grammarAccess.getFontElementAccess().getFontEKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFontElementRule());
                      	        }
                             		setWithLastConsumed(current, "font", lv_font_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:351:2: ( (lv_elements_1_0= ruleMarkupElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NL)||(LA6_0>=11 && LA6_0<=12)||(LA6_0>=14 && LA6_0<=15)||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:352:1: (lv_elements_1_0= ruleMarkupElement )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:352:1: (lv_elements_1_0= ruleMarkupElement )
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:353:3: lv_elements_1_0= ruleMarkupElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFontElementAccess().getElementsMarkupElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMarkupElement_in_ruleFontElement736);
            	    lv_elements_1_0=ruleMarkupElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFontElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"MarkupElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFontElement749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFontElementAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontElement"


    // $ANTLR start "entryRuleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:381:1: entryRuleFigElement returns [EObject current=null] : iv_ruleFigElement= ruleFigElement EOF ;
    public final EObject entryRuleFigElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:382:2: (iv_ruleFigElement= ruleFigElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:383:2: iv_ruleFigElement= ruleFigElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFigElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigElement_in_entryRuleFigElement785);
            iv_ruleFigElement=ruleFigElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFigElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigElement795); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigElement"


    // $ANTLR start "ruleFigElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:390:1: ruleFigElement returns [EObject current=null] : ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' ) ;
    public final EObject ruleFigElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_src_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:393:28: ( ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:394:1: ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:394:1: ( (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:394:2: (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) ) ( (lv_src_4_0= RULE_STRING ) ) otherlv_5= ']'
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:394:2: (otherlv_0= 'fig[' | (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:394:4: otherlv_0= 'fig['
                    {
                    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFigElement833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getFigElementAccess().getFigKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:399:6: (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:399:6: (otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '[' )
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:399:8: otherlv_1= 'fig:' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '['
                    {
                    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFigElement852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFigElementAccess().getFigKeyword_0_1_0());
                          
                    }
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:403:1: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:404:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:404:1: (lv_id_2_0= RULE_ID )
                    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:405:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFigElement869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_0, grammarAccess.getFigElementAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFigElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFigElement886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFigElementAccess().getLeftSquareBracketKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:425:3: ( (lv_src_4_0= RULE_STRING ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:426:1: (lv_src_4_0= RULE_STRING )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:426:1: (lv_src_4_0= RULE_STRING )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:427:3: lv_src_4_0= RULE_STRING
            {
            lv_src_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFigElement905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_src_4_0, grammarAccess.getFigElementAccess().getSrcSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFigElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"src",
                      		lv_src_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFigElement922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFigElementAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigElement"


    // $ANTLR start "entryRuleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:455:1: entryRuleFigRefElement returns [EObject current=null] : iv_ruleFigRefElement= ruleFigRefElement EOF ;
    public final EObject entryRuleFigRefElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFigRefElement = null;


        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:456:2: (iv_ruleFigRefElement= ruleFigRefElement EOF )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:457:2: iv_ruleFigRefElement= ruleFigRefElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFigRefElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement958);
            iv_ruleFigRefElement=ruleFigRefElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFigRefElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFigRefElement968); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFigRefElement"


    // $ANTLR start "ruleFigRefElement"
    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:464:1: ruleFigRefElement returns [EObject current=null] : (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleFigRefElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:467:28: ( (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:468:1: (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:468:1: (otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:468:3: otherlv_0= 'fig-[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFigRefElement1005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFigRefElementAccess().getFigKeyword_0());
                  
            }
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:472:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:473:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:473:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:474:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFigRefElementRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFigRefElement1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFigRefElementAccess().getRefFigElementCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFigRefElement1041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFigRefElementAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFigRefElement"

    // $ANTLR start synpred8_InternalMarkup
    public final void synpred8_InternalMarkup_fragment() throws RecognitionException {   
        Token lv_text_0_1=null;
        Token lv_text_0_2=null;
        Token lv_text_0_3=null;

        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:211:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) ) )
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:211:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
        {
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:211:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS ) )
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:212:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
        {
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:212:1: (lv_text_0_1= RULE_ID | lv_text_0_2= RULE_WORD | lv_text_0_3= RULE_WS )
        int alt8=3;
        switch ( input.LA(1) ) {
        case RULE_ID:
            {
            alt8=1;
            }
            break;
        case RULE_WORD:
            {
            alt8=2;
            }
            break;
        case RULE_WS:
            {
            alt8=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 8, 0, input);

            throw nvae;
        }

        switch (alt8) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:213:3: lv_text_0_1= RULE_ID
                {
                lv_text_0_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred8_InternalMarkup440); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:228:8: lv_text_0_2= RULE_WORD
                {
                lv_text_0_2=(Token)match(input,RULE_WORD,FollowSets000.FOLLOW_RULE_WORD_in_synpred8_InternalMarkup460); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:243:8: lv_text_0_3= RULE_WS
                {
                lv_text_0_3=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_synpred8_InternalMarkup480); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMarkup

    // Delegated rules

    public final boolean synpred8_InternalMarkup() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMarkup_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleMarkup_in_entryRuleMarkup81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkup91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleMarkup136 = new BitSet(new long[]{0x000000000002D8F2L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_entryRuleMarkupElement172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarkupElement182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_ruleMarkupElement232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_ruleMarkupElement262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_ruleMarkupElement292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_ruleMarkupElement322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_ruleMarkupElement352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextElement397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextElement440 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_RULE_WORD_in_ruleTextElement460 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_RULE_WS_in_ruleTextElement480 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_ruleNewLineElement_in_entryRuleNewLineElement524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNewLineElement534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NL_in_ruleNewLineElement575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFontElement_in_entryRuleFontElement615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFontElement625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFontElement670 = new BitSet(new long[]{0x000000000002F8F0L});
        public static final BitSet FOLLOW_12_in_ruleFontElement699 = new BitSet(new long[]{0x000000000002F8F0L});
        public static final BitSet FOLLOW_ruleMarkupElement_in_ruleFontElement736 = new BitSet(new long[]{0x000000000002F8F0L});
        public static final BitSet FOLLOW_13_in_ruleFontElement749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigElement_in_entryRuleFigElement785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigElement795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleFigElement833 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_15_in_ruleFigElement852 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFigElement869 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFigElement886 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFigElement905 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFigElement922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFigRefElement_in_entryRuleFigRefElement958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFigRefElement968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFigRefElement1005 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFigRefElement1029 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFigRefElement1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred8_InternalMarkup440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WORD_in_synpred8_InternalMarkup460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WS_in_synpred8_InternalMarkup480 = new BitSet(new long[]{0x0000000000000002L});
    }


}