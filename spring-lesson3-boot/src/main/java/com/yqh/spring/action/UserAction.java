package com.yqh.spring.action;

import com.yqh.spring.pojo.User;
import com.yqh.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/28.
 */
@RestController
@RequestMapping("/spboot")
public class UserAction {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/now")
    public String now(){
        return new Date().toString();
    }

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello "+name;
    }

    /*http://localhost:8080/spboot/addUser/1/yin*/
    @RequestMapping("/addUser/{id}/{name}")
    public String addUser(@PathVariable String id,@PathVariable String name){
      boolean res= userServiceImpl.addUser(new User(name,id));
        if(res){
            return "添加成功！";
        }else {
            return "添加失败";
        }
    }

    @RequestMapping("/index")
    public ModelAndView test(){
        return new ModelAndView("index");
    }

}
