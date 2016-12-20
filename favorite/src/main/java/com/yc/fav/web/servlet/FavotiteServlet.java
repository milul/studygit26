package com.yc.fav.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;

import com.yc.fav.entity.Favorite;
import com.yc.fav.service.FavoriteService;
@WebServlet("/fav/*")
public class FavotiteServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	private FavoriteService favoriteService;
	
	@Override
	public void init() throws ServletException {
		favoriteService=(FavoriteService) cxt.getBean("favoriteService");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		String reqUriStr=req.getRequestURI();
		LogManager.getLogger().debug("请求TagServlet处理"+reqUriStr+"的请求资源。。。");
		if(reqUriStr.endsWith("add")){
			doAdd(req,resp);
		}else if(reqUriStr.endsWith("list")){
			doList(req,resp);//ctrl+2,r一起改标识名
		}
	}

	private void doList(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Favorite fav=getReqParam2Obj(req, Favorite.class);
		LogManager.getLogger().debug("list处理的请求参数对象："+fav);
		List<Favorite> favs=favoriteService.listFavs(fav);
		respOutStr(resp, toJsonStr(favs));
	}
	
	private void doAdd(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Favorite fav=getReqParam2Obj(req, Favorite.class);
		LogManager.getLogger().debug("add处理的请求参数对象："+fav);
		respOutStr(resp, toJsonStr(favoriteService.addFav(fav)));
	}
}
