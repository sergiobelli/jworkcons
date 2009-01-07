package eu.sergiobelli.jworkcons.be.orm.model;

import java.util.Date;

public class Orari {

	public static final String ID = "id";
	
	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	private Date data;
	public Date getData() {return data;}
	public void setData(Date data) {this.data = data;}
	
	private String ora;
	public String getOra() {return ora;}
	public void setOra(String ora) {this.ora = ora;}
	
	private String minuto;
	public String getMinuto() {return minuto;}
	public void setMinuto(String minuto) {this.minuto = minuto;}
	
	private TipologieEvento evento;
	public TipologieEvento getEvento() {return evento;}
	public void setEvento(TipologieEvento evento) {this.evento = evento;}
	
	private TipologieLavoro tipologia;
	public TipologieLavoro getTipologia() {return tipologia;}
	public void setTipologia(TipologieLavoro tipologia) {this.tipologia = tipologia;}
	
	private String note;
	public String getNote() {return note;}
	public void setNote(String note) {this.note = note;}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("");
		buf.append("<Orari>").append("\n");
		buf.append("  ").append("<id>").append(id).append("</id>").append("\n");
		buf.append("  ").append("<data>").append(data).append("</data>").append("\n");
		buf.append("  ").append("<ora>").append(ora).append("</ora>").append("\n");
		buf.append("  ").append("<minuto>").append(minuto).append("</minuto>").append("\n");
		buf.append("  ").append("<evento>").append(evento).append("</evento>").append("\n");
		buf.append("  ").append("<tipologia>").append(tipologia).append("</tipologia>").append("\n");
		buf.append("  ").append("<note>").append(note).append("</note>").append("\n");
		buf.append("</Orari>");
		return buf.toString();
	}
	
}
