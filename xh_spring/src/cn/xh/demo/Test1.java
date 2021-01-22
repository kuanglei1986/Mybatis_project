package cn.xh.demo;

import java.lang.reflect.Constructor;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person();
//        Class c = p.getClass();
//        System.out.println(c);

//        Class c1 = Person.class;
//        System.out.println(c1);

        Class c = Class.forName("cn.xh.demo.Person");
        System.out.println(c);
        Constructor[] con = c.getConstructors();
        Constructor[] con1 = c.getDeclaredConstructors();
        for (Constructor constructor : con1) {
            System.out.println(constructor);

        }
    }

}
