package cn.zrgk.demo;

import java.io.FileWriter;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        FileWriter f = new FileWriter("f:/888.txt",true);
        String str="Convenience class for writing character files.";
        f.write(str);
        f.close();
        System.out.println("写入成功！");

    }

}
