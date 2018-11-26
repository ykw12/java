package cn.itcast.homework;

public class MyTheard extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
