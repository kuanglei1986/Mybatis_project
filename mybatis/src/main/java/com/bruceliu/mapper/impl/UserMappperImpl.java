package com.bruceliu.mapper.impl;

import com.bruceliu.bean.User;
import com.bruceliu.mapper.UserMappper;
import com.bruceliu.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMappperImpl implements UserMappper {

    public List<User> findList() {
        SqlSession session=null;
        InputStream inputStream=null;
        try {
            //配置文件的路径
            String resource = "mybatis-config.xml";
            //加载配置文件，得到一个输入流
            inputStream = Resources.getResourceAsStream(resource);
            //获取MyBatis的Session工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //通过session工厂获取到一个session (此session非Servlet中Session，这个Session表示MyBatis框架和数据库的会话信息)
            //获取到session就表示MyBatis连接上数据库啦！！类似于JDBC中 Connection对象
            session = sqlSessionFactory.openSession();
            //调用session的查询集合方法
            return session.selectList("com.bruceliu.mapper.UserMappper.findList");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                session.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
        return null;
    }

    public int addUser(User user) {
        SqlSession session=null;
        try {
            session=MyBatisUtils.getSession();
            // insert 新增
            int count = session.insert("com.bruceliu.mapper.UserMappper.addUser",user);
            session.commit();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSession(session);
        }
        return 0;


    }
}
