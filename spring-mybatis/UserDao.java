package com.ss.mybatis.dao;

import com.ss.mybatis.entity.User;

public interface UserDao {
	
	public User findById(long id);

}
