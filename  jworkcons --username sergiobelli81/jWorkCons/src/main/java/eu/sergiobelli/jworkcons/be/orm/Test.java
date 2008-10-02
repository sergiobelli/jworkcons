package eu.sergiobelli.jworkcons.be.orm;

import java.util.List;

import eu.sergiobelli.jworkcons.be.orm.model.Orari;
import eu.sergiobelli.jworkcons.be.orm.model.TipologieLavoro;

public class Test {
	public static void main(String [] st){
//		deleteAll();
//		useAPI();
		
		BasicDAO<TipologieLavoro,String> tlDAO = new TipologieLavoroDAO();
		List<TipologieLavoro> lista = tlDAO.listAll();
		for (TipologieLavoro elemento : lista) {
			System.out.println(elemento.getId());
			System.out.println(elemento.getDescrizione());			
		}
		
		BasicDAO<Orari,String> orariDAO = new OrariDAO();
		List<Orari> orari = orariDAO.listAll();
		for (Orari elemento : orari) {
			System.out.println(elemento.getId());
			System.out.println(elemento.getData());
			System.out.println(elemento.getOraIngresso() + ":" + elemento.getMinutoIngresso());
			System.out.println(elemento.getOraUscita() + ":" + elemento.getMinutoUscita());
			System.out.println(elemento.getTipologia().getDescrizione());
			System.out.println(elemento.getNote());
			
		}
	}
	
//	public static void deleteAll(){
//		BasicDAO<ProdottoVO,String> pDao=new ProdottoDAO();
//		BasicDAO<PosizioneVO,String> poDao=new PosizioneDAO();
//		List<ProdottoVO> list1=pDao.listAll();
//		JPAUtility.beginTransaction();
//		for(ProdottoVO pro:list1){
//			pDao.delete(pro);
//		}
//		JPAUtility.commitTransaction();
//		JPAUtility.beginTransaction();
//		List<PosizioneVO> list2=poDao.listAll();
//		for(PosizioneVO po:list2){
//			poDao.delete(po);
//		}
//		JPAUtility.commitTransaction();
//	}
//	
//	public static ProdottoVO getProdotto(String nome,String descrizione,Date scadenza,int q,PosizioneVO pos){
//		String id=UUID.randomUUID().toString();
//		ProdottoVO pro1=new ProdottoVO();
//		pro1.setId(id);
//		pro1.setScadenza(scadenza);
//		pro1.setQuantita(q);
//		pro1.setPosizione(pos);
//		pro1.setNome(nome);
//		pro1.setDescrizione(descrizione);
//		return pro1;
//	}
//	
//	public static PosizioneVO getPosizione(String etichetta,int colonna,int piano){
//		String id=UUID.randomUUID().toString();
//		PosizioneVO po1=new PosizioneVO();
//		po1.setId(id);
//		po1.setEtichetta(etichetta);
//		po1.setColonna(colonna);
//		
//		po1.setPiano(piano);
//		
//		return po1;
//	}
//	
//	public static void useAPI(){
//		
//		ProdottoDAO pDao=new ProdottoDAO();
//		PosizioneDAO poDAO=new PosizioneDAO();
//		PosizioneVO p0=getPosizione("Scaffale 1",0,0); 
//		JPAUtility.beginTransaction();
//		poDAO.create(p0);
//		JPAUtility.commitTransaction();
//		
//		ProdottoVO pro1=getProdotto("Penne","Pinco pasta", new Date(), 11, p0);
//		ProdottoVO pro2=getProdotto("Spaghetti","Pinco pasta", new Date(), 16, p0);
//		JPAUtility.beginTransaction();
//		pDao.create(pro1);
//		pDao.create(pro2);
//		JPAUtility.commitTransaction();
//		
//		String pid=p0.getId();
//		PosizioneVO pos=poDAO.read(pid);
//		JPAUtility.closeEntityManger();
//		
//		pos.setColonna(2);
//		JPAUtility.beginTransaction();
//		poDAO.update(pos);
//		JPAUtility.commitTransaction();
//		JPAUtility.closeEntityManger();
//		
//		PosizioneVO ex=getPosizione(null,2,0);
//		List<PosizioneVO> posizioni=poDAO.listByExample(ex,"etichetta", true);
//		
//		
//		System.out.println("posizioni(0).prodotti.size "+posizioni.get(0).getProdotti().size());
//		System.out.println("posizioni(0).prodotti(0).descrizione "+posizioni.get(0).getProdotti().iterator().next().getDescrizione());
//		
//	}
	
	

}

