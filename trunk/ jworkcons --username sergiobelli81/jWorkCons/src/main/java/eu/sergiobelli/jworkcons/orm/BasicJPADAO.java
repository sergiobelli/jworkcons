package eu.sergiobelli.jworkcons.orm;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;


public abstract class BasicJPADAO<T, PK extends Serializable> implements BasicDAO<T, PK> {

	protected Class<T> persistentClass;
	
	
	@SuppressWarnings("unchecked")
	public BasicJPADAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
		
	protected EntityManager getEntityManager() {
		return JPAUtility.currentEntityManager();
	}

	@SuppressWarnings("unchecked")
	public T read(PK id) {
		T entity = (T) getEntityManager().find(this.persistentClass, id);
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public T create(T entity) {
		getEntityManager().persist(entity);
		return entity;
	}

	public void delete(T entity) {
		getEntityManager().remove(entity);
	}

	
	public void update(T transientObject) {
		getEntityManager().merge(transientObject);
		
	}

	@SuppressWarnings("unchecked")
	public List<T> listAll() {
		return listAll(null,false);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listAll(String orderCol,boolean asc) {
		return this.listByExample(null, orderCol, asc);
	}

	@SuppressWarnings("unchecked")
	public abstract List<T> listByExample(T exampleInstance,String orderCol,boolean asc); 
	
	@SuppressWarnings("unchecked")
	public List<T> listByExample(T exampleInstance) {		
		return this.listByExample(exampleInstance,null,false);
	}
}