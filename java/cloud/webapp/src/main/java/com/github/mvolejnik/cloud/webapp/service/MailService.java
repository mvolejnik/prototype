package com.github.mvolejnik.cloud.webapp.service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.github.mvolejnik.cloud.webapp.CloudAppException;

public class MailService {

	public void send(String from, String to, String subject, String content) throws CloudAppException {
		Context initCtx;
		try {
			initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			Session session = (Session) envCtx.lookup("mail/Session");

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress toAddress[] = new InternetAddress[1];
			toAddress[0] = new InternetAddress(to);
			message.setRecipients(Message.RecipientType.TO, toAddress);
			message.setSubject(subject);
			message.setContent(content, "text/plain");
			Transport.send(message);
		} catch (MessagingException|NamingException e) {
			e.printStackTrace();
			throw new CloudAppException(e);
		}
	}

}
