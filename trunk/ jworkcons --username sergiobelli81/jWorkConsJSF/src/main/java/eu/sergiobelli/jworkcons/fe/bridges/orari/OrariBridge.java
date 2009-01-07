package eu.sergiobelli.jworkcons.fe.bridges.orari;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.Assert;
import eu.sergiobelli.jworkcons.be.orm.model.Orari;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieEvento;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;
import eu.sergiobelli.jworkcons.be.services.orari.OrariService;
import eu.sergiobelli.jworkcons.fe.view.OrariView;

/**
 * @author sergio
 * TODO : Utilizzare Spring
 */
public class OrariBridge {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	private OrariService orariService;
	public OrariService getOrariService() {return orariService;}
	public void setOrariService(OrariService orariService) {this.orariService = orariService;}
	
	public List<OrariView> list() throws Exception {
		List<Orari> orari = orariService.list();
		logger.debug("orari="+orari.size());
		
		List<OrariView> orariView = new ArrayList<OrariView>();
		for (Orari orario : orari) {
			orariView.add(new OrariView(orario));
		}
		logger.debug("orariView="+orariView.size());
		
		return orariView;
	}
	public void insert(OrariView orarioView) throws Exception {
		logger.info("Inserimento nuovo orario = " + orarioView);
		
		Orari orario = new Orari();
		orario.setData(orarioView.getData());
		
		TipologieEvento tipologieEvento = new TipologieEvento();
		tipologieEvento.setId(orarioView.getEvento().getId());
		tipologieEvento.setDescrizione(orarioView.getEvento().getDescrizione());
		orario.setEvento(tipologieEvento);
		
		orario.setMinuto(orarioView.getMinuto());
		orario.setNote(orarioView.getNote());
		orario.setOra(orarioView.getOra());
		
		TipologieLavoro tipologieLavoro = new TipologieLavoro();
		tipologieLavoro.setId(orarioView.getTipologia().getId());
		tipologieLavoro.setDescrizione(orarioView.getTipologia().getDescrizione());
		orario.setTipologia(tipologieLavoro);
		
		orario.setNote(orarioView.getNote());
		logger.info("nuovo orario = " + orario);
		
		orariService.insert(orario);
		
		logger.info("Inserimento nuovo orario completato !");
	}
	
	public OrariView get(Integer id) throws Exception {
		logger.info("Richiesto reperimento orario avente id= " + id);
		
		OrariView orarioView = null;
		
		Orari orario = orariService.get(id);
		logger.info("orario reperito = " + orario);
		
		if (Assert.isNotNull(orario)) {
			orarioView = new OrariView(orario);			
		}
		
		logger.info("orario view composto = " + orarioView);
		return orarioView;
	}
	
	public void update(OrariView orarioView)  throws Exception {
		logger.info("Modifica orario = " + orarioView);
		
		Orari orario = new Orari();
		
		orario.setId(orarioView.getId());
		
		orario.setData(orarioView.getData());
		
		TipologieEvento tipologieEvento = new TipologieEvento();
		tipologieEvento.setId(orarioView.getEvento().getId());
		tipologieEvento.setDescrizione(orarioView.getEvento().getDescrizione());
		orario.setEvento(tipologieEvento);
		
		orario.setMinuto(orarioView.getMinuto());
		orario.setNote(orarioView.getNote());
		orario.setOra(orarioView.getOra());
		
		TipologieLavoro tipologieLavoro = new TipologieLavoro();
		tipologieLavoro.setId(orarioView.getTipologia().getId());
		tipologieLavoro.setDescrizione(orarioView.getTipologia().getDescrizione());
		orario.setTipologia(tipologieLavoro);
		
		orario.setNote(orarioView.getNote());
		logger.info("orario = " + orario);
		
		orariService.update(orario);
		
		logger.info("Modifica orario completata !");
	}
	
	public void delete(Integer id) throws Exception {
		logger.info("Cancellazione orario = " + id);
		orariService.delete(id);
		logger.info("Cancellazione orario completata !");
	}
	
}
