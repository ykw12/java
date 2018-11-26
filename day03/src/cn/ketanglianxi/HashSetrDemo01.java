package cn.ketanglianxi;
//      //定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetrDemo01 {
    public static void main(String[] args) {
        HashSet <Person> set = new HashSet<>();
        Person p1 = new Person("周杰伦",23);
        Person p2 = new Person("周杰",29);
        Person p3 = new Person("周润发",27);
        Person p4 = new Person("杨康伟",25);
        Person p5 = new Person("周杰伦",23);


        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);




    }
}
