package com.yqh.spring.test1.userService;

import com.yqh.spring.test1.User;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
public interface UserService {
    public User findUserByName(String name);
}
