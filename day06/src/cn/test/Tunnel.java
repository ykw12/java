package cn.test;

public class Tunnel implements Runnable {
   private  int count = 0;//定义一个变量
    @Override
    public void run() {
           cross();
    }
    public synchronized  void cross(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"他是第"+count+"个通过隧道的");
    }
}
