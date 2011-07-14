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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:76:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_scenarios_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:79:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:80:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )*
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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:98:3: ( (lv_name_1_0= RULE_FEATURE_TEXT ) )
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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:116:2: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_TEXT && LA2_0<=RULE_I_WANT_TO)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:117:1: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:117:1: (lv_elements_2_0= ruleNarrativeElement )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:118:3: lv_elements_2_0= ruleNarrativeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNarrativeElement_in_ruleFeature176);
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
            	    break loop2;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:134:3: ( (lv_scenarios_3_0= ruleAbstractScenario ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TAG||(LA3_0>=RULE_SCENARIO_TEXT && LA3_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA3_0==RULE_BACKGROUND_TEXT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:135:1: (lv_scenarios_3_0= ruleAbstractScenario )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:135:1: (lv_scenarios_3_0= ruleAbstractScenario )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:136:3: lv_scenarios_3_0= ruleAbstractScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractScenario_in_ruleFeature198);
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
            	    break loop3;
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
            pushFollow(FOLLOW_ruleNarrativeElement_in_entryRuleNarrativeElement235);
            iv_ruleNarrativeElement=ruleNarrativeElement();

            state._fsp--;

             current =iv_ruleNarrativeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNarrativeElement245); 

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
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_IN_ORDER_TO:
                {
                alt4=1;
                }
                break;
            case RULE_AS_A:
                {
                alt4=2;
                }
                break;
            case RULE_I_WANT_TO:
                {
                alt4=3;
                }
                break;
            case RULE_TEXT:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:174:5: this_InOrderTo_0= ruleInOrderTo
                    {
                     
                            newCompositeNode(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInOrderTo_in_ruleNarrativeElement292);
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
                        
                    pushFollow(FOLLOW_ruleAsA_in_ruleNarrativeElement319);
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
                        
                    pushFollow(FOLLOW_ruleIWantTo_in_ruleNarrativeElement346);
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
                        
                    pushFollow(FOLLOW_ruleFreeText_in_ruleNarrativeElement373);
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
            pushFollow(FOLLOW_ruleFreeText_in_entryRuleFreeText408);
            iv_ruleFreeText=ruleFreeText();

            state._fsp--;

             current =iv_ruleFreeText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeText418); 

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
            lv_name_0_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleFreeText459); 

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
            pushFollow(FOLLOW_ruleAsA_in_entryRuleAsA499);
            iv_ruleAsA=ruleAsA();

            state._fsp--;

             current =iv_ruleAsA; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsA509); 

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
            lv_name_0_0=(Token)match(input,RULE_AS_A,FOLLOW_RULE_AS_A_in_ruleAsA550); 

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
            pushFollow(FOLLOW_ruleInOrderTo_in_entryRuleInOrderTo590);
            iv_ruleInOrderTo=ruleInOrderTo();

            state._fsp--;

             current =iv_ruleInOrderTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOrderTo600); 

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
            lv_name_0_0=(Token)match(input,RULE_IN_ORDER_TO,FOLLOW_RULE_IN_ORDER_TO_in_ruleInOrderTo641); 

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
            pushFollow(FOLLOW_ruleIWantTo_in_entryRuleIWantTo681);
            iv_ruleIWantTo=ruleIWantTo();

            state._fsp--;

             current =iv_ruleIWantTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIWantTo691); 

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
            lv_name_0_0=(Token)match(input,RULE_I_WANT_TO,FOLLOW_RULE_I_WANT_TO_in_ruleIWantTo732); 

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
            pushFollow(FOLLOW_ruleAbstractScenario_in_entryRuleAbstractScenario772);
            iv_ruleAbstractScenario=ruleAbstractScenario();

            state._fsp--;

             current =iv_ruleAbstractScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractScenario782); 

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
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:390:5: this_Background_0= ruleBackground
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBackground_in_ruleAbstractScenario829);
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
                        
                    pushFollow(FOLLOW_ruleScenario_in_ruleAbstractScenario856);
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
                        
                    pushFollow(FOLLOW_ruleScenarioWithOutline_in_ruleAbstractScenario883);
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
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario918);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario928); 

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
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TAG) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:440:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:440:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:441:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleScenario970); 

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
            	    break loop6;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:457:3: ( (lv_name_1_0= RULE_SCENARIO_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:458:1: (lv_name_1_0= RULE_SCENARIO_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:458:1: (lv_name_1_0= RULE_SCENARIO_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:459:3: lv_name_1_0= RULE_SCENARIO_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario993); 

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
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_TEXT && LA7_0<=RULE_I_WANT_TO)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:476:1: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:476:1: (lv_elements_2_0= ruleNarrativeElement )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:477:3: lv_elements_2_0= ruleNarrativeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNarrativeElement_in_ruleScenario1019);
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
            	    break loop7;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:493:3: ( (lv_steps_3_0= ruleStep ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:494:1: (lv_steps_3_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:494:1: (lv_steps_3_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:495:3: lv_steps_3_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario1041);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            pushFollow(FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline1078);
            iv_ruleScenarioWithOutline=ruleScenarioWithOutline();

            state._fsp--;

             current =iv_ruleScenarioWithOutline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioWithOutline1088); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:528:1: ruleScenarioWithOutline returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ this_EXAMPLE_HEADING_4= RULE_EXAMPLE_HEADING ( (lv_heading_5_0= ruleExampleRow ) ) ( (lv_rows_6_0= ruleExampleRow ) )* ) ;
    public final EObject ruleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        Token this_EXAMPLE_HEADING_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_heading_5_0 = null;

        EObject lv_rows_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:531:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ this_EXAMPLE_HEADING_4= RULE_EXAMPLE_HEADING ( (lv_heading_5_0= ruleExampleRow ) ) ( (lv_rows_6_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ this_EXAMPLE_HEADING_4= RULE_EXAMPLE_HEADING ( (lv_heading_5_0= ruleExampleRow ) ) ( (lv_rows_6_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ this_EXAMPLE_HEADING_4= RULE_EXAMPLE_HEADING ( (lv_heading_5_0= ruleExampleRow ) ) ( (lv_rows_6_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ this_EXAMPLE_HEADING_4= RULE_EXAMPLE_HEADING ( (lv_heading_5_0= ruleExampleRow ) ) ( (lv_rows_6_0= ruleExampleRow ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TAG) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:533:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:533:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:534:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleScenarioWithOutline1130); 

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
            	    break loop9;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:550:3: ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:551:1: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:551:1: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:552:3: lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_ruleScenarioWithOutline1153); 

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
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_TEXT && LA10_0<=RULE_I_WANT_TO)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:569:1: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:569:1: (lv_elements_2_0= ruleNarrativeElement )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:570:3: lv_elements_2_0= ruleNarrativeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNarrativeElement_in_ruleScenarioWithOutline1179);
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
            	    break loop10;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:586:3: ( (lv_steps_3_0= ruleStep ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAG||(LA11_0>=RULE_WHEN_TEXT && LA11_0<=RULE_AND_TEXT)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:587:1: (lv_steps_3_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:587:1: (lv_steps_3_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:588:3: lv_steps_3_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenarioWithOutline1201);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            this_EXAMPLE_HEADING_4=(Token)match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_ruleScenarioWithOutline1213); 
             
                newLeafNode(this_EXAMPLE_HEADING_4, grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_4()); 
                
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:608:1: ( (lv_heading_5_0= ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:609:1: (lv_heading_5_0= ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:609:1: (lv_heading_5_0= ruleExampleRow )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:610:3: lv_heading_5_0= ruleExampleRow
            {
             
            	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1233);
            lv_heading_5_0=ruleExampleRow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_5_0, 
                    		"ExampleRow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:626:2: ( (lv_rows_6_0= ruleExampleRow ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EXAMPLE_CELL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:627:1: (lv_rows_6_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:627:1: (lv_rows_6_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:628:3: lv_rows_6_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1254);
            	    lv_rows_6_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_6_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleScenarioWithOutline"


    // $ANTLR start "entryRuleExampleRow"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:652:1: entryRuleExampleRow returns [EObject current=null] : iv_ruleExampleRow= ruleExampleRow EOF ;
    public final EObject entryRuleExampleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleRow = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:653:2: (iv_ruleExampleRow= ruleExampleRow EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:654:2: iv_ruleExampleRow= ruleExampleRow EOF
            {
             newCompositeNode(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_ruleExampleRow_in_entryRuleExampleRow1291);
            iv_ruleExampleRow=ruleExampleRow();

            state._fsp--;

             current =iv_ruleExampleRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleRow1301); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:661:1: ruleExampleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) ;
    public final EObject ruleExampleRow() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:664:28: ( ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:665:1: ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:665:1: ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:665:2: ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:665:2: ( (lv_cells_0_0= ruleExampleCell ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_EXAMPLE_CELL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:666:1: (lv_cells_0_0= ruleExampleCell )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:666:1: (lv_cells_0_0= ruleExampleCell )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:667:3: lv_cells_0_0= ruleExampleCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleCell_in_ruleExampleRow1347);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            this_EXAMPLE_ROW_END_1=(Token)match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow1359); 
             
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:695:1: entryRuleExampleCell returns [EObject current=null] : iv_ruleExampleCell= ruleExampleCell EOF ;
    public final EObject entryRuleExampleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleCell = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:696:2: (iv_ruleExampleCell= ruleExampleCell EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:697:2: iv_ruleExampleCell= ruleExampleCell EOF
            {
             newCompositeNode(grammarAccess.getExampleCellRule()); 
            pushFollow(FOLLOW_ruleExampleCell_in_entryRuleExampleCell1394);
            iv_ruleExampleCell=ruleExampleCell();

            state._fsp--;

             current =iv_ruleExampleCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleCell1404); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:704:1: ruleExampleCell returns [EObject current=null] : ( (lv_value_0_0= RULE_EXAMPLE_CELL ) ) ;
    public final EObject ruleExampleCell() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:707:28: ( ( (lv_value_0_0= RULE_EXAMPLE_CELL ) ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:708:1: ( (lv_value_0_0= RULE_EXAMPLE_CELL ) )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:708:1: ( (lv_value_0_0= RULE_EXAMPLE_CELL ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:709:1: (lv_value_0_0= RULE_EXAMPLE_CELL )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:709:1: (lv_value_0_0= RULE_EXAMPLE_CELL )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:710:3: lv_value_0_0= RULE_EXAMPLE_CELL
            {
            lv_value_0_0=(Token)match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_ruleExampleCell1445); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:734:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:735:2: (iv_ruleBackground= ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:736:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground1485);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground1495); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:743:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_steps_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:746:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TAG) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:748:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:748:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:749:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleBackground1537); 

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
            	    break loop14;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:765:3: ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:766:1: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:766:1: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:767:3: lv_name_1_0= RULE_BACKGROUND_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground1560); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:783:2: ( (lv_steps_2_0= ruleStep ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:784:1: (lv_steps_2_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:784:1: (lv_steps_2_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:785:3: lv_steps_2_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleBackground1586);
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
            	    break loop15;
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:809:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:810:2: (iv_ruleStep= ruleStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:811:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1623);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1633); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:818:1: ruleStep returns [EObject current=null] : (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_WhenStep_0 = null;

        EObject this_ThenStep_1 = null;

        EObject this_GivenStep_2 = null;

        EObject this_AndStep_3 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:821:28: ( (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:822:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:822:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:823:5: this_WhenStep_0= ruleWhenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWhenStep_in_ruleStep1680);
                    this_WhenStep_0=ruleWhenStep();

                    state._fsp--;

                     
                            current = this_WhenStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:833:5: this_ThenStep_1= ruleThenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleThenStep_in_ruleStep1707);
                    this_ThenStep_1=ruleThenStep();

                    state._fsp--;

                     
                            current = this_ThenStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:843:5: this_GivenStep_2= ruleGivenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGivenStep_in_ruleStep1734);
                    this_GivenStep_2=ruleGivenStep();

                    state._fsp--;

                     
                            current = this_GivenStep_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:853:5: this_AndStep_3= ruleAndStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAndStep_in_ruleStep1761);
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:869:1: entryRuleWhenStep returns [EObject current=null] : iv_ruleWhenStep= ruleWhenStep EOF ;
    public final EObject entryRuleWhenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:870:2: (iv_ruleWhenStep= ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:871:2: iv_ruleWhenStep= ruleWhenStep EOF
            {
             newCompositeNode(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_ruleWhenStep_in_entryRuleWhenStep1796);
            iv_ruleWhenStep=ruleWhenStep();

            state._fsp--;

             current =iv_ruleWhenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenStep1806); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:878:1: ruleWhenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ) ;
    public final EObject ruleWhenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:881:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:882:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:882:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:882:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:882:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAG) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:883:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:883:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:884:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleWhenStep1848); 

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
            	    break loop17;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:900:3: ( (lv_desc_1_0= RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:901:1: (lv_desc_1_0= RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:901:1: (lv_desc_1_0= RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:902:3: lv_desc_1_0= RULE_WHEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_ruleWhenStep1871); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:918:2: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_TEXT||LA18_0==RULE_CODE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:919:1: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:919:1: (lv_desc_2_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:920:3: lv_desc_2_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleWhenStep1897);
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
            	    break loop18;
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:944:1: entryRuleThenStep returns [EObject current=null] : iv_ruleThenStep= ruleThenStep EOF ;
    public final EObject entryRuleThenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:945:2: (iv_ruleThenStep= ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:946:2: iv_ruleThenStep= ruleThenStep EOF
            {
             newCompositeNode(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_ruleThenStep_in_entryRuleThenStep1934);
            iv_ruleThenStep=ruleThenStep();

            state._fsp--;

             current =iv_ruleThenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenStep1944); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:953:1: ruleThenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ) ;
    public final EObject ruleThenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:956:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TAG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:958:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:958:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:959:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleThenStep1986); 

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
            	    break loop19;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:975:3: ( (lv_desc_1_0= RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:976:1: (lv_desc_1_0= RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:976:1: (lv_desc_1_0= RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:977:3: lv_desc_1_0= RULE_THEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_ruleThenStep2009); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:993:2: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_TEXT||LA20_0==RULE_CODE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:994:1: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:994:1: (lv_desc_2_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:995:3: lv_desc_2_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleThenStep2035);
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
    // $ANTLR end "ruleThenStep"


    // $ANTLR start "entryRuleGivenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1019:1: entryRuleGivenStep returns [EObject current=null] : iv_ruleGivenStep= ruleGivenStep EOF ;
    public final EObject entryRuleGivenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1020:2: (iv_ruleGivenStep= ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1021:2: iv_ruleGivenStep= ruleGivenStep EOF
            {
             newCompositeNode(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_ruleGivenStep_in_entryRuleGivenStep2072);
            iv_ruleGivenStep=ruleGivenStep();

            state._fsp--;

             current =iv_ruleGivenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGivenStep2082); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1028:1: ruleGivenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ) ;
    public final EObject ruleGivenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1031:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TAG) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1033:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1033:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1034:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleGivenStep2124); 

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
            	    break loop21;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1050:3: ( (lv_desc_1_0= RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1051:1: (lv_desc_1_0= RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1051:1: (lv_desc_1_0= RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1052:3: lv_desc_1_0= RULE_GIVEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_ruleGivenStep2147); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1068:2: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TEXT||LA22_0==RULE_CODE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1069:1: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1069:1: (lv_desc_2_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1070:3: lv_desc_2_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleGivenStep2173);
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
            	    break loop22;
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1094:1: entryRuleAndStep returns [EObject current=null] : iv_ruleAndStep= ruleAndStep EOF ;
    public final EObject entryRuleAndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1095:2: (iv_ruleAndStep= ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1096:2: iv_ruleAndStep= ruleAndStep EOF
            {
             newCompositeNode(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_ruleAndStep_in_entryRuleAndStep2210);
            iv_ruleAndStep=ruleAndStep();

            state._fsp--;

             current =iv_ruleAndStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndStep2220); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1103:1: ruleAndStep returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ) ;
    public final EObject ruleAndStep() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        AntlrDatatypeRuleToken lv_desc_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1106:28: ( ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:1: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:1: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:2: ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:2: ( (lv_desc_0_0= RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1108:1: (lv_desc_0_0= RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1108:1: (lv_desc_0_0= RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1109:3: lv_desc_0_0= RULE_AND_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_ruleAndStep2262); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1125:2: ( (lv_desc_1_0= ruleOptionalText ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_TEXT||LA23_0==RULE_CODE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1126:1: (lv_desc_1_0= ruleOptionalText )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1126:1: (lv_desc_1_0= ruleOptionalText )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1127:3: lv_desc_1_0= ruleOptionalText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalText_in_ruleAndStep2288);
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
    // $ANTLR end "ruleAndStep"


    // $ANTLR start "entryRuleOptionalText"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1151:1: entryRuleOptionalText returns [String current=null] : iv_ruleOptionalText= ruleOptionalText EOF ;
    public final String entryRuleOptionalText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptionalText = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1152:2: (iv_ruleOptionalText= ruleOptionalText EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1153:2: iv_ruleOptionalText= ruleOptionalText EOF
            {
             newCompositeNode(grammarAccess.getOptionalTextRule()); 
            pushFollow(FOLLOW_ruleOptionalText_in_entryRuleOptionalText2326);
            iv_ruleOptionalText=ruleOptionalText();

            state._fsp--;

             current =iv_ruleOptionalText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalText2337); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1160:1: ruleOptionalText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE ) ;
    public final AntlrDatatypeRuleToken ruleOptionalText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TEXT_0=null;
        Token this_CODE_1=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1163:28: ( (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1164:1: (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1164:1: (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_TEXT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_CODE) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1164:6: this_TEXT_0= RULE_TEXT
                    {
                    this_TEXT_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleOptionalText2377); 

                    		current.merge(this_TEXT_0);
                        
                     
                        newLeafNode(this_TEXT_0, grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1172:10: this_CODE_1= RULE_CODE
                    {
                    this_CODE_1=(Token)match(input,RULE_CODE,FOLLOW_RULE_CODE_in_ruleOptionalText2403); 

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\2\4\3\uffff";
    static final String DFA5_maxS =
        "\2\17\3\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\5\uffff\1\3\1\4\3\uffff\1\2",
            "\1\1\5\uffff\1\3\1\4\3\uffff\1\2",
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
            return "389:1: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )";
        }
    }
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\1\1\3\uffff";
    static final String DFA8_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA8_maxS =
        "\1\23\1\uffff\1\22\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\4\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\3\3",
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
            return "()+ loopback of 493:3: ( (lv_steps_3_0= ruleStep ) )+";
        }
    }
    static final String DFA15_eotS =
        "\4\uffff";
    static final String DFA15_eofS =
        "\1\1\3\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA15_maxS =
        "\1\23\1\uffff\1\22\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA15_specialS =
        "\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\4\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\3\3",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 783:2: ( (lv_steps_2_0= ruleStep ) )*";
        }
    }
    static final String DFA16_eotS =
        "\6\uffff";
    static final String DFA16_eofS =
        "\6\uffff";
    static final String DFA16_minS =
        "\2\4\4\uffff";
    static final String DFA16_maxS =
        "\1\23\1\22\4\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4";
    static final String DFA16_specialS =
        "\6\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\13\uffff\1\2\1\3\1\4\1\5",
            "\1\1\13\uffff\1\2\1\3\1\4",
            "",
            "",
            "",
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
            return "822:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleFeature127 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_ruleFeature150 = new BitSet(new long[]{0x0000000000008FD2L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_ruleFeature176 = new BitSet(new long[]{0x0000000000008FD2L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_ruleFeature198 = new BitSet(new long[]{0x0000000000008C12L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_entryRuleNarrativeElement235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNarrativeElement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_ruleNarrativeElement292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_ruleNarrativeElement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_ruleNarrativeElement346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_ruleNarrativeElement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_entryRuleFreeText408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeText418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleFreeText459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_entryRuleAsA499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsA509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_A_in_ruleAsA550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_entryRuleInOrderTo590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOrderTo600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_ORDER_TO_in_ruleInOrderTo641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_entryRuleIWantTo681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIWantTo691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_WANT_TO_in_ruleIWantTo732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_entryRuleAbstractScenario772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractScenario782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleAbstractScenario829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleAbstractScenario856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_ruleAbstractScenario883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleScenario970 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario993 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_ruleScenario1019 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario1041 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioWithOutline1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleScenarioWithOutline1130 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_ruleScenarioWithOutline1153 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_ruleScenarioWithOutline1179 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenarioWithOutline1201 = new BitSet(new long[]{0x00000000000F13D0L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_ruleScenarioWithOutline1213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1233 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1254 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_entryRuleExampleRow1291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleRow1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_ruleExampleRow1347 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_entryRuleExampleCell1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleCell1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_ruleExampleCell1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleBackground1537 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground1560 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_ruleStep_in_ruleBackground1586 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_ruleStep1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_ruleStep1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_ruleStep1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_ruleStep1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_entryRuleWhenStep1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenStep1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleWhenStep1848 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_ruleWhenStep1871 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleWhenStep1897 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleThenStep_in_entryRuleThenStep1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenStep1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleThenStep1986 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_ruleThenStep2009 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleThenStep2035 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleGivenStep_in_entryRuleGivenStep2072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGivenStep2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleGivenStep2124 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_ruleGivenStep2147 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleGivenStep2173 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleAndStep_in_entryRuleAndStep2210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndStep2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleAndStep2262 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_ruleAndStep2288 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_ruleOptionalText_in_entryRuleOptionalText2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalText2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleOptionalText2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_ruleOptionalText2403 = new BitSet(new long[]{0x0000000000000002L});

}