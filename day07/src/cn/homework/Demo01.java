package cn.homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        Runnableiml run =  new Runnableiml();
        e.submit(run);
        e.submit(run);
    }
}
