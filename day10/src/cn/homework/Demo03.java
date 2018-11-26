package cn.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\src\\cn\\homework\\a.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("黑马程序员");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
