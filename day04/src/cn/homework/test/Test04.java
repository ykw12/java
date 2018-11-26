package cn.homework.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
* 九、有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
* 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
* 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
* 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
* */
public class Test04 {
    public static void main(String[] args) {
        String [] arr1 = {"黑龙江","浙江","江西","广东","福建"};
        String [] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> map = new LinkedHashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            String k = arr1[i];
            String v = arr2[i];
            map.put(k,v);

        }
        System.out.println(map);


    }
}
