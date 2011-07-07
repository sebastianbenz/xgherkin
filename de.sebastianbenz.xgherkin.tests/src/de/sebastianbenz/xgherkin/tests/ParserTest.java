package de.sebastianbenz.xgherkin.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.sebastianbenz.xgherkin.GherkinInjectorProvider;


@RunWith(XtextRunner.class)
@InjectWith(GherkinInjectorProvider.class)
public class ParserTest {

	@Test
	public void shouldParseSampleWithoutErrors() {
		Resource resource = load("Example.feature");
		assertTrue(resource.getErrors().isEmpty());
	}

	private Resource load(String name) {
		URI uri = URI.createPlatformPluginURI("de.sebastianbenz.xgherkin.tests/res/" + name, true);
		return new ResourceSetImpl().getResource(uri, true);
	}

}
