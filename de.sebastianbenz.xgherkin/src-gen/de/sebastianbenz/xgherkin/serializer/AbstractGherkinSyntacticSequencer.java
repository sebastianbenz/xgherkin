package de.sebastianbenz.xgherkin.serializer;

import com.google.inject.Inject;
import de.sebastianbenz.xgherkin.services.GherkinGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractGherkinSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GherkinGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GherkinGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEXAMPLE_HEADINGRule())
			return getEXAMPLE_HEADINGToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXAMPLE_ROW_ENDRule())
			return getEXAMPLE_ROW_ENDToken(ruleCall, node);
		return "";
	}
	
	protected String getEXAMPLE_HEADINGToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Examples:\n";
	}
	protected String getEXAMPLE_ROW_ENDToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		acceptNodes(transition, fromNode, toNode);
	}

}
