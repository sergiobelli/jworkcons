package eu.sergiobelli.jworkcons;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.border.BoxBorder;

/**
 * @author sbelli
 */
public class JWorkConsBorder extends Border {
	public JWorkConsBorder(final String componentName)
    {
        super(componentName);
        add(new BoxBorder("navigationBorder"));
        add(new BoxBorder("bodyBorder"));
    }
}

