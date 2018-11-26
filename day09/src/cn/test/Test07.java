package cn.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
//        可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
public class Test07 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        Scanner sc = new Scanner(System.in);
        /*while (true) {
            System.out.println("请输入信息:");
            String s = sc.nextLine();
            if ("886".equals(s)) {
                break;
            }
            fw.write(s);
            fw.flush();
        }*/

        String s = "";
        while(!"886".equals(s = sc.next()))
            fw.write(s+"\r\n");
        fw.close();
    }
}
