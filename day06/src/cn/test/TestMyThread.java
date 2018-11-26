package cn.test;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread  myThread = new MyThread();
        myThread.start();
        System.out.println( Thread.currentThread().getName());

    }
}
