package com.bruceliu.test;

import com.bruceliu.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.bruceliu.bean.User;
import com.bruceliu.mapper.UserMappper;
import com.bruceliu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;


public class TestMybatis {
    SqlSession session = null;
    UserMappper um=null;

    //在每次调用测试方法之前，自动调用init()方法
    @Before
    public void init() {
        //MyBatis在底层使用动态代理(反射)自动生成Mapper实现类，不需要人工写实现类！
        session = MyBatisUtils.getSession();
        //um就是Mapper的实现类
        um = session.getMapper(UserMappper.class);
    }

    @Test
    public void testQuery(){
        List<User> list = um.findList();
        for (User user : list) {
            System.out.println(user);
        }
    }

    /*
     * MyBatis增删改 需要手动提交事务
     */
//    @Test
//    public void testAdd() {
//        User u=new User("苍老师",new Date(),"女","日本东京");
//        int count = um.addUser(u);
//        System.out.println(count>0?"新增成功":"新增失败");
//    }

    @Test
    public void testGetById(){
        User user = um.getById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = um.getById(1);
        user.setUsername("小泽妹妹");
        user.setSex("男");
        int count = um.updateUserById(user);
        System.out.println(count>0?"更新成功":"更新失败");
    }

    //每次调用测试方法之前，自动调用一下destory()
    @After
    public void destory(){
        MyBatisUtils.closeSession(session);
    }
}
