package cn.kehoutest;

import cn.kehoutest.Person;

import java.io.*;
import java.util.ArrayList;

/*描述:定义一个学生类，包含姓名，年龄，性别等成员变量，
        提供setters和getters方法以及构造方法。在测试类中创建一个学生对象，
        给学生对象的三个成员变量赋值。
        然后将该对象保存到当前项目根目录下的stu.txt文件中。*/
public class Test07 {
    public static void main(String[] args) throws IOException {
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\src\\cn\\kehoutest\\stu.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\src\\cn\\kehoutest\\stu.txt"));
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张杰",34,"男"));
        list.add(new Person("张杰",34,"男"));
        list.add(new Person("张杰",34,"男"));

        oos.writeObject(list);
        oos.close();


    }
}
