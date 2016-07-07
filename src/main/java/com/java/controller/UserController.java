package com.java.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.java.pojo.User;
import com.java.service.IUserService;

@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource
    private IUserService userService;  
      
    @RequestMapping("/showUser")
    @ResponseBody
    public  String toIndex(HttpServletRequest request,Model model) throws UnsupportedEncodingException{  
        List<User> listUser = this.userService.listUser();  
        //model.addAttribute("user", listUser);
        return JSON.toJSONString(listUser);
    }  
    
    @RequestMapping("/test")  
    public String test(HttpServletRequest request,Model model){  
        return "test";  
    }  
    
    @RequestMapping("/prelogin")  
    public String prelogin(HttpServletRequest request,Model model){  
    	return "login";
          
    }  
    
    @RequestMapping("/login")  
    public String login(HttpServletRequest request,Model model){  
    	String userName = request.getParameter("username");
    	String pwd = request.getParameter("pwd");
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("user_name", userName);
    	map.put("password", pwd);
    	User user = userService.getUser(map);
    	if(user==null){
    		request.setAttribute("msg", "用户名或密码错误");
    		 return "/login";  
    	}else{
    		return "/success";	
    	}
          
    }  
}  