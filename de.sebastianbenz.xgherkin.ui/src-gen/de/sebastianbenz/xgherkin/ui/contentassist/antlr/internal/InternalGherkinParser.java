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


    // $ANTLR start "entryRuleExample"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:312:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:313:1: ( ruleExample EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:314:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_ruleExample_in_entryRuleExample601);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExample608); 

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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:321:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:325:2: ( ( ( rule__Example__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:326:1: ( ( rule__Example__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:326:1: ( ( rule__Example__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:327:1: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:328:1: ( rule__Example__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:328:2: rule__Example__Group__0
            {
            pushFollow(FOLLOW_rule__Example__Group__0_in_ruleExample634);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleExampleRow"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:340:1: entryRuleExampleRow : ruleExampleRow EOF ;
    public final void entryRuleExampleRow() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:341:1: ( ruleExampleRow EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:342:1: ruleExampleRow EOF
            {
             before(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_ruleExampleRow_in_entryRuleExampleRow661);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleRowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleRow668); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:349:1: ruleExampleRow : ( ( rule__ExampleRow__Group__0 ) ) ;
    public final void ruleExampleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:353:2: ( ( ( rule__ExampleRow__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:354:1: ( ( rule__ExampleRow__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:354:1: ( ( rule__ExampleRow__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:355:1: ( rule__ExampleRow__Group__0 )
            {
             before(grammarAccess.getExampleRowAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:356:1: ( rule__ExampleRow__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:356:2: rule__ExampleRow__Group__0
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__0_in_ruleExampleRow694);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:368:1: entryRuleExampleCell : ruleExampleCell EOF ;
    public final void entryRuleExampleCell() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:369:1: ( ruleExampleCell EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:370:1: ruleExampleCell EOF
            {
             before(grammarAccess.getExampleCellRule()); 
            pushFollow(FOLLOW_ruleExampleCell_in_entryRuleExampleCell721);
            ruleExampleCell();

            state._fsp--;

             after(grammarAccess.getExampleCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExampleCell728); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:377:1: ruleExampleCell : ( ( rule__ExampleCell__ValueAssignment ) ) ;
    public final void ruleExampleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:381:2: ( ( ( rule__ExampleCell__ValueAssignment ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:382:1: ( ( rule__ExampleCell__ValueAssignment ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:382:1: ( ( rule__ExampleCell__ValueAssignment ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( rule__ExampleCell__ValueAssignment )
            {
             before(grammarAccess.getExampleCellAccess().getValueAssignment()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:384:1: ( rule__ExampleCell__ValueAssignment )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:384:2: rule__ExampleCell__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ExampleCell__ValueAssignment_in_ruleExampleCell754);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:396:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:397:1: ( ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:398:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground781);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground788); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:405:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:409:2: ( ( ( rule__Background__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:410:1: ( ( rule__Background__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:410:1: ( ( rule__Background__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:412:1: ( rule__Background__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:412:2: rule__Background__Group__0
            {
            pushFollow(FOLLOW_rule__Background__Group__0_in_ruleBackground814);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:424:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:425:1: ( ruleStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:426:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep841);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep848); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:433:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:437:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:438:1: ( ( rule__Step__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:438:1: ( ( rule__Step__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:439:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:440:1: ( rule__Step__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:440:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep874);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:452:1: entryRuleWhenStep : ruleWhenStep EOF ;
    public final void entryRuleWhenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:453:1: ( ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:454:1: ruleWhenStep EOF
            {
             before(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_ruleWhenStep_in_entryRuleWhenStep901);
            ruleWhenStep();

            state._fsp--;

             after(grammarAccess.getWhenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenStep908); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:461:1: ruleWhenStep : ( ( rule__WhenStep__Group__0 ) ) ;
    public final void ruleWhenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:465:2: ( ( ( rule__WhenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:466:1: ( ( rule__WhenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:466:1: ( ( rule__WhenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:467:1: ( rule__WhenStep__Group__0 )
            {
             before(grammarAccess.getWhenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:468:1: ( rule__WhenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:468:2: rule__WhenStep__Group__0
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0_in_ruleWhenStep934);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:480:1: entryRuleThenStep : ruleThenStep EOF ;
    public final void entryRuleThenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:481:1: ( ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:482:1: ruleThenStep EOF
            {
             before(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_ruleThenStep_in_entryRuleThenStep961);
            ruleThenStep();

            state._fsp--;

             after(grammarAccess.getThenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenStep968); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:489:1: ruleThenStep : ( ( rule__ThenStep__Group__0 ) ) ;
    public final void ruleThenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:493:2: ( ( ( rule__ThenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:494:1: ( ( rule__ThenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:494:1: ( ( rule__ThenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( rule__ThenStep__Group__0 )
            {
             before(grammarAccess.getThenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:496:1: ( rule__ThenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:496:2: rule__ThenStep__Group__0
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0_in_ruleThenStep994);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:508:1: entryRuleGivenStep : ruleGivenStep EOF ;
    public final void entryRuleGivenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:509:1: ( ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:510:1: ruleGivenStep EOF
            {
             before(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_ruleGivenStep_in_entryRuleGivenStep1021);
            ruleGivenStep();

            state._fsp--;

             after(grammarAccess.getGivenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGivenStep1028); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:517:1: ruleGivenStep : ( ( rule__GivenStep__Group__0 ) ) ;
    public final void ruleGivenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:521:2: ( ( ( rule__GivenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:522:1: ( ( rule__GivenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:522:1: ( ( rule__GivenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:523:1: ( rule__GivenStep__Group__0 )
            {
             before(grammarAccess.getGivenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:524:1: ( rule__GivenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:524:2: rule__GivenStep__Group__0
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0_in_ruleGivenStep1054);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:536:1: entryRuleAndStep : ruleAndStep EOF ;
    public final void entryRuleAndStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:537:1: ( ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:538:1: ruleAndStep EOF
            {
             before(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_ruleAndStep_in_entryRuleAndStep1081);
            ruleAndStep();

            state._fsp--;

             after(grammarAccess.getAndStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndStep1088); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:545:1: ruleAndStep : ( ( rule__AndStep__Group__0 ) ) ;
    public final void ruleAndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:549:2: ( ( ( rule__AndStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:550:1: ( ( rule__AndStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:550:1: ( ( rule__AndStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:551:1: ( rule__AndStep__Group__0 )
            {
             before(grammarAccess.getAndStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:552:1: ( rule__AndStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:552:2: rule__AndStep__Group__0
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0_in_ruleAndStep1114);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:564:1: entryRuleOptionalText : ruleOptionalText EOF ;
    public final void entryRuleOptionalText() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:565:1: ( ruleOptionalText EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:566:1: ruleOptionalText EOF
            {
             before(grammarAccess.getOptionalTextRule()); 
            pushFollow(FOLLOW_ruleOptionalText_in_entryRuleOptionalText1141);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getOptionalTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalText1148); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:573:1: ruleOptionalText : ( ( rule__OptionalText__Alternatives ) ) ;
    public final void ruleOptionalText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:577:2: ( ( ( rule__OptionalText__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:578:1: ( ( rule__OptionalText__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:578:1: ( ( rule__OptionalText__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:579:1: ( rule__OptionalText__Alternatives )
            {
             before(grammarAccess.getOptionalTextAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:580:1: ( rule__OptionalText__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:580:2: rule__OptionalText__Alternatives
            {
            pushFollow(FOLLOW_rule__OptionalText__Alternatives_in_ruleOptionalText1174);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:592:1: rule__NarrativeElement__Alternatives : ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) );
    public final void rule__NarrativeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:596:1: ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) )
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:597:1: ( ruleInOrderTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:597:1: ( ruleInOrderTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:598:1: ruleInOrderTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInOrderTo_in_rule__NarrativeElement__Alternatives1210);
                    ruleInOrderTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:603:6: ( ruleAsA )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:603:6: ( ruleAsA )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:604:1: ruleAsA
                    {
                     before(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsA_in_rule__NarrativeElement__Alternatives1227);
                    ruleAsA();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:609:6: ( ruleIWantTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:609:6: ( ruleIWantTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:610:1: ruleIWantTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIWantTo_in_rule__NarrativeElement__Alternatives1244);
                    ruleIWantTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:615:6: ( ruleFreeText )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:615:6: ( ruleFreeText )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:616:1: ruleFreeText
                    {
                     before(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFreeText_in_rule__NarrativeElement__Alternatives1261);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:626:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:630:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:631:1: ( ruleBackground )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:631:1: ( ruleBackground )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:632:1: ruleBackground
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBackground_in_rule__AbstractScenario__Alternatives1293);
                    ruleBackground();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:637:6: ( ruleScenario )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:637:6: ( ruleScenario )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:638:1: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__AbstractScenario__Alternatives1310);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:643:6: ( ruleScenarioWithOutline )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:643:6: ( ruleScenarioWithOutline )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:644:1: ruleScenarioWithOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleScenarioWithOutline_in_rule__AbstractScenario__Alternatives1327);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:654:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:658:1: ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:659:1: ( ruleWhenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:659:1: ( ruleWhenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:660:1: ruleWhenStep
                    {
                     before(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWhenStep_in_rule__Step__Alternatives1359);
                    ruleWhenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:665:6: ( ruleThenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:665:6: ( ruleThenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:666:1: ruleThenStep
                    {
                     before(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleThenStep_in_rule__Step__Alternatives1376);
                    ruleThenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:671:6: ( ruleGivenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:671:6: ( ruleGivenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:672:1: ruleGivenStep
                    {
                     before(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGivenStep_in_rule__Step__Alternatives1393);
                    ruleGivenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:677:6: ( ruleAndStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:677:6: ( ruleAndStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:678:1: ruleAndStep
                    {
                     before(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAndStep_in_rule__Step__Alternatives1410);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:688:1: rule__OptionalText__Alternatives : ( ( RULE_TEXT ) | ( RULE_CODE ) );
    public final void rule__OptionalText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:692:1: ( ( RULE_TEXT ) | ( RULE_CODE ) )
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:693:1: ( RULE_TEXT )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:693:1: ( RULE_TEXT )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:694:1: RULE_TEXT
                    {
                     before(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
                    match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__OptionalText__Alternatives1442); 
                     after(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:699:6: ( RULE_CODE )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:699:6: ( RULE_CODE )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:700:1: RULE_CODE
                    {
                     before(grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 
                    match(input,RULE_CODE,FOLLOW_RULE_CODE_in_rule__OptionalText__Alternatives1459); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:712:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:716:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:717:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01489);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01492);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:724:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:728:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:729:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:729:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:730:1: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( rule__Feature__TagsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:731:2: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1519);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:741:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:745:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:746:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11550);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11553);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:753:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:757:1: ( ( ( rule__Feature__NameAssignment_1 )? ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:758:1: ( ( rule__Feature__NameAssignment_1 )? )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:758:1: ( ( rule__Feature__NameAssignment_1 )? )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:759:1: ( rule__Feature__NameAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:760:1: ( rule__Feature__NameAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_FEATURE_TEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:760:2: rule__Feature__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1580);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:770:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:774:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:775:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21611);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21614);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:782:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ElementsAssignment_2 )* ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:786:1: ( ( ( rule__Feature__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:787:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:787:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:788:1: ( rule__Feature__ElementsAssignment_2 )*
            {
             before(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:789:1: ( rule__Feature__ElementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TEXT||(LA7_0>=RULE_AS_A && LA7_0<=RULE_I_WANT_TO)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:789:2: rule__Feature__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1641);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:799:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:803:1: ( rule__Feature__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:804:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31672);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:810:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__ScenariosAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:814:1: ( ( ( rule__Feature__ScenariosAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:815:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:815:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:816:1: ( rule__Feature__ScenariosAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:817:1: ( rule__Feature__ScenariosAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TAG||(LA8_0>=RULE_SCENARIO_TEXT && LA8_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA8_0==RULE_BACKGROUND_TEXT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:817:2: rule__Feature__ScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1699);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:835:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:839:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:840:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01738);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01741);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:847:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:851:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:852:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:852:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:853:1: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:854:1: ( rule__Scenario__TagsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TAG) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:854:2: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1768);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:864:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:868:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:869:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11799);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11802);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:876:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:880:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:881:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:881:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:882:1: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:883:1: ( rule__Scenario__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:883:2: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1829);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:893:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:897:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:898:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21859);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21862);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:905:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__ElementsAssignment_2 )* ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:909:1: ( ( ( rule__Scenario__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:911:1: ( rule__Scenario__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:912:1: ( rule__Scenario__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TEXT||(LA10_0>=RULE_AS_A && LA10_0<=RULE_I_WANT_TO)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:912:2: rule__Scenario__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__ElementsAssignment_2_in_rule__Scenario__Group__2__Impl1889);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:922:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:926:1: ( rule__Scenario__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:927:2: rule__Scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31920);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:933:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:937:1: ( ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:938:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:938:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:939:1: ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:939:1: ( ( rule__Scenario__StepsAssignment_3 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:940:1: ( rule__Scenario__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:941:1: ( rule__Scenario__StepsAssignment_3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:941:2: rule__Scenario__StepsAssignment_3
            {
            pushFollow(FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1949);
            rule__Scenario__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:944:1: ( ( rule__Scenario__StepsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:945:1: ( rule__Scenario__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:946:1: ( rule__Scenario__StepsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:946:2: rule__Scenario__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1961);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:965:1: rule__ScenarioWithOutline__Group__0 : rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 ;
    public final void rule__ScenarioWithOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:969:1: ( rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:970:2: rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__02002);
            rule__ScenarioWithOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__02005);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:977:1: rule__ScenarioWithOutline__Group__0__Impl : ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioWithOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:981:1: ( ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:982:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:982:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:983:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:984:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:984:2: rule__ScenarioWithOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl2032);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:994:1: rule__ScenarioWithOutline__Group__1 : rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 ;
    public final void rule__ScenarioWithOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:998:1: ( rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:999:2: rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__12063);
            rule__ScenarioWithOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__12066);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1006:1: rule__ScenarioWithOutline__Group__1__Impl : ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) ;
    public final void rule__ScenarioWithOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1010:1: ( ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1011:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1011:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1013:2: rule__ScenarioWithOutline__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl2093);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1023:1: rule__ScenarioWithOutline__Group__2 : rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 ;
    public final void rule__ScenarioWithOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1027:1: ( rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1028:2: rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22123);
            rule__ScenarioWithOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22126);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1035:1: rule__ScenarioWithOutline__Group__2__Impl : ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) ;
    public final void rule__ScenarioWithOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1039:1: ( ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1040:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1040:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TEXT||(LA13_0>=RULE_AS_A && LA13_0<=RULE_I_WANT_TO)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:2: rule__ScenarioWithOutline__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__ElementsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2153);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1052:1: rule__ScenarioWithOutline__Group__3 : rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 ;
    public final void rule__ScenarioWithOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1056:1: ( rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1057:2: rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32184);
            rule__ScenarioWithOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32187);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1064:1: rule__ScenarioWithOutline__Group__3__Impl : ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) ;
    public final void rule__ScenarioWithOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1068:1: ( ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1069:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1069:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1070:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1070:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1071:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1072:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1072:2: rule__ScenarioWithOutline__StepsAssignment_3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2216);
            rule__ScenarioWithOutline__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1075:1: ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1076:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1077:1: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TAG||(LA14_0>=RULE_WHEN_TEXT && LA14_0<=RULE_AND_TEXT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1077:2: rule__ScenarioWithOutline__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2228);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1088:1: rule__ScenarioWithOutline__Group__4 : rule__ScenarioWithOutline__Group__4__Impl ;
    public final void rule__ScenarioWithOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1092:1: ( rule__ScenarioWithOutline__Group__4__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1093:2: rule__ScenarioWithOutline__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42261);
            rule__ScenarioWithOutline__Group__4__Impl();

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1099:1: rule__ScenarioWithOutline__Group__4__Impl : ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) ) ;
    public final void rule__ScenarioWithOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1103:1: ( ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1104:1: ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1104:1: ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1105:1: ( rule__ScenarioWithOutline__ExampleAssignment_4 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getExampleAssignment_4()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1106:1: ( rule__ScenarioWithOutline__ExampleAssignment_4 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1106:2: rule__ScenarioWithOutline__ExampleAssignment_4
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__ExampleAssignment_4_in_rule__ScenarioWithOutline__Group__4__Impl2288);
            rule__ScenarioWithOutline__ExampleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getExampleAssignment_4()); 

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


    // $ANTLR start "rule__Example__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1126:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1130:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1131:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_rule__Example__Group__0__Impl_in_rule__Example__Group__02328);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Example__Group__1_in_rule__Example__Group__02331);
            rule__Example__Group__1();

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
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1138:1: rule__Example__Group__0__Impl : ( RULE_EXAMPLE_HEADING ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1142:1: ( ( RULE_EXAMPLE_HEADING ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1143:1: ( RULE_EXAMPLE_HEADING )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1143:1: ( RULE_EXAMPLE_HEADING )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1144:1: RULE_EXAMPLE_HEADING
            {
             before(grammarAccess.getExampleAccess().getEXAMPLE_HEADINGTerminalRuleCall_0()); 
            match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_rule__Example__Group__0__Impl2358); 
             after(grammarAccess.getExampleAccess().getEXAMPLE_HEADINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1155:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1159:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1160:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_rule__Example__Group__1__Impl_in_rule__Example__Group__12387);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Example__Group__2_in_rule__Example__Group__12390);
            rule__Example__Group__2();

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
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1167:1: rule__Example__Group__1__Impl : ( ( rule__Example__HeadingAssignment_1 ) ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1171:1: ( ( ( rule__Example__HeadingAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1172:1: ( ( rule__Example__HeadingAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1172:1: ( ( rule__Example__HeadingAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1173:1: ( rule__Example__HeadingAssignment_1 )
            {
             before(grammarAccess.getExampleAccess().getHeadingAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1174:1: ( rule__Example__HeadingAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1174:2: rule__Example__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__Example__HeadingAssignment_1_in_rule__Example__Group__1__Impl2417);
            rule__Example__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getHeadingAssignment_1()); 

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
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1184:1: rule__Example__Group__2 : rule__Example__Group__2__Impl ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1188:1: ( rule__Example__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1189:2: rule__Example__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Example__Group__2__Impl_in_rule__Example__Group__22447);
            rule__Example__Group__2__Impl();

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
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1195:1: rule__Example__Group__2__Impl : ( ( rule__Example__RowsAssignment_2 )* ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1199:1: ( ( ( rule__Example__RowsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1200:1: ( ( rule__Example__RowsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1200:1: ( ( rule__Example__RowsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1201:1: ( rule__Example__RowsAssignment_2 )*
            {
             before(grammarAccess.getExampleAccess().getRowsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1202:1: ( rule__Example__RowsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EXAMPLE_CELL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1202:2: rule__Example__RowsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Example__RowsAssignment_2_in_rule__Example__Group__2__Impl2474);
            	    rule__Example__RowsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getRowsAssignment_2()); 

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
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__ExampleRow__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1218:1: rule__ExampleRow__Group__0 : rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 ;
    public final void rule__ExampleRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1222:1: ( rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1223:2: rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02511);
            rule__ExampleRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02514);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1230:1: rule__ExampleRow__Group__0__Impl : ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) ;
    public final void rule__ExampleRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1234:1: ( ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1235:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1235:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1236:1: ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1236:1: ( ( rule__ExampleRow__CellsAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1237:1: ( rule__ExampleRow__CellsAssignment_0 )
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1238:1: ( rule__ExampleRow__CellsAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1238:2: rule__ExampleRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2543);
            rule__ExampleRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1241:1: ( ( rule__ExampleRow__CellsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1242:1: ( rule__ExampleRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1243:1: ( rule__ExampleRow__CellsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EXAMPLE_CELL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1243:2: rule__ExampleRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2555);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1254:1: rule__ExampleRow__Group__1 : rule__ExampleRow__Group__1__Impl ;
    public final void rule__ExampleRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1258:1: ( rule__ExampleRow__Group__1__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1259:2: rule__ExampleRow__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12588);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1265:1: rule__ExampleRow__Group__1__Impl : ( RULE_EXAMPLE_ROW_END ) ;
    public final void rule__ExampleRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1269:1: ( ( RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1270:1: ( RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1270:1: ( RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1271:1: RULE_EXAMPLE_ROW_END
            {
             before(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
            match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2615); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1286:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1290:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1291:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02648);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02651);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1298:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )* ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1302:1: ( ( ( rule__Background__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( ( rule__Background__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( ( rule__Background__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1304:1: ( rule__Background__TagsAssignment_0 )*
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1305:1: ( rule__Background__TagsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAG) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1305:2: rule__Background__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2678);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1315:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1319:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1320:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12709);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12712);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1327:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1331:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1332:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1332:1: ( ( rule__Background__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1333:1: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1334:1: ( rule__Background__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1334:2: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2739);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1344:1: rule__Background__Group__2 : rule__Background__Group__2__Impl ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1348:1: ( rule__Background__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1349:2: rule__Background__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22769);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1355:1: rule__Background__Group__2__Impl : ( ( rule__Background__StepsAssignment_2 )* ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1359:1: ( ( ( rule__Background__StepsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1360:1: ( ( rule__Background__StepsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1360:1: ( ( rule__Background__StepsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1361:1: ( rule__Background__StepsAssignment_2 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1362:1: ( rule__Background__StepsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1362:2: rule__Background__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2796);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1378:1: rule__WhenStep__Group__0 : rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 ;
    public final void rule__WhenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1382:1: ( rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1383:2: rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02833);
            rule__WhenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02836);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1390:1: rule__WhenStep__Group__0__Impl : ( ( rule__WhenStep__TagsAssignment_0 )* ) ;
    public final void rule__WhenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1394:1: ( ( ( rule__WhenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1395:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1395:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1396:1: ( rule__WhenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1397:1: ( rule__WhenStep__TagsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TAG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1397:2: rule__WhenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2863);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1407:1: rule__WhenStep__Group__1 : rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 ;
    public final void rule__WhenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1411:1: ( rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1412:2: rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12894);
            rule__WhenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12897);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1419:1: rule__WhenStep__Group__1__Impl : ( ( rule__WhenStep__DescAssignment_1 ) ) ;
    public final void rule__WhenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1423:1: ( ( ( rule__WhenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1424:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1424:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1425:1: ( rule__WhenStep__DescAssignment_1 )
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1426:1: ( rule__WhenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1426:2: rule__WhenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2924);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1436:1: rule__WhenStep__Group__2 : rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3 ;
    public final void rule__WhenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1440:1: ( rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1441:2: rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22954);
            rule__WhenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__3_in_rule__WhenStep__Group__22957);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1448:1: rule__WhenStep__Group__2__Impl : ( ( rule__WhenStep__DescAssignment_2 )* ) ;
    public final void rule__WhenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1452:1: ( ( ( rule__WhenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1453:1: ( ( rule__WhenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1453:1: ( ( rule__WhenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1454:1: ( rule__WhenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1455:1: ( rule__WhenStep__DescAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_TEXT && LA20_0<=RULE_CODE)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1455:2: rule__WhenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__DescAssignment_2_in_rule__WhenStep__Group__2__Impl2984);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1465:1: rule__WhenStep__Group__3 : rule__WhenStep__Group__3__Impl ;
    public final void rule__WhenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1469:1: ( rule__WhenStep__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1470:2: rule__WhenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__3__Impl_in_rule__WhenStep__Group__33015);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1476:1: rule__WhenStep__Group__3__Impl : ( ( rule__WhenStep__RowsAssignment_3 )* ) ;
    public final void rule__WhenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1480:1: ( ( ( rule__WhenStep__RowsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1481:1: ( ( rule__WhenStep__RowsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1481:1: ( ( rule__WhenStep__RowsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1482:1: ( rule__WhenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getWhenStepAccess().getRowsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1483:1: ( rule__WhenStep__RowsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EXAMPLE_CELL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1483:2: rule__WhenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__RowsAssignment_3_in_rule__WhenStep__Group__3__Impl3042);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1501:1: rule__ThenStep__Group__0 : rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 ;
    public final void rule__ThenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1505:1: ( rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1506:2: rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__03081);
            rule__ThenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__03084);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1513:1: rule__ThenStep__Group__0__Impl : ( ( rule__ThenStep__TagsAssignment_0 )* ) ;
    public final void rule__ThenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1517:1: ( ( ( rule__ThenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1518:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1518:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1519:1: ( rule__ThenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1520:1: ( rule__ThenStep__TagsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TAG) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1520:2: rule__ThenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl3111);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1530:1: rule__ThenStep__Group__1 : rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 ;
    public final void rule__ThenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1534:1: ( rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1535:2: rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__13142);
            rule__ThenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__13145);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1542:1: rule__ThenStep__Group__1__Impl : ( ( rule__ThenStep__DescAssignment_1 ) ) ;
    public final void rule__ThenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1546:1: ( ( ( rule__ThenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1547:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1547:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1548:1: ( rule__ThenStep__DescAssignment_1 )
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1549:1: ( rule__ThenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1549:2: rule__ThenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl3172);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1559:1: rule__ThenStep__Group__2 : rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3 ;
    public final void rule__ThenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1563:1: ( rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1564:2: rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__23202);
            rule__ThenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__3_in_rule__ThenStep__Group__23205);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1571:1: rule__ThenStep__Group__2__Impl : ( ( rule__ThenStep__DescAssignment_2 )* ) ;
    public final void rule__ThenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1575:1: ( ( ( rule__ThenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1577:1: ( rule__ThenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1578:1: ( rule__ThenStep__DescAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_TEXT && LA23_0<=RULE_CODE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1578:2: rule__ThenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__DescAssignment_2_in_rule__ThenStep__Group__2__Impl3232);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1588:1: rule__ThenStep__Group__3 : rule__ThenStep__Group__3__Impl ;
    public final void rule__ThenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1592:1: ( rule__ThenStep__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1593:2: rule__ThenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__3__Impl_in_rule__ThenStep__Group__33263);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1599:1: rule__ThenStep__Group__3__Impl : ( ( rule__ThenStep__RowsAssignment_3 )* ) ;
    public final void rule__ThenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1603:1: ( ( ( rule__ThenStep__RowsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1604:1: ( ( rule__ThenStep__RowsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1604:1: ( ( rule__ThenStep__RowsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1605:1: ( rule__ThenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getThenStepAccess().getRowsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1606:1: ( rule__ThenStep__RowsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EXAMPLE_CELL) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1606:2: rule__ThenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__RowsAssignment_3_in_rule__ThenStep__Group__3__Impl3290);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1624:1: rule__GivenStep__Group__0 : rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 ;
    public final void rule__GivenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1628:1: ( rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1629:2: rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__03329);
            rule__GivenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__03332);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1636:1: rule__GivenStep__Group__0__Impl : ( ( rule__GivenStep__TagsAssignment_0 )* ) ;
    public final void rule__GivenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1640:1: ( ( ( rule__GivenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1641:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1641:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1642:1: ( rule__GivenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:1: ( rule__GivenStep__TagsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TAG) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:2: rule__GivenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl3359);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1653:1: rule__GivenStep__Group__1 : rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 ;
    public final void rule__GivenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1657:1: ( rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1658:2: rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13390);
            rule__GivenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13393);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1665:1: rule__GivenStep__Group__1__Impl : ( ( rule__GivenStep__DescAssignment_1 ) ) ;
    public final void rule__GivenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1669:1: ( ( ( rule__GivenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1670:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1670:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1671:1: ( rule__GivenStep__DescAssignment_1 )
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1672:1: ( rule__GivenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1672:2: rule__GivenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3420);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1682:1: rule__GivenStep__Group__2 : rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3 ;
    public final void rule__GivenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1686:1: ( rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1687:2: rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23450);
            rule__GivenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__3_in_rule__GivenStep__Group__23453);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1694:1: rule__GivenStep__Group__2__Impl : ( ( rule__GivenStep__DescAssignment_2 )* ) ;
    public final void rule__GivenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1698:1: ( ( ( rule__GivenStep__DescAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1699:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1699:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1700:1: ( rule__GivenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1701:1: ( rule__GivenStep__DescAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_TEXT && LA26_0<=RULE_CODE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1701:2: rule__GivenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__DescAssignment_2_in_rule__GivenStep__Group__2__Impl3480);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1711:1: rule__GivenStep__Group__3 : rule__GivenStep__Group__3__Impl ;
    public final void rule__GivenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1715:1: ( rule__GivenStep__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1716:2: rule__GivenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__3__Impl_in_rule__GivenStep__Group__33511);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1722:1: rule__GivenStep__Group__3__Impl : ( ( rule__GivenStep__RowsAssignment_3 )* ) ;
    public final void rule__GivenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1726:1: ( ( ( rule__GivenStep__RowsAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1727:1: ( ( rule__GivenStep__RowsAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1727:1: ( ( rule__GivenStep__RowsAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1728:1: ( rule__GivenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getGivenStepAccess().getRowsAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1729:1: ( rule__GivenStep__RowsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EXAMPLE_CELL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1729:2: rule__GivenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__RowsAssignment_3_in_rule__GivenStep__Group__3__Impl3538);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1747:1: rule__AndStep__Group__0 : rule__AndStep__Group__0__Impl rule__AndStep__Group__1 ;
    public final void rule__AndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1751:1: ( rule__AndStep__Group__0__Impl rule__AndStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1752:2: rule__AndStep__Group__0__Impl rule__AndStep__Group__1
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03577);
            rule__AndStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03580);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1759:1: rule__AndStep__Group__0__Impl : ( ( rule__AndStep__DescAssignment_0 ) ) ;
    public final void rule__AndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( ( ( rule__AndStep__DescAssignment_0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: ( ( rule__AndStep__DescAssignment_0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: ( ( rule__AndStep__DescAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1765:1: ( rule__AndStep__DescAssignment_0 )
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1766:1: ( rule__AndStep__DescAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1766:2: rule__AndStep__DescAssignment_0
            {
            pushFollow(FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3607);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1776:1: rule__AndStep__Group__1 : rule__AndStep__Group__1__Impl rule__AndStep__Group__2 ;
    public final void rule__AndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1780:1: ( rule__AndStep__Group__1__Impl rule__AndStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1781:2: rule__AndStep__Group__1__Impl rule__AndStep__Group__2
            {
            pushFollow(FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13637);
            rule__AndStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndStep__Group__2_in_rule__AndStep__Group__13640);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1788:1: rule__AndStep__Group__1__Impl : ( ( rule__AndStep__DescAssignment_1 )* ) ;
    public final void rule__AndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1792:1: ( ( ( rule__AndStep__DescAssignment_1 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ( rule__AndStep__DescAssignment_1 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ( rule__AndStep__DescAssignment_1 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: ( rule__AndStep__DescAssignment_1 )*
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1795:1: ( rule__AndStep__DescAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_TEXT && LA28_0<=RULE_CODE)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1795:2: rule__AndStep__DescAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AndStep__DescAssignment_1_in_rule__AndStep__Group__1__Impl3667);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1805:1: rule__AndStep__Group__2 : rule__AndStep__Group__2__Impl ;
    public final void rule__AndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1809:1: ( rule__AndStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1810:2: rule__AndStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AndStep__Group__2__Impl_in_rule__AndStep__Group__23698);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1816:1: rule__AndStep__Group__2__Impl : ( ( rule__AndStep__RowsAssignment_2 )* ) ;
    public final void rule__AndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1820:1: ( ( ( rule__AndStep__RowsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1821:1: ( ( rule__AndStep__RowsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1821:1: ( ( rule__AndStep__RowsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1822:1: ( rule__AndStep__RowsAssignment_2 )*
            {
             before(grammarAccess.getAndStepAccess().getRowsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1823:1: ( rule__AndStep__RowsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EXAMPLE_CELL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1823:2: rule__AndStep__RowsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AndStep__RowsAssignment_2_in_rule__AndStep__Group__2__Impl3725);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1840:1: rule__Feature__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1844:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1845:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1845:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1846:1: RULE_TAG
            {
             before(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03767); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1855:1: rule__Feature__NameAssignment_1 : ( RULE_FEATURE_TEXT ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1859:1: ( ( RULE_FEATURE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1860:1: ( RULE_FEATURE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1860:1: ( RULE_FEATURE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1861:1: RULE_FEATURE_TEXT
            {
             before(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_FEATURE_TEXT,FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13798); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1870:1: rule__Feature__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Feature__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1874:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1875:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1875:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1876:1: ruleNarrativeElement
            {
             before(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23829);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1885:1: rule__Feature__ScenariosAssignment_3 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1889:1: ( ( ruleAbstractScenario ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1890:1: ( ruleAbstractScenario )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1890:1: ( ruleAbstractScenario )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1891:1: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33860);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1900:1: rule__FreeText__NameAssignment : ( RULE_TEXT ) ;
    public final void rule__FreeText__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1904:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1905:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1905:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1906:1: RULE_TEXT
            {
             before(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3891); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1915:1: rule__AsA__NameAssignment : ( RULE_AS_A ) ;
    public final void rule__AsA__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1919:1: ( ( RULE_AS_A ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1920:1: ( RULE_AS_A )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1920:1: ( RULE_AS_A )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1921:1: RULE_AS_A
            {
             before(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
            match(input,RULE_AS_A,FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3922); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1930:1: rule__InOrderTo__NameAssignment : ( RULE_IN_ORDER_TO ) ;
    public final void rule__InOrderTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1934:1: ( ( RULE_IN_ORDER_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1935:1: ( RULE_IN_ORDER_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1935:1: ( RULE_IN_ORDER_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1936:1: RULE_IN_ORDER_TO
            {
             before(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
            match(input,RULE_IN_ORDER_TO,FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3953); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1945:1: rule__IWantTo__NameAssignment : ( RULE_I_WANT_TO ) ;
    public final void rule__IWantTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1949:1: ( ( RULE_I_WANT_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1950:1: ( RULE_I_WANT_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1950:1: ( RULE_I_WANT_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1951:1: RULE_I_WANT_TO
            {
             before(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
            match(input,RULE_I_WANT_TO,FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3984); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1960:1: rule__Scenario__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1964:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1965:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1965:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1966:1: RULE_TAG
            {
             before(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_04015); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1975:1: rule__Scenario__NameAssignment_1 : ( RULE_SCENARIO_TEXT ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1979:1: ( ( RULE_SCENARIO_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1980:1: ( RULE_SCENARIO_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1980:1: ( RULE_SCENARIO_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1981:1: RULE_SCENARIO_TEXT
            {
             before(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_14046); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1990:1: rule__Scenario__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Scenario__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1994:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1995:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1995:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1996:1: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Scenario__ElementsAssignment_24077);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2005:1: rule__Scenario__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2009:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2010:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2010:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2011:1: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_34108);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2020:1: rule__ScenarioWithOutline__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ScenarioWithOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2024:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2025:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2025:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2026:1: RULE_TAG
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_04139); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2035:1: rule__ScenarioWithOutline__NameAssignment_1 : ( RULE_SCENARIO_OUTLINE_TEXT ) ;
    public final void rule__ScenarioWithOutline__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2039:1: ( ( RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2040:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2040:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2041:1: RULE_SCENARIO_OUTLINE_TEXT
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_14170); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2050:1: rule__ScenarioWithOutline__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__ScenarioWithOutline__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2054:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2055:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2055:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2056:1: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__ScenarioWithOutline__ElementsAssignment_24201);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2065:1: rule__ScenarioWithOutline__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__ScenarioWithOutline__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2069:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2070:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2070:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2071:1: ruleStep
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_34232);
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


    // $ANTLR start "rule__ScenarioWithOutline__ExampleAssignment_4"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2080:1: rule__ScenarioWithOutline__ExampleAssignment_4 : ( ruleExample ) ;
    public final void rule__ScenarioWithOutline__ExampleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2084:1: ( ( ruleExample ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2085:1: ( ruleExample )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2085:1: ( ruleExample )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2086:1: ruleExample
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getExampleExampleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExample_in_rule__ScenarioWithOutline__ExampleAssignment_44263);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getExampleExampleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__ExampleAssignment_4"


    // $ANTLR start "rule__Example__HeadingAssignment_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2095:1: rule__Example__HeadingAssignment_1 : ( ruleExampleRow ) ;
    public final void rule__Example__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2099:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2100:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2101:1: ruleExampleRow
            {
             before(grammarAccess.getExampleAccess().getHeadingExampleRowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__Example__HeadingAssignment_14294);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getHeadingExampleRowParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Example__HeadingAssignment_1"


    // $ANTLR start "rule__Example__RowsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2110:1: rule__Example__RowsAssignment_2 : ( ruleExampleRow ) ;
    public final void rule__Example__RowsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2114:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2115:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2115:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2116:1: ruleExampleRow
            {
             before(grammarAccess.getExampleAccess().getRowsExampleRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__Example__RowsAssignment_24325);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getRowsExampleRowParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Example__RowsAssignment_2"


    // $ANTLR start "rule__ExampleRow__CellsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2125:1: rule__ExampleRow__CellsAssignment_0 : ( ruleExampleCell ) ;
    public final void rule__ExampleRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2129:1: ( ( ruleExampleCell ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2130:1: ( ruleExampleCell )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2130:1: ( ruleExampleCell )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2131:1: ruleExampleCell
            {
             before(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExampleCell_in_rule__ExampleRow__CellsAssignment_04356);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2140:1: rule__ExampleCell__ValueAssignment : ( RULE_EXAMPLE_CELL ) ;
    public final void rule__ExampleCell__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2144:1: ( ( RULE_EXAMPLE_CELL ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:1: ( RULE_EXAMPLE_CELL )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2145:1: ( RULE_EXAMPLE_CELL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2146:1: RULE_EXAMPLE_CELL
            {
             before(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 
            match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleCell__ValueAssignment4387); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2155:1: rule__Background__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2159:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2160:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2160:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2161:1: RULE_TAG
            {
             before(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_04418); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2170:1: rule__Background__NameAssignment_1 : ( RULE_BACKGROUND_TEXT ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2174:1: ( ( RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2175:1: ( RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2175:1: ( RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2176:1: RULE_BACKGROUND_TEXT
            {
             before(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_14449); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2185:1: rule__Background__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2189:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2190:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2190:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2191:1: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Background__StepsAssignment_24480);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2200:1: rule__WhenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__WhenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2204:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2205:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2205:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2206:1: RULE_TAG
            {
             before(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_04511); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2215:1: rule__WhenStep__DescAssignment_1 : ( RULE_WHEN_TEXT ) ;
    public final void rule__WhenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2219:1: ( ( RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2220:1: ( RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2220:1: ( RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2221:1: RULE_WHEN_TEXT
            {
             before(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_14542); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2230:1: rule__WhenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__WhenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2234:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2235:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2235:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2236:1: ruleOptionalText
            {
             before(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__WhenStep__DescAssignment_24573);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2245:1: rule__WhenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__WhenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2249:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2250:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2250:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2251:1: ruleExampleRow
            {
             before(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__WhenStep__RowsAssignment_34604);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2260:1: rule__ThenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ThenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2264:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2265:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2265:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2266:1: RULE_TAG
            {
             before(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04635); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2275:1: rule__ThenStep__DescAssignment_1 : ( RULE_THEN_TEXT ) ;
    public final void rule__ThenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2279:1: ( ( RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2280:1: ( RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2280:1: ( RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2281:1: RULE_THEN_TEXT
            {
             before(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14666); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2290:1: rule__ThenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__ThenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2294:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2295:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2295:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2296:1: ruleOptionalText
            {
             before(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__ThenStep__DescAssignment_24697);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2305:1: rule__ThenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__ThenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2309:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2310:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2310:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2311:1: ruleExampleRow
            {
             before(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ThenStep__RowsAssignment_34728);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2320:1: rule__GivenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__GivenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2324:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2325:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2325:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2326:1: RULE_TAG
            {
             before(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04759); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2335:1: rule__GivenStep__DescAssignment_1 : ( RULE_GIVEN_TEXT ) ;
    public final void rule__GivenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2339:1: ( ( RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2340:1: ( RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2340:1: ( RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2341:1: RULE_GIVEN_TEXT
            {
             before(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14790); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2350:1: rule__GivenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__GivenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2354:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2355:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2355:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2356:1: ruleOptionalText
            {
             before(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__GivenStep__DescAssignment_24821);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2365:1: rule__GivenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__GivenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2369:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2370:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2370:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2371:1: ruleExampleRow
            {
             before(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__GivenStep__RowsAssignment_34852);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2380:1: rule__AndStep__DescAssignment_0 : ( RULE_AND_TEXT ) ;
    public final void rule__AndStep__DescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2384:1: ( ( RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2385:1: ( RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2385:1: ( RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2386:1: RULE_AND_TEXT
            {
             before(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
            match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04883); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2395:1: rule__AndStep__DescAssignment_1 : ( ruleOptionalText ) ;
    public final void rule__AndStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2399:1: ( ( ruleOptionalText ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2400:1: ( ruleOptionalText )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2400:1: ( ruleOptionalText )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2401:1: ruleOptionalText
            {
             before(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOptionalText_in_rule__AndStep__DescAssignment_14914);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2410:1: rule__AndStep__RowsAssignment_2 : ( ruleExampleRow ) ;
    public final void rule__AndStep__RowsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2414:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2415:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2415:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2416:1: ruleExampleRow
            {
             before(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__AndStep__RowsAssignment_24945);
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
            return "626:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );";
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
            return "654:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );";
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
            return "()* loopback of 946:1: ( rule__Scenario__StepsAssignment_3 )*";
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
            return "()* loopback of 1362:1: ( rule__Background__StepsAssignment_2 )*";
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
    public static final BitSet FOLLOW_ruleExample_in_entryRuleExample601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExample608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Example__Group__0_in_ruleExample634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_entryRuleExampleRow661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleRow668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__0_in_ruleExampleRow694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_entryRuleExampleCell721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExampleCell728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleCell__ValueAssignment_in_ruleExampleCell754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0_in_ruleBackground814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_entryRuleWhenStep901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenStep908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0_in_ruleWhenStep934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_entryRuleThenStep961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenStep968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0_in_ruleThenStep994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_entryRuleGivenStep1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGivenStep1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0_in_ruleGivenStep1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_entryRuleAndStep1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndStep1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0_in_ruleAndStep1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_entryRuleOptionalText1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalText1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalText__Alternatives_in_ruleOptionalText1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_rule__NarrativeElement__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_rule__NarrativeElement__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_rule__NarrativeElement__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_rule__NarrativeElement__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_rule__AbstractScenario__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__AbstractScenario__Alternatives1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_rule__AbstractScenario__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_rule__Step__Alternatives1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_rule__Step__Alternatives1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_rule__Step__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_rule__Step__Alternatives1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__OptionalText__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_rule__OptionalText__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01489 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1519 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11550 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21611 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1641 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1699 = new BitSet(new long[]{0x0000000000016102L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01738 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1768 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11799 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21859 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ElementsAssignment_2_in_rule__Scenario__Group__2__Impl1889 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1949 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_3_in_rule__Scenario__Group__3__Impl1961 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__02002 = new BitSet(new long[]{0x0000000000016100L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__02005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl2032 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__12063 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22123 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__ElementsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2153 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32184 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2216 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_3_in_rule__ScenarioWithOutline__Group__3__Impl2228 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__ExampleAssignment_4_in_rule__ScenarioWithOutline__Group__4__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Example__Group__0__Impl_in_rule__Example__Group__02328 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Example__Group__1_in_rule__Example__Group__02331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_rule__Example__Group__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Example__Group__1__Impl_in_rule__Example__Group__12387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Example__Group__2_in_rule__Example__Group__12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Example__HeadingAssignment_1_in_rule__Example__Group__1__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Example__Group__2__Impl_in_rule__Example__Group__22447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Example__RowsAssignment_2_in_rule__Example__Group__2__Impl2474 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02511 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2543 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2555 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02648 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2678 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12709 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2796 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02833 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2863 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12894 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22954 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__3_in_rule__WhenStep__Group__22957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_2_in_rule__WhenStep__Group__2__Impl2984 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__3__Impl_in_rule__WhenStep__Group__33015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__RowsAssignment_3_in_rule__WhenStep__Group__3__Impl3042 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__03081 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__03084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl3111 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__13142 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__13145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__23202 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__3_in_rule__ThenStep__Group__23205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_2_in_rule__ThenStep__Group__2__Impl3232 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__3__Impl_in_rule__ThenStep__Group__33263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__RowsAssignment_3_in_rule__ThenStep__Group__3__Impl3290 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__03329 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__03332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl3359 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13390 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23450 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__3_in_rule__GivenStep__Group__23453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_2_in_rule__GivenStep__Group__2__Impl3480 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__3__Impl_in_rule__GivenStep__Group__33511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__RowsAssignment_3_in_rule__GivenStep__Group__3__Impl3538 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03577 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13637 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_rule__AndStep__Group__2_in_rule__AndStep__Group__13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_1_in_rule__AndStep__Group__1__Impl3667 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__AndStep__Group__2__Impl_in_rule__AndStep__Group__23698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__RowsAssignment_2_in_rule__AndStep__Group__2__Impl3725 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_04015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Scenario__ElementsAssignment_24077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_34108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_04139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__ScenarioWithOutline__ElementsAssignment_24201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_34232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExample_in_rule__ScenarioWithOutline__ExampleAssignment_44263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__Example__HeadingAssignment_14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__Example__RowsAssignment_24325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleCell_in_rule__ExampleRow__CellsAssignment_04356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleCell__ValueAssignment4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_04418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Background__StepsAssignment_24480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_04511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__WhenStep__DescAssignment_24573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__WhenStep__RowsAssignment_34604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__ThenStep__DescAssignment_24697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ThenStep__RowsAssignment_34728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__GivenStep__DescAssignment_24821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__GivenStep__RowsAssignment_34852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalText_in_rule__AndStep__DescAssignment_14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__AndStep__RowsAssignment_24945 = new BitSet(new long[]{0x0000000000000002L});

}