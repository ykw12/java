package cn.homework;

import java.util.ArrayList;

//定义一个方法listTest(ArrayList<String> al, String s),
//要求使用contains()方法判断al集合里面是否包含s。
//Al调用contains方法(s)
public class Test04 {
    public static void main(String[] args) {
      ArrayList<String>  al   =  new ArrayList<>();
        al.add("s");
        boolean b = listTest(al,"s");
        System.out.println(b);
    }

   

    public static boolean  listTest(ArrayList<String> al, String s){
        if(al.contains(s)){
            return  true;
        }else{
            return  false;
        }
    }
}
