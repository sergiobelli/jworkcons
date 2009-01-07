package eu.sergiobelli.jworkcons.be.orm;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.be.orm.model.TipologieEvento;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;

public class TipologieLavoroDAO extends DbManager {
	private final Logger logger = Logger.getLogger(this.getClass());
	
//	public void delete(Object parameter) throws Exception {
//		try {
//			startTransaction();
//			getDataBaseDao().delete("deleteKUsrUtenti", parameter);
//			commitTransaction();
//		} catch (Exception ex) {
//			logger.error(ex, ex);
//			throw new Exception(ex);
//		} finally {endTransaction();}
//	}

	public TipologieLavoro get(Object parameter) throws Exception {
		try {
			return (TipologieLavoro)getDataBaseDao().queryForObject("TipologieLavoro.get", parameter);
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {}
	}

	public void insert(Object instance) throws Exception {
		try {
			startTransaction();
			getDataBaseDao().insert("TipologieLavoro.insert", instance);
			commitTransaction();
		} catch (Exception ex) {
			logger.error(ex, ex);
			throw new Exception(ex);
		} finally {endTransaction();}
	}

	public List<TipologieLavoro> list(ParametersMap parameters) throws Exception {
		try {
			long start = Calendar.getInstance().getTimeInMillis();
			List<TipologieLavoro> lista = (List<TipologieLavoro>)getDataBaseDao().queryForList("TipologieLavoro.get",parameters);
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

//public class TipologieLavoroDAO extends BasicJPADAO<TipologieLavoro,String>{
//
//	@Override
//	public List<TipologieLavoro> listByExample(TipologieLavoro tipologieLavoro, String orderCol, boolean asc) {
//		StringBuffer queryString=new StringBuffer("select pro from "+this.persistentClass.getName()+" as pro ");
//		queryString.append(" where pro.id=pro.id ");
//		ArrayList values=new ArrayList();
//		int params=1;
//		if(tipologieLavoro!=null){
//			if(tipologieLavoro.getDescrizione()!=null){
//				queryString.append(" and pro.descrizione like ?").append(params++);
//				values.add("%"+tipologieLavoro.getDescrizione()+"%");
//			}			
//		}
//		Query q=this.getEntityManager().createQuery(queryString.toString());
//		
//		params=1;
//		for(Object val:values){
//			q.setParameter(params++, val);
//		}
//		return q.getResultList();
//	}
//
//	
//
//}
