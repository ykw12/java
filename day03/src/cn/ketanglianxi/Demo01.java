package cn.ketanglianxi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//list集合三大特点:1 有序  2重复   3有索引
public class Demo01 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("aa");
        System.out.println(list);


        list.set(3,"AA");
        System.out.println(list);


        list.remove(3);
        System.out.println(list);

        for (String s : list) {//增强for
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();//首先创建接口
        while(iterator.hasNext()){//迭代器
            String next = iterator.next();
            System.out.println(next);

        }



    }
}
