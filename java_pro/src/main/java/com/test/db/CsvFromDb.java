package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CsvFromDb {
    public static void main(String[] args) {
        try {
            //找数据库连接工具 mysql
            Connection conn = null;
            Statement statement=null;

            //连接数据库
			conn = DriverManager.getConnection
			("jdbc:mysql://106.52.26.197:3306/test?characterEncoding=utf8&useSSL=false", "root", "1234");
            //准备sql
            String  sql= "select * from employee";
            //创建执行sql对象
            statement = conn.createStatement();
            //执行sql, 获取返回结果集合
            ResultSet set=statement.executeQuery(sql);

            while(set.next()) {
                String name =set.getString("e_name");
                System.out.println(name);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
