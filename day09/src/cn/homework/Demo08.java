package cn.homework;

import java.io.FileWriter;
import java.io.IOException;

public class Demo08 {
    public static void main(String[] args) throws IOException {
        FileWriter  fw = new FileWriter("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt",true);
       fw.write("黑暗");
       fw.write("\r\n");
       fw.write("即将到来");
        fw.close();
    }
}
