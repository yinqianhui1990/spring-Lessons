package com.yqh.spring.test1.userService.userServiceImpl;

import com.yqh.spring.test1.User;
import com.yqh.spring.test1.UserDao.UserDao;
import com.yqh.spring.test1.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
