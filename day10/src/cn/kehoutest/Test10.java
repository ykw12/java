package cn.kehoutest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
        定义一个测试类，在测试类创建多个学生对象保存到集合中，
        然后将集合存储到当前项目根目录下的stus.txt文件中。
*/
public class Test10 {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("zhangjie",35,"nan"));
        list.add(new Person("zhangjie",35,"nan"));
        list.add(new Person("zhangjie",35,"nan"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\src\\cn\\kehoutest\\stus.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
