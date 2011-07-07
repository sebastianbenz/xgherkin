/*
 * generated by Xtext
 */
package de.sebastianbenz.xgherkin.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback;

import de.sebastianbenz.xgherkin.ui.highlighting.HighlightingConfiguration;
import de.sebastianbenz.xgherkin.ui.highlighting.SemanticHighlightingCalculator;
import de.sebastianbenz.xgherkin.ui.highlighting.TokenHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GherkinUiModule extends de.sebastianbenz.xgherkin.ui.AbstractGherkinUiModule {
	public GherkinUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SemanticHighlightingCalculator.class;
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return HighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return TokenHighlightingConfiguration.class;
	}
	
	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return ValidatingEditorCallback.class;
	}
}
