package eu.sergiobelli.jworkcons.be.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	private static ThreadLocal<EntityManager> tl = new ThreadLocal<EntityManager>();
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("IOP");

	public static EntityManager currentEntityManager()  {
		EntityManager s = tl.get();
	    if (s == null){
	        s = emf.createEntityManager();
	        tl.set(s);
	    }
	    return s;
	}

	public static void beginTransaction(){
		currentEntityManager().getTransaction().begin();
	}

	public static void commitTransaction(){
		currentEntityManager().getTransaction().commit();
	}

	public static void rollbackTransaction(){
		currentEntityManager().getTransaction().rollback();
	}

	public static void closeEntityManger() {
		EntityManager s = (EntityManager) tl.get();
	    tl.set(null);
	    if ((s != null)&& s.isOpen()){
			s.close();
	    }
	}
	
	public static void close() {
		tl=null;
		emf.close();
	}
}
