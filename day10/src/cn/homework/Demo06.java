package cn.homework;

import java.io.*;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\src\\cn\\homework\\a.txt"),"GBK");
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("day10\\src\\cn\\homework\\b.txt"),"UTF-8");
        int len =0;
        while ((len=isr.read())!=-1){
            osr.write(len);
        }
        osr.close();
        isr.close();
    }
}
