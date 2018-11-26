package cn.itcast.homework;

public class Imp implements  Runnable  {
    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
