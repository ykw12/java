package cn.homework;
//二、给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，
  //      如"a": 2,"b": 2,"c" :1, "xxx":0。

import java.util.*;

/*分析:
        1.定义一个listTest方法需要参数(list,String s)
        2.定义一个变量记录次数
        3.遍历集合,判断遍历出来的元素和我们指定的字符串是不是相等(内容相等)
        如果相等,变量++*/
public class test01 {
    public static void main(String[] args) {
       List <String> list  =  new ArrayList<>();//list是一个接口,不能直接new,得使用多态
   list.add("a");
   list.add("a");
   list.add("b");
   list.add("b");
   list.add("c");
   list.add("a");
   list.add("xxx");
        System.out.println("a"+listTest(list,"a"));


    }public static int listTest(List<String> list,String s){
   int count = 0;
        for (String s1 : list) {
            if(s.equals(s1)){
                count++;
            }

        }
            return  count;
    }

}
