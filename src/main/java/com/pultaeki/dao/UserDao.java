package com.pultaeki.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pultaeki.model.User;

@Mapper
public interface UserDao {
	public List<User> selectList();
}
