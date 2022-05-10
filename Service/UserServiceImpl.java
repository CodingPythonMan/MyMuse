package com.pultaeki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pultaeki.dao.UserDao;
import com.pultaeki.model.User;

public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> selectList() {
		return userDao.selectList();
	}

}
