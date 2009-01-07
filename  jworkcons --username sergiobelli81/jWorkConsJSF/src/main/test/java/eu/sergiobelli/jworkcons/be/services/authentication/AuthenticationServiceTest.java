package eu.sergiobelli.jworkcons.be.services.authentication;

import eu.sergiobelli.jworkcons.be.services.authentication.AuthenticationService;
import junit.framework.TestCase;


public class AuthenticationServiceTest extends TestCase {

	private AuthenticationService as = null;
	protected void setUp() throws Exception { as = new AuthenticationService(); }
	protected void tearDown() throws Exception { as = null; }

	public void testAuthenticateOk() {
		assertTrue(as.authenticate("admin", "rickyculo"));
	}

	public void testAuthenticateKo() {
		assertFalse(as.authenticate("", ""));
		assertFalse(as.authenticate(null, null));
		
		assertFalse(as.authenticate("pippo", "pluto"));
		assertFalse(as.authenticate("admin", "pippo"));
		
		assertFalse(as.authenticate("pippo", ""));
		assertFalse(as.authenticate("pippo", null));
		
		assertFalse(as.authenticate("", "pluto"));
		assertFalse(as.authenticate(null, "pluto"));

		assertFalse(as.authenticate("admin", ""));
		assertFalse(as.authenticate("admin", null));
		
		assertFalse(as.authenticate("", "rickyculo"));
		assertFalse(as.authenticate(null, "rickyculo"));
	}
}
