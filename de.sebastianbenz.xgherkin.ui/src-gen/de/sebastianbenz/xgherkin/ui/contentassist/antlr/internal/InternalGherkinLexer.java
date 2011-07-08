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
    public static final int RULE_AS_A=10;
    public static final int RULE_IN_ORDER_TO=11;
    public static final int RULE_THEN_TEXT=18;
    public static final int RULE_NL=23;
    public static final int RULE_TAG=8;
    public static final int RULE_SPACES=21;
    public static final int RULE_TEXT=4;
    public static final int RULE_EXAMPLE_HEADING=6;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_CODE=5;
    public static final int RULE_NNL=22;
    public static final int RULE_WHEN_TEXT=17;
    public static final int RULE_GIVEN_TEXT=19;
    public static final int RULE_I_WANT_TO=12;
    public static final int RULE_EXAMPLE_ROW_END=7;
    public static final int RULE_SCENARIO_TEXT=13;
    public static final int RULE_BACKGROUND_TEXT=16;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=14;
    public static final int RULE_WS=25;
    public static final int RULE_AND_TEXT=20;
    public static final int RULE_EXAMPLE_CELL=15;
    public static final int RULE_FEATURE_TEXT=9;

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2064:22: ( 'Examples' RULE_SPACES ':' RULE_SPACES ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2064:24: 'Examples' RULE_SPACES ':' RULE_SPACES ( '\\r' )? '\\n'
            {
            match("Examples"); 

            mRULE_SPACES(); 
            match(':'); 
            mRULE_SPACES(); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2064:63: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2064:63: '\\r'
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

    // $ANTLR start "RULE_NNL"
    public final void mRULE_NNL() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2066:19: (~ ( ( '\\r' | '\\n' ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2066:21: ~ ( ( '\\r' | '\\n' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NNL"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:18: ( ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:20: ( '\\r' )? ( '\\n' )?
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:20: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:26: ( '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SPACES"
    public final void mRULE_SPACES() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2070:22: ( ( ' ' | '\\t' )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2070:24: ( ' ' | '\\t' )*
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2070:24: ( ' ' | '\\t' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:
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
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACES"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:19: ( ( 'Narrative:' | 'Feature:' ) ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:21: ( 'Narrative:' | 'Feature:' ) ( RULE_NNL )* RULE_NL
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:21: ( 'Narrative:' | 'Feature:' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='N') ) {
                alt5=1;
            }
            else if ( (LA5_0=='F') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:22: 'Narrative:'
                    {
                    match("Narrative:"); 


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:35: 'Feature:'
                    {
                    match("Feature:"); 


                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:47: ( RULE_NNL )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:47: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2074:18: ( 'In order to' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2074:20: 'In order to' ( RULE_NNL )* RULE_NL
            {
            match("In order to"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2074:34: ( RULE_NNL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2074:34: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2076:11: ( 'As a' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2076:13: 'As a' ( RULE_NNL )* RULE_NL
            {
            match("As a"); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2076:20: ( RULE_NNL )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2076:20: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2078:16: ( 'I want to ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2078:18: 'I want to ' ( RULE_NNL )* RULE_NL
            {
            match("I want to "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2078:31: ( RULE_NNL )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2078:31: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2080:20: ( 'Scenario' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2080:22: 'Scenario' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Scenario"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2080:49: ( RULE_NNL )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2080:49: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2082:28: ( 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2082:30: 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Scenario"); 

            mRULE_SPACES(); 
            match("Outline"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2082:79: ( RULE_NNL )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2082:79: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:22: ( 'Background' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:24: 'Background' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Background"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:53: ( RULE_NNL )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:53: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2086:16: ( 'When ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2086:18: 'When ' ( RULE_NNL )* RULE_NL
            {
            match("When "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2086:26: ( RULE_NNL )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2086:26: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2088:16: ( 'Then ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2088:18: 'Then ' ( RULE_NNL )* RULE_NL
            {
            match("Then "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2088:26: ( RULE_NNL )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2088:26: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2090:17: ( 'Given ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2090:19: 'Given ' ( RULE_NNL )* RULE_NL
            {
            match("Given "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2090:28: ( RULE_NNL )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2090:28: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2092:15: ( 'And ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2092:17: 'And ' ( RULE_NNL )* RULE_NL
            {
            match("And "); 

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2092:24: ( RULE_NNL )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2092:24: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2094:19: ( '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+ )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2094:21: '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            {
            match('|'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2094:25: (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='{')||(LA17_0>='}' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2094:25: ~ ( ( '\\r' | '\\n' | '|' ) )
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2096:22: ( '|' ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2096:24: '|' ( '\\r' )? '\\n'
            {
            match('|'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2096:28: ( '\\r' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2096:28: '\\r'
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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:11: ( ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:14: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:20: ( options {greedy=false; } : . )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\"') ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1=='\"') ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3=='\"') ) {
                                    alt19=2;
                                }
                                else if ( ((LA19_3>='\u0000' && LA19_3<='!')||(LA19_3>='#' && LA19_3<='\uFFFF')) ) {
                                    alt19=1;
                                }


                            }
                            else if ( ((LA19_1>='\u0000' && LA19_1<='!')||(LA19_1>='#' && LA19_1<='\uFFFF')) ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:58: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:67: ( options {greedy=false; } : . )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\'') ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1=='\'') ) {
                                int LA20_3 = input.LA(3);

                                if ( (LA20_3=='\'') ) {
                                    alt20=2;
                                }
                                else if ( ((LA20_3>='\u0000' && LA20_3<='&')||(LA20_3>='(' && LA20_3<='\uFFFF')) ) {
                                    alt20=1;
                                }


                            }
                            else if ( ((LA20_1>='\u0000' && LA20_1<='&')||(LA20_1>='(' && LA20_1<='\uFFFF')) ) {
                                alt20=1;
                            }


                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:10: ( '@' ( RULE_NNL )+ RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:12: '@' ( RULE_NNL )+ RULE_NL
            {
            match('@'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:16: ( RULE_NNL )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:16: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2102:17: ( '#' ( RULE_NNL )+ RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2102:19: '#' ( RULE_NNL )+ RULE_NL
            {
            match('#'); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2102:23: ( RULE_NNL )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2102:23: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2104:11: (~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2104:13: ~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) ( RULE_NNL )* RULE_NL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2104:45: ( RULE_NNL )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2104:45: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            mRULE_NL(); 

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
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2106:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2106:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2106:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
        int alt26=19;
        alt26 = dfa26.predict(input);
        switch (alt26) {
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


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\1\uffff\12\20\1\uffff\2\20\1\uffff\1\20\2\uffff\14\20\2\uffff"+
        "\2\20\1\61\16\20\1\uffff\1\61\1\uffff\5\20\1\115\1\121\22\20\1\uffff"+
        "\1\115\1\uffff\1\115\1\uffff\1\121\1\uffff\1\121\2\20\1\147\1\150"+
        "\2\20\1\uffff\10\20\2\147\3\uffff\1\150\1\uffff\1\150\1\166\2\133"+
        "\7\20\1\uffff\1\166\1\uffff\1\166\2\20\1\u0084\7\20\1\uffff\1\u0084"+
        "\1\uffff\1\u0084\4\20\1\u0095\2\20\1\uffff\1\20\1\u0084\1\20\1\u009c"+
        "\1\20\1\uffff\1\u0095\1\uffff\1\u0095\1\20\1\uffff\1\u00a3\1\uffff"+
        "\1\u009c\1\uffff\1\u009c\2\20\1\u00ab\1\uffff\1\u00a3\1\uffff\1"+
        "\u00a3\1\20\2\u00ab\2\uffff\4\20\1\u00b1\1\uffff\1\u00b1\1\uffff"+
        "\1\u00b1";
    static final String DFA26_eofS =
        "\u00b5\uffff";
    static final String DFA26_minS =
        "\1\0\1\170\1\141\1\145\1\40\1\156\1\143\1\141\2\150\1\151\1\0\1"+
        "\42\1\47\1\uffff\1\0\2\uffff\1\141\1\162\1\141\1\40\1\167\1\40\1"+
        "\144\1\145\1\143\2\145\1\166\2\uffff\1\42\1\47\1\0\1\155\1\162\1"+
        "\164\1\157\2\141\1\40\1\156\1\153\2\156\1\145\2\0\1\uffff\1\12\1"+
        "\uffff\1\160\1\141\1\165\1\162\1\156\2\0\1\141\1\147\2\40\1\156"+
        "\10\0\1\154\1\164\1\162\1\144\1\164\1\uffff\1\12\1\uffff\1\0\1\uffff"+
        "\1\12\1\uffff\1\0\2\162\2\0\1\40\1\0\1\uffff\1\0\1\145\1\151\2\145"+
        "\1\40\1\151\1\157\1\0\1\12\3\uffff\1\12\1\uffff\4\0\1\163\1\166"+
        "\1\72\1\162\1\164\1\157\1\165\1\uffff\1\12\1\uffff\1\0\1\11\1\145"+
        "\1\0\1\40\1\157\1\11\1\156\2\11\1\72\1\uffff\1\12\1\uffff\1\0\1"+
        "\164\1\40\1\11\1\165\1\0\1\144\1\12\1\uffff\1\11\1\0\1\157\1\0\1"+
        "\164\1\uffff\1\12\1\uffff\1\0\1\11\1\uffff\1\0\1\uffff\1\12\1\uffff"+
        "\1\0\1\154\1\11\1\0\1\uffff\1\12\1\uffff\1\0\1\151\1\0\1\12\2\uffff"+
        "\1\156\1\145\2\11\1\0\1\uffff\1\12\1\uffff\1\0";
    static final String DFA26_maxS =
        "\1\uffff\1\170\1\141\1\145\1\156\1\163\1\143\1\141\2\150\1\151"+
        "\1\uffff\1\42\1\47\1\uffff\1\uffff\2\uffff\1\141\1\162\1\141\1\40"+
        "\1\167\1\40\1\144\1\145\1\143\2\145\1\166\2\uffff\1\42\1\47\1\uffff"+
        "\1\155\1\162\1\164\1\157\2\141\1\40\1\156\1\153\2\156\1\145\2\uffff"+
        "\1\uffff\1\12\1\uffff\1\160\1\141\1\165\1\162\1\156\2\uffff\1\141"+
        "\1\147\2\40\1\156\10\uffff\1\154\1\164\1\162\1\144\1\164\1\uffff"+
        "\1\12\1\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff\2\162\2\uffff"+
        "\1\40\1\uffff\1\uffff\1\uffff\1\145\1\151\2\145\1\40\1\151\1\157"+
        "\1\uffff\1\12\3\uffff\1\12\1\uffff\4\uffff\1\163\1\166\1\72\1\162"+
        "\1\164\1\157\1\165\1\uffff\1\12\1\uffff\1\uffff\1\72\1\145\1\uffff"+
        "\1\40\1\157\1\117\1\156\1\72\1\40\1\72\1\uffff\1\12\1\uffff\1\uffff"+
        "\1\164\1\40\1\117\1\165\1\uffff\1\144\1\12\1\uffff\1\40\1\uffff"+
        "\1\157\1\uffff\1\164\1\uffff\1\12\1\uffff\1\uffff\1\72\1\uffff\1"+
        "\uffff\1\uffff\1\12\1\uffff\1\uffff\1\154\1\72\1\uffff\1\uffff\1"+
        "\12\1\uffff\1\uffff\1\151\1\uffff\1\12\2\uffff\1\156\1\145\2\72"+
        "\1\uffff\1\uffff\1\12\1\uffff\1\uffff";
    static final String DFA26_acceptS =
        "\16\uffff\1\20\1\uffff\1\22\1\23\14\uffff\1\16\1\15\21\uffff\1"+
        "\21\1\uffff\1\21\31\uffff\1\4\1\uffff\1\4\1\uffff\1\14\1\uffff\1"+
        "\14\7\uffff\1\17\12\uffff\2\11\1\12\1\uffff\1\12\13\uffff\1\13\1"+
        "\uffff\1\13\13\uffff\1\2\1\uffff\1\2\10\uffff\1\1\5\uffff\1\6\1"+
        "\uffff\1\6\2\uffff\1\1\1\uffff\1\5\1\uffff\1\5\4\uffff\1\3\1\uffff"+
        "\1\3\4\uffff\2\10\5\uffff\1\7\1\uffff\1\7\1\uffff";
    static final String DFA26_specialS =
        "\1\40\12\uffff\1\23\3\uffff\1\6\22\uffff\1\24\14\uffff\1\2\1\26"+
        "\10\uffff\1\1\1\13\5\uffff\1\45\1\3\1\31\1\35\1\46\1\15\1\4\1\10"+
        "\10\uffff\1\50\3\uffff\1\12\2\uffff\1\47\1\22\1\uffff\1\17\1\uffff"+
        "\1\33\7\uffff\1\0\6\uffff\1\30\1\44\1\32\1\21\12\uffff\1\20\2\uffff"+
        "\1\41\12\uffff\1\37\4\uffff\1\27\4\uffff\1\43\1\uffff\1\11\4\uffff"+
        "\1\42\2\uffff\1\25\3\uffff\1\16\2\uffff\1\14\3\uffff\1\7\1\uffff"+
        "\1\36\7\uffff\1\34\3\uffff\1\5}>";
    static final String[] DFA26_transitionS = {
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
            "\12\42\1\63\2\42\1\62\ufff2\42",
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
            "\12\103\1\102\2\103\1\101\24\103\1\100\uffdd\103",
            "\12\107\1\105\2\107\1\104\31\107\1\106\uffd8\107",
            "",
            "\1\63",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\120\1\117\2\120\1\116\ufff2\120",
            "\12\124\1\123\2\124\1\122\ufff2\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\103\1\102\2\103\1\101\24\103\1\132\uffdd\103",
            "\12\133\1\102\ufff5\133",
            "\0\133",
            "\12\103\1\102\2\103\1\101\24\103\1\100\uffdd\103",
            "\12\133\1\105\ufff5\133",
            "\0\133",
            "\12\107\1\105\2\107\1\104\31\107\1\134\uffd8\107",
            "\12\107\1\105\2\107\1\104\31\107\1\106\uffd8\107",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\117",
            "",
            "\12\120\1\117\2\120\1\116\ufff2\120",
            "",
            "\1\123",
            "",
            "\12\124\1\123\2\124\1\122\ufff2\124",
            "\1\142",
            "\1\143",
            "\12\144\1\146\2\144\1\145\ufff2\144",
            "\12\153\1\152\2\153\1\151\ufff2\153",
            "\1\154",
            "\12\103\1\102\2\103\1\101\24\103\1\155\uffdd\103",
            "",
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
            "",
            "\1\152",
            "",
            "\12\153\1\152\2\153\1\151\ufff2\153",
            "\12\171\1\170\2\171\1\167\ufff2\171",
            "\12\103\1\102\2\103\1\101\24\103\1\155\uffdd\103",
            "\12\107\1\105\2\107\1\104\31\107\1\156\uffd8\107",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\170",
            "",
            "\12\171\1\170\2\171\1\167\ufff2\171",
            "\1\u0081\26\uffff\1\u0081\31\uffff\1\u0082",
            "\1\u0083",
            "\12\u0087\1\u0086\2\u0087\1\u0085\ufff2\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\26\uffff\1\u008a\31\uffff\1\u008c\24\uffff\1\u008b",
            "\1\u008d",
            "\1\u0081\26\uffff\1\u0081\31\uffff\1\u0082",
            "\1\u0090\1\u008f\2\uffff\1\u008e\22\uffff\1\u0090",
            "\1\u0091",
            "",
            "\1\u0086",
            "",
            "\12\u0087\1\u0086\2\u0087\1\u0085\ufff2\u0087",
            "\1\u0092",
            "\1\u0093",
            "\1\u008a\26\uffff\1\u008a\31\uffff\1\u008c\24\uffff\1\u008b",
            "\1\u0094",
            "\12\u0098\1\u0097\2\u0098\1\u0096\ufff2\u0098",
            "\1\u0099",
            "\1\u008f",
            "",
            "\1\u0090\1\u008f\2\uffff\1\u008e\22\uffff\1\u0090",
            "\12\u0087\1\u0086\2\u0087\1\u0085\ufff2\u0087",
            "\1\u009b",
            "\12\u009f\1\u009e\2\u009f\1\u009d\ufff2\u009f",
            "\1\u00a0",
            "",
            "\1\u0097",
            "",
            "\12\u0098\1\u0097\2\u0098\1\u0096\ufff2\u0098",
            "\1\u00a1\26\uffff\1\u00a1\31\uffff\1\u00a2",
            "",
            "\12\u00a6\1\u00a5\2\u00a6\1\u00a4\ufff2\u00a6",
            "",
            "\1\u009e",
            "",
            "\12\u009f\1\u009e\2\u009f\1\u009d\ufff2\u009f",
            "\1\u00a7",
            "\1\u00a1\26\uffff\1\u00a1\31\uffff\1\u00a2",
            "\12\u00a8\1\u00aa\2\u00a8\1\u00a9\ufff2\u00a8",
            "",
            "\1\u00a5",
            "",
            "\12\u00a6\1\u00a5\2\u00a6\1\u00a4\ufff2\u00a6",
            "\1\u00ac",
            "\12\u00a8\1\u00aa\2\u00a8\1\u00a9\ufff2\u00a8",
            "\1\u00aa",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\26\uffff\1\u00af\31\uffff\1\u00b0",
            "\1\u00af\26\uffff\1\u00af\31\uffff\1\u00b0",
            "\12\u00b4\1\u00b3\2\u00b4\1\u00b2\ufff2\u00b4",
            "",
            "\1\u00b3",
            "",
            "\12\u00b4\1\u00b3\2\u00b4\1\u00b2\ufff2\u00b4"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_CELL | RULE_EXAMPLE_ROW_END | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_100 = input.LA(1);

                        s = -1;
                        if ( (LA26_100=='\r') ) {s = 101;}

                        else if ( (LA26_100=='\n') ) {s = 102;}

                        else if ( ((LA26_100>='\u0000' && LA26_100<='\t')||(LA26_100>='\u000B' && LA26_100<='\f')||(LA26_100>='\u000E' && LA26_100<='\uFFFF')) ) {s = 100;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_57 = input.LA(1);

                        s = -1;
                        if ( (LA26_57=='\r') ) {s = 78;}

                        else if ( (LA26_57=='\n') ) {s = 79;}

                        else if ( ((LA26_57>='\u0000' && LA26_57<='\t')||(LA26_57>='\u000B' && LA26_57<='\f')||(LA26_57>='\u000E' && LA26_57<='\uFFFF')) ) {s = 80;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_47 = input.LA(1);

                        s = -1;
                        if ( (LA26_47=='\"') ) {s = 64;}

                        else if ( (LA26_47=='\r') ) {s = 65;}

                        else if ( (LA26_47=='\n') ) {s = 66;}

                        else if ( ((LA26_47>='\u0000' && LA26_47<='\t')||(LA26_47>='\u000B' && LA26_47<='\f')||(LA26_47>='\u000E' && LA26_47<='!')||(LA26_47>='#' && LA26_47<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_65 = input.LA(1);

                        s = -1;
                        if ( ((LA26_65>='\u0000' && LA26_65<='\t')||(LA26_65>='\u000B' && LA26_65<='\uFFFF')) ) {s = 91;}

                        else if ( (LA26_65=='\n') ) {s = 66;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_70 = input.LA(1);

                        s = -1;
                        if ( (LA26_70=='\'') ) {s = 92;}

                        else if ( (LA26_70=='\r') ) {s = 68;}

                        else if ( (LA26_70=='\n') ) {s = 69;}

                        else if ( ((LA26_70>='\u0000' && LA26_70<='\t')||(LA26_70>='\u000B' && LA26_70<='\f')||(LA26_70>='\u000E' && LA26_70<='&')||(LA26_70>='(' && LA26_70<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_180 = input.LA(1);

                        s = -1;
                        if ( (LA26_180=='\r') ) {s = 178;}

                        else if ( (LA26_180=='\n') ) {s = 179;}

                        else if ( ((LA26_180>='\u0000' && LA26_180<='\t')||(LA26_180>='\u000B' && LA26_180<='\f')||(LA26_180>='\u000E' && LA26_180<='\uFFFF')) ) {s = 180;}

                        else s = 177;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_15 = input.LA(1);

                        s = -1;
                        if ( ((LA26_15>='\u0000' && LA26_15<='\t')||(LA26_15>='\u000B' && LA26_15<='\f')||(LA26_15>='\u000E' && LA26_15<='\uFFFF')) ) {s = 34;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_166 = input.LA(1);

                        s = -1;
                        if ( (LA26_166=='\r') ) {s = 164;}

                        else if ( (LA26_166=='\n') ) {s = 165;}

                        else if ( ((LA26_166>='\u0000' && LA26_166<='\t')||(LA26_166>='\u000B' && LA26_166<='\f')||(LA26_166>='\u000E' && LA26_166<='\uFFFF')) ) {s = 166;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_71 = input.LA(1);

                        s = -1;
                        if ( (LA26_71=='\'') ) {s = 70;}

                        else if ( (LA26_71=='\r') ) {s = 68;}

                        else if ( (LA26_71=='\n') ) {s = 69;}

                        else if ( ((LA26_71>='\u0000' && LA26_71<='\t')||(LA26_71>='\u000B' && LA26_71<='\f')||(LA26_71>='\u000E' && LA26_71<='&')||(LA26_71>='(' && LA26_71<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_147 = input.LA(1);

                        s = -1;
                        if ( (LA26_147=='\r') ) {s = 157;}

                        else if ( (LA26_147=='\n') ) {s = 158;}

                        else if ( ((LA26_147>='\u0000' && LA26_147<='\t')||(LA26_147>='\u000B' && LA26_147<='\f')||(LA26_147>='\u000E' && LA26_147<='\uFFFF')) ) {s = 159;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_84 = input.LA(1);

                        s = -1;
                        if ( (LA26_84=='\r') ) {s = 82;}

                        else if ( (LA26_84=='\n') ) {s = 83;}

                        else if ( ((LA26_84>='\u0000' && LA26_84<='\t')||(LA26_84>='\u000B' && LA26_84<='\f')||(LA26_84>='\u000E' && LA26_84<='\uFFFF')) ) {s = 84;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_58 = input.LA(1);

                        s = -1;
                        if ( (LA26_58=='\r') ) {s = 82;}

                        else if ( (LA26_58=='\n') ) {s = 83;}

                        else if ( ((LA26_58>='\u0000' && LA26_58<='\t')||(LA26_58>='\u000B' && LA26_58<='\f')||(LA26_58>='\u000E' && LA26_58<='\uFFFF')) ) {s = 84;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_162 = input.LA(1);

                        s = -1;
                        if ( ((LA26_162>='\u0000' && LA26_162<='\t')||(LA26_162>='\u000B' && LA26_162<='\f')||(LA26_162>='\u000E' && LA26_162<='\uFFFF')) ) {s = 168;}

                        else if ( (LA26_162=='\r') ) {s = 169;}

                        else if ( (LA26_162=='\n') ) {s = 170;}

                        else s = 171;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_69 = input.LA(1);

                        s = -1;
                        if ( ((LA26_69>='\u0000' && LA26_69<='\uFFFF')) ) {s = 91;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_159 = input.LA(1);

                        s = -1;
                        if ( (LA26_159=='\r') ) {s = 157;}

                        else if ( (LA26_159=='\n') ) {s = 158;}

                        else if ( ((LA26_159>='\u0000' && LA26_159<='\t')||(LA26_159>='\u000B' && LA26_159<='\f')||(LA26_159>='\u000E' && LA26_159<='\uFFFF')) ) {s = 159;}

                        else s = 156;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_90 = input.LA(1);

                        s = -1;
                        if ( (LA26_90=='\"') ) {s = 109;}

                        else if ( (LA26_90=='\r') ) {s = 65;}

                        else if ( (LA26_90=='\n') ) {s = 66;}

                        else if ( ((LA26_90>='\u0000' && LA26_90<='\t')||(LA26_90>='\u000B' && LA26_90<='\f')||(LA26_90>='\u000E' && LA26_90<='!')||(LA26_90>='#' && LA26_90<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_121 = input.LA(1);

                        s = -1;
                        if ( (LA26_121=='\r') ) {s = 119;}

                        else if ( (LA26_121=='\n') ) {s = 120;}

                        else if ( ((LA26_121>='\u0000' && LA26_121<='\t')||(LA26_121>='\u000B' && LA26_121<='\f')||(LA26_121>='\u000E' && LA26_121<='\uFFFF')) ) {s = 121;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA26_110 = input.LA(1);

                        s = -1;
                        if ( (LA26_110=='\'') ) {s = 110;}

                        else if ( (LA26_110=='\r') ) {s = 68;}

                        else if ( (LA26_110=='\n') ) {s = 69;}

                        else if ( ((LA26_110>='\u0000' && LA26_110<='\t')||(LA26_110>='\u000B' && LA26_110<='\f')||(LA26_110>='\u000E' && LA26_110<='&')||(LA26_110>='(' && LA26_110<='\uFFFF')) ) {s = 71;}

                        else s = 91;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA26_88 = input.LA(1);

                        s = -1;
                        if ( (LA26_88=='\r') ) {s = 105;}

                        else if ( (LA26_88=='\n') ) {s = 106;}

                        else if ( ((LA26_88>='\u0000' && LA26_88<='\t')||(LA26_88>='\u000B' && LA26_88<='\f')||(LA26_88>='\u000E' && LA26_88<='\uFFFF')) ) {s = 107;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA26_11 = input.LA(1);

                        s = -1;
                        if ( (LA26_11=='\n'||LA26_11=='\r') ) {s = 30;}

                        else if ( ((LA26_11>='\u0000' && LA26_11<='\t')||(LA26_11>='\u000B' && LA26_11<='\f')||(LA26_11>='\u000E' && LA26_11<='{')||(LA26_11>='}' && LA26_11<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA26_34 = input.LA(1);

                        s = -1;
                        if ( (LA26_34=='\r') ) {s = 50;}

                        else if ( (LA26_34=='\n') ) {s = 51;}

                        else if ( ((LA26_34>='\u0000' && LA26_34<='\t')||(LA26_34>='\u000B' && LA26_34<='\f')||(LA26_34>='\u000E' && LA26_34<='\uFFFF')) ) {s = 34;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA26_155 = input.LA(1);

                        s = -1;
                        if ( (LA26_155=='\r') ) {s = 164;}

                        else if ( (LA26_155=='\n') ) {s = 165;}

                        else if ( ((LA26_155>='\u0000' && LA26_155<='\t')||(LA26_155>='\u000B' && LA26_155<='\f')||(LA26_155>='\u000E' && LA26_155<='\uFFFF')) ) {s = 166;}

                        else s = 163;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA26_48 = input.LA(1);

                        s = -1;
                        if ( (LA26_48=='\r') ) {s = 68;}

                        else if ( (LA26_48=='\n') ) {s = 69;}

                        else if ( (LA26_48=='\'') ) {s = 70;}

                        else if ( ((LA26_48>='\u0000' && LA26_48<='\t')||(LA26_48>='\u000B' && LA26_48<='\f')||(LA26_48>='\u000E' && LA26_48<='&')||(LA26_48>='(' && LA26_48<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA26_140 = input.LA(1);

                        s = -1;
                        if ( (LA26_140=='\r') ) {s = 150;}

                        else if ( (LA26_140=='\n') ) {s = 151;}

                        else if ( ((LA26_140>='\u0000' && LA26_140<='\t')||(LA26_140>='\u000B' && LA26_140<='\f')||(LA26_140>='\u000E' && LA26_140<='\uFFFF')) ) {s = 152;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA26_107 = input.LA(1);

                        s = -1;
                        if ( (LA26_107=='\r') ) {s = 105;}

                        else if ( (LA26_107=='\n') ) {s = 106;}

                        else if ( ((LA26_107>='\u0000' && LA26_107<='\t')||(LA26_107>='\u000B' && LA26_107<='\f')||(LA26_107>='\u000E' && LA26_107<='\uFFFF')) ) {s = 107;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA26_66 = input.LA(1);

                        s = -1;
                        if ( ((LA26_66>='\u0000' && LA26_66<='\uFFFF')) ) {s = 91;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA26_109 = input.LA(1);

                        s = -1;
                        if ( (LA26_109=='\"') ) {s = 109;}

                        else if ( (LA26_109=='\r') ) {s = 65;}

                        else if ( (LA26_109=='\n') ) {s = 66;}

                        else if ( ((LA26_109>='\u0000' && LA26_109<='\t')||(LA26_109>='\u000B' && LA26_109<='\f')||(LA26_109>='\u000E' && LA26_109<='!')||(LA26_109>='#' && LA26_109<='\uFFFF')) ) {s = 67;}

                        else s = 91;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA26_92 = input.LA(1);

                        s = -1;
                        if ( (LA26_92=='\'') ) {s = 110;}

                        else if ( (LA26_92=='\r') ) {s = 68;}

                        else if ( (LA26_92=='\n') ) {s = 69;}

                        else if ( ((LA26_92>='\u0000' && LA26_92<='\t')||(LA26_92>='\u000B' && LA26_92<='\f')||(LA26_92>='\u000E' && LA26_92<='&')||(LA26_92>='(' && LA26_92<='\uFFFF')) ) {s = 71;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA26_176 = input.LA(1);

                        s = -1;
                        if ( (LA26_176=='\r') ) {s = 178;}

                        else if ( (LA26_176=='\n') ) {s = 179;}

                        else if ( ((LA26_176>='\u0000' && LA26_176<='\t')||(LA26_176>='\u000B' && LA26_176<='\f')||(LA26_176>='\u000E' && LA26_176<='\uFFFF')) ) {s = 180;}

                        else s = 177;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA26_67 = input.LA(1);

                        s = -1;
                        if ( (LA26_67=='\r') ) {s = 65;}

                        else if ( (LA26_67=='\n') ) {s = 66;}

                        else if ( (LA26_67=='\"') ) {s = 64;}

                        else if ( ((LA26_67>='\u0000' && LA26_67<='\t')||(LA26_67>='\u000B' && LA26_67<='\f')||(LA26_67>='\u000E' && LA26_67<='!')||(LA26_67>='#' && LA26_67<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA26_168 = input.LA(1);

                        s = -1;
                        if ( (LA26_168=='\r') ) {s = 169;}

                        else if ( (LA26_168=='\n') ) {s = 170;}

                        else if ( ((LA26_168>='\u0000' && LA26_168<='\t')||(LA26_168>='\u000B' && LA26_168<='\f')||(LA26_168>='\u000E' && LA26_168<='\uFFFF')) ) {s = 168;}

                        else s = 171;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA26_135 = input.LA(1);

                        s = -1;
                        if ( (LA26_135=='\r') ) {s = 133;}

                        else if ( (LA26_135=='\n') ) {s = 134;}

                        else if ( ((LA26_135>='\u0000' && LA26_135<='\t')||(LA26_135>='\u000B' && LA26_135<='\f')||(LA26_135>='\u000E' && LA26_135<='\uFFFF')) ) {s = 135;}

                        else s = 132;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='E') ) {s = 1;}

                        else if ( (LA26_0=='N') ) {s = 2;}

                        else if ( (LA26_0=='F') ) {s = 3;}

                        else if ( (LA26_0=='I') ) {s = 4;}

                        else if ( (LA26_0=='A') ) {s = 5;}

                        else if ( (LA26_0=='S') ) {s = 6;}

                        else if ( (LA26_0=='B') ) {s = 7;}

                        else if ( (LA26_0=='W') ) {s = 8;}

                        else if ( (LA26_0=='T') ) {s = 9;}

                        else if ( (LA26_0=='G') ) {s = 10;}

                        else if ( (LA26_0=='|') ) {s = 11;}

                        else if ( (LA26_0=='\"') ) {s = 12;}

                        else if ( (LA26_0=='\'') ) {s = 13;}

                        else if ( (LA26_0=='@') ) {s = 14;}

                        else if ( (LA26_0=='#') ) {s = 15;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='!'||(LA26_0>='$' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='?')||(LA26_0>='C' && LA26_0<='D')||LA26_0=='H'||(LA26_0>='J' && LA26_0<='M')||(LA26_0>='O' && LA26_0<='R')||(LA26_0>='U' && LA26_0<='V')||(LA26_0>='X' && LA26_0<='{')||(LA26_0>='}' && LA26_0<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA26_124 = input.LA(1);

                        s = -1;
                        if ( (LA26_124=='\r') ) {s = 133;}

                        else if ( (LA26_124=='\n') ) {s = 134;}

                        else if ( ((LA26_124>='\u0000' && LA26_124<='\t')||(LA26_124>='\u000B' && LA26_124<='\f')||(LA26_124>='\u000E' && LA26_124<='\uFFFF')) ) {s = 135;}

                        else s = 132;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA26_152 = input.LA(1);

                        s = -1;
                        if ( (LA26_152=='\r') ) {s = 150;}

                        else if ( (LA26_152=='\n') ) {s = 151;}

                        else if ( ((LA26_152>='\u0000' && LA26_152<='\t')||(LA26_152>='\u000B' && LA26_152<='\f')||(LA26_152>='\u000E' && LA26_152<='\uFFFF')) ) {s = 152;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA26_145 = input.LA(1);

                        s = -1;
                        if ( (LA26_145=='\r') ) {s = 133;}

                        else if ( (LA26_145=='\n') ) {s = 134;}

                        else if ( ((LA26_145>='\u0000' && LA26_145<='\t')||(LA26_145>='\u000B' && LA26_145<='\f')||(LA26_145>='\u000E' && LA26_145<='\uFFFF')) ) {s = 135;}

                        else s = 132;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA26_108 = input.LA(1);

                        s = -1;
                        if ( (LA26_108=='\r') ) {s = 119;}

                        else if ( (LA26_108=='\n') ) {s = 120;}

                        else if ( ((LA26_108>='\u0000' && LA26_108<='\t')||(LA26_108>='\u000B' && LA26_108<='\f')||(LA26_108>='\u000E' && LA26_108<='\uFFFF')) ) {s = 121;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA26_64 = input.LA(1);

                        s = -1;
                        if ( (LA26_64=='\"') ) {s = 90;}

                        else if ( (LA26_64=='\r') ) {s = 65;}

                        else if ( (LA26_64=='\n') ) {s = 66;}

                        else if ( ((LA26_64>='\u0000' && LA26_64<='\t')||(LA26_64>='\u000B' && LA26_64<='\f')||(LA26_64>='\u000E' && LA26_64<='!')||(LA26_64>='#' && LA26_64<='\uFFFF')) ) {s = 67;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA26_68 = input.LA(1);

                        s = -1;
                        if ( ((LA26_68>='\u0000' && LA26_68<='\t')||(LA26_68>='\u000B' && LA26_68<='\uFFFF')) ) {s = 91;}

                        else if ( (LA26_68=='\n') ) {s = 69;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA26_87 = input.LA(1);

                        s = -1;
                        if ( ((LA26_87>='\u0000' && LA26_87<='\t')||(LA26_87>='\u000B' && LA26_87<='\f')||(LA26_87>='\u000E' && LA26_87<='\uFFFF')) ) {s = 100;}

                        else if ( (LA26_87=='\r') ) {s = 101;}

                        else if ( (LA26_87=='\n') ) {s = 102;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA26_80 = input.LA(1);

                        s = -1;
                        if ( (LA26_80=='\r') ) {s = 78;}

                        else if ( (LA26_80=='\n') ) {s = 79;}

                        else if ( ((LA26_80>='\u0000' && LA26_80<='\t')||(LA26_80>='\u000B' && LA26_80<='\f')||(LA26_80>='\u000E' && LA26_80<='\uFFFF')) ) {s = 80;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}