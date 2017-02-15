package com.jfinal.plugin.mail;

/**
 * mayi
 */
public class MailConf {

	private String hostEmail;
	private String hostEmailName;
	private String password;
	private String emailSmtpHost;

	private String toEmail;
	private String toEmailName;
	
	private String port;
	private String enable;
	private String fallback;
	private String auth;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getFallback() {
		return fallback;
	}

	public void setFallback(String fallback) {
		this.fallback = fallback;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public String getHostEmailName() {
		return hostEmailName;
	}

	public void setHostEmailName(String hostEmailName) {
		this.hostEmailName = hostEmailName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailSmtpHost() {
		return emailSmtpHost;
	}

	public void setEmailSmtpHost(String emailSmtpHost) {
		this.emailSmtpHost = emailSmtpHost;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getToEmailName() {
		return toEmailName;
	}

	public void setToEmailName(String toEmailName) {
		this.toEmailName = toEmailName;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
}
