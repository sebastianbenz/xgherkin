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

import static org.eclipse.jface.resource.JFaceResources.getDefaultFontDescriptor;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration {

	private static final int DEFAULT_FONT_SIZE = getDefaultFontDescriptor().getFontData()[0].getHeight();
	public static final String SCENARIO_ID = "Scenario";
	public static final String TAG_ID = "Tag";
	public static final String CODE_ID = "Code";
	public static final String FEATURE_ID = "Feature";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
		acceptor.acceptDefaultHighlighting(SCENARIO_ID, "Scenario",	scenarioTextStyle());
		acceptor.acceptDefaultHighlighting(FEATURE_ID, "Feature", featureTextStyle());
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tag", tagTextStyle());
		acceptor.acceptDefaultHighlighting(CODE_ID, "Code", codeTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
	}

	
	private TextStyle tagTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(grey());
		return textStyle;
	}
	
	protected RGB grey() {
		return new RGB(125, 125, 125);
	}
	
	public TextStyle codeTextStyle() {
		TextStyle result = super.defaultTextStyle().copy();
		result.setColor(new RGB(0, 64, 128));
		return result;
	}
	
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.BOLD));
		return textStyle;
	}

	public TextStyle scenarioTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 2, SWT.BOLD));
		return textStyle;
	}
	
	public TextStyle featureTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE + 3, SWT.BOLD));
		return textStyle;
	}

	protected FontData fontWithHeight(int height, int style) {
		return new FontData(JFaceResources.DIALOG_FONT, height, style);
	}

	@Override
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		textStyle.setFontData(fontWithHeight(DEFAULT_FONT_SIZE, SWT.NORMAL));  
		return textStyle;
	}
}
