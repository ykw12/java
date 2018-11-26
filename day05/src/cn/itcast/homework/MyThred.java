package cn.itcast.homework;

public class MyThred extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(!(i%2==0)){
                System.out.println("子线程"+i);
            }
        }
    }
}
