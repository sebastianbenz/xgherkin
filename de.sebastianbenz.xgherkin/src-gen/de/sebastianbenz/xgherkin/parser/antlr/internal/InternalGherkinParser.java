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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TAG", "RULE_FEATURE_TEXT", "RULE_TEXT", "RULE_AS_A", "RULE_IN_ORDER_TO", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_EXAMPLE_HEADING", "RULE_EXAMPLE_CELL", "RULE_EXAMPLE_ROW_END", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_CODE", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_AS_A=7;
    public static final int RULE_IN_ORDER_TO=8;
    public static final int RULE_THEN_TEXT=18;
    public static final int RULE_TAG=4;
    public static final int RULE_TEXT=6;
    public static final int RULE_EXAMPLE_HEADING=12;
    public static final int RULE_SL_COMMENT=21;
    public static final int EOF=-1;
    public static final int RULE_CODE=17;
    public static final int RULE_WHEN_TEXT=16;
    public static final int RULE_GIVEN_TEXT=19;
    public static final int RULE_I_WANT_TO=9;
    public static final int RULE_SCENARIO_TEXT=10;
    public static final int RULE_EXAMPLE_ROW_END=14;
    public static final int RULE_BACKGROUND_TEXT=15;
    public static final int RULE_WS=22;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=11;
    public static final int RULE_AND_TEXT=20;
    public static final int RULE_EXAMPLE_CELL=13;
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:435:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_steps_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:438:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:439:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )*
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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:475:2: ( (lv_steps_2_0= ruleStep ) )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:476:1: (lv_steps_2_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:476:1: (lv_steps_2_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:477:3: lv_steps_2_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario1019);
            	    lv_steps_2_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
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
            	    break loop7;
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioWithOutline"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:501:1: entryRuleScenarioWithOutline returns [EObject current=null] : iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF ;
    public final EObject entryRuleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioWithOutline = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:502:2: (iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:503:2: iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioWithOutlineRule()); 
            pushFollow(FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline1056);
            iv_ruleScenarioWithOutline=ruleScenarioWithOutline();

            state._fsp--;

             current =iv_ruleScenarioWithOutline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioWithOutline1066); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:510:1: ruleScenarioWithOutline returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* this_EXAMPLE_HEADING_3= RULE_EXAMPLE_HEADING ( (lv_heading_4_0= ruleExampleRow ) ) ( (lv_rows_5_0= ruleExampleRow ) )* ) ;
    public final EObject ruleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        Token this_EXAMPLE_HEADING_3=null;
        EObject lv_steps_2_0 = null;

        EObject lv_heading_4_0 = null;

        EObject lv_rows_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:513:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* this_EXAMPLE_HEADING_3= RULE_EXAMPLE_HEADING ( (lv_heading_4_0= ruleExampleRow ) ) ( (lv_rows_5_0= ruleExampleRow ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:514:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* this_EXAMPLE_HEADING_3= RULE_EXAMPLE_HEADING ( (lv_heading_4_0= ruleExampleRow ) ) ( (lv_rows_5_0= ruleExampleRow ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:514:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* this_EXAMPLE_HEADING_3= RULE_EXAMPLE_HEADING ( (lv_heading_4_0= ruleExampleRow ) ) ( (lv_rows_5_0= ruleExampleRow ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:514:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* this_EXAMPLE_HEADING_3= RULE_EXAMPLE_HEADING ( (lv_heading_4_0= ruleExampleRow ) ) ( (lv_rows_5_0= ruleExampleRow ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:514:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TAG) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:515:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:515:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:516:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleScenarioWithOutline1108); 

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
            	    break loop8;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:532:3: ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:533:1: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:533:1: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:534:3: lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_ruleScenarioWithOutline1131); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:550:2: ( (lv_steps_2_0= ruleStep ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TAG||LA9_0==RULE_WHEN_TEXT||(LA9_0>=RULE_THEN_TEXT && LA9_0<=RULE_AND_TEXT)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:551:1: (lv_steps_2_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:551:1: (lv_steps_2_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:552:3: lv_steps_2_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenarioWithOutline1157);
            	    lv_steps_2_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
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
            	    break loop9;
                }
            } while (true);

            this_EXAMPLE_HEADING_3=(Token)match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_ruleScenarioWithOutline1169); 
             
                newLeafNode(this_EXAMPLE_HEADING_3, grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_3()); 
                
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:572:1: ( (lv_heading_4_0= ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:573:1: (lv_heading_4_0= ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:573:1: (lv_heading_4_0= ruleExampleRow )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:574:3: lv_heading_4_0= ruleExampleRow
            {
             
            	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1189);
            lv_heading_4_0=ruleExampleRow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_4_0, 
                    		"ExampleRow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:590:2: ( (lv_rows_5_0= ruleExampleRow ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_EXAMPLE_CELL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:591:1: (lv_rows_5_0= ruleExampleRow )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:591:1: (lv_rows_5_0= ruleExampleRow )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:592:3: lv_rows_5_0= ruleExampleRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1210);
            	    lv_rows_5_0=ruleExampleRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_5_0, 
            	            		"ExampleRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:616:1: entryRuleExampleRow returns [EObject current=null] : iv_ruleExampleRow= ruleExampleRow EOF ;
    public final EObject entryRuleExampleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleRow = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:617:2: (iv_ruleExampleRow= ruleExampleRow EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:618:2: iv_ruleExampleRow= ruleExampleRow EOF
            {
             newCompositeNode(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_ruleExampleRow_in_entryRuleExampleRow1247);
            iv_ruleExampleRow=ruleExampleRow();

            state._fsp--;

             current =iv_ruleExampleRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleRow1257); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:625:1: ruleExampleRow returns [EObject current=null] : ( ( (lv_cells_0_0= RULE_EXAMPLE_CELL ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) ;
    public final EObject ruleExampleRow() throws RecognitionException {
        EObject current = null;

        Token lv_cells_0_0=null;
        Token this_EXAMPLE_ROW_END_1=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:628:28: ( ( ( (lv_cells_0_0= RULE_EXAMPLE_CELL ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:629:1: ( ( (lv_cells_0_0= RULE_EXAMPLE_CELL ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:629:1: ( ( (lv_cells_0_0= RULE_EXAMPLE_CELL ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:629:2: ( (lv_cells_0_0= RULE_EXAMPLE_CELL ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:629:2: ( (lv_cells_0_0= RULE_EXAMPLE_CELL ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_EXAMPLE_CELL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:630:1: (lv_cells_0_0= RULE_EXAMPLE_CELL )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:630:1: (lv_cells_0_0= RULE_EXAMPLE_CELL )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:631:3: lv_cells_0_0= RULE_EXAMPLE_CELL
            	    {
            	    lv_cells_0_0=(Token)match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_ruleExampleRow1299); 

            	    			newLeafNode(lv_cells_0_0, grammarAccess.getExampleRowAccess().getCellsEXAMPLE_CELLTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExampleRowRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"cells",
            	            		lv_cells_0_0, 
            	            		"EXAMPLE_CELL");
            	    	    

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

            this_EXAMPLE_ROW_END_1=(Token)match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow1316); 
             
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


    // $ANTLR start "entryRuleBackground"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:659:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:660:2: (iv_ruleBackground= ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:661:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground1351);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground1361); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:668:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_steps_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:671:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:672:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:672:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:672:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:672:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:673:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:673:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:674:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleBackground1403); 

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
            	    break loop12;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:690:3: ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:691:1: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:691:1: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:692:3: lv_name_1_0= RULE_BACKGROUND_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground1426); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:708:2: ( (lv_steps_2_0= ruleStep ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:709:1: (lv_steps_2_0= ruleStep )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:709:1: (lv_steps_2_0= ruleStep )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:710:3: lv_steps_2_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleBackground1452);
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:734:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:735:2: (iv_ruleStep= ruleStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:736:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1489);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1499); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:743:1: ruleStep returns [EObject current=null] : (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_WhenStep_0 = null;

        EObject this_ThenStep_1 = null;

        EObject this_GivenStep_2 = null;

        EObject this_AndStep_3 = null;


         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:746:28: ( (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:747:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:748:5: this_WhenStep_0= ruleWhenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWhenStep_in_ruleStep1546);
                    this_WhenStep_0=ruleWhenStep();

                    state._fsp--;

                     
                            current = this_WhenStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:758:5: this_ThenStep_1= ruleThenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleThenStep_in_ruleStep1573);
                    this_ThenStep_1=ruleThenStep();

                    state._fsp--;

                     
                            current = this_ThenStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:768:5: this_GivenStep_2= ruleGivenStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGivenStep_in_ruleStep1600);
                    this_GivenStep_2=ruleGivenStep();

                    state._fsp--;

                     
                            current = this_GivenStep_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:778:5: this_AndStep_3= ruleAndStep
                    {
                     
                            newCompositeNode(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAndStep_in_ruleStep1627);
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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:794:1: entryRuleWhenStep returns [EObject current=null] : iv_ruleWhenStep= ruleWhenStep EOF ;
    public final EObject entryRuleWhenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:795:2: (iv_ruleWhenStep= ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:796:2: iv_ruleWhenStep= ruleWhenStep EOF
            {
             newCompositeNode(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_ruleWhenStep_in_entryRuleWhenStep1662);
            iv_ruleWhenStep=ruleWhenStep();

            state._fsp--;

             current =iv_ruleWhenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenStep1672); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:803:1: ruleWhenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* ) ;
    public final EObject ruleWhenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        Token lv_desc_2_0=null;
        Token lv_desc_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:806:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:807:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:807:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:807:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:807:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TAG) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:808:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:808:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:809:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleWhenStep1714); 

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
            	    break loop15;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:825:3: ( (lv_desc_1_0= RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:826:1: (lv_desc_1_0= RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:826:1: (lv_desc_1_0= RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:827:3: lv_desc_1_0= RULE_WHEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_ruleWhenStep1737); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:843:2: ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_TEXT) ) {
                    alt16=1;
                }
                else if ( (LA16_0==RULE_CODE) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:843:3: ( (lv_desc_2_0= RULE_TEXT ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:843:3: ( (lv_desc_2_0= RULE_TEXT ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:844:1: (lv_desc_2_0= RULE_TEXT )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:844:1: (lv_desc_2_0= RULE_TEXT )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:845:3: lv_desc_2_0= RULE_TEXT
            	    {
            	    lv_desc_2_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleWhenStep1760); 

            	    			newLeafNode(lv_desc_2_0, grammarAccess.getWhenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWhenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"TEXT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:862:6: ( (lv_desc_3_0= RULE_CODE ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:862:6: ( (lv_desc_3_0= RULE_CODE ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:863:1: (lv_desc_3_0= RULE_CODE )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:863:1: (lv_desc_3_0= RULE_CODE )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:864:3: lv_desc_3_0= RULE_CODE
            	    {
            	    lv_desc_3_0=(Token)match(input,RULE_CODE,FOLLOW_RULE_CODE_in_ruleWhenStep1788); 

            	    			newLeafNode(lv_desc_3_0, grammarAccess.getWhenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWhenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_3_0, 
            	            		"CODE");
            	    	    

            	    }


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
    // $ANTLR end "ruleWhenStep"


    // $ANTLR start "entryRuleThenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:888:1: entryRuleThenStep returns [EObject current=null] : iv_ruleThenStep= ruleThenStep EOF ;
    public final EObject entryRuleThenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:889:2: (iv_ruleThenStep= ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:890:2: iv_ruleThenStep= ruleThenStep EOF
            {
             newCompositeNode(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_ruleThenStep_in_entryRuleThenStep1831);
            iv_ruleThenStep=ruleThenStep();

            state._fsp--;

             current =iv_ruleThenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenStep1841); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:897:1: ruleThenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* ) ;
    public final EObject ruleThenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        Token lv_desc_2_0=null;
        Token lv_desc_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:900:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:901:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:901:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:901:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:901:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAG) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:902:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:902:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:903:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleThenStep1883); 

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
            	    break loop17;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:919:3: ( (lv_desc_1_0= RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:920:1: (lv_desc_1_0= RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:920:1: (lv_desc_1_0= RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:921:3: lv_desc_1_0= RULE_THEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_ruleThenStep1906); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:937:2: ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_TEXT) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_CODE) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:937:3: ( (lv_desc_2_0= RULE_TEXT ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:937:3: ( (lv_desc_2_0= RULE_TEXT ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:938:1: (lv_desc_2_0= RULE_TEXT )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:938:1: (lv_desc_2_0= RULE_TEXT )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:939:3: lv_desc_2_0= RULE_TEXT
            	    {
            	    lv_desc_2_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleThenStep1929); 

            	    			newLeafNode(lv_desc_2_0, grammarAccess.getThenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getThenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"TEXT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:956:6: ( (lv_desc_3_0= RULE_CODE ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:956:6: ( (lv_desc_3_0= RULE_CODE ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:1: (lv_desc_3_0= RULE_CODE )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:957:1: (lv_desc_3_0= RULE_CODE )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:958:3: lv_desc_3_0= RULE_CODE
            	    {
            	    lv_desc_3_0=(Token)match(input,RULE_CODE,FOLLOW_RULE_CODE_in_ruleThenStep1957); 

            	    			newLeafNode(lv_desc_3_0, grammarAccess.getThenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getThenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_3_0, 
            	            		"CODE");
            	    	    

            	    }


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
    // $ANTLR end "ruleThenStep"


    // $ANTLR start "entryRuleGivenStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:982:1: entryRuleGivenStep returns [EObject current=null] : iv_ruleGivenStep= ruleGivenStep EOF ;
    public final EObject entryRuleGivenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:983:2: (iv_ruleGivenStep= ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:984:2: iv_ruleGivenStep= ruleGivenStep EOF
            {
             newCompositeNode(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_ruleGivenStep_in_entryRuleGivenStep2000);
            iv_ruleGivenStep=ruleGivenStep();

            state._fsp--;

             current =iv_ruleGivenStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGivenStep2010); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:991:1: ruleGivenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* ) ;
    public final EObject ruleGivenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        Token lv_desc_2_0=null;
        Token lv_desc_3_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:994:28: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:995:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:995:1: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:995:2: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:995:2: ( (lv_tags_0_0= RULE_TAG ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TAG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:996:1: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:996:1: (lv_tags_0_0= RULE_TAG )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:997:3: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_RULE_TAG_in_ruleGivenStep2052); 

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
            	    break loop19;
                }
            } while (true);

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1013:3: ( (lv_desc_1_0= RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1014:1: (lv_desc_1_0= RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1014:1: (lv_desc_1_0= RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1015:3: lv_desc_1_0= RULE_GIVEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_ruleGivenStep2075); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1031:2: ( ( (lv_desc_2_0= RULE_TEXT ) ) | ( (lv_desc_3_0= RULE_CODE ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_TEXT) ) {
                    alt20=1;
                }
                else if ( (LA20_0==RULE_CODE) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1031:3: ( (lv_desc_2_0= RULE_TEXT ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1031:3: ( (lv_desc_2_0= RULE_TEXT ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:1: (lv_desc_2_0= RULE_TEXT )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1032:1: (lv_desc_2_0= RULE_TEXT )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1033:3: lv_desc_2_0= RULE_TEXT
            	    {
            	    lv_desc_2_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleGivenStep2098); 

            	    			newLeafNode(lv_desc_2_0, grammarAccess.getGivenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGivenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"TEXT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1050:6: ( (lv_desc_3_0= RULE_CODE ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1050:6: ( (lv_desc_3_0= RULE_CODE ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1051:1: (lv_desc_3_0= RULE_CODE )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1051:1: (lv_desc_3_0= RULE_CODE )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1052:3: lv_desc_3_0= RULE_CODE
            	    {
            	    lv_desc_3_0=(Token)match(input,RULE_CODE,FOLLOW_RULE_CODE_in_ruleGivenStep2126); 

            	    			newLeafNode(lv_desc_3_0, grammarAccess.getGivenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGivenStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_3_0, 
            	            		"CODE");
            	    	    

            	    }


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
    // $ANTLR end "ruleGivenStep"


    // $ANTLR start "entryRuleAndStep"
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1076:1: entryRuleAndStep returns [EObject current=null] : iv_ruleAndStep= ruleAndStep EOF ;
    public final EObject entryRuleAndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndStep = null;


        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1077:2: (iv_ruleAndStep= ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1078:2: iv_ruleAndStep= ruleAndStep EOF
            {
             newCompositeNode(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_ruleAndStep_in_entryRuleAndStep2169);
            iv_ruleAndStep=ruleAndStep();

            state._fsp--;

             current =iv_ruleAndStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndStep2179); 

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
    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1085:1: ruleAndStep returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( ( (lv_desc_1_0= RULE_TEXT ) ) | ( (lv_desc_2_0= RULE_CODE ) ) )* ) ;
    public final EObject ruleAndStep() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        Token lv_desc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1088:28: ( ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( ( (lv_desc_1_0= RULE_TEXT ) ) | ( (lv_desc_2_0= RULE_CODE ) ) )* ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1089:1: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( ( (lv_desc_1_0= RULE_TEXT ) ) | ( (lv_desc_2_0= RULE_CODE ) ) )* )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1089:1: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( ( (lv_desc_1_0= RULE_TEXT ) ) | ( (lv_desc_2_0= RULE_CODE ) ) )* )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1089:2: ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( ( (lv_desc_1_0= RULE_TEXT ) ) | ( (lv_desc_2_0= RULE_CODE ) ) )*
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1089:2: ( (lv_desc_0_0= RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1090:1: (lv_desc_0_0= RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1090:1: (lv_desc_0_0= RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1091:3: lv_desc_0_0= RULE_AND_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_ruleAndStep2221); 

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

            // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:2: ( ( (lv_desc_1_0= RULE_TEXT ) ) | ( (lv_desc_2_0= RULE_CODE ) ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TEXT) ) {
                    alt21=1;
                }
                else if ( (LA21_0==RULE_CODE) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:3: ( (lv_desc_1_0= RULE_TEXT ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1107:3: ( (lv_desc_1_0= RULE_TEXT ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1108:1: (lv_desc_1_0= RULE_TEXT )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1108:1: (lv_desc_1_0= RULE_TEXT )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1109:3: lv_desc_1_0= RULE_TEXT
            	    {
            	    lv_desc_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleAndStep2244); 

            	    			newLeafNode(lv_desc_1_0, grammarAccess.getAndStepAccess().getDescTEXTTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_1_0, 
            	            		"TEXT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1126:6: ( (lv_desc_2_0= RULE_CODE ) )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1126:6: ( (lv_desc_2_0= RULE_CODE ) )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1127:1: (lv_desc_2_0= RULE_CODE )
            	    {
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1127:1: (lv_desc_2_0= RULE_CODE )
            	    // ../de.sebastianbenz.xgherkin/src-gen/de/sebastianbenz/xgherkin/parser/antlr/internal/InternalGherkin.g:1128:3: lv_desc_2_0= RULE_CODE
            	    {
            	    lv_desc_2_0=(Token)match(input,RULE_CODE,FOLLOW_RULE_CODE_in_ruleAndStep2272); 

            	    			newLeafNode(lv_desc_2_0, grammarAccess.getAndStepAccess().getDescCODETerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndStepRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"desc",
            	            		lv_desc_2_0, 
            	            		"CODE");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
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
    static final String DFA7_eotS =
        "\4\uffff";
    static final String DFA7_eofS =
        "\1\1\3\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA7_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA7_specialS =
        "\4\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\1\3\1\uffff\3\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\1\3\1\uffff\2\3",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 475:2: ( (lv_steps_2_0= ruleStep ) )*";
        }
    }
    static final String DFA13_eotS =
        "\4\uffff";
    static final String DFA13_eofS =
        "\1\1\3\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\1\4\1\uffff";
    static final String DFA13_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA13_specialS =
        "\4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\1\3\1\uffff\3\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\1\3\1\uffff\2\3",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 708:2: ( (lv_steps_2_0= ruleStep ) )*";
        }
    }
    static final String DFA14_eotS =
        "\6\uffff";
    static final String DFA14_eofS =
        "\6\uffff";
    static final String DFA14_minS =
        "\2\4\4\uffff";
    static final String DFA14_maxS =
        "\1\24\1\23\4\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4";
    static final String DFA14_specialS =
        "\6\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\13\uffff\1\2\1\uffff\1\3\1\4\1\5",
            "\1\1\13\uffff\1\2\1\uffff\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "747:1: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )";
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
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario993 = new BitSet(new long[]{0x00000000001D0012L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario1019 = new BitSet(new long[]{0x00000000001D0012L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioWithOutline1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleScenarioWithOutline1108 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_ruleScenarioWithOutline1131 = new BitSet(new long[]{0x00000000001D1010L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenarioWithOutline1157 = new BitSet(new long[]{0x00000000001D1010L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_ruleScenarioWithOutline1169 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1189 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_ruleScenarioWithOutline1210 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_entryRuleExampleRow1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleRow1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_ruleExampleRow1299 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_ruleExampleRow1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleBackground1403 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_ruleBackground1426 = new BitSet(new long[]{0x00000000001D0012L});
    public static final BitSet FOLLOW_ruleStep_in_ruleBackground1452 = new BitSet(new long[]{0x00000000001D0012L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_ruleStep1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_ruleStep1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_ruleStep1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_ruleStep1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_entryRuleWhenStep1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenStep1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleWhenStep1714 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_ruleWhenStep1737 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleWhenStep1760 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_CODE_in_ruleWhenStep1788 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_ruleThenStep_in_entryRuleThenStep1831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenStep1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleThenStep1883 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_ruleThenStep1906 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleThenStep1929 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_CODE_in_ruleThenStep1957 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_ruleGivenStep_in_entryRuleGivenStep2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGivenStep2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_ruleGivenStep2052 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_ruleGivenStep2075 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleGivenStep2098 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_CODE_in_ruleGivenStep2126 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_ruleAndStep_in_entryRuleAndStep2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndStep2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleAndStep2221 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleAndStep2244 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_RULE_CODE_in_ruleAndStep2272 = new BitSet(new long[]{0x0000000000020042L});

}