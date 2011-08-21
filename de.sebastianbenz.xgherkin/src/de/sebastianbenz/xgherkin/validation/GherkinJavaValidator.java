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
package de.sebastianbenz.xgherkin.validation;

import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Check;

import de.sebastianbenz.xgherkin.gherkin.Feature;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
 

public class GherkinJavaValidator extends AbstractGherkinJavaValidator {

	@Check
	public void checkFeatureHasAName(Feature feature) {
		if(Strings.isEmpty(feature.getName())){
			error("No feature specified", GherkinPackage.Literals.FEATURE__NAME);
		}
	}

}
