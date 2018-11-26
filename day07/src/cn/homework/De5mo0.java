package cn.homework;

public class De5mo0 {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {
        new De5mo0().method();
    }
    public void method() {
//请在此处插入代码，实现功能for(int i = 1;i++;i<=99){sout()}
        Runnable a= () ->{
                for (int i = 0; i < 99; i++) {
                    System.out.println(i);
                }

        };
        Thread t = new Thread( a );
        t.start();
    }
}
