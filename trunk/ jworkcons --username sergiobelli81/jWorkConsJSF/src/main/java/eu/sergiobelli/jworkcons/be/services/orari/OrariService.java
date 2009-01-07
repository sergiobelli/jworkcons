package eu.sergiobelli.jworkcons.be.services.orari;

import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.OrariDAO;
import eu.sergiobelli.jworkcons.be.orm.ParametersMap;
import eu.sergiobelli.jworkcons.be.orm.model.Orari;

/**
 * 
 * @author sergio
 * TODO : Utilizzare Spring
 */
public class OrariService {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	private OrariDAO orariDao;
	public OrariDAO getOrariDao() {return orariDao;}
	public void setOrariDao(OrariDAO orariDao) {this.orariDao = orariDao;}

	public Orari get(Integer id) throws Exception {
		ParametersMap params = new ParametersMap(Orari.ID, id);
		return orariDao.get(params);
	}
	
	public List<Orari> list() throws Exception {
		return orariDao.list(new ParametersMap());
	}
	
	public void insert(Orari orario) throws Exception {
		logger.info("Inserimento nuovo orario = " + orario);
		orariDao.insert(orario);
		logger.info("Inserimento nuovo orario completato !");
	}
	
	public void update(Orari orario) throws Exception {
		logger.info("Modifica orario = " + orario);
		orariDao.update(orario);
		logger.info("Modifica orario completata!");
	}
	
	public void delete(Integer id) throws Exception {
		logger.info("Cancellazione orario = " + id);
		orariDao.delete(id);
		logger.info("Cancellazione orario completata!");
	}
	
}
