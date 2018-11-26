package cn.homework;

//给定一个计算器 Calculator 接口，内含抽象方法 calc (减法)，
 //       其功能是可以将两个数字进行相减，并返回差值。使用Lambda表达式在Test中完成调用。
//在下面的代码中，请分别使用Lambda的标准格式及省略格式调用 invokeCalc 方法，完成130和120的相减计算：
public class DemoCalator {
    public static void main(String[] args) {
                      get(2, 1,( a,  b)-> a-b);

    }
    public static void get(int a1,int b1,Calator c){
          int s = c.cala(a1,b1);
        System.out.println(s);
    }
}
