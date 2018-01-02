package com.yqh.spring.dao.impl;

import com.yqh.spring.dao.UserDao;
import com.yqh.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2018/1/2.
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * @param user
     * @Author: yinqianhui
     * @Description:
     * @param:
     * @Date Created by 14:19 on 2018/1/2.
     */
    public int addUser(User user) {
        return 0;
    }

    public User getUserByName(String name) {
        return jdbcTemplate.queryForObject("select * from com_user where name= ? ", new Object[]{"管理员"}, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return new User(resultSet.getString("name"),resultSet.getString("password"));
            }
        });
    }

    public List<User> getUserList() {
        String sql="select * from com_user";
       List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        List<User> userList=new ArrayList<User>();
        for(Map map:list){
            User user=new User(map.get("name").toString(),map.get("password").toString());
            userList.add(user);
        }
        return userList;
    }
}
