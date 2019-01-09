package com.yqh.spring.dao.impl;

import com.yqh.spring.dao.UserDao;
import com.yqh.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2018/1/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoImplTest {
    private final static Logger logger = LoggerFactory.getLogger(UserDaoImplTest.class);
    @Autowired
    private UserDao userDaoImpl;
    @Test
    public void testGetUserByName() throws Exception {
        User user= userDaoImpl.getUserByName("管理员");
        if (user!=null){
            logger.info(user.getUserName());
            logger.info((user.getPassWord()));
        }
    }
    @Test
    public void testAddUser() throws Exception {

    }
    @Test
    public void testGetUserList() throws Exception
    {
        List<User> list=userDaoImpl.getUserList();
        for(User user:list){
            logger.info(user.getUserName());
            logger.info((user.getPassWord()));
        }
    }

    @Test
    public void testGetUserByNameTest() throws Exception {
        User user= userDaoImpl.getUserByNameOtherDataBase("");
        if (user!=null){
            logger.info(user.getUserName());
            logger.info((user.getPassWord()));
        }
    }
}