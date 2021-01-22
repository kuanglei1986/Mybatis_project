package cn.zrgk.demo;

import java.io.FileOutputStream;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("f:/5555.txt",true);
        String str="这是最后的一节课！！！abc";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
