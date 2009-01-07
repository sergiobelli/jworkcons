package eu.sergiobelli.jworkcons.be.services.tipologielavoro;

import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.ParametersMap;
import eu.sergiobelli.jworkcons.be.orm.TipologieLavoroDAO;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;

/**
 * 
 * @author sergio
 * TODO : Utilizzare Spring
 */
public class TipologieLavoroService {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	private TipologieLavoroDAO tipologieLavoroDAO;
	public TipologieLavoroDAO getTipologieLavoroDAO() {return tipologieLavoroDAO;}
	public void setTipologieLavoroDAO(TipologieLavoroDAO tipologieLavoroDAO) {this.tipologieLavoroDAO = tipologieLavoroDAO;}

	public void get() throws Exception {
		tipologieLavoroDAO.get(new ParametersMap());
	}
	
	public List<TipologieLavoro> list() throws Exception {
		return tipologieLavoroDAO.list(new ParametersMap());
	}
	
	public void insert(TipologieLavoro tipologieLavoro) throws Exception {
		tipologieLavoroDAO.insert(tipologieLavoro);
	}
}
