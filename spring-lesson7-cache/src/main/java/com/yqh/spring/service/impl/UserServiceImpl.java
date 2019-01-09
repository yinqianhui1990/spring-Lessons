package com.yqh.spring.service.impl;

import com.yqh.spring.model.User;
import com.yqh.spring.service.IUserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/1/9.
 */
@Service

public class UserServiceImpl implements IUserService {

    /**
     * @Author: yinqianhui
     * @Description: 首先会去缓存查询，没有才会真的去数据库查询
     * @param:
       * @param null
     * @Date Created by 20:38 on 2019/1/9.
     */
    @Cacheable(value = "lesson_user",key = "#root.methodName+':'+#name")
    public User getUserByName(String name) {
        System.out.println(name);
        //模拟数据库查询
        return new User(name,"123456");
    }
}
