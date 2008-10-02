package eu.sergiobelli.jworkcons.be.orm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;

public class TipologieLavoroDAO extends BasicJPADAO<TipologieLavoro,String>{

	@Override
	public List<TipologieLavoro> listByExample(TipologieLavoro tipologieLavoro, String orderCol, boolean asc) {
		StringBuffer queryString=new StringBuffer("select pro from "+this.persistentClass.getName()+" as pro ");
		queryString.append(" where pro.id=pro.id ");
		ArrayList values=new ArrayList();
		int params=1;
		if(tipologieLavoro!=null){
			if(tipologieLavoro.getDescrizione()!=null){
				queryString.append(" and pro.descrizione like ?").append(params++);
				values.add("%"+tipologieLavoro.getDescrizione()+"%");
			}			
		}
		Query q=this.getEntityManager().createQuery(queryString.toString());
		
		params=1;
		for(Object val:values){
			q.setParameter(params++, val);
		}
		return q.getResultList();
	}

	

}
