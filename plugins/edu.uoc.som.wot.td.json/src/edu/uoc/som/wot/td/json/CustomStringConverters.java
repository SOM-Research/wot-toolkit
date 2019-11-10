package edu.uoc.som.wot.td.json;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class CustomStringConverters extends DefaultTerminalConverters {

	@ValueConverter(rule = "AnyString")
	public IValueConverter<String> AnyString() {
		return new IValueConverter<String>() {

			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				return string != null ? string.replaceAll("^\"(.*)\"$", "$1") : null;
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value;
			}
		};
	}
}