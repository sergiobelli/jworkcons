package eu.sergiobelli.jworkcons.fe.executers.orari;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;

public class EliminaOrariExecuter extends ModificaOrariExecuter {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	public String elimina() {
		logger.info("Inizio cancellazione orario");
		try {
			
			logger.debug("orario in cancellazione = " + getId());
			
			ApplicationContextFactory.getInstance().getOrariBridge().delete(getId());
						
		} catch (Exception e) {
			logger.error("Cancellazione con errori = ", e);
			return "";
		}
		
		logger.info("Cancellazione avvenuta con successo!");
		return "elenco";
	}
	
}
