package com.yqh.spring.aop_xml.advisor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/15.
 */
@Component
public class DriverHelper {
    private final static Logger logger = LoggerFactory.getLogger(DriverHelper.class);
    public void start(){
        logger.info("启动汽车...");
    }
    public void turnOff(){
        logger.info("关闭汽车...");
    }
}
