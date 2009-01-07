package eu.sergiobelli.jworkcons.fe.view;

import eu.sergiobelli.jworkcons.be.orm.model.TipologieEvento;

public class TipologieEventoView {

	public TipologieEventoView() {
		super();
		setDescrizione("");
	}
	public TipologieEventoView(TipologieEvento tipologiaEvento) {
		setId(tipologiaEvento.getId());
		setDescrizione(tipologiaEvento.getDescrizione());
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
		buf.append("<TipologieEventoView>");
		buf.append("<id>").append(id).append("</id>");
		buf.append("<descrizione>").append(descrizione).append("</descrizione>");
		buf.append("</TipologieEventoView>");
		return buf.toString();
	}
}
