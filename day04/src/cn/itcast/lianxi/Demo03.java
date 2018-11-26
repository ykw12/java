package cn.itcast.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        map.put("大上海",new Person("胡歌",35));
        map.put("石家庄",new Person("赵丽颖",30));
        map.put("大许昌",new Person("杨康伟",25));
        map.put("大许昌",new Person("杨过",25));
        Set<String> set = map.keySet();
        for (String s : set) {
            Person vaule = map.get(s);
            System.out.println(s+"="+vaule);
        }
        
    }
}
