package cn.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
//        要求：
//        一次读写一个字节的方式
public class Test06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\ph.PNG");
        FileOutputStream fos = new FileOutputStream("G:\\ph_copy.PNG");
       int temp=0;
        byte [] b = new byte[1024];
        while ((temp=fis.read(b))!=-1){
           fos.write(b,0,temp);
        }
        fos.close();
        fis.close();
    }//先开后关,先关后开
}
