package eu.sergiobelli.jworkcons.fe.executers.orari;

import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;
import eu.sergiobelli.jworkcons.fe.view.OrariView;
import eu.sergiobelli.jworkcons.fe.view.TipologieEventoView;
import eu.sergiobelli.jworkcons.fe.view.TipologieLavoroView;

public class ModificaOrariExecuter extends OrariExecuter {

	private final Logger logger = Logger.getLogger(this.getClass());

	public void load(ActionEvent event) {
		Integer idOrario = (Integer) event.getComponent().getAttributes().get(
				"idOrario");
		init(idOrario);
	}

	private void init(Integer idOrario) {
		try {
			OrariView o = ApplicationContextFactory.getInstance()
					.getOrariBridge().get(idOrario);
			setId(o.getId());
			setData(o.getData());
			setMinuto(Integer.valueOf(o.getMinuto()));
			setOra(Integer.valueOf(o.getOra()));
			setNote(o.getNote());
			setTipologiaEvento(o.getEvento().getId());
			setTipologiaLavoro(o.getTipologia().getId());
		} catch (Exception ex) {
			logger.error("Errore durante il caricamento dell'atleta ! ", ex);
		}
	}

	public String modifica() {
		logger.info("Inizio modifica orario");
		try {
			
			OrariView orario = new OrariView();
			orario.setId(getId());
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
			
			ApplicationContextFactory.getInstance().getOrariBridge().update(orario);
						
		} catch (Exception e) {
			logger.error("Modifica con errori = ", e);
			return "";
		}
		
		logger.info("Modifica avvenuta con successo!");
		return "elenco";
	}
	
}
