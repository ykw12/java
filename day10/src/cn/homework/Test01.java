package cn.homework;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10\\src\\cn\\homework\\d.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\src\\cn\\homework\\d.txt"));
        String line =null;
       // byte [] bytes = new byte[1024];
        while ((line=br.readLine())!=null){
            //bw.write(line);
            //System.out.println(bw.write(line));
        }
        bw.close();
        br.close();
    }
}
