package eu.sergiobelli.jworkcons;

import org.apache.wicket.markup.html.WebPage;

/**
 * @author sbelli
 */
public class HomePage extends WebPage {
	public HomePage() {
        add(new JWorkConsBorder("JWorkConsBorder"));
    }
}

