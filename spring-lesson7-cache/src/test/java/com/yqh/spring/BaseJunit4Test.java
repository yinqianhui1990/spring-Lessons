package com.yqh.spring;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:application-context.xml"})//加载spring配置文件
public class BaseJunit4Test {
}
