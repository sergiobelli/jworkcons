package eu.sergiobelli.jworkcons.fe.converters;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;
import eu.sergiobelli.jworkcons.fe.view.TipologieLavoroView;

public class TipologieLavoroConverter implements Converter {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	private List<TipologieLavoroView> tipologieLavoro;
	public TipologieLavoroConverter() {
		try {
			tipologieLavoro = ApplicationContextFactory.getInstance().getTipologieLavoroBridge().list();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Errore nel reperire la lista di tipologie lavoro",e);
		}
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {	
		for (TipologieLavoroView tlw : tipologieLavoro) {
			if (tlw.getId().equals(new Integer(arg2))) {
				return tlw;
			}
		}		
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return arg2.toString();
	}
	
}
