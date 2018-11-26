package cn.itcast.homework;

public class Demo03 {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }; new Thread(r).start();
    }
}
