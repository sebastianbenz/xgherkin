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
)?(
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
	        newCompositeNode(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
	    }
		lv_elements_2_0=ruleNarrativeElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
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
	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
	    }
		lv_steps_3_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_3_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
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
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
	    }
		lv_elements_2_0=ruleNarrativeElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
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
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
	    }
		lv_steps_3_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_3_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_EXAMPLE_HEADING_4=RULE_EXAMPLE_HEADING
    { 
    newLeafNode(this_EXAMPLE_HEADING_4, grammarAccess.getScenarioWithOutlineAccess().getEXAMPLE_HEADINGTerminalRuleCall_4()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getHeadingExampleRowParserRuleCall_5_0()); 
	    }
		lv_heading_5_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
	        }
       		set(
       			$current, 
       			"heading",
        		lv_heading_5_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getRowsExampleRowParserRuleCall_6_0()); 
	    }
		lv_rows_6_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_6_0, 
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
		{ 
	        newCompositeNode(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
	    }
		lv_cells_0_0=ruleExampleCell		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExampleRowRule());
	        }
       		add(
       			$current, 
       			"cells",
        		lv_cells_0_0, 
        		"ExampleCell");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_EXAMPLE_ROW_END_1=RULE_EXAMPLE_ROW_END
    { 
    newLeafNode(this_EXAMPLE_ROW_END_1, grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
    }
)
;





// Entry rule entryRuleExampleCell
entryRuleExampleCell returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExampleCellRule()); }
	 iv_ruleExampleCell=ruleExampleCell 
	 { $current=$iv_ruleExampleCell.current; } 
	 EOF 
;

// Rule ExampleCell
ruleExampleCell returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_EXAMPLE_CELL
		{
			newLeafNode(lv_value_0_0, grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExampleCellRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EXAMPLE_CELL");
	    }

)
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
)(
(
		{ 
	        newCompositeNode(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
	    }
		lv_desc_2_0=ruleOptionalText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWhenStepRule());
	        }
       		add(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"OptionalText");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
	    }
		lv_rows_3_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWhenStepRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_3_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
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
)(
(
		{ 
	        newCompositeNode(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
	    }
		lv_desc_2_0=ruleOptionalText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getThenStepRule());
	        }
       		add(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"OptionalText");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
	    }
		lv_rows_3_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getThenStepRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_3_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
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
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
	    }
		lv_desc_2_0=ruleOptionalText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGivenStepRule());
	        }
       		add(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"OptionalText");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
	    }
		lv_rows_3_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGivenStepRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_3_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
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
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
	    }
		lv_desc_1_0=ruleOptionalText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndStepRule());
	        }
       		add(
       			$current, 
       			"desc",
        		lv_desc_1_0, 
        		"OptionalText");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 
	    }
		lv_rows_2_0=ruleExampleRow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndStepRule());
	        }
       		add(
       			$current, 
       			"rows",
        		lv_rows_2_0, 
        		"ExampleRow");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleOptionalText
entryRuleOptionalText returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionalTextRule()); } 
	 iv_ruleOptionalText=ruleOptionalText 
	 { $current=$iv_ruleOptionalText.current.getText(); }  
	 EOF 
;

// Rule OptionalText
ruleOptionalText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_TEXT_0=RULE_TEXT    {
		$current.merge(this_TEXT_0);
    }

    { 
    newLeafNode(this_TEXT_0, grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
    }

    |    this_CODE_1=RULE_CODE    {
		$current.merge(this_CODE_1);
    }

    { 
    newLeafNode(this_CODE_1, grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 
    }
)
    ;





RULE_EXAMPLE_HEADING : 'Examples' RULE_SPACES ':' RULE_SPACES '\r'? '\n';

fragment RULE_NNL : ~(('\r'|'\n'));

fragment RULE_NL : '\r'? '\n'?;

fragment RULE_SPACES : (' '|'\t')*;

RULE_FEATURE_TEXT : ('Narrative:'|'Feature:') RULE_NNL* RULE_NL;

RULE_IN_ORDER_TO : 'In order to' RULE_NNL* RULE_NL;

RULE_AS_A : 'As a' RULE_NNL* RULE_NL;

RULE_I_WANT_TO : 'I want to ' RULE_NNL* RULE_NL;

RULE_SCENARIO_TEXT : 'Scenario' RULE_SPACES ':' RULE_NNL* RULE_NL;

RULE_SCENARIO_OUTLINE_TEXT : 'Scenario' RULE_SPACES 'Outline' RULE_SPACES ':' RULE_NNL* RULE_NL;

RULE_BACKGROUND_TEXT : 'Background' RULE_SPACES ':' RULE_NNL* RULE_NL;

RULE_WHEN_TEXT : 'When ' RULE_NNL* RULE_NL;

RULE_THEN_TEXT : 'Then ' RULE_NNL* RULE_NL;

RULE_GIVEN_TEXT : 'Given ' RULE_NNL* RULE_NL;

RULE_AND_TEXT : 'And ' RULE_NNL* RULE_NL;

RULE_EXAMPLE_ROW_END : '|' RULE_SPACES RULE_NL;

RULE_EXAMPLE_CELL : '|' ~(('\r'|'\n'|'|'))+;

RULE_CODE : ('"""' ( options {greedy=false;} : . )*'"""'|'\'\'\'' ( options {greedy=false;} : . )*'\'\'\'');

RULE_TAG : '@' RULE_NNL+ RULE_NL;

RULE_SL_COMMENT : '#' RULE_NNL+ RULE_NL;

RULE_TEXT : ~(('|'|' '|'\t'|'\r'|'\n'|'@')) RULE_NNL* RULE_NL;

RULE_WS : (' '|'\t'|'\r'|'\n')+;


