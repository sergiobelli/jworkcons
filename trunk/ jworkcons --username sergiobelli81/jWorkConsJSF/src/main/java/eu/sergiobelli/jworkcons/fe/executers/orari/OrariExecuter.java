package eu.sergiobelli.jworkcons.fe.executers.orari;

import java.util.Date;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.executers.DefaultExecuter;

public class OrariExecuter extends DefaultExecuter {

	private final Logger logger = Logger.getLogger(this.getClass());	
	
	private Integer id;
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	
	private Date data;
	public Date getData() {return data;}
	public void setData(Date data) {this.data = data;}

	private Integer ora;
	public Integer getOra() {return ora;}
	public void setOra(Integer ora) {this.ora = ora;}
	
	private Integer minuto;
	public Integer getMinuto() {return minuto;}
	public void setMinuto(Integer minuto) {this.minuto = minuto;}
	
	private Integer tipologiaEvento;
	public Integer getTipologiaEvento() {return tipologiaEvento;}
	public void setTipologiaEvento(Integer tipologiaEvento) {this.tipologiaEvento = tipologiaEvento;}
	
	private Integer tipologiaLavoro;
	public Integer getTipologiaLavoro() {return tipologiaLavoro;}
	public void setTipologiaLavoro(Integer tipologiaLavoro) {this.tipologiaLavoro = tipologiaLavoro;}
	
	private String note;
	public String getNote() {return note;}
	public void setNote(String note) {this.note = note;}
	
	public OrariExecuter() {
		super();
	}
	
}
