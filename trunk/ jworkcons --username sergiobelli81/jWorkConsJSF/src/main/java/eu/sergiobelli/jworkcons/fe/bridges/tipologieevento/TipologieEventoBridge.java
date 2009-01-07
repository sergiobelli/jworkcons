package eu.sergiobelli.jworkcons.fe.bridges.tipologieevento;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.model.TipologieEvento;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;
import eu.sergiobelli.jworkcons.be.services.tipologieevento.TipologieEventoService;
import eu.sergiobelli.jworkcons.fe.view.TipologieEventoView;
import eu.sergiobelli.jworkcons.fe.view.TipologieLavoroView;

public class TipologieEventoBridge {
	private final Logger logger = Logger.getLogger(this.getClass());

	private TipologieEventoService tipologieEventoService;
	public TipologieEventoService getTipologieEventoService() {return tipologieEventoService;}
	public void setTipologieEventoService(TipologieEventoService tipologieEventoService) {this.tipologieEventoService = tipologieEventoService;}

	public List<TipologieEventoView> list() throws Exception {
		List<TipologieEvento> tipologieEvento = tipologieEventoService.list();
		logger.debug("tipologieEvento="+tipologieEvento.size());

		List<TipologieEventoView> tipologieEventoView = new ArrayList<TipologieEventoView>();
		for (TipologieEvento tipologiaLavoro : tipologieEvento) {
			tipologieEventoView.add(new TipologieEventoView(tipologiaLavoro));
		}
		logger.debug("tipologieLavoroView="+tipologieEventoView.size());

		return tipologieEventoView;
	}

	public void insert(TipologieEventoView tipologieEventoView) throws Exception {
		TipologieEvento tipologieEvento = new TipologieEvento();
		tipologieEvento.setId(tipologieEventoView.getId());
		tipologieEvento.setDescrizione(tipologieEventoView.getDescrizione());
		tipologieEventoService.insert(tipologieEvento);
	}
}
