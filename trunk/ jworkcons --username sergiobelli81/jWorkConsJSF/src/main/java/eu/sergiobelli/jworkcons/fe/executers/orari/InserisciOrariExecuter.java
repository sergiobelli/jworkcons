package eu.sergiobelli.jworkcons.fe.executers.orari;

import java.util.Calendar;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;
import eu.sergiobelli.jworkcons.fe.view.OrariView;
import eu.sergiobelli.jworkcons.fe.view.TipologieEventoView;
import eu.sergiobelli.jworkcons.fe.view.TipologieLavoroView;

public class InserisciOrariExecuter extends OrariExecuter {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public InserisciOrariExecuter() {
		super();
		setData(Calendar.getInstance().getTime());
	}
	
	public String insert() {
		logger.info("Inizio inserimento nuovo orario");
		try {
			
			OrariView orario = new OrariView();
			orario.setData(getData());
			orario.setOra(getOra().toString());//TODO:RIVEDERE BENE
			orario.setMinuto(getMinuto().toString());//TODO:RIVEDERE BENE
			
			for (TipologieLavoroView tlw : ApplicationContextFactory.getInstance().getTipologieLavoroBridge().list()) {
				if (tlw.getId().equals(getTipologiaLavoro())) {
					orario.setTipologia(tlw);//TODO:RIVEDERE BENE
					break;
				}				
			}
			
			for (TipologieEventoView tew : ApplicationContextFactory.getInstance().getTipologieEventoBridge().list()) {
				if (tew.getId().equals(getTipologiaEvento())) {
					orario.setEvento(tew);//TODO:RIVEDERE BENE
					break;
				}				
			}
			
			orario.setNote(getNote());
			logger.debug("orario in inserimento = " + orario);
			
			ApplicationContextFactory.getInstance().getOrariBridge().insert(orario);
						
		} catch (Exception e) {
			logger.error("Inserimento con errori = ", e);
			return "inserisci";
		}
		
		logger.info("Inserimento avvenuto con successo!");
		return "elenco";
	}

}
