package cn.xh.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("properties.txt"));
        // 获取键所对应的值
        String className = prop.getProperty("className");
//        System.out.println(className);

        // 1，获取Person.class 字节码文件对象
        Class c = Class.forName(className);
        System.out.println(c);
        // 2，获取构造方法
        // public Person(String name, int age, String address)
        Constructor con = c.getConstructor(String.class, Integer.class, String.class);
        // 3,创建对象
        Object obj = con.newInstance("小明", 20, "中国");
        System.out.println(obj);
//       4获取指定的方法
        String methodName = prop.getProperty("methodName");
        System.out.println(methodName);
        Method m = c.getDeclaredMethod(methodName);
        System.out.println(m);
        m.setAccessible(true);
        m.invoke(obj,null);

    }

}
