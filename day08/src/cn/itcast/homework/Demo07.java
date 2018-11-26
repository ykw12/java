package cn.itcast.homework;

import java.io.File;

//1.判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
//        2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，
 //       否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)
public class Demo07 {
    public static void main(String[] args) {
         File f = new File("D:\\b.txt");
       if(f.isFile()){
           System.out.println(f.getName()+"是一个文件");
       }else{
           System.out.println(f.getName()+"不是一个文件");
       }
        File f1 = new File("d:\\aaa");
        if(f1.isDirectory()){
            System.out.println(f1.getName()+"是一个文件夹");
        }else{
            System.out.println(f1.getName()+"不是一个文件夹" );
        }
    }
}
