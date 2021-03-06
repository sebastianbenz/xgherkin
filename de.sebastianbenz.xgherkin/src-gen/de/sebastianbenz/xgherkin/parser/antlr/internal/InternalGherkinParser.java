package de.sebastianbenz.xgherkin.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebastianbenz.xgherkin.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TAG", "RULE_FEATURE_TEXT", "RULE_TEXT", "RULE_AS_A", "RULE_IN_ORDER_TO", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_EXAMPLE_HEADING", "RULE_EXAMPLE_ROW_END", "RULE_EXAMPLE_CELL", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_CODE", "RULE_SPACES", "RULE_NNL", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_AS_A=7;
    public static final int RULE_IN_ORDER_TO=8;
    public static final int RULE_THEN_TEXT=17;
    public static final int RULE_NL=23;
    public static final int RULE_TAG=4;
    public static final int RULE_SPACES=21;
    public static final int RULE_TEXT=6;
    public static final int RULE_EXAMPLE_HEADING=12;
    public static final int RULE_SL_COMMENT=24;
    public static final int EOF=-1;
    public static final int RULE_CODE=20;
    public static final int RULE_NNL=22;
    public static final int RULE_WHEN_TEXT=16;
    public static final int RULE_GIVEN_TEXT=18;
    public static final int RULE_I_WANT_TO=9;
    public static final int RULE_SCENARIO_TEXT=10;
    public static final int RULE_EXAMPLE_ROW_END=13;
    public static final int RULE_BACKGROUND_TEXT=15;
    public static final int RULE_WS=25;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=11;
    public static final int RULE_AND_TEXT=19;
    public static final int RULE_EXAMPLE_CELL=14;
    public static final int RULE_FEATURE_TEXT=5;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g"; }



     	private GherkinGrammarAccess grammarAccess;
     	
        public InternalGherkinParser(TokenStream input, GherkinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Feature";	
       	}
       	
       	@Override
       	protected GherkinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFeature"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:67:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:68:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:69:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature75);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature85); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:76:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_scenarios_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:79:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAG) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:81:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:81:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:82:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleFeature127); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:98:3: ( (lv_name_1_0= RULE_FEATURE_TEXT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_FEATURE_TEXT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:99:1: (lv_name_1_0= RULE_FEATURE_TEXT )
                    {
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:99:1: (lv_name_1_0= RULE_FEATURE_TEXT )
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:100:3: lv_name_1_0= RULE_FEATURE_TEXT
                    {
                    lv_name_1_0=(Token)match(input,RULE_FEATURE_TEXT,FOLLOW_RULE_FEATURE_TEXT_in_ruleFeature150); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"FEATURE_TEXT");
                    	    

                    }


                    }
                    break;

            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:116:3: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_TEXT && LA3_0<=RULE_I_WANT_TO)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:117:1: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:117:1: (lv_elements_2_0= ruleNarrativeElement )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:118:3: lv_elements_2_0= ruleNarrativeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNarrativeElement_in_ruleFeature177);
            	    lv_elements_2_0=ruleNarrativeElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"NarrativeElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:134:3: ( (lv_scenarios_3_0= ruleAbstractScenario ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TAG||(LA4_0>=RULE_SCENARIO_TEXT && LA4_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA4_0==RULE_BACKGROUND_TEXT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:135:1: (lv_scenarios_3_0= ruleAbstractScenario )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:135:1: (lv_scenarios_3_0= ruleAbstractScenario )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:136:3: lv_scenarios_3_0= ruleAbstractScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractScenario_in_ruleFeature199);
            	    lv_scenarios_3_0=ruleAbstractScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scenarios",
            	            		lv_scenarios_3_0, 
            	            		"AbstractScenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNarrativeElement"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:160:1: entryRuleNarrativeElement returns [EObject current=null] : iv_ruleNarrativeElement= ruleNarrativeElement EOF ;
    public final EObject entryRuleNarrativeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNarrativeElement = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:161:2: (iv_ruleNarrativeElement= ruleNarrativeElement EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:162:2: iv_ruleNarrativeElement= ruleNarrativeElement EOF
            {
             newCompositeNode(grammarAccess.getNarrativeElementRule()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_entryRuleNarrativeElement236);
            iv_ruleNarrativeElement=ruleNarrativeElement();

            state._fsp--;

             current =iv_ruleNarrativeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNarrativeElement246); 

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
    // $ANTLR end "entryRuleNarrativeElement"


    // $ANTLR start "ruleNarrativeElement"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:169:1: ruleNarrativeElement returns [EObject current=null] : (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText ) ;
    public final EObject ruleNarrativeElement() throws RecognitionException {
        EObject current = null;

        EObject this_InOrderTo_0 = null;

        EObject this_AsA_1 = null;

        EObject this_IWantTo_2 = null;

        EObject this_FreeText_3 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:172:28: ( (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:173:1: (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:173:1: (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_IN_ORDER_TO:
                {
                alt5=1;
                }
                break;
            case RULE_AS_A:
                {
                alt5=2;
                }
                break;
            case RULE_I_WANT_TO:
                {
                alt5=3;
                }
                break;
            case RULE_TEXT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:174:5: this_InOrderTo_0= ruleInOrderTo
                    {
                     
                            newCompositeNode(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInOrderTo_in_ruleNarrativeElement293);
                    this_InOrderTo_0=ruleInOrderTo();

                    state._fsp--;

                     
                            current = this_InOrderTo_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:184:5: this_AsA_1= ruleAsA
                    {
                     
                            newCompositeNode(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAsA_in_ruleNarrativeElement320);
                    this_AsA_1=ruleAsA();

                    state._fsp--;

                     
                            current = this_AsA_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:194:5: this_IWantTo_2= ruleIWantTo
                    {
                     
                            newCompositeNode(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIWantTo_in_ruleNarrativeElement347);
                    this_IWantTo_2=ruleIWantTo();

                    state._fsp--;

                     
                            current = this_IWantTo_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:204:5: this_FreeText_3= ruleFreeText
                    {
                     
                            newCompositeNode(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFreeText_in_ruleNarrativeElement374);
                    this_FreeText_3=ruleFreeText();

                    state._fsp--;

                     
                            current = this_FreeText_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNarrativeElement"


    // $ANTLR start "entryRuleFreeText"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:220:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:221:2: (iv_ruleFreeText= ruleFreeText EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:222:2: iv_ruleFreeText= ruleFreeText EOF
            {
             newCompositeNode(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_ruleFreeText_in_entryRuleFreeText409);
            iv_ruleFreeText=ruleFreeText();

            state._fsp--;

             current =iv_ruleFreeText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeText419); 

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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:229:1: ruleFreeText returns [EObject current=null] : ( (lv_name_0_0= RULE_TEXT ) ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:232:28: ( ( (lv_name_0_0= RULE_TEXT ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:233:1: ( (lv_name_0_0= RULE_TEXT ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:233:1: ( (lv_name_0_0= RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:234:1: (lv_name_0_0= RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:234:1: (lv_name_0_0= RULE_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:235:3: lv_name_0_0= RULE_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleFreeText460); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TEXT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleAsA"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:259:1: entryRuleAsA returns [EObject current=null] : iv_ruleAsA= ruleAsA EOF ;
    public final EObject entryRuleAsA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsA = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:260:2: (iv_ruleAsA= ruleAsA EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:261:2: iv_ruleAsA= ruleAsA EOF
            {
             newCompositeNode(grammarAccess.getAsARule()); 
            pushFollow(FOLLOW_ruleAsA_in_entryRuleAsA500);
            iv_ruleAsA=ruleAsA();

            state._fsp--;

             current =iv_ruleAsA; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsA510); 

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
    // $ANTLR end "entryRuleAsA"


    // $ANTLR start "ruleAsA"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:268:1: ruleAsA returns [EObject current=null] : ( (lv_name_0_0= RULE_AS_A ) ) ;
    public final EObject ruleAsA() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:271:28: ( ( (lv_name_0_0= RULE_AS_A ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:272:1: ( (lv_name_0_0= RULE_AS_A ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:272:1: ( (lv_name_0_0= RULE_AS_A ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:273:1: (lv_name_0_0= RULE_AS_A )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:273:1: (lv_name_0_0= RULE_AS_A )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:274:3: lv_name_0_0= RULE_AS_A
            {
            lv_name_0_0=(Token)match(input,RULE_AS_A,FOLLOW_RULE_AS_A_in_ruleAsA551); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAsARule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"AS_A");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsA"


    // $ANTLR start "entryRuleInOrderTo"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:298:1: entryRuleInOrderTo returns [EObject current=null] : iv_ruleInOrderTo= ruleInOrderTo EOF ;
    public final EObject entryRuleInOrderTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOrderTo = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:299:2: (iv_ruleInOrderTo= ruleInOrderTo EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:300:2: iv_ruleInOrderTo= ruleInOrderTo EOF
            {
             newCompositeNode(grammarAccess.getInOrderToRule()); 
            pushFollow(FOLLOW_ruleInOrderTo_in_entryRuleInOrderTo591);
            iv_ruleInOrderTo=ruleInOrderTo();

            state._fsp--;

             current =iv_ruleInOrderTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOrderTo601); 

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
    // $ANTLR end "entryRuleInOrderTo"


    // $ANTLR start "ruleInOrderTo"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:307:1: ruleInOrderTo returns [EObject current=null] : ( (lv_name_0_0= RULE_IN_ORDER_TO ) ) ;
    public final EObject ruleInOrderTo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:310:28: ( ( (lv_name_0_0= RULE_IN_ORDER_TO ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:311:1: ( (lv_name_0_0= RULE_IN_ORDER_TO ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:311:1: ( (lv_name_0_0= RULE_IN_ORDER_TO ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:312:1: (lv_name_0_0= RULE_IN_ORDER_TO )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:312:1: (lv_name_0_0= RULE_IN_ORDER_TO )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:313:3: lv_name_0_0= RULE_IN_ORDER_TO
            {
            lv_name_0_0=(Token)match(input,RULE_IN_ORDER_TO,FOLLOW_RULE_IN_ORDER_TO_in_ruleInOrderTo642); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInOrderToRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"IN_ORDER_TO");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInOrderTo"


    // $ANTLR start "entryRuleIWantTo"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:337:1: entryRuleIWantTo returns [EObject current=null] : iv_ruleIWantTo= ruleIWantTo EOF ;
    public final EObject entryRuleIWantTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIWantTo = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:338:2: (iv_ruleIWantTo= ruleIWantTo EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:339:2: iv_ruleIWantTo= ruleIWantTo EOF
            {
             newCompositeNode(grammarAccess.getIWantToRule()); 
            pushFollow(FOLLOW_ruleIWantTo_in_entryRuleIWantTo682);
            iv_ruleIWantTo=ruleIWantTo();

            state._fsp--;

             current =iv_ruleIWantTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIWantTo692); 

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
    // $ANTLR end "entryRuleIWantTo"


    // $ANTLR start "ruleIWantTo"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:346:1: ruleIWantTo returns [EObject current=null] : ( (lv_name_0_0= RULE_I_WANT_TO ) ) ;
    public final EObject ruleIWantTo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:349:28: ( ( (lv_name_0_0= RULE_I_WANT_TO ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:350:1: ( (lv_name_0_0= RULE_I_WANT_TO ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:350:1: ( (lv_name_0_0= RULE_I_WANT_TO ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:351:1: (lv_name_0_0= RULE_I_WANT_TO )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:351:1: (lv_name_0_0= RULE_I_WANT_TO )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:352:3: lv_name_0_0= RULE_I_WANT_TO
            {
            lv_name_0_0=(Token)match(input,RULE_I_WANT_TO,FOLLOW_RULE_I_WANT_TO_in_ruleIWantTo733); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIWantToRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"I_WANT_TO");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIWantTo"


    // $ANTLR start "entryRuleAbstractScenario"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:376:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:377:2: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:378:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
            {
             newCompositeNode(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_ruleAbstractScenario_in_entryRuleAbstractScenario773);
            iv_ruleAbstractScenario=ruleAbstractScenario();

            state._fsp--;

             current =iv_ruleAbstractScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractScenario783); 

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
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:385:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_ScenarioWithOutline_2 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:388:28: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:389:1: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:389:1: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:390:5: this_Background_0= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleAbstractScenario830);
                    this_Background_0=ruleBackground();

                    state._fsp--;

                     
                            current = this_Background_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:400:5: this_Scenario_1= ruleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScenario_in_ruleAbstractScenario857);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;

                     
                            current = this_Scenario_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:410:5: this_ScenarioWithOutline_2= ruleScenarioWithOutline
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleScenarioWithOutline_in_ruleAbstractScenario884);
                    this_ScenarioWithOutline_2=ruleScenarioWithOutline();

                    state._fsp--;

                     
                            current = this_ScenarioWithOutline_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleScenario"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:426:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:427:2: (iv_ruleScenario= ruleScenario EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:428:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario919);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario929); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:435:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:438:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TAG) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:440:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:440:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:441:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleScenario971); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScenarioRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:457:3: ( (lv_name_1_0= RULE_SCENARIO_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:458:1: (lv_name_1_0= RULE_SCENARIO_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:458:1: (lv_name_1_0= RULE_SCENARIO_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:459:3: lv_name_1_0= RULE_SCENARIO_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario994); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SCENARIO_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:475:2: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_TEXT && LA8_0<=RULE_I_WANT_TO)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:476:1: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:476:1: (lv_elements_2_0= ruleNarrativeElement )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:477:3: lv_elements_2_0= ruleNarrativeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNarrativeElement_in_ruleScenario1020);
            	    lv_elements_2_0=ruleNarrativeElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"NarrativeElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:493:3: ( (lv_steps_3_0= ruleStep ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:494:1: (lv_steps_3_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:494:1: (lv_steps_3_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:495:3: lv_steps_3_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario1042);
            	    lv_steps_3_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_3_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioWithOutline"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:519:1: entryRuleScenarioWithOutline returns [EObject current=null] : iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF ;
    public final EObject entryRuleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioWithOutline = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:520:2: (iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:521:2: iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioWithOutlineRule()); 
            pushFollow(FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline1079);
            iv_ruleScenarioWithOutline=ruleScenarioWithOutline();

            state._fsp--;

             current =iv_ruleScenarioWithOutline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioWithOutline1089); 

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
    // $ANTLR end "entryRuleScenarioWithOutline"


    // $ANTLR start "ruleScenarioWithOutline"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:528:1: ruleScenarioWithOutline returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) ) ;
    public final EObject ruleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_example_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:531:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TAG) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:533:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:533:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:534:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleScenarioWithOutline1131); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScenarioWithOutlineRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:550:3: ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:551:1: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:551:1: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:552:3: lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_ruleScenarioWithOutline1154); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioWithOutlineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SCENARIO_OUTLINE_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:568:2: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_TEXT && LA11_0<=RULE_I_WANT_TO)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:569:1: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:569:1: (lv_elements_2_0= ruleNarrativeElement )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:570:3: lv_elements_2_0= ruleNarrativeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNarrativeElement_in_ruleScenarioWithOutline1180);
            	    lv_elements_2_0=ruleNarrativeElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"NarrativeElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:586:3: ( (lv_steps_3_0= ruleStep ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG||(LA12_0>=RULE_WHEN_TEXT && LA12_0<=RULE_AND_TEXT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:587:1: (lv_steps_3_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:587:1: (lv_steps_3_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:588:3: lv_steps_3_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenarioWithOutline1202);
            	    lv_steps_3_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_3_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:604:3: ( (lv_example_4_0= ruleExample ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:605:1: (lv_example_4_0= ruleExample )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:605:1: (lv_example_4_0= ruleExample )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:606:3: lv_example_4_0= ruleExample
            {
             
            	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getExampleExampleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExample_in_ruleScenarioWithOutline1224);
            lv_example_4_0=ruleExample();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	        }
                   		set(
                   			current, 
                   			"example",
                    		lv_example_4_0, 
                    		"Example");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioWithOutline"


    // $ANTLR start "entryRuleExample"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:630:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:631:2: (iv_ruleExample= ruleExample EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:632:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_ruleExample_in_entryRuleExample1260);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExample1270); 

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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:639:1: ruleExample returns [EObject current=null] : (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_HEADING_0=null;
        EObject lv_heading_1_0 = null;

        EObject lv_rows_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:642:28: ( (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:643:1: (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:643:1: (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:643:2: this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )*
            {
            this_EXAMPLE_HEADING_0=(Token)match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_ruleExample1306); 
             
                newLeafNode(this_EXAMPLE_HEADING_0, grammarAccess.getExampleAccess().getEXAMPLE_HEADINGTerminalRuleCall_0()); 
                
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:647:1: ( (lv_heading_1_0= ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:648:1: (lv_heading_1_0= ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:648:1: (lv_heading_1_0= ruleExampleRow )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:649:3: lv_heading_1_0= ruleExampleRow
            {
             
            	        newCompositeNode(grammarAccess.getExampleAccess().getHeadingExampleRowParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExampleRow_in_ruleExample1326);
            lv_heading_1_0=ruleExampleRow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExampleRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"ExampleRow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:665:2: ( (lv_rows_2_0= ruleExampleRow ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_EXAMPLE_CELL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:666:1: (lv_rows_2_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:666:1: (lv_rows_2_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:667:3: lv_rows_2_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExampleAccess().getRowsExampleRowParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleExample1347);
            	    lv_rows_2_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_2_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleExampleRow"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:691:1: entryRuleExampleRow returns [EObject current=null] : iv_ruleExampleRow= ruleExampleRow EOF ;
    public final EObject entryRuleExampleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleRow = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:692:2: (iv_ruleExampleRow= ruleExampleRow EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:693:2: iv_ruleExampleRow= ruleExampleRow EOF
            {
             newCompositeNode(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_ruleExampleRow_in_entryRuleExampleRow1384);
            iv_ruleExampleRow=ruleExampleRow();

            state._fsp--;

             current =iv_ruleExampleRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleRow1394); 

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
    // $ANTLR end "entryRuleExampleRow"


    // $ANTLR start "ruleExampleRow"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:700:1: ruleExampleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) ;
    public final EObject ruleExampleRow() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:703:28: ( ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:704:1: ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:704:1: ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:704:2: ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:704:2: ( (lv_cells_0_0= ruleExampleCell ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EXAMPLE_CELL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:705:1: (lv_cells_0_0= ruleExampleCell )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:705:1: (lv_cells_0_0= ruleExampleCell )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:706:3: lv_cells_0_0= ruleExampleCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleCell_in_ruleExampleRow1440);
            	    lv_cells_0_0=ruleExampleCell();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExampleRowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_0_0, 
            	            		"ExampleCell");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            this_EXAMPLE_ROW_END_1=(Token)match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow1452); 
             
                newLeafNode(this_EXAMPLE_ROW_END_1, grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExampleRow"


    // $ANTLR start "entryRuleExampleCell"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:734:1: entryRuleExampleCell returns [EObject current=null] : iv_ruleExampleCell= ruleExampleCell EOF ;
    public final EObject entryRuleExampleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleCell = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:735:2: (iv_ruleExampleCell= ruleExampleCell EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:736:2: iv_ruleExampleCell= ruleExampleCell EOF
            {
             newCompositeNode(grammarAccess.getExampleCellRule()); 
            pushFollow(FOLLOW_ruleExampleCell_in_entryRuleExampleCell1487);
            iv_ruleExampleCell=ruleExampleCell();

            state._fsp--;

             current =iv_ruleExampleCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleCell1497); 

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
    // $ANTLR end "entryRuleExampleCell"


    // $ANTLR start "ruleExampleCell"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:743:1: ruleExampleCell returns [EObject current=null] : ( (lv_value_0_0= RULE_EXAMPLE_CELL ) ) ;
    public final EObject ruleExampleCell() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:746:28: ( ( (lv_value_0_0= RULE_EXAMPLE_CELL ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:1: ( (lv_value_0_0= RULE_EXAMPLE_CELL ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:1: ( (lv_value_0_0= RULE_EXAMPLE_CELL ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:748:1: (lv_value_0_0= RULE_EXAMPLE_CELL )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:748:1: (lv_value_0_0= RULE_EXAMPLE_CELL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:749:3: lv_value_0_0= RULE_EXAMPLE_CELL
            {
            lv_value_0_0=(Token)match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_ruleExampleCell1538); 

            			newLeafNode(lv_value_0_0, grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExampleCellRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EXAMPLE_CELL");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExampleCell"


    // $ANTLR start "entryRuleBackground"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:773:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:774:2: (iv_ruleBackground= ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:775:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground1578);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground1588); 

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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:782:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_steps_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:785:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:786:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:786:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:786:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:786:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TAG) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:787:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:787:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:788:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleBackground1630); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBackgroundRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:804:3: ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:805:1: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:805:1: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:806:3: lv_name_1_0= RULE_BACKGROUND_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground1653); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBackgroundRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"BACKGROUND_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:822:2: ( (lv_steps_2_0= ruleStep ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:823:1: (lv_steps_2_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:823:1: (lv_steps_2_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:824:3: lv_steps_2_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleBackground1679);
            	    lv_steps_2_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_2_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:848:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:849:2: (iv_ruleStep= ruleStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:850:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1716);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1726); 

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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:857:1: ruleStep returns [EObject current=null] : (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_WhenStep_0 = null;

        EObject this_ThenStep_1 = null;

        EObject this_GivenStep_2 = null;

        EObject this_AndStep_3 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:860:28: ( (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:861:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:861:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:862:5: this_WhenStep_0= ruleWhenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWhenStep_in_ruleStep1773);
                    this_WhenStep_0=ruleWhenStep();

                    state._fsp--;

                     
                            current = this_WhenStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:872:5: this_ThenStep_1= ruleThenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleThenStep_in_ruleStep1800);
                    this_ThenStep_1=ruleThenStep();

                    state._fsp--;

                     
                            current = this_ThenStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:882:5: this_GivenStep_2= ruleGivenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGivenStep_in_ruleStep1827);
                    this_GivenStep_2=ruleGivenStep();

                    state._fsp--;

                     
                            current = this_GivenStep_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:892:5: this_AndStep_3= ruleAndStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAndStep_in_ruleStep1854);
                    this_AndStep_3=ruleAndStep();

                    state._fsp--;

                     
                            current = this_AndStep_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleWhenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:908:1: entryRuleWhenStep returns [EObject current=null] : iv_ruleWhenStep= ruleWhenStep EOF ;
    public final EObject entryRuleWhenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:909:2: (iv_ruleWhenStep= ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:910:2: iv_ruleWhenStep= ruleWhenStep EOF
            {
             newCompositeNode(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_ruleWhenStep_in_entryRuleWhenStep1889);
            iv_ruleWhenStep=ruleWhenStep();

            state._fsp--;

             current =iv_ruleWhenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenStep1899); 

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
    // $ANTLR end "entryRuleWhenStep"


    // $ANTLR start "ruleWhenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:917:1: ruleWhenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) ;
    public final EObject ruleWhenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;

        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:920:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:921:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:921:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:921:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:921:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_TAG) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:922:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:922:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:923:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleWhenStep1941); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWhenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:939:3: ( (lv_desc_1_0= RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:940:1: (lv_desc_1_0= RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:940:1: (lv_desc_1_0= RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:941:3: lv_desc_1_0= RULE_WHEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_ruleWhenStep1964); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWhenStepRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"WHEN_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:2: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TEXT||LA19_0==RULE_CODE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:958:1: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:958:1: (lv_desc_2_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:959:3: lv_desc_2_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleWhenStep1990);
            	    lv_desc_2_0=ruleOptionalText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"OptionalText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:975:3: ( (lv_rows_3_0= ruleExampleRow ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EXAMPLE_CELL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:976:1: (lv_rows_3_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:976:1: (lv_rows_3_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:977:3: lv_rows_3_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleWhenStep2012);
            	    lv_rows_3_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_3_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenStep"


    // $ANTLR start "entryRuleThenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1001:1: entryRuleThenStep returns [EObject current=null] : iv_ruleThenStep= ruleThenStep EOF ;
    public final EObject entryRuleThenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1002:2: (iv_ruleThenStep= ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1003:2: iv_ruleThenStep= ruleThenStep EOF
            {
             newCompositeNode(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_ruleThenStep_in_entryRuleThenStep2049);
            iv_ruleThenStep=ruleThenStep();

            state._fsp--;

             current =iv_ruleThenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenStep2059); 

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
    // $ANTLR end "entryRuleThenStep"


    // $ANTLR start "ruleThenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1010:1: ruleThenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) ;
    public final EObject ruleThenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;

        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1013:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1014:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1014:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1014:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1014:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TAG) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1015:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1015:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1016:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleThenStep2101); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getThenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:3: ( (lv_desc_1_0= RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1033:1: (lv_desc_1_0= RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1033:1: (lv_desc_1_0= RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1034:3: lv_desc_1_0= RULE_THEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_ruleThenStep2124); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThenStepRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"THEN_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1050:2: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TEXT||LA22_0==RULE_CODE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1051:1: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1051:1: (lv_desc_2_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1052:3: lv_desc_2_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleThenStep2150);
            	    lv_desc_2_0=ruleOptionalText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getThenStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"OptionalText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1068:3: ( (lv_rows_3_0= ruleExampleRow ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EXAMPLE_CELL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1069:1: (lv_rows_3_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1069:1: (lv_rows_3_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1070:3: lv_rows_3_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleThenStep2172);
            	    lv_rows_3_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getThenStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_3_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThenStep"


    // $ANTLR start "entryRuleGivenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1094:1: entryRuleGivenStep returns [EObject current=null] : iv_ruleGivenStep= ruleGivenStep EOF ;
    public final EObject entryRuleGivenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1095:2: (iv_ruleGivenStep= ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1096:2: iv_ruleGivenStep= ruleGivenStep EOF
            {
             newCompositeNode(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_ruleGivenStep_in_entryRuleGivenStep2209);
            iv_ruleGivenStep=ruleGivenStep();

            state._fsp--;

             current =iv_ruleGivenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGivenStep2219); 

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
    // $ANTLR end "entryRuleGivenStep"


    // $ANTLR start "ruleGivenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1103:1: ruleGivenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) ;
    public final EObject ruleGivenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;

        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1106:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_TAG) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1108:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1108:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1109:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleGivenStep2261); 

            	    			newLeafNode(lv_tags_0_0, grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGivenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"TAG");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1125:3: ( (lv_desc_1_0= RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1126:1: (lv_desc_1_0= RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1126:1: (lv_desc_1_0= RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1127:3: lv_desc_1_0= RULE_GIVEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_ruleGivenStep2284); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGivenStepRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"GIVEN_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1143:2: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TEXT||LA25_0==RULE_CODE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1144:1: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1144:1: (lv_desc_2_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1145:3: lv_desc_2_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleGivenStep2310);
            	    lv_desc_2_0=ruleOptionalText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGivenStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"OptionalText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1161:3: ( (lv_rows_3_0= ruleExampleRow ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_EXAMPLE_CELL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1162:1: (lv_rows_3_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1162:1: (lv_rows_3_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1163:3: lv_rows_3_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleGivenStep2332);
            	    lv_rows_3_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGivenStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_3_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivenStep"


    // $ANTLR start "entryRuleAndStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1187:1: entryRuleAndStep returns [EObject current=null] : iv_ruleAndStep= ruleAndStep EOF ;
    public final EObject entryRuleAndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1188:2: (iv_ruleAndStep= ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1189:2: iv_ruleAndStep= ruleAndStep EOF
            {
             newCompositeNode(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_ruleAndStep_in_entryRuleAndStep2369);
            iv_ruleAndStep=ruleAndStep();

            state._fsp--;

             current =iv_ruleAndStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndStep2379); 

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
    // $ANTLR end "entryRuleAndStep"


    // $ANTLR start "ruleAndStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1196:1: ruleAndStep returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* ) ;
    public final EObject ruleAndStep() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        AntlrDatatypeRuleToken lv_desc_1_0 = null;

        EObject lv_rows_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1199:28: ( ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1200:1: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1200:1: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1200:2: ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1200:2: ( (lv_desc_0_0= RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1201:1: (lv_desc_0_0= RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1201:1: (lv_desc_0_0= RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1202:3: lv_desc_0_0= RULE_AND_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_ruleAndStep2421); 

            			newLeafNode(lv_desc_0_0, grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndStepRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_0_0, 
                    		"AND_TEXT");
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1218:2: ( (lv_desc_1_0= ruleOptionalText ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_TEXT||LA27_0==RULE_CODE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1219:1: (lv_desc_1_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1219:1: (lv_desc_1_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1220:3: lv_desc_1_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleAndStep2447);
            	    lv_desc_1_0=ruleOptionalText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"desc",
            	            		lv_desc_1_0, 
            	            		"OptionalText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1236:3: ( (lv_rows_2_0= ruleExampleRow ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EXAMPLE_CELL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1237:1: (lv_rows_2_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1237:1: (lv_rows_2_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1238:3: lv_rows_2_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleAndStep2469);
            	    lv_rows_2_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_2_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndStep"


    // $ANTLR start "entryRuleOptionalText"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1262:1: entryRuleOptionalText returns [String current=null] : iv_ruleOptionalText= ruleOptionalText EOF ;
    public final String entryRuleOptionalText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptionalText = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1263:2: (iv_ruleOptionalText= ruleOptionalText EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1264:2: iv_ruleOptionalText= ruleOptionalText EOF
            {
             newCompositeNode(grammarAccess.getOptionalTextRule()); 
            pushFollow(FOLLOW_ruleOptionalText_in_entryRuleOptionalText2507);
            iv_ruleOptionalText=ruleOptionalText();

            state._fsp--;

             current =iv_ruleOptionalText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalText2518); 

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
    // $ANTLR end "entryRuleOptionalText"


    // $ANTLR start "ruleOptionalText"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1271:1: ruleOptionalText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE ) ;
    public final AntlrDatatypeRuleToken ruleOptionalText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TEXT_0=null;
        Token this_CODE_1=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1274:28: ( (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1275:1: (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1275:1: (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_TEXT) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_CODE) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1275:6: this_TEXT_0= RULE_TEXT
                    {
                    this_TEXT_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleOptionalText2558); 

                    		current.merge(this_TEXT_0);
                        
                     
                        newLeafNode(this_TEXT_0, grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1283:10: this_CODE_1= RULE_CODE
                    {
                    this_CODE_1=(Token)match(input,RULE_CODE,FOLLOW_RULE_CODE_in_ruleOptionalText2584); 

                    		current.merge(this_CODE_1);
                        
                     
                        newLeafNode(this_CODE_1, grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalText"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA6_eotS =
        "\5\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\2\4\3\uffff";
    static final String DFA6_maxS =
        "\2\17\3\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\5\uffff\1\3\1\4\3\uffff\1\2",
            "\1\1\5\uffff\1\3\1\4\3\uffff\1\2",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "389:1: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )";
        }
    }
    static final String DFA9_eotS =
        "\4\uffff";
    static final String DFA9_eofS =
        "\1\1\3\uffff";
    static final String DFA9_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA9_maxS =
        "\1\23\1\uffff\1\22\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA9_specialS =
        "\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\4\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\3\3",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()+ loopback of 493:3: ( (lv_steps_3_0= ruleStep ) )+";
        }
    }
    static final String DFA16_eotS =
        "\4\uffff";
    static final String DFA16_eofS =
        "\1\1\3\uffff";
    static final String DFA16_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA16_maxS =
        "\1\23\1\uffff\1\22\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA16_specialS =
        "\4\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\4\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\3\3",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 822:2: ( (lv_steps_2_0= ruleStep ) )*";
        }
    }
    static final String DFA17_eotS =
        "\6\uffff";
    static final String DFA17_eofS =
        "\6\uffff";
    static final String DFA17_minS =
        "\2\4\4\uffff";
    static final String DFA17_maxS =
        "\1\23\1\22\4\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4";
    static final String DFA17_specialS =
        "\6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\13\uffff\1\2\1\3\1\4\1\5",
            "\1\1\13\uffff\1\2\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "861:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleFeature127 = new BitSet(new long[]{0x0000000000008FF2L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_ruleFeature150 = new BitSet(new long[]{0x0000000000008FD2L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_ruleFeature177 = new BitSet(new long[]{0x0000000000008FD2L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_ruleFeature199 = new BitSet(new long[]{0x0000000000008C12L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_entryRuleNarrativeElement236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNarrativeElement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_ruleNarrativeElement293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_ruleNarrativeElement320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_ruleNarrativeElement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_ruleNarrativeElement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_entryRuleFreeText409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeText419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleFreeText460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_entryRuleAsA500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsA510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_A_in_ruleAsA551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_entryRuleInOrderTo591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOrderTo601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_ORDER_TO_in_ruleInOrderTo642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_entryRuleIWantTo682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIWantTo692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_WANT_TO_in_ruleIWantTo733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_entryRuleAbstractScenario773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractScenario783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleAbstractScenario830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleAbstractScenario857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_ruleAbstractScenario884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleScenario971 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario994 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_ruleScenario1020 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario1042 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioWithOutline1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleScenarioWithOutline1131 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_ruleScenarioWithOutline1154 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_ruleScenarioWithOutline1180 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenarioWithOutline1202 = new BitSet(new long[]{0x00000000000F13D0L});
    public static final BitSet FOLLOW_ruleExample_in_ruleScenarioWithOutline1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_entryRuleExample1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExample1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_ruleExample1306 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleExample1326 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleExample1347 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_entryRuleExampleRow1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleRow1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_ruleExampleRow1440 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_entryRuleExampleCell1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleCell1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_ruleExampleCell1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleBackground1630 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground1653 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_ruleStep_in_ruleBackground1679 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_ruleStep1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_ruleStep1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_ruleStep1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_ruleStep1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_entryRuleWhenStep1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenStep1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleWhenStep1941 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_ruleWhenStep1964 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleWhenStep1990 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleWhenStep2012 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleThenStep_in_entryRuleThenStep2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenStep2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleThenStep2101 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_ruleThenStep2124 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleThenStep2150 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleThenStep2172 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_entryRuleGivenStep2209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGivenStep2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleGivenStep2261 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_ruleGivenStep2284 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleGivenStep2310 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleGivenStep2332 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAndStep_in_entryRuleAndStep2369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndStep2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleAndStep2421 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleAndStep2447 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleAndStep2469 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_entryRuleOptionalText2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalText2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleOptionalText2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_ruleOptionalText2584 = new BitSet(new long[]{0x0000000000000002L});

}