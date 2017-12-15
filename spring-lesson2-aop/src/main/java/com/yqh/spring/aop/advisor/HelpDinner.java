package com.yqh.spring.aop.advisor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/15.
 */
@Aspect
@Component
public class HelpDinner {
    private final static Logger logger = LoggerFactory.getLogger(HelpDinner.class);
    @Pointcut("execution(public * com.yqh.spring.aop.service..*.eat(..))")
    public void aspect(){};
    @Before("aspect()")
    public void beforeDinner() {
        logger.info("做饭，洗手，摆桌子....");
    }
    @After("aspect()")
    public void afterDinner() {
        logger.info("洗碗，打扫，收拾桌子....");
    }
}
