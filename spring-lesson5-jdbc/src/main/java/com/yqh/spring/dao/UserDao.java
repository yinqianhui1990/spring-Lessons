package com.yqh.spring.dao;

import com.yqh.spring.pojo.User;

import java.util.List;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2018/1/2.
 */
public interface UserDao {
   /**
     * @Author: yinqianhui
     * @Description:
     * @param:

     * @Date Created by 14:19 on 2018/1/2.
     */
    public int addUser(User user);

    public User getUserByName(String name);

    public List<User> getUserList();

    public User getUserByNameOtherDataBase(String name);

}
