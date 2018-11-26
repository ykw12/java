package cn.itcast.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*九、利用Map，完成下面的功能：
        从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
        如果该 年没有举办世界杯，则输出：没有举办世界杯。
        //tips:参阅Map接口containsKey(Object key)方法 

        十、在原有世界杯Map 的基础上，增加如下功能： 
        读入一支球队的名字，输出该球队夺冠的年份列表。 
        例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 
        读入“荷兰”，应当输出 没有获得过世界杯 
//tips:参阅Map接口containsValue(Object value)方法*/
public class Demo06 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1930, "乌拉圭");
        m.put(1934, "意大利");
        m.put(1938, "意大利");
        m.put(1950, "乌拉圭");
        m.put(1954, "西德");
        m.put(1958, "巴西");
        m.put(1962, "巴西");
        m.put(1966, "英格兰");
        m.put(1970, "巴西");
        m.put(1974, "西德");
        m.put(1978, "阿根廷");
        m.put(1982, "意大利");
        m.put(1986, "阿根廷");
        m.put(1990, "西德");
        m.put(1994, "巴西");
        m.put(1998, "法国");
        m.put(2002, "巴西");
        m.put(2006, "意大利");
        m.put(2010, "西班牙");
        m.put(2014, "德国");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int i = sc.nextInt();

        if (m.containsKey(i)) {
            System.out.println(i + "年世界杯是" + m.get(i));
        } else {
            System.out.println("没有举办世界杯");
        }//读入一支球队的名字，输出该球队夺冠的年份列表。 
        //  例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 
        //
        //  读入“荷兰”，应当输出 没有获得过世界杯
        System.out.println("请输入一个国家名称");
        Scanner g = new Scanner(System.in);
        String val = g.next();

        if (m.containsValue(val)) {
            for (Integer year : m.keySet()) {
                if (m.get(year).equals(val)) {
                    System.out.println(year + "、\n");
                }
            }
        } else {
            System.out.println("该国家没有获得世界杯冠军");
        }
    }


}