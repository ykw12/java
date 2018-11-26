package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;
import java.util.Collection;

//三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
public class test01 {
    public static void main(String[] args) {
       int [] arr ={1,2,3,4,5,6,7,8};
        ArrayList<Integer> ar = getArraylist(arr);
        System.out.println(ar);
    }

    public static  ArrayList<Integer> getArraylist(int [] arr){
        Collection<Integer> coll = new ArrayList<Integer>();
        for (int i : arr) {
            System.out.println(i);
            coll.add(i);
        }
           return (ArrayList<Integer>) coll;
        }

}