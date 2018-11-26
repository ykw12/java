package cn.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//描述:在D盘下，有一c.txt 文件中内容为：HelloWorld 
//        在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
//        利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
public class Test03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\c.txt");
        byte[] bytes = "HelloWorld".getBytes();
        fos.write(bytes);
        byte[] bytes1 = "i love java".getBytes();
        for (int i = 0; i <5 ; i++) {
            fos.write(bytes1);
            fos.write("\r\n".getBytes());
        }
       fos.close();


    }
}
