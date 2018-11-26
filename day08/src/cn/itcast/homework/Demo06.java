package cn.itcast.homework;

import java.io.File;

//获取D盘aaa文件夹中b.txt文件的文件名，
// 文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
public class Demo06 {
    public static void main(String[] args) {
        File f =new File("d:\\aaaa\\b.txt");
        String name = f.getName();//获取文件名b.txt
        System.out.println(name);
        String path = f.getAbsolutePath();//d:\aaaa\b.txt
        System.out.println(path);
        long length = f.length();//0
        System.out.println(length);
        String parent = f.getParent();//d:\aaaa
        System.out.println(parent);
        File parentFile = f.getParentFile();//d:\aaaa
        System.out.println(parentFile);



    }
}
