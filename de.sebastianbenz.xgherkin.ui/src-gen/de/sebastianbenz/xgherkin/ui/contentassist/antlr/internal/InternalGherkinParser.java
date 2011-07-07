/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXAMPLE_HEADING", "RULE_EXAMPLE_ROW_END", "RULE_TAG", "RULE_FEATURE_TEXT", "RULE_TEXT", "RULE_AS_A", "RULE_IN_ORDER_TO", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_EXAMPLE_CELL", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_CODE", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_AS_A=9;
    public static final int RULE_IN_ORDER_TO=10;
    public static final int RULE_THEN_TEXT=18;
    public static final int RULE_TAG=6;
    public static final int RULE_TEXT=8;
    public static final int RULE_EXAMPLE_HEADING=4;
    public static final int RULE_SL_COMMENT=21;
    public static final int EOF=-1;
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


    // $ANTLR start "entryRuleBackground"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:341:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:342:1: ( ruleBackground EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:343:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground661);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground668); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:350:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:354:2: ( ( ( rule__Background__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:355:1: ( ( rule__Background__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:355:1: ( ( rule__Background__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:356:1: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:357:1: ( rule__Background__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:357:2: rule__Background__Group__0
            {
            pushFollow(FOLLOW_rule__Background__Group__0_in_ruleBackground694);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:369:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:370:1: ( ruleStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:371:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep721);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep728); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:378:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:382:2: ( ( ( rule__Step__Alternatives ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( ( rule__Step__Alternatives ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( ( rule__Step__Alternatives ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:384:1: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:385:1: ( rule__Step__Alternatives )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:385:2: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep754);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:397:1: entryRuleWhenStep : ruleWhenStep EOF ;
    public final void entryRuleWhenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:398:1: ( ruleWhenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:399:1: ruleWhenStep EOF
            {
             before(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_ruleWhenStep_in_entryRuleWhenStep781);
            ruleWhenStep();

            state._fsp--;

             after(grammarAccess.getWhenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenStep788); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:406:1: ruleWhenStep : ( ( rule__WhenStep__Group__0 ) ) ;
    public final void ruleWhenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:410:2: ( ( ( rule__WhenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( ( rule__WhenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( ( rule__WhenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:412:1: ( rule__WhenStep__Group__0 )
            {
             before(grammarAccess.getWhenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:413:1: ( rule__WhenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:413:2: rule__WhenStep__Group__0
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0_in_ruleWhenStep814);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:425:1: entryRuleThenStep : ruleThenStep EOF ;
    public final void entryRuleThenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:426:1: ( ruleThenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:427:1: ruleThenStep EOF
            {
             before(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_ruleThenStep_in_entryRuleThenStep841);
            ruleThenStep();

            state._fsp--;

             after(grammarAccess.getThenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenStep848); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:434:1: ruleThenStep : ( ( rule__ThenStep__Group__0 ) ) ;
    public final void ruleThenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:438:2: ( ( ( rule__ThenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:439:1: ( ( rule__ThenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:439:1: ( ( rule__ThenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:440:1: ( rule__ThenStep__Group__0 )
            {
             before(grammarAccess.getThenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:441:1: ( rule__ThenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:441:2: rule__ThenStep__Group__0
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0_in_ruleThenStep874);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:453:1: entryRuleGivenStep : ruleGivenStep EOF ;
    public final void entryRuleGivenStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:454:1: ( ruleGivenStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:455:1: ruleGivenStep EOF
            {
             before(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_ruleGivenStep_in_entryRuleGivenStep901);
            ruleGivenStep();

            state._fsp--;

             after(grammarAccess.getGivenStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGivenStep908); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:462:1: ruleGivenStep : ( ( rule__GivenStep__Group__0 ) ) ;
    public final void ruleGivenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:466:2: ( ( ( rule__GivenStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:467:1: ( ( rule__GivenStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:467:1: ( ( rule__GivenStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:468:1: ( rule__GivenStep__Group__0 )
            {
             before(grammarAccess.getGivenStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:469:1: ( rule__GivenStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:469:2: rule__GivenStep__Group__0
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0_in_ruleGivenStep934);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:481:1: entryRuleAndStep : ruleAndStep EOF ;
    public final void entryRuleAndStep() throws RecognitionException {
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:482:1: ( ruleAndStep EOF )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:483:1: ruleAndStep EOF
            {
             before(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_ruleAndStep_in_entryRuleAndStep961);
            ruleAndStep();

            state._fsp--;

             after(grammarAccess.getAndStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndStep968); 

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:490:1: ruleAndStep : ( ( rule__AndStep__Group__0 ) ) ;
    public final void ruleAndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:494:2: ( ( ( rule__AndStep__Group__0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( ( rule__AndStep__Group__0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( ( rule__AndStep__Group__0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:496:1: ( rule__AndStep__Group__0 )
            {
             before(grammarAccess.getAndStepAccess().getGroup()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:497:1: ( rule__AndStep__Group__0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:497:2: rule__AndStep__Group__0
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0_in_ruleAndStep994);
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


    // $ANTLR start "rule__NarrativeElement__Alternatives"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:509:1: rule__NarrativeElement__Alternatives : ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) );
    public final void rule__NarrativeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:513:1: ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) )
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:514:1: ( ruleInOrderTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:514:1: ( ruleInOrderTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:515:1: ruleInOrderTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInOrderTo_in_rule__NarrativeElement__Alternatives1030);
                    ruleInOrderTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:520:6: ( ruleAsA )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:520:6: ( ruleAsA )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:521:1: ruleAsA
                    {
                     before(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsA_in_rule__NarrativeElement__Alternatives1047);
                    ruleAsA();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:526:6: ( ruleIWantTo )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:526:6: ( ruleIWantTo )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:527:1: ruleIWantTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIWantTo_in_rule__NarrativeElement__Alternatives1064);
                    ruleIWantTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:532:6: ( ruleFreeText )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:532:6: ( ruleFreeText )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:533:1: ruleFreeText
                    {
                     before(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFreeText_in_rule__NarrativeElement__Alternatives1081);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:543:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:547:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:548:1: ( ruleBackground )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:548:1: ( ruleBackground )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:549:1: ruleBackground
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBackground_in_rule__AbstractScenario__Alternatives1113);
                    ruleBackground();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:554:6: ( ruleScenario )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:554:6: ( ruleScenario )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:555:1: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__AbstractScenario__Alternatives1130);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:560:6: ( ruleScenarioWithOutline )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:560:6: ( ruleScenarioWithOutline )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:561:1: ruleScenarioWithOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleScenarioWithOutline_in_rule__AbstractScenario__Alternatives1147);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:571:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:575:1: ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:576:1: ( ruleWhenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:576:1: ( ruleWhenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:577:1: ruleWhenStep
                    {
                     before(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWhenStep_in_rule__Step__Alternatives1179);
                    ruleWhenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:582:6: ( ruleThenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:582:6: ( ruleThenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:583:1: ruleThenStep
                    {
                     before(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleThenStep_in_rule__Step__Alternatives1196);
                    ruleThenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:588:6: ( ruleGivenStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:588:6: ( ruleGivenStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:589:1: ruleGivenStep
                    {
                     before(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGivenStep_in_rule__Step__Alternatives1213);
                    ruleGivenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:594:6: ( ruleAndStep )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:594:6: ( ruleAndStep )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:595:1: ruleAndStep
                    {
                     before(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAndStep_in_rule__Step__Alternatives1230);
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


    // $ANTLR start "rule__WhenStep__Alternatives_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:605:1: rule__WhenStep__Alternatives_2 : ( ( ( rule__WhenStep__DescAssignment_2_0 ) ) | ( ( rule__WhenStep__DescAssignment_2_1 ) ) );
    public final void rule__WhenStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:609:1: ( ( ( rule__WhenStep__DescAssignment_2_0 ) ) | ( ( rule__WhenStep__DescAssignment_2_1 ) ) )
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
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:610:1: ( ( rule__WhenStep__DescAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:610:1: ( ( rule__WhenStep__DescAssignment_2_0 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:611:1: ( rule__WhenStep__DescAssignment_2_0 )
                    {
                     before(grammarAccess.getWhenStepAccess().getDescAssignment_2_0()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:612:1: ( rule__WhenStep__DescAssignment_2_0 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:612:2: rule__WhenStep__DescAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__WhenStep__DescAssignment_2_0_in_rule__WhenStep__Alternatives_21262);
                    rule__WhenStep__DescAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenStepAccess().getDescAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:616:6: ( ( rule__WhenStep__DescAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:616:6: ( ( rule__WhenStep__DescAssignment_2_1 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:617:1: ( rule__WhenStep__DescAssignment_2_1 )
                    {
                     before(grammarAccess.getWhenStepAccess().getDescAssignment_2_1()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:618:1: ( rule__WhenStep__DescAssignment_2_1 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:618:2: rule__WhenStep__DescAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__WhenStep__DescAssignment_2_1_in_rule__WhenStep__Alternatives_21280);
                    rule__WhenStep__DescAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenStepAccess().getDescAssignment_2_1()); 

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
    // $ANTLR end "rule__WhenStep__Alternatives_2"


    // $ANTLR start "rule__ThenStep__Alternatives_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:627:1: rule__ThenStep__Alternatives_2 : ( ( ( rule__ThenStep__DescAssignment_2_0 ) ) | ( ( rule__ThenStep__DescAssignment_2_1 ) ) );
    public final void rule__ThenStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:631:1: ( ( ( rule__ThenStep__DescAssignment_2_0 ) ) | ( ( rule__ThenStep__DescAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_TEXT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_CODE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:632:1: ( ( rule__ThenStep__DescAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:632:1: ( ( rule__ThenStep__DescAssignment_2_0 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:633:1: ( rule__ThenStep__DescAssignment_2_0 )
                    {
                     before(grammarAccess.getThenStepAccess().getDescAssignment_2_0()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:634:1: ( rule__ThenStep__DescAssignment_2_0 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:634:2: rule__ThenStep__DescAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ThenStep__DescAssignment_2_0_in_rule__ThenStep__Alternatives_21313);
                    rule__ThenStep__DescAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenStepAccess().getDescAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:638:6: ( ( rule__ThenStep__DescAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:638:6: ( ( rule__ThenStep__DescAssignment_2_1 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:639:1: ( rule__ThenStep__DescAssignment_2_1 )
                    {
                     before(grammarAccess.getThenStepAccess().getDescAssignment_2_1()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:640:1: ( rule__ThenStep__DescAssignment_2_1 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:640:2: rule__ThenStep__DescAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ThenStep__DescAssignment_2_1_in_rule__ThenStep__Alternatives_21331);
                    rule__ThenStep__DescAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenStepAccess().getDescAssignment_2_1()); 

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
    // $ANTLR end "rule__ThenStep__Alternatives_2"


    // $ANTLR start "rule__GivenStep__Alternatives_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:649:1: rule__GivenStep__Alternatives_2 : ( ( ( rule__GivenStep__DescAssignment_2_0 ) ) | ( ( rule__GivenStep__DescAssignment_2_1 ) ) );
    public final void rule__GivenStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:653:1: ( ( ( rule__GivenStep__DescAssignment_2_0 ) ) | ( ( rule__GivenStep__DescAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TEXT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_CODE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:654:1: ( ( rule__GivenStep__DescAssignment_2_0 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:654:1: ( ( rule__GivenStep__DescAssignment_2_0 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:655:1: ( rule__GivenStep__DescAssignment_2_0 )
                    {
                     before(grammarAccess.getGivenStepAccess().getDescAssignment_2_0()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:656:1: ( rule__GivenStep__DescAssignment_2_0 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:656:2: rule__GivenStep__DescAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__GivenStep__DescAssignment_2_0_in_rule__GivenStep__Alternatives_21364);
                    rule__GivenStep__DescAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenStepAccess().getDescAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:660:6: ( ( rule__GivenStep__DescAssignment_2_1 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:660:6: ( ( rule__GivenStep__DescAssignment_2_1 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:661:1: ( rule__GivenStep__DescAssignment_2_1 )
                    {
                     before(grammarAccess.getGivenStepAccess().getDescAssignment_2_1()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:662:1: ( rule__GivenStep__DescAssignment_2_1 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:662:2: rule__GivenStep__DescAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__GivenStep__DescAssignment_2_1_in_rule__GivenStep__Alternatives_21382);
                    rule__GivenStep__DescAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenStepAccess().getDescAssignment_2_1()); 

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
    // $ANTLR end "rule__GivenStep__Alternatives_2"


    // $ANTLR start "rule__AndStep__Alternatives_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:671:1: rule__AndStep__Alternatives_1 : ( ( ( rule__AndStep__DescAssignment_1_0 ) ) | ( ( rule__AndStep__DescAssignment_1_1 ) ) );
    public final void rule__AndStep__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:675:1: ( ( ( rule__AndStep__DescAssignment_1_0 ) ) | ( ( rule__AndStep__DescAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TEXT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_CODE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:676:1: ( ( rule__AndStep__DescAssignment_1_0 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:676:1: ( ( rule__AndStep__DescAssignment_1_0 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:677:1: ( rule__AndStep__DescAssignment_1_0 )
                    {
                     before(grammarAccess.getAndStepAccess().getDescAssignment_1_0()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:678:1: ( rule__AndStep__DescAssignment_1_0 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:678:2: rule__AndStep__DescAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__AndStep__DescAssignment_1_0_in_rule__AndStep__Alternatives_11415);
                    rule__AndStep__DescAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndStepAccess().getDescAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:682:6: ( ( rule__AndStep__DescAssignment_1_1 ) )
                    {
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:682:6: ( ( rule__AndStep__DescAssignment_1_1 ) )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:683:1: ( rule__AndStep__DescAssignment_1_1 )
                    {
                     before(grammarAccess.getAndStepAccess().getDescAssignment_1_1()); 
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:684:1: ( rule__AndStep__DescAssignment_1_1 )
                    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:684:2: rule__AndStep__DescAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__AndStep__DescAssignment_1_1_in_rule__AndStep__Alternatives_11433);
                    rule__AndStep__DescAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndStepAccess().getDescAssignment_1_1()); 

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
    // $ANTLR end "rule__AndStep__Alternatives_1"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:695:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:699:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:700:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01464);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01467);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:707:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:711:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:712:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:712:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:713:1: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:714:1: ( rule__Feature__TagsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TAG) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:714:2: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1494);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:724:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:728:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:729:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11525);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11528);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:736:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:740:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:741:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:741:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:742:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:743:1: ( rule__Feature__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:743:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1555);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:753:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:757:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:758:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21585);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21588);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:765:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ElementsAssignment_2 )* ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:769:1: ( ( ( rule__Feature__ElementsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:770:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:770:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:771:1: ( rule__Feature__ElementsAssignment_2 )*
            {
             before(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:772:1: ( rule__Feature__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_TEXT && LA9_0<=RULE_I_WANT_TO)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:772:2: rule__Feature__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1615);
            	    rule__Feature__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:782:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:786:1: ( rule__Feature__Group__3__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:787:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31646);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:793:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__ScenariosAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:797:1: ( ( ( rule__Feature__ScenariosAssignment_3 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:798:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:798:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:799:1: ( rule__Feature__ScenariosAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:800:1: ( rule__Feature__ScenariosAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TAG||(LA10_0>=RULE_SCENARIO_TEXT && LA10_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA10_0==RULE_BACKGROUND_TEXT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:800:2: rule__Feature__ScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1673);
            	    rule__Feature__ScenariosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:818:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:822:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:823:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01712);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01715);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:830:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:834:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:835:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:835:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:836:1: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:837:1: ( rule__Scenario__TagsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAG) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:837:2: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1742);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:847:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:851:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:852:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11773);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11776);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:859:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:863:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:864:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:864:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:865:1: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:866:1: ( rule__Scenario__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:866:2: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1803);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:876:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:880:1: ( rule__Scenario__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:881:2: rule__Scenario__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21833);
            rule__Scenario__Group__2__Impl();

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:887:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__StepsAssignment_2 )* ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:891:1: ( ( ( rule__Scenario__StepsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:892:1: ( ( rule__Scenario__StepsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:892:1: ( ( rule__Scenario__StepsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:893:1: ( rule__Scenario__StepsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:894:1: ( rule__Scenario__StepsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:894:2: rule__Scenario__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__StepsAssignment_2_in_rule__Scenario__Group__2__Impl1860);
            	    rule__Scenario__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ScenarioWithOutline__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: rule__ScenarioWithOutline__Group__0 : rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 ;
    public final void rule__ScenarioWithOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:914:1: ( rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:915:2: rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__01897);
            rule__ScenarioWithOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__01900);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:922:1: rule__ScenarioWithOutline__Group__0__Impl : ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioWithOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:926:1: ( ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:927:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:927:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:928:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:929:1: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TAG) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:929:2: rule__ScenarioWithOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl1927);
            	    rule__ScenarioWithOutline__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:939:1: rule__ScenarioWithOutline__Group__1 : rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 ;
    public final void rule__ScenarioWithOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:943:1: ( rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:944:2: rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__11958);
            rule__ScenarioWithOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__11961);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:951:1: rule__ScenarioWithOutline__Group__1__Impl : ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) ;
    public final void rule__ScenarioWithOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:955:1: ( ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:956:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:956:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:957:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:958:1: ( rule__ScenarioWithOutline__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:958:2: rule__ScenarioWithOutline__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl1988);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:968:1: rule__ScenarioWithOutline__Group__2 : rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 ;
    public final void rule__ScenarioWithOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:972:1: ( rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:973:2: rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22018);
            rule__ScenarioWithOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22021);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:980:1: rule__ScenarioWithOutline__Group__2__Impl : ( ( rule__ScenarioWithOutline__StepsAssignment_2 )* ) ;
    public final void rule__ScenarioWithOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:984:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:985:1: ( ( rule__ScenarioWithOutline__StepsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:985:1: ( ( rule__ScenarioWithOutline__StepsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:986:1: ( rule__ScenarioWithOutline__StepsAssignment_2 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:987:1: ( rule__ScenarioWithOutline__StepsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TAG||LA14_0==RULE_WHEN_TEXT||(LA14_0>=RULE_THEN_TEXT && LA14_0<=RULE_AND_TEXT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:987:2: rule__ScenarioWithOutline__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__StepsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2048);
            	    rule__ScenarioWithOutline__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_2()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:997:1: rule__ScenarioWithOutline__Group__3 : rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 ;
    public final void rule__ScenarioWithOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1001:1: ( rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1002:2: rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32079);
            rule__ScenarioWithOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32082);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1009:1: rule__ScenarioWithOutline__Group__3__Impl : ( RULE_EXAMPLE_HEADING ) ;
    public final void rule__ScenarioWithOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( ( RULE_EXAMPLE_HEADING ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1014:1: ( RULE_EXAMPLE_HEADING )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1014:1: ( RULE_EXAMPLE_HEADING )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1015:1: RULE_EXAMPLE_HEADING
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_3()); 
            match(input,RULE_EXAMPLE_HEADING,FOLLOW_RULE_EXAMPLE_HEADING_in_rule__ScenarioWithOutline__Group__3__Impl2109); 
             after(grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_3()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1026:1: rule__ScenarioWithOutline__Group__4 : rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5 ;
    public final void rule__ScenarioWithOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1030:1: ( rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1031:2: rule__ScenarioWithOutline__Group__4__Impl rule__ScenarioWithOutline__Group__5
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42138);
            rule__ScenarioWithOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__5_in_rule__ScenarioWithOutline__Group__42141);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1038:1: rule__ScenarioWithOutline__Group__4__Impl : ( ( rule__ScenarioWithOutline__HeadingAssignment_4 ) ) ;
    public final void rule__ScenarioWithOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( ( ( rule__ScenarioWithOutline__HeadingAssignment_4 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1043:1: ( ( rule__ScenarioWithOutline__HeadingAssignment_4 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1043:1: ( ( rule__ScenarioWithOutline__HeadingAssignment_4 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1044:1: ( rule__ScenarioWithOutline__HeadingAssignment_4 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getHeadingAssignment_4()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1045:1: ( rule__ScenarioWithOutline__HeadingAssignment_4 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1045:2: rule__ScenarioWithOutline__HeadingAssignment_4
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__HeadingAssignment_4_in_rule__ScenarioWithOutline__Group__4__Impl2168);
            rule__ScenarioWithOutline__HeadingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getHeadingAssignment_4()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1055:1: rule__ScenarioWithOutline__Group__5 : rule__ScenarioWithOutline__Group__5__Impl ;
    public final void rule__ScenarioWithOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1059:1: ( rule__ScenarioWithOutline__Group__5__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1060:2: rule__ScenarioWithOutline__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ScenarioWithOutline__Group__5__Impl_in_rule__ScenarioWithOutline__Group__52198);
            rule__ScenarioWithOutline__Group__5__Impl();

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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1066:1: rule__ScenarioWithOutline__Group__5__Impl : ( ( rule__ScenarioWithOutline__RowsAssignment_5 )* ) ;
    public final void rule__ScenarioWithOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1070:1: ( ( ( rule__ScenarioWithOutline__RowsAssignment_5 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1071:1: ( ( rule__ScenarioWithOutline__RowsAssignment_5 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1071:1: ( ( rule__ScenarioWithOutline__RowsAssignment_5 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1072:1: ( rule__ScenarioWithOutline__RowsAssignment_5 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getRowsAssignment_5()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1073:1: ( rule__ScenarioWithOutline__RowsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EXAMPLE_CELL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1073:2: rule__ScenarioWithOutline__RowsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioWithOutline__RowsAssignment_5_in_rule__ScenarioWithOutline__Group__5__Impl2225);
            	    rule__ScenarioWithOutline__RowsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getRowsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExampleRow__Group__0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1095:1: rule__ExampleRow__Group__0 : rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 ;
    public final void rule__ExampleRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1099:1: ( rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1100:2: rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02268);
            rule__ExampleRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02271);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1107:1: rule__ExampleRow__Group__0__Impl : ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) ;
    public final void rule__ExampleRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1111:1: ( ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1112:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1112:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1113:1: ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1113:1: ( ( rule__ExampleRow__CellsAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1114:1: ( rule__ExampleRow__CellsAssignment_0 )
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1115:1: ( rule__ExampleRow__CellsAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1115:2: rule__ExampleRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2300);
            rule__ExampleRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

            }

            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1118:1: ( ( rule__ExampleRow__CellsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1119:1: ( rule__ExampleRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1120:1: ( rule__ExampleRow__CellsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EXAMPLE_CELL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1120:2: rule__ExampleRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2312);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1131:1: rule__ExampleRow__Group__1 : rule__ExampleRow__Group__1__Impl ;
    public final void rule__ExampleRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1135:1: ( rule__ExampleRow__Group__1__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1136:2: rule__ExampleRow__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12345);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1142:1: rule__ExampleRow__Group__1__Impl : ( RULE_EXAMPLE_ROW_END ) ;
    public final void rule__ExampleRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1146:1: ( ( RULE_EXAMPLE_ROW_END ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1147:1: ( RULE_EXAMPLE_ROW_END )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1147:1: ( RULE_EXAMPLE_ROW_END )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1148:1: RULE_EXAMPLE_ROW_END
            {
             before(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
            match(input,RULE_EXAMPLE_ROW_END,FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2372); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1163:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1167:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1168:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02405);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02408);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1175:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )* ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1179:1: ( ( ( rule__Background__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1180:1: ( ( rule__Background__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1180:1: ( ( rule__Background__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1181:1: ( rule__Background__TagsAssignment_0 )*
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1182:1: ( rule__Background__TagsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAG) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1182:2: rule__Background__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2435);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1192:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1196:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1197:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12466);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12469);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1204:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1208:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1209:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1209:1: ( ( rule__Background__NameAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1210:1: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1211:1: ( rule__Background__NameAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1211:2: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2496);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1221:1: rule__Background__Group__2 : rule__Background__Group__2__Impl ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1225:1: ( rule__Background__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1226:2: rule__Background__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22526);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1232:1: rule__Background__Group__2__Impl : ( ( rule__Background__StepsAssignment_2 )* ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1236:1: ( ( ( rule__Background__StepsAssignment_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1237:1: ( ( rule__Background__StepsAssignment_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1237:1: ( ( rule__Background__StepsAssignment_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1238:1: ( rule__Background__StepsAssignment_2 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1239:1: ( rule__Background__StepsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1239:2: rule__Background__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2553);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1255:1: rule__WhenStep__Group__0 : rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 ;
    public final void rule__WhenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1259:1: ( rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1260:2: rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02590);
            rule__WhenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02593);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1267:1: rule__WhenStep__Group__0__Impl : ( ( rule__WhenStep__TagsAssignment_0 )* ) ;
    public final void rule__WhenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1271:1: ( ( ( rule__WhenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1272:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1272:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1273:1: ( rule__WhenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1274:1: ( rule__WhenStep__TagsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TAG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1274:2: rule__WhenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2620);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1284:1: rule__WhenStep__Group__1 : rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 ;
    public final void rule__WhenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1288:1: ( rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1289:2: rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12651);
            rule__WhenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12654);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1296:1: rule__WhenStep__Group__1__Impl : ( ( rule__WhenStep__DescAssignment_1 ) ) ;
    public final void rule__WhenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1300:1: ( ( ( rule__WhenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1301:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1301:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1302:1: ( rule__WhenStep__DescAssignment_1 )
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( rule__WhenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1303:2: rule__WhenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2681);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1313:1: rule__WhenStep__Group__2 : rule__WhenStep__Group__2__Impl ;
    public final void rule__WhenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1317:1: ( rule__WhenStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1318:2: rule__WhenStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22711);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1324:1: rule__WhenStep__Group__2__Impl : ( ( rule__WhenStep__Alternatives_2 )* ) ;
    public final void rule__WhenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1328:1: ( ( ( rule__WhenStep__Alternatives_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1329:1: ( ( rule__WhenStep__Alternatives_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1329:1: ( ( rule__WhenStep__Alternatives_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1330:1: ( rule__WhenStep__Alternatives_2 )*
            {
             before(grammarAccess.getWhenStepAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1331:1: ( rule__WhenStep__Alternatives_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_TEXT||LA20_0==RULE_CODE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1331:2: rule__WhenStep__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__WhenStep__Alternatives_2_in_rule__WhenStep__Group__2__Impl2738);
            	    rule__WhenStep__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1347:1: rule__ThenStep__Group__0 : rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 ;
    public final void rule__ThenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1351:1: ( rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1352:2: rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__02775);
            rule__ThenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__02778);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1359:1: rule__ThenStep__Group__0__Impl : ( ( rule__ThenStep__TagsAssignment_0 )* ) ;
    public final void rule__ThenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1363:1: ( ( ( rule__ThenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1364:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1364:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1365:1: ( rule__ThenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1366:1: ( rule__ThenStep__TagsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TAG) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1366:2: rule__ThenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl2805);
            	    rule__ThenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1376:1: rule__ThenStep__Group__1 : rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 ;
    public final void rule__ThenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1380:1: ( rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1381:2: rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__12836);
            rule__ThenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__12839);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1388:1: rule__ThenStep__Group__1__Impl : ( ( rule__ThenStep__DescAssignment_1 ) ) ;
    public final void rule__ThenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1392:1: ( ( ( rule__ThenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1393:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1393:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1394:1: ( rule__ThenStep__DescAssignment_1 )
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1395:1: ( rule__ThenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1395:2: rule__ThenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl2866);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1405:1: rule__ThenStep__Group__2 : rule__ThenStep__Group__2__Impl ;
    public final void rule__ThenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1409:1: ( rule__ThenStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1410:2: rule__ThenStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__22896);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1416:1: rule__ThenStep__Group__2__Impl : ( ( rule__ThenStep__Alternatives_2 )* ) ;
    public final void rule__ThenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1420:1: ( ( ( rule__ThenStep__Alternatives_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1421:1: ( ( rule__ThenStep__Alternatives_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1421:1: ( ( rule__ThenStep__Alternatives_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1422:1: ( rule__ThenStep__Alternatives_2 )*
            {
             before(grammarAccess.getThenStepAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1423:1: ( rule__ThenStep__Alternatives_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TEXT||LA22_0==RULE_CODE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1423:2: rule__ThenStep__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ThenStep__Alternatives_2_in_rule__ThenStep__Group__2__Impl2923);
            	    rule__ThenStep__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1439:1: rule__GivenStep__Group__0 : rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 ;
    public final void rule__GivenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1443:1: ( rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1444:2: rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__02960);
            rule__GivenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__02963);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1451:1: rule__GivenStep__Group__0__Impl : ( ( rule__GivenStep__TagsAssignment_0 )* ) ;
    public final void rule__GivenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1455:1: ( ( ( rule__GivenStep__TagsAssignment_0 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1456:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1456:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1457:1: ( rule__GivenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1458:1: ( rule__GivenStep__TagsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_TAG) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1458:2: rule__GivenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl2990);
            	    rule__GivenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1468:1: rule__GivenStep__Group__1 : rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 ;
    public final void rule__GivenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1472:1: ( rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1473:2: rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13021);
            rule__GivenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13024);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1480:1: rule__GivenStep__Group__1__Impl : ( ( rule__GivenStep__DescAssignment_1 ) ) ;
    public final void rule__GivenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1484:1: ( ( ( rule__GivenStep__DescAssignment_1 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1485:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1485:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1486:1: ( rule__GivenStep__DescAssignment_1 )
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1487:1: ( rule__GivenStep__DescAssignment_1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1487:2: rule__GivenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3051);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1497:1: rule__GivenStep__Group__2 : rule__GivenStep__Group__2__Impl ;
    public final void rule__GivenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1501:1: ( rule__GivenStep__Group__2__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1502:2: rule__GivenStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23081);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1508:1: rule__GivenStep__Group__2__Impl : ( ( rule__GivenStep__Alternatives_2 )* ) ;
    public final void rule__GivenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1512:1: ( ( ( rule__GivenStep__Alternatives_2 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1513:1: ( ( rule__GivenStep__Alternatives_2 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1513:1: ( ( rule__GivenStep__Alternatives_2 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1514:1: ( rule__GivenStep__Alternatives_2 )*
            {
             before(grammarAccess.getGivenStepAccess().getAlternatives_2()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1515:1: ( rule__GivenStep__Alternatives_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_TEXT||LA24_0==RULE_CODE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1515:2: rule__GivenStep__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__GivenStep__Alternatives_2_in_rule__GivenStep__Group__2__Impl3108);
            	    rule__GivenStep__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1531:1: rule__AndStep__Group__0 : rule__AndStep__Group__0__Impl rule__AndStep__Group__1 ;
    public final void rule__AndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1535:1: ( rule__AndStep__Group__0__Impl rule__AndStep__Group__1 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1536:2: rule__AndStep__Group__0__Impl rule__AndStep__Group__1
            {
            pushFollow(FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03145);
            rule__AndStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03148);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1543:1: rule__AndStep__Group__0__Impl : ( ( rule__AndStep__DescAssignment_0 ) ) ;
    public final void rule__AndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1547:1: ( ( ( rule__AndStep__DescAssignment_0 ) ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1548:1: ( ( rule__AndStep__DescAssignment_0 ) )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1548:1: ( ( rule__AndStep__DescAssignment_0 ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1549:1: ( rule__AndStep__DescAssignment_0 )
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_0()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1550:1: ( rule__AndStep__DescAssignment_0 )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1550:2: rule__AndStep__DescAssignment_0
            {
            pushFollow(FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3175);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1560:1: rule__AndStep__Group__1 : rule__AndStep__Group__1__Impl ;
    public final void rule__AndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1564:1: ( rule__AndStep__Group__1__Impl )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1565:2: rule__AndStep__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13205);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1571:1: rule__AndStep__Group__1__Impl : ( ( rule__AndStep__Alternatives_1 )* ) ;
    public final void rule__AndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1575:1: ( ( ( rule__AndStep__Alternatives_1 )* ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( rule__AndStep__Alternatives_1 )* )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( rule__AndStep__Alternatives_1 )* )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1577:1: ( rule__AndStep__Alternatives_1 )*
            {
             before(grammarAccess.getAndStepAccess().getAlternatives_1()); 
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1578:1: ( rule__AndStep__Alternatives_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TEXT||LA25_0==RULE_CODE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1578:2: rule__AndStep__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__AndStep__Alternatives_1_in_rule__AndStep__Group__1__Impl3232);
            	    rule__AndStep__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAndStepAccess().getAlternatives_1()); 

            }


            }

        }
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1593:1: rule__Feature__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1597:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1598:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1598:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1599:1: RULE_TAG
            {
             before(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03272); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1608:1: rule__Feature__NameAssignment_1 : ( RULE_FEATURE_TEXT ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1612:1: ( ( RULE_FEATURE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1613:1: ( RULE_FEATURE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1613:1: ( RULE_FEATURE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1614:1: RULE_FEATURE_TEXT
            {
             before(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_FEATURE_TEXT,FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13303); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1623:1: rule__Feature__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Feature__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1627:1: ( ( ruleNarrativeElement ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1628:1: ( ruleNarrativeElement )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1628:1: ( ruleNarrativeElement )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1629:1: ruleNarrativeElement
            {
             before(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23334);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1638:1: rule__Feature__ScenariosAssignment_3 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1642:1: ( ( ruleAbstractScenario ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:1: ( ruleAbstractScenario )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1643:1: ( ruleAbstractScenario )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1644:1: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33365);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1653:1: rule__FreeText__NameAssignment : ( RULE_TEXT ) ;
    public final void rule__FreeText__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1657:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1658:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1658:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1659:1: RULE_TEXT
            {
             before(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3396); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1668:1: rule__AsA__NameAssignment : ( RULE_AS_A ) ;
    public final void rule__AsA__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1672:1: ( ( RULE_AS_A ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1673:1: ( RULE_AS_A )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1673:1: ( RULE_AS_A )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1674:1: RULE_AS_A
            {
             before(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
            match(input,RULE_AS_A,FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3427); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1683:1: rule__InOrderTo__NameAssignment : ( RULE_IN_ORDER_TO ) ;
    public final void rule__InOrderTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1687:1: ( ( RULE_IN_ORDER_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1688:1: ( RULE_IN_ORDER_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1688:1: ( RULE_IN_ORDER_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1689:1: RULE_IN_ORDER_TO
            {
             before(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
            match(input,RULE_IN_ORDER_TO,FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3458); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1698:1: rule__IWantTo__NameAssignment : ( RULE_I_WANT_TO ) ;
    public final void rule__IWantTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1702:1: ( ( RULE_I_WANT_TO ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1703:1: ( RULE_I_WANT_TO )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1703:1: ( RULE_I_WANT_TO )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1704:1: RULE_I_WANT_TO
            {
             before(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
            match(input,RULE_I_WANT_TO,FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3489); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1713:1: rule__Scenario__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1717:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1718:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1718:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1719:1: RULE_TAG
            {
             before(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_03520); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1728:1: rule__Scenario__NameAssignment_1 : ( RULE_SCENARIO_TEXT ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1732:1: ( ( RULE_SCENARIO_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1733:1: ( RULE_SCENARIO_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1733:1: ( RULE_SCENARIO_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1734:1: RULE_SCENARIO_TEXT
            {
             before(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_13551); 
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


    // $ANTLR start "rule__Scenario__StepsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1743:1: rule__Scenario__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1747:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1748:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1748:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1749:1: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_23582);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StepsAssignment_2"


    // $ANTLR start "rule__ScenarioWithOutline__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1758:1: rule__ScenarioWithOutline__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ScenarioWithOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1762:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: RULE_TAG
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_03613); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1773:1: rule__ScenarioWithOutline__NameAssignment_1 : ( RULE_SCENARIO_OUTLINE_TEXT ) ;
    public final void rule__ScenarioWithOutline__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1777:1: ( ( RULE_SCENARIO_OUTLINE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1778:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1778:1: ( RULE_SCENARIO_OUTLINE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1779:1: RULE_SCENARIO_OUTLINE_TEXT
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_13644); 
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


    // $ANTLR start "rule__ScenarioWithOutline__StepsAssignment_2"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1788:1: rule__ScenarioWithOutline__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__ScenarioWithOutline__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1792:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: ruleStep
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_23675);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioWithOutline__StepsAssignment_2"


    // $ANTLR start "rule__ScenarioWithOutline__HeadingAssignment_4"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1803:1: rule__ScenarioWithOutline__HeadingAssignment_4 : ( ruleExampleRow ) ;
    public final void rule__ScenarioWithOutline__HeadingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1807:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1808:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1808:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1809:1: ruleExampleRow
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__HeadingAssignment_43706);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioWithOutline__HeadingAssignment_4"


    // $ANTLR start "rule__ScenarioWithOutline__RowsAssignment_5"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1818:1: rule__ScenarioWithOutline__RowsAssignment_5 : ( ruleExampleRow ) ;
    public final void rule__ScenarioWithOutline__RowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1822:1: ( ( ruleExampleRow ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1823:1: ( ruleExampleRow )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1823:1: ( ruleExampleRow )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1824:1: ruleExampleRow
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__RowsAssignment_53737);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioWithOutline__RowsAssignment_5"


    // $ANTLR start "rule__ExampleRow__CellsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1833:1: rule__ExampleRow__CellsAssignment_0 : ( RULE_EXAMPLE_CELL ) ;
    public final void rule__ExampleRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1837:1: ( ( RULE_EXAMPLE_CELL ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1838:1: ( RULE_EXAMPLE_CELL )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1838:1: ( RULE_EXAMPLE_CELL )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1839:1: RULE_EXAMPLE_CELL
            {
             before(grammarAccess.getExampleRowAccess().getCellsEXAMPLE_CELLTerminalRuleCall_0_0()); 
            match(input,RULE_EXAMPLE_CELL,FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleRow__CellsAssignment_03768); 
             after(grammarAccess.getExampleRowAccess().getCellsEXAMPLE_CELLTerminalRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1848:1: rule__Background__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1852:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1853:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1853:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1854:1: RULE_TAG
            {
             before(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_03799); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1863:1: rule__Background__NameAssignment_1 : ( RULE_BACKGROUND_TEXT ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1867:1: ( ( RULE_BACKGROUND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1868:1: ( RULE_BACKGROUND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1868:1: ( RULE_BACKGROUND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1869:1: RULE_BACKGROUND_TEXT
            {
             before(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_BACKGROUND_TEXT,FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_13830); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1878:1: rule__Background__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1882:1: ( ( ruleStep ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1883:1: ( ruleStep )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1883:1: ( ruleStep )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1884:1: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Background__StepsAssignment_23861);
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1893:1: rule__WhenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__WhenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1897:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1898:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1898:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1899:1: RULE_TAG
            {
             before(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_03892); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1908:1: rule__WhenStep__DescAssignment_1 : ( RULE_WHEN_TEXT ) ;
    public final void rule__WhenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1912:1: ( ( RULE_WHEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1913:1: ( RULE_WHEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1913:1: ( RULE_WHEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1914:1: RULE_WHEN_TEXT
            {
             before(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_13923); 
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


    // $ANTLR start "rule__WhenStep__DescAssignment_2_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1923:1: rule__WhenStep__DescAssignment_2_0 : ( RULE_TEXT ) ;
    public final void rule__WhenStep__DescAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1927:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1928:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1928:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1929:1: RULE_TEXT
            {
             before(grammarAccess.getWhenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__WhenStep__DescAssignment_2_03954); 
             after(grammarAccess.getWhenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenStep__DescAssignment_2_0"


    // $ANTLR start "rule__WhenStep__DescAssignment_2_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1938:1: rule__WhenStep__DescAssignment_2_1 : ( RULE_CODE ) ;
    public final void rule__WhenStep__DescAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1942:1: ( ( RULE_CODE ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1943:1: ( RULE_CODE )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1943:1: ( RULE_CODE )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1944:1: RULE_CODE
            {
             before(grammarAccess.getWhenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
            match(input,RULE_CODE,FOLLOW_RULE_CODE_in_rule__WhenStep__DescAssignment_2_13985); 
             after(grammarAccess.getWhenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenStep__DescAssignment_2_1"


    // $ANTLR start "rule__ThenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1953:1: rule__ThenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ThenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1957:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1958:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1958:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1959:1: RULE_TAG
            {
             before(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04016); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1968:1: rule__ThenStep__DescAssignment_1 : ( RULE_THEN_TEXT ) ;
    public final void rule__ThenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1972:1: ( ( RULE_THEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1973:1: ( RULE_THEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1973:1: ( RULE_THEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1974:1: RULE_THEN_TEXT
            {
             before(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14047); 
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


    // $ANTLR start "rule__ThenStep__DescAssignment_2_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1983:1: rule__ThenStep__DescAssignment_2_0 : ( RULE_TEXT ) ;
    public final void rule__ThenStep__DescAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1987:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1988:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1988:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1989:1: RULE_TEXT
            {
             before(grammarAccess.getThenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__ThenStep__DescAssignment_2_04078); 
             after(grammarAccess.getThenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenStep__DescAssignment_2_0"


    // $ANTLR start "rule__ThenStep__DescAssignment_2_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:1998:1: rule__ThenStep__DescAssignment_2_1 : ( RULE_CODE ) ;
    public final void rule__ThenStep__DescAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2002:1: ( ( RULE_CODE ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2003:1: ( RULE_CODE )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2003:1: ( RULE_CODE )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2004:1: RULE_CODE
            {
             before(grammarAccess.getThenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
            match(input,RULE_CODE,FOLLOW_RULE_CODE_in_rule__ThenStep__DescAssignment_2_14109); 
             after(grammarAccess.getThenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenStep__DescAssignment_2_1"


    // $ANTLR start "rule__GivenStep__TagsAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2013:1: rule__GivenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__GivenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2017:1: ( ( RULE_TAG ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2018:1: ( RULE_TAG )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2018:1: ( RULE_TAG )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2019:1: RULE_TAG
            {
             before(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04140); 
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
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2028:1: rule__GivenStep__DescAssignment_1 : ( RULE_GIVEN_TEXT ) ;
    public final void rule__GivenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2032:1: ( ( RULE_GIVEN_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2033:1: ( RULE_GIVEN_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2033:1: ( RULE_GIVEN_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2034:1: RULE_GIVEN_TEXT
            {
             before(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14171); 
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


    // $ANTLR start "rule__GivenStep__DescAssignment_2_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2043:1: rule__GivenStep__DescAssignment_2_0 : ( RULE_TEXT ) ;
    public final void rule__GivenStep__DescAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2047:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2048:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2048:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2049:1: RULE_TEXT
            {
             before(grammarAccess.getGivenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__GivenStep__DescAssignment_2_04202); 
             after(grammarAccess.getGivenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenStep__DescAssignment_2_0"


    // $ANTLR start "rule__GivenStep__DescAssignment_2_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2058:1: rule__GivenStep__DescAssignment_2_1 : ( RULE_CODE ) ;
    public final void rule__GivenStep__DescAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2062:1: ( ( RULE_CODE ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2063:1: ( RULE_CODE )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2063:1: ( RULE_CODE )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2064:1: RULE_CODE
            {
             before(grammarAccess.getGivenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
            match(input,RULE_CODE,FOLLOW_RULE_CODE_in_rule__GivenStep__DescAssignment_2_14233); 
             after(grammarAccess.getGivenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenStep__DescAssignment_2_1"


    // $ANTLR start "rule__AndStep__DescAssignment_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2073:1: rule__AndStep__DescAssignment_0 : ( RULE_AND_TEXT ) ;
    public final void rule__AndStep__DescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2077:1: ( ( RULE_AND_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2078:1: ( RULE_AND_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2078:1: ( RULE_AND_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2079:1: RULE_AND_TEXT
            {
             before(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
            match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04264); 
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


    // $ANTLR start "rule__AndStep__DescAssignment_1_0"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2088:1: rule__AndStep__DescAssignment_1_0 : ( RULE_TEXT ) ;
    public final void rule__AndStep__DescAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2092:1: ( ( RULE_TEXT ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2093:1: ( RULE_TEXT )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2093:1: ( RULE_TEXT )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2094:1: RULE_TEXT
            {
             before(grammarAccess.getAndStepAccess().getDescTEXTTerminalRuleCall_1_0_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__AndStep__DescAssignment_1_04295); 
             after(grammarAccess.getAndStepAccess().getDescTEXTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndStep__DescAssignment_1_0"


    // $ANTLR start "rule__AndStep__DescAssignment_1_1"
    // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2103:1: rule__AndStep__DescAssignment_1_1 : ( RULE_CODE ) ;
    public final void rule__AndStep__DescAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2107:1: ( ( RULE_CODE ) )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2108:1: ( RULE_CODE )
            {
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2108:1: ( RULE_CODE )
            // ../de.sebastianbenz.xgherkin.ui/src-gen/de/sebastianbenz/xgherkin/ui/contentassist/antlr/internal/InternalGherkin.g:2109:1: RULE_CODE
            {
             before(grammarAccess.getAndStepAccess().getDescCODETerminalRuleCall_1_1_0()); 
            match(input,RULE_CODE,FOLLOW_RULE_CODE_in_rule__AndStep__DescAssignment_1_14326); 
             after(grammarAccess.getAndStepAccess().getDescCODETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndStep__DescAssignment_1_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA2_eotS =
        "\5\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\2\6\3\uffff";
    static final String DFA2_maxS =
        "\2\17\3\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\5\uffff\1\3\1\4\1\uffff\1\2",
            "\1\1\5\uffff\1\3\1\4\1\uffff\1\2",
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
            return "543:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );";
        }
    }
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\2\6\4\uffff";
    static final String DFA3_maxS =
        "\1\24\1\23\4\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\11\uffff\1\2\1\uffff\1\3\1\4\1\5",
            "\1\1\11\uffff\1\2\1\uffff\1\3\1\4",
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
            return "571:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );";
        }
    }
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\1\1\3\uffff";
    static final String DFA12_minS =
        "\1\6\1\uffff\1\6\1\uffff";
    static final String DFA12_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\5\uffff\2\1\1\uffff\1\1\1\3\1\uffff\3\3",
            "",
            "\1\2\5\uffff\2\1\1\uffff\1\1\1\3\1\uffff\2\3",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 894:1: ( rule__Scenario__StepsAssignment_2 )*";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\1\1\3\uffff";
    static final String DFA18_minS =
        "\1\6\1\uffff\1\6\1\uffff";
    static final String DFA18_maxS =
        "\1\24\1\uffff\1\23\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\5\uffff\2\1\1\uffff\1\1\1\3\1\uffff\3\3",
            "",
            "\1\2\5\uffff\2\1\1\uffff\1\1\1\3\1\uffff\2\3",
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
            return "()* loopback of 1239:1: ( rule__Background__StepsAssignment_2 )*";
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
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0_in_ruleBackground694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_entryRuleWhenStep781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenStep788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0_in_ruleWhenStep814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_entryRuleThenStep841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenStep848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0_in_ruleThenStep874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_entryRuleGivenStep901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGivenStep908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0_in_ruleGivenStep934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_entryRuleAndStep961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndStep968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0_in_ruleAndStep994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOrderTo_in_rule__NarrativeElement__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsA_in_rule__NarrativeElement__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIWantTo_in_rule__NarrativeElement__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeText_in_rule__NarrativeElement__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_rule__AbstractScenario__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__AbstractScenario__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioWithOutline_in_rule__AbstractScenario__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenStep_in_rule__Step__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenStep_in_rule__Step__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGivenStep_in_rule__Step__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndStep_in_rule__Step__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_2_0_in_rule__WhenStep__Alternatives_21262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_2_1_in_rule__WhenStep__Alternatives_21280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_2_0_in_rule__ThenStep__Alternatives_21313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_2_1_in_rule__ThenStep__Alternatives_21331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_2_0_in_rule__GivenStep__Alternatives_21364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_2_1_in_rule__GivenStep__Alternatives_21382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_1_0_in_rule__AndStep__Alternatives_11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_1_1_in_rule__AndStep__Alternatives_11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01464 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1494 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11525 = new BitSet(new long[]{0x000000000000BF40L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21585 = new BitSet(new long[]{0x000000000000BF40L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ElementsAssignment_2_in_rule__Feature__Group__2__Impl1615 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_3_in_rule__Feature__Group__3__Impl1673 = new BitSet(new long[]{0x000000000000B042L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01712 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl1742 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11773 = new BitSet(new long[]{0x00000000001D0040L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_2_in_rule__Scenario__Group__2__Impl1860 = new BitSet(new long[]{0x00000000001D0042L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__0__Impl_in_rule__ScenarioWithOutline__Group__01897 = new BitSet(new long[]{0x000000000000B040L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1_in_rule__ScenarioWithOutline__Group__01900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__TagsAssignment_0_in_rule__ScenarioWithOutline__Group__0__Impl1927 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__1__Impl_in_rule__ScenarioWithOutline__Group__11958 = new BitSet(new long[]{0x00000000001D0050L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2_in_rule__ScenarioWithOutline__Group__11961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__NameAssignment_1_in_rule__ScenarioWithOutline__Group__1__Impl1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__2__Impl_in_rule__ScenarioWithOutline__Group__22018 = new BitSet(new long[]{0x00000000001D0050L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3_in_rule__ScenarioWithOutline__Group__22021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__StepsAssignment_2_in_rule__ScenarioWithOutline__Group__2__Impl2048 = new BitSet(new long[]{0x00000000001D0042L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__3__Impl_in_rule__ScenarioWithOutline__Group__32079 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4_in_rule__ScenarioWithOutline__Group__32082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_HEADING_in_rule__ScenarioWithOutline__Group__3__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__4__Impl_in_rule__ScenarioWithOutline__Group__42138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__5_in_rule__ScenarioWithOutline__Group__42141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__HeadingAssignment_4_in_rule__ScenarioWithOutline__Group__4__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__Group__5__Impl_in_rule__ScenarioWithOutline__Group__52198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioWithOutline__RowsAssignment_5_in_rule__ScenarioWithOutline__Group__5__Impl2225 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__0__Impl_in_rule__ExampleRow__Group__02268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1_in_rule__ExampleRow__Group__02271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2300 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__ExampleRow__CellsAssignment_0_in_rule__ExampleRow__Group__0__Impl2312 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__ExampleRow__Group__1__Impl_in_rule__ExampleRow__Group__12345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_ROW_END_in_rule__ExampleRow__Group__1__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02405 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__TagsAssignment_0_in_rule__Background__Group__0__Impl2435 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12466 = new BitSet(new long[]{0x00000000001D0040L});
    public static final BitSet FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__NameAssignment_1_in_rule__Background__Group__1__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__StepsAssignment_2_in_rule__Background__Group__2__Impl2553 = new BitSet(new long[]{0x00000000001D0042L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__0__Impl_in_rule__WhenStep__Group__02590 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1_in_rule__WhenStep__Group__02593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__TagsAssignment_0_in_rule__WhenStep__Group__0__Impl2620 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__1__Impl_in_rule__WhenStep__Group__12651 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2_in_rule__WhenStep__Group__12654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__DescAssignment_1_in_rule__WhenStep__Group__1__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Group__2__Impl_in_rule__WhenStep__Group__22711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenStep__Alternatives_2_in_rule__WhenStep__Group__2__Impl2738 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__0__Impl_in_rule__ThenStep__Group__02775 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1_in_rule__ThenStep__Group__02778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__TagsAssignment_0_in_rule__ThenStep__Group__0__Impl2805 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__1__Impl_in_rule__ThenStep__Group__12836 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2_in_rule__ThenStep__Group__12839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__DescAssignment_1_in_rule__ThenStep__Group__1__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Group__2__Impl_in_rule__ThenStep__Group__22896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ThenStep__Alternatives_2_in_rule__ThenStep__Group__2__Impl2923 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__0__Impl_in_rule__GivenStep__Group__02960 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1_in_rule__GivenStep__Group__02963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__TagsAssignment_0_in_rule__GivenStep__Group__0__Impl2990 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__1__Impl_in_rule__GivenStep__Group__13021 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2_in_rule__GivenStep__Group__13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__DescAssignment_1_in_rule__GivenStep__Group__1__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Group__2__Impl_in_rule__GivenStep__Group__23081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GivenStep__Alternatives_2_in_rule__GivenStep__Group__2__Impl3108 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_rule__AndStep__Group__0__Impl_in_rule__AndStep__Group__03145 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1_in_rule__AndStep__Group__03148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__DescAssignment_0_in_rule__AndStep__Group__0__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Group__1__Impl_in_rule__AndStep__Group__13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndStep__Alternatives_1_in_rule__AndStep__Group__1__Impl3232 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Feature__TagsAssignment_03272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_rule__Feature__NameAssignment_13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrativeElement_in_rule__Feature__ElementsAssignment_23334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractScenario_in_rule__Feature__ScenariosAssignment_33365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__FreeText__NameAssignment3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AS_A_in_rule__AsA__NameAssignment3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_ORDER_TO_in_rule__InOrderTo__NameAssignment3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_WANT_TO_in_rule__IWantTo__NameAssignment3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Scenario__TagsAssignment_03520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_rule__Scenario__NameAssignment_13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_23582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ScenarioWithOutline__TagsAssignment_03613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_OUTLINE_TEXT_in_rule__ScenarioWithOutline__NameAssignment_13644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ScenarioWithOutline__StepsAssignment_23675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__HeadingAssignment_43706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExampleRow_in_rule__ScenarioWithOutline__RowsAssignment_53737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXAMPLE_CELL_in_rule__ExampleRow__CellsAssignment_03768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__Background__TagsAssignment_03799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BACKGROUND_TEXT_in_rule__Background__NameAssignment_13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Background__StepsAssignment_23861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__WhenStep__TagsAssignment_03892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_rule__WhenStep__DescAssignment_13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__WhenStep__DescAssignment_2_03954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_rule__WhenStep__DescAssignment_2_13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__ThenStep__TagsAssignment_04016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_rule__ThenStep__DescAssignment_14047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__ThenStep__DescAssignment_2_04078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_rule__ThenStep__DescAssignment_2_14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_in_rule__GivenStep__TagsAssignment_04140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_rule__GivenStep__DescAssignment_14171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__GivenStep__DescAssignment_2_04202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_rule__GivenStep__DescAssignment_2_14233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_rule__AndStep__DescAssignment_04264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__AndStep__DescAssignment_1_04295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_in_rule__AndStep__DescAssignment_1_14326 = new BitSet(new long[]{0x0000000000000002L});

}
