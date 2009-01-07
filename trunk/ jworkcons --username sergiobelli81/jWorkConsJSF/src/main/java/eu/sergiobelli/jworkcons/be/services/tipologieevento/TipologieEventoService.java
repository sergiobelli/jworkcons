package eu.sergiobelli.jworkcons.be.services.tipologieevento;

import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.ParametersMap;
import eu.sergiobelli.jworkcons.be.orm.TipologieEventoDAO;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieEvento;

public class TipologieEventoService {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	private TipologieEventoDAO tipologieEventoDAO;
	public TipologieEventoDAO getTipologieEventoDAO() {return tipologieEventoDAO;}
	public void setTipologieEventoDAO(TipologieEventoDAO tipologieEventoDAO) {this.tipologieEventoDAO = tipologieEventoDAO;}

	public void get() throws Exception {
		tipologieEventoDAO.get(new ParametersMap());
	}
	
	public List<TipologieEvento> list() throws Exception {
		return tipologieEventoDAO.list(new ParametersMap());
	}
	
	public void insert(TipologieEvento tipologieEvento) throws Exception {
		tipologieEventoDAO.insert(tipologieEvento);
	}
}
