/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.xgherkin.ui.autoedit;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategy;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.autoedit.ShortCutEditStrategy;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class AutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {

	protected static class LineBreakInserter extends AbstractEditStrategy {

		private final IAutoEditStrategy defaultStrategy;

		protected LineBreakInserter(IAutoEditStrategy defaultStrategy) {
			this.defaultStrategy = defaultStrategy;
		}

		@Override
		protected void internalCustomizeDocumentCommand(IDocument document,
				DocumentCommand command) throws BadLocationException {
			if (!isLineBreak(document, command)) {
				return;
			}
			String line = currentLine(document, command);
			if (isEmpty(line)) {
				return;
			}

			defaultStrategy.customizeDocumentCommand(document, command);
			if (requiresIndent(line)) {
				command.text = command.text + "\n\t";
			} 
		}

		private boolean isEmpty(String line) {
			return line.length() == 0;
		}


		private boolean requiresIndent(String line) {
			return isScenario(line) || isExamples(line);
		}

		private boolean isExamples(String line) {
			return line.trim().endsWith(":");
		}

		private boolean isScenario(String line) {
			return line.contains("Scenario") && line.contains(":");
		}

		private String currentLine(IDocument document, DocumentCommand command)
				throws BadLocationException {
			IRegion region = document
					.getLineInformationOfOffset(command.offset);
			String line = document.get(region.getOffset(), region.getLength());
			return line;
		}

		private boolean isLineBreak(IDocument document, DocumentCommand command) {
			return command.text.equals(((IDocumentExtension4) document)
					.getDefaultLineDelimiter()) && command.length == 0;
		}
	}

	protected static class IntendationInserter extends AbstractEditStrategy {

		@Override
		protected void internalCustomizeDocumentCommand(IDocument document,
				DocumentCommand command) throws BadLocationException {
			if (!isIntend(document, command)) {
				return;
			}
			IRegion region = document.getLineInformationOfOffset(command.offset);
			String line = document.get(region.getOffset(), region.getLength());
			if(line.trim().length() == 0){
				return;
			}
			document.replace(region.getOffset(), 0, "\t");
			command.text = "";
		}

		private boolean isIntend(IDocument document, DocumentCommand command) {
			String text = command.text;
			return text.startsWith("\t");
		}

	}

	@Inject
	protected Provider<ShortCutEditStrategy> shortCut;

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.accept(new IntendationInserter(),
				IDocument.DEFAULT_CONTENT_TYPE);
	}

	@Override
	protected void configureCurlyBracesBlock(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureMultilineComments(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureIndentationEditStrategy(
			IEditStrategyAcceptor acceptor) {
		acceptor.accept(
				new LineBreakInserter(defaultIndentLineAutoEditStrategy.get()),
				IDocument.DEFAULT_CONTENT_TYPE);
	}

}
