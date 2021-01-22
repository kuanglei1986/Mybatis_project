package cn.zrgk.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 对象输出流 ObjectoutputStream
 * 序列化：把对象转化成一种数据格式存储起来的过程
 */

public class Test1 {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "八戒", "高老庄");
        FileOutputStream fos = new FileOutputStream("f:/student.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        oos.close();
        fos.close();
        System.out.println("写入完毕！");


    }
}
