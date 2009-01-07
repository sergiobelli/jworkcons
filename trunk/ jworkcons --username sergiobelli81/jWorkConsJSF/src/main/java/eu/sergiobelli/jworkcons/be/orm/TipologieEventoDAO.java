package eu.sergiobelli.jworkcons.be.orm;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.model.Orari;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieEvento;

public class TipologieEventoDAO extends DbManager {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	public TipologieEvento get(Object parameter) throws Exception {
		try {
			return (TipologieEvento)getDataBaseDao().queryForObject("TipologieEvento.get", parameter);
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {}
	}

	public void insert(Object instance) throws Exception {
		try {
			startTransaction();
			getDataBaseDao().insert("TipologieEvento.insert", instance);
			commitTransaction();
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {endTransaction();}
	}

	public List<TipologieEvento> list(ParametersMap parameters) throws Exception {
		try {
			long start = Calendar.getInstance().getTimeInMillis();
			List<TipologieEvento> lista = (List<TipologieEvento>)getDataBaseDao().queryForList("TipologieEvento.get",parameters);
			long end = Calendar.getInstance().getTimeInMillis();
			long tooktime = end - start;
			logger.debug("Numero oggetti reperiti " + lista.size() + ", tempo impiegato " + tooktime);
			return lista;			
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {}
	}
	
}
