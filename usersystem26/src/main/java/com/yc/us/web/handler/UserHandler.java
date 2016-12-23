package com.yc.us.web.handler;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.yc.us.entity.PaginationBean;
import com.yc.us.entity.User;
import com.yc.us.service.UserService;
import com.yc.us.util.ServletUtil;

@Controller
@RequestMapping("/user")
public class UserHandler {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	@ResponseBody
	public boolean login(User user, HttpSession session) {
		LogManager.getLogger().debug("请求UserHandler处理login...");
		user = userService.login(user);
		session.setAttribute("loginUser", user);
		return user != null;
	}

	@RequestMapping("/list")
	@ResponseBody
	public PaginationBean<User> list(String page, String rows) {
		LogManager.getLogger().debug("请求UserHandler处理list...");
		return userService.getPartUsers(page, rows);
	}

	@RequestMapping("/modify")
	@ResponseBody
	public boolean modify(User user, @RequestParam(name = "picData", required = false) MultipartFile picData) {
		LogManager.getLogger().debug("请求UserHandler处理modify...");
		if (picData != null && !picData.isEmpty()) {
			try {
				picData.transferTo(new File(ServletUtil.UPLOAD_DIR, picData.getOriginalFilename())); // 上传文件
				user.setPicPath("/" + ServletUtil.UPLOAD_DIR_NAME + "/" + picData.getOriginalFilename());
			} catch (IllegalStateException | IOException e) {
				LogManager.getLogger().error("上传文件操作失败...", e);
			}
		}
		return userService.modifyUser(user);
	}

}
