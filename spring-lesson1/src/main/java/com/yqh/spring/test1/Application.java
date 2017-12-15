package com.yqh.spring.test1;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.yqh.spring.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
public class Application {
    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User)applicationContext.getBean("user");
        logger.info("用户姓名：{}" , user.getUserName());
        logger.info("用户密码：{}", user.getPassWord());
    }
}
