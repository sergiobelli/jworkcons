package eu.sergiobelli.jworkcons.fe.executers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;
import eu.sergiobelli.jworkcons.fe.bridges.tipologieevento.TipologieEventoBridge;
import eu.sergiobelli.jworkcons.fe.bridges.tipologielavoro.TipologieLavoroBridge;
import eu.sergiobelli.jworkcons.fe.view.TipologieEventoView;
import eu.sergiobelli.jworkcons.fe.view.TipologieLavoroView;

public class DefaultExecuter {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	private List<SelectItem> tipologieLavoro;
	public List<SelectItem> getTipologieLavoro() {return tipologieLavoro;}
	public void setTipologieLavoro(List<SelectItem> tipologieLavoro) {this.tipologieLavoro = tipologieLavoro;}
	
	private List<SelectItem> tipologieEvento;
	public List<SelectItem> getTipologieEvento() {return tipologieEvento;}
	public void setTipologieEvento(List<SelectItem> tipologieEvento) {this.tipologieEvento = tipologieEvento;}
	
	private List<SelectItem> anni;
	public List<SelectItem> getAnni() {return anni;}
	public void setAnni(List<SelectItem> anni) {this.anni = anni;}
	
	private List<SelectItem> mesi;
	public List<SelectItem> getMesi() {return mesi;}
	public void setMesi(List<SelectItem> mesi) {this.mesi = mesi;}
	
	private List<SelectItem> giorni;
	public List<SelectItem> getGiorni() {return giorni;}
	public void setGiorni(List<SelectItem> giorni) {this.giorni = giorni;}

	private List<SelectItem> ore;
	public List<SelectItem> getOre() {return ore;}
	public void setOre(List<SelectItem> ore) {this.ore = ore;}
	
	private List<SelectItem> minuti;
	public List<SelectItem> getMinuti() {return minuti;}
	public void setMinuti(List<SelectItem> minuti) {this.minuti = minuti;}
	
	private TipologieLavoroBridge tipologieLavoroBridge;
//	public TipologieLavoroBridge getTipologieLavoroBridge() {return tipologieLavoroBridge;}
	public TipologieLavoroBridge getTipologieLavoroBridge() {return ApplicationContextFactory.getInstance().getTipologieLavoroBridge();}
	public void setTipologieLavoroBridge(TipologieLavoroBridge tipologieLavoroBridge) {this.tipologieLavoroBridge = tipologieLavoroBridge;}
	
	private TipologieEventoBridge tipologieEventoBridge;
//	public TipologieEventoBridge getTipologieEventoBridge() {return tipologieEventoBridge;}
	public TipologieEventoBridge getTipologieEventoBridge() {return ApplicationContextFactory.getInstance().getTipologieEventoBridge();}
	public void setTipologieEventoBridge(TipologieEventoBridge tipologieEventoBridge) {this.tipologieEventoBridge = tipologieEventoBridge;}
	
	public DefaultExecuter() {

		try {
			//tipologie lavoro
			List<TipologieLavoroView> tipologieLavoroLista = getTipologieLavoroBridge().list();
			List<SelectItem> tipologieLavoroList = new ArrayList<SelectItem>();
			for (TipologieLavoroView elemento : tipologieLavoroLista) {
				tipologieLavoroList.add(new SelectItem(elemento.getId(),elemento.getDescrizione()));
			}
			setTipologieLavoro(tipologieLavoroList);

			//Tipologie evento
			List<TipologieEventoView> tipologieEventoLista = getTipologieEventoBridge().list();
			List<SelectItem> tipologieEventoList = new ArrayList<SelectItem>();
			for (TipologieEventoView elemento : tipologieEventoLista) {
				tipologieEventoList.add(new SelectItem(elemento.getId(),elemento.getDescrizione()));
			}
			setTipologieEvento(tipologieEventoList);

			//Anni
			List<SelectItem> anniList = new ArrayList<SelectItem>();
			for ( int i = 2008 ; i < 2021 ; i++ ) {				
				anniList.add(new SelectItem(i,Integer.valueOf(i).toString()));
			}
			setAnni(anniList);

			//Mesi
			List<SelectItem> mesiList = new ArrayList<SelectItem>();
			for ( int i = 1 ; i < 13 ; i++ ) {				
				mesiList.add(new SelectItem(i,Integer.valueOf(i).toString()));
			}
			setMesi(mesiList);

			//Giorni
			List<SelectItem> giorniList = new ArrayList<SelectItem>();
			for ( int i = 1 ; i < 32 ; i++ ) {				
				giorniList.add(new SelectItem(i,Integer.valueOf(i).toString()));
			}
			setGiorni(giorniList);

			//Ore
			List<SelectItem> oreList = new ArrayList<SelectItem>();
			for ( int i = 0 ; i < 24 ; i++ ) {				
				oreList.add(new SelectItem(i,Integer.valueOf(i).toString()));
			}
			setOre(oreList);

			//Minuti
			List<SelectItem> minutiList = new ArrayList<SelectItem>();
			for ( int i = 0 ; i < 60 ; i++ ) {				
				minutiList.add(new SelectItem(i,Integer.valueOf(i).toString()));
			}
			setMinuti(minutiList);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
	}
	
}
