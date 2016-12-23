package com.yc.us.mapper;

import com.yc.us.entity.PaginationBean;
import com.yc.us.entity.User;

public interface UserMapper {

	User findUser(User user);

	PaginationBean<User> getUsersByPagination(PaginationBean<User> userBean);

	int updateUser(User user);

	User getUserById(int id);
}
