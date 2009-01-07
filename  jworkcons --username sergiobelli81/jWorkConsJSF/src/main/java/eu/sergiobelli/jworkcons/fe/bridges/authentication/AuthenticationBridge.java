package eu.sergiobelli.jworkcons.fe.bridges.authentication;

import eu.sergiobelli.jworkcons.be.services.authentication.AuthenticationService;

/**
 * Componente che collega il FE al servizio che espone la logica di business su BE
 * @author sbelli
 */
public class AuthenticationBridge {

	private AuthenticationService authenticationService = null;
	public AuthenticationService getAuthenticationService() {return authenticationService;}
	public void setAuthenticationService(AuthenticationService authenticationService) {this.authenticationService = authenticationService;}
	
	public boolean authenticate (String username, String password) {
		return authenticationService.authenticate(username, password);
	}	
}
