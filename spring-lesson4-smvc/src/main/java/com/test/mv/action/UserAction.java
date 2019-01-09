package com.test.mv.action;

import com.test.mv.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/29.
 */
@Api(description = "用户相关接口")
@RestController
public class UserAction {
    @ApiOperation(value = "获取时间", httpMethod = "GET", notes = "swagger教程",response =String.class )
    @RequestMapping(value = "/getTime" ,method = RequestMethod.GET)
    public String getTime( @ApiParam(required = true, name = "name", value = "用户名")String name){
        System.out.println(name);
        return new Date().toString();
    }
    @ApiOperation(value = "打个招呼", httpMethod = "GET", notes = "swagger教程",response =String.class )
    @RequestMapping(value="/sayHello/{name}" ,method =RequestMethod.GET )
    public String sayHello(@ApiParam(required = true, name = "name", value = "名字") @PathVariable String name){
        return "hello "+name;
    }
    @ApiOperation(value = "获取map", httpMethod = "GET", notes = "swagger教程",response = HashMap.class)
    @RequestMapping(value="/getMap/{name}" ,method =RequestMethod.GET )
    public Map getMap(@ApiParam(required = true, name = "name", value = "名字") @PathVariable String name){
        Map map=new HashMap();
        map.put("name",name);
        return map;
    }

    @ApiOperation(value = "获取user", httpMethod = "GET", notes = "swagger教程",response = User.class)
    @RequestMapping(value="/getUser/{name}" ,method =RequestMethod.GET )
    @ResponseBody
    public User getUser(@ApiParam(required = true, name = "name", value = "名字") @PathVariable String name){
        User user =new User("11",name);
        return user;
    }
}
