package com.yqh.spring.aop;

import com.yqh.spring.aop.service.HavingDinner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppTest
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HavingDinner havingDinner=(HavingDinner)applicationContext.getBean("havingDinner");
        havingDinner.eat();
    }
}
