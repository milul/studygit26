package com.yc.fav.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;

import com.yc.fav.entity.Tag;
import com.yc.fav.service.TagService;
@WebServlet("/tag/*")
public class TagServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	private TagService tagService;
	
	@Override
	public void init() throws ServletException {
		tagService=(TagService) cxt.getBean("tagService");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		String reqUriStr=req.getRequestURI();
		LogManager.getLogger().debug("请求TagServlet处理"+reqUriStr+"的请求资源。。。");
		if(reqUriStr.endsWith("all")){
			doAll(req,resp);
		}
	}

	private void doAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		List<Tag> tags=tagService.findAllTags();
		respOutStr(resp, toJsonStr(tags));
	}
}
