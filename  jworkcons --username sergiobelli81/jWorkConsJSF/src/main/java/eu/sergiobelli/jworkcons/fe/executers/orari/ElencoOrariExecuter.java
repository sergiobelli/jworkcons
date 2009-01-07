package eu.sergiobelli.jworkcons.fe.executers.orari;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;
import eu.sergiobelli.jworkcons.fe.view.OrariView;

public class ElencoOrariExecuter extends OrariExecuter {
	private final Logger logger = Logger.getLogger(this.getClass());
	
	private List<OrariView> orari;
	public List<OrariView> getOrari() {
		try {
			List<OrariView> orari = ApplicationContextFactory.getInstance().getOrariBridge().list(); 
			logger.info("orari="+orari.size());
			return orari;
		} catch (Exception ex) {
			logger.error("Errore nel reperimento della lista degli orari",ex);
			return new ArrayList<OrariView>();
		}
	}
	public void setOrari(List<OrariView> orari) {this.orari = orari;}
	
}
