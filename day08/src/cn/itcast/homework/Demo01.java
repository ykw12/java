package cn.itcast.homework;

import java.io.File;

//:创建两个文件对象，分别使用相对路径和绝对路径创建。
public class Demo01 {
    public static void main(String[] args) {
        File f1 = new File("G:\\");
        System.out.println(f1.getAbsolutePath());
        File f2 = new File("\\a");
        System.out.println(f2.getAbsolutePath());

    }
}
