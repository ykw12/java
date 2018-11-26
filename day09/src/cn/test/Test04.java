package cn.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
//,使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
public class Test04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        int temp = 0;
        while ((temp = fis.read()) != -1) {
            System.out.println(temp);
        }
        fis.close();
    }
}