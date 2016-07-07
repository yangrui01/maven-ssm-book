package com.java;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.java.pojo.User;
import com.java.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
 
public class TestMyBatis {  
   private static Logger logger = org.apache.log4j.Logger.getLogger(TestMyBatis.class);  
// private ApplicationContext ac = null;  
   @Resource  
   private IUserService userService = null;  
 
// @Before  
// public void before() {  
//     ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//     userService = (IUserService) ac.getBean("userService");  
// }  
 
   @Test  
   public void test1() {  
       List<User> userlist = userService.listUser();  
       // System.out.println(user.getUserName());  
       // logger.info("ֵ��"+user.getUserName());  
       logger.info(JSON.toJSONString(userlist));  
   }  
}  