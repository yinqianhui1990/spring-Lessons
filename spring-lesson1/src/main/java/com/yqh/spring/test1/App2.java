package com.yqh.spring.test1;

import com.yqh.spring.test1.userService.UserService;
import com.yqh.spring.test1.userService.userServiceImpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserServiceImpl)applicationContext.getBean("userServiceImpl");
        User user= userService.findUserByName("yinqianhui");
        System.out.println("用户姓名："+user.getUserName());
        System.out.println("用户密码："+ user.getPassWord());
    }
}
