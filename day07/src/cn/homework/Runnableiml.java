package cn.homework;

public class Runnableiml implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行啦");
    }
}
