package eu.sergiobelli.jworkcons.orm.model;

/**
 * bla bla bla
 * @author sergio
 * @Entity
 * @Table(name="tipologie_lavoro")
 */
public class TipologieLavoro {

	/**
	 * @Column(name="id",nullable=false)
	 */
	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	/**
	 * @Column(name="descrizione",nullable=false)
	 */
	private String descrizione;
	public String getDescrizione() {return descrizione;}
	public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
	
}
