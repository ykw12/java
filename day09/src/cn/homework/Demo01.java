package cn.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//
public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException {

       //第一种构造,对象创建
        FileOutputStream fos = new FileOutputStream(new File("a.txt"));

        //第二种,文件名创建流对象
        FileOutputStream  fos1 = new FileOutputStream("a.txt");
    }

}
