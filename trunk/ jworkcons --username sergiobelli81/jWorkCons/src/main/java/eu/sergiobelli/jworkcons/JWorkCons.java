package eu.sergiobelli.jworkcons;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * @author sbelli
 */
public class JWorkCons extends WebApplication {
    public JWorkCons() {}

	@Override
	public Class getHomePage() {
		return HomePage.class;
	}
}
  