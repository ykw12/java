package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;
import java.util.Collection;

/*定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
        并将结果输出在控制台。
（可以使用Object[]数组类型接收转换的数组）*/
public class Test02 {
    public static void main(String[] args) {
        getArr();
    }
    public static void getArr(){
        Collection<Integer> coll = new ArrayList<Integer>();
           coll.add(1);
           coll.add(2);
           coll.add(3);
           coll.add(4);
           coll.add(5);
        for (Integer inter : coll) {
            System.out.println(inter);
            Object[] objects = coll.toArray();
        }

           }
}
