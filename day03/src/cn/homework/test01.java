package cn.homework;

import java.util.ArrayList;
import java.util.Collections;

//ArrayList集合中有如下内容： {33,11,77,55}，
   //     使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果
public class test01 {
    public static void main(String[] args) {
        ArrayList <Integer>  list = new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        Collections.sort(list);
        for (Integer in : list) {
            System.out.println(in);
        }

    }
}
