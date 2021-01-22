package cn.xh.Demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Car car = (Car) context.getBean("car");
//        System.out.println(car.toString());
//
//        Person p = (Person) context.getBean("person");
//        System.out.println(p.toString());

        Collections col = (Collections)context.getBean("collections");
        System.out.println(col.toString());
    }
}
