package eu.sergiobelli.jworkcons.fe.bridges;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.sergiobelli.jworkcons.fe.bridges.authentication.AuthenticationBridge;
import eu.sergiobelli.jworkcons.fe.bridges.orari.OrariBridge;
import eu.sergiobelli.jworkcons.fe.bridges.tipologieevento.TipologieEventoBridge;
import eu.sergiobelli.jworkcons.fe.bridges.tipologielavoro.TipologieLavoroBridge;

public class ApplicationContextFactory {
	private static ApplicationContext applicationContext = null;
	private static ApplicationContextFactory instance = null;
	protected ApplicationContextFactory () {
		String[] files = {"classpath:context.xml"};
		applicationContext = new ClassPathXmlApplicationContext(files);		
	}
	public static ApplicationContextFactory getInstance() {
		if (instance == null) {instance = new ApplicationContextFactory();}
		return instance;
	}
	
	public AuthenticationBridge getAuthenticationBridge() {
		return (AuthenticationBridge)applicationContext.getBean("authenticationBridge");
	}
	
	public OrariBridge getOrariBridge() {
		return (OrariBridge)applicationContext.getBean("orariBridge");
	}
	
	public TipologieLavoroBridge getTipologieLavoroBridge() {
		return (TipologieLavoroBridge)applicationContext.getBean("tipologieLavoroBridge");
	}
	
	public TipologieEventoBridge getTipologieEventoBridge() {
		return (TipologieEventoBridge)applicationContext.getBean("tipologieEventoBridge");
	}
}
