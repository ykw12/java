package cn.homework.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* 十、定义一个泛型为String类型的List集合，
* 统计该集合中每个字符（注意，不是字符串）出现的次数。
* 例如：集合中有”abc”、”bcd”两个元素，
* 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
* */
public class Test05 {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("abc");
        list.add("bad");
        HashMap<Character,Integer> map = new HashMap<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ar = chars[i];
                if(map.containsKey(ar)){
                    Integer in = map.get(ar);
                    in++;
                    map.put(ar,in);
                }else{
                    map.put(ar,1);
                }
            }
        }
        System.out.println(map);
    }
}
