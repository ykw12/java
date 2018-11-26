package cn.itcast.homework;

import java.io.File;
import java.io.IOException;

//描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a.txt");
        boolean file = f1.isFile();
        System.out.println(file);
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);



    }
}
