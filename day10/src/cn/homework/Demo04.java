package cn.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//字符缓冲输入流
public class Demo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10\\src\\cn\\homework\\a.txt"));
        String line ;//String
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
