package com.test.mv.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/29.
 */
@RestController
public class UserAction {
    @RequestMapping("/getTime")
    public String getTime(){
        return new Date().toString();
    }
}
