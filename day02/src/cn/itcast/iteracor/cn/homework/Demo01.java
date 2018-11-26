package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;

//定义一个方法，功能是接收两个整数，并计算两数和，把结果返回
//。在main方法中调用该方法，并在控制台打印求和的结果。
//传入一个int数组,把数组中的偶数存入另一个集合中,并返回.
public class Demo01 {
    public static void main(String[] args) {
               int [] aaa =  {12,23,43,4,5,5,56,6,6};
        ArrayList<Integer> shuZhu = getShuZhu(aaa);
        System.out.println(shuZhu);
    }
    public static ArrayList<Integer> getShuZhu(int [] arr){
           ArrayList <Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
            if(arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        return  list;
    }
}
