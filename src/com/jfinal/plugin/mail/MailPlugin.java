package com.jfinal.plugin.mail;

import java.util.Properties;

import com.jfinal.plugin.IPlugin;

/**
 * mayi
 */
public class MailPlugin implements IPlugin {

	private Properties prop;

	public static MailConf mailConf;

	public MailPlugin(Properties properties) {
		this.prop = properties;
	}

	public boolean start() {
		
		mailConf = new MailConf();
		mailConf.setEmailSmtpHost(prop.getProperty("smtp.host"));
		mailConf.setHostEmail(prop.getProperty("smtp.user"));
		mailConf.setHostEmailName(prop.getProperty("smtp.name"));
		mailConf.setPassword(prop.getProperty("smtp.password"));
		mailConf.setPort(prop.getProperty("smtp.port"));
		mailConf.setEnable(prop.getProperty("smtp.enable"));
		mailConf.setFallback(prop.getProperty("smtp.fallback"));
		mailConf.setAuth(prop.getProperty("smtp.auth"));

		return true;
	}

	public boolean stop() {
		return true;
	}
}
