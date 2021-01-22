package cn.zrgk.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("f:/student.bin");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s=(Student) ois.readObject(); //读取一个对象

        System.out.println(s.getId()+"--"+s.getName()+"--"+s.getAddress());

        ois.close();
        fis.close();
    }
}
