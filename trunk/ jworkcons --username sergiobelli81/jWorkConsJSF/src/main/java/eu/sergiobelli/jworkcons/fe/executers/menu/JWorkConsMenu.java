package eu.sergiobelli.jworkcons.fe.executers.menu;

import org.apache.log4j.Logger;

public class JWorkConsMenu {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public String inserisci () {
		logger.info("requested redirect = inserisci");
		return "inserisci";
	}
	public String elenco () {
		logger.info("requested redirect = elenco");
		return "elenco";
	}
	public String modifica () {
		logger.info("requested redirect = modifica");
		return "modifica";
	}		
}
