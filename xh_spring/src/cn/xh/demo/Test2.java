package cn.xh.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        Class c = Class.forName("cn.xh.demo.Person");
        Constructor con = c.getConstructor(String.class);
        Object obj = con.newInstance("郭靖");
        System.out.println(obj.toString());

        //4，获取指定的成员变量
        //public String name;
        Field nameField = c.getField("name");
        //public int age;
        Field ageField = c.getField("age");
        //private String address;
        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true); //取消 Java 语言访问检查

        //赋值
        ageField.set(obj, 23);
        addressField.set(obj, "凯利广场");

        System.out.println("------------------------");
        System.out.println("name = "+ nameField.get(obj));
        System.out.println("age = "+ ageField.get(obj));
        System.out.println("address = "+ addressField.get(obj));
    }
}
