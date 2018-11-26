package cn.kehoutest;

import java.io.*;

//描述:利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
  //      要求：不能出现乱码的情况。
public class Test06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\src\\cn\\kehoutest\\a.txt"),"gbk");
        int len =0;
        while ((len=isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }
}
