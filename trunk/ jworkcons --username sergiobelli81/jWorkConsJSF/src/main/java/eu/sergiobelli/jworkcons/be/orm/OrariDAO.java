package eu.sergiobelli.jworkcons.be.orm;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.model.Orari;

public class OrariDAO  extends DbManager {
	private final Logger logger = Logger.getLogger(this.getClass());
	
	public Orari get(ParametersMap parameters) throws Exception {
		try {
			return (Orari)getDataBaseDao().queryForObject("Orari.get", parameters);
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {}
	}

	public void insert(Object instance) throws Exception {
		try {
			logger.info("Inserimento nuovo orario = " + instance);
			startTransaction();
			getDataBaseDao().insert("Orari.insert", instance);
			commitTransaction();
			logger.info("Inserimento nuovo orario completato !");
		} catch (Exception ex) {
			logger.error("Inserimento nuovo orario con errore ", ex);
			throw new Exception(ex);
		} finally {endTransaction();}
	}

	public List<Orari> list(ParametersMap parameters) throws Exception {
		try {
			long start = Calendar.getInstance().getTimeInMillis();
			List<Orari> lista = (List<Orari>)getDataBaseDao().queryForList("Orari.get",parameters);
			long end = Calendar.getInstance().getTimeInMillis();
			long tooktime = end - start;
			logger.debug("Numero oggetti reperiti " + lista.size() + ", tempo impiegato " + tooktime);
			return lista;
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {}
	}

	public void update(Object instance) throws Exception {
		try {
			logger.info("Modifica orario = " + instance);
			startTransaction();
			getDataBaseDao().update("Orari.update", instance);
			commitTransaction();
			logger.info("Modifica orario completata!");
		} catch (Exception ex) {
			logger.error("Modifica orario con errore ", ex);
			throw new Exception(ex);
		} finally {endTransaction();}
	}

	public void delete(Integer id) throws Exception {
		try {
			logger.info("Cancellazione orario = " + id);
			startTransaction();
			getDataBaseDao().delete("Orari.delete", id);
			commitTransaction();
			logger.info("Cancellazione orario completata!");
		} catch (Exception ex) {
			logger.error("Cancellazione orario con errore ", ex);
			throw new Exception(ex);
		} finally {endTransaction();}
	}
	
}
