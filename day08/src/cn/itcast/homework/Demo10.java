package cn.itcast.homework;

import java.io.File;
import java.util.Scanner;

//键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
//要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
//提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入文件夹路径:");
        String s = sc.nextLine();
        File f = new File(s);
        File[] files = f.listFiles();
        for (File file : files) {
            file.delete();
        }
        System.out.println(f.delete());
    }
}
