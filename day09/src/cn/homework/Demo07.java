package cn.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        FileReader  fr = new FileReader("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        int temp=0;
        char [] c = new char[3];
        while ((temp=fr.read(c))!=-1){
            System.out.println( new String(c,0,temp));
        }
        fr.close();
    }
}
