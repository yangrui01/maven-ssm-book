package com.java.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.java.dao.IUserDao;
import com.java.pojo.User;
import com.java.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
	@Resource
    private IUserDao userDao;

	public List<User> listUser() {
		return userDao.listUser();  
	}

	public User getUser(Map<String, String> map) {
		return userDao.getUser(map);  
	}  
  
  
}  