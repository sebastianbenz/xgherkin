/*
 * generated by Xtext
 */
package de.sebastianbenz.xgherkin.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GherkinExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return de.sebastianbenz.xgherkin.ui.internal.GherkinActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return de.sebastianbenz.xgherkin.ui.internal.GherkinActivator.getInstance().getInjector("de.sebastianbenz.xgherkin.Gherkin");
	}
	
}
