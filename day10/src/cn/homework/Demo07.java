package cn.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("day10\\src\\cn\\homework\\c.txt"));
      oos.writeObject(new Person("周杰伦",19));
        oos.close();
    }
}
