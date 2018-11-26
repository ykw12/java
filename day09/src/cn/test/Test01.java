package cn.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream  fos = new FileOutputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        fos.write('a');
        fos.close();
    }
}
