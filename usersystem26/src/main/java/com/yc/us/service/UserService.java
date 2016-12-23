package com.yc.us.service;

import com.yc.us.entity.PaginationBean;
import com.yc.us.entity.User;

public interface UserService {

	User login(User user);

	PaginationBean<User> getPartUsers(String currPage, String pageSize);

	boolean modifyUser(User user);

	User getUserById(String id);

}
