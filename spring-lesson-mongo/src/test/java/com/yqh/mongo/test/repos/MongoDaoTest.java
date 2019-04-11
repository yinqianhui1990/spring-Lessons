package com.yqh.mongo.test.repos;

import com.mongodb.WriteResult;
import com.yqh.mongo.dao.IMongoDao;
import com.yqh.mongo.pojo.UserBo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 * 传统使用方式 直接操作数据库
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/application-context.xml")
public class MongoDaoTest {
    @Resource
    private IMongoDao MongoDaoImpl;

    @Test
    public void test1(){
        UserBo ub=new UserBo();
        ub.setAddress("北京市海淀区");
        ub.setAge(26);
        ub.setName("胡德华");
        MongoDaoImpl.save(ub);
        System.out.println("插入成功！");
    }

    @Test
    public void test2(){
//          Query query = new Query(Criteria.where("name").is("萝卜头"));
        Query query = new Query(Criteria.where("age").lte(26));
        List<UserBo> list = MongoDaoImpl.find(query);
        for (UserBo bu : list) {
            System.out.println(bu.getName()+"的地址："+bu.getAddress());
        }

        UserBo ub = (UserBo) MongoDaoImpl.findOne(query);
        System.out.println(ub.getName());
    }

    @Test
    public void test3(){
        Query query=new Query(Criteria.where("name").is("土豆丁"));
        Update update=new Update();
        update.set("address", "河南郑州市");
        WriteResult writeResult = MongoDaoImpl.update(query, update);
        System.out.println("======"+writeResult.isUpdateOfExisting());
    }

    @Test
    public void test4(){
        List<UserBo> findAll = MongoDaoImpl.findAll("userBo");
        for (UserBo userBo : findAll) {
            System.out.println("姓名："+userBo.getName()+",地址："+userBo.getAddress());
        }
    }

    @Test
    public void test5(){
        Query query=new Query();
        long count = MongoDaoImpl.count(query);
        System.out.println("总条数："+count);
    }

    @Test
    public void test6(){
        Query query=new Query(Criteria.where("name").is("萝卜头"));
        MongoDaoImpl.remove(query);
    }

    public void test7(){
//          MongoDaoImpl.findPage(page, query);
    }
}
