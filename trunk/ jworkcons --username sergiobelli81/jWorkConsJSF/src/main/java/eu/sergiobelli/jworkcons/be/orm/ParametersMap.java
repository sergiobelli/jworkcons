package eu.sergiobelli.jworkcons.be.orm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Classe di utilita' per la composizione della mappa di arogmenti da passare alle query ibatis
 * @author sbelli
 */
public class ParametersMap extends HashMap {

	private ArrayList<Argument> argumentsList = null;
	public ArrayList<Argument> getArgumentsList() {
		return argumentsList;
	}
	
	public ParametersMap() {
		argumentsList = new ArrayList<Argument>();
		this.put("argList", argumentsList);
	}
	
	public ParametersMap(String name, String value) {
		this();
		this.putArgument(name, value);
	}

	public ParametersMap(String name, Object value) {
		this();
		this.putArgument(name, value);
	}
	
	public void putArgument(final String name, final String value) {
		if (Assert.isNotEmpty(value)) {
			argumentsList.add(new Argument(name,value));
		}
	}
	
	public void putArgument(final String name, final String operand, final String value) {
		if (Assert.isNotEmpty(value)) {
			argumentsList.add(new Argument(name,operand,value));
		}
	}
	
	public void putArgument(final String name, final Object value) {
		if (Assert.isNotNull(value)) {
			argumentsList.add(new Argument(name,value));
		}
	}
	
	public void putArgument(final String name, final String operand, final Object value) {
		if (Assert.isNotNull(value)) {
			argumentsList.add(new Argument(name,operand,value));
		}
	}
	
	public void putArgument(final Argument argument) {
		argumentsList.add(argument);
	}
	public void putArguments(final ArrayList<Argument> arguments) {
		argumentsList.addAll(arguments);
	}
	public void clearArguments() {
		argumentsList.clear();
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("<ParametersMapForIbatis>");
		for (Argument argument : argumentsList) {buf.append(argument.toString());}
		buf.append("</ParametersMapForIbatis>");
		return buf.toString();
	}
	
}
