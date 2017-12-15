package com.yqh.spring.test1.UserDao;

import com.yqh.spring.test1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/14.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    User user;
    public User findUserByName(String userName) {
        return user;
    }
}
