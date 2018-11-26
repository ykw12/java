package cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("huihi",12);
        map.put("huihi",14);
        map.put("hui",12);
        map.put("hi",18);
        Set<Map.Entry<String, Integer>> a = map.entrySet();
        for (Map.Entry<String, Integer> s : a) {
            String key = s.getKey();
            Integer value = s.getValue();
            System.out.println(key+"==="+value);
        }
        Set<String> strings = map.keySet();
        for (String string : strings) {
            Integer value = map.get(string);
            System.out.println(string+value);

        }


    }
}
