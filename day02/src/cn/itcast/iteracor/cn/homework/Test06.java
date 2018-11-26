package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;
import java.util.Iterator;

//九、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
 //       A：遍历集合遍历输出。
  //      B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
public class Test06 {
    public static void main(String[] args) {


        Student s = new Student("张三", 15, "男");
        Student s1 = new Student("李四", 17, "男");
        Student s2 = new Student("小红", 19, "女");
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s);
        arrayList.add(s1);
        arrayList.add(s2);

        Iterator<Student> it = arrayList.iterator();
        int a = 0;
        if (it.hasNext()) {
            a = it.next().getAge();
        }
        for (Student student : arrayList) {
            if (student.getAge() > a) {
                a = student.getAge();
            }
        }

        for (Student student : arrayList) {
            if (student.getAge() == a) {
                student.setName("小猪佩奇");
            }


            System.out.println(s.getName());
            System.out.println(s1.getName());
            System.out.println(s2.getName());


        /*for (Student student : arrayList) {
            System.out.println(s);
        }
        Iterator<Student> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);*/

        }


    }
}



