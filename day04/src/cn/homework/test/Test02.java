package cn.homework.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//七、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
 //       并使用keySet和entrySet两种方式遍历Map集合。
public class Test02 {
    public static void main(String[] args) {
        Map <Car,String > map = new HashMap<>();
        map.put(new Car("波斯猫",3500.0),"波斯");
        map.put(new Car("加菲猫",5500.0),"美国");
        map.put(new Car("狸猫",1200.0),"中国");

        Set<Car> cars = map.keySet();
        for (Car car : cars) {
            String value = map.get(car);
            System.out.println(car+"+++++++++>"+value);
        }
        System.out.println("<<<<<<<<<>>>>>>>>>>>>");
        Set<Map.Entry<Car, String>> entries = map.entrySet();
        for (Map.Entry<Car, String> ent : entries) {
            Car key = ent.getKey();
            String value = ent.getValue();
            System.out.println(key+"========>"+value);

        }


    }
}
