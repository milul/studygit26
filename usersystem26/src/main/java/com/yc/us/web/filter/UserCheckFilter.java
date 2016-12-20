package com.yc.us.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;

@WebFilter("/*")
public class UserCheckFilter implements Filter {

    
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//做用户校验处理
		String reqUriStr=((HttpServletRequest)request).getRequestURI();
		if(reqUriStr.endsWith("list.jsp")){
		HttpSession session=((HttpServletRequest)request).getSession();
		Object obj=session.getAttribute("loginUser");
		System.out.println("UserCheckFilter==>"+obj);
		if(obj==null){
			 ((HttpServletResponse)response).sendRedirect("/usersystem26/page/login.jsp");
		}else{
			chain.doFilter(request, response);
		}
		}else{
			chain.doFilter(request, response);
		}
	}

	/*public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session=((HttpServletRequest)request).getSession();
		Object obj=session.getAttribute("user");
		if(obj==null){
			 ((HttpServletResponse)response).sendRedirect("/usersystem26/page/login.jsp");
		}else{
			chain.doFilter(request, response);
		}
	}*/
	public void init(FilterConfig fConfig) throws ServletException {
		LogManager.getLogger().debug("初始化用户校验的过滤器处理UserCheckFilter...");
	}

}
