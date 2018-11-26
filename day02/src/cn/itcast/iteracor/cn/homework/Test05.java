package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;

//定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 //       要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class Test05 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
             list.add(2);
             list.add(4);
             list.add(5);
             list.add(6);
             int s= 3;
        int i = listTest(list, 3);
        System.out.println(i);

    }
    public static  int listTest(ArrayList<Integer> al, Integer s){
        return   al.indexOf(s);
    }

}
