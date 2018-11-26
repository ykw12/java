package cn.kehoutest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("day10\\src\\cn\\kehoutest\\stu.txt"));
        ArrayList<Person> list = (ArrayList<Person>)oos.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
       oos.close();
    }

    }

