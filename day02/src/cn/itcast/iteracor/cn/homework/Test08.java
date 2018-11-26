package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("jscgi");
        list2.add("chuesh");

         mothod(list1);
         mothod(list2);


    }

    public static void mothod(ArrayList<?> list) {
        Iterator<?> it = list.iterator();//创建迭代器
          while (it.hasNext()){
              Object o = it.next();
              System.out.println(o);
          }




    }


}
