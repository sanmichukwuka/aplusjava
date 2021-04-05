package com.aplus.webutils;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class WebServiceUtils {
	private static final Logger log = LoggerFactory.getLogger("WebServiceUtils.class");

	@Autowired
	private JavaMailSender sender;

	
	HttpServletRequest request;

	
	public void sendMail(String to, String msg, String subject) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo(to);
		helper.setText(msg);
		helper.setSubject(subject);
		sender.send(message);

	}

	
	

	// Add method for multiple file upload in WebUtils.java
	

}
