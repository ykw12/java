package cn.kehoutest;

import java.io.*;

//描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\src\\cn\\kehoutest\\e.txt"));
        bw.write("传智学院");
        bw.write("传智播客");
        bw.newLine();
        bw.write("黑马程序员");
        bw.close();
    }
}
