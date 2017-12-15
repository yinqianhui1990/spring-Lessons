package com.yqh.spring.test1;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User)applicationContext.getBean("user");
        System.out.println("用户姓名："+user.getUserName());
        System.out.println("用户密码："+ user.getPassWord());
    }
}
