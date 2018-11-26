package cn.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        //int read = fis.read();
        //System.out.println((char) read);
         int temp =0;
         byte [] b = new byte[2];
         while ((temp=fis.read(b))!=-1){
             System.out.println(new String(b,0,temp));
         }
        fis.close();


    }
}
