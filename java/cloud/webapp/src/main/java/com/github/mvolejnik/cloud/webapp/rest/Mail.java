package com.github.mvolejnik.cloud.webapp.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.github.mvolejnik.cloud.webapp.CloudAppException;
import com.github.mvolejnik.cloud.webapp.service.MailService;

@Path("/mail")
public class Mail {
	
	MailService mailService = new MailService();

	@POST
	@Path("/send")
	public void sendMail(
			@FormParam("to") final String to,
			@FormParam("subject") final String subject,
			@FormParam("content") final String content) throws CloudAppException{
		mailService.send("test@localhost", to, subject, content);
	}

}
