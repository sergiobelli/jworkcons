package eu.sergiobelli.jworkcons.fe.converters;

import java.util.TimeZone;

public class DateTimeConverter extends javax.faces.convert.DateTimeConverter {
	public static final String CONVERTER_ID = "eu.sergiobelli.jworkcons.fe.converters.DateTimeConverter";
	public DateTimeConverter() {
		setTimeZone(TimeZone.getDefault());
		setPattern("dd/MM/yyyy");
	}
}
