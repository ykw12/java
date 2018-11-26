package cn.homework;

import java.util.ArrayList;
import java.util.List;

//四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 //       并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
public class Test03 {
    public static void main(String[] args) {
        ArrayList <Integer>  list =  new ArrayList<>();
        list.add(23);
        list.add(3);
        Object[] objects = list.toArray();//转成元素相同的数组.可以用toArray();
        System.out.println(objects);

        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
