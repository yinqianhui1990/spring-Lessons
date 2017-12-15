package com.yqh.spring.aop_xml;

import com.yqh.spring.aop_xml.service.OldDriver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/15.
 */
public class AppTest2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-aop_schem.xml");
        OldDriver oldDriver=(OldDriver)applicationContext.getBean("oldDriver");
        oldDriver.go();
        oldDriver.back();
    }
}
