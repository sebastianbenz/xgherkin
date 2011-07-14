package de.sebastianbenz.xgherkin.tests.conversion;

import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.lang.String.valueOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.sebastianbenz.xgherkin.GherkinInjectorProvider;
import de.sebastianbenz.xgherkin.gherkin.ExampleCell;
import de.sebastianbenz.xgherkin.tests.util.Resources;

@RunWith(XtextRunner.class)
@InjectWith(GherkinInjectorProvider.class)
public class GherkingValueConverterTest {

	public static String EXAMPLE = 
			"Feature: Value Converters\n" +
			"Scenario Outline: My Scenario\n" +
			"Given examples\n" +
			"Examples:\n" +
			"| 0 | 1 | 2 |" +
			"| 3 |4  |	5|" +
			"|6|7|8|";
	private Resource resource;
	
	@Before
	public void parse() throws IOException{
		parse(EXAMPLE);
	}
	
	@Test
	public void shouldConvertExampleCellValues() throws IOException {
		List<ExampleCell> cells = allCells();
		for(int i = 0; i < 9; i++){
			assertThat(cells.get(i).getValue(), is(valueOf(i)));
		}
	}
	
	@Test
	public void shouldSerializeExampleCellValues() throws Exception {
		Resources.clearAdapters(resource);
		resource.save(Collections.emptyMap());
	}


	private List<ExampleCell> allCells() {
		return newArrayList(filter(resource.getAllContents(), ExampleCell.class));
	}


	private Iterator<EObject> parse(String example) throws IOException {
		URI uri = URI.createURI("dummy.feature");
		resource = new ResourceSetImpl().createResource(uri);
		resource.load(new StringInputStream(example), Collections.emptyMap());
		return resource.getAllContents();
	}

}
