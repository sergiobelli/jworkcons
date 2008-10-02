package eu.sergiobelli.jworkcons.be.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tipologie_lavoro")
public class TipologieLavoro {
	@Column(name="ID",nullable=false)
	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	@Column(name="DESCRIZIONE",nullable=false)
	private String descrizione;
	public String getDescrizione() {return descrizione;}
	public void setDescrizione(String descrizione) {this.descrizione = descrizione;}	
}
