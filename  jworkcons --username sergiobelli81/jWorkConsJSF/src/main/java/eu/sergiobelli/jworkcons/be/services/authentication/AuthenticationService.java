package eu.sergiobelli.jworkcons.be.services.authentication;

public class AuthenticationService {
	private static final String DEMO_USER = "admin";
	private static final String DEMO_PWD =  "admin";
	
	public boolean authenticate(String username, String pwd){
		if(username == null || pwd == null) { return false; }
		if(username.equalsIgnoreCase(DEMO_USER) && pwd.equals(DEMO_PWD)){
			return true;
		} else {
			return false;
		}
	}
}
