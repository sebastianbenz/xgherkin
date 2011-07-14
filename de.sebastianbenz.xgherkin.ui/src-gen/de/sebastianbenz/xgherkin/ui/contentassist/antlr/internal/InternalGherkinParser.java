package de.sebastianbenz.xgherkin.ui.contentassist.antlr.internal; 

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
import de.sebastianbenz.xgherkin.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_CODE", "RULE_EXAMPLE_HEADING", "RULE_EXAMPLE_ROW_END", "RULE_TAG", "RULE_FEATURE_TEXT", "RULE_AS_A", "RULE_IN_ORDER_TO", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_EXAMPLE_CELL", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_SPACES", "RULE_NNL", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_AS_A=10;
    public static final int RULE_IN_ORDER_TO=11;
    public static final int RULE_THEN_TEXT=18;
    public static final int RULE_NL=23;
    public static final int RULE_TAG=8;
    public static final int RULE_SPACES=21;
    public static final int RULE_TEXT=4;
    public static final int RULE_EXAMPLE_HEADING=6;
    public static final int RULE_SL_COMMENT=24;
    public static final int EOF=-1;
    public static final int RULE_CODE=5;
    public static final int RULE_NNL=22;
    public static final int RULE_WHEN_TEXT=17;
    public static final int RULE_GIVEN_TEXT=19;
    public static final int RULE_I_WANT_TO=12;
    public static final int RULE_EXAMPLE_ROW_END=7;
    public static final int RULE_SCENARIO_TEXT=13;
    public static final int RULE_BACKGROUND_TEXT=16;
    public static final int RULE_WS=25;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=14;
    public static final int RULE_AND_TEXT=20;
    public static final int RULE_EXAMPLE_CELL=15;
    public static final int RULE_FEATURE_TEXT=9;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g"; }


     
     	private GherkinGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GherkinGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleFeature"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:61:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:62:1: ( ruleFeature EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:63:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature61);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature68); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:70:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:74:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:75:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:75:1: ( ( rule__Feature__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:76:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:77:1: ( rule__Feature__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:77:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature94);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNarrativeElement"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:89:1: entryRuleNarrativeElement : ruleNarrativeElement EOF ;
    public final void entryRuleNarrativeElement() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:90:1: ( ruleNarrativeElement EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:91:1: ruleNarrativeElement EOF
            {
             before(grammarAccess.getNarrativeElementRule()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_entryRuleNarrativeElement121);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getNarrativeElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNarrativeElement128); 

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
    // $ANTLR end "entryRuleNarrativeElement"


    // $ANTLR start "ruleNarrativeElement"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:98:1: ruleNarrativeElement : ( ( rule__NarrativeElement__Alternatives ) ) ;
    public final void ruleNarrativeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:102:2: ( ( ( rule__NarrativeElement__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:103:1: ( ( rule__NarrativeElement__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:103:1: ( ( rule__NarrativeElement__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:104:1: ( rule__NarrativeElement__Alternatives )
            {
             before(grammarAccess.getNarrativeElementAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:105:1: ( rule__NarrativeElement__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:105:2: rule__NarrativeElement__Alternatives
            {
            pushFollow(FOLLOW_rule__NarrativeElement__Alternatives_in_ruleNarrativeElement154);
            rule__NarrativeElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNarrativeElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNarrativeElement"


    // $ANTLR start "entryRuleFreeText"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:117:1: entryRuleFreeText : ruleFreeText EOF ;
    public final void entryRuleFreeText() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:118:1: ( ruleFreeText EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:119:1: ruleFreeText EOF
            {
             before(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_ruleFreeText_in_entryRuleFreeText181);
            ruleFreeText();

            state._fsp--;

             after(grammarAccess.getFreeTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeText188); 

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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:126:1: ruleFreeText : ( ( rule__FreeText__NameAssignment ) ) ;
    public final void ruleFreeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:130:2: ( ( ( rule__FreeText__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:131:1: ( ( rule__FreeText__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:131:1: ( ( rule__FreeText__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:132:1: ( rule__FreeText__NameAssignment )
            {
             before(grammarAccess.getFreeTextAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:133:1: ( rule__FreeText__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:133:2: rule__FreeText__NameAssignment
            {
            pushFollow(FOLLOW_rule__FreeText__NameAssignment_in_ruleFreeText214);
            rule__FreeText__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleAsA"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:145:1: entryRuleAsA : ruleAsA EOF ;
    public final void entryRuleAsA() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:146:1: ( ruleAsA EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:147:1: ruleAsA EOF
            {
             before(grammarAccess.getAsARule()); 
            pushFollow(FOLLOW_ruleAsA_in_entryRuleAsA241);
            ruleAsA();

            state._fsp--;

             after(grammarAccess.getAsARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsA248); 

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
    // $ANTLR end "entryRuleAsA"


    // $ANTLR start "ruleAsA"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:154:1: ruleAsA : ( ( rule__AsA__NameAssignment ) ) ;
    public final void ruleAsA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:158:2: ( ( ( rule__AsA__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:159:1: ( ( rule__AsA__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:159:1: ( ( rule__AsA__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:160:1: ( rule__AsA__NameAssignment )
            {
             before(grammarAccess.getAsAAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:161:1: ( rule__AsA__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:161:2: rule__AsA__NameAssignment
            {
            pushFollow(FOLLOW_rule__AsA__NameAssignment_in_ruleAsA274);
            rule__AsA__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAsAAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleAsA"


    // $ANTLR start "entryRuleInOrderTo"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:173:1: entryRuleInOrderTo : ruleInOrderTo EOF ;
    public final void entryRuleInOrderTo() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:174:1: ( ruleInOrderTo EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:175:1: ruleInOrderTo EOF
            {
             before(grammarAccess.getInOrderToRule()); 
            pushFollow(FOLLOW_ruleInOrderTo_in_entryRuleInOrderTo301);
            ruleInOrderTo();

            state._fsp--;

             after(grammarAccess.getInOrderToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOrderTo308); 

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
    // $ANTLR end "entryRuleInOrderTo"


    // $ANTLR start "ruleInOrderTo"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:182:1: ruleInOrderTo : ( ( rule__InOrderTo__NameAssignment ) ) ;
    public final void ruleInOrderTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:186:2: ( ( ( rule__InOrderTo__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:187:1: ( ( rule__InOrderTo__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:187:1: ( ( rule__InOrderTo__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:188:1: ( rule__InOrderTo__NameAssignment )
            {
             before(grammarAccess.getInOrderToAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:189:1: ( rule__InOrderTo__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:189:2: rule__InOrderTo__NameAssignment
            {
            pushFollow(FOLLOW_rule__InOrderTo__NameAssignment_in_ruleInOrderTo334);
            rule__InOrderTo__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInOrderToAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleInOrderTo"


    // $ANTLR start "entryRuleIWantTo"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:201:1: entryRuleIWantTo : ruleIWantTo EOF ;
    public final void entryRuleIWantTo() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:202:1: ( ruleIWantTo EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:203:1: ruleIWantTo EOF
            {
             before(grammarAccess.getIWantToRule()); 
            pushFollow(FOLLOW_ruleIWantTo_in_entryRuleIWantTo361);
            ruleIWantTo();

            state._fsp--;

             after(grammarAccess.getIWantToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIWantTo368); 

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
    // $ANTLR end "entryRuleIWantTo"


    // $ANTLR start "ruleIWantTo"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:210:1: ruleIWantTo : ( ( rule__IWantTo__NameAssignment ) ) ;
    public final void ruleIWantTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:214:2: ( ( ( rule__IWantTo__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:215:1: ( ( rule__IWantTo__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:215:1: ( ( rule__IWantTo__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:216:1: ( rule__IWantTo__NameAssignment )
            {
             before(grammarAccess.getIWantToAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:217:1: ( rule__IWantTo__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:217:2: rule__IWantTo__NameAssignment
            {
            pushFollow(FOLLOW_rule__IWantTo__NameAssignment_in_ruleIWantTo394);
            rule__IWantTo__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIWantToAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleIWantTo"


    // $ANTLR start "entryRuleAbstractScenario"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:229:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:230:1: ( ruleAbstractScenario EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:231:1: ruleAbstractScenario EOF
            {
             before(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_ruleAbstractScenario_in_entryRuleAbstractScenario421);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getAbstractScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractScenario428); 

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
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:238:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:242:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:243:1: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:243:1: ( ( rule__AbstractScenario__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:244:1: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:245:1: ( rule__AbstractScenario__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:245:2: rule__AbstractScenario__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractScenario__Alternatives_in_ruleAbstractScenario454);
            rule__AbstractScenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleScenario"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:257:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:258:1: ( ruleScenario EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:259:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario481);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario488); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:266:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:270:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:271:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:271:1: ( ( rule__Scenario__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:272:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:273:1: ( rule__Scenario__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:273:2: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0_in_ruleScenario514);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioWithOutline"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:285:1: entryRuleScenarioWithOutline : ruleScenarioWithOutline EOF ;
    public final void entryRuleScenarioWithOutline() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:286:1: ( ruleScenarioWithOutline EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:287:1: ruleScenarioWithOutline EOF
            {
             before(grammarAccess.getScenarioWithOutlineRule()); 
            pushFollow(FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline541);
            ruleScenarioWithOutline();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioWithOutline548); 

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
    // $ANTLR end "entryRuleScenarioWithOutline"


    // $ANTLR start "ruleScenarioWithOutline"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:294:1: ruleScenarioWithOutline : ( ( rule__ScenarioWithOutline__Group__0 ) ) ;
    public final void ruleScenarioWithOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:298:2: ( ( ( rule__ScenarioWithOutline__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:299:1: ( ( rule__ScenarioWithOutline__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:299:1: ( ( rule__ScenarioWithOutline__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:300:1: ( rule__ScenarioWithOutline__Group__0 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:301:1: ( rule__ScenarioWithOutline__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:301:2: rule__ScenarioWithOutline__Group__0
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__0_in_ruleScenarioWithOutline574);
            rule__ScenarioWithOutline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getGroup()); 

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
    // $ANTLR end "ruleScenarioWithOutline"


    // $ANTLR start "entryRuleExampleRow"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:313:1: entryRuleExampleRow : ruleExampleRow EOF ;
    public final void entryRuleExampleRow() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:314:1: ( ruleExampleRow EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:315:1: ruleExampleRow EOF
            {
             before(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_ruleExampleRow_in_entryRuleExampleRow601);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleRowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleRow608); 

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
    // $ANTLR end "entryRuleExampleRow"


    // $ANTLR start "ruleExampleRow"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:322:1: ruleExampleRow : ( ( rule__ExampleRow__Group__0 ) ) ;
    public final void ruleExampleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:326:2: ( ( ( rule__ExampleRow__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:327:1: ( ( rule__ExampleRow__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:327:1: ( ( rule__ExampleRow__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:328:1: ( rule__ExampleRow__Group__0 )
            {
             before(grammarAccess.getExampleRowAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:329:1: ( rule__ExampleRow__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:329:2: rule__ExampleRow__Group__0
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__0_in_ruleExampleRow634);
            rule__ExampleRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getGroup()); 

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
    // $ANTLR end "ruleExampleRow"


    // $ANTLR start "entryRuleExampleCell"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:341:1: entryRuleExampleCell : ruleExampleCell EOF ;
    public final void entryRuleExampleCell() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:342:1: ( ruleExampleCell EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:343:1: ruleExampleCell EOF
            {
             before(grammarAccess.getExampleCellRule()); 
            pushFollow(FOLLOW_ruleExampleCell_in_entryRuleExampleCell661);
            ruleExampleCell();

            state._fsp--;

             after(grammarAccess.getExampleCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleCell668); 

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
    // $ANTLR end "entryRuleExampleCell"


    // $ANTLR start "ruleExampleCell"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:350:1: ruleExampleCell : ( ( rule__ExampleCell__ValueAssignment ) ) ;
    public final void ruleExampleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:354:2: ( ( ( rule__ExampleCell__ValueAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:355:1: ( ( rule__ExampleCell__ValueAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:355:1: ( ( rule__ExampleCell__ValueAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:356:1: ( rule__ExampleCell__ValueAssignment )
            {
             before(grammarAccess.getExampleCellAccess().getValueAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:357:1: ( rule__ExampleCell__ValueAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:357:2: rule__ExampleCell__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ExampleCell__ValueAssignment_in_ruleExampleCell694);
            rule__ExampleCell__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExampleCellAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleExampleCell"


    // $ANTLR start "entryRuleBackground"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:369:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:370:1: ( ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:371:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground721);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground728); 

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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:378:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:382:2: ( ( ( rule__Background__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( ( rule__Background__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( ( rule__Background__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:384:1: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:385:1: ( rule__Background__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:385:2: rule__Background__Group__0
            {
            pushFollow(FOLLOW_rule__Background__Group__0_in_ruleBackground754);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:397:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:398:1: ( ruleStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:399:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep781);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep788); 

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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:406:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:410:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( ( rule__Step__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( ( rule__Step__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:412:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:413:1: ( rule__Step__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:413:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep814);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleWhenStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:425:1: entryRuleWhenStep : ruleWhenStep EOF ;
    public final void entryRuleWhenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:426:1: ( ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:427:1: ruleWhenStep EOF
            {
             before(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_ruleWhenStep_in_entryRuleWhenStep841);
            ruleWhenStep();

            state._fsp--;

             after(grammarAccess.getWhenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenStep848); 

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
    // $ANTLR end "entryRuleWhenStep"


    // $ANTLR start "ruleWhenStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:434:1: ruleWhenStep : ( ( rule__WhenStep__Group__0 ) ) ;
    public final void ruleWhenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:438:2: ( ( ( rule__WhenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:439:1: ( ( rule__WhenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:439:1: ( ( rule__WhenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:440:1: ( rule__WhenStep__Group__0 )
            {
             before(grammarAccess.getWhenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:441:1: ( rule__WhenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:441:2: rule__WhenStep__Group__0
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0_in_ruleWhenStep874);
            rule__WhenStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenStepAccess().getGroup()); 

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
    // $ANTLR end "ruleWhenStep"


    // $ANTLR start "entryRuleThenStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:453:1: entryRuleThenStep : ruleThenStep EOF ;
    public final void entryRuleThenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:454:1: ( ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:455:1: ruleThenStep EOF
            {
             before(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_ruleThenStep_in_entryRuleThenStep901);
            ruleThenStep();

            state._fsp--;

             after(grammarAccess.getThenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenStep908); 

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
    // $ANTLR end "entryRuleThenStep"


    // $ANTLR start "ruleThenStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:462:1: ruleThenStep : ( ( rule__ThenStep__Group__0 ) ) ;
    public final void ruleThenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:466:2: ( ( ( rule__ThenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:467:1: ( ( rule__ThenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:467:1: ( ( rule__ThenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:468:1: ( rule__ThenStep__Group__0 )
            {
             before(grammarAccess.getThenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:469:1: ( rule__ThenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:469:2: rule__ThenStep__Group__0
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0_in_ruleThenStep934);
            rule__ThenStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenStepAccess().getGroup()); 

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
    // $ANTLR end "ruleThenStep"


    // $ANTLR start "entryRuleGivenStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:481:1: entryRuleGivenStep : ruleGivenStep EOF ;
    public final void entryRuleGivenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:482:1: ( ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:483:1: ruleGivenStep EOF
            {
             before(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_ruleGivenStep_in_entryRuleGivenStep961);
            ruleGivenStep();

            state._fsp--;

             after(grammarAccess.getGivenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGivenStep968); 

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
    // $ANTLR end "entryRuleGivenStep"


    // $ANTLR start "ruleGivenStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:490:1: ruleGivenStep : ( ( rule__GivenStep__Group__0 ) ) ;
    public final void ruleGivenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:494:2: ( ( ( rule__GivenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( ( rule__GivenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( ( rule__GivenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:496:1: ( rule__GivenStep__Group__0 )
            {
             before(grammarAccess.getGivenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:497:1: ( rule__GivenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:497:2: rule__GivenStep__Group__0
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0_in_ruleGivenStep994);
            rule__GivenStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenStepAccess().getGroup()); 

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
    // $ANTLR end "ruleGivenStep"


    // $ANTLR start "entryRuleAndStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:509:1: entryRuleAndStep : ruleAndStep EOF ;
    public final void entryRuleAndStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:510:1: ( ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:511:1: ruleAndStep EOF
            {
             before(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_ruleAndStep_in_entryRuleAndStep1021);
            ruleAndStep();

            state._fsp--;

             after(grammarAccess.getAndStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndStep1028); 

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
    // $ANTLR end "entryRuleAndStep"


    // $ANTLR start "ruleAndStep"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:518:1: ruleAndStep : ( ( rule__AndStep__Group__0 ) ) ;
    public final void ruleAndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:522:2: ( ( ( rule__AndStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:523:1: ( ( rule__AndStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:523:1: ( ( rule__AndStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:524:1: ( rule__AndStep__Group__0 )
            {
             before(grammarAccess.getAndStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:525:1: ( rule__AndStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:525:2: rule__AndStep__Group__0
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0_in_ruleAndStep1054);
            rule__AndStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndStepAccess().getGroup()); 

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
    // $ANTLR end "ruleAndStep"


    // $ANTLR start "entryRuleOptionalText"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:537:1: entryRuleOptionalText : ruleOptionalText EOF ;
    public final void entryRuleOptionalText() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:538:1: ( ruleOptionalText EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:539:1: ruleOptionalText EOF
            {
             before(grammarAccess.getOptionalTextRule()); 
            pushFollow(FOLLOW_ruleOptionalText_in_entryRuleOptionalText1081);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getOptionalTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalText1088); 

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
    // $ANTLR end "entryRuleOptionalText"


    // $ANTLR start "ruleOptionalText"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:546:1: ruleOptionalText : ( ( rule__OptionalText__Alternatives ) ) ;
    public final void ruleOptionalText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:550:2: ( ( ( rule__OptionalText__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:551:1: ( ( rule__OptionalText__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:551:1: ( ( rule__OptionalText__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:552:1: ( rule__OptionalText__Alternatives )
            {
             before(grammarAccess.getOptionalTextAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:553:1: ( rule__OptionalText__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:553:2: rule__OptionalText__Alternatives
            {
            pushFollow(FOLLOW_rule__OptionalText__Alternatives_in_ruleOptionalText1114);
            rule__OptionalText__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionalTextAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOptionalText"


    // $ANTLR start "rule__NarrativeElement__Alternatives"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:565:1: rule__NarrativeElement__Alternatives : ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) );
    public final void rule__NarrativeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:569:1: ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_IN_ORDER_TO:
                {
                alt1=1;
                }
                break;
            case RULE_AS_A:
                {
                alt1=2;
                }
                break;
            case RULE_I_WANT_TO:
                {
                alt1=3;
                }
                break;
            case RULE_TEXT:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:570:1: ( ruleInOrderTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:570:1: ( ruleInOrderTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:571:1: ruleInOrderTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInOrderTo_in_rule__NarrativeElement__Alternatives1150);
                    ruleInOrderTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:576:6: ( ruleAsA )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:576:6: ( ruleAsA )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:577:1: ruleAsA
                    {
                     before(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsA_in_rule__NarrativeElement__Alternatives1167);
                    ruleAsA();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:582:6: ( ruleIWantTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:582:6: ( ruleIWantTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:583:1: ruleIWantTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIWantTo_in_rule__NarrativeElement__Alternatives1184);
                    ruleIWantTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:588:6: ( ruleFreeText )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:588:6: ( ruleFreeText )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:589:1: ruleFreeText
                    {
                     before(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFreeText_in_rule__NarrativeElement__Alternatives1201);
                    ruleFreeText();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 

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
    // $ANTLR end "rule__NarrativeElement__Alternatives"


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:599:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:603:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:604:1: ( ruleBackground )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:604:1: ( ruleBackground )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:605:1: ruleBackground
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBackground_in_rule__AbstractScenario__Alternatives1233);
                    ruleBackground();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:610:6: ( ruleScenario )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:610:6: ( ruleScenario )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:611:1: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__AbstractScenario__Alternatives1250);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:616:6: ( ruleScenarioWithOutline )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:616:6: ( ruleScenarioWithOutline )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:617:1: ruleScenarioWithOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleScenarioWithOutline_in_rule__AbstractScenario__Alternatives1267);
                    ruleScenarioWithOutline();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractScenario__Alternatives"


    // $ANTLR start "rule__Step__Alternatives"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:627:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:631:1: ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:632:1: ( ruleWhenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:632:1: ( ruleWhenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:633:1: ruleWhenStep
                    {
                     before(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWhenStep_in_rule__Step__Alternatives1299);
                    ruleWhenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:638:6: ( ruleThenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:638:6: ( ruleThenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:639:1: ruleThenStep
                    {
                     before(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleThenStep_in_rule__Step__Alternatives1316);
                    ruleThenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:644:6: ( ruleGivenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:644:6: ( ruleGivenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:645:1: ruleGivenStep
                    {
                     before(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGivenStep_in_rule__Step__Alternatives1333);
                    ruleGivenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:650:6: ( ruleAndStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:650:6: ( ruleAndStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:651:1: ruleAndStep
                    {
                     before(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAndStep_in_rule__Step__Alternatives1350);
                    ruleAndStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 

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
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__OptionalText__Alternatives"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:661:1: rule__OptionalText__Alternatives : ( ( RULE_TEXT ) | ( RULE_CODE ) );
    public final void rule__OptionalText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:665:1: ( ( RULE_TEXT ) | ( RULE_CODE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TEXT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_CODE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:666:1: ( RULE_TEXT )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:666:1: ( RULE_TEXT )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:667:1: RULE_TEXT
                    {
                     before(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
                    match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__OptionalText__Alternatives1382); 
                     after(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:672:6: ( RULE_CODE )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:672:6: ( RULE_CODE )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:673:1: RULE_CODE
                    {
                     before(grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 
                    match(input,RULE_CODE,FOLLOW_RULE_CODE_in_rule__OptionalText__Alternatives1399); 
                     after(grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__OptionalText__Alternatives"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:685:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:689:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:690:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01429);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01432);
            rule__Feature__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:697:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:701:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:702:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:702:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:703:1: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:704:1: ( rule__Feature__TagsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:704:2: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1459);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:714:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:718:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:719:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11490);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11493);
            rule__Feature__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:726:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:730:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:732:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:733:1: ( rule__Feature__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:733:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1520);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:743:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:747:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:748:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21550);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21553);
            rule__Feature__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:755:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ElementsAssignment_2 )* ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:759:1: ( ( ( rule__Feature__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:760:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:760:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:761:1: ( rule__Feature__ElementsAssignment_2 )*
            {
             before(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:762:1: ( rule__Feature__ElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TEXT||(LA6_0>=RULE_AS_A && LA6_0<=RULE_I_WANT_TO)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:762:2: rule__Feature__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1580);
            	    rule__Feature__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:772:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:776:1: ( rule__Feature__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:777:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31611);
            rule__Feature__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:783:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__ScenariosAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:787:1: ( ( ( rule__Feature__ScenariosAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:788:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:788:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:789:1: ( rule__Feature__ScenariosAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:790:1: ( rule__Feature__ScenariosAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TAG||(LA7_0>=RULE_SCENARIO_TEXT && LA7_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA7_0==RULE_BACKGROUND_TEXT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:790:2: rule__Feature__ScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1638);
            	    rule__Feature__ScenariosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:808:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:812:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:813:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01677);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01680);
            rule__Scenario__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:820:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:824:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:825:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:825:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:826:1: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:827:1: ( rule__Scenario__TagsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TAG) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:827:2: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1707);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:837:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:841:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:842:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11738);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11741);
            rule__Scenario__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:849:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:853:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:854:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:854:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:855:1: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:856:1: ( rule__Scenario__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:856:2: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1768);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:866:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:870:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:871:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21798);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21801);
            rule__Scenario__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:878:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__ElementsAssignment_2 )* ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:882:1: ( ( ( rule__Scenario__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:883:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:883:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:884:1: ( rule__Scenario__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:885:1: ( rule__Scenario__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TEXT||(LA9_0>=RULE_AS_A && LA9_0<=RULE_I_WANT_TO)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:885:2: rule__Scenario__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__ElementsAssignment_2_in_rule__Scenario__Group__2__Impl1828);
            	    rule__Scenario__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:895:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:899:1: ( rule__Scenario__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:900:2: rule__Scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31859);
            rule__Scenario__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:906:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:911:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:911:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:912:1: ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:912:1: ( ( rule__Scenario__StepsAssignment_3 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:913:1: ( rule__Scenario__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:914:1: ( rule__Scenario__StepsAssignment_3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:914:2: rule__Scenario__StepsAssignment_3
            {
            pushFollow(FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1888);
            rule__Scenario__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:917:1: ( ( rule__Scenario__StepsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:918:1: ( rule__Scenario__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:919:1: ( rule__Scenario__StepsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:919:2: rule__Scenario__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1900);
            	    rule__Scenario__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:938:1: rule__ScenarioWithOutline__Group__0 : rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 ;
    public final void rule__ScenarioWithOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:942:1: ( rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:943:2: rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__01941);
            rule__ScenarioWithOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__01944);
            rule__ScenarioWithOutline__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__0"


    // $ANTLR start "rule__ScenarioWithOutline__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:950:1: rule__ScenarioWithOutline__Group__0__Impl : ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioWithOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:954:1: ( ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:955:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:955:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:956:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:957:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAG) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:957:2: rule__ScenarioWithOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl1971);
            	    rule__ScenarioWithOutline__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:967:1: rule__ScenarioWithOutline__Group__1 : rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 ;
    public final void rule__ScenarioWithOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:971:1: ( rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:972:2: rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__12002);
            rule__ScenarioWithOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__12005);
            rule__ScenarioWithOutline__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__1"


    // $ANTLR start "rule__ScenarioWithOutline__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:979:1: rule__ScenarioWithOutline__Group__1__Impl : ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) ;
    public final void rule__ScenarioWithOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:983:1: ( ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:984:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:984:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:985:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:986:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:986:2: rule__ScenarioWithOutline__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl2032);
            rule__ScenarioWithOutline__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:996:1: rule__ScenarioWithOutline__Group__2 : rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 ;
    public final void rule__ScenarioWithOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1000:1: ( rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1001:2: rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22062);
            rule__ScenarioWithOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22065);
            rule__ScenarioWithOutline__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__2"


    // $ANTLR start "rule__ScenarioWithOutline__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1008:1: rule__ScenarioWithOutline__Group__2__Impl : ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) ;
    public final void rule__ScenarioWithOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1014:1: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1015:1: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TEXT||(LA12_0>=RULE_AS_A && LA12_0<=RULE_I_WANT_TO)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1015:2: rule__ScenarioWithOutline__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__ElementsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2092);
            	    rule__ScenarioWithOutline__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1025:1: rule__ScenarioWithOutline__Group__3 : rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 ;
    public final void rule__ScenarioWithOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1029:1: ( rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1030:2: rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32123);
            rule__ScenarioWithOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32126);
            rule__ScenarioWithOutline__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__3"


    // $ANTLR start "rule__ScenarioWithOutline__Group__3__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1037:1: rule__ScenarioWithOutline__Group__3__Impl : ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) ;
    public final void rule__ScenarioWithOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1043:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1043:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1044:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1045:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1045:2: rule__ScenarioWithOutline__StepsAssignment_3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2155);
            rule__ScenarioWithOutline__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1048:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1049:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1050:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TAG||(LA13_0>=RULE_WHEN_TEXT && LA13_0<=RULE_AND_TEXT)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1050:2: rule__ScenarioWithOutline__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2167);
            	    rule__ScenarioWithOutline__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__4"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1061:1: rule__ScenarioWithOutline__Group__4 : rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5 ;
    public final void rule__ScenarioWithOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1065:1: ( rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1066:2: rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42200);
            rule__ScenarioWithOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__5_in_rule__ScenarioWithOutline__Group__42203);
            rule__ScenarioWithOutline__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__4"


    // $ANTLR start "rule__ScenarioWithOutline__Group__4__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1073:1: rule__ScenarioWithOutline__Group__4__Impl : ( RULE_EXAMPLE_HEADING ) ;
    public final void rule__ScenarioWithOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1077:1: ( ( RULE_EXAMPLE_HEADING ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1078:1: ( RULE_EXAMPLE_HEADING )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1078:1: ( RULE_EXAMPLE_HEADING )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1079:1: RULE_EXAMPLE_HEADING
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_4()); 
            match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_rule__ScenarioWithOutline__Group__4__Impl2230); 
             after(grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__4__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__5"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1090:1: rule__ScenarioWithOutline__Group__5 : rule__ScenarioWithOutline__Group__5__Impl rule__ScenarioWithOutline__Group__6 ;
    public final void rule__ScenarioWithOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1094:1: ( rule__ScenarioWithOutline__Group__5__Impl rule__ScenarioWithOutline__Group__6 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1095:2: rule__ScenarioWithOutline__Group__5__Impl rule__ScenarioWithOutline__Group__6
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__5__Impl_in_rule__ScenarioWithOutline__Group__52259);
            rule__ScenarioWithOutline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__6_in_rule__ScenarioWithOutline__Group__52262);
            rule__ScenarioWithOutline__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__5"


    // $ANTLR start "rule__ScenarioWithOutline__Group__5__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1102:1: rule__ScenarioWithOutline__Group__5__Impl : ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) ) ;
    public final void rule__ScenarioWithOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1106:1: ( ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1107:1: ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1107:1: ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1108:1: ( rule__ScenarioWithOutline__HeadingAssignment_5 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getHeadingAssignment_5()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1109:1: ( rule__ScenarioWithOutline__HeadingAssignment_5 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1109:2: rule__ScenarioWithOutline__HeadingAssignment_5
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__HeadingAssignment_5_in_rule__ScenarioWithOutline__Group__5__Impl2289);
            rule__ScenarioWithOutline__HeadingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getHeadingAssignment_5()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__5__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__6"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1119:1: rule__ScenarioWithOutline__Group__6 : rule__ScenarioWithOutline__Group__6__Impl ;
    public final void rule__ScenarioWithOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1123:1: ( rule__ScenarioWithOutline__Group__6__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1124:2: rule__ScenarioWithOutline__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__6__Impl_in_rule__ScenarioWithOutline__Group__62319);
            rule__ScenarioWithOutline__Group__6__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__6"


    // $ANTLR start "rule__ScenarioWithOutline__Group__6__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1130:1: rule__ScenarioWithOutline__Group__6__Impl : ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* ) ;
    public final void rule__ScenarioWithOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1134:1: ( ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1135:1: ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1135:1: ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1136:1: ( rule__ScenarioWithOutline__RowsAssignment_6 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getRowsAssignment_6()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1137:1: ( rule__ScenarioWithOutline__RowsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EXAMPLE_CELL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1137:2: rule__ScenarioWithOutline__RowsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__RowsAssignment_6_in_rule__ScenarioWithOutline__Group__6__Impl2346);
            	    rule__ScenarioWithOutline__RowsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getRowsAssignment_6()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__6__Impl"


    // $ANTLR start "rule__ExampleRow__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1161:1: rule__ExampleRow__Group__0 : rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 ;
    public final void rule__ExampleRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1165:1: ( rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1166:2: rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02391);
            rule__ExampleRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02394);
            rule__ExampleRow__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ExampleRow__Group__0"


    // $ANTLR start "rule__ExampleRow__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1173:1: rule__ExampleRow__Group__0__Impl : ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) ;
    public final void rule__ExampleRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1177:1: ( ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1178:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1178:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1179:1: ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1179:1: ( ( rule__ExampleRow__CellsAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1180:1: ( rule__ExampleRow__CellsAssignment_0 )
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1181:1: ( rule__ExampleRow__CellsAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1181:2: rule__ExampleRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2423);
            rule__ExampleRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1184:1: ( ( rule__ExampleRow__CellsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1185:1: ( rule__ExampleRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1186:1: ( rule__ExampleRow__CellsAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EXAMPLE_CELL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1186:2: rule__ExampleRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2435);
            	    rule__ExampleRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

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
    // $ANTLR end "rule__ExampleRow__Group__0__Impl"


    // $ANTLR start "rule__ExampleRow__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1197:1: rule__ExampleRow__Group__1 : rule__ExampleRow__Group__1__Impl ;
    public final void rule__ExampleRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1201:1: ( rule__ExampleRow__Group__1__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1202:2: rule__ExampleRow__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12468);
            rule__ExampleRow__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ExampleRow__Group__1"


    // $ANTLR start "rule__ExampleRow__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1208:1: rule__ExampleRow__Group__1__Impl : ( RULE_EXAMPLE_ROW_END ) ;
    public final void rule__ExampleRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1212:1: ( ( RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1213:1: ( RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1213:1: ( RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1214:1: RULE_EXAMPLE_ROW_END
            {
             before(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
            match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2495); 
             after(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ExampleRow__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1229:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1233:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1234:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02528);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02531);
            rule__Background__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1241:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )* ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1245:1: ( ( ( rule__Background__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1246:1: ( ( rule__Background__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1246:1: ( ( rule__Background__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1247:1: ( rule__Background__TagsAssignment_0 )*
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1248:1: ( rule__Background__TagsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_TAG) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1248:2: rule__Background__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2558);
            	    rule__Background__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1258:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1262:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1263:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12589);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12592);
            rule__Background__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1270:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1274:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1275:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1275:1: ( ( rule__Background__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1276:1: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1277:1: ( rule__Background__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1277:2: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2619);
            rule__Background__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1287:1: rule__Background__Group__2 : rule__Background__Group__2__Impl ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1291:1: ( rule__Background__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1292:2: rule__Background__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22649);
            rule__Background__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1298:1: rule__Background__Group__2__Impl : ( ( rule__Background__StepsAssignment_2 )* ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1302:1: ( ( ( rule__Background__StepsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( ( rule__Background__StepsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( ( rule__Background__StepsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1304:1: ( rule__Background__StepsAssignment_2 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1305:1: ( rule__Background__StepsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1305:2: rule__Background__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2676);
            	    rule__Background__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 

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
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__WhenStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1321:1: rule__WhenStep__Group__0 : rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 ;
    public final void rule__WhenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1325:1: ( rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1326:2: rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02713);
            rule__WhenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02716);
            rule__WhenStep__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__WhenStep__Group__0"


    // $ANTLR start "rule__WhenStep__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1333:1: rule__WhenStep__Group__0__Impl : ( ( rule__WhenStep__TagsAssignment_0 )* ) ;
    public final void rule__WhenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1337:1: ( ( ( rule__WhenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1338:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1338:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1339:1: ( rule__WhenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1340:1: ( rule__WhenStep__TagsAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_TAG) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1340:2: rule__WhenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2743);
            	    rule__WhenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__WhenStep__Group__0__Impl"


    // $ANTLR start "rule__WhenStep__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1350:1: rule__WhenStep__Group__1 : rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 ;
    public final void rule__WhenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1354:1: ( rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1355:2: rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12774);
            rule__WhenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12777);
            rule__WhenStep__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__WhenStep__Group__1"


    // $ANTLR start "rule__WhenStep__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1362:1: rule__WhenStep__Group__1__Impl : ( ( rule__WhenStep__DescAssignment_1 ) ) ;
    public final void rule__WhenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1366:1: ( ( ( rule__WhenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1367:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1367:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1368:1: ( rule__WhenStep__DescAssignment_1 )
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1369:1: ( rule__WhenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1369:2: rule__WhenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2804);
            rule__WhenStep__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__WhenStep__Group__1__Impl"


    // $ANTLR start "rule__WhenStep__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1379:1: rule__WhenStep__Group__2 : rule__WhenStep__Group__2__Impl ;
    public final void rule__WhenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1383:1: ( rule__WhenStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1384:2: rule__WhenStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22834);
            rule__WhenStep__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__WhenStep__Group__2"


    // $ANTLR start "rule__WhenStep__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1390:1: rule__WhenStep__Group__2__Impl : ( ( rule__WhenStep__DescAssignment_2 )* ) ;
    public final void rule__WhenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1394:1: ( ( ( rule__WhenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1395:1: ( ( rule__WhenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1395:1: ( ( rule__WhenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1396:1: ( rule__WhenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1397:1: ( rule__WhenStep__DescAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_TEXT && LA19_0<=RULE_CODE)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1397:2: rule__WhenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__DescAssignment_2_in_rule__WhenStep__Group__2__Impl2861);
            	    rule__WhenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getDescAssignment_2()); 

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
    // $ANTLR end "rule__WhenStep__Group__2__Impl"


    // $ANTLR start "rule__ThenStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1413:1: rule__ThenStep__Group__0 : rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 ;
    public final void rule__ThenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1417:1: ( rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1418:2: rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__02898);
            rule__ThenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__02901);
            rule__ThenStep__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ThenStep__Group__0"


    // $ANTLR start "rule__ThenStep__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1425:1: rule__ThenStep__Group__0__Impl : ( ( rule__ThenStep__TagsAssignment_0 )* ) ;
    public final void rule__ThenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1429:1: ( ( ( rule__ThenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1430:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1430:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1431:1: ( rule__ThenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1432:1: ( rule__ThenStep__TagsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_TAG) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1432:2: rule__ThenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl2928);
            	    rule__ThenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__ThenStep__Group__0__Impl"


    // $ANTLR start "rule__ThenStep__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1442:1: rule__ThenStep__Group__1 : rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 ;
    public final void rule__ThenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1446:1: ( rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1447:2: rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__12959);
            rule__ThenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__12962);
            rule__ThenStep__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ThenStep__Group__1"


    // $ANTLR start "rule__ThenStep__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1454:1: rule__ThenStep__Group__1__Impl : ( ( rule__ThenStep__DescAssignment_1 ) ) ;
    public final void rule__ThenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1458:1: ( ( ( rule__ThenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1459:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1459:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1460:1: ( rule__ThenStep__DescAssignment_1 )
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1461:1: ( rule__ThenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1461:2: rule__ThenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl2989);
            rule__ThenStep__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__ThenStep__Group__1__Impl"


    // $ANTLR start "rule__ThenStep__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1471:1: rule__ThenStep__Group__2 : rule__ThenStep__Group__2__Impl ;
    public final void rule__ThenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1475:1: ( rule__ThenStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1476:2: rule__ThenStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__23019);
            rule__ThenStep__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ThenStep__Group__2"


    // $ANTLR start "rule__ThenStep__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1482:1: rule__ThenStep__Group__2__Impl : ( ( rule__ThenStep__DescAssignment_2 )* ) ;
    public final void rule__ThenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1486:1: ( ( ( rule__ThenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1487:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1487:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1488:1: ( rule__ThenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1489:1: ( rule__ThenStep__DescAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_TEXT && LA21_0<=RULE_CODE)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1489:2: rule__ThenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__DescAssignment_2_in_rule__ThenStep__Group__2__Impl3046);
            	    rule__ThenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getDescAssignment_2()); 

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
    // $ANTLR end "rule__ThenStep__Group__2__Impl"


    // $ANTLR start "rule__GivenStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1505:1: rule__GivenStep__Group__0 : rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 ;
    public final void rule__GivenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1509:1: ( rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1510:2: rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__03083);
            rule__GivenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__03086);
            rule__GivenStep__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__GivenStep__Group__0"


    // $ANTLR start "rule__GivenStep__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1517:1: rule__GivenStep__Group__0__Impl : ( ( rule__GivenStep__TagsAssignment_0 )* ) ;
    public final void rule__GivenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1521:1: ( ( ( rule__GivenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1522:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1522:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1523:1: ( rule__GivenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1524:1: ( rule__GivenStep__TagsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TAG) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1524:2: rule__GivenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl3113);
            	    rule__GivenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__GivenStep__Group__0__Impl"


    // $ANTLR start "rule__GivenStep__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1534:1: rule__GivenStep__Group__1 : rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 ;
    public final void rule__GivenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1538:1: ( rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1539:2: rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13144);
            rule__GivenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13147);
            rule__GivenStep__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__GivenStep__Group__1"


    // $ANTLR start "rule__GivenStep__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1546:1: rule__GivenStep__Group__1__Impl : ( ( rule__GivenStep__DescAssignment_1 ) ) ;
    public final void rule__GivenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1550:1: ( ( ( rule__GivenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1551:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1551:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1552:1: ( rule__GivenStep__DescAssignment_1 )
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1553:1: ( rule__GivenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1553:2: rule__GivenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3174);
            rule__GivenStep__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__GivenStep__Group__1__Impl"


    // $ANTLR start "rule__GivenStep__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1563:1: rule__GivenStep__Group__2 : rule__GivenStep__Group__2__Impl ;
    public final void rule__GivenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1567:1: ( rule__GivenStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1568:2: rule__GivenStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23204);
            rule__GivenStep__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GivenStep__Group__2"


    // $ANTLR start "rule__GivenStep__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1574:1: rule__GivenStep__Group__2__Impl : ( ( rule__GivenStep__DescAssignment_2 )* ) ;
    public final void rule__GivenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1578:1: ( ( ( rule__GivenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1579:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1579:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1580:1: ( rule__GivenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1581:1: ( rule__GivenStep__DescAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_TEXT && LA23_0<=RULE_CODE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1581:2: rule__GivenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__DescAssignment_2_in_rule__GivenStep__Group__2__Impl3231);
            	    rule__GivenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getDescAssignment_2()); 

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
    // $ANTLR end "rule__GivenStep__Group__2__Impl"


    // $ANTLR start "rule__AndStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1597:1: rule__AndStep__Group__0 : rule__AndStep__Group__0__Impl rule__AndStep__Group__1 ;
    public final void rule__AndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1601:1: ( rule__AndStep__Group__0__Impl rule__AndStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1602:2: rule__AndStep__Group__0__Impl rule__AndStep__Group__1
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03268);
            rule__AndStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03271);
            rule__AndStep__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AndStep__Group__0"


    // $ANTLR start "rule__AndStep__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1609:1: rule__AndStep__Group__0__Impl : ( ( rule__AndStep__DescAssignment_0 ) ) ;
    public final void rule__AndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1613:1: ( ( ( rule__AndStep__DescAssignment_0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1614:1: ( ( rule__AndStep__DescAssignment_0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1614:1: ( ( rule__AndStep__DescAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1615:1: ( rule__AndStep__DescAssignment_0 )
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1616:1: ( rule__AndStep__DescAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1616:2: rule__AndStep__DescAssignment_0
            {
            pushFollow(FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3298);
            rule__AndStep__DescAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndStepAccess().getDescAssignment_0()); 

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
    // $ANTLR end "rule__AndStep__Group__0__Impl"


    // $ANTLR start "rule__AndStep__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1626:1: rule__AndStep__Group__1 : rule__AndStep__Group__1__Impl ;
    public final void rule__AndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1630:1: ( rule__AndStep__Group__1__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1631:2: rule__AndStep__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13328);
            rule__AndStep__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AndStep__Group__1"


    // $ANTLR start "rule__AndStep__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1637:1: rule__AndStep__Group__1__Impl : ( ( rule__AndStep__DescAssignment_1 )* ) ;
    public final void rule__AndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1641:1: ( ( ( rule__AndStep__DescAssignment_1 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1642:1: ( ( rule__AndStep__DescAssignment_1 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1642:1: ( ( rule__AndStep__DescAssignment_1 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:1: ( rule__AndStep__DescAssignment_1 )*
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1644:1: ( rule__AndStep__DescAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_TEXT && LA24_0<=RULE_CODE)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1644:2: rule__AndStep__DescAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AndStep__DescAssignment_1_in_rule__AndStep__Group__1__Impl3355);
            	    rule__AndStep__DescAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAndStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__AndStep__Group__1__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1659:1: rule__Feature__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1663:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1664:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1664:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1665:1: RULE_TAG
            {
             before(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03395); 
             after(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__TagsAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1674:1: rule__Feature__NameAssignment_1 : ( RULE_FEATURE_TEXT ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1678:1: ( ( RULE_FEATURE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1679:1: ( RULE_FEATURE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1679:1: ( RULE_FEATURE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1680:1: RULE_FEATURE_TEXT
            {
             before(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_FEATURE_TEXT,FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13426); 
             after(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__ElementsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1689:1: rule__Feature__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Feature__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1693:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1694:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1694:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1695:1: ruleNarrativeElement
            {
             before(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23457);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Feature__ElementsAssignment_2"


    // $ANTLR start "rule__Feature__ScenariosAssignment_3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1704:1: rule__Feature__ScenariosAssignment_3 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1708:1: ( ( ruleAbstractScenario ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1709:1: ( ruleAbstractScenario )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1709:1: ( ruleAbstractScenario )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1710:1: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33488);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__ScenariosAssignment_3"


    // $ANTLR start "rule__FreeText__NameAssignment"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1719:1: rule__FreeText__NameAssignment : ( RULE_TEXT ) ;
    public final void rule__FreeText__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1723:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1724:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1724:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1725:1: RULE_TEXT
            {
             before(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3519); 
             after(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FreeText__NameAssignment"


    // $ANTLR start "rule__AsA__NameAssignment"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1734:1: rule__AsA__NameAssignment : ( RULE_AS_A ) ;
    public final void rule__AsA__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1738:1: ( ( RULE_AS_A ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1739:1: ( RULE_AS_A )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1739:1: ( RULE_AS_A )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1740:1: RULE_AS_A
            {
             before(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
            match(input,RULE_AS_A,FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3550); 
             after(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 

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
    // $ANTLR end "rule__AsA__NameAssignment"


    // $ANTLR start "rule__InOrderTo__NameAssignment"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1749:1: rule__InOrderTo__NameAssignment : ( RULE_IN_ORDER_TO ) ;
    public final void rule__InOrderTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1753:1: ( ( RULE_IN_ORDER_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1754:1: ( RULE_IN_ORDER_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1754:1: ( RULE_IN_ORDER_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1755:1: RULE_IN_ORDER_TO
            {
             before(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
            match(input,RULE_IN_ORDER_TO,FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3581); 
             after(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__InOrderTo__NameAssignment"


    // $ANTLR start "rule__IWantTo__NameAssignment"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: rule__IWantTo__NameAssignment : ( RULE_I_WANT_TO ) ;
    public final void rule__IWantTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1768:1: ( ( RULE_I_WANT_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1769:1: ( RULE_I_WANT_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1769:1: ( RULE_I_WANT_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1770:1: RULE_I_WANT_TO
            {
             before(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
            match(input,RULE_I_WANT_TO,FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3612); 
             after(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IWantTo__NameAssignment"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1779:1: rule__Scenario__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1783:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1784:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1784:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1785:1: RULE_TAG
            {
             before(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_03643); 
             after(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Scenario__TagsAssignment_0"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: rule__Scenario__NameAssignment_1 : ( RULE_SCENARIO_TEXT ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1798:1: ( ( RULE_SCENARIO_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1799:1: ( RULE_SCENARIO_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1799:1: ( RULE_SCENARIO_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1800:1: RULE_SCENARIO_TEXT
            {
             before(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_13674); 
             after(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__ElementsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1809:1: rule__Scenario__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Scenario__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1813:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1814:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1814:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1815:1: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Scenario__ElementsAssignment_23705);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenario__ElementsAssignment_2"


    // $ANTLR start "rule__Scenario__StepsAssignment_3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1824:1: rule__Scenario__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1828:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1829:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1829:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1830:1: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_33736);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__StepsAssignment_3"


    // $ANTLR start "rule__ScenarioWithOutline__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1839:1: rule__ScenarioWithOutline__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ScenarioWithOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1843:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1844:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1844:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1845:1: RULE_TAG
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_03767); 
             after(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__TagsAssignment_0"


    // $ANTLR start "rule__ScenarioWithOutline__NameAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1854:1: rule__ScenarioWithOutline__NameAssignment_1 : ( RULE_SCENARIO_OUTLINE_TEXT ) ;
    public final void rule__ScenarioWithOutline__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1858:1: ( ( RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1859:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1859:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1860:1: RULE_SCENARIO_OUTLINE_TEXT
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_13798); 
             after(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__NameAssignment_1"


    // $ANTLR start "rule__ScenarioWithOutline__ElementsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1869:1: rule__ScenarioWithOutline__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__ScenarioWithOutline__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1873:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1874:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1874:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1875:1: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__ScenarioWithOutline__ElementsAssignment_23829);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__ElementsAssignment_2"


    // $ANTLR start "rule__ScenarioWithOutline__StepsAssignment_3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1884:1: rule__ScenarioWithOutline__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__ScenarioWithOutline__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1888:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1889:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1889:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1890:1: ruleStep
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_33860);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__StepsAssignment_3"


    // $ANTLR start "rule__ScenarioWithOutline__HeadingAssignment_5"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1899:1: rule__ScenarioWithOutline__HeadingAssignment_5 : ( ruleExampleRow ) ;
    public final void rule__ScenarioWithOutline__HeadingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1903:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1904:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1904:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1905:1: ruleExampleRow
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__HeadingAssignment_53891);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__HeadingAssignment_5"


    // $ANTLR start "rule__ScenarioWithOutline__RowsAssignment_6"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1914:1: rule__ScenarioWithOutline__RowsAssignment_6 : ( ruleExampleRow ) ;
    public final void rule__ScenarioWithOutline__RowsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1918:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1919:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1919:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1920:1: ruleExampleRow
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__RowsAssignment_63922);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__RowsAssignment_6"


    // $ANTLR start "rule__ExampleRow__CellsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1929:1: rule__ExampleRow__CellsAssignment_0 : ( ruleExampleCell ) ;
    public final void rule__ExampleRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1933:1: ( ( ruleExampleCell ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1934:1: ( ruleExampleCell )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1934:1: ( ruleExampleCell )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1935:1: ruleExampleCell
            {
             before(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExampleCell_in_rule__ExampleRow__CellsAssignment_03953);
            ruleExampleCell();

            state._fsp--;

             after(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExampleRow__CellsAssignment_0"


    // $ANTLR start "rule__ExampleCell__ValueAssignment"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1944:1: rule__ExampleCell__ValueAssignment : ( RULE_EXAMPLE_CELL ) ;
    public final void rule__ExampleCell__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1948:1: ( ( RULE_EXAMPLE_CELL ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1949:1: ( RULE_EXAMPLE_CELL )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1949:1: ( RULE_EXAMPLE_CELL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1950:1: RULE_EXAMPLE_CELL
            {
             before(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 
            match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleCell__ValueAssignment3984); 
             after(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ExampleCell__ValueAssignment"


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1959:1: rule__Background__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1963:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1964:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1964:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1965:1: RULE_TAG
            {
             before(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_04015); 
             after(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Background__TagsAssignment_0"


    // $ANTLR start "rule__Background__NameAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1974:1: rule__Background__NameAssignment_1 : ( RULE_BACKGROUND_TEXT ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1978:1: ( ( RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1979:1: ( RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1979:1: ( RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1980:1: RULE_BACKGROUND_TEXT
            {
             before(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_14046); 
             after(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Background__NameAssignment_1"


    // $ANTLR start "rule__Background__StepsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1989:1: rule__Background__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1993:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1994:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1994:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1995:1: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Background__StepsAssignment_24077);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Background__StepsAssignment_2"


    // $ANTLR start "rule__WhenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2004:1: rule__WhenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__WhenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2008:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2009:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2009:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2010:1: RULE_TAG
            {
             before(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_04108); 
             after(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__WhenStep__TagsAssignment_0"


    // $ANTLR start "rule__WhenStep__DescAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2019:1: rule__WhenStep__DescAssignment_1 : ( RULE_WHEN_TEXT ) ;
    public final void rule__WhenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2023:1: ( ( RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2024:1: ( RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2024:1: ( RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2025:1: RULE_WHEN_TEXT
            {
             before(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_14139); 
             after(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhenStep__DescAssignment_1"


    // $ANTLR start "rule__WhenStep__DescAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2034:1: rule__WhenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__WhenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2038:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2039:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2039:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2040:1: ruleOptionalText
            {
             before(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__WhenStep__DescAssignment_24170);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WhenStep__DescAssignment_2"


    // $ANTLR start "rule__ThenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2049:1: rule__ThenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ThenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2053:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2054:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2054:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2055:1: RULE_TAG
            {
             before(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04201); 
             after(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ThenStep__TagsAssignment_0"


    // $ANTLR start "rule__ThenStep__DescAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2064:1: rule__ThenStep__DescAssignment_1 : ( RULE_THEN_TEXT ) ;
    public final void rule__ThenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2068:1: ( ( RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2069:1: ( RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2069:1: ( RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2070:1: RULE_THEN_TEXT
            {
             before(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14232); 
             after(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ThenStep__DescAssignment_1"


    // $ANTLR start "rule__ThenStep__DescAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2079:1: rule__ThenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__ThenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2083:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2085:1: ruleOptionalText
            {
             before(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__ThenStep__DescAssignment_24263);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ThenStep__DescAssignment_2"


    // $ANTLR start "rule__GivenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2094:1: rule__GivenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__GivenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2098:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2099:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2099:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:1: RULE_TAG
            {
             before(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04294); 
             after(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__GivenStep__TagsAssignment_0"


    // $ANTLR start "rule__GivenStep__DescAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2109:1: rule__GivenStep__DescAssignment_1 : ( RULE_GIVEN_TEXT ) ;
    public final void rule__GivenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2113:1: ( ( RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2114:1: ( RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2114:1: ( RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2115:1: RULE_GIVEN_TEXT
            {
             before(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14325); 
             after(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GivenStep__DescAssignment_1"


    // $ANTLR start "rule__GivenStep__DescAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2124:1: rule__GivenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__GivenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2128:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2130:1: ruleOptionalText
            {
             before(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__GivenStep__DescAssignment_24356);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GivenStep__DescAssignment_2"


    // $ANTLR start "rule__AndStep__DescAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2139:1: rule__AndStep__DescAssignment_0 : ( RULE_AND_TEXT ) ;
    public final void rule__AndStep__DescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2143:1: ( ( RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2144:1: ( RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2144:1: ( RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:1: RULE_AND_TEXT
            {
             before(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
            match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04387); 
             after(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AndStep__DescAssignment_0"


    // $ANTLR start "rule__AndStep__DescAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2154:1: rule__AndStep__DescAssignment_1 : ( ruleOptionalText ) ;
    public final void rule__AndStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2158:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2159:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2159:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2160:1: ruleOptionalText
            {
             before(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__AndStep__DescAssignment_14418);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AndStep__DescAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA2_eotS =
        "\5\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\2\10\3\uffff";
    static final String DFA2_maxS =
        "\2\20\3\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "599:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );";
        }
    }
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\2\10\4\uffff";
    static final String DFA3_maxS =
        "\1\24\1\23\4\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\10\uffff\1\2\1\3\1\4\1\5",
            "\1\1\10\uffff\1\2\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "627:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );";
        }
    }
    static final String DFA10_eotS =
        "\4\uffff";
    static final String DFA10_eofS =
        "\1\1\3\uffff";
    static final String DFA10_minS =
        "\1\10\1\uffff\1\10\1\uffff";
    static final String DFA10_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA10_specialS =
        "\4\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\4\uffff\2\1\1\uffff\1\1\4\3",
            "",
            "\1\2\4\uffff\2\1\1\uffff\1\1\3\3",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 919:1: ( rule__Scenario__StepsAssignment_3 )*";
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\1\1\3\uffff";
    static final String DFA17_minS =
        "\1\10\1\uffff\1\10\1\uffff";
    static final String DFA17_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\4\uffff\2\1\1\uffff\1\1\4\3",
            "",
            "\1\2\4\uffff\2\1\1\uffff\1\1\3\3",
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
            return "()* loopback of 1305:1: ( rule__Background__StepsAssignment_2 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_entryRuleNarrativeElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNarrativeElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NarrativeElement__Alternatives_in_ruleNarrativeElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_entryRuleFreeText181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeText188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeText__NameAssignment_in_ruleFreeText214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_entryRuleAsA241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsA248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsA__NameAssignment_in_ruleAsA274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_entryRuleInOrderTo301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOrderTo308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOrderTo__NameAssignment_in_ruleInOrderTo334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_entryRuleIWantTo361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIWantTo368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IWantTo__NameAssignment_in_ruleIWantTo394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_entryRuleAbstractScenario421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractScenario428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractScenario__Alternatives_in_ruleAbstractScenario454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_entryRuleScenarioWithOutline541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioWithOutline548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__0_in_ruleScenarioWithOutline574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_entryRuleExampleRow601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleRow608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__0_in_ruleExampleRow634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_entryRuleExampleCell661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleCell668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleCell__ValueAssignment_in_ruleExampleCell694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0_in_ruleBackground754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_entryRuleWhenStep841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenStep848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0_in_ruleWhenStep874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_entryRuleThenStep901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenStep908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0_in_ruleThenStep934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_entryRuleGivenStep961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGivenStep968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0_in_ruleGivenStep994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_entryRuleAndStep1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndStep1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0_in_ruleAndStep1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_entryRuleOptionalText1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalText1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalText__Alternatives_in_ruleOptionalText1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_rule__NarrativeElement__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_rule__NarrativeElement__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_rule__NarrativeElement__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_rule__NarrativeElement__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_rule__AbstractScenario__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__AbstractScenario__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_rule__AbstractScenario__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_rule__Step__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_rule__Step__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_rule__Step__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_rule__Step__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__OptionalText__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_rule__OptionalText__Alternatives1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01429 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1459 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11490 = new BitSet(new long[]{0x0000000000017D10L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21550 = new BitSet(new long[]{0x0000000000017D10L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1580 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1638 = new BitSet(new long[]{0x0000000000016102L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01677 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11738 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21798 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ElementsAssignment_2_in_rule__Scenario__Group__2__Impl1828 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1888 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1900 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__01941 = new BitSet(new long[]{0x0000000000016100L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__01944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl1971 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__12002 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22062 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__ElementsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2092 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2155 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2167 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42200 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__5_in_rule__ScenarioWithOutline__Group__42203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_rule__ScenarioWithOutline__Group__4__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__5__Impl_in_rule__ScenarioWithOutline__Group__52259 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__6_in_rule__ScenarioWithOutline__Group__52262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__HeadingAssignment_5_in_rule__ScenarioWithOutline__Group__5__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__6__Impl_in_rule__ScenarioWithOutline__Group__62319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__RowsAssignment_6_in_rule__ScenarioWithOutline__Group__6__Impl2346 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02391 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2423 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2435 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02528 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2558 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12589 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2676 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02713 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2743 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12774 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_2_in_rule__WhenStep__Group__2__Impl2861 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__02898 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__02901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl2928 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__12959 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__23019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_2_in_rule__ThenStep__Group__2__Impl3046 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__03083 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__03086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl3113 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13144 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_2_in_rule__GivenStep__Group__2__Impl3231 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03268 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_1_in_rule__AndStep__Group__1__Impl3355 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_03643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Scenario__ElementsAssignment_23705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_33736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_03767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__ScenarioWithOutline__ElementsAssignment_23829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_33860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__HeadingAssignment_53891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__RowsAssignment_63922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_rule__ExampleRow__CellsAssignment_03953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleCell__ValueAssignment3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_04015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Background__StepsAssignment_24077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_04108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__WhenStep__DescAssignment_24170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__ThenStep__DescAssignment_24263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__GivenStep__DescAssignment_24356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__AndStep__DescAssignment_14418 = new BitSet(new long[]{0x0000000000000002L});

}