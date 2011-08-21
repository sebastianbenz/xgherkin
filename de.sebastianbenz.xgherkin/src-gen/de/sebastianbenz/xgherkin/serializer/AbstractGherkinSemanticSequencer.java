package de.sebastianbenz.xgherkin.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.sebastianbenz.xgherkin.gherkin.AndStep;
import de.sebastianbenz.xgherkin.gherkin.AsA;
import de.sebastianbenz.xgherkin.gherkin.Background;
import de.sebastianbenz.xgherkin.gherkin.ExampleCell;
import de.sebastianbenz.xgherkin.gherkin.ExampleRow;
import de.sebastianbenz.xgherkin.gherkin.Feature;
import de.sebastianbenz.xgherkin.gherkin.FreeText;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
import de.sebastianbenz.xgherkin.gherkin.GivenStep;
import de.sebastianbenz.xgherkin.gherkin.IWantTo;
import de.sebastianbenz.xgherkin.gherkin.InOrderTo;
import de.sebastianbenz.xgherkin.gherkin.Scenario;
import de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline;
import de.sebastianbenz.xgherkin.gherkin.ThenStep;
import de.sebastianbenz.xgherkin.gherkin.WhenStep;
import de.sebastianbenz.xgherkin.services.GherkinGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractGherkinSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected GherkinGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GherkinPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GherkinPackage.AND_STEP:
				if(context == grammarAccess.getAndStepRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_AndStep(context, (AndStep) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.AS_A:
				if(context == grammarAccess.getAsARule() ||
				   context == grammarAccess.getNarrativeElementRule()) {
					sequence_AsA(context, (AsA) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.BACKGROUND:
				if(context == grammarAccess.getAbstractScenarioRule() ||
				   context == grammarAccess.getBackgroundRule()) {
					sequence_Background(context, (Background) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.EXAMPLE_CELL:
				if(context == grammarAccess.getExampleCellRule()) {
					sequence_ExampleCell(context, (ExampleCell) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.EXAMPLE_ROW:
				if(context == grammarAccess.getExampleRowRule()) {
					sequence_ExampleRow(context, (ExampleRow) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.FREE_TEXT:
				if(context == grammarAccess.getFreeTextRule() ||
				   context == grammarAccess.getNarrativeElementRule()) {
					sequence_FreeText(context, (FreeText) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.GIVEN_STEP:
				if(context == grammarAccess.getGivenStepRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_GivenStep(context, (GivenStep) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.IWANT_TO:
				if(context == grammarAccess.getIWantToRule() ||
				   context == grammarAccess.getNarrativeElementRule()) {
					sequence_IWantTo(context, (IWantTo) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.IN_ORDER_TO:
				if(context == grammarAccess.getInOrderToRule() ||
				   context == grammarAccess.getNarrativeElementRule()) {
					sequence_InOrderTo(context, (InOrderTo) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.SCENARIO:
				if(context == grammarAccess.getAbstractScenarioRule() ||
				   context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.SCENARIO_WITH_OUTLINE:
				if(context == grammarAccess.getAbstractScenarioRule() ||
				   context == grammarAccess.getScenarioWithOutlineRule()) {
					sequence_ScenarioWithOutline(context, (ScenarioWithOutline) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.THEN_STEP:
				if(context == grammarAccess.getStepRule() ||
				   context == grammarAccess.getThenStepRule()) {
					sequence_ThenStep(context, (ThenStep) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.WHEN_STEP:
				if(context == grammarAccess.getStepRule() ||
				   context == grammarAccess.getWhenStepRule()) {
					sequence_WhenStep(context, (WhenStep) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (desc+=AND_TEXT desc+=OptionalText*)
	 *
	 * Features:
	 *    desc[1, *]
	 */
	protected void sequence_AndStep(EObject context, AndStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=AS_A
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_AsA(EObject context, AsA semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=TAG* name=BACKGROUND_TEXT steps+=Step*)
	 *
	 * Features:
	 *    tags[0, *]
	 *    name[1, 1]
	 *    steps[0, *]
	 */
	protected void sequence_Background(EObject context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EXAMPLE_CELL
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_ExampleCell(EObject context, ExampleCell semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.EXAMPLE_CELL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.EXAMPLE_CELL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     cells+=ExampleCell+
	 *
	 * Features:
	 *    cells[1, *]
	 */
	protected void sequence_ExampleRow(EObject context, ExampleRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=TAG* name=FEATURE_TEXT? elements+=NarrativeElement* scenarios+=AbstractScenario*)
	 *
	 * Features:
	 *    tags[0, *]
	 *    name[0, 1]
	 *    elements[0, *]
	 *    scenarios[0, *]
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=TEXT
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_FreeText(EObject context, FreeText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=TAG* desc+=GIVEN_TEXT desc+=OptionalText*)
	 *
	 * Features:
	 *    desc[1, *]
	 *    tags[0, *]
	 */
	protected void sequence_GivenStep(EObject context, GivenStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=I_WANT_TO
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_IWantTo(EObject context, IWantTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=IN_ORDER_TO
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_InOrderTo(EObject context, InOrderTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.NARRATIVE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         tags+=TAG* 
	 *         name=SCENARIO_OUTLINE_TEXT 
	 *         elements+=NarrativeElement* 
	 *         steps+=Step+ 
	 *         heading=ExampleRow 
	 *         rows+=ExampleRow*
	 *     )
	 *
	 * Features:
	 *    tags[0, *]
	 *    name[1, 1]
	 *    steps[1, *]
	 *    elements[0, *]
	 *    heading[1, 1]
	 *    rows[0, *]
	 */
	protected void sequence_ScenarioWithOutline(EObject context, ScenarioWithOutline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=TAG* name=SCENARIO_TEXT elements+=NarrativeElement* steps+=Step+)
	 *
	 * Features:
	 *    tags[0, *]
	 *    name[1, 1]
	 *    steps[1, *]
	 *    elements[0, *]
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=TAG* desc+=THEN_TEXT desc+=OptionalText*)
	 *
	 * Features:
	 *    desc[1, *]
	 *    tags[0, *]
	 */
	protected void sequence_ThenStep(EObject context, ThenStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tags+=TAG* desc+=WHEN_TEXT desc+=OptionalText*)
	 *
	 * Features:
	 *    desc[1, *]
	 *    tags[0, *]
	 */
	protected void sequence_WhenStep(EObject context, WhenStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
