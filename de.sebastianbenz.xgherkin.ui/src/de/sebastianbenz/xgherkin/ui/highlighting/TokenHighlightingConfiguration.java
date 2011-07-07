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
package de.sebastianbenz.xgherkin.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;

@Singleton
public class TokenHighlightingConfiguration extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_SCENARIO_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.SCENARIO_ID;
		} else if ("RULE_BACKGROUND_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.SCENARIO_ID;
		} else if ("RULE_SCENARIO_OUTLINE_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.SCENARIO_ID;
		} else if ("RULE_FEATURE_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.FEATURE_ID;
		} else if ("RULE_TAG".equals(tokenName)) {
			return HighlightingConfiguration.TAG_ID;
		} else if ("RULE_CODE".equals(tokenName)) {
			return HighlightingConfiguration.CODE_ID;
		} else if ("RULE_EXAMPLE_CELL".equals(tokenName)) {
			return HighlightingConfiguration.CODE_ID;
		}else if ("RULE_EXAMPLE_ROW_END".equals(tokenName)) {
			return HighlightingConfiguration.CODE_ID;
		}else if ("RULE_EXAMPLE_HEADING".equals(tokenName)) {
			return HighlightingConfiguration.KEYWORD_ID;
		}
		
		return super.calculateId(tokenName, tokenType);
	}

}
