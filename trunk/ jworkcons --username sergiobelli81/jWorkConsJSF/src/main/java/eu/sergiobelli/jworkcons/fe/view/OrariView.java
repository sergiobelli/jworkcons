package eu.sergiobelli.jworkcons.fe.view;

import java.util.Date;

import eu.sergiobelli.jworkcons.be.orm.model.Orari;

public class OrariView {

	public OrariView() {
		super();
		setData(new Date());
		setEvento(new TipologieEventoView());
		setMinuto("");
		setNote("");
		setOra("");
		setTipologia(new TipologieLavoroView());
	}
	public OrariView(Orari orario) {
		setId(orario.getId());
		setData(orario.getData());
		setEvento(new TipologieEventoView(orario.getEvento()));
		setMinuto(orario.getMinuto());
		setNote(orario.getNote());
		setOra(orario.getOra());
		setTipologia(new TipologieLavoroView(orario.getTipologia()));
	}
	
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
	
	private TipologieEventoView evento;
	public TipologieEventoView getEvento() {return evento;}
	public void setEvento(TipologieEventoView evento) {this.evento = evento;}
	
	private TipologieLavoroView tipologia;
	public TipologieLavoroView getTipologia() {return tipologia;}
	public void setTipologia(TipologieLavoroView tipologia) {this.tipologia = tipologia;}
	
	private String note;
	public String getNote() {return note;}
	public void setNote(String note) {this.note = note;}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("");
		buf.append("<OrariView>").append("\n");
		buf.append("  ").append("<id>").append(id).append("</id>").append("\n");
		buf.append("  ").append("<data>").append(data).append("</data>").append("\n");
		buf.append("  ").append("<ora>").append(ora).append("</ora>").append("\n");
		buf.append("  ").append("<minuto>").append(minuto).append("</minuto>").append("\n");
		buf.append("  ").append("<evento>").append(evento).append("</evento>").append("\n");
		buf.append("  ").append("<tipologia>").append(tipologia).append("</tipologia>").append("\n");
		buf.append("  ").append("<note>").append(note).append("</note>").append("\n");
		buf.append("</OrariView>");
		return buf.toString();
	}
	
}
