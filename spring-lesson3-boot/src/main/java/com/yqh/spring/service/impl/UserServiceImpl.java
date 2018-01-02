package com.yqh.spring.service.impl;

import com.yqh.spring.dao.UserDao;
import com.yqh.spring.pojo.User;
import com.yqh.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/29.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    public boolean addUser(User user) {
        int res=userDao.addUser(user);
        if (res>0){
            return true;
        }else{
            return false;
        }
    }
}
