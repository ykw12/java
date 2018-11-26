package cn.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
* 练习十一：Lambda（省略格式）练习
问题：对Java基础班学生的考试成绩进行排序
1.定义一个学生类，有两个属性。姓名，考试成绩
2.在测试类中定义一个学生数组，存储学生信息。
使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
* */
public class Demo07 {
    public static void main(String[] args) {
        Student []  s =   {new Student("张杰",60),
                           new Student("谢娜",70),
                          new Student("杨康伟",90),
        };
        Arrays.sort(s, ( o1, o2)-> o2.getScord()-o1.getScord());
        for (Student student : s) {
            System.out.println(student);
        }
    }
}
