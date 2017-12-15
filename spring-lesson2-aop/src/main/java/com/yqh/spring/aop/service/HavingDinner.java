package com.yqh.spring.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/15.
 */
@Service(value = "havingDinner")
public class HavingDinner {
    private final static Logger logger = LoggerFactory.getLogger(HavingDinner.class);
    public void eat(){
        logger.info("吃晚饭中...");
    }
}
