package com.yqh.mongo.test.repos;

import com.yqh.mongo.UserRespository.UserRepository;
import com.yqh.mongo.pojo.UserBo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 * 通过接口方式操作数据库
 * 主要业务接口继承 extends MongoRepository<UserBo, String>  这个是jpa提供免写具体查询的方法
 *     , UserRepositoryCustom   这个是自定义查询方法
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/application-context.xml")
@EnableMongoRepositories(basePackages = {"com.yqh.mongo.UserRespository"})
public class UserRepsitoryTest {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void test1() {
        List<UserBo> list =userRepository.findAll();
        for (UserBo bu : list) {
            System.out.println(bu.getName() + "的地址：" + bu.getAddress());
        }
    }
    @Test
    public void test2() {
        List<UserBo> list = userRepository.findByName("尹千慧");
        for (UserBo bu : list) {
            System.out.println(bu.getName() + "的地址：" + bu.getAddress());
        }
    }
    @Test
    public void test3() {
        long count=userRepository.count();
        System.out.println("表中数据有："+count +"条");
    }

    @Test
    public void test4() {
        //测试自定义的方法，即除了MongoRepository 规则提供的方法以外自定义的
       UserBo userBo= userRepository.getUserByAddress("北京市海淀区");
        System.out.println(userBo.getName() + "的地址：" + userBo.getAddress());

    }

    //测试模糊查询
    @Test
    public void test5() {
        List<UserBo> list = userRepository.findByNameLike("华");
        for (UserBo bu : list) {
            System.out.println(bu.getName() + "的地址：" + bu.getAddress());
        }
    }

    //测试模糊分页查询
    @Test
    public void test6() {
        PageRequest pageRequest = new PageRequest(0,2);
      // Page<UserBo> userBoPage = userRepository.findUserByNameLike("华",pageRequest);
        //Page<UserBo> userBoPage = userRepository.findByNameLike("华",pageRequest);
        List<UserBo> list=userRepository.findUserByName("马德华");
                //userBoPage.getContent();
        for (UserBo bu : list) {
            System.out.println(bu.getName() + "的地址：" + bu.getAddress());
        }


    }
}
