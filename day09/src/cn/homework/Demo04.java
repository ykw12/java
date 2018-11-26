package cn.homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        byte[] bytes = "abcde".getBytes();
       fos.write(bytes,2,3);
        fos.close();

    }
}
