package cn.itcast.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
              map.put(new Person("杨康伟",25),"河南许昌");
              map.put(new Person("杨过",35),"河南平顶山");
              map.put(new Person("杨幂",35),"河南襄城县");
              map.put(new Person("杨过",35),"河南平顶山");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {

            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"+"+value);



        }


    }
}
