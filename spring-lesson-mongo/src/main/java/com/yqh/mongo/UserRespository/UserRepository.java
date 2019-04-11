package com.yqh.mongo.UserRespository;

import com.yqh.mongo.pojo.UserBo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 * 如果继承 MongoRepository 这个接口，则可以使用指定的方法或者指定规则的方法
 * 如果继承 UserRepositoryCustom 这个即可欧，则可以使用UserRepositoryCustom其实现类里面的方法
 */

public interface UserRepository extends MongoRepository<UserBo, String>  , UserRepositoryCustom {
    /*根据实体类中的属性进行查询：
    当需要根据实体类中的属性查询时，MongoRepository提供的方法已经不能满足，
    我们需要在PersonRepository仓库中定义方法，定义方法名的规则为：find + By + 属性名（首字母大写），
    如：根据姓名查询Person*/
    public List<UserBo> findByName(String name);

    //根据实体类中的属性进行模糊查询：
    //模糊查询定义方法名的规则为：find + By + 属性名（首字母大写） + Like
    public List<UserBo> findByNameLike(String name);

   ///带分页的模糊查询，其实是把模糊查询以及分页进行合并，同时我们也需要在PersonRepository仓库中定义方法，
   // 定义方法名的规则和模糊查询的规则一致，只是参数不同而已。
    public Page<UserBo> findUserByNameLike(String name,Pageable pageable);

    /*，同时指定返回的键（数据库中的key,实体类中的属性）：
    解释一下什么是指定返回的键：也就是说当我们进行带分页的模糊查询时，不想返回数据库中的所有字段，只是返回一部分字段。
    例如：只返回Person中的id和name，不返回age.
            若想指定返回的键，我们需要在PersonRepository中添加方法，同时使用注解@Query。
            其中value是查询的条件，？0这个是占位符，对应着方法中参数中的第一个参数，如果对应的是第二个参数则为？1。
            fields是我们指定的返回字段，其中id是自动返回的，不用我们指定，bson中{‘name’:1}的1代表true，也就是代表返回的意思。
            在service中对仓库中的方法的调用：！*/
    @Query(value="{'name': ?0}",fields="{'name' : 1,'address':1}")
    public List<UserBo> findUserByName(String name);
}
