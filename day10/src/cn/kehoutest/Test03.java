package cn.kehoutest;

import java.io.*;

//描述:利用高效字节输入流和高效字节输出流完成文件的复制。
//        要求：
//        1.将C盘下的c.png文件复制到D盘下
//        2.一次读写一个字节数组方式复制
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream  bis = new BufferedInputStream(new FileInputStream("G:\\ph.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\ph.copy.png"));
        int len =0;
        byte [] b = new byte[1024];
        while ((len=bis.read(b))!=-1){
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
    }
}
