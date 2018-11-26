package cn.homework.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("周杰伦","中国台北");
        map.put("许嵩","安徽合肥");
        map.put("杨康伟","河南许昌");
        map.put("胡歌","中国上海");

        String p1 = map.get("周杰伦");
        String p2= map.get("许嵩");
        String p3 = map.get("杨康伟");
        String p4 = map.get("胡歌");

        Set<String> s = map.keySet();
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String key = it.next();
            String s1 = map.get(key);
            System.out.println(s1+"==>"+key);
            System.out.println("++++++++++++++");

            for (String s2 : s) {
                String s3 = map.get(s2);
                System.out.println(s2+"++>"+s3);

            }

        }



    }
}
