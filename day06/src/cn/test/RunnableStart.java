package cn.test;

public class RunnableStart implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程循环执行"+Thread.currentThread().getName());
        }
    }
}
