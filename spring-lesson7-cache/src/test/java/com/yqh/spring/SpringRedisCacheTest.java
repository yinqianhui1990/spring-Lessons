package com.yqh.spring;

import com.yqh.spring.model.User;
import com.yqh.spring.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/1/9.
 */
public class SpringRedisCacheTest extends BaseJunit4Test{
    @Autowired
    private IUserService userServiceImpl;

    @Test
    public void test01() {
        User user = userServiceImpl.getUserByName("yinqianhui");
        System.out.println(user.getName());
        System.out.println(user.getPassWord());
    }
}
