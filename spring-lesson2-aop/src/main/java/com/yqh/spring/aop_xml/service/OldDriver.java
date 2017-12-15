package com.yqh.spring.aop_xml.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/15.
 */
@Service
public class OldDriver {
    private final static Logger logger = LoggerFactory.getLogger(OldDriver.class);
    public void go(){
        logger.info("老司机，出发，猛踩油门....");
    }
    public void back(){
        logger.info("老司机，,正在倒车....");
    }
}
