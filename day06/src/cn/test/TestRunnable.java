package cn.test;

public class TestRunnable {
    public static void main(String[] args) {
        Runnableiml run = new Runnableiml();
        Thread t = new Thread(run);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
