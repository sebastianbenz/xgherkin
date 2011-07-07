package de.sebastianbenz.xgherkin.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinLexer extends Lexer {
    public static final int RULE_AS_A=9;
    public static final int RULE_IN_ORDER_TO=10;
    public static final int RULE_THEN_TEXT=18;
    public static final int RULE_TAG=6;
    public static final int RULE_TEXT=8;
    public static final int RULE_EXAMPLE_HEADING=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_CODE=17;
    public static final int RULE_WHEN_TEXT=16;
    public static final int RULE_GIVEN_TEXT=19;
    public static final int RULE_I_WANT_TO=11;
    public static final int RULE_EXAMPLE_ROW_END=5;
    public static final int RULE_SCENARIO_TEXT=12;
    public static final int RULE_BACKGROUND_TEXT=15;
    public static final int RULE_WS=22;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=13;
    public static final int RULE_AND_TEXT=20;
    public static final int RULE_EXAMPLE_CELL=14;
    public static final int RULE_FEATURE_TEXT=7;

    // delegates
    // delegators

    public InternalGherkinLexer() {;} 
    public InternalGherkinLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGherkinLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g"; }

    // $ANTLR start "RULE_EXAMPLE_HEADING"
    public final void mRULE_EXAMPLE_HEADING() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_HEADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2119:22: ( 'Examples:' ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2119:24: 'Examples:' ( '\\r' )? '\\n'
            {
            match("Examples:"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2119:36: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2119:36: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_HEADING"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:19: ( ( 'Narrative:' | 'Feature:' ) (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:21: ( 'Narrative:' | 'Feature:' ) (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:21: ( 'Narrative:' | 'Feature:' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='N') ) {
                alt2=1;
            }
            else if ( (LA2_0=='F') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:22: 'Narrative:'
                    {
                    match("Narrative:"); 


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:35: 'Feature:'
                    {
                    match("Feature:"); 


                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:47: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:47: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
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

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:63: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:63: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:69: ( '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2121:69: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_IN_ORDER_TO"
    public final void mRULE_IN_ORDER_TO() throws RecognitionException {
        try {
            int _type = RULE_IN_ORDER_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:18: ( 'In order to' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:20: 'In order to' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("In order to"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:34: (~ ( ( '\\r' | '\\n' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:34: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
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

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:50: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:50: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:56: ( '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2123:56: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_ORDER_TO"

    // $ANTLR start "RULE_AS_A"
    public final void mRULE_AS_A() throws RecognitionException {
        try {
            int _type = RULE_AS_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:11: ( 'As a' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:13: 'As a' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("As a"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:20: (~ ( ( '\\r' | '\\n' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:20: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:36: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:36: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:42: ( '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:42: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AS_A"

    // $ANTLR start "RULE_I_WANT_TO"
    public final void mRULE_I_WANT_TO() throws RecognitionException {
        try {
            int _type = RULE_I_WANT_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:16: ( 'I want to ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:18: 'I want to ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("I want to "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:31: (~ ( ( '\\r' | '\\n' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:31: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:47: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:47: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:53: ( '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:53: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_I_WANT_TO"

    // $ANTLR start "RULE_SCENARIO_TEXT"
    public final void mRULE_SCENARIO_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:20: ( 'Scenario' ( ' ' )* ':' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:22: 'Scenario' ( ' ' )* ':' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("Scenario"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:33: ( ' ' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:33: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(':'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:42: (~ ( ( '\\r' | '\\n' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:42: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:58: ( '\\r' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:58: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:64: ( '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:64: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_SCENARIO_OUTLINE_TEXT"
    public final void mRULE_SCENARIO_OUTLINE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_OUTLINE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:28: ( 'Scenario' ( ' ' )* 'Outline' ( ' ' )* ':' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:30: 'Scenario' ( ' ' )* 'Outline' ( ' ' )* ':' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("Scenario"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:41: ( ' ' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:41: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("Outline"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:56: ( ' ' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:56: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(':'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:65: (~ ( ( '\\r' | '\\n' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:65: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:81: ( '\\r' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:81: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:87: ( '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:87: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_OUTLINE_TEXT"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:22: ( 'Background:' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:24: 'Background:' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("Background:"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:38: (~ ( ( '\\r' | '\\n' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:38: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:54: ( '\\r' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:54: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:60: ( '\\n' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:60: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKGROUND_TEXT"

    // $ANTLR start "RULE_WHEN_TEXT"
    public final void mRULE_WHEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_WHEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:16: ( 'When ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:18: 'When ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("When "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:26: (~ ( ( '\\r' | '\\n' ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:26: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:42: ( '\\r' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:42: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:48: ( '\\n' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\n') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2135:48: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN_TEXT"

    // $ANTLR start "RULE_THEN_TEXT"
    public final void mRULE_THEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_THEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:16: ( 'Then ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:18: 'Then ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("Then "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:26: (~ ( ( '\\r' | '\\n' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:26: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:42: ( '\\r' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:42: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:48: ( '\\n' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\n') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2137:48: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:17: ( 'Given ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:19: 'Given ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("Given "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:28: (~ ( ( '\\r' | '\\n' ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:28: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:44: ( '\\r' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:44: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:50: ( '\\n' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\n') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:50: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVEN_TEXT"

    // $ANTLR start "RULE_AND_TEXT"
    public final void mRULE_AND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_AND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:15: ( 'And ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:17: 'And ' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match("And "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:24: (~ ( ( '\\r' | '\\n' ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>='\u0000' && LA36_0<='\t')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:24: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:40: ( '\\r' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\r') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:46: ( '\\n' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\n') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2141:46: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_EXAMPLE_CELL"
    public final void mRULE_EXAMPLE_CELL() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_CELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2143:19: ( '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+ )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2143:21: '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            {
            match('|'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2143:25: (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\u0000' && LA39_0<='\t')||(LA39_0>='\u000B' && LA39_0<='\f')||(LA39_0>='\u000E' && LA39_0<='{')||(LA39_0>='}' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2143:25: ~ ( ( '\\r' | '\\n' | '|' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_CELL"

    // $ANTLR start "RULE_EXAMPLE_ROW_END"
    public final void mRULE_EXAMPLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:22: ( '|' ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:24: '|' ( '\\r' )? '\\n'
            {
            match('|'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:28: ( '\\r' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\r') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:28: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_ROW_END"

    // $ANTLR start "RULE_CODE"
    public final void mRULE_CODE() throws RecognitionException {
        try {
            int _type = RULE_CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:11: ( ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='\"') ) {
                alt43=1;
            }
            else if ( (LA43_0=='\'') ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:14: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:20: ( options {greedy=false; } : . )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0=='\"') ) {
                            int LA41_1 = input.LA(2);

                            if ( (LA41_1=='\"') ) {
                                int LA41_3 = input.LA(3);

                                if ( (LA41_3=='\"') ) {
                                    alt41=2;
                                }
                                else if ( ((LA41_3>='\u0000' && LA41_3<='!')||(LA41_3>='#' && LA41_3<='\uFFFF')) ) {
                                    alt41=1;
                                }


                            }
                            else if ( ((LA41_1>='\u0000' && LA41_1<='!')||(LA41_1>='#' && LA41_1<='\uFFFF')) ) {
                                alt41=1;
                            }


                        }
                        else if ( ((LA41_0>='\u0000' && LA41_0<='!')||(LA41_0>='#' && LA41_0<='\uFFFF')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:58: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:67: ( options {greedy=false; } : . )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0=='\'') ) {
                            int LA42_1 = input.LA(2);

                            if ( (LA42_1=='\'') ) {
                                int LA42_3 = input.LA(3);

                                if ( (LA42_3=='\'') ) {
                                    alt42=2;
                                }
                                else if ( ((LA42_3>='\u0000' && LA42_3<='&')||(LA42_3>='(' && LA42_3<='\uFFFF')) ) {
                                    alt42=1;
                                }


                            }
                            else if ( ((LA42_1>='\u0000' && LA42_1<='&')||(LA42_1>='(' && LA42_1<='\uFFFF')) ) {
                                alt42=1;
                            }


                        }
                        else if ( ((LA42_0>='\u0000' && LA42_0<='&')||(LA42_0>='(' && LA42_0<='\uFFFF')) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CODE"

    // $ANTLR start "RULE_TAG"
    public final void mRULE_TAG() throws RecognitionException {
        try {
            int _type = RULE_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:10: ( '@' (~ ( ( '\\r' | '\\n' ) ) )+ ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:12: '@' (~ ( ( '\\r' | '\\n' ) ) )+ ( '\\r' )? ( '\\n' )?
            {
            match('@'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:16: (~ ( ( '\\r' | '\\n' ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\u0000' && LA44_0<='\t')||(LA44_0>='\u000B' && LA44_0<='\f')||(LA44_0>='\u000E' && LA44_0<='\uFFFF')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:16: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:32: ( '\\r' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\r') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:32: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:38: ( '\\n' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\n') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2149:38: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:17: ( '#' (~ ( ( '\\r' | '\\n' ) ) )+ ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:19: '#' (~ ( ( '\\r' | '\\n' ) ) )+ ( '\\r' )? ( '\\n' )?
            {
            match('#'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:23: (~ ( ( '\\r' | '\\n' ) ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='\u0000' && LA47_0<='\t')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\uFFFF')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:23: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:39: ( '\\r' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='\r') ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:39: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:45: ( '\\n' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='\n') ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2151:45: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:11: (~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:13: ~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:45: (~ ( ( '\\r' | '\\n' ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>='\u0000' && LA50_0<='\t')||(LA50_0>='\u000B' && LA50_0<='\f')||(LA50_0>='\u000E' && LA50_0<='\uFFFF')) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:45: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:61: ( '\\r' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='\r') ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:61: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:67: ( '\\n' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0=='\n') ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2153:67: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2155:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2155:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2155:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>='\t' && LA53_0<='\n')||LA53_0=='\r'||LA53_0==' ') ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:8: ( RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_CELL | RULE_EXAMPLE_ROW_END | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS )
        int alt54=19;
        alt54 = dfa54.predict(input);
        switch (alt54) {
            case 1 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:10: RULE_EXAMPLE_HEADING
                {
                mRULE_EXAMPLE_HEADING(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:31: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:49: RULE_IN_ORDER_TO
                {
                mRULE_IN_ORDER_TO(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:66: RULE_AS_A
                {
                mRULE_AS_A(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:76: RULE_I_WANT_TO
                {
                mRULE_I_WANT_TO(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:91: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 7 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:110: RULE_SCENARIO_OUTLINE_TEXT
                {
                mRULE_SCENARIO_OUTLINE_TEXT(); 

                }
                break;
            case 8 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:137: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 9 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:158: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 10 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:173: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 11 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:188: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 12 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:204: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 13 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:218: RULE_EXAMPLE_CELL
                {
                mRULE_EXAMPLE_CELL(); 

                }
                break;
            case 14 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:236: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 15 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:257: RULE_CODE
                {
                mRULE_CODE(); 

                }
                break;
            case 16 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:267: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;
            case 17 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:292: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 19 :
                // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1:302: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA54_eotS =
        "\1\uffff\12\20\1\uffff\2\20\1\uffff\1\20\2\uffff\14\20\2\uffff\2"+
        "\20\1\63\16\20\1\63\2\uffff\5\20\1\120\1\124\22\20\2\120\2\uffff"+
        "\2\124\2\uffff\2\20\1\147\1\152\1\20\1\uffff\11\20\2\147\2\uffff"+
        "\1\152\2\uffff\1\152\1\171\2\132\7\20\2\171\2\uffff\2\20\1\u0085"+
        "\6\20\1\u0085\2\uffff\1\u0085\3\20\1\u0095\3\20\1\uffff\1\u0085"+
        "\1\20\1\u009d\2\u0095\2\uffff\2\20\1\uffff\1\u00a2\2\u009d\2\uffff"+
        "\1\20\1\u00a8\1\u00a2\2\uffff\1\u00a2\1\20\2\u00a8\2\uffff\4\20"+
        "\3\u00b1\2\uffff";
    static final String DFA54_eofS =
        "\u00b2\uffff";
    static final String DFA54_minS =
        "\1\0\1\170\1\141\1\145\1\40\1\156\1\143\1\141\2\150\1\151\1\0\1"+
        "\42\1\47\1\uffff\1\0\2\uffff\1\141\1\162\1\141\1\40\1\167\1\40\1"+
        "\144\1\145\1\143\2\145\1\166\2\uffff\1\42\1\47\1\0\1\155\1\162\1"+
        "\164\1\157\2\141\1\40\1\156\1\153\2\156\1\145\2\0\1\12\2\uffff\1"+
        "\160\1\141\1\165\1\162\1\156\2\0\1\141\1\147\2\40\1\156\10\0\1\154"+
        "\1\164\1\162\1\144\1\164\1\0\1\12\2\uffff\1\0\1\12\2\uffff\2\162"+
        "\2\0\1\40\1\uffff\2\0\1\145\1\151\2\145\1\40\1\151\1\157\1\0\1\12"+
        "\2\uffff\1\12\2\uffff\4\0\1\163\1\166\1\72\1\162\1\164\1\157\1\165"+
        "\1\0\1\12\2\uffff\1\72\1\145\1\0\1\40\1\157\1\40\1\156\1\12\1\72"+
        "\1\12\2\uffff\1\0\1\164\2\40\1\0\1\165\1\144\1\12\1\uffff\1\0\1"+
        "\157\2\0\1\12\2\uffff\1\164\1\72\1\uffff\2\0\1\12\2\uffff\1\154"+
        "\1\0\1\12\2\uffff\1\0\1\151\1\0\1\12\2\uffff\1\156\1\145\2\40\2"+
        "\0\1\12\2\uffff";
    static final String DFA54_maxS =
        "\1\uffff\1\170\1\141\1\145\1\156\1\163\1\143\1\141\2\150\1\151\1"+
        "\uffff\1\42\1\47\1\uffff\1\uffff\2\uffff\1\141\1\162\1\141\1\40"+
        "\1\167\1\40\1\144\1\145\1\143\2\145\1\166\2\uffff\1\42\1\47\1\uffff"+
        "\1\155\1\162\1\164\1\157\2\141\1\40\1\156\1\153\2\156\1\145\2\uffff"+
        "\1\12\2\uffff\1\160\1\141\1\165\1\162\1\156\2\uffff\1\141\1\147"+
        "\2\40\1\156\10\uffff\1\154\1\164\1\162\1\144\1\164\1\uffff\1\12"+
        "\2\uffff\1\uffff\1\12\2\uffff\2\162\2\uffff\1\40\1\uffff\2\uffff"+
        "\1\145\1\151\2\145\1\40\1\151\1\157\1\uffff\1\12\2\uffff\1\12\2"+
        "\uffff\4\uffff\1\163\1\166\1\72\1\162\1\164\1\157\1\165\1\uffff"+
        "\1\12\2\uffff\1\72\1\145\1\uffff\1\40\1\157\1\117\1\156\1\15\1\72"+
        "\1\12\2\uffff\1\uffff\1\164\1\40\1\117\1\uffff\1\165\1\144\1\12"+
        "\1\uffff\1\uffff\1\157\2\uffff\1\12\2\uffff\1\164\1\72\1\uffff\2"+
        "\uffff\1\12\2\uffff\1\154\1\uffff\1\12\2\uffff\1\uffff\1\151\1\uffff"+
        "\1\12\2\uffff\1\156\1\145\2\72\2\uffff\1\12\2\uffff";
    static final String DFA54_acceptS =
        "\16\uffff\1\20\1\uffff\1\22\1\23\14\uffff\1\16\1\15\22\uffff\2\21"+
        "\33\uffff\2\4\2\uffff\2\14\5\uffff\1\17\13\uffff\2\11\1\uffff\2"+
        "\12\15\uffff\2\13\12\uffff\2\2\10\uffff\1\1\5\uffff\2\6\2\uffff"+
        "\1\1\3\uffff\2\5\3\uffff\2\3\4\uffff\2\10\7\uffff\2\7";
    static final String DFA54_specialS =
        "\1\41\12\uffff\1\47\3\uffff\1\0\22\uffff\1\46\14\uffff\1\34\1\12"+
        "\10\uffff\1\3\1\16\5\uffff\1\1\1\36\1\30\1\23\1\17\1\6\1\4\1\50"+
        "\5\uffff\1\22\3\uffff\1\27\5\uffff\1\45\1\20\2\uffff\1\25\1\10\7"+
        "\uffff\1\21\6\uffff\1\24\1\35\1\14\1\37\7\uffff\1\2\5\uffff\1\32"+
        "\11\uffff\1\31\3\uffff\1\42\4\uffff\1\26\1\uffff\1\40\1\13\6\uffff"+
        "\1\43\1\15\4\uffff\1\11\3\uffff\1\44\1\uffff\1\33\7\uffff\1\7\1"+
        "\5\3\uffff}>";
    static final String[] DFA54_transitionS = {
            "\11\20\2\21\2\20\1\21\22\20\1\21\1\20\1\14\1\17\3\20\1\15\30"+
            "\20\1\16\1\5\1\7\2\20\1\1\1\3\1\12\1\20\1\4\4\20\1\2\4\20\1"+
            "\6\1\11\2\20\1\10\44\20\1\13\uff83\20",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\26\115\uffff\1\25",
            "\1\30\4\uffff\1\27",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\12\37\1\36\2\37\1\36\156\37\1\uffff\uff83\37",
            "\1\40",
            "\1\41",
            "",
            "\12\42\1\uffff\2\42\1\uffff\ufff2\42",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\57",
            "\1\60",
            "\12\42\1\62\2\42\1\61\ufff2\42",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\103\1\101\2\103\1\100\24\103\1\102\uffdd\103",
            "\12\107\1\105\2\107\1\104\31\107\1\106\uffd8\107",
            "\1\62",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\115\1\117\2\115\1\116\ufff2\115",
            "\12\121\1\123\2\121\1\122\ufff2\121",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\132\1\101\ufff5\132",
            "\0\132",
            "\12\103\1\101\2\103\1\100\24\103\1\133\uffdd\103",
            "\12\103\1\101\2\103\1\100\24\103\1\102\uffdd\103",
            "\12\132\1\105\ufff5\132",
            "\0\132",
            "\12\107\1\105\2\107\1\104\31\107\1\134\uffd8\107",
            "\12\107\1\105\2\107\1\104\31\107\1\106\uffd8\107",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\115\1\117\2\115\1\116\ufff2\115",
            "\1\117",
            "",
            "",
            "\12\121\1\123\2\121\1\122\ufff2\121",
            "\1\123",
            "",
            "",
            "\1\142",
            "\1\143",
            "\12\144\1\146\2\144\1\145\ufff2\144",
            "\12\153\1\151\2\153\1\150\ufff2\153",
            "\1\154",
            "",
            "\12\103\1\101\2\103\1\100\24\103\1\155\uffdd\103",
            "\12\107\1\105\2\107\1\104\31\107\1\156\uffd8\107",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\144\1\146\2\144\1\145\ufff2\144",
            "\1\146",
            "",
            "",
            "\1\151",
            "",
            "",
            "\12\153\1\151\2\153\1\150\ufff2\153",
            "\12\166\1\170\2\166\1\167\ufff2\166",
            "\12\103\1\101\2\103\1\100\24\103\1\155\uffdd\103",
            "\12\107\1\105\2\107\1\104\31\107\1\156\uffd8\107",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\166\1\170\2\166\1\167\ufff2\166",
            "\1\170",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\u0086\1\u0084\2\u0086\1\u0083\ufff2\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089\31\uffff\1\u008a\24\uffff\1\u008b",
            "\1\u008c",
            "\1\u008e\2\uffff\1\u008d",
            "\1\u008f",
            "\1\u0084",
            "",
            "",
            "\12\u0086\1\u0084\2\u0086\1\u0083\ufff2\u0086",
            "\1\u0090",
            "\1\u0091",
            "\1\u0089\31\uffff\1\u008a\24\uffff\1\u008b",
            "\12\u0092\1\u0094\2\u0092\1\u0093\ufff2\u0092",
            "\1\u0096",
            "\1\u0097",
            "\1\u008e",
            "",
            "\12\u0086\1\u0084\2\u0086\1\u0083\ufff2\u0086",
            "\1\u0099",
            "\12\u009a\1\u009c\2\u009a\1\u009b\ufff2\u009a",
            "\12\u0092\1\u0094\2\u0092\1\u0093\ufff2\u0092",
            "\1\u0094",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "\12\u00a3\1\u00a1\2\u00a3\1\u00a0\ufff2\u00a3",
            "\12\u009a\1\u009c\2\u009a\1\u009b\ufff2\u009a",
            "\1\u009c",
            "",
            "",
            "\1\u00a4",
            "\12\u00a5\1\u00a7\2\u00a5\1\u00a6\ufff2\u00a5",
            "\1\u00a1",
            "",
            "",
            "\12\u00a3\1\u00a1\2\u00a3\1\u00a0\ufff2\u00a3",
            "\1\u00a9",
            "\12\u00a5\1\u00a7\2\u00a5\1\u00a6\ufff2\u00a5",
            "\1\u00a7",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\31\uffff\1\u00ad",
            "\1\u00ac\31\uffff\1\u00ad",
            "\12\u00ae\1\u00b0\2\u00ae\1\u00af\ufff2\u00ae",
            "\12\u00ae\1\u00b0\2\u00ae\1\u00af\ufff2\u00ae",
            "\1\u00b0",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_CELL | RULE_EXAMPLE_ROW_END | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_15 = input.LA(1);

                        s = -1;
                        if ( ((LA54_15>='\u0000' && LA54_15<='\t')||(LA54_15>='\u000B' && LA54_15<='\f')||(LA54_15>='\u000E' && LA54_15<='\uFFFF')) ) {s = 34;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_64 = input.LA(1);

                        s = -1;
                        if ( ((LA54_64>='\u0000' && LA54_64<='\t')||(LA54_64>='\u000B' && LA54_64<='\uFFFF')) ) {s = 90;}

                        else if ( (LA54_64=='\n') ) {s = 65;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_118 = input.LA(1);

                        s = -1;
                        if ( (LA54_118=='\r') ) {s = 119;}

                        else if ( (LA54_118=='\n') ) {s = 120;}

                        else if ( ((LA54_118>='\u0000' && LA54_118<='\t')||(LA54_118>='\u000B' && LA54_118<='\f')||(LA54_118>='\u000E' && LA54_118<='\uFFFF')) ) {s = 118;}

                        else s = 121;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_57 = input.LA(1);

                        s = -1;
                        if ( ((LA54_57>='\u0000' && LA54_57<='\t')||(LA54_57>='\u000B' && LA54_57<='\f')||(LA54_57>='\u000E' && LA54_57<='\uFFFF')) ) {s = 77;}

                        else if ( (LA54_57=='\r') ) {s = 78;}

                        else if ( (LA54_57=='\n') ) {s = 79;}

                        else s = 80;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_70 = input.LA(1);

                        s = -1;
                        if ( (LA54_70=='\'') ) {s = 92;}

                        else if ( (LA54_70=='\r') ) {s = 68;}

                        else if ( (LA54_70=='\n') ) {s = 69;}

                        else if ( ((LA54_70>='\u0000' && LA54_70<='\t')||(LA54_70>='\u000B' && LA54_70<='\f')||(LA54_70>='\u000E' && LA54_70<='&')||(LA54_70>='(' && LA54_70<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_174 = input.LA(1);

                        s = -1;
                        if ( (LA54_174=='\r') ) {s = 175;}

                        else if ( (LA54_174=='\n') ) {s = 176;}

                        else if ( ((LA54_174>='\u0000' && LA54_174<='\t')||(LA54_174>='\u000B' && LA54_174<='\f')||(LA54_174>='\u000E' && LA54_174<='\uFFFF')) ) {s = 174;}

                        else s = 177;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_69 = input.LA(1);

                        s = -1;
                        if ( ((LA54_69>='\u0000' && LA54_69<='\uFFFF')) ) {s = 90;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_173 = input.LA(1);

                        s = -1;
                        if ( ((LA54_173>='\u0000' && LA54_173<='\t')||(LA54_173>='\u000B' && LA54_173<='\f')||(LA54_173>='\u000E' && LA54_173<='\uFFFF')) ) {s = 174;}

                        else if ( (LA54_173=='\r') ) {s = 175;}

                        else if ( (LA54_173=='\n') ) {s = 176;}

                        else s = 177;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_92 = input.LA(1);

                        s = -1;
                        if ( (LA54_92=='\'') ) {s = 110;}

                        else if ( (LA54_92=='\r') ) {s = 68;}

                        else if ( (LA54_92=='\n') ) {s = 69;}

                        else if ( ((LA54_92>='\u0000' && LA54_92<='\t')||(LA54_92>='\u000B' && LA54_92<='\f')||(LA54_92>='\u000E' && LA54_92<='&')||(LA54_92>='(' && LA54_92<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_159 = input.LA(1);

                        s = -1;
                        if ( ((LA54_159>='\u0000' && LA54_159<='\t')||(LA54_159>='\u000B' && LA54_159<='\f')||(LA54_159>='\u000E' && LA54_159<='\uFFFF')) ) {s = 165;}

                        else if ( (LA54_159=='\r') ) {s = 166;}

                        else if ( (LA54_159=='\n') ) {s = 167;}

                        else s = 168;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_48 = input.LA(1);

                        s = -1;
                        if ( (LA54_48=='\r') ) {s = 68;}

                        else if ( (LA54_48=='\n') ) {s = 69;}

                        else if ( (LA54_48=='\'') ) {s = 70;}

                        else if ( ((LA54_48>='\u0000' && LA54_48<='\t')||(LA54_48>='\u000B' && LA54_48<='\f')||(LA54_48>='\u000E' && LA54_48<='&')||(LA54_48>='(' && LA54_48<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_146 = input.LA(1);

                        s = -1;
                        if ( (LA54_146=='\r') ) {s = 147;}

                        else if ( (LA54_146=='\n') ) {s = 148;}

                        else if ( ((LA54_146>='\u0000' && LA54_146<='\t')||(LA54_146>='\u000B' && LA54_146<='\f')||(LA54_146>='\u000E' && LA54_146<='\uFFFF')) ) {s = 146;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_109 = input.LA(1);

                        s = -1;
                        if ( (LA54_109=='\"') ) {s = 109;}

                        else if ( (LA54_109=='\r') ) {s = 64;}

                        else if ( (LA54_109=='\n') ) {s = 65;}

                        else if ( ((LA54_109>='\u0000' && LA54_109<='\t')||(LA54_109>='\u000B' && LA54_109<='\f')||(LA54_109>='\u000E' && LA54_109<='!')||(LA54_109>='#' && LA54_109<='\uFFFF')) ) {s = 67;}

                        else s = 90;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_154 = input.LA(1);

                        s = -1;
                        if ( (LA54_154=='\r') ) {s = 155;}

                        else if ( (LA54_154=='\n') ) {s = 156;}

                        else if ( ((LA54_154>='\u0000' && LA54_154<='\t')||(LA54_154>='\u000B' && LA54_154<='\f')||(LA54_154>='\u000E' && LA54_154<='\uFFFF')) ) {s = 154;}

                        else s = 157;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_58 = input.LA(1);

                        s = -1;
                        if ( ((LA54_58>='\u0000' && LA54_58<='\t')||(LA54_58>='\u000B' && LA54_58<='\f')||(LA54_58>='\u000E' && LA54_58<='\uFFFF')) ) {s = 81;}

                        else if ( (LA54_58=='\r') ) {s = 82;}

                        else if ( (LA54_58=='\n') ) {s = 83;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA54_68 = input.LA(1);

                        s = -1;
                        if ( (LA54_68=='\n') ) {s = 69;}

                        else if ( ((LA54_68>='\u0000' && LA54_68<='\t')||(LA54_68>='\u000B' && LA54_68<='\uFFFF')) ) {s = 90;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA54_88 = input.LA(1);

                        s = -1;
                        if ( (LA54_88=='\r') ) {s = 104;}

                        else if ( (LA54_88=='\n') ) {s = 105;}

                        else if ( ((LA54_88>='\u0000' && LA54_88<='\t')||(LA54_88>='\u000B' && LA54_88<='\f')||(LA54_88>='\u000E' && LA54_88<='\uFFFF')) ) {s = 107;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA54_100 = input.LA(1);

                        s = -1;
                        if ( (LA54_100=='\r') ) {s = 101;}

                        else if ( (LA54_100=='\n') ) {s = 102;}

                        else if ( ((LA54_100>='\u0000' && LA54_100<='\t')||(LA54_100>='\u000B' && LA54_100<='\f')||(LA54_100>='\u000E' && LA54_100<='\uFFFF')) ) {s = 100;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA54_77 = input.LA(1);

                        s = -1;
                        if ( (LA54_77=='\r') ) {s = 78;}

                        else if ( (LA54_77=='\n') ) {s = 79;}

                        else if ( ((LA54_77>='\u0000' && LA54_77<='\t')||(LA54_77>='\u000B' && LA54_77<='\f')||(LA54_77>='\u000E' && LA54_77<='\uFFFF')) ) {s = 77;}

                        else s = 80;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA54_67 = input.LA(1);

                        s = -1;
                        if ( (LA54_67=='\"') ) {s = 66;}

                        else if ( (LA54_67=='\r') ) {s = 64;}

                        else if ( (LA54_67=='\n') ) {s = 65;}

                        else if ( ((LA54_67>='\u0000' && LA54_67<='\t')||(LA54_67>='\u000B' && LA54_67<='\f')||(LA54_67>='\u000E' && LA54_67<='!')||(LA54_67>='#' && LA54_67<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA54_107 = input.LA(1);

                        s = -1;
                        if ( (LA54_107=='\r') ) {s = 104;}

                        else if ( (LA54_107=='\n') ) {s = 105;}

                        else if ( ((LA54_107>='\u0000' && LA54_107<='\t')||(LA54_107>='\u000B' && LA54_107<='\f')||(LA54_107>='\u000E' && LA54_107<='\uFFFF')) ) {s = 107;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA54_91 = input.LA(1);

                        s = -1;
                        if ( (LA54_91=='\"') ) {s = 109;}

                        else if ( (LA54_91=='\r') ) {s = 64;}

                        else if ( (LA54_91=='\n') ) {s = 65;}

                        else if ( ((LA54_91>='\u0000' && LA54_91<='\t')||(LA54_91>='\u000B' && LA54_91<='\f')||(LA54_91>='\u000E' && LA54_91<='!')||(LA54_91>='#' && LA54_91<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA54_143 = input.LA(1);

                        s = -1;
                        if ( ((LA54_143>='\u0000' && LA54_143<='\t')||(LA54_143>='\u000B' && LA54_143<='\f')||(LA54_143>='\u000E' && LA54_143<='\uFFFF')) ) {s = 134;}

                        else if ( (LA54_143=='\r') ) {s = 131;}

                        else if ( (LA54_143=='\n') ) {s = 132;}

                        else s = 133;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA54_81 = input.LA(1);

                        s = -1;
                        if ( (LA54_81=='\r') ) {s = 82;}

                        else if ( (LA54_81=='\n') ) {s = 83;}

                        else if ( ((LA54_81>='\u0000' && LA54_81<='\t')||(LA54_81>='\u000B' && LA54_81<='\f')||(LA54_81>='\u000E' && LA54_81<='\uFFFF')) ) {s = 81;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA54_66 = input.LA(1);

                        s = -1;
                        if ( (LA54_66=='\"') ) {s = 91;}

                        else if ( (LA54_66=='\r') ) {s = 64;}

                        else if ( (LA54_66=='\n') ) {s = 65;}

                        else if ( ((LA54_66>='\u0000' && LA54_66<='\t')||(LA54_66>='\u000B' && LA54_66<='\f')||(LA54_66>='\u000E' && LA54_66<='!')||(LA54_66>='#' && LA54_66<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA54_134 = input.LA(1);

                        s = -1;
                        if ( (LA54_134=='\r') ) {s = 131;}

                        else if ( (LA54_134=='\n') ) {s = 132;}

                        else if ( ((LA54_134>='\u0000' && LA54_134<='\t')||(LA54_134>='\u000B' && LA54_134<='\f')||(LA54_134>='\u000E' && LA54_134<='\uFFFF')) ) {s = 134;}

                        else s = 133;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA54_124 = input.LA(1);

                        s = -1;
                        if ( (LA54_124=='\r') ) {s = 131;}

                        else if ( (LA54_124=='\n') ) {s = 132;}

                        else if ( ((LA54_124>='\u0000' && LA54_124<='\t')||(LA54_124>='\u000B' && LA54_124<='\f')||(LA54_124>='\u000E' && LA54_124<='\uFFFF')) ) {s = 134;}

                        else s = 133;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA54_165 = input.LA(1);

                        s = -1;
                        if ( (LA54_165=='\r') ) {s = 166;}

                        else if ( (LA54_165=='\n') ) {s = 167;}

                        else if ( ((LA54_165>='\u0000' && LA54_165<='\t')||(LA54_165>='\u000B' && LA54_165<='\f')||(LA54_165>='\u000E' && LA54_165<='\uFFFF')) ) {s = 165;}

                        else s = 168;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA54_47 = input.LA(1);

                        s = -1;
                        if ( (LA54_47=='\r') ) {s = 64;}

                        else if ( (LA54_47=='\n') ) {s = 65;}

                        else if ( (LA54_47=='\"') ) {s = 66;}

                        else if ( ((LA54_47>='\u0000' && LA54_47<='\t')||(LA54_47>='\u000B' && LA54_47<='\f')||(LA54_47>='\u000E' && LA54_47<='!')||(LA54_47>='#' && LA54_47<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA54_108 = input.LA(1);

                        s = -1;
                        if ( ((LA54_108>='\u0000' && LA54_108<='\t')||(LA54_108>='\u000B' && LA54_108<='\f')||(LA54_108>='\u000E' && LA54_108<='\uFFFF')) ) {s = 118;}

                        else if ( (LA54_108=='\r') ) {s = 119;}

                        else if ( (LA54_108=='\n') ) {s = 120;}

                        else s = 121;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA54_65 = input.LA(1);

                        s = -1;
                        if ( ((LA54_65>='\u0000' && LA54_65<='\uFFFF')) ) {s = 90;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA54_110 = input.LA(1);

                        s = -1;
                        if ( (LA54_110=='\'') ) {s = 110;}

                        else if ( (LA54_110=='\r') ) {s = 68;}

                        else if ( (LA54_110=='\n') ) {s = 69;}

                        else if ( ((LA54_110>='\u0000' && LA54_110<='\t')||(LA54_110>='\u000B' && LA54_110<='\f')||(LA54_110>='\u000E' && LA54_110<='&')||(LA54_110>='(' && LA54_110<='\uFFFF')) ) {s = 71;}

                        else s = 90;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA54_145 = input.LA(1);

                        s = -1;
                        if ( ((LA54_145>='\u0000' && LA54_145<='\t')||(LA54_145>='\u000B' && LA54_145<='\f')||(LA54_145>='\u000E' && LA54_145<='\uFFFF')) ) {s = 154;}

                        else if ( (LA54_145=='\r') ) {s = 155;}

                        else if ( (LA54_145=='\n') ) {s = 156;}

                        else s = 157;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA54_0 = input.LA(1);

                        s = -1;
                        if ( (LA54_0=='E') ) {s = 1;}

                        else if ( (LA54_0=='N') ) {s = 2;}

                        else if ( (LA54_0=='F') ) {s = 3;}

                        else if ( (LA54_0=='I') ) {s = 4;}

                        else if ( (LA54_0=='A') ) {s = 5;}

                        else if ( (LA54_0=='S') ) {s = 6;}

                        else if ( (LA54_0=='B') ) {s = 7;}

                        else if ( (LA54_0=='W') ) {s = 8;}

                        else if ( (LA54_0=='T') ) {s = 9;}

                        else if ( (LA54_0=='G') ) {s = 10;}

                        else if ( (LA54_0=='|') ) {s = 11;}

                        else if ( (LA54_0=='\"') ) {s = 12;}

                        else if ( (LA54_0=='\'') ) {s = 13;}

                        else if ( (LA54_0=='@') ) {s = 14;}

                        else if ( (LA54_0=='#') ) {s = 15;}

                        else if ( ((LA54_0>='\u0000' && LA54_0<='\b')||(LA54_0>='\u000B' && LA54_0<='\f')||(LA54_0>='\u000E' && LA54_0<='\u001F')||LA54_0=='!'||(LA54_0>='$' && LA54_0<='&')||(LA54_0>='(' && LA54_0<='?')||(LA54_0>='C' && LA54_0<='D')||LA54_0=='H'||(LA54_0>='J' && LA54_0<='M')||(LA54_0>='O' && LA54_0<='R')||(LA54_0>='U' && LA54_0<='V')||(LA54_0>='X' && LA54_0<='{')||(LA54_0>='}' && LA54_0<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA54_0>='\t' && LA54_0<='\n')||LA54_0=='\r'||LA54_0==' ') ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA54_138 = input.LA(1);

                        s = -1;
                        if ( ((LA54_138>='\u0000' && LA54_138<='\t')||(LA54_138>='\u000B' && LA54_138<='\f')||(LA54_138>='\u000E' && LA54_138<='\uFFFF')) ) {s = 146;}

                        else if ( (LA54_138=='\r') ) {s = 147;}

                        else if ( (LA54_138=='\n') ) {s = 148;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA54_153 = input.LA(1);

                        s = -1;
                        if ( (LA54_153=='\r') ) {s = 160;}

                        else if ( (LA54_153=='\n') ) {s = 161;}

                        else if ( ((LA54_153>='\u0000' && LA54_153<='\t')||(LA54_153>='\u000B' && LA54_153<='\f')||(LA54_153>='\u000E' && LA54_153<='\uFFFF')) ) {s = 163;}

                        else s = 162;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA54_163 = input.LA(1);

                        s = -1;
                        if ( (LA54_163=='\r') ) {s = 160;}

                        else if ( (LA54_163=='\n') ) {s = 161;}

                        else if ( ((LA54_163>='\u0000' && LA54_163<='\t')||(LA54_163>='\u000B' && LA54_163<='\f')||(LA54_163>='\u000E' && LA54_163<='\uFFFF')) ) {s = 163;}

                        else s = 162;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA54_87 = input.LA(1);

                        s = -1;
                        if ( ((LA54_87>='\u0000' && LA54_87<='\t')||(LA54_87>='\u000B' && LA54_87<='\f')||(LA54_87>='\u000E' && LA54_87<='\uFFFF')) ) {s = 100;}

                        else if ( (LA54_87=='\r') ) {s = 101;}

                        else if ( (LA54_87=='\n') ) {s = 102;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA54_34 = input.LA(1);

                        s = -1;
                        if ( (LA54_34=='\r') ) {s = 49;}

                        else if ( (LA54_34=='\n') ) {s = 50;}

                        else if ( ((LA54_34>='\u0000' && LA54_34<='\t')||(LA54_34>='\u000B' && LA54_34<='\f')||(LA54_34>='\u000E' && LA54_34<='\uFFFF')) ) {s = 34;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA54_11 = input.LA(1);

                        s = -1;
                        if ( (LA54_11=='\n'||LA54_11=='\r') ) {s = 30;}

                        else if ( ((LA54_11>='\u0000' && LA54_11<='\t')||(LA54_11>='\u000B' && LA54_11<='\f')||(LA54_11>='\u000E' && LA54_11<='{')||(LA54_11>='}' && LA54_11<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA54_71 = input.LA(1);

                        s = -1;
                        if ( (LA54_71=='\r') ) {s = 68;}

                        else if ( (LA54_71=='\n') ) {s = 69;}

                        else if ( (LA54_71=='\'') ) {s = 70;}

                        else if ( ((LA54_71>='\u0000' && LA54_71<='\t')||(LA54_71>='\u000B' && LA54_71<='\f')||(LA54_71>='\u000E' && LA54_71<='&')||(LA54_71>='(' && LA54_71<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}