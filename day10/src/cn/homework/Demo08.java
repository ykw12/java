package cn.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\src\\cn\\homework\\c.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);

    }
}
