package eu.sergiobelli.jworkcons.fe.bridges;

import java.util.List;

import eu.sergiobelli.jworkcons.be.orm.model.Orari;
import eu.sergiobelli.jworkcons.be.services.ElencoOreService;

/**
 * 
 * @author sergio
 * TODO : Utilizzare Spring
 */
public class ElencoOreBridge {
	public List<Orari> getOrari() {
		return ElencoOreService.getInstance().getOrari();
	}
}
