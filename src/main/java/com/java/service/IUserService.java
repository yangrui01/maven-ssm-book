package com.java.service;

import java.util.List;
import java.util.Map;

import com.java.pojo.User;

public interface IUserService {
	  public List<User> listUser();  
	  
	  public User getUser(Map<String, String> map);
}
