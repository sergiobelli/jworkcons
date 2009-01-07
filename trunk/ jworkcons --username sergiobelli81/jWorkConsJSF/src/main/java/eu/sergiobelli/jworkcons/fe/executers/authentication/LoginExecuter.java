package eu.sergiobelli.jworkcons.fe.executers.authentication;

import org.apache.log4j.Logger;

import eu.sergiobelli.jworkcons.fe.bridges.ApplicationContextFactory;


public class LoginExecuter {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	private String username;
	public String getUsername() {return username;}
	public void setUsername(String username) {this.username = username;}

	private String password;
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	private final String LOGIN_DONE = "loginDone";
	private final String LOGIN_FAILED = "loginFailed";
	
	public String login() {
		if (ApplicationContextFactory.getInstance().getAuthenticationBridge().authenticate(getUsername(), getPassword())) {
			logger.info("Login done for user " + getUsername());
			return LOGIN_DONE;
		} else {
			logger.warn("Login failed for user " + getUsername());
			return LOGIN_FAILED;
		}
	}
}
