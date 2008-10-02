package eu.sergiobelli.jworkcons.be.orm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import eu.sergiobelli.jworkcons.be.orm.model.Orari;

public class OrariDAO extends BasicJPADAO<Orari,String>{

	@Override
	public List<Orari> listByExample(Orari tipologieLavoro, String orderCol, boolean asc) {
		StringBuffer queryString=new StringBuffer("select pro from "+this.persistentClass.getName()+" as pro ");
		queryString.append(" where pro.id=pro.id ");
		ArrayList values=new ArrayList();
		int params=1;
		if(tipologieLavoro!=null){
			if(tipologieLavoro.getNote()!=null){
				queryString.append(" and pro.note like ?").append(params++);
				values.add("%"+tipologieLavoro.getNote()+"%");
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
