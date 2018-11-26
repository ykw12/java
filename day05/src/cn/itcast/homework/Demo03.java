package cn.itcast.homework;
//创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数
public class Demo03 {
    public static void main(String[] args) {
        MyThred myThred = new MyThred();
        myThred.start();

        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println("主线程"+i);
            }
        }


    }
}
