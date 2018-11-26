package cn.itcast.homework;

import java.io.File;
import java.util.Scanner;

//键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
//        如果是文件，则输出文件的大小
//        如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
public class Demop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路劲:");
        String f = sc.nextLine();
        File file = new File(f);
        if (file.isFile()) {
            long length = file.length();
            System.out.println(length);
        }else{
            long length = 0;
            File[] fi = file.listFiles();
            for (File file1 : fi) {
                if(file1.isFile()){
                   length +=file1.length();
                }
            }
            System.out.println(length);
        }


    }
}