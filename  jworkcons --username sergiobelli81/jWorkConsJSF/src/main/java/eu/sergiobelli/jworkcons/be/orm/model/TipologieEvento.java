package eu.sergiobelli.jworkcons.be.orm.model;

/**
 * @author sergio
 */
public class TipologieEvento {

	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	private String descrizione;
	public String getDescrizione() {return descrizione;}
	public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("");
		buf.append("<TipologieEvento>");
		buf.append("<id>").append(id).append("</id>");
		buf.append("<descrizione>").append(descrizione).append("</descrizione>");
		buf.append("</TipologieEvento>");
		return buf.toString();
	}
}
