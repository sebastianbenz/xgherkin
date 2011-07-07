package de.sebastianbenz.xgherkin.ui.editor;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;

public class SourceViewerConfiguration extends
		XtextSourceViewerConfiguration {

	
	@Override
	public int getTabWidth(ISourceViewer sourceViewer) {
		return 2;
	}
	
	
}
