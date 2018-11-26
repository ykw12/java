package cn.itcast.lianxi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//entry对象遍历map:
// 1:使用map集合中方法entry方法,把集合中多个entry对象取出来,存储到set集合
//2:遍历集,获取entry对象
//3调用entry对象中的getkey()和getValue(),h获取Key值和Value值

public class Demo02 {
    public static void main(String[] args) {
        Map <String,String> map = new HashMap<>();//注意双列集合,数据类型当然是双列
        map.put("杨康","穆念慈");
        map.put("杨过","小龙女");
        map.put("郭靖","黄蓉");
        map.put("张无忌","小昭");

        Set<Map.Entry<String, String>> entrt = map.entrySet();//使用map集合中的entrySet(),把map集合放到set集合
        Iterator<Map.Entry<String, String>> it = entrt.iterator();


        while (it.hasNext()){
            Map.Entry<String, String> key = it.next();
            String key1 = key.getKey();
            String value = key.getValue();
            System.out.println(key1+"="+value);
        }

    }
}
