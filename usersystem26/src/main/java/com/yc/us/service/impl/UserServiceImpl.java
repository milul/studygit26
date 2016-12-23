package com.yc.us.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.us.entity.PaginationBean;
import com.yc.us.entity.User;
import com.yc.us.mapper.UserMapper;
import com.yc.us.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		return userMapper.findUser(user);
	}

	@Override
	public PaginationBean<User> getPartUsers(String currPage, String pageSize) {
		PaginationBean<User> userBean = new PaginationBean<User>();
		if (currPage != null) {
			userBean.setCurrPage(Integer.parseInt(currPage));
		}
		if (pageSize != null) {
			userBean.setPageSize(Integer.parseInt(pageSize));
		}
		return userMapper.getUsersByPagination(userBean);
	}

	@Override
	public boolean modifyUser(User user) {
		return userMapper.updateUser(user) > 0;
	}

	@Override
	public User getUserById(String id) {
		return userMapper.getUserById(Integer.parseInt(id));
	}

}
