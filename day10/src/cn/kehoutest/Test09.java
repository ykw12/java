package cn.kehoutest;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//描述:从键盘录入一行字符串，
//        利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
public class Test09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一行字符串:");
        String next = sc.next();
        PrintStream ps = new PrintStream("day10\\src\\cn\\kehoutest\\d.txt");
        ps.print(next);

    }
}
