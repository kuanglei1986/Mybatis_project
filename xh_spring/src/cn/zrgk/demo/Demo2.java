package cn.zrgk.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("f:/test.txt");
        byte[] b = new byte[1024];
        int len = fis.read(b);
        while (len != -1) {
            String str = new String(b);
            System.out.println(str);
            len = fis.read();
        }
        fis.close();

    }
}




