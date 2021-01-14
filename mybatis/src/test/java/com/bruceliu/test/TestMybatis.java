package com.bruceliu.test;

import com.bruceliu.bean.User;
import com.bruceliu.mapper.impl.UserMappperImpl;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestMybatis {
    UserMappperImpl um=new UserMappperImpl();

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
    @Test
    public void testAdd() {
        User u=new User("苍老师",new Date(),"女","日本东京");
        int count = um.addUser(u);
        System.out.println(count>0?"新增成功":"新增失败");
    }
}
