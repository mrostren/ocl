package org.eclipse.ocl.examples.xtext.base.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkupLexer extends Lexer {
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

    public InternalMarkupLexer() {;} 
    public InternalMarkupLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMarkupLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:11:6: ( '</i>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:11:8: '</i>'
            {
            match("</i>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:12:7: ( '<img' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:12:9: '<img'
            {
            match("<img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:13:7: ( 'src' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:13:9: 'src'
            {
            match("src"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:14:7: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:15:7: ( '/>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:15:9: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:16:7: ( 'alt' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:16:9: 'alt'
            {
            match("alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:17:7: ( 'def' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:17:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:18:7: ( '</b1>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:18:9: '</b1>'
            {
            match("</b1>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:19:7: ( '</b2>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:19:9: '</b2>'
            {
            match("</b2>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:20:7: ( '<ref' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:20:9: '<ref'
            {
            match("<ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:21:7: ( '<i>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:21:9: '<i>'
            {
            match("<i>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:22:7: ( '<b1>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:22:9: '<b1>'
            {
            match("<b1>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:23:7: ( '<b2>' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:23:9: '<b2>'
            {
            match("<b2>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1371:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1371:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1371:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1371:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='<'||input.LA(1)=='>'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1371:69: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:11: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | '_' '\\'' (~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:13: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | '_' '\\'' (~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | '_' '\\'' (~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( (LA3_0=='_') ) {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3=='\'') ) {
                        int LA3_5 = input.LA(3);

                        if ( ((LA3_5>='\u0000' && LA3_5<='[')||(LA3_5>=']' && LA3_5<='\uFFFF')) ) {
                            alt3=2;
                        }

                        else {
                            alt3=3;
                        }

                    }
                    else if ( ((LA3_3>='\u0000' && LA3_3<='\t')||(LA3_3>='\u000B' && LA3_3<='&')||(LA3_3>='(' && LA3_3<='\uFFFF')) ) {
                        alt3=3;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='^')||(LA3_0>='`' && LA3_0<='\uFFFF')) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:19: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='<'||input.LA(1)=='>'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:68: '_' '\\'' (~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            	    {
            	    match('_'); 
            	    match('\''); 
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:77: (~ ( ( '\\\\' | '\\'' ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:77: ~ ( ( '\\\\' | '\\'' ) )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1373:98: ~ ( ( '\\\\' | '\\'' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1375:9: ( '\\n' )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1375:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1377:9: ( ( ' ' | '\\t' | '\\r' )+ )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1377:11: ( ' ' | '\\t' | '\\r' )+
            {
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1377:11: ( ' ' | '\\t' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1379:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1379:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_STRING | RULE_TEXT | RULE_NL | RULE_WS | RULE_ANY_OTHER )
        int alt5=18;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:99: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 16 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:109: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 17 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:117: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../org.eclipse.ocl.examples.xtext.base.ui/src-gen/org/eclipse/ocl/examples/xtext/base/ui/contentassist/antlr/internal/InternalMarkup.g:1:125: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\2\13\1\uffff\5\13\30\uffff";
    static final String DFA5_eofS =
        "\41\uffff";
    static final String DFA5_minS =
        "\1\0\1\57\1\162\1\uffff\1\76\1\154\1\145\2\0\3\uffff\1\142\1\76"+
        "\1\uffff\1\61\12\uffff\1\61\6\uffff";
    static final String DFA5_maxS =
        "\1\uffff\2\162\1\uffff\1\76\1\154\1\145\2\uffff\3\uffff\1\151\1"+
        "\155\1\uffff\1\62\12\uffff\1\62\6\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\4\5\uffff\1\20\1\21\1\22\2\uffff\1\12\1\uffff\1\3\1"+
        "\4\1\5\1\6\1\7\1\16\1\17\1\20\1\21\1\1\1\uffff\1\2\1\13\1\14\1\15"+
        "\1\10\1\11";
    static final String DFA5_specialS =
        "\1\2\6\uffff\1\1\1\0\30\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\13\1\12\1\11\2\13\1\12\22\13\1\12\1\13\1\7\4\13\1\10\7"+
            "\13\1\4\14\13\1\1\1\3\43\13\1\5\2\13\1\6\16\13\1\2\uff8c\13",
            "\1\14\62\uffff\1\17\6\uffff\1\15\10\uffff\1\16",
            "\1\20",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\0\25",
            "\12\26\1\uffff\ufff5\26",
            "",
            "",
            "",
            "\1\32\6\uffff\1\31",
            "\1\34\56\uffff\1\33",
            "",
            "\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\40",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_STRING | RULE_TEXT | RULE_NL | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_8 = input.LA(1);

                        s = -1;
                        if ( ((LA5_8>='\u0000' && LA5_8<='\t')||(LA5_8>='\u000B' && LA5_8<='\uFFFF')) ) {s = 22;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_7 = input.LA(1);

                        s = -1;
                        if ( ((LA5_7>='\u0000' && LA5_7<='\uFFFF')) ) {s = 21;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='<') ) {s = 1;}

                        else if ( (LA5_0=='s') ) {s = 2;}

                        else if ( (LA5_0=='=') ) {s = 3;}

                        else if ( (LA5_0=='/') ) {s = 4;}

                        else if ( (LA5_0=='a') ) {s = 5;}

                        else if ( (LA5_0=='d') ) {s = 6;}

                        else if ( (LA5_0=='\"') ) {s = 7;}

                        else if ( (LA5_0=='\'') ) {s = 8;}

                        else if ( (LA5_0=='\n') ) {s = 9;}

                        else if ( (LA5_0=='\t'||LA5_0=='\r'||LA5_0==' ') ) {s = 10;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||LA5_0=='!'||(LA5_0>='#' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='.')||(LA5_0>='0' && LA5_0<=';')||(LA5_0>='>' && LA5_0<='`')||(LA5_0>='b' && LA5_0<='c')||(LA5_0>='e' && LA5_0<='r')||(LA5_0>='t' && LA5_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}