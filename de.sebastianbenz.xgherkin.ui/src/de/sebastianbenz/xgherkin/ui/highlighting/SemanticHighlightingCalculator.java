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
package de.sebastianbenz.xgherkin.ui.highlighting;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.sebastianbenz.xgherkin.gherkin.ExampleRow;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
import de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline;
import de.sebastianbenz.xgherkin.gherkin.Step;
import de.sebastianbenz.xgherkin.gherkin.util.GherkinSwitch;

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	private static final Pattern PLACEHOLDER = Pattern.compile("<[^<\\r\\n]*>");

	private class Implementation extends GherkinSwitch<Boolean> {

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseScenarioWithOutline(ScenarioWithOutline object) {
			ExampleRow heading = object.getHeading();
			if (heading == null) {
				return Boolean.TRUE;
			}
			ICompositeNode node = NodeModelUtils.getNode(heading);

			acceptor.addPosition(node.getOffset(), node.getLength(),
					HighlightingConfiguration.CODE_BOLD_ID);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseStep(Step object) {
			String desc = object.getDesc().get(0);
			highlightFirstWord(object, desc);
			hightlightPlaceHolders(object, desc);
			return Boolean.TRUE;
		}

		private void hightlightPlaceHolders(Step object, String desc) {

			Matcher matcher = PLACEHOLDER.matcher(desc);
			while (matcher.find()) {
				int offset = matcher.start()
						+ offset(object);
				int length = matcher.end() - matcher.start();
				acceptor.addPosition(offset, length,
						HighlightingConfiguration.CODE_BOLD_ID);
			}

		}

		// @Override
		// public Boolean caseAsA(AsA object) {
		// highlight("As a", object);
		// return Boolean.TRUE;
		// }
		//
		// @Override
		// public Boolean caseInOrderTo(InOrderTo object) {
		// highlight("In order to", object);
		// return Boolean.TRUE;
		// }
		//
		// @Override
		// public Boolean caseIWantTo(IWantTo object) {
		// highlight("I want to", object);
		// return Boolean.TRUE;
		// }

		private void highlightFirstWord(Step object, String desc) {
			int begin = 0;
			for (; isWhiteSpace(desc, begin); begin++) {
			}
			int end = desc.indexOf(' ', begin);
			if (end > 0) {
				highlight(desc.substring(begin, end), object);
			}
		}

		private boolean isWhiteSpace(String desc, int begin) {
			return desc.charAt(begin) == ' ' || desc.charAt(begin) == '\t';
		}

		// @Override
		// public Boolean caseAndStep(AndStep object) {
		// highlight("And", object);
		// return Boolean.TRUE;
		// }
		//
		// @Override
		// public Boolean caseGivenStep(GivenStep object) {
		// highlight("Given", object);
		// return Boolean.TRUE;
		// }
		//
		// @Override
		// public Boolean caseThenStep(ThenStep object) {
		// highlight("Then", object);
		// return Boolean.TRUE;
		// }
		//
		// @Override
		// public Boolean caseWhenStep(WhenStep object) {
		// highlight("When", object);
		// return Boolean.TRUE;
		// }
		//
		private void highlight(String string, Step object) {
			acceptor.addPosition(offset(object), string.length(),
					HighlightingConfiguration.KEYWORD_ID);
		}

		private int offset(Step content) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content, GherkinPackage.Literals.STEP__DESC);
			return nodes.iterator().next().getOffset();
		}
	}

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (noNodeModel(resource)) {
			return;
		}

		Implementation highlighter = new Implementation(acceptor);
		Iterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			highlighter.doSwitch((EObject) contents.next());
		}
	}

	protected EObject root(XtextResource resource) {
		return resource.getParseResult().getRootASTElement();
	}

	protected boolean noNodeModel(XtextResource resource) {
		return resource == null || resource.getParseResult() == null
				|| root(resource) == null;
	}

}
