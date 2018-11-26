package cn.itcast.lianxi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//计算一个字符串中每个字符出现次数
public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
             if(map.containsKey(c)){//判断map是否包含字符.  true
                 Integer v = map.get(c);//  通过key(c)找到value
                 v++;//记录key出现的次数
                 map.put(c,v);//把key,value放入到map
             }else{
                 map.put(c,1);//不包含就记录1次添加到map里边
             }
        }//再次循环遍历
        Set<Character> s = map.keySet();
        for (Character cha : s) {
            Integer ier = map.get(cha);
            System.out.println(cha+"==="+ier);


        }



    }
}
