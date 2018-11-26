package cn.itcast.homework;

public class Demo02 {
    public static void main(String[] args) {
        Imp m = new Imp();//实现类对象
        Thread t = new Thread(m);
        t.start();
        for (int i = 0;i < 60; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
