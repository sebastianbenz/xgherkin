/*
* generated by Xtext
*/
grammar InternalGherkin;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.sebastianbenz.xgherkin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_name_1_0=RULE_FEATURE_TEXT
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"FEATURE_TEXT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
	    }
		lv_elements_2_0=ruleNarrativeElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_2_0, 
        		"NarrativeElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
	    }
		lv_scenarios_3_0=ruleAbstractScenario		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		add(
       			$current, 
       			"scenarios",
        		lv_scenarios_3_0, 
        		"AbstractScenario");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleNarrativeElement
entryRuleNarrativeElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNarrativeElementRule()); }
	 iv_ruleNarrativeElement=ruleNarrativeElement 
	 { $current=$iv_ruleNarrativeElement.current; } 
	 EOF 
;

// Rule NarrativeElement
ruleNarrativeElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
    }
    this_InOrderTo_0=ruleInOrderTo
    { 
        $current = $this_InOrderTo_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 
    }
    this_AsA_1=ruleAsA
    { 
        $current = $this_AsA_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 
    }
    this_IWantTo_2=ruleIWantTo
    { 
        $current = $this_IWantTo_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 
    }
    this_FreeText_3=ruleFreeText
    { 
        $current = $this_FreeText_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFreeText
entryRuleFreeText returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFreeTextRule()); }
	 iv_ruleFreeText=ruleFreeText 
	 { $current=$iv_ruleFreeText.current; } 
	 EOF 
;

// Rule FreeText
ruleFreeText returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_TEXT
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreeTextRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"TEXT");
	    }

)
)
;





// Entry rule entryRuleAsA
entryRuleAsA returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAsARule()); }
	 iv_ruleAsA=ruleAsA 
	 { $current=$iv_ruleAsA.current; } 
	 EOF 
;

// Rule AsA
ruleAsA returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_AS_A
		{
			newLeafNode(lv_name_0_0, grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAsARule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"AS_A");
	    }

)
)
;





// Entry rule entryRuleInOrderTo
entryRuleInOrderTo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInOrderToRule()); }
	 iv_ruleInOrderTo=ruleInOrderTo 
	 { $current=$iv_ruleInOrderTo.current; } 
	 EOF 
;

// Rule InOrderTo
ruleInOrderTo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_IN_ORDER_TO
		{
			newLeafNode(lv_name_0_0, grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInOrderToRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"IN_ORDER_TO");
	    }

)
)
;





// Entry rule entryRuleIWantTo
entryRuleIWantTo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIWantToRule()); }
	 iv_ruleIWantTo=ruleIWantTo 
	 { $current=$iv_ruleIWantTo.current; } 
	 EOF 
;

// Rule IWantTo
ruleIWantTo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_I_WANT_TO
		{
			newLeafNode(lv_name_0_0, grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIWantToRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"I_WANT_TO");
	    }

)
)
;





// Entry rule entryRuleAbstractScenario
entryRuleAbstractScenario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractScenarioRule()); }
	 iv_ruleAbstractScenario=ruleAbstractScenario 
	 { $current=$iv_ruleAbstractScenario.current; } 
	 EOF 
;

// Rule AbstractScenario
ruleAbstractScenario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
    }
    this_Background_0=ruleBackground
    { 
        $current = $this_Background_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
    }
    this_Scenario_1=ruleScenario
    { 
        $current = $this_Scenario_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 
    }
    this_ScenarioWithOutline_2=ruleScenarioWithOutline
    { 
        $current = $this_ScenarioWithOutline_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	 iv_ruleScenario=ruleScenario 
	 { $current=$iv_ruleScenario.current; } 
	 EOF 
;

// Rule Scenario
ruleScenario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getScenarioRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_name_1_0=RULE_SCENARIO_TEXT
		{
			newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getScenarioRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"SCENARIO_TEXT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_2_0()); 
	    }
		lv_steps_2_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_2_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleScenarioWithOutline
entryRuleScenarioWithOutline returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioWithOutlineRule()); }
	 iv_ruleScenarioWithOutline=ruleScenarioWithOutline 
	 { $current=$iv_ruleScenarioWithOutline.current; } 
	 EOF 
;

// Rule ScenarioWithOutline
ruleScenarioWithOutline returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getScenarioWithOutlineRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_name_1_0=RULE_SCENARIO_OUTLINE_TEXT
		{
			newLeafNode(lv_name_1_0, grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getScenarioWithOutlineRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"SCENARIO_OUTLINE_TEXT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_2_0()); 
	    }
		lv_steps_2_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_2_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*this_EXAMPLE_HEADING_3=RULE_EXAMPLE_HEADING
    { 
    newLeafNode(this_EXAMPLE_HEADING_3, grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_3()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_4_0()); 
	    }
		lv_heading_4_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
	        }
       		set(
       			$current, 
       			"heading",
        		lv_heading_4_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_5_0()); 
	    }
		lv_rows_5_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_5_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleExampleRow
entryRuleExampleRow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExampleRowRule()); }
	 iv_ruleExampleRow=ruleExampleRow 
	 { $current=$iv_ruleExampleRow.current; } 
	 EOF 
;

// Rule ExampleRow
ruleExampleRow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_cells_0_0=RULE_EXAMPLE_CELL
		{
			newLeafNode(lv_cells_0_0, grammarAccess.getExampleRowAccess().getCellsEXAMPLE_CELLTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExampleRowRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"cells",
        		lv_cells_0_0, 
        		"EXAMPLE_CELL");
	    }

)
)+this_EXAMPLE_ROW_END_1=RULE_EXAMPLE_ROW_END
    { 
    newLeafNode(this_EXAMPLE_ROW_END_1, grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
    }
)
;





// Entry rule entryRuleBackground
entryRuleBackground returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBackgroundRule()); }
	 iv_ruleBackground=ruleBackground 
	 { $current=$iv_ruleBackground.current; } 
	 EOF 
;

// Rule Background
ruleBackground returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBackgroundRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_name_1_0=RULE_BACKGROUND_TEXT
		{
			newLeafNode(lv_name_1_0, grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBackgroundRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"BACKGROUND_TEXT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
	    }
		lv_steps_2_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBackgroundRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_2_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	 iv_ruleStep=ruleStep 
	 { $current=$iv_ruleStep.current; } 
	 EOF 
;

// Rule Step
ruleStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
    }
    this_WhenStep_0=ruleWhenStep
    { 
        $current = $this_WhenStep_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
    }
    this_ThenStep_1=ruleThenStep
    { 
        $current = $this_ThenStep_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
    }
    this_GivenStep_2=ruleGivenStep
    { 
        $current = $this_GivenStep_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
    }
    this_AndStep_3=ruleAndStep
    { 
        $current = $this_AndStep_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleWhenStep
entryRuleWhenStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWhenStepRule()); }
	 iv_ruleWhenStep=ruleWhenStep 
	 { $current=$iv_ruleWhenStep.current; } 
	 EOF 
;

// Rule WhenStep
ruleWhenStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWhenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_desc_1_0=RULE_WHEN_TEXT
		{
			newLeafNode(lv_desc_1_0, grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWhenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_1_0, 
        		"WHEN_TEXT");
	    }

)
)((
(
		lv_desc_2_0=RULE_TEXT
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getWhenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWhenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"TEXT");
	    }

)
)
    |(
(
		lv_desc_3_0=RULE_CODE
		{
			newLeafNode(lv_desc_3_0, grammarAccess.getWhenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWhenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_3_0, 
        		"CODE");
	    }

)
))*)
;





// Entry rule entryRuleThenStep
entryRuleThenStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getThenStepRule()); }
	 iv_ruleThenStep=ruleThenStep 
	 { $current=$iv_ruleThenStep.current; } 
	 EOF 
;

// Rule ThenStep
ruleThenStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getThenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_desc_1_0=RULE_THEN_TEXT
		{
			newLeafNode(lv_desc_1_0, grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getThenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_1_0, 
        		"THEN_TEXT");
	    }

)
)((
(
		lv_desc_2_0=RULE_TEXT
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getThenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getThenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"TEXT");
	    }

)
)
    |(
(
		lv_desc_3_0=RULE_CODE
		{
			newLeafNode(lv_desc_3_0, grammarAccess.getThenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getThenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_3_0, 
        		"CODE");
	    }

)
))*)
;





// Entry rule entryRuleGivenStep
entryRuleGivenStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGivenStepRule()); }
	 iv_ruleGivenStep=ruleGivenStep 
	 { $current=$iv_ruleGivenStep.current; } 
	 EOF 
;

// Rule GivenStep
ruleGivenStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_tags_0_0=RULE_TAG
		{
			newLeafNode(lv_tags_0_0, grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGivenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"TAG");
	    }

)
)*(
(
		lv_desc_1_0=RULE_GIVEN_TEXT
		{
			newLeafNode(lv_desc_1_0, grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGivenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_1_0, 
        		"GIVEN_TEXT");
	    }

)
)((
(
		lv_desc_2_0=RULE_TEXT
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getGivenStepAccess().getDescTEXTTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGivenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"TEXT");
	    }

)
)
    |(
(
		lv_desc_3_0=RULE_CODE
		{
			newLeafNode(lv_desc_3_0, grammarAccess.getGivenStepAccess().getDescCODETerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGivenStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_3_0, 
        		"CODE");
	    }

)
))*)
;





// Entry rule entryRuleAndStep
entryRuleAndStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndStepRule()); }
	 iv_ruleAndStep=ruleAndStep 
	 { $current=$iv_ruleAndStep.current; } 
	 EOF 
;

// Rule AndStep
ruleAndStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_desc_0_0=RULE_AND_TEXT
		{
			newLeafNode(lv_desc_0_0, grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAndStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_0_0, 
        		"AND_TEXT");
	    }

)
)((
(
		lv_desc_1_0=RULE_TEXT
		{
			newLeafNode(lv_desc_1_0, grammarAccess.getAndStepAccess().getDescTEXTTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAndStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_1_0, 
        		"TEXT");
	    }

)
)
    |(
(
		lv_desc_2_0=RULE_CODE
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getAndStepAccess().getDescCODETerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAndStepRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"CODE");
	    }

)
))*)
;





RULE_EXAMPLE_HEADING : 'Examples:' '\r'? '\n';

RULE_FEATURE_TEXT : ('Narrative:'|'Feature:') ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_IN_ORDER_TO : 'In order to' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_AS_A : 'As a' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_I_WANT_TO : 'I want to ' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_SCENARIO_TEXT : 'Scenario' ' '* ':' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_SCENARIO_OUTLINE_TEXT : 'Scenario' ' '* 'Outline' ' '* ':' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_BACKGROUND_TEXT : 'Background:' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_WHEN_TEXT : 'When ' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_THEN_TEXT : 'Then ' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_GIVEN_TEXT : 'Given ' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_AND_TEXT : 'And ' ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_EXAMPLE_CELL : '|' ~(('\r'|'\n'|'|'))+;

RULE_EXAMPLE_ROW_END : '|' '\r'? '\n';

RULE_CODE : ('"""' ( options {greedy=false;} : . )*'"""'|'\'\'\'' ( options {greedy=false;} : . )*'\'\'\'');

RULE_TAG : '@' ~(('\r'|'\n'))+ '\r'? '\n'?;

RULE_SL_COMMENT : '#' ~(('\r'|'\n'))+ '\r'? '\n'?;

RULE_TEXT : ~(('|'|' '|'\t'|'\r'|'\n'|'@')) ~(('\r'|'\n'))* '\r'? '\n'?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;


