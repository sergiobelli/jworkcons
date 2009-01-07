package eu.sergiobelli.jworkcons.fe.view;

import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;


public class TipologieLavoroView {

	public TipologieLavoroView() {
		super();
		setDescrizione("");
	}
	public TipologieLavoroView(TipologieLavoro tipologiaLavoro) {
		setId(tipologiaLavoro.getId());
		setDescrizione(tipologiaLavoro.getDescrizione());
	}
	
	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	private String descrizione;
	public String getDescrizione() {return descrizione;}
	public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("");
		buf.append("<TipologieLavoroView>");
		buf.append("<id>").append(id).append("</id>");
		buf.append("<descrizione>").append(descrizione).append("</descrizione>");
		buf.append("</TipologieLavoroView>");
		return buf.toString();
	}
}
