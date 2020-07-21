package com.ys.h2hdrx.webmodule;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void mail(String message) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("nagamni.maram@youngsoft.in", "9642499339"));
		email.setSSLOnConnect(true);
		email.setFrom("nagamni.maram@youngsoft.in");
		email.setSubject("Production Url Down");
		email.setMsg(message);
		email.addTo("nagamni.maram@youngsoft.in" );
		email.send();
	}
}
