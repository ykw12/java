package cn.itcast.iteracor.cn.homework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
//、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
public class Test07 {
    public static void main(String[] args) {
       int [] arr = new int[10];
        Random random = new Random();
        Collection <Integer> coll =  new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
             arr[i] = random.nextInt(100)+1;
            System.out.println(arr[i]);
            if(arr[i]>=10){
                coll.add(arr[i]);
            }

        }
        System.out.println(coll);



    }
}
