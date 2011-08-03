package org.eclipse.ocl.examples.xtext.markup.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkupLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__12=12;
    public static final int RULE_WS=6;
    public static final int T__17=17;
    public static final int RULE_NL=7;
    public static final int RULE_TEXT=9;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__16=16;
    public static final int RULE_STRING=8;
    public static final int RULE_WORD=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__14=14;
    public static final int T__11=11;
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
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:11:7: ( 'b[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:11:9: 'b['
            {
            match("b["); 


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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:12:7: ( 'e[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:12:9: 'e['
            {
            match("e["); 


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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:13:7: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:13:9: ']'
            {
            match(']'); 

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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:14:7: ( 'fig[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:14:9: 'fig['
            {
            match("fig["); 


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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:15:7: ( 'fig:' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:15:9: 'fig:'
            {
            match("fig:"); 


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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:16:7: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:16:9: '['
            {
            match('['); 

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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:17:7: ( 'fig-[' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:17:9: 'fig-['
            {
            match("fig-["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:499:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:499:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:499:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:501:11: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' ) | ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:501:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' ) | ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:501:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' ) | ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:501:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' | '[' | ']' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='<'||input.LA(1)=='>'||(input.LA(1)>='[' && input.LA(1)<=']')||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:501:71: ~ ( ( '\\\\' | '[' | ']' | ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:503:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:503:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:503:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:503:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '<' | '>' )
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
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:503:69: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop3;
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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:505:11: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' ) | ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:505:13: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' ) | ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:505:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' ) | ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:505:19: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '[' | ']' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='[' && input.LA(1)<=']')||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:505:68: ~ ( ( '\\\\' | '\\'' | '[' | ']' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:9: ( ( '\\n' | '\\r' ) ( ( RULE_WS )* ( '\\n' | '\\r' ) )* )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:11: ( '\\n' | '\\r' ) ( ( RULE_WS )* ( '\\n' | '\\r' ) )*
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:23: ( ( RULE_WS )* ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:24: ( RULE_WS )* ( '\\n' | '\\r' )
            	    {
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:24: ( RULE_WS )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0=='\t'||LA5_0==' ') ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:507:24: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:509:9: ( ( ' ' | '\\t' )+ )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:509:11: ( ' ' | '\\t' )+
            {
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:509:11: ( ' ' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:511:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:511:18: .
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
        // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_ID | RULE_WORD | RULE_STRING | RULE_TEXT | RULE_NL | RULE_WS | RULE_ANY_OTHER )
        int alt8=14;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:52: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:60: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:70: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:82: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:92: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.markup/src-gen/org/eclipse/ocl/examples/xtext/markup/parser/antlr/internal/InternalMarkup.g:1:108: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\2\16\1\uffff\1\16\1\uffff\1\16\1\25\2\17\6\uffff\1\16"+
        "\2\uffff\1\16\3\uffff\1\17\3\uffff\1\17\4\uffff\1\16\2\17\1\uffff"+
        "\1\46\1\17\2\uffff";
    static final String DFA8_eofS =
        "\50\uffff";
    static final String DFA8_minS =
        "\3\0\1\uffff\1\0\1\uffff\1\0\1\42\2\0\6\uffff\1\0\2\uffff\1\0\2"+
        "\uffff\1\42\1\0\2\uffff\1\42\1\0\4\uffff\3\0\1\uffff\1\0\1\133\2"+
        "\uffff";
    static final String DFA8_maxS =
        "\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\164\2\uffff\6\uffff"+
        "\1\uffff\2\uffff\1\uffff\2\uffff\1\164\1\uffff\2\uffff\1\164\1\uffff"+
        "\4\uffff\3\uffff\1\uffff\1\uffff\1\133\2\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\3\1\uffff\1\6\4\uffff\1\11\1\14\1\15\1\1\1\10\1\11\1"+
        "\uffff\1\2\1\3\1\uffff\1\6\1\16\2\uffff\1\11\1\12\2\uffff\1\11\1"+
        "\13\1\14\1\15\3\uffff\1\4\2\uffff\1\5\1\7";
    static final String DFA8_specialS =
        "\1\12\1\15\1\7\1\uffff\1\2\1\uffff\1\13\1\uffff\1\0\1\6\6\uffff"+
        "\1\10\2\uffff\1\14\3\uffff\1\16\3\uffff\1\5\4\uffff\1\11\1\4\1\1"+
        "\1\uffff\1\3\3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\12\1\14\1\13\2\12\1\13\22\12\1\14\1\12\1\10\4\12\1\11\31"+
            "\12\32\6\1\5\1\7\1\3\1\12\1\6\1\12\1\6\1\1\2\6\1\2\1\4\24\6"+
            "\uff85\12",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\17\17\12\20\7\17"+
            "\32\20\1\15\1\17\1\uffff\1\17\1\20\1\17\32\20\uff85\17",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\17\17\12\20\7\17"+
            "\32\20\1\21\1\17\1\uffff\1\17\1\20\1\17\32\20\uff85\17",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\17\17\12\20\7\17"+
            "\32\20\1\uffff\1\17\1\uffff\1\17\1\20\1\17\10\20\1\23\21\20"+
            "\uff85\17",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\17\17\12\20\7\17"+
            "\32\20\1\uffff\1\17\1\uffff\1\17\1\20\1\17\32\20\uff85\17",
            "\1\17\4\uffff\1\17\24\uffff\1\17\1\uffff\1\17\34\uffff\3\17"+
            "\4\uffff\1\17\3\uffff\1\17\7\uffff\1\17\3\uffff\1\17\1\uffff"+
            "\1\17",
            "\11\27\2\31\2\27\1\31\22\27\1\31\1\27\1\30\70\27\1\31\1\26"+
            "\1\31\uffa2\27",
            "\11\33\1\35\1\uffff\2\33\1\35\22\33\1\35\6\33\1\34\63\33\1"+
            "\uffff\1\32\1\uffff\uffa2\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\17\17\12\20\7\17"+
            "\32\20\1\uffff\1\17\1\uffff\1\17\1\20\1\17\32\20\uff85\17",
            "",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\17\17\12\20\7\17"+
            "\32\20\1\uffff\1\17\1\uffff\1\17\1\20\1\17\6\20\1\40\23\20\uff85"+
            "\17",
            "",
            "",
            "\1\41\4\uffff\1\41\24\uffff\1\41\1\uffff\1\41\34\uffff\1\17"+
            "\1\41\1\17\4\uffff\1\41\3\uffff\1\41\7\uffff\1\41\3\uffff\1"+
            "\41\1\uffff\1\41",
            "\11\27\2\31\2\27\1\31\22\27\1\31\1\27\1\30\70\27\1\31\1\26"+
            "\1\31\uffa2\27",
            "",
            "",
            "\1\42\4\uffff\1\42\24\uffff\1\17\1\uffff\1\17\34\uffff\3\42"+
            "\4\uffff\1\42\3\uffff\1\42\7\uffff\1\42\3\uffff\1\42\1\uffff"+
            "\1\42",
            "\11\33\1\35\1\uffff\2\33\1\35\22\33\1\35\6\33\1\34\63\33\1"+
            "\uffff\1\32\1\uffff\uffa2\33",
            "",
            "",
            "",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\14\17\1\45\2\17"+
            "\12\20\1\44\6\17\32\20\1\43\1\17\1\uffff\1\17\1\20\1\17\32\20"+
            "\uff85\17",
            "\11\27\2\31\2\27\1\31\22\27\1\31\1\27\1\30\70\27\1\31\1\26"+
            "\1\31\uffa2\27",
            "\11\33\1\35\1\uffff\2\33\1\35\22\33\1\35\6\33\1\34\63\33\1"+
            "\uffff\1\32\1\uffff\uffa2\33",
            "",
            "\11\17\2\uffff\2\17\1\uffff\22\17\1\uffff\72\17\1\uffff\1"+
            "\17\1\uffff\uffa2\17",
            "\1\47",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_ID | RULE_WORD | RULE_STRING | RULE_TEXT | RULE_NL | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_8 = input.LA(1);

                        s = -1;
                        if ( (LA8_8=='\\') ) {s = 22;}

                        else if ( ((LA8_8>='\u0000' && LA8_8<='\b')||(LA8_8>='\u000B' && LA8_8<='\f')||(LA8_8>='\u000E' && LA8_8<='\u001F')||LA8_8=='!'||(LA8_8>='#' && LA8_8<='Z')||(LA8_8>='^' && LA8_8<='\uFFFF')) ) {s = 23;}

                        else if ( (LA8_8=='\"') ) {s = 24;}

                        else if ( ((LA8_8>='\t' && LA8_8<='\n')||LA8_8=='\r'||LA8_8==' '||LA8_8=='['||LA8_8==']') ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_34 = input.LA(1);

                        s = -1;
                        if ( (LA8_34=='\\') ) {s = 26;}

                        else if ( (LA8_34=='\'') ) {s = 28;}

                        else if ( ((LA8_34>='\u0000' && LA8_34<='\b')||(LA8_34>='\u000B' && LA8_34<='\f')||(LA8_34>='\u000E' && LA8_34<='\u001F')||(LA8_34>='!' && LA8_34<='&')||(LA8_34>='(' && LA8_34<='Z')||(LA8_34>='^' && LA8_34<='\uFFFF')) ) {s = 27;}

                        else if ( (LA8_34=='\t'||LA8_34=='\r'||LA8_34==' ') ) {s = 29;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_4 = input.LA(1);

                        s = -1;
                        if ( (LA8_4=='i') ) {s = 19;}

                        else if ( ((LA8_4>='\u0000' && LA8_4<='\b')||(LA8_4>='\u000B' && LA8_4<='\f')||(LA8_4>='\u000E' && LA8_4<='\u001F')||(LA8_4>='!' && LA8_4<='/')||(LA8_4>=':' && LA8_4<='@')||LA8_4=='\\'||LA8_4=='^'||LA8_4=='`'||(LA8_4>='{' && LA8_4<='\uFFFF')) ) {s = 15;}

                        else if ( ((LA8_4>='0' && LA8_4<='9')||(LA8_4>='A' && LA8_4<='Z')||LA8_4=='_'||(LA8_4>='a' && LA8_4<='h')||(LA8_4>='j' && LA8_4<='z')) ) {s = 16;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_36 = input.LA(1);

                        s = -1;
                        if ( ((LA8_36>='\u0000' && LA8_36<='\b')||(LA8_36>='\u000B' && LA8_36<='\f')||(LA8_36>='\u000E' && LA8_36<='\u001F')||(LA8_36>='!' && LA8_36<='Z')||LA8_36=='\\'||(LA8_36>='^' && LA8_36<='\uFFFF')) ) {s = 15;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_33 = input.LA(1);

                        s = -1;
                        if ( (LA8_33=='\\') ) {s = 22;}

                        else if ( (LA8_33=='\"') ) {s = 24;}

                        else if ( ((LA8_33>='\u0000' && LA8_33<='\b')||(LA8_33>='\u000B' && LA8_33<='\f')||(LA8_33>='\u000E' && LA8_33<='\u001F')||LA8_33=='!'||(LA8_33>='#' && LA8_33<='Z')||(LA8_33>='^' && LA8_33<='\uFFFF')) ) {s = 23;}

                        else if ( ((LA8_33>='\t' && LA8_33<='\n')||LA8_33=='\r'||LA8_33==' '||LA8_33=='['||LA8_33==']') ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_27 = input.LA(1);

                        s = -1;
                        if ( (LA8_27=='\'') ) {s = 28;}

                        else if ( (LA8_27=='\\') ) {s = 26;}

                        else if ( ((LA8_27>='\u0000' && LA8_27<='\b')||(LA8_27>='\u000B' && LA8_27<='\f')||(LA8_27>='\u000E' && LA8_27<='\u001F')||(LA8_27>='!' && LA8_27<='&')||(LA8_27>='(' && LA8_27<='Z')||(LA8_27>='^' && LA8_27<='\uFFFF')) ) {s = 27;}

                        else if ( (LA8_27=='\t'||LA8_27=='\r'||LA8_27==' ') ) {s = 29;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_9 = input.LA(1);

                        s = -1;
                        if ( (LA8_9=='\\') ) {s = 26;}

                        else if ( ((LA8_9>='\u0000' && LA8_9<='\b')||(LA8_9>='\u000B' && LA8_9<='\f')||(LA8_9>='\u000E' && LA8_9<='\u001F')||(LA8_9>='!' && LA8_9<='&')||(LA8_9>='(' && LA8_9<='Z')||(LA8_9>='^' && LA8_9<='\uFFFF')) ) {s = 27;}

                        else if ( (LA8_9=='\'') ) {s = 28;}

                        else if ( (LA8_9=='\t'||LA8_9=='\r'||LA8_9==' ') ) {s = 29;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_2 = input.LA(1);

                        s = -1;
                        if ( (LA8_2=='[') ) {s = 17;}

                        else if ( ((LA8_2>='\u0000' && LA8_2<='\b')||(LA8_2>='\u000B' && LA8_2<='\f')||(LA8_2>='\u000E' && LA8_2<='\u001F')||(LA8_2>='!' && LA8_2<='/')||(LA8_2>=':' && LA8_2<='@')||LA8_2=='\\'||LA8_2=='^'||LA8_2=='`'||(LA8_2>='{' && LA8_2<='\uFFFF')) ) {s = 15;}

                        else if ( ((LA8_2>='0' && LA8_2<='9')||(LA8_2>='A' && LA8_2<='Z')||LA8_2=='_'||(LA8_2>='a' && LA8_2<='z')) ) {s = 16;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_16 = input.LA(1);

                        s = -1;
                        if ( ((LA8_16>='0' && LA8_16<='9')||(LA8_16>='A' && LA8_16<='Z')||LA8_16=='_'||(LA8_16>='a' && LA8_16<='z')) ) {s = 16;}

                        else if ( ((LA8_16>='\u0000' && LA8_16<='\b')||(LA8_16>='\u000B' && LA8_16<='\f')||(LA8_16>='\u000E' && LA8_16<='\u001F')||(LA8_16>='!' && LA8_16<='/')||(LA8_16>=':' && LA8_16<='@')||LA8_16=='\\'||LA8_16=='^'||LA8_16=='`'||(LA8_16>='{' && LA8_16<='\uFFFF')) ) {s = 15;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_32 = input.LA(1);

                        s = -1;
                        if ( (LA8_32=='[') ) {s = 35;}

                        else if ( (LA8_32==':') ) {s = 36;}

                        else if ( (LA8_32=='-') ) {s = 37;}

                        else if ( ((LA8_32>='0' && LA8_32<='9')||(LA8_32>='A' && LA8_32<='Z')||LA8_32=='_'||(LA8_32>='a' && LA8_32<='z')) ) {s = 16;}

                        else if ( ((LA8_32>='\u0000' && LA8_32<='\b')||(LA8_32>='\u000B' && LA8_32<='\f')||(LA8_32>='\u000E' && LA8_32<='\u001F')||(LA8_32>='!' && LA8_32<=',')||(LA8_32>='.' && LA8_32<='/')||(LA8_32>=';' && LA8_32<='@')||LA8_32=='\\'||LA8_32=='^'||LA8_32=='`'||(LA8_32>='{' && LA8_32<='\uFFFF')) ) {s = 15;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='b') ) {s = 1;}

                        else if ( (LA8_0=='e') ) {s = 2;}

                        else if ( (LA8_0==']') ) {s = 3;}

                        else if ( (LA8_0=='f') ) {s = 4;}

                        else if ( (LA8_0=='[') ) {s = 5;}

                        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||LA8_0=='a'||(LA8_0>='c' && LA8_0<='d')||(LA8_0>='g' && LA8_0<='z')) ) {s = 6;}

                        else if ( (LA8_0=='\\') ) {s = 7;}

                        else if ( (LA8_0=='\"') ) {s = 8;}

                        else if ( (LA8_0=='\'') ) {s = 9;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||(LA8_0>='#' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='@')||LA8_0=='^'||LA8_0=='`'||(LA8_0>='{' && LA8_0<='\uFFFF')) ) {s = 10;}

                        else if ( (LA8_0=='\n'||LA8_0=='\r') ) {s = 11;}

                        else if ( (LA8_0=='\t'||LA8_0==' ') ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_6 = input.LA(1);

                        s = -1;
                        if ( ((LA8_6>='\u0000' && LA8_6<='\b')||(LA8_6>='\u000B' && LA8_6<='\f')||(LA8_6>='\u000E' && LA8_6<='\u001F')||(LA8_6>='!' && LA8_6<='/')||(LA8_6>=':' && LA8_6<='@')||LA8_6=='\\'||LA8_6=='^'||LA8_6=='`'||(LA8_6>='{' && LA8_6<='\uFFFF')) ) {s = 15;}

                        else if ( ((LA8_6>='0' && LA8_6<='9')||(LA8_6>='A' && LA8_6<='Z')||LA8_6=='_'||(LA8_6>='a' && LA8_6<='z')) ) {s = 16;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_19 = input.LA(1);

                        s = -1;
                        if ( (LA8_19=='g') ) {s = 32;}

                        else if ( ((LA8_19>='0' && LA8_19<='9')||(LA8_19>='A' && LA8_19<='Z')||LA8_19=='_'||(LA8_19>='a' && LA8_19<='f')||(LA8_19>='h' && LA8_19<='z')) ) {s = 16;}

                        else if ( ((LA8_19>='\u0000' && LA8_19<='\b')||(LA8_19>='\u000B' && LA8_19<='\f')||(LA8_19>='\u000E' && LA8_19<='\u001F')||(LA8_19>='!' && LA8_19<='/')||(LA8_19>=':' && LA8_19<='@')||LA8_19=='\\'||LA8_19=='^'||LA8_19=='`'||(LA8_19>='{' && LA8_19<='\uFFFF')) ) {s = 15;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_1 = input.LA(1);

                        s = -1;
                        if ( (LA8_1=='[') ) {s = 13;}

                        else if ( ((LA8_1>='\u0000' && LA8_1<='\b')||(LA8_1>='\u000B' && LA8_1<='\f')||(LA8_1>='\u000E' && LA8_1<='\u001F')||(LA8_1>='!' && LA8_1<='/')||(LA8_1>=':' && LA8_1<='@')||LA8_1=='\\'||LA8_1=='^'||LA8_1=='`'||(LA8_1>='{' && LA8_1<='\uFFFF')) ) {s = 15;}

                        else if ( ((LA8_1>='0' && LA8_1<='9')||(LA8_1>='A' && LA8_1<='Z')||LA8_1=='_'||(LA8_1>='a' && LA8_1<='z')) ) {s = 16;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_23 = input.LA(1);

                        s = -1;
                        if ( (LA8_23=='\\') ) {s = 22;}

                        else if ( (LA8_23=='\"') ) {s = 24;}

                        else if ( ((LA8_23>='\u0000' && LA8_23<='\b')||(LA8_23>='\u000B' && LA8_23<='\f')||(LA8_23>='\u000E' && LA8_23<='\u001F')||LA8_23=='!'||(LA8_23>='#' && LA8_23<='Z')||(LA8_23>='^' && LA8_23<='\uFFFF')) ) {s = 23;}

                        else if ( ((LA8_23>='\t' && LA8_23<='\n')||LA8_23=='\r'||LA8_23==' '||LA8_23=='['||LA8_23==']') ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}