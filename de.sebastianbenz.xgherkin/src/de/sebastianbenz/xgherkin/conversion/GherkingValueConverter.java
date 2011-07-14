package de.sebastianbenz.xgherkin.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;

public class GherkingValueConverter extends DefaultTerminalConverters {

	
	private IValueConverter<String> cellValueConverter = new AbstractValueConverter<String>() {

		@Override
		public String toValue(String string, INode node)
				throws ValueConverterException {
			return string.substring(1).trim();
		}

		@Override
		public String toString(String value) throws ValueConverterException {
			return "| " + value + " ";
		}
	};

	@ValueConverter(rule = "EXAMPLE_CELL")
	public IValueConverter<String> EXAMPLE_CELL() {
		return cellValueConverter;
	}
}
