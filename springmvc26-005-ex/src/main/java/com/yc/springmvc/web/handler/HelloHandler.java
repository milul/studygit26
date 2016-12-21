package com.yc.springmvc.web.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/springmvc")
// 请求处理的前缀， 可以过滤处理
// @SessionAttributes(names={"errorMsg", "errorMsg02"})
// @SessionAttributes(types={String.class}, names={"errorMsgCode", "user"})
@SessionAttributes("user")
public class HelloHandler {

	@RequestMapping("/hello")
	// 正常请求响应处理
	public String hello(String name, HttpServletRequest request, HttpSession session) {
		System.out.println("请求HelloHandler.hello()处理进来了, 请求参数name:" + name);
		request.setAttribute("errorMSg", "request登录失败！！！");
		session.setAttribute("errorMSg", "session登录失败！！！");
		return "redirect:/success.jsp";
	}
}
