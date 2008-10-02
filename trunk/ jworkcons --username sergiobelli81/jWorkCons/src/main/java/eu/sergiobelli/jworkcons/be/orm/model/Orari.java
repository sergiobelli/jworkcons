package eu.sergiobelli.jworkcons.be.orm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="orari")
public class Orari {
	@Column(name="id",nullable=false)
	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	@Column(name="data",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date data;
	public Date getData() {return data;}
	public void setData(Date data) {this.data = data;}
	
	@Column(name="ora_ingresso",nullable=false)
	private String oraIngresso;
	public String getOraIngresso() {return oraIngresso;}
	public void setOraIngresso(String oraIngresso) {this.oraIngresso = oraIngresso;}
	
	@Column(name="minuto_ingresso",nullable=false)
	private String minutoIngresso;
	public String getMinutoIngresso() {return minutoIngresso;}
	public void setMinutoIngresso(String minutoIngresso) {this.minutoIngresso = minutoIngresso;}
	
	@Column(name="ora_uscita",nullable=false)
	private String oraUscita;
	public String getOraUscita() {return oraUscita;}
	public void setOraUscita(String oraUscita) {this.oraUscita = oraUscita;}
	
	@Column(name="minuto_uscita",nullable=false)
	private String minutoUscita;
	public String getMinutoUscita() {return minutoUscita;}
	public void setMinutoUscita(String minutoUscita) {this.minutoUscita = minutoUscita;}
	
	@ManyToOne
	@JoinColumn(name="TIPOLOGIA")
	private TipologieLavoro tipologia;
	public TipologieLavoro getTipologia() {return tipologia;}
	public void setTipologia(TipologieLavoro tipologia) {this.tipologia = tipologia;}
	
	@Column(name="note",nullable=true)
	private String note;
	public String getNote() {return note;}
	public void setNote(String note) {this.note = note;}
	
}
