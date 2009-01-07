package eu.sergiobelli.jworkcons.fe.bridges.tipologielavoro;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;
import eu.sergiobelli.jworkcons.be.services.tipologielavoro.TipologieLavoroService;
import eu.sergiobelli.jworkcons.fe.view.TipologieLavoroView;

/**
 * @author sergio
 */
public class TipologieLavoroBridge {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	private TipologieLavoroService tipologieLavoroService;
	public TipologieLavoroService getTipologieLavoroService() {return tipologieLavoroService;}
	public void setTipologieLavoroService(TipologieLavoroService tipologieLavoroService) {this.tipologieLavoroService = tipologieLavoroService;}
	
	public List<TipologieLavoroView> list() throws Exception {
		List<TipologieLavoro> tipologieLavoro = tipologieLavoroService.list();
		logger.debug("tipologieLavoro="+tipologieLavoro.size());
		
		List<TipologieLavoroView> tipologieLavoroView = new ArrayList<TipologieLavoroView>();
		for (TipologieLavoro tipologiaLavoro : tipologieLavoro) {
			tipologieLavoroView.add(new TipologieLavoroView(tipologiaLavoro));
		}
		logger.debug("tipologieLavoroView="+tipologieLavoroView.size());
		
		return tipologieLavoroView;
	}
	
	public void insert(TipologieLavoroView tipologieLavoroView) throws Exception {
		TipologieLavoro tipologieLavoro = new TipologieLavoro();
		tipologieLavoro.setId(tipologieLavoroView.getId());
		tipologieLavoro.setDescrizione(tipologieLavoroView.getDescrizione());
		tipologieLavoroService.insert(tipologieLavoro);
	}
}
