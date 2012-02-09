package de.sebastianbenz.xgherkin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinLexer extends Lexer {
    public static final int RULE_AS_A=7;
    public static final int RULE_IN_ORDER_TO=8;
    public static final int RULE_THEN_TEXT=17;
    public static final int RULE_NL=23;
    public static final int RULE_TAG=4;
    public static final int RULE_SPACES=21;
    public static final int RULE_TEXT=6;
    public static final int RULE_EXAMPLE_HEADING=12;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_CODE=20;
    public static final int RULE_NNL=22;
    public static final int RULE_WHEN_TEXT=16;
    public static final int RULE_GIVEN_TEXT=18;
    public static final int RULE_I_WANT_TO=9;
    public static final int RULE_SCENARIO_TEXT=10;
    public static final int RULE_EXAMPLE_ROW_END=13;
    public static final int RULE_BACKGROUND_TEXT=15;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=11;
    public static final int RULE_WS=25;
    public static final int RULE_AND_TEXT=19;
    public static final int RULE_EXAMPLE_CELL=14;
    public static final int RULE_FEATURE_TEXT=5;

    // delegates
    // delegators

    public InternalGherkinLexer() {;} 
    public InternalGherkinLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGherkinLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g"; }

    // $ANTLR start "RULE_EXAMPLE_HEADING"
    public final void mRULE_EXAMPLE_HEADING() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_HEADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1258:22: ( 'Examples' RULE_SPACES ':' RULE_SPACES ( '\\r' )? '\\n' )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1258:24: 'Examples' RULE_SPACES ':' RULE_SPACES ( '\\r' )? '\\n'
            {
            match("Examples"); 

            mRULE_SPACES(); 
            match(':'); 
            mRULE_SPACES(); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1258:63: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1258:63: '\\r'
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1260:19: (~ ( ( '\\r' | '\\n' ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1260:21: ~ ( ( '\\r' | '\\n' ) )
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:18: ( ( '\\r' )? ( '\\n' )? )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:20: ( '\\r' )? ( '\\n' )?
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:20: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:26: ( '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:26: '\\n'
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1264:22: ( ( ' ' | '\\t' )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1264:24: ( ' ' | '\\t' )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1264:24: ( ' ' | '\\t' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:19: ( ( 'Narrative:' | 'Feature:' ) ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:21: ( 'Narrative:' | 'Feature:' ) ( RULE_NNL )* RULE_NL
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:21: ( 'Narrative:' | 'Feature:' )
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
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:22: 'Narrative:'
                    {
                    match("Narrative:"); 


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:35: 'Feature:'
                    {
                    match("Feature:"); 


                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:47: ( RULE_NNL )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1266:47: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1268:18: ( 'In order to' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1268:20: 'In order to' ( RULE_NNL )* RULE_NL
            {
            match("In order to"); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1268:34: ( RULE_NNL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1268:34: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1270:11: ( 'As a' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1270:13: 'As a' ( RULE_NNL )* RULE_NL
            {
            match("As a"); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1270:20: ( RULE_NNL )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1270:20: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1272:16: ( 'I want to ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1272:18: 'I want to ' ( RULE_NNL )* RULE_NL
            {
            match("I want to "); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1272:31: ( RULE_NNL )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1272:31: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1274:20: ( 'Scenario' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1274:22: 'Scenario' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Scenario"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1274:49: ( RULE_NNL )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1274:49: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1276:28: ( 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1276:30: 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Scenario"); 

            mRULE_SPACES(); 
            match("Outline"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1276:79: ( RULE_NNL )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1276:79: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1278:22: ( 'Background' RULE_SPACES ':' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1278:24: 'Background' RULE_SPACES ':' ( RULE_NNL )* RULE_NL
            {
            match("Background"); 

            mRULE_SPACES(); 
            match(':'); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1278:53: ( RULE_NNL )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1278:53: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1280:16: ( 'When ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1280:18: 'When ' ( RULE_NNL )* RULE_NL
            {
            match("When "); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1280:26: ( RULE_NNL )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1280:26: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1282:16: ( 'Then ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1282:18: 'Then ' ( RULE_NNL )* RULE_NL
            {
            match("Then "); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1282:26: ( RULE_NNL )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1282:26: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1284:17: ( 'Given ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1284:19: 'Given ' ( RULE_NNL )* RULE_NL
            {
            match("Given "); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1284:28: ( RULE_NNL )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1284:28: RULE_NNL
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1286:15: ( 'And ' ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1286:17: 'And ' ( RULE_NNL )* RULE_NL
            {
            match("And "); 

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1286:24: ( RULE_NNL )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1286:24: RULE_NNL
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

    // $ANTLR start "RULE_EXAMPLE_ROW_END"
    public final void mRULE_EXAMPLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1288:22: ( '|' RULE_SPACES RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1288:24: '|' RULE_SPACES RULE_NL
            {
            match('|'); 
            mRULE_SPACES(); 
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXAMPLE_ROW_END"

    // $ANTLR start "RULE_EXAMPLE_CELL"
    public final void mRULE_EXAMPLE_CELL() throws RecognitionException {
        try {
            int _type = RULE_EXAMPLE_CELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1290:19: ( '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+ )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1290:21: '|' (~ ( ( '\\r' | '\\n' | '|' ) ) )+
            {
            match('|'); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1290:25: (~ ( ( '\\r' | '\\n' | '|' ) ) )+
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
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1290:25: ~ ( ( '\\r' | '\\n' | '|' ) )
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

    // $ANTLR start "RULE_CODE"
    public final void mRULE_CODE() throws RecognitionException {
        try {
            int _type = RULE_CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:11: ( ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:13: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:14: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:20: ( options {greedy=false; } : . )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\"') ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1=='\"') ) {
                                int LA18_3 = input.LA(3);

                                if ( (LA18_3=='\"') ) {
                                    alt18=2;
                                }
                                else if ( ((LA18_3>='\u0000' && LA18_3<='!')||(LA18_3>='#' && LA18_3<='\uFFFF')) ) {
                                    alt18=1;
                                }


                            }
                            else if ( ((LA18_1>='\u0000' && LA18_1<='!')||(LA18_1>='#' && LA18_1<='\uFFFF')) ) {
                                alt18=1;
                            }


                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:58: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:67: ( options {greedy=false; } : . )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\'') ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1=='\'') ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3=='\'') ) {
                                    alt19=2;
                                }
                                else if ( ((LA19_3>='\u0000' && LA19_3<='&')||(LA19_3>='(' && LA19_3<='\uFFFF')) ) {
                                    alt19=1;
                                }


                            }
                            else if ( ((LA19_1>='\u0000' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\uFFFF')) ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1292:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1294:10: ( '@' ( RULE_NNL )+ RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1294:12: '@' ( RULE_NNL )+ RULE_NL
            {
            match('@'); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1294:16: ( RULE_NNL )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1294:16: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1296:17: ( '#' ( RULE_NNL )+ RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1296:19: '#' ( RULE_NNL )+ RULE_NL
            {
            match('#'); 
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1296:23: ( RULE_NNL )+
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
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1296:23: RULE_NNL
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1298:11: (~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) ( RULE_NNL )* RULE_NL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1298:13: ~ ( ( '|' | ' ' | '\\t' | '\\r' | '\\n' | '@' ) ) ( RULE_NNL )* RULE_NL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1298:45: ( RULE_NNL )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1298:45: RULE_NNL
            	    {
            	    mRULE_NNL(); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1300:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1300:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1300:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
        // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:8: ( RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_ROW_END | RULE_EXAMPLE_CELL | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS )
        int alt25=19;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:10: RULE_EXAMPLE_HEADING
                {
                mRULE_EXAMPLE_HEADING(); 

                }
                break;
            case 2 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:31: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 3 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:49: RULE_IN_ORDER_TO
                {
                mRULE_IN_ORDER_TO(); 

                }
                break;
            case 4 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:66: RULE_AS_A
                {
                mRULE_AS_A(); 

                }
                break;
            case 5 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:76: RULE_I_WANT_TO
                {
                mRULE_I_WANT_TO(); 

                }
                break;
            case 6 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:91: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 7 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:110: RULE_SCENARIO_OUTLINE_TEXT
                {
                mRULE_SCENARIO_OUTLINE_TEXT(); 

                }
                break;
            case 8 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:137: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 9 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:158: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 10 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:173: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 11 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:188: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 12 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:204: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 13 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:218: RULE_EXAMPLE_ROW_END
                {
                mRULE_EXAMPLE_ROW_END(); 

                }
                break;
            case 14 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:239: RULE_EXAMPLE_CELL
                {
                mRULE_EXAMPLE_CELL(); 

                }
                break;
            case 15 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:257: RULE_CODE
                {
                mRULE_CODE(); 

                }
                break;
            case 16 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:267: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;
            case 17 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:292: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 19 :
                // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1:302: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\1\uffff\12\20\1\37\2\20\1\uffff\1\20\2\uffff\14\20\1\37\2\uffff"+
        "\2\20\1\62\16\20\1\uffff\1\62\1\uffff\5\20\1\116\1\122\22\20\1\uffff"+
        "\1\116\1\uffff\1\116\1\uffff\1\122\1\uffff\1\122\2\20\1\150\1\154"+
        "\1\20\1\uffff\11\20\2\150\2\uffff\2\154\2\uffff\1\167\2\133\7\20"+
        "\1\uffff\1\167\1\uffff\1\167\2\20\1\u0088\7\20\2\u0088\2\uffff\3"+
        "\20\1\u0095\4\20\1\uffff\1\u0088\1\20\1\u00a0\1\uffff\1\u0095\1"+
        "\uffff\1\u0095\2\20\1\uffff\1\u00a4\2\u00a0\2\uffff\2\20\1\u00ac"+
        "\1\uffff\1\u00a4\1\uffff\1\u00a4\1\20\2\u00ac\2\uffff\4\20\3\u00b5"+
        "\2\uffff";
    static final String DFA25_eofS =
        "\u00b6\uffff";
    static final String DFA25_minS =
        "\1\0\1\170\1\141\1\145\1\40\1\156\1\143\1\141\2\150\1\151\1\0\1"+
        "\42\1\47\1\uffff\1\0\2\uffff\1\141\1\162\1\141\1\40\1\167\1\40\1"+
        "\144\1\145\1\143\2\145\1\166\1\0\2\uffff\1\42\1\47\1\0\1\155\1\162"+
        "\1\164\1\157\2\141\1\40\1\156\1\153\2\156\1\145\2\0\1\uffff\1\12"+
        "\1\uffff\1\160\1\141\1\165\1\162\1\156\2\0\1\141\1\147\2\40\1\156"+
        "\10\0\1\154\1\164\1\162\1\144\1\164\1\uffff\1\12\1\uffff\1\0\1\uffff"+
        "\1\12\1\uffff\1\0\2\162\2\0\1\40\1\uffff\2\0\1\145\1\151\2\145\1"+
        "\40\1\151\1\157\1\0\1\12\2\uffff\1\0\1\12\2\uffff\3\0\1\163\1\166"+
        "\1\72\1\162\1\164\1\157\1\165\1\uffff\1\12\1\uffff\1\0\1\11\1\145"+
        "\1\0\1\40\1\157\1\11\1\156\2\11\1\72\1\0\1\12\2\uffff\1\164\1\40"+
        "\1\11\1\0\1\165\1\144\1\11\1\12\1\uffff\1\0\1\157\1\0\1\uffff\1"+
        "\12\1\uffff\1\0\1\164\1\11\1\uffff\2\0\1\12\2\uffff\1\154\1\11\1"+
        "\0\1\uffff\1\12\1\uffff\1\0\1\151\1\0\1\12\2\uffff\1\156\1\145\2"+
        "\11\2\0\1\12\2\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\170\1\141\1\145\1\156\1\163\1\143\1\141\2\150\1\151\1"+
        "\uffff\1\42\1\47\1\uffff\1\uffff\2\uffff\1\141\1\162\1\141\1\40"+
        "\1\167\1\40\1\144\1\145\1\143\2\145\1\166\1\uffff\2\uffff\1\42\1"+
        "\47\1\uffff\1\155\1\162\1\164\1\157\2\141\1\40\1\156\1\153\2\156"+
        "\1\145\2\uffff\1\uffff\1\12\1\uffff\1\160\1\141\1\165\1\162\1\156"+
        "\2\uffff\1\141\1\147\2\40\1\156\10\uffff\1\154\1\164\1\162\1\144"+
        "\1\164\1\uffff\1\12\1\uffff\1\uffff\1\uffff\1\12\1\uffff\1\uffff"+
        "\2\162\2\uffff\1\40\1\uffff\2\uffff\1\145\1\151\2\145\1\40\1\151"+
        "\1\157\1\uffff\1\12\2\uffff\1\uffff\1\12\2\uffff\3\uffff\1\163\1"+
        "\166\1\72\1\162\1\164\1\157\1\165\1\uffff\1\12\1\uffff\1\uffff\1"+
        "\72\1\145\1\uffff\1\40\1\157\1\117\1\156\1\72\1\40\1\72\1\uffff"+
        "\1\12\2\uffff\1\164\1\40\1\117\1\uffff\1\165\1\144\1\40\1\12\1\uffff"+
        "\1\uffff\1\157\1\uffff\1\uffff\1\12\1\uffff\1\uffff\1\164\1\72\1"+
        "\uffff\2\uffff\1\12\2\uffff\1\154\1\72\1\uffff\1\uffff\1\12\1\uffff"+
        "\1\uffff\1\151\1\uffff\1\12\2\uffff\1\156\1\145\2\72\2\uffff\1\12"+
        "\2\uffff";
    static final String DFA25_acceptS =
        "\16\uffff\1\20\1\uffff\1\22\1\23\15\uffff\1\15\1\16\21\uffff\1\21"+
        "\1\uffff\1\21\31\uffff\1\4\1\uffff\1\4\1\uffff\1\14\1\uffff\1\14"+
        "\6\uffff\1\17\13\uffff\2\11\2\uffff\2\12\12\uffff\1\13\1\uffff\1"+
        "\13\15\uffff\2\2\10\uffff\1\1\3\uffff\1\6\1\uffff\1\6\3\uffff\1"+
        "\1\3\uffff\2\5\3\uffff\1\3\1\uffff\1\3\4\uffff\2\10\7\uffff\2\7";
    static final String DFA25_specialS =
        "\1\5\12\uffff\1\41\3\uffff\1\43\16\uffff\1\15\4\uffff\1\33\14\uffff"+
        "\1\10\1\12\10\uffff\1\2\1\21\5\uffff\1\0\1\31\1\23\1\25\1\51\1\32"+
        "\1\42\1\35\10\uffff\1\20\3\uffff\1\7\2\uffff\1\36\1\11\2\uffff\1"+
        "\6\1\16\7\uffff\1\1\3\uffff\1\46\3\uffff\1\40\1\37\1\34\12\uffff"+
        "\1\14\2\uffff\1\44\7\uffff\1\26\6\uffff\1\27\5\uffff\1\45\1\uffff"+
        "\1\17\3\uffff\1\47\3\uffff\1\30\1\24\5\uffff\1\13\3\uffff\1\3\1"+
        "\uffff\1\22\7\uffff\1\50\1\4\3\uffff}>";
    static final String[] DFA25_transitionS = {
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
            "\11\40\1\36\1\uffff\2\40\1\uffff\22\40\1\36\133\40\1\uffff"+
            "\uff83\40",
            "\1\41",
            "\1\42",
            "",
            "\12\43\1\uffff\2\43\1\uffff\ufff2\43",
            "",
            "",
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
            "\1\57",
            "\11\40\1\36\1\uffff\2\40\1\uffff\22\40\1\36\133\40\1\uffff"+
            "\uff83\40",
            "",
            "",
            "\1\60",
            "\1\61",
            "\12\43\1\64\2\43\1\63\ufff2\43",
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
            "\1\100",
            "\12\104\1\102\2\104\1\101\24\104\1\103\uffdd\104",
            "\12\110\1\106\2\110\1\105\31\110\1\107\uffd8\110",
            "",
            "\1\64",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\121\1\120\2\121\1\117\ufff2\121",
            "\12\125\1\124\2\125\1\123\ufff2\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\133\1\102\ufff5\133",
            "\0\133",
            "\12\104\1\102\2\104\1\101\24\104\1\134\uffdd\104",
            "\12\104\1\102\2\104\1\101\24\104\1\103\uffdd\104",
            "\12\133\1\106\ufff5\133",
            "\0\133",
            "\12\110\1\106\2\110\1\105\31\110\1\135\uffd8\110",
            "\12\110\1\106\2\110\1\105\31\110\1\107\uffd8\110",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\120",
            "",
            "\12\121\1\120\2\121\1\117\ufff2\121",
            "",
            "\1\124",
            "",
            "\12\125\1\124\2\125\1\123\ufff2\125",
            "\1\143",
            "\1\144",
            "\12\145\1\147\2\145\1\146\ufff2\145",
            "\12\151\1\153\2\151\1\152\ufff2\151",
            "\1\155",
            "",
            "\12\104\1\102\2\104\1\101\24\104\1\156\uffdd\104",
            "\12\110\1\106\2\110\1\105\31\110\1\157\uffd8\110",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\145\1\147\2\145\1\146\ufff2\145",
            "\1\147",
            "",
            "",
            "\12\151\1\153\2\151\1\152\ufff2\151",
            "\1\153",
            "",
            "",
            "\12\172\1\171\2\172\1\170\ufff2\172",
            "\12\104\1\102\2\104\1\101\24\104\1\156\uffdd\104",
            "\12\110\1\106\2\110\1\105\31\110\1\157\uffd8\110",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\171",
            "",
            "\12\172\1\171\2\172\1\170\ufff2\172",
            "\1\u0082\26\uffff\1\u0082\31\uffff\1\u0083",
            "\1\u0084",
            "\12\u0085\1\u0087\2\u0085\1\u0086\ufff2\u0085",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\26\uffff\1\u008b\31\uffff\1\u008c\24\uffff\1\u008d",
            "\1\u008e",
            "\1\u0082\26\uffff\1\u0082\31\uffff\1\u0083",
            "\1\u008f\1\u0091\2\uffff\1\u0090\22\uffff\1\u008f",
            "\1\u0092",
            "\12\u0085\1\u0087\2\u0085\1\u0086\ufff2\u0085",
            "\1\u0087",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u008b\26\uffff\1\u008b\31\uffff\1\u008c\24\uffff\1\u008d",
            "\12\u0098\1\u0097\2\u0098\1\u0096\ufff2\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u008f\1\u0091\2\uffff\1\u0090\22\uffff\1\u008f",
            "\1\u0091",
            "",
            "\12\u0085\1\u0087\2\u0085\1\u0086\ufff2\u0085",
            "\1\u009c",
            "\12\u009d\1\u009f\2\u009d\1\u009e\ufff2\u009d",
            "",
            "\1\u0097",
            "",
            "\12\u0098\1\u0097\2\u0098\1\u0096\ufff2\u0098",
            "\1\u00a1",
            "\1\u00a2\26\uffff\1\u00a2\31\uffff\1\u00a3",
            "",
            "\12\u00a7\1\u00a6\2\u00a7\1\u00a5\ufff2\u00a7",
            "\12\u009d\1\u009f\2\u009d\1\u009e\ufff2\u009d",
            "\1\u009f",
            "",
            "",
            "\1\u00a8",
            "\1\u00a2\26\uffff\1\u00a2\31\uffff\1\u00a3",
            "\12\u00a9\1\u00ab\2\u00a9\1\u00aa\ufff2\u00a9",
            "",
            "\1\u00a6",
            "",
            "\12\u00a7\1\u00a6\2\u00a7\1\u00a5\ufff2\u00a7",
            "\1\u00ad",
            "\12\u00a9\1\u00ab\2\u00a9\1\u00aa\ufff2\u00a9",
            "\1\u00ab",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0\26\uffff\1\u00b0\31\uffff\1\u00b1",
            "\1\u00b0\26\uffff\1\u00b0\31\uffff\1\u00b1",
            "\12\u00b2\1\u00b4\2\u00b2\1\u00b3\ufff2\u00b2",
            "\12\u00b2\1\u00b4\2\u00b2\1\u00b3\ufff2\u00b2",
            "\1\u00b4",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_EXAMPLE_HEADING | RULE_FEATURE_TEXT | RULE_IN_ORDER_TO | RULE_AS_A | RULE_I_WANT_TO | RULE_SCENARIO_TEXT | RULE_SCENARIO_OUTLINE_TEXT | RULE_BACKGROUND_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_GIVEN_TEXT | RULE_AND_TEXT | RULE_EXAMPLE_ROW_END | RULE_EXAMPLE_CELL | RULE_CODE | RULE_TAG | RULE_SL_COMMENT | RULE_TEXT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_65 = input.LA(1);

                        s = -1;
                        if ( (LA25_65=='\n') ) {s = 66;}

                        else if ( ((LA25_65>='\u0000' && LA25_65<='\t')||(LA25_65>='\u000B' && LA25_65<='\uFFFF')) ) {s = 91;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_101 = input.LA(1);

                        s = -1;
                        if ( (LA25_101=='\r') ) {s = 102;}

                        else if ( (LA25_101=='\n') ) {s = 103;}

                        else if ( ((LA25_101>='\u0000' && LA25_101<='\t')||(LA25_101>='\u000B' && LA25_101<='\f')||(LA25_101>='\u000E' && LA25_101<='\uFFFF')) ) {s = 101;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_58 = input.LA(1);

                        s = -1;
                        if ( (LA25_58=='\r') ) {s = 79;}

                        else if ( (LA25_58=='\n') ) {s = 80;}

                        else if ( ((LA25_58>='\u0000' && LA25_58<='\t')||(LA25_58>='\u000B' && LA25_58<='\f')||(LA25_58>='\u000E' && LA25_58<='\uFFFF')) ) {s = 81;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_167 = input.LA(1);

                        s = -1;
                        if ( (LA25_167=='\r') ) {s = 165;}

                        else if ( (LA25_167=='\n') ) {s = 166;}

                        else if ( ((LA25_167>='\u0000' && LA25_167<='\t')||(LA25_167>='\u000B' && LA25_167<='\f')||(LA25_167>='\u000E' && LA25_167<='\uFFFF')) ) {s = 167;}

                        else s = 164;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_178 = input.LA(1);

                        s = -1;
                        if ( (LA25_178=='\r') ) {s = 179;}

                        else if ( (LA25_178=='\n') ) {s = 180;}

                        else if ( ((LA25_178>='\u0000' && LA25_178<='\t')||(LA25_178>='\u000B' && LA25_178<='\f')||(LA25_178>='\u000E' && LA25_178<='\uFFFF')) ) {s = 178;}

                        else s = 181;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='E') ) {s = 1;}

                        else if ( (LA25_0=='N') ) {s = 2;}

                        else if ( (LA25_0=='F') ) {s = 3;}

                        else if ( (LA25_0=='I') ) {s = 4;}

                        else if ( (LA25_0=='A') ) {s = 5;}

                        else if ( (LA25_0=='S') ) {s = 6;}

                        else if ( (LA25_0=='B') ) {s = 7;}

                        else if ( (LA25_0=='W') ) {s = 8;}

                        else if ( (LA25_0=='T') ) {s = 9;}

                        else if ( (LA25_0=='G') ) {s = 10;}

                        else if ( (LA25_0=='|') ) {s = 11;}

                        else if ( (LA25_0=='\"') ) {s = 12;}

                        else if ( (LA25_0=='\'') ) {s = 13;}

                        else if ( (LA25_0=='@') ) {s = 14;}

                        else if ( (LA25_0=='#') ) {s = 15;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='$' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='?')||(LA25_0>='C' && LA25_0<='D')||LA25_0=='H'||(LA25_0>='J' && LA25_0<='M')||(LA25_0>='O' && LA25_0<='R')||(LA25_0>='U' && LA25_0<='V')||(LA25_0>='X' && LA25_0<='{')||(LA25_0>='}' && LA25_0<='\uFFFF')) ) {s = 16;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_92 = input.LA(1);

                        s = -1;
                        if ( (LA25_92=='\"') ) {s = 110;}

                        else if ( (LA25_92=='\r') ) {s = 65;}

                        else if ( (LA25_92=='\n') ) {s = 66;}

                        else if ( ((LA25_92>='\u0000' && LA25_92<='\t')||(LA25_92>='\u000B' && LA25_92<='\f')||(LA25_92>='\u000E' && LA25_92<='!')||(LA25_92>='#' && LA25_92<='\uFFFF')) ) {s = 68;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_85 = input.LA(1);

                        s = -1;
                        if ( (LA25_85=='\r') ) {s = 83;}

                        else if ( (LA25_85=='\n') ) {s = 84;}

                        else if ( ((LA25_85>='\u0000' && LA25_85<='\t')||(LA25_85>='\u000B' && LA25_85<='\f')||(LA25_85>='\u000E' && LA25_85<='\uFFFF')) ) {s = 85;}

                        else s = 82;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_48 = input.LA(1);

                        s = -1;
                        if ( (LA25_48=='\r') ) {s = 65;}

                        else if ( (LA25_48=='\n') ) {s = 66;}

                        else if ( (LA25_48=='\"') ) {s = 67;}

                        else if ( ((LA25_48>='\u0000' && LA25_48<='\t')||(LA25_48>='\u000B' && LA25_48<='\f')||(LA25_48>='\u000E' && LA25_48<='!')||(LA25_48>='#' && LA25_48<='\uFFFF')) ) {s = 68;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_89 = input.LA(1);

                        s = -1;
                        if ( ((LA25_89>='\u0000' && LA25_89<='\t')||(LA25_89>='\u000B' && LA25_89<='\f')||(LA25_89>='\u000E' && LA25_89<='\uFFFF')) ) {s = 105;}

                        else if ( (LA25_89=='\r') ) {s = 106;}

                        else if ( (LA25_89=='\n') ) {s = 107;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_49 = input.LA(1);

                        s = -1;
                        if ( (LA25_49=='\r') ) {s = 69;}

                        else if ( (LA25_49=='\n') ) {s = 70;}

                        else if ( (LA25_49=='\'') ) {s = 71;}

                        else if ( ((LA25_49>='\u0000' && LA25_49<='\t')||(LA25_49>='\u000B' && LA25_49<='\f')||(LA25_49>='\u000E' && LA25_49<='&')||(LA25_49>='(' && LA25_49<='\uFFFF')) ) {s = 72;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_163 = input.LA(1);

                        s = -1;
                        if ( ((LA25_163>='\u0000' && LA25_163<='\t')||(LA25_163>='\u000B' && LA25_163<='\f')||(LA25_163>='\u000E' && LA25_163<='\uFFFF')) ) {s = 169;}

                        else if ( (LA25_163=='\r') ) {s = 170;}

                        else if ( (LA25_163=='\n') ) {s = 171;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_122 = input.LA(1);

                        s = -1;
                        if ( (LA25_122=='\r') ) {s = 120;}

                        else if ( (LA25_122=='\n') ) {s = 121;}

                        else if ( ((LA25_122>='\u0000' && LA25_122<='\t')||(LA25_122>='\u000B' && LA25_122<='\f')||(LA25_122>='\u000E' && LA25_122<='\uFFFF')) ) {s = 122;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA25_30 = input.LA(1);

                        s = -1;
                        if ( (LA25_30=='\t'||LA25_30==' ') ) {s = 30;}

                        else if ( ((LA25_30>='\u0000' && LA25_30<='\b')||(LA25_30>='\u000B' && LA25_30<='\f')||(LA25_30>='\u000E' && LA25_30<='\u001F')||(LA25_30>='!' && LA25_30<='{')||(LA25_30>='}' && LA25_30<='\uFFFF')) ) {s = 32;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA25_93 = input.LA(1);

                        s = -1;
                        if ( (LA25_93=='\'') ) {s = 111;}

                        else if ( (LA25_93=='\r') ) {s = 69;}

                        else if ( (LA25_93=='\n') ) {s = 70;}

                        else if ( ((LA25_93>='\u0000' && LA25_93<='\t')||(LA25_93>='\u000B' && LA25_93<='\f')||(LA25_93>='\u000E' && LA25_93<='&')||(LA25_93>='(' && LA25_93<='\uFFFF')) ) {s = 72;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA25_148 = input.LA(1);

                        s = -1;
                        if ( ((LA25_148>='\u0000' && LA25_148<='\t')||(LA25_148>='\u000B' && LA25_148<='\f')||(LA25_148>='\u000E' && LA25_148<='\uFFFF')) ) {s = 157;}

                        else if ( (LA25_148=='\r') ) {s = 158;}

                        else if ( (LA25_148=='\n') ) {s = 159;}

                        else s = 160;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA25_81 = input.LA(1);

                        s = -1;
                        if ( (LA25_81=='\r') ) {s = 79;}

                        else if ( (LA25_81=='\n') ) {s = 80;}

                        else if ( ((LA25_81>='\u0000' && LA25_81<='\t')||(LA25_81>='\u000B' && LA25_81<='\f')||(LA25_81>='\u000E' && LA25_81<='\uFFFF')) ) {s = 81;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA25_59 = input.LA(1);

                        s = -1;
                        if ( (LA25_59=='\r') ) {s = 83;}

                        else if ( (LA25_59=='\n') ) {s = 84;}

                        else if ( ((LA25_59>='\u0000' && LA25_59<='\t')||(LA25_59>='\u000B' && LA25_59<='\f')||(LA25_59>='\u000E' && LA25_59<='\uFFFF')) ) {s = 85;}

                        else s = 82;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA25_169 = input.LA(1);

                        s = -1;
                        if ( (LA25_169=='\r') ) {s = 170;}

                        else if ( (LA25_169=='\n') ) {s = 171;}

                        else if ( ((LA25_169>='\u0000' && LA25_169<='\t')||(LA25_169>='\u000B' && LA25_169<='\f')||(LA25_169>='\u000E' && LA25_169<='\uFFFF')) ) {s = 169;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA25_67 = input.LA(1);

                        s = -1;
                        if ( (LA25_67=='\"') ) {s = 92;}

                        else if ( (LA25_67=='\r') ) {s = 65;}

                        else if ( (LA25_67=='\n') ) {s = 66;}

                        else if ( ((LA25_67>='\u0000' && LA25_67<='\t')||(LA25_67>='\u000B' && LA25_67<='\f')||(LA25_67>='\u000E' && LA25_67<='!')||(LA25_67>='#' && LA25_67<='\uFFFF')) ) {s = 68;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA25_157 = input.LA(1);

                        s = -1;
                        if ( (LA25_157=='\r') ) {s = 158;}

                        else if ( (LA25_157=='\n') ) {s = 159;}

                        else if ( ((LA25_157>='\u0000' && LA25_157<='\t')||(LA25_157>='\u000B' && LA25_157<='\f')||(LA25_157>='\u000E' && LA25_157<='\uFFFF')) ) {s = 157;}

                        else s = 160;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA25_68 = input.LA(1);

                        s = -1;
                        if ( (LA25_68=='\r') ) {s = 65;}

                        else if ( (LA25_68=='\n') ) {s = 66;}

                        else if ( (LA25_68=='\"') ) {s = 67;}

                        else if ( ((LA25_68>='\u0000' && LA25_68<='\t')||(LA25_68>='\u000B' && LA25_68<='\f')||(LA25_68>='\u000E' && LA25_68<='!')||(LA25_68>='#' && LA25_68<='\uFFFF')) ) {s = 68;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA25_133 = input.LA(1);

                        s = -1;
                        if ( (LA25_133=='\r') ) {s = 134;}

                        else if ( (LA25_133=='\n') ) {s = 135;}

                        else if ( ((LA25_133>='\u0000' && LA25_133<='\t')||(LA25_133>='\u000B' && LA25_133<='\f')||(LA25_133>='\u000E' && LA25_133<='\uFFFF')) ) {s = 133;}

                        else s = 136;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA25_140 = input.LA(1);

                        s = -1;
                        if ( (LA25_140=='\r') ) {s = 150;}

                        else if ( (LA25_140=='\n') ) {s = 151;}

                        else if ( ((LA25_140>='\u0000' && LA25_140<='\t')||(LA25_140>='\u000B' && LA25_140<='\f')||(LA25_140>='\u000E' && LA25_140<='\uFFFF')) ) {s = 152;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA25_156 = input.LA(1);

                        s = -1;
                        if ( (LA25_156=='\r') ) {s = 165;}

                        else if ( (LA25_156=='\n') ) {s = 166;}

                        else if ( ((LA25_156>='\u0000' && LA25_156<='\t')||(LA25_156>='\u000B' && LA25_156<='\f')||(LA25_156>='\u000E' && LA25_156<='\uFFFF')) ) {s = 167;}

                        else s = 164;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA25_66 = input.LA(1);

                        s = -1;
                        if ( ((LA25_66>='\u0000' && LA25_66<='\uFFFF')) ) {s = 91;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA25_70 = input.LA(1);

                        s = -1;
                        if ( ((LA25_70>='\u0000' && LA25_70<='\uFFFF')) ) {s = 91;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA25_35 = input.LA(1);

                        s = -1;
                        if ( (LA25_35=='\r') ) {s = 51;}

                        else if ( (LA25_35=='\n') ) {s = 52;}

                        else if ( ((LA25_35>='\u0000' && LA25_35<='\t')||(LA25_35>='\u000B' && LA25_35<='\f')||(LA25_35>='\u000E' && LA25_35<='\uFFFF')) ) {s = 35;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA25_111 = input.LA(1);

                        s = -1;
                        if ( (LA25_111=='\'') ) {s = 111;}

                        else if ( (LA25_111=='\r') ) {s = 69;}

                        else if ( (LA25_111=='\n') ) {s = 70;}

                        else if ( ((LA25_111>='\u0000' && LA25_111<='\t')||(LA25_111>='\u000B' && LA25_111<='\f')||(LA25_111>='\u000E' && LA25_111<='&')||(LA25_111>='(' && LA25_111<='\uFFFF')) ) {s = 72;}

                        else s = 91;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA25_72 = input.LA(1);

                        s = -1;
                        if ( (LA25_72=='\r') ) {s = 69;}

                        else if ( (LA25_72=='\n') ) {s = 70;}

                        else if ( (LA25_72=='\'') ) {s = 71;}

                        else if ( ((LA25_72>='\u0000' && LA25_72<='\t')||(LA25_72>='\u000B' && LA25_72<='\f')||(LA25_72>='\u000E' && LA25_72<='&')||(LA25_72>='(' && LA25_72<='\uFFFF')) ) {s = 72;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA25_88 = input.LA(1);

                        s = -1;
                        if ( ((LA25_88>='\u0000' && LA25_88<='\t')||(LA25_88>='\u000B' && LA25_88<='\f')||(LA25_88>='\u000E' && LA25_88<='\uFFFF')) ) {s = 101;}

                        else if ( (LA25_88=='\r') ) {s = 102;}

                        else if ( (LA25_88=='\n') ) {s = 103;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA25_110 = input.LA(1);

                        s = -1;
                        if ( (LA25_110=='\"') ) {s = 110;}

                        else if ( (LA25_110=='\r') ) {s = 65;}

                        else if ( (LA25_110=='\n') ) {s = 66;}

                        else if ( ((LA25_110>='\u0000' && LA25_110<='\t')||(LA25_110>='\u000B' && LA25_110<='\f')||(LA25_110>='\u000E' && LA25_110<='!')||(LA25_110>='#' && LA25_110<='\uFFFF')) ) {s = 68;}

                        else s = 91;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA25_109 = input.LA(1);

                        s = -1;
                        if ( (LA25_109=='\r') ) {s = 120;}

                        else if ( (LA25_109=='\n') ) {s = 121;}

                        else if ( ((LA25_109>='\u0000' && LA25_109<='\t')||(LA25_109>='\u000B' && LA25_109<='\f')||(LA25_109>='\u000E' && LA25_109<='\uFFFF')) ) {s = 122;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA25_11 = input.LA(1);

                        s = -1;
                        if ( (LA25_11=='\t'||LA25_11==' ') ) {s = 30;}

                        else if ( ((LA25_11>='\u0000' && LA25_11<='\b')||(LA25_11>='\u000B' && LA25_11<='\f')||(LA25_11>='\u000E' && LA25_11<='\u001F')||(LA25_11>='!' && LA25_11<='{')||(LA25_11>='}' && LA25_11<='\uFFFF')) ) {s = 32;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA25_71 = input.LA(1);

                        s = -1;
                        if ( (LA25_71=='\'') ) {s = 93;}

                        else if ( (LA25_71=='\r') ) {s = 69;}

                        else if ( (LA25_71=='\n') ) {s = 70;}

                        else if ( ((LA25_71>='\u0000' && LA25_71<='\t')||(LA25_71>='\u000B' && LA25_71<='\f')||(LA25_71>='\u000E' && LA25_71<='&')||(LA25_71>='(' && LA25_71<='\uFFFF')) ) {s = 72;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA25_15 = input.LA(1);

                        s = -1;
                        if ( ((LA25_15>='\u0000' && LA25_15<='\t')||(LA25_15>='\u000B' && LA25_15<='\f')||(LA25_15>='\u000E' && LA25_15<='\uFFFF')) ) {s = 35;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA25_125 = input.LA(1);

                        s = -1;
                        if ( ((LA25_125>='\u0000' && LA25_125<='\t')||(LA25_125>='\u000B' && LA25_125<='\f')||(LA25_125>='\u000E' && LA25_125<='\uFFFF')) ) {s = 133;}

                        else if ( (LA25_125=='\r') ) {s = 134;}

                        else if ( (LA25_125=='\n') ) {s = 135;}

                        else s = 136;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA25_146 = input.LA(1);

                        s = -1;
                        if ( ((LA25_146>='\u0000' && LA25_146<='\t')||(LA25_146>='\u000B' && LA25_146<='\f')||(LA25_146>='\u000E' && LA25_146<='\uFFFF')) ) {s = 133;}

                        else if ( (LA25_146=='\r') ) {s = 134;}

                        else if ( (LA25_146=='\n') ) {s = 135;}

                        else s = 136;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA25_105 = input.LA(1);

                        s = -1;
                        if ( (LA25_105=='\r') ) {s = 106;}

                        else if ( (LA25_105=='\n') ) {s = 107;}

                        else if ( ((LA25_105>='\u0000' && LA25_105<='\t')||(LA25_105>='\u000B' && LA25_105<='\f')||(LA25_105>='\u000E' && LA25_105<='\uFFFF')) ) {s = 105;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA25_152 = input.LA(1);

                        s = -1;
                        if ( (LA25_152=='\r') ) {s = 150;}

                        else if ( (LA25_152=='\n') ) {s = 151;}

                        else if ( ((LA25_152>='\u0000' && LA25_152<='\t')||(LA25_152>='\u000B' && LA25_152<='\f')||(LA25_152>='\u000E' && LA25_152<='\uFFFF')) ) {s = 152;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA25_177 = input.LA(1);

                        s = -1;
                        if ( ((LA25_177>='\u0000' && LA25_177<='\t')||(LA25_177>='\u000B' && LA25_177<='\f')||(LA25_177>='\u000E' && LA25_177<='\uFFFF')) ) {s = 178;}

                        else if ( (LA25_177=='\r') ) {s = 179;}

                        else if ( (LA25_177=='\n') ) {s = 180;}

                        else s = 181;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA25_69 = input.LA(1);

                        s = -1;
                        if ( (LA25_69=='\n') ) {s = 70;}

                        else if ( ((LA25_69>='\u0000' && LA25_69<='\t')||(LA25_69>='\u000B' && LA25_69<='\uFFFF')) ) {s = 91;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}