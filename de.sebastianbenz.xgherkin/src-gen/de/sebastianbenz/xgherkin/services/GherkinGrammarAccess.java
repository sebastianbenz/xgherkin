/*
* generated by Xtext
*/

package de.sebastianbenz.xgherkin.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class GherkinGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFEATURE_TEXTTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsNarrativeElementParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Assignment cScenariosAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cScenariosAbstractScenarioParserRuleCall_3_0 = (RuleCall)cScenariosAssignment_3.eContents().get(0);
		
		//Feature:
		//	tags+=TAG* name=FEATURE_TEXT elements+=NarrativeElement* scenarios+=AbstractScenario*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* name=FEATURE_TEXT elements+=NarrativeElement* scenarios+=AbstractScenario*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//name=FEATURE_TEXT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FEATURE_TEXT
		public RuleCall getNameFEATURE_TEXTTerminalRuleCall_1_0() { return cNameFEATURE_TEXTTerminalRuleCall_1_0; }

		//elements+=NarrativeElement*
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }

		//NarrativeElement
		public RuleCall getElementsNarrativeElementParserRuleCall_2_0() { return cElementsNarrativeElementParserRuleCall_2_0; }

		//scenarios+=AbstractScenario*
		public Assignment getScenariosAssignment_3() { return cScenariosAssignment_3; }

		//AbstractScenario
		public RuleCall getScenariosAbstractScenarioParserRuleCall_3_0() { return cScenariosAbstractScenarioParserRuleCall_3_0; }
	}

	public class NarrativeElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NarrativeElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInOrderToParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAsAParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIWantToParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFreeTextParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//NarrativeElement:
		//	InOrderTo | AsA | IWantTo | FreeText;
		public ParserRule getRule() { return rule; }

		//InOrderTo | AsA | IWantTo | FreeText
		public Alternatives getAlternatives() { return cAlternatives; }

		//InOrderTo
		public RuleCall getInOrderToParserRuleCall_0() { return cInOrderToParserRuleCall_0; }

		//AsA
		public RuleCall getAsAParserRuleCall_1() { return cAsAParserRuleCall_1; }

		//IWantTo
		public RuleCall getIWantToParserRuleCall_2() { return cIWantToParserRuleCall_2; }

		//FreeText
		public RuleCall getFreeTextParserRuleCall_3() { return cFreeTextParserRuleCall_3; }
	}

	public class FreeTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FreeText");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameTEXTTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//FreeText:
		//	name=TEXT;
		public ParserRule getRule() { return rule; }

		//name=TEXT
		public Assignment getNameAssignment() { return cNameAssignment; }

		//TEXT
		public RuleCall getNameTEXTTerminalRuleCall_0() { return cNameTEXTTerminalRuleCall_0; }
	}

	public class AsAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AsA");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameAS_ATerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//AsA:
		//	name=AS_A;
		public ParserRule getRule() { return rule; }

		//name=AS_A
		public Assignment getNameAssignment() { return cNameAssignment; }

		//AS_A
		public RuleCall getNameAS_ATerminalRuleCall_0() { return cNameAS_ATerminalRuleCall_0; }
	}

	public class InOrderToElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InOrderTo");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIN_ORDER_TOTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//InOrderTo:
		//	name=IN_ORDER_TO;
		public ParserRule getRule() { return rule; }

		//name=IN_ORDER_TO
		public Assignment getNameAssignment() { return cNameAssignment; }

		//IN_ORDER_TO
		public RuleCall getNameIN_ORDER_TOTerminalRuleCall_0() { return cNameIN_ORDER_TOTerminalRuleCall_0; }
	}

	public class IWantToElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IWantTo");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameI_WANT_TOTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//IWantTo:
		//	name=I_WANT_TO;
		public ParserRule getRule() { return rule; }

		//name=I_WANT_TO
		public Assignment getNameAssignment() { return cNameAssignment; }

		//I_WANT_TO
		public RuleCall getNameI_WANT_TOTerminalRuleCall_0() { return cNameI_WANT_TOTerminalRuleCall_0; }
	}

	public class AbstractScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractScenario");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBackgroundParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cScenarioParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cScenarioWithOutlineParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractScenario:
		//	Background | Scenario | ScenarioWithOutline;
		public ParserRule getRule() { return rule; }

		//Background | Scenario | ScenarioWithOutline
		public Alternatives getAlternatives() { return cAlternatives; }

		//Background
		public RuleCall getBackgroundParserRuleCall_0() { return cBackgroundParserRuleCall_0; }

		//Scenario
		public RuleCall getScenarioParserRuleCall_1() { return cScenarioParserRuleCall_1; }

		//ScenarioWithOutline
		public RuleCall getScenarioWithOutlineParserRuleCall_2() { return cScenarioWithOutlineParserRuleCall_2; }
	}

	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSCENARIO_TEXTTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStepsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStepsStepParserRuleCall_2_0 = (RuleCall)cStepsAssignment_2.eContents().get(0);
		
		//Scenario:
		//	tags+=TAG* name=SCENARIO_TEXT steps+=Step*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* name=SCENARIO_TEXT steps+=Step*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//name=SCENARIO_TEXT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//SCENARIO_TEXT
		public RuleCall getNameSCENARIO_TEXTTerminalRuleCall_1_0() { return cNameSCENARIO_TEXTTerminalRuleCall_1_0; }

		//steps+=Step*
		public Assignment getStepsAssignment_2() { return cStepsAssignment_2; }

		//Step
		public RuleCall getStepsStepParserRuleCall_2_0() { return cStepsStepParserRuleCall_2_0; }
	}

	public class ScenarioWithOutlineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ScenarioWithOutline");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStepsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStepsStepParserRuleCall_2_0 = (RuleCall)cStepsAssignment_2.eContents().get(0);
		private final RuleCall cEXAMPLE_HEADINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cHeadingAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHeadingExampleRowParserRuleCall_4_0 = (RuleCall)cHeadingAssignment_4.eContents().get(0);
		private final Assignment cRowsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRowsExampleRowParserRuleCall_5_0 = (RuleCall)cRowsAssignment_5.eContents().get(0);
		
		//ScenarioWithOutline:
		//	tags+=TAG* name=SCENARIO_OUTLINE_TEXT steps+=Step* EXAMPLE_HEADING heading=ExampleRow rows+=ExampleRow*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* name=SCENARIO_OUTLINE_TEXT steps+=Step* EXAMPLE_HEADING heading=ExampleRow rows+=ExampleRow*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//name=SCENARIO_OUTLINE_TEXT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//SCENARIO_OUTLINE_TEXT
		public RuleCall getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0() { return cNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0; }

		//steps+=Step*
		public Assignment getStepsAssignment_2() { return cStepsAssignment_2; }

		//Step
		public RuleCall getStepsStepParserRuleCall_2_0() { return cStepsStepParserRuleCall_2_0; }

		//EXAMPLE_HEADING
		public RuleCall getEXAMPLE_HEADINGTerminalRuleCall_3() { return cEXAMPLE_HEADINGTerminalRuleCall_3; }

		//heading=ExampleRow
		public Assignment getHeadingAssignment_4() { return cHeadingAssignment_4; }

		//ExampleRow
		public RuleCall getHeadingExampleRowParserRuleCall_4_0() { return cHeadingExampleRowParserRuleCall_4_0; }

		//rows+=ExampleRow*
		public Assignment getRowsAssignment_5() { return cRowsAssignment_5; }

		//ExampleRow
		public RuleCall getRowsExampleRowParserRuleCall_5_0() { return cRowsExampleRowParserRuleCall_5_0; }
	}

	public class ExampleRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExampleRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCellsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCellsEXAMPLE_CELLTerminalRuleCall_0_0 = (RuleCall)cCellsAssignment_0.eContents().get(0);
		private final RuleCall cEXAMPLE_ROW_ENDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//ExampleRow:
		//	cells+=EXAMPLE_CELL+ EXAMPLE_ROW_END;
		public ParserRule getRule() { return rule; }

		//cells+=EXAMPLE_CELL+ EXAMPLE_ROW_END
		public Group getGroup() { return cGroup; }

		//cells+=EXAMPLE_CELL+
		public Assignment getCellsAssignment_0() { return cCellsAssignment_0; }

		//EXAMPLE_CELL
		public RuleCall getCellsEXAMPLE_CELLTerminalRuleCall_0_0() { return cCellsEXAMPLE_CELLTerminalRuleCall_0_0; }

		//EXAMPLE_ROW_END
		public RuleCall getEXAMPLE_ROW_ENDTerminalRuleCall_1() { return cEXAMPLE_ROW_ENDTerminalRuleCall_1; }
	}

	public class BackgroundElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Background");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameBACKGROUND_TEXTTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStepsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStepsStepParserRuleCall_2_0 = (RuleCall)cStepsAssignment_2.eContents().get(0);
		
		//Background:
		//	tags+=TAG* name=BACKGROUND_TEXT steps+=Step*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* name=BACKGROUND_TEXT steps+=Step*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//name=BACKGROUND_TEXT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//BACKGROUND_TEXT
		public RuleCall getNameBACKGROUND_TEXTTerminalRuleCall_1_0() { return cNameBACKGROUND_TEXTTerminalRuleCall_1_0; }

		//steps+=Step*
		public Assignment getStepsAssignment_2() { return cStepsAssignment_2; }

		//Step
		public RuleCall getStepsStepParserRuleCall_2_0() { return cStepsStepParserRuleCall_2_0; }
	}

	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Step");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWhenStepParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cThenStepParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGivenStepParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAndStepParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Step:
		//	WhenStep | ThenStep | GivenStep | AndStep;
		public ParserRule getRule() { return rule; }

		//WhenStep | ThenStep | GivenStep | AndStep
		public Alternatives getAlternatives() { return cAlternatives; }

		//WhenStep
		public RuleCall getWhenStepParserRuleCall_0() { return cWhenStepParserRuleCall_0; }

		//ThenStep
		public RuleCall getThenStepParserRuleCall_1() { return cThenStepParserRuleCall_1; }

		//GivenStep
		public RuleCall getGivenStepParserRuleCall_2() { return cGivenStepParserRuleCall_2; }

		//AndStep
		public RuleCall getAndStepParserRuleCall_3() { return cAndStepParserRuleCall_3; }
	}

	public class WhenStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WhenStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cDescAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescWHEN_TEXTTerminalRuleCall_1_0 = (RuleCall)cDescAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDescAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDescTEXTTerminalRuleCall_2_0_0 = (RuleCall)cDescAssignment_2_0.eContents().get(0);
		private final Assignment cDescAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cDescCODETerminalRuleCall_2_1_0 = (RuleCall)cDescAssignment_2_1.eContents().get(0);
		
		//WhenStep:
		//	tags+=TAG* desc+=WHEN_TEXT (desc+=TEXT | desc+=CODE)*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* desc+=WHEN_TEXT (desc+=TEXT | desc+=CODE)*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//desc+=WHEN_TEXT
		public Assignment getDescAssignment_1() { return cDescAssignment_1; }

		//WHEN_TEXT
		public RuleCall getDescWHEN_TEXTTerminalRuleCall_1_0() { return cDescWHEN_TEXTTerminalRuleCall_1_0; }

		//(desc+=TEXT | desc+=CODE)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//desc+=TEXT
		public Assignment getDescAssignment_2_0() { return cDescAssignment_2_0; }

		//TEXT
		public RuleCall getDescTEXTTerminalRuleCall_2_0_0() { return cDescTEXTTerminalRuleCall_2_0_0; }

		//desc+=CODE
		public Assignment getDescAssignment_2_1() { return cDescAssignment_2_1; }

		//CODE
		public RuleCall getDescCODETerminalRuleCall_2_1_0() { return cDescCODETerminalRuleCall_2_1_0; }
	}

	public class ThenStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ThenStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cDescAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescTHEN_TEXTTerminalRuleCall_1_0 = (RuleCall)cDescAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDescAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDescTEXTTerminalRuleCall_2_0_0 = (RuleCall)cDescAssignment_2_0.eContents().get(0);
		private final Assignment cDescAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cDescCODETerminalRuleCall_2_1_0 = (RuleCall)cDescAssignment_2_1.eContents().get(0);
		
		//ThenStep:
		//	tags+=TAG* desc+=THEN_TEXT (desc+=TEXT | desc+=CODE)*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* desc+=THEN_TEXT (desc+=TEXT | desc+=CODE)*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//desc+=THEN_TEXT
		public Assignment getDescAssignment_1() { return cDescAssignment_1; }

		//THEN_TEXT
		public RuleCall getDescTHEN_TEXTTerminalRuleCall_1_0() { return cDescTHEN_TEXTTerminalRuleCall_1_0; }

		//(desc+=TEXT | desc+=CODE)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//desc+=TEXT
		public Assignment getDescAssignment_2_0() { return cDescAssignment_2_0; }

		//TEXT
		public RuleCall getDescTEXTTerminalRuleCall_2_0_0() { return cDescTEXTTerminalRuleCall_2_0_0; }

		//desc+=CODE
		public Assignment getDescAssignment_2_1() { return cDescAssignment_2_1; }

		//CODE
		public RuleCall getDescCODETerminalRuleCall_2_1_0() { return cDescCODETerminalRuleCall_2_1_0; }
	}

	public class GivenStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GivenStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTAGTerminalRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final Assignment cDescAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescGIVEN_TEXTTerminalRuleCall_1_0 = (RuleCall)cDescAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDescAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDescTEXTTerminalRuleCall_2_0_0 = (RuleCall)cDescAssignment_2_0.eContents().get(0);
		private final Assignment cDescAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cDescCODETerminalRuleCall_2_1_0 = (RuleCall)cDescAssignment_2_1.eContents().get(0);
		
		//GivenStep:
		//	tags+=TAG* desc+=GIVEN_TEXT (desc+=TEXT | desc+=CODE)*;
		public ParserRule getRule() { return rule; }

		//tags+=TAG* desc+=GIVEN_TEXT (desc+=TEXT | desc+=CODE)*
		public Group getGroup() { return cGroup; }

		//tags+=TAG*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }

		//TAG
		public RuleCall getTagsTAGTerminalRuleCall_0_0() { return cTagsTAGTerminalRuleCall_0_0; }

		//desc+=GIVEN_TEXT
		public Assignment getDescAssignment_1() { return cDescAssignment_1; }

		//GIVEN_TEXT
		public RuleCall getDescGIVEN_TEXTTerminalRuleCall_1_0() { return cDescGIVEN_TEXTTerminalRuleCall_1_0; }

		//(desc+=TEXT | desc+=CODE)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//desc+=TEXT
		public Assignment getDescAssignment_2_0() { return cDescAssignment_2_0; }

		//TEXT
		public RuleCall getDescTEXTTerminalRuleCall_2_0_0() { return cDescTEXTTerminalRuleCall_2_0_0; }

		//desc+=CODE
		public Assignment getDescAssignment_2_1() { return cDescAssignment_2_1; }

		//CODE
		public RuleCall getDescCODETerminalRuleCall_2_1_0() { return cDescCODETerminalRuleCall_2_1_0; }
	}

	public class AndStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AndStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescAND_TEXTTerminalRuleCall_0_0 = (RuleCall)cDescAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cDescAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cDescTEXTTerminalRuleCall_1_0_0 = (RuleCall)cDescAssignment_1_0.eContents().get(0);
		private final Assignment cDescAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cDescCODETerminalRuleCall_1_1_0 = (RuleCall)cDescAssignment_1_1.eContents().get(0);
		
		//AndStep:
		//	desc+=AND_TEXT (desc+=TEXT | desc+=CODE)*;
		public ParserRule getRule() { return rule; }

		//desc+=AND_TEXT (desc+=TEXT | desc+=CODE)*
		public Group getGroup() { return cGroup; }

		//desc+=AND_TEXT
		public Assignment getDescAssignment_0() { return cDescAssignment_0; }

		//AND_TEXT
		public RuleCall getDescAND_TEXTTerminalRuleCall_0_0() { return cDescAND_TEXTTerminalRuleCall_0_0; }

		//(desc+=TEXT | desc+=CODE)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//desc+=TEXT
		public Assignment getDescAssignment_1_0() { return cDescAssignment_1_0; }

		//TEXT
		public RuleCall getDescTEXTTerminalRuleCall_1_0_0() { return cDescTEXTTerminalRuleCall_1_0_0; }

		//desc+=CODE
		public Assignment getDescAssignment_1_1() { return cDescAssignment_1_1; }

		//CODE
		public RuleCall getDescCODETerminalRuleCall_1_1_0() { return cDescCODETerminalRuleCall_1_1_0; }
	}
	
	
	private FeatureElements pFeature;
	private NarrativeElementElements pNarrativeElement;
	private FreeTextElements pFreeText;
	private AsAElements pAsA;
	private InOrderToElements pInOrderTo;
	private IWantToElements pIWantTo;
	private AbstractScenarioElements pAbstractScenario;
	private ScenarioElements pScenario;
	private ScenarioWithOutlineElements pScenarioWithOutline;
	private ExampleRowElements pExampleRow;
	private BackgroundElements pBackground;
	private StepElements pStep;
	private WhenStepElements pWhenStep;
	private ThenStepElements pThenStep;
	private GivenStepElements pGivenStep;
	private AndStepElements pAndStep;
	private TerminalRule tEXAMPLE_HEADING;
	private TerminalRule tFEATURE_TEXT;
	private TerminalRule tIN_ORDER_TO;
	private TerminalRule tAS_A;
	private TerminalRule tI_WANT_TO;
	private TerminalRule tSCENARIO_TEXT;
	private TerminalRule tSCENARIO_OUTLINE_TEXT;
	private TerminalRule tBACKGROUND_TEXT;
	private TerminalRule tWHEN_TEXT;
	private TerminalRule tTHEN_TEXT;
	private TerminalRule tGIVEN_TEXT;
	private TerminalRule tAND_TEXT;
	private TerminalRule tEXAMPLE_CELL;
	private TerminalRule tEXAMPLE_ROW_END;
	private TerminalRule tCODE;
	private TerminalRule tTAG;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tTEXT;
	private TerminalRule tWS;
	
	private final GrammarProvider grammarProvider;

	@Inject
	public GherkinGrammarAccess(GrammarProvider grammarProvider) {
		this.grammarProvider = grammarProvider;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	
	//Feature:
	//	tags+=TAG* name=FEATURE_TEXT elements+=NarrativeElement* scenarios+=AbstractScenario*;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//NarrativeElement:
	//	InOrderTo | AsA | IWantTo | FreeText;
	public NarrativeElementElements getNarrativeElementAccess() {
		return (pNarrativeElement != null) ? pNarrativeElement : (pNarrativeElement = new NarrativeElementElements());
	}
	
	public ParserRule getNarrativeElementRule() {
		return getNarrativeElementAccess().getRule();
	}

	//FreeText:
	//	name=TEXT;
	public FreeTextElements getFreeTextAccess() {
		return (pFreeText != null) ? pFreeText : (pFreeText = new FreeTextElements());
	}
	
	public ParserRule getFreeTextRule() {
		return getFreeTextAccess().getRule();
	}

	//AsA:
	//	name=AS_A;
	public AsAElements getAsAAccess() {
		return (pAsA != null) ? pAsA : (pAsA = new AsAElements());
	}
	
	public ParserRule getAsARule() {
		return getAsAAccess().getRule();
	}

	//InOrderTo:
	//	name=IN_ORDER_TO;
	public InOrderToElements getInOrderToAccess() {
		return (pInOrderTo != null) ? pInOrderTo : (pInOrderTo = new InOrderToElements());
	}
	
	public ParserRule getInOrderToRule() {
		return getInOrderToAccess().getRule();
	}

	//IWantTo:
	//	name=I_WANT_TO;
	public IWantToElements getIWantToAccess() {
		return (pIWantTo != null) ? pIWantTo : (pIWantTo = new IWantToElements());
	}
	
	public ParserRule getIWantToRule() {
		return getIWantToAccess().getRule();
	}

	//AbstractScenario:
	//	Background | Scenario | ScenarioWithOutline;
	public AbstractScenarioElements getAbstractScenarioAccess() {
		return (pAbstractScenario != null) ? pAbstractScenario : (pAbstractScenario = new AbstractScenarioElements());
	}
	
	public ParserRule getAbstractScenarioRule() {
		return getAbstractScenarioAccess().getRule();
	}

	//Scenario:
	//	tags+=TAG* name=SCENARIO_TEXT steps+=Step*;
	public ScenarioElements getScenarioAccess() {
		return (pScenario != null) ? pScenario : (pScenario = new ScenarioElements());
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}

	//ScenarioWithOutline:
	//	tags+=TAG* name=SCENARIO_OUTLINE_TEXT steps+=Step* EXAMPLE_HEADING heading=ExampleRow rows+=ExampleRow*;
	public ScenarioWithOutlineElements getScenarioWithOutlineAccess() {
		return (pScenarioWithOutline != null) ? pScenarioWithOutline : (pScenarioWithOutline = new ScenarioWithOutlineElements());
	}
	
	public ParserRule getScenarioWithOutlineRule() {
		return getScenarioWithOutlineAccess().getRule();
	}

	//ExampleRow:
	//	cells+=EXAMPLE_CELL+ EXAMPLE_ROW_END;
	public ExampleRowElements getExampleRowAccess() {
		return (pExampleRow != null) ? pExampleRow : (pExampleRow = new ExampleRowElements());
	}
	
	public ParserRule getExampleRowRule() {
		return getExampleRowAccess().getRule();
	}

	//Background:
	//	tags+=TAG* name=BACKGROUND_TEXT steps+=Step*;
	public BackgroundElements getBackgroundAccess() {
		return (pBackground != null) ? pBackground : (pBackground = new BackgroundElements());
	}
	
	public ParserRule getBackgroundRule() {
		return getBackgroundAccess().getRule();
	}

	//Step:
	//	WhenStep | ThenStep | GivenStep | AndStep;
	public StepElements getStepAccess() {
		return (pStep != null) ? pStep : (pStep = new StepElements());
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}

	//WhenStep:
	//	tags+=TAG* desc+=WHEN_TEXT (desc+=TEXT | desc+=CODE)*;
	public WhenStepElements getWhenStepAccess() {
		return (pWhenStep != null) ? pWhenStep : (pWhenStep = new WhenStepElements());
	}
	
	public ParserRule getWhenStepRule() {
		return getWhenStepAccess().getRule();
	}

	//ThenStep:
	//	tags+=TAG* desc+=THEN_TEXT (desc+=TEXT | desc+=CODE)*;
	public ThenStepElements getThenStepAccess() {
		return (pThenStep != null) ? pThenStep : (pThenStep = new ThenStepElements());
	}
	
	public ParserRule getThenStepRule() {
		return getThenStepAccess().getRule();
	}

	//GivenStep:
	//	tags+=TAG* desc+=GIVEN_TEXT (desc+=TEXT | desc+=CODE)*;
	public GivenStepElements getGivenStepAccess() {
		return (pGivenStep != null) ? pGivenStep : (pGivenStep = new GivenStepElements());
	}
	
	public ParserRule getGivenStepRule() {
		return getGivenStepAccess().getRule();
	}

	//AndStep:
	//	desc+=AND_TEXT (desc+=TEXT | desc+=CODE)*;
	public AndStepElements getAndStepAccess() {
		return (pAndStep != null) ? pAndStep : (pAndStep = new AndStepElements());
	}
	
	public ParserRule getAndStepRule() {
		return getAndStepAccess().getRule();
	}

	//terminal EXAMPLE_HEADING:
	//	"Examples:" "\r"? "\n";
	public TerminalRule getEXAMPLE_HEADINGRule() {
		return (tEXAMPLE_HEADING != null) ? tEXAMPLE_HEADING : (tEXAMPLE_HEADING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXAMPLE_HEADING"));
	} 

	//terminal FEATURE_TEXT:
	//	("Narrative:" | "Feature:") !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getFEATURE_TEXTRule() {
		return (tFEATURE_TEXT != null) ? tFEATURE_TEXT : (tFEATURE_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "FEATURE_TEXT"));
	} 

	//terminal IN_ORDER_TO:
	//	"In order to" !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getIN_ORDER_TORule() {
		return (tIN_ORDER_TO != null) ? tIN_ORDER_TO : (tIN_ORDER_TO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IN_ORDER_TO"));
	} 

	//terminal AS_A:
	//	"As a" !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getAS_ARule() {
		return (tAS_A != null) ? tAS_A : (tAS_A = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AS_A"));
	} 

	//terminal I_WANT_TO:
	//	"I want to " !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getI_WANT_TORule() {
		return (tI_WANT_TO != null) ? tI_WANT_TO : (tI_WANT_TO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "I_WANT_TO"));
	} 

	//terminal SCENARIO_TEXT:
	//	"Scenario" " "* ":" !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getSCENARIO_TEXTRule() {
		return (tSCENARIO_TEXT != null) ? tSCENARIO_TEXT : (tSCENARIO_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SCENARIO_TEXT"));
	} 

	//terminal SCENARIO_OUTLINE_TEXT:
	//	"Scenario" " "* "Outline" " "* ":" !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getSCENARIO_OUTLINE_TEXTRule() {
		return (tSCENARIO_OUTLINE_TEXT != null) ? tSCENARIO_OUTLINE_TEXT : (tSCENARIO_OUTLINE_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SCENARIO_OUTLINE_TEXT"));
	} 

	//terminal BACKGROUND_TEXT:
	//	"Background:" !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getBACKGROUND_TEXTRule() {
		return (tBACKGROUND_TEXT != null) ? tBACKGROUND_TEXT : (tBACKGROUND_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BACKGROUND_TEXT"));
	} 

	//terminal WHEN_TEXT:
	//	"When " !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getWHEN_TEXTRule() {
		return (tWHEN_TEXT != null) ? tWHEN_TEXT : (tWHEN_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WHEN_TEXT"));
	} 

	//terminal THEN_TEXT:
	//	"Then " !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getTHEN_TEXTRule() {
		return (tTHEN_TEXT != null) ? tTHEN_TEXT : (tTHEN_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "THEN_TEXT"));
	} 

	//terminal GIVEN_TEXT:
	//	"Given " !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getGIVEN_TEXTRule() {
		return (tGIVEN_TEXT != null) ? tGIVEN_TEXT : (tGIVEN_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "GIVEN_TEXT"));
	} 

	//terminal AND_TEXT:
	//	"And " !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getAND_TEXTRule() {
		return (tAND_TEXT != null) ? tAND_TEXT : (tAND_TEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "AND_TEXT"));
	} 

	//terminal EXAMPLE_CELL:
	//	"|" !("\r" | "\n" | "|")*;
	public TerminalRule getEXAMPLE_CELLRule() {
		return (tEXAMPLE_CELL != null) ? tEXAMPLE_CELL : (tEXAMPLE_CELL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXAMPLE_CELL"));
	} 

	//terminal EXAMPLE_ROW_END:
	//	"|" "\r"? "\n";
	public TerminalRule getEXAMPLE_ROW_ENDRule() {
		return (tEXAMPLE_ROW_END != null) ? tEXAMPLE_ROW_END : (tEXAMPLE_ROW_END = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EXAMPLE_ROW_END"));
	} 

	//terminal CODE:
	//	"\"\"\""->"\"\"\"" | "\'\'\'"->"\'\'\'";
	public TerminalRule getCODERule() {
		return (tCODE != null) ? tCODE : (tCODE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CODE"));
	} 

	//terminal TAG:
	//	"@" !("\r" | "\n")+ "\r"? "\n"?;
	public TerminalRule getTAGRule() {
		return (tTAG != null) ? tTAG : (tTAG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TAG"));
	} 

	//terminal SL_COMMENT:
	//	"#" !("\r" | "\n")+ "\r"? "\n"?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal TEXT:
	//	!("|" | " " | "\t" | "\r" | "\n" | "@") !("\r" | "\n")* "\r"? "\n"?;
	public TerminalRule getTEXTRule() {
		return (tTEXT != null) ? tTEXT : (tTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TEXT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 
}
