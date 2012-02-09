package de.sebastianbenz.xgherkin.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:60:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:61:1: ( ruleFeature EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:62:1: ruleFeature EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:69:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:73:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:74:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:74:1: ( ( rule__Feature__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:75:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:76:1: ( rule__Feature__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:76:2: rule__Feature__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:88:1: entryRuleNarrativeElement : ruleNarrativeElement EOF ;
    public final void entryRuleNarrativeElement() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:89:1: ( ruleNarrativeElement EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:90:1: ruleNarrativeElement EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:97:1: ruleNarrativeElement : ( ( rule__NarrativeElement__Alternatives ) ) ;
    public final void ruleNarrativeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:101:2: ( ( ( rule__NarrativeElement__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:102:1: ( ( rule__NarrativeElement__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:102:1: ( ( rule__NarrativeElement__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:103:1: ( rule__NarrativeElement__Alternatives )
            {
             before(grammarAccess.getNarrativeElementAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:104:1: ( rule__NarrativeElement__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:104:2: rule__NarrativeElement__Alternatives
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:116:1: entryRuleFreeText : ruleFreeText EOF ;
    public final void entryRuleFreeText() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:117:1: ( ruleFreeText EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:118:1: ruleFreeText EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:125:1: ruleFreeText : ( ( rule__FreeText__NameAssignment ) ) ;
    public final void ruleFreeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:129:2: ( ( ( rule__FreeText__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:130:1: ( ( rule__FreeText__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:130:1: ( ( rule__FreeText__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:131:1: ( rule__FreeText__NameAssignment )
            {
             before(grammarAccess.getFreeTextAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:132:1: ( rule__FreeText__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:132:2: rule__FreeText__NameAssignment
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:144:1: entryRuleAsA : ruleAsA EOF ;
    public final void entryRuleAsA() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:145:1: ( ruleAsA EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:146:1: ruleAsA EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:153:1: ruleAsA : ( ( rule__AsA__NameAssignment ) ) ;
    public final void ruleAsA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:157:2: ( ( ( rule__AsA__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:158:1: ( ( rule__AsA__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:158:1: ( ( rule__AsA__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:159:1: ( rule__AsA__NameAssignment )
            {
             before(grammarAccess.getAsAAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:160:1: ( rule__AsA__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:160:2: rule__AsA__NameAssignment
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:172:1: entryRuleInOrderTo : ruleInOrderTo EOF ;
    public final void entryRuleInOrderTo() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:173:1: ( ruleInOrderTo EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:174:1: ruleInOrderTo EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:181:1: ruleInOrderTo : ( ( rule__InOrderTo__NameAssignment ) ) ;
    public final void ruleInOrderTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:185:2: ( ( ( rule__InOrderTo__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:186:1: ( ( rule__InOrderTo__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:186:1: ( ( rule__InOrderTo__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:187:1: ( rule__InOrderTo__NameAssignment )
            {
             before(grammarAccess.getInOrderToAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:188:1: ( rule__InOrderTo__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:188:2: rule__InOrderTo__NameAssignment
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:200:1: entryRuleIWantTo : ruleIWantTo EOF ;
    public final void entryRuleIWantTo() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:201:1: ( ruleIWantTo EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:202:1: ruleIWantTo EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:209:1: ruleIWantTo : ( ( rule__IWantTo__NameAssignment ) ) ;
    public final void ruleIWantTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:213:2: ( ( ( rule__IWantTo__NameAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:214:1: ( ( rule__IWantTo__NameAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:214:1: ( ( rule__IWantTo__NameAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:215:1: ( rule__IWantTo__NameAssignment )
            {
             before(grammarAccess.getIWantToAccess().getNameAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:216:1: ( rule__IWantTo__NameAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:216:2: rule__IWantTo__NameAssignment
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:228:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:229:1: ( ruleAbstractScenario EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:230:1: ruleAbstractScenario EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:237:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:241:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:242:1: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:242:1: ( ( rule__AbstractScenario__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:243:1: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:244:1: ( rule__AbstractScenario__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:244:2: rule__AbstractScenario__Alternatives
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:256:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:257:1: ( ruleScenario EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:258:1: ruleScenario EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:265:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:269:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:270:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:270:1: ( ( rule__Scenario__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:271:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:272:1: ( rule__Scenario__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:272:2: rule__Scenario__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:284:1: entryRuleScenarioWithOutline : ruleScenarioWithOutline EOF ;
    public final void entryRuleScenarioWithOutline() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:285:1: ( ruleScenarioWithOutline EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:286:1: ruleScenarioWithOutline EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:293:1: ruleScenarioWithOutline : ( ( rule__ScenarioWithOutline__Group__0 ) ) ;
    public final void ruleScenarioWithOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:297:2: ( ( ( rule__ScenarioWithOutline__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:298:1: ( ( rule__ScenarioWithOutline__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:298:1: ( ( rule__ScenarioWithOutline__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:299:1: ( rule__ScenarioWithOutline__Group__0 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:300:1: ( rule__ScenarioWithOutline__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:300:2: rule__ScenarioWithOutline__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:312:1: entryRuleExampleRow : ruleExampleRow EOF ;
    public final void entryRuleExampleRow() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:313:1: ( ruleExampleRow EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:314:1: ruleExampleRow EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:321:1: ruleExampleRow : ( ( rule__ExampleRow__Group__0 ) ) ;
    public final void ruleExampleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:325:2: ( ( ( rule__ExampleRow__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:326:1: ( ( rule__ExampleRow__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:326:1: ( ( rule__ExampleRow__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:327:1: ( rule__ExampleRow__Group__0 )
            {
             before(grammarAccess.getExampleRowAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:328:1: ( rule__ExampleRow__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:328:2: rule__ExampleRow__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:340:1: entryRuleExampleCell : ruleExampleCell EOF ;
    public final void entryRuleExampleCell() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:341:1: ( ruleExampleCell EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:342:1: ruleExampleCell EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:349:1: ruleExampleCell : ( ( rule__ExampleCell__ValueAssignment ) ) ;
    public final void ruleExampleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:353:2: ( ( ( rule__ExampleCell__ValueAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:354:1: ( ( rule__ExampleCell__ValueAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:354:1: ( ( rule__ExampleCell__ValueAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:355:1: ( rule__ExampleCell__ValueAssignment )
            {
             before(grammarAccess.getExampleCellAccess().getValueAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:356:1: ( rule__ExampleCell__ValueAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:356:2: rule__ExampleCell__ValueAssignment
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:368:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:369:1: ( ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:370:1: ruleBackground EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:377:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:381:2: ( ( ( rule__Background__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:382:1: ( ( rule__Background__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:382:1: ( ( rule__Background__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:384:1: ( rule__Background__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:384:2: rule__Background__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:396:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:397:1: ( ruleStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:398:1: ruleStep EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:405:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:409:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:410:1: ( ( rule__Step__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:410:1: ( ( rule__Step__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:412:1: ( rule__Step__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:412:2: rule__Step__Alternatives
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:424:1: entryRuleWhenStep : ruleWhenStep EOF ;
    public final void entryRuleWhenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:425:1: ( ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:426:1: ruleWhenStep EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:433:1: ruleWhenStep : ( ( rule__WhenStep__Group__0 ) ) ;
    public final void ruleWhenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:437:2: ( ( ( rule__WhenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:438:1: ( ( rule__WhenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:438:1: ( ( rule__WhenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:439:1: ( rule__WhenStep__Group__0 )
            {
             before(grammarAccess.getWhenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:440:1: ( rule__WhenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:440:2: rule__WhenStep__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:452:1: entryRuleThenStep : ruleThenStep EOF ;
    public final void entryRuleThenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:453:1: ( ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:454:1: ruleThenStep EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:461:1: ruleThenStep : ( ( rule__ThenStep__Group__0 ) ) ;
    public final void ruleThenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:465:2: ( ( ( rule__ThenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:466:1: ( ( rule__ThenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:466:1: ( ( rule__ThenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:467:1: ( rule__ThenStep__Group__0 )
            {
             before(grammarAccess.getThenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:468:1: ( rule__ThenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:468:2: rule__ThenStep__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:480:1: entryRuleGivenStep : ruleGivenStep EOF ;
    public final void entryRuleGivenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:481:1: ( ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:482:1: ruleGivenStep EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:489:1: ruleGivenStep : ( ( rule__GivenStep__Group__0 ) ) ;
    public final void ruleGivenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:493:2: ( ( ( rule__GivenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:494:1: ( ( rule__GivenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:494:1: ( ( rule__GivenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( rule__GivenStep__Group__0 )
            {
             before(grammarAccess.getGivenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:496:1: ( rule__GivenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:496:2: rule__GivenStep__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:508:1: entryRuleAndStep : ruleAndStep EOF ;
    public final void entryRuleAndStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:509:1: ( ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:510:1: ruleAndStep EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:517:1: ruleAndStep : ( ( rule__AndStep__Group__0 ) ) ;
    public final void ruleAndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:521:2: ( ( ( rule__AndStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:522:1: ( ( rule__AndStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:522:1: ( ( rule__AndStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:523:1: ( rule__AndStep__Group__0 )
            {
             before(grammarAccess.getAndStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:524:1: ( rule__AndStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:524:2: rule__AndStep__Group__0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:536:1: entryRuleOptionalText : ruleOptionalText EOF ;
    public final void entryRuleOptionalText() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:537:1: ( ruleOptionalText EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:538:1: ruleOptionalText EOF
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:545:1: ruleOptionalText : ( ( rule__OptionalText__Alternatives ) ) ;
    public final void ruleOptionalText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:549:2: ( ( ( rule__OptionalText__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:550:1: ( ( rule__OptionalText__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:550:1: ( ( rule__OptionalText__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:551:1: ( rule__OptionalText__Alternatives )
            {
             before(grammarAccess.getOptionalTextAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:552:1: ( rule__OptionalText__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:552:2: rule__OptionalText__Alternatives
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:564:1: rule__NarrativeElement__Alternatives : ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) );
    public final void rule__NarrativeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:568:1: ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) )
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:569:1: ( ruleInOrderTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:569:1: ( ruleInOrderTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:570:1: ruleInOrderTo
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:575:6: ( ruleAsA )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:575:6: ( ruleAsA )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:576:1: ruleAsA
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:581:6: ( ruleIWantTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:581:6: ( ruleIWantTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:582:1: ruleIWantTo
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:587:6: ( ruleFreeText )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:587:6: ( ruleFreeText )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:588:1: ruleFreeText
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:598:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:602:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:603:1: ( ruleBackground )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:603:1: ( ruleBackground )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:604:1: ruleBackground
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:609:6: ( ruleScenario )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:609:6: ( ruleScenario )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:610:1: ruleScenario
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:615:6: ( ruleScenarioWithOutline )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:615:6: ( ruleScenarioWithOutline )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:616:1: ruleScenarioWithOutline
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:626:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:630:1: ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:631:1: ( ruleWhenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:631:1: ( ruleWhenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:632:1: ruleWhenStep
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:637:6: ( ruleThenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:637:6: ( ruleThenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:638:1: ruleThenStep
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:643:6: ( ruleGivenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:643:6: ( ruleGivenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:644:1: ruleGivenStep
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:649:6: ( ruleAndStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:649:6: ( ruleAndStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:650:1: ruleAndStep
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:660:1: rule__OptionalText__Alternatives : ( ( RULE_TEXT ) | ( RULE_CODE ) );
    public final void rule__OptionalText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:664:1: ( ( RULE_TEXT ) | ( RULE_CODE ) )
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:665:1: ( RULE_TEXT )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:665:1: ( RULE_TEXT )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:666:1: RULE_TEXT
                    {
                     before(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
                    match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__OptionalText__Alternatives1382); 
                     after(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:671:6: ( RULE_CODE )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:671:6: ( RULE_CODE )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:672:1: RULE_CODE
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:684:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:688:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:689:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:696:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:700:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:701:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:701:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:702:1: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:703:1: ( rule__Feature__TagsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:703:2: rule__Feature__TagsAssignment_0
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:713:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:717:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:718:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:725:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:729:1: ( ( ( rule__Feature__NameAssignment_1 )? ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:730:1: ( ( rule__Feature__NameAssignment_1 )? )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:730:1: ( ( rule__Feature__NameAssignment_1 )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( rule__Feature__NameAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:732:1: ( rule__Feature__NameAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_FEATURE_TEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:732:2: rule__Feature__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1520);
                    rule__Feature__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:742:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:746:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:747:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21551);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21554);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:754:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ElementsAssignment_2 )* ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:758:1: ( ( ( rule__Feature__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:759:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:759:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:760:1: ( rule__Feature__ElementsAssignment_2 )*
            {
             before(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:761:1: ( rule__Feature__ElementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TEXT||(LA7_0>=RULE_AS_A && LA7_0<=RULE_I_WANT_TO)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:761:2: rule__Feature__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1581);
            	    rule__Feature__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:771:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:775:1: ( rule__Feature__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:776:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31612);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:782:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__ScenariosAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:786:1: ( ( ( rule__Feature__ScenariosAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:787:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:787:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:788:1: ( rule__Feature__ScenariosAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:789:1: ( rule__Feature__ScenariosAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TAG||(LA8_0>=RULE_SCENARIO_TEXT && LA8_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA8_0==RULE_BACKGROUND_TEXT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:789:2: rule__Feature__ScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1639);
            	    rule__Feature__ScenariosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:807:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:811:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:812:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01678);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01681);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:819:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:823:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:824:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:824:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:825:1: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:826:1: ( rule__Scenario__TagsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TAG) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:826:2: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1708);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:836:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:840:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:841:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11739);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11742);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:848:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:852:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:853:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:853:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:854:1: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:855:1: ( rule__Scenario__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:855:2: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1769);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:865:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:869:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:870:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21799);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21802);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:877:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__ElementsAssignment_2 )* ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:881:1: ( ( ( rule__Scenario__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:882:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:882:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:883:1: ( rule__Scenario__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:884:1: ( rule__Scenario__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TEXT||(LA10_0>=RULE_AS_A && LA10_0<=RULE_I_WANT_TO)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:884:2: rule__Scenario__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__ElementsAssignment_2_in_rule__Scenario__Group__2__Impl1829);
            	    rule__Scenario__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:894:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:898:1: ( rule__Scenario__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:899:2: rule__Scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31860);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:905:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:909:1: ( ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:911:1: ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:911:1: ( ( rule__Scenario__StepsAssignment_3 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:912:1: ( rule__Scenario__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:913:1: ( rule__Scenario__StepsAssignment_3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:913:2: rule__Scenario__StepsAssignment_3
            {
            pushFollow(FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1889);
            rule__Scenario__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:916:1: ( ( rule__Scenario__StepsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:917:1: ( rule__Scenario__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:918:1: ( rule__Scenario__StepsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:918:2: rule__Scenario__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1901);
            	    rule__Scenario__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:937:1: rule__ScenarioWithOutline__Group__0 : rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 ;
    public final void rule__ScenarioWithOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:941:1: ( rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:942:2: rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__01942);
            rule__ScenarioWithOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__01945);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:949:1: rule__ScenarioWithOutline__Group__0__Impl : ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioWithOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:953:1: ( ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:954:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:954:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:955:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:956:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:956:2: rule__ScenarioWithOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl1972);
            	    rule__ScenarioWithOutline__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:966:1: rule__ScenarioWithOutline__Group__1 : rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 ;
    public final void rule__ScenarioWithOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:970:1: ( rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:971:2: rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__12003);
            rule__ScenarioWithOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__12006);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:978:1: rule__ScenarioWithOutline__Group__1__Impl : ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) ;
    public final void rule__ScenarioWithOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:982:1: ( ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:983:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:983:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:984:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:985:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:985:2: rule__ScenarioWithOutline__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl2033);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:995:1: rule__ScenarioWithOutline__Group__2 : rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 ;
    public final void rule__ScenarioWithOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:999:1: ( rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1000:2: rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22063);
            rule__ScenarioWithOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22066);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1007:1: rule__ScenarioWithOutline__Group__2__Impl : ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) ;
    public final void rule__ScenarioWithOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1011:1: ( ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1014:1: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TEXT||(LA13_0>=RULE_AS_A && LA13_0<=RULE_I_WANT_TO)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1014:2: rule__ScenarioWithOutline__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__ElementsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2093);
            	    rule__ScenarioWithOutline__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1024:1: rule__ScenarioWithOutline__Group__3 : rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 ;
    public final void rule__ScenarioWithOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1028:1: ( rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1029:2: rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32124);
            rule__ScenarioWithOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32127);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1036:1: rule__ScenarioWithOutline__Group__3__Impl : ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) ;
    public final void rule__ScenarioWithOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1040:1: ( ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1043:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1044:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1044:2: rule__ScenarioWithOutline__StepsAssignment_3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2156);
            rule__ScenarioWithOutline__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1047:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1048:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1049:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TAG||(LA14_0>=RULE_WHEN_TEXT && LA14_0<=RULE_AND_TEXT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1049:2: rule__ScenarioWithOutline__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2168);
            	    rule__ScenarioWithOutline__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1060:1: rule__ScenarioWithOutline__Group__4 : rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5 ;
    public final void rule__ScenarioWithOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1064:1: ( rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1065:2: rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42201);
            rule__ScenarioWithOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__5_in_rule__ScenarioWithOutline__Group__42204);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1072:1: rule__ScenarioWithOutline__Group__4__Impl : ( RULE_EXAMPLE_HEADING ) ;
    public final void rule__ScenarioWithOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1076:1: ( ( RULE_EXAMPLE_HEADING ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1077:1: ( RULE_EXAMPLE_HEADING )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1077:1: ( RULE_EXAMPLE_HEADING )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1078:1: RULE_EXAMPLE_HEADING
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_4()); 
            match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_rule__ScenarioWithOutline__Group__4__Impl2231); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1089:1: rule__ScenarioWithOutline__Group__5 : rule__ScenarioWithOutline__Group__5__Impl rule__ScenarioWithOutline__Group__6 ;
    public final void rule__ScenarioWithOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1093:1: ( rule__ScenarioWithOutline__Group__5__Impl rule__ScenarioWithOutline__Group__6 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1094:2: rule__ScenarioWithOutline__Group__5__Impl rule__ScenarioWithOutline__Group__6
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__5__Impl_in_rule__ScenarioWithOutline__Group__52260);
            rule__ScenarioWithOutline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__6_in_rule__ScenarioWithOutline__Group__52263);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1101:1: rule__ScenarioWithOutline__Group__5__Impl : ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) ) ;
    public final void rule__ScenarioWithOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1105:1: ( ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1106:1: ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1106:1: ( ( rule__ScenarioWithOutline__HeadingAssignment_5 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1107:1: ( rule__ScenarioWithOutline__HeadingAssignment_5 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getHeadingAssignment_5()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1108:1: ( rule__ScenarioWithOutline__HeadingAssignment_5 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1108:2: rule__ScenarioWithOutline__HeadingAssignment_5
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__HeadingAssignment_5_in_rule__ScenarioWithOutline__Group__5__Impl2290);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1118:1: rule__ScenarioWithOutline__Group__6 : rule__ScenarioWithOutline__Group__6__Impl ;
    public final void rule__ScenarioWithOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1122:1: ( rule__ScenarioWithOutline__Group__6__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1123:2: rule__ScenarioWithOutline__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__6__Impl_in_rule__ScenarioWithOutline__Group__62320);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1129:1: rule__ScenarioWithOutline__Group__6__Impl : ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* ) ;
    public final void rule__ScenarioWithOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1133:1: ( ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1134:1: ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1134:1: ( ( rule__ScenarioWithOutline__RowsAssignment_6 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1135:1: ( rule__ScenarioWithOutline__RowsAssignment_6 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getRowsAssignment_6()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1136:1: ( rule__ScenarioWithOutline__RowsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EXAMPLE_CELL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1136:2: rule__ScenarioWithOutline__RowsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__RowsAssignment_6_in_rule__ScenarioWithOutline__Group__6__Impl2347);
            	    rule__ScenarioWithOutline__RowsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1160:1: rule__ExampleRow__Group__0 : rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 ;
    public final void rule__ExampleRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1164:1: ( rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1165:2: rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02392);
            rule__ExampleRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02395);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1172:1: rule__ExampleRow__Group__0__Impl : ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) ;
    public final void rule__ExampleRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1176:1: ( ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1177:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1177:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1178:1: ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1178:1: ( ( rule__ExampleRow__CellsAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1179:1: ( rule__ExampleRow__CellsAssignment_0 )
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1180:1: ( rule__ExampleRow__CellsAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1180:2: rule__ExampleRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2424);
            rule__ExampleRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1183:1: ( ( rule__ExampleRow__CellsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1184:1: ( rule__ExampleRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1185:1: ( rule__ExampleRow__CellsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EXAMPLE_CELL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1185:2: rule__ExampleRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2436);
            	    rule__ExampleRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1196:1: rule__ExampleRow__Group__1 : rule__ExampleRow__Group__1__Impl ;
    public final void rule__ExampleRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1200:1: ( rule__ExampleRow__Group__1__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1201:2: rule__ExampleRow__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12469);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1207:1: rule__ExampleRow__Group__1__Impl : ( RULE_EXAMPLE_ROW_END ) ;
    public final void rule__ExampleRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1211:1: ( ( RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1212:1: ( RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1212:1: ( RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1213:1: RULE_EXAMPLE_ROW_END
            {
             before(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
            match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2496); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1228:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1232:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1233:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02529);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02532);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1240:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )* ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1244:1: ( ( ( rule__Background__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1245:1: ( ( rule__Background__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1245:1: ( ( rule__Background__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1246:1: ( rule__Background__TagsAssignment_0 )*
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1247:1: ( rule__Background__TagsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAG) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1247:2: rule__Background__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2559);
            	    rule__Background__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1257:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1261:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1262:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12590);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12593);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1269:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1273:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1274:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1274:1: ( ( rule__Background__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1275:1: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1276:1: ( rule__Background__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1276:2: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2620);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1286:1: rule__Background__Group__2 : rule__Background__Group__2__Impl ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1290:1: ( rule__Background__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1291:2: rule__Background__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22650);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1297:1: rule__Background__Group__2__Impl : ( ( rule__Background__StepsAssignment_2 )* ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1301:1: ( ( ( rule__Background__StepsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1302:1: ( ( rule__Background__StepsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1302:1: ( ( rule__Background__StepsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( rule__Background__StepsAssignment_2 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1304:1: ( rule__Background__StepsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1304:2: rule__Background__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2677);
            	    rule__Background__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1320:1: rule__WhenStep__Group__0 : rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 ;
    public final void rule__WhenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1324:1: ( rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1325:2: rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02714);
            rule__WhenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02717);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1332:1: rule__WhenStep__Group__0__Impl : ( ( rule__WhenStep__TagsAssignment_0 )* ) ;
    public final void rule__WhenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1336:1: ( ( ( rule__WhenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1337:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1337:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1338:1: ( rule__WhenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1339:1: ( rule__WhenStep__TagsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TAG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1339:2: rule__WhenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2744);
            	    rule__WhenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1349:1: rule__WhenStep__Group__1 : rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 ;
    public final void rule__WhenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1353:1: ( rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1354:2: rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12775);
            rule__WhenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12778);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1361:1: rule__WhenStep__Group__1__Impl : ( ( rule__WhenStep__DescAssignment_1 ) ) ;
    public final void rule__WhenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1365:1: ( ( ( rule__WhenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1366:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1366:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1367:1: ( rule__WhenStep__DescAssignment_1 )
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1368:1: ( rule__WhenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1368:2: rule__WhenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2805);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1378:1: rule__WhenStep__Group__2 : rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3 ;
    public final void rule__WhenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1382:1: ( rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1383:2: rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22835);
            rule__WhenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__3_in_rule__WhenStep__Group__22838);
            rule__WhenStep__Group__3();

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
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_TEXT && LA20_0<=RULE_CODE)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1397:2: rule__WhenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__DescAssignment_2_in_rule__WhenStep__Group__2__Impl2865);
            	    rule__WhenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "rule__WhenStep__Group__3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1407:1: rule__WhenStep__Group__3 : rule__WhenStep__Group__3__Impl ;
    public final void rule__WhenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1411:1: ( rule__WhenStep__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1412:2: rule__WhenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__3__Impl_in_rule__WhenStep__Group__32896);
            rule__WhenStep__Group__3__Impl();

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
    // $ANTLR end "rule__WhenStep__Group__3"


    // $ANTLR start "rule__WhenStep__Group__3__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1418:1: rule__WhenStep__Group__3__Impl : ( ( rule__WhenStep__RowsAssignment_3 )* ) ;
    public final void rule__WhenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1422:1: ( ( ( rule__WhenStep__RowsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1423:1: ( ( rule__WhenStep__RowsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1423:1: ( ( rule__WhenStep__RowsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1424:1: ( rule__WhenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getWhenStepAccess().getRowsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1425:1: ( rule__WhenStep__RowsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EXAMPLE_CELL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1425:2: rule__WhenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__RowsAssignment_3_in_rule__WhenStep__Group__3__Impl2923);
            	    rule__WhenStep__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__WhenStep__Group__3__Impl"


    // $ANTLR start "rule__ThenStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1443:1: rule__ThenStep__Group__0 : rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 ;
    public final void rule__ThenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1447:1: ( rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1448:2: rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__02962);
            rule__ThenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__02965);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1455:1: rule__ThenStep__Group__0__Impl : ( ( rule__ThenStep__TagsAssignment_0 )* ) ;
    public final void rule__ThenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1459:1: ( ( ( rule__ThenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1460:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1460:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1461:1: ( rule__ThenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1462:1: ( rule__ThenStep__TagsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TAG) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1462:2: rule__ThenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl2992);
            	    rule__ThenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1472:1: rule__ThenStep__Group__1 : rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 ;
    public final void rule__ThenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1476:1: ( rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1477:2: rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__13023);
            rule__ThenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__13026);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1484:1: rule__ThenStep__Group__1__Impl : ( ( rule__ThenStep__DescAssignment_1 ) ) ;
    public final void rule__ThenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1488:1: ( ( ( rule__ThenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1489:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1489:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1490:1: ( rule__ThenStep__DescAssignment_1 )
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1491:1: ( rule__ThenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1491:2: rule__ThenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl3053);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1501:1: rule__ThenStep__Group__2 : rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3 ;
    public final void rule__ThenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1505:1: ( rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1506:2: rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__23083);
            rule__ThenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__3_in_rule__ThenStep__Group__23086);
            rule__ThenStep__Group__3();

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1513:1: rule__ThenStep__Group__2__Impl : ( ( rule__ThenStep__DescAssignment_2 )* ) ;
    public final void rule__ThenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1517:1: ( ( ( rule__ThenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1518:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1518:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1519:1: ( rule__ThenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1520:1: ( rule__ThenStep__DescAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_TEXT && LA23_0<=RULE_CODE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1520:2: rule__ThenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__DescAssignment_2_in_rule__ThenStep__Group__2__Impl3113);
            	    rule__ThenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "rule__ThenStep__Group__3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1530:1: rule__ThenStep__Group__3 : rule__ThenStep__Group__3__Impl ;
    public final void rule__ThenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1534:1: ( rule__ThenStep__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1535:2: rule__ThenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__3__Impl_in_rule__ThenStep__Group__33144);
            rule__ThenStep__Group__3__Impl();

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
    // $ANTLR end "rule__ThenStep__Group__3"


    // $ANTLR start "rule__ThenStep__Group__3__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1541:1: rule__ThenStep__Group__3__Impl : ( ( rule__ThenStep__RowsAssignment_3 )* ) ;
    public final void rule__ThenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1545:1: ( ( ( rule__ThenStep__RowsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1546:1: ( ( rule__ThenStep__RowsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1546:1: ( ( rule__ThenStep__RowsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1547:1: ( rule__ThenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getThenStepAccess().getRowsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1548:1: ( rule__ThenStep__RowsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EXAMPLE_CELL) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1548:2: rule__ThenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__RowsAssignment_3_in_rule__ThenStep__Group__3__Impl3171);
            	    rule__ThenStep__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__ThenStep__Group__3__Impl"


    // $ANTLR start "rule__GivenStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1566:1: rule__GivenStep__Group__0 : rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 ;
    public final void rule__GivenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1570:1: ( rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1571:2: rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__03210);
            rule__GivenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__03213);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1578:1: rule__GivenStep__Group__0__Impl : ( ( rule__GivenStep__TagsAssignment_0 )* ) ;
    public final void rule__GivenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1582:1: ( ( ( rule__GivenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1583:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1583:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1584:1: ( rule__GivenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1585:1: ( rule__GivenStep__TagsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TAG) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1585:2: rule__GivenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl3240);
            	    rule__GivenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1595:1: rule__GivenStep__Group__1 : rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 ;
    public final void rule__GivenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1599:1: ( rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1600:2: rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13271);
            rule__GivenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13274);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1607:1: rule__GivenStep__Group__1__Impl : ( ( rule__GivenStep__DescAssignment_1 ) ) ;
    public final void rule__GivenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1611:1: ( ( ( rule__GivenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1612:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1612:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1613:1: ( rule__GivenStep__DescAssignment_1 )
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1614:1: ( rule__GivenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1614:2: rule__GivenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3301);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1624:1: rule__GivenStep__Group__2 : rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3 ;
    public final void rule__GivenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1628:1: ( rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1629:2: rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23331);
            rule__GivenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__3_in_rule__GivenStep__Group__23334);
            rule__GivenStep__Group__3();

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1636:1: rule__GivenStep__Group__2__Impl : ( ( rule__GivenStep__DescAssignment_2 )* ) ;
    public final void rule__GivenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1640:1: ( ( ( rule__GivenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1641:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1641:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1642:1: ( rule__GivenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:1: ( rule__GivenStep__DescAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_TEXT && LA26_0<=RULE_CODE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:2: rule__GivenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__DescAssignment_2_in_rule__GivenStep__Group__2__Impl3361);
            	    rule__GivenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "rule__GivenStep__Group__3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1653:1: rule__GivenStep__Group__3 : rule__GivenStep__Group__3__Impl ;
    public final void rule__GivenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1657:1: ( rule__GivenStep__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1658:2: rule__GivenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__3__Impl_in_rule__GivenStep__Group__33392);
            rule__GivenStep__Group__3__Impl();

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
    // $ANTLR end "rule__GivenStep__Group__3"


    // $ANTLR start "rule__GivenStep__Group__3__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1664:1: rule__GivenStep__Group__3__Impl : ( ( rule__GivenStep__RowsAssignment_3 )* ) ;
    public final void rule__GivenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1668:1: ( ( ( rule__GivenStep__RowsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1669:1: ( ( rule__GivenStep__RowsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1669:1: ( ( rule__GivenStep__RowsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1670:1: ( rule__GivenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getGivenStepAccess().getRowsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1671:1: ( rule__GivenStep__RowsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EXAMPLE_CELL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1671:2: rule__GivenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__RowsAssignment_3_in_rule__GivenStep__Group__3__Impl3419);
            	    rule__GivenStep__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__GivenStep__Group__3__Impl"


    // $ANTLR start "rule__AndStep__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1689:1: rule__AndStep__Group__0 : rule__AndStep__Group__0__Impl rule__AndStep__Group__1 ;
    public final void rule__AndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1693:1: ( rule__AndStep__Group__0__Impl rule__AndStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1694:2: rule__AndStep__Group__0__Impl rule__AndStep__Group__1
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03458);
            rule__AndStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03461);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1701:1: rule__AndStep__Group__0__Impl : ( ( rule__AndStep__DescAssignment_0 ) ) ;
    public final void rule__AndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1705:1: ( ( ( rule__AndStep__DescAssignment_0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1706:1: ( ( rule__AndStep__DescAssignment_0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1706:1: ( ( rule__AndStep__DescAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1707:1: ( rule__AndStep__DescAssignment_0 )
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1708:1: ( rule__AndStep__DescAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1708:2: rule__AndStep__DescAssignment_0
            {
            pushFollow(FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3488);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1718:1: rule__AndStep__Group__1 : rule__AndStep__Group__1__Impl rule__AndStep__Group__2 ;
    public final void rule__AndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1722:1: ( rule__AndStep__Group__1__Impl rule__AndStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1723:2: rule__AndStep__Group__1__Impl rule__AndStep__Group__2
            {
            pushFollow(FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13518);
            rule__AndStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndStep__Group__2_in_rule__AndStep__Group__13521);
            rule__AndStep__Group__2();

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1730:1: rule__AndStep__Group__1__Impl : ( ( rule__AndStep__DescAssignment_1 )* ) ;
    public final void rule__AndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1734:1: ( ( ( rule__AndStep__DescAssignment_1 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1735:1: ( ( rule__AndStep__DescAssignment_1 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1735:1: ( ( rule__AndStep__DescAssignment_1 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1736:1: ( rule__AndStep__DescAssignment_1 )*
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1737:1: ( rule__AndStep__DescAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_TEXT && LA28_0<=RULE_CODE)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1737:2: rule__AndStep__DescAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AndStep__DescAssignment_1_in_rule__AndStep__Group__1__Impl3548);
            	    rule__AndStep__DescAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "rule__AndStep__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1747:1: rule__AndStep__Group__2 : rule__AndStep__Group__2__Impl ;
    public final void rule__AndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1751:1: ( rule__AndStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1752:2: rule__AndStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AndStep__Group__2__Impl_in_rule__AndStep__Group__23579);
            rule__AndStep__Group__2__Impl();

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
    // $ANTLR end "rule__AndStep__Group__2"


    // $ANTLR start "rule__AndStep__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1758:1: rule__AndStep__Group__2__Impl : ( ( rule__AndStep__RowsAssignment_2 )* ) ;
    public final void rule__AndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1762:1: ( ( ( rule__AndStep__RowsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( ( rule__AndStep__RowsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( ( rule__AndStep__RowsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: ( rule__AndStep__RowsAssignment_2 )*
            {
             before(grammarAccess.getAndStepAccess().getRowsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1765:1: ( rule__AndStep__RowsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EXAMPLE_CELL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1765:2: rule__AndStep__RowsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AndStep__RowsAssignment_2_in_rule__AndStep__Group__2__Impl3606);
            	    rule__AndStep__RowsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAndStepAccess().getRowsAssignment_2()); 

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
    // $ANTLR end "rule__AndStep__Group__2__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1782:1: rule__Feature__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1786:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1787:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1787:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1788:1: RULE_TAG
            {
             before(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03648); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1797:1: rule__Feature__NameAssignment_1 : ( RULE_FEATURE_TEXT ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1801:1: ( ( RULE_FEATURE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1802:1: ( RULE_FEATURE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1802:1: ( RULE_FEATURE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1803:1: RULE_FEATURE_TEXT
            {
             before(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_FEATURE_TEXT,FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13679); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1812:1: rule__Feature__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Feature__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1816:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1817:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1817:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1818:1: ruleNarrativeElement
            {
             before(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23710);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1827:1: rule__Feature__ScenariosAssignment_3 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1831:1: ( ( ruleAbstractScenario ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1832:1: ( ruleAbstractScenario )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1832:1: ( ruleAbstractScenario )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1833:1: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33741);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1842:1: rule__FreeText__NameAssignment : ( RULE_TEXT ) ;
    public final void rule__FreeText__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1846:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1847:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1847:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1848:1: RULE_TEXT
            {
             before(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3772); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1857:1: rule__AsA__NameAssignment : ( RULE_AS_A ) ;
    public final void rule__AsA__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1861:1: ( ( RULE_AS_A ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1862:1: ( RULE_AS_A )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1862:1: ( RULE_AS_A )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1863:1: RULE_AS_A
            {
             before(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
            match(input,RULE_AS_A,FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3803); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1872:1: rule__InOrderTo__NameAssignment : ( RULE_IN_ORDER_TO ) ;
    public final void rule__InOrderTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1876:1: ( ( RULE_IN_ORDER_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1877:1: ( RULE_IN_ORDER_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1877:1: ( RULE_IN_ORDER_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1878:1: RULE_IN_ORDER_TO
            {
             before(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
            match(input,RULE_IN_ORDER_TO,FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3834); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1887:1: rule__IWantTo__NameAssignment : ( RULE_I_WANT_TO ) ;
    public final void rule__IWantTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1891:1: ( ( RULE_I_WANT_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1892:1: ( RULE_I_WANT_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1892:1: ( RULE_I_WANT_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1893:1: RULE_I_WANT_TO
            {
             before(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
            match(input,RULE_I_WANT_TO,FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3865); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1902:1: rule__Scenario__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1906:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1907:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1907:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1908:1: RULE_TAG
            {
             before(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_03896); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1917:1: rule__Scenario__NameAssignment_1 : ( RULE_SCENARIO_TEXT ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1921:1: ( ( RULE_SCENARIO_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1922:1: ( RULE_SCENARIO_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1922:1: ( RULE_SCENARIO_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1923:1: RULE_SCENARIO_TEXT
            {
             before(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_13927); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1932:1: rule__Scenario__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Scenario__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1936:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1937:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1937:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1938:1: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Scenario__ElementsAssignment_23958);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1947:1: rule__Scenario__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1951:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1952:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1952:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1953:1: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_33989);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1962:1: rule__ScenarioWithOutline__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ScenarioWithOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1966:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1967:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1967:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1968:1: RULE_TAG
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_04020); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1977:1: rule__ScenarioWithOutline__NameAssignment_1 : ( RULE_SCENARIO_OUTLINE_TEXT ) ;
    public final void rule__ScenarioWithOutline__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1981:1: ( ( RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1982:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1982:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1983:1: RULE_SCENARIO_OUTLINE_TEXT
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_14051); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1992:1: rule__ScenarioWithOutline__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__ScenarioWithOutline__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1996:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1997:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1997:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1998:1: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__ScenarioWithOutline__ElementsAssignment_24082);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2007:1: rule__ScenarioWithOutline__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__ScenarioWithOutline__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2011:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2012:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2012:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2013:1: ruleStep
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_34113);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2022:1: rule__ScenarioWithOutline__HeadingAssignment_5 : ( ruleExampleRow ) ;
    public final void rule__ScenarioWithOutline__HeadingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2026:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2027:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2027:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2028:1: ruleExampleRow
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__HeadingAssignment_54144);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2037:1: rule__ScenarioWithOutline__RowsAssignment_6 : ( ruleExampleRow ) ;
    public final void rule__ScenarioWithOutline__RowsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2041:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2042:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2042:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2043:1: ruleExampleRow
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__RowsAssignment_64175);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2052:1: rule__ExampleRow__CellsAssignment_0 : ( ruleExampleCell ) ;
    public final void rule__ExampleRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2056:1: ( ( ruleExampleCell ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2057:1: ( ruleExampleCell )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2057:1: ( ruleExampleCell )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2058:1: ruleExampleCell
            {
             before(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExampleCell_in_rule__ExampleRow__CellsAssignment_04206);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2067:1: rule__ExampleCell__ValueAssignment : ( RULE_EXAMPLE_CELL ) ;
    public final void rule__ExampleCell__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2071:1: ( ( RULE_EXAMPLE_CELL ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:1: ( RULE_EXAMPLE_CELL )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2072:1: ( RULE_EXAMPLE_CELL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2073:1: RULE_EXAMPLE_CELL
            {
             before(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 
            match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleCell__ValueAssignment4237); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2082:1: rule__Background__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2086:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2087:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2087:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2088:1: RULE_TAG
            {
             before(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_04268); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2097:1: rule__Background__NameAssignment_1 : ( RULE_BACKGROUND_TEXT ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2101:1: ( ( RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2102:1: ( RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2102:1: ( RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2103:1: RULE_BACKGROUND_TEXT
            {
             before(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_14299); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2112:1: rule__Background__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2116:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2117:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2117:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2118:1: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Background__StepsAssignment_24330);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2127:1: rule__WhenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__WhenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2132:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2132:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2133:1: RULE_TAG
            {
             before(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_04361); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2142:1: rule__WhenStep__DescAssignment_1 : ( RULE_WHEN_TEXT ) ;
    public final void rule__WhenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2146:1: ( ( RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:1: ( RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2147:1: ( RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2148:1: RULE_WHEN_TEXT
            {
             before(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_14392); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2157:1: rule__WhenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__WhenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2161:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2162:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2162:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2163:1: ruleOptionalText
            {
             before(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__WhenStep__DescAssignment_24423);
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


    // $ANTLR start "rule__WhenStep__RowsAssignment_3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2172:1: rule__WhenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__WhenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2176:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2177:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2177:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2178:1: ruleExampleRow
            {
             before(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__WhenStep__RowsAssignment_34454);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WhenStep__RowsAssignment_3"


    // $ANTLR start "rule__ThenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2187:1: rule__ThenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ThenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2191:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2192:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2192:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2193:1: RULE_TAG
            {
             before(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04485); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2202:1: rule__ThenStep__DescAssignment_1 : ( RULE_THEN_TEXT ) ;
    public final void rule__ThenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2206:1: ( ( RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2207:1: ( RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2207:1: ( RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2208:1: RULE_THEN_TEXT
            {
             before(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14516); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2217:1: rule__ThenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__ThenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2221:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2222:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2222:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2223:1: ruleOptionalText
            {
             before(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__ThenStep__DescAssignment_24547);
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


    // $ANTLR start "rule__ThenStep__RowsAssignment_3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2232:1: rule__ThenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__ThenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2236:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2237:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2237:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2238:1: ruleExampleRow
            {
             before(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ThenStep__RowsAssignment_34578);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ThenStep__RowsAssignment_3"


    // $ANTLR start "rule__GivenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2247:1: rule__GivenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__GivenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2251:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2252:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2252:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2253:1: RULE_TAG
            {
             before(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04609); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2262:1: rule__GivenStep__DescAssignment_1 : ( RULE_GIVEN_TEXT ) ;
    public final void rule__GivenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2266:1: ( ( RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2267:1: ( RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2267:1: ( RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2268:1: RULE_GIVEN_TEXT
            {
             before(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14640); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2277:1: rule__GivenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__GivenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2281:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2282:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2282:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2283:1: ruleOptionalText
            {
             before(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__GivenStep__DescAssignment_24671);
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


    // $ANTLR start "rule__GivenStep__RowsAssignment_3"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2292:1: rule__GivenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__GivenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2296:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2297:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2297:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2298:1: ruleExampleRow
            {
             before(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__GivenStep__RowsAssignment_34702);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GivenStep__RowsAssignment_3"


    // $ANTLR start "rule__AndStep__DescAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2307:1: rule__AndStep__DescAssignment_0 : ( RULE_AND_TEXT ) ;
    public final void rule__AndStep__DescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2311:1: ( ( RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2312:1: ( RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2312:1: ( RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2313:1: RULE_AND_TEXT
            {
             before(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
            match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04733); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2322:1: rule__AndStep__DescAssignment_1 : ( ruleOptionalText ) ;
    public final void rule__AndStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2326:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2327:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2327:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2328:1: ruleOptionalText
            {
             before(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__AndStep__DescAssignment_14764);
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


    // $ANTLR start "rule__AndStep__RowsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2337:1: rule__AndStep__RowsAssignment_2 : ( ruleExampleRow ) ;
    public final void rule__AndStep__RowsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2341:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2342:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2342:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2343:1: ruleExampleRow
            {
             before(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__AndStep__RowsAssignment_24795);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AndStep__RowsAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
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
            return "598:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );";
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
            return "626:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );";
        }
    }
    static final String DFA11_eotS =
        "\4\uffff";
    static final String DFA11_eofS =
        "\1\1\3\uffff";
    static final String DFA11_minS =
        "\1\10\1\uffff\1\10\1\uffff";
    static final String DFA11_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\4\uffff\2\1\1\uffff\1\1\4\3",
            "",
            "\1\2\4\uffff\2\1\1\uffff\1\1\3\3",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 918:1: ( rule__Scenario__StepsAssignment_3 )*";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\1\1\3\uffff";
    static final String DFA18_minS =
        "\1\10\1\uffff\1\10\1\uffff";
    static final String DFA18_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\4\uffff\2\1\1\uffff\1\1\4\3",
            "",
            "\1\2\4\uffff\2\1\1\uffff\1\1\3\3",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1304:1: ( rule__Background__StepsAssignment_2 )*";
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
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01429 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1459 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11490 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21551 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1581 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1639 = new BitSet(new long[]{0x0000000000016102L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01678 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1708 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11739 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21799 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ElementsAssignment_2_in_rule__Scenario__Group__2__Impl1829 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1889 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1901 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__01942 = new BitSet(new long[]{0x0000000000016100L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__01945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl1972 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__12003 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22063 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__ElementsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2093 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2156 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2168 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42201 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__5_in_rule__ScenarioWithOutline__Group__42204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_rule__ScenarioWithOutline__Group__4__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__5__Impl_in_rule__ScenarioWithOutline__Group__52260 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__6_in_rule__ScenarioWithOutline__Group__52263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__HeadingAssignment_5_in_rule__ScenarioWithOutline__Group__5__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__6__Impl_in_rule__ScenarioWithOutline__Group__62320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__RowsAssignment_6_in_rule__ScenarioWithOutline__Group__6__Impl2347 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02392 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2424 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2436 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02529 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2559 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12590 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2677 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02714 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2744 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12775 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22835 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__3_in_rule__WhenStep__Group__22838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_2_in_rule__WhenStep__Group__2__Impl2865 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__3__Impl_in_rule__WhenStep__Group__32896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__RowsAssignment_3_in_rule__WhenStep__Group__3__Impl2923 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__02962 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__02965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl2992 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__13023 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__13026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__23083 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__3_in_rule__ThenStep__Group__23086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_2_in_rule__ThenStep__Group__2__Impl3113 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__3__Impl_in_rule__ThenStep__Group__33144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__RowsAssignment_3_in_rule__ThenStep__Group__3__Impl3171 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__03210 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__03213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl3240 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13271 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23331 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__3_in_rule__GivenStep__Group__23334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_2_in_rule__GivenStep__Group__2__Impl3361 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__3__Impl_in_rule__GivenStep__Group__33392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__RowsAssignment_3_in_rule__GivenStep__Group__3__Impl3419 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03458 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13518 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__AndStep__Group__2_in_rule__AndStep__Group__13521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_1_in_rule__AndStep__Group__1__Impl3548 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__AndStep__Group__2__Impl_in_rule__AndStep__Group__23579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__RowsAssignment_2_in_rule__AndStep__Group__2__Impl3606 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_03896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_13927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Scenario__ElementsAssignment_23958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_33989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_04020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_14051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__ScenarioWithOutline__ElementsAssignment_24082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_34113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__HeadingAssignment_54144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__RowsAssignment_64175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_rule__ExampleRow__CellsAssignment_04206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleCell__ValueAssignment4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_04268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_14299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Background__StepsAssignment_24330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_04361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_14392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__WhenStep__DescAssignment_24423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__WhenStep__RowsAssignment_34454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__ThenStep__DescAssignment_24547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ThenStep__RowsAssignment_34578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__GivenStep__DescAssignment_24671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__GivenStep__RowsAssignment_34702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__AndStep__DescAssignment_14764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__AndStep__RowsAssignment_24795 = new BitSet(new long[]{0x0000000000000002L});

}