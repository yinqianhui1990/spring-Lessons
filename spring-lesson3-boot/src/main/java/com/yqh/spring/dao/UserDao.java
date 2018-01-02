package com.yqh.spring.dao;

import com.yqh.spring.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/29.
 */
@Repository
public class UserDao {
    private final static Logger logger = LoggerFactory.getLogger(UserDao.class);
    public int addUser(User user){
        Random random=new Random();
        int rs=random.nextInt();
        logger.info("res:{}",rs);
        return  rs%2;
    }
}
