package cn.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\b.txt");
        byte[] bytes = "i love java".getBytes();
        fos.write(bytes);
        fos.close();

    }
}
