package com.yc.springmvc_css.handlers;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserHandler {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping("/forget")
	public String forget(String username,String email){
		LogManager.getLogger().debug("请求UserHandler进行gorget的基本操作");
		LogManager.getLogger().debug("请求username:" + username + ",email:" + email);
		
		MimeMessage message = mailSender.createMimeMessage();
		// use the true flag to indicate you need a multipart message
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(email);
			helper.setFrom("15573481252@163.com");
			helper.setSubject("找回密码");
			helper.setText("<html><body><a href=' '>获得新密码</a></body></html>", true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mailSender.send(message);
		
		return "redirect:forgetSuccess";
	}
}
