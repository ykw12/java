package cn.homework;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Demo02 {
    public static void main(String[] args) {
             new Thread(()-> {
                     for (int i = 0; i <10 ; i++) {
                         System.out.println("wobnihiih");
                         try {
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
             }).start();
    }
}