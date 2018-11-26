package cn.homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt",true);
        byte[] bytes = {97,98,99,100,101};
        for (int i = 0; i <10 ; i++) {
            fos.write(bytes);
            fos.write("\r\n".getBytes());
        }
        fos.close();

    }
}
