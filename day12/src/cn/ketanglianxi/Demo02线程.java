package cn.ketanglianxi;

public class Demo02线程 {
    public static void main(String[] args) {
                     startThread(()-> System.out.println("我好饿")
                     );
    }
    public static  void startThread(Runnable r){
        new Thread(r).start();
    }
}
