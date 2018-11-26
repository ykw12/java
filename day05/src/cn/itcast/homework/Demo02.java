package cn.itcast.homework;
//问题：
 //       请使用代码实现
 //       每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
 //       如果老师给学生赋值一个负数,抛出一个自定异常
public class Demo02 {
    public static void main(String[] args) throws NoScoredException {
        Student student = new Student();
         student.setName("周小川");

        student.Setcored(100);

       student.Setcored(-1);



    }
}
