package cn.ketanglianxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
public class ListDemo01 {
    public static void main(String[] args) {
        List <String>  list =  new ArrayList<>();
         Collections.addAll(list,"张三","李四","王五","二丫","钱六","孙七");
         list.set(3,"王小丫");
        System.out.println(list);




       /*list.add("张三");
       list.add("李四");
       list.add("王五");
       list.add("二丫");
       list.add("钱");
       list.add("张三");
       */

    }
}
