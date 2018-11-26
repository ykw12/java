package cn.itcast.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
 //       要求:当一个人物的生命值为负数的时候需要抛出自定的异常
public class Demo04 {
     static Map <String,Integer> map = new HashMap<>();
    public static void main(String[] args) throws ShengMingZhiException {
      map.put("后羿",80);
      map.put("小乔",60);
      map.put("关羽",90);
      map.put("张飞",90);
      map.put("嬴政",-1);
        System.out.println(map);

        Set<String> strings = map.keySet();
        for (String str : strings) {
            Integer value = map.get(str);
            if(value<0){
                throw new ShengMingZhiException("生命值不能为负数");
            }

        }

    }
}
