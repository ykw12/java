package cn.homework;

import java.util.ArrayList;
//自定义方法三要素:方法名  返回值   参数列表
//三、定义一个方法，
 //       要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()
public class Test02 {
    public static void main(String[] args) {
 int [] arr ={1,21,2,33,43,4,4,5,5,55,5,};
        ArrayList<Integer> get = getlist(arr);
        System.out.println(get);

    }
    public  static ArrayList<Integer> getlist(int [] arr){//参数列表里传进去一个数组
           ArrayList <Integer>    list  =  new ArrayList<>();//定义一个集合
        for (int i : arr) {//对数组进行操作处理,遍历数组,把数组元素放到集合里,返回集合
            list.add(i);
        }
         return list;
    }
}
