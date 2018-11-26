package cn.kehoutest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\src\\cn\\kehoutest\\e.txt"));
        bos.write("i love java".getBytes());
        bos.close();
    }
}
