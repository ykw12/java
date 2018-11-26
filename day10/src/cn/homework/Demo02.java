package cn.homework;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream  fis = new FileInputStream("day10\\src\\cn\\homework\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
       /* int temp=0;
        while ((temp=fis.read())!=-1){
            System.out.println(temp);
        }*/
       byte [] bytes = new byte[1024];
       int temp=0;
       while ((temp=fis.read(bytes))!=-1){
           System.out.println(new String(bytes,0,temp));

       }
        bis.close();
    }
}
