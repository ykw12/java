package cn.ketanglianxi;

import java.util.function.Supplier;

public class Demo04 {
    public static void main(String[] args) {
         int  [] arr ={1,2,3,4,5,6,67,7};
         getMax(new Supplier<Integer>() {//生产数据
             @Override
             public Integer get() {
                 int max = arr[0];
                 for (int i : arr) {
                     if (i>max){
                         max=i;
                     }

                 }
                 System.out.println(max);

                 return max;

             }

         });

    }
    public static int getMax(Supplier<Integer> i){
      return  i.get();
    }
}
