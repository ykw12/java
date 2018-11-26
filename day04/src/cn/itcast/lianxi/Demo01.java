package cn.itcast.lianxi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//map是一个接口,hashMap 和lingkedHashMap是它的实现类,其中lingkedHashMap  继承了HashMap
//map   的特点 : 1双列集合,一个元素两个值
/*     2: map  key值不允许重复,v 值可以重复,一旦重复新值会替代旧的v值
* */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
         map.put("杨过", "小龙女");
        map.put("黄蓉","郭靖");
        map.put("张丹峰","音表格");
        Set<String> strings = map.keySet();
        for (String string : strings) {
            String s = map.get(strings);


        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();


        }



        // Set<String> set = map.keySet();//通过map集合中keySet方法,把map集合中的key取出来放到set集合中

      //  Iterator<String> it = set.iterator();//使用迭代器遍历set集合,获取每一个key
      //  while (it.hasNext()){
         //   String nex = it.next();
          //  String s = map.get(nex);//使用map.get(),把获取的keyz值传进去,得到每一个v值
            //System.out.println(s);
          //  System.out.println("================");
        }//增强for
       // for(String  nex :map.keySet()){//可以使用 set = map.keySet();
           // String s = map.get(nex);
         //   System.out.println(s);

        }



