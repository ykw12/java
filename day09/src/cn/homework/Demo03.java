package cn.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\fos.txt");
        byte[] bytes = "黑马程序员".getBytes();
        fos.write(bytes);
        fos.close();

    }
}
