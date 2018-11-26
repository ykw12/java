package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;

//六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
public class Test04 {
    public static void main(String[] args) {
           ArrayList <String> arr =  new ArrayList<>();
        boolean b = listTest(arr);
        System.out.println(b);

    }
    public static boolean listTest(ArrayList<String> al){
        al.add("s");
        al.add("ssss");
        if(al.isEmpty()){
             return true;
        }else {
            return  false;
        }
    }
}
