package cn.test;

public class TestRunnableStart {
    public static void main(String[] args) {
        RunnableStart  run = new RunnableStart();
        Thread  t = new Thread(run);
        t.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程循环执行"+Thread.currentThread().getName());
        }
    }
}
