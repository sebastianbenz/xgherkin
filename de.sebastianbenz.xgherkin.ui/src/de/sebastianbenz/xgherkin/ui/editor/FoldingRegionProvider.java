package de.sebastianbenz.xgherkin.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;

import de.sebastianbenz.xgherkin.gherkin.ExampleRow;
import de.sebastianbenz.xgherkin.gherkin.NarrativeElement;
import de.sebastianbenz.xgherkin.gherkin.Step;

public class FoldingRegionProvider extends DefaultFoldingRegionProvider{

	@Override
	protected boolean isHandled(EObject eObject) {
		if (eObject instanceof Step) {
			Step step = (Step) eObject;
			return !step.eContents().isEmpty() || !(step.getDesc().size() <= 1);
		}else if (eObject instanceof ExampleRow) {
			return false;
		}else if (eObject instanceof NarrativeElement) {
			return false;
		}
		return super.isHandled(eObject);
	}
	
}
