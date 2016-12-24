package com.yc.springmvc_css.handlers;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserHandler {
	
	@RequestMapping("/forget")
	public String forget(String username,String email){
		LogManager.getLogger().debug("请求UserHandler进行gorget的基本操作");
		LogManager.getLogger().debug("请求username:" + username + ",email:" + email);
		
		return "redirect:/forgetSuccess.jsp";
	}
}
