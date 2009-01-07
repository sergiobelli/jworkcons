package eu.sergiobelli.jworkcons.be.orm;


/**
 * Classe utilizzata da iBATIS per la creazione di query dinamiche
 */
public class Argument {
	
	public Argument() {}
	public Argument(String name, Object value){
		setName(name);
		setValue(value);
	}
	public Argument(String name, String operand, Object value){
		setName(name);
		setOperand(operand);
		setValue(value);
	}
	
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	private Object value;
	public Object getValue() {return value;}
	public void setValue(Object value) {this.value = value;}

	public static final String OPERAND_EQUALS 		= "=";
	public static final String OPERAND_NOT_EQUALS 	= "<>";
	private String operand = OPERAND_EQUALS;
	public String getOperand() {return operand;}
	public void setOperand(String operand) {this.operand = operand;}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("<ArgumentForIbatis>");
			buf.append("<name>")	.append(getName())		.append("</name>");
			buf.append("<operand>")	.append(getOperand())	.append("</operand>");
			buf.append("<value>")	.append(getValue())		.append("</value>");
		buf.append("</ArgumentForIbatis>");
		return buf.toString();
	}
	
}
