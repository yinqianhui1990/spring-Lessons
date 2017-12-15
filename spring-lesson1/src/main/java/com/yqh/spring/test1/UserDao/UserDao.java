package com.yqh.spring.test1.UserDao;

import com.yqh.spring.test1.User;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
public interface UserDao {
    public User findUserByName(String userName);
}
