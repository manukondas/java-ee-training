package com.java.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class MailTest {

	/**
	   Outgoing Mail (SMTP) Server
	   requires TLS or SSL: smtp.gmail.com (use authentication)
	   Use Authentication: Yes
	   Port for SSL: 465
	 */
	public static void main(String[] args) {
	
		// Email address and password
		final String fromEmail = "javaee.training@gmail.com"; //requires valid gmail id
		final String password = "Welcome20@1"; // correct password for gmail id
		
		
		// Mail configuration with all setting
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host or Email Server
		props.put("mail.smtp.socketFactory.port", "465"); //SSL Port at Email Server
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
		props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); //SMTP Port
		
		
		// building authentication
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		
		// Build a Main Session
		
		Session session = Session.getDefaultInstance(props, auth);
		
		
		System.out.println("Session created");
		
	  // EmailUtil.sendEmail(session, "konsiva@gmail.com","SSLEmail Testing Subject", "<b>SSLEmail Testing Body</b>");

	       EmailUtil.sendAttachmentEmail(session, "konsiva@gmail.com","SSLEmail Testing Subject with Attachment", "<b>SSLEmail Testing Body with Attachment</b> <img src='https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png'></img>");

	       // EmailUtil.sendImageEmail(session, toEmail,"SSLEmail Testing Subject with Image", "SSLEmail Testing Body with Image");

	}

}