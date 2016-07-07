package com.java.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.pojo.User;

public interface IUserDao {
	 int insert(User user);

	 
	 List<User> listUser();
	 
	 User getUser(Map<String, String> map);
}
