package eu.sergiobelli.jworkcons.be.services;

import java.util.List;

import eu.sergiobelli.jworkcons.be.orm.BasicDAO;
import eu.sergiobelli.jworkcons.be.orm.OrariDAO;
import eu.sergiobelli.jworkcons.be.orm.model.Orari;

/**
 * 
 * @author sergio
 * TODO : Utilizzare Spring
 */
public class ElencoOreService {

	private static ElencoOreService instance = null;
	protected ElencoOreService() {}
	public static ElencoOreService getInstance() {
		if (instance==null){instance=new ElencoOreService();}
		return instance;
	}
	
	public List<Orari> getOrari() {
		BasicDAO<Orari,String> orariDAO = new OrariDAO();
		return orariDAO.listAll();
	}
}
