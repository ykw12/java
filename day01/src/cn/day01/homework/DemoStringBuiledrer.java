package cn.day01.homework;

import java.lang.StringBuilder;

/*十、分析以下需求，并用代码实现：
        (1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
           (2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
         第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
        (3)如：010 是对称的，3223 是对称的，123123 不是对称的；
        (4)最终打印该数组中对称字符串的个数。
        注：判断对称可用reverse(),将此字符序列用其反转形式取代。*/
public class DemoStringBuiledrer {
    public static void main(String[] args) {
        String [] arr = {"010","3223","666","7890987","123123"};
           mothed(arr);
    }
    public static  void mothed(String [] str){
          int count  = 0;
        for (String sab : str) {//增强for(数据类型   变量名   数组/集合 )
            StringBuilder string  =   new StringBuilder(sab);//创建字符串缓冲区,把遍历的字符串数组传进StringBuilder();
            if(string.reverse().toString().equals(sab)){
                   count++;
                System.out.println(sab+"是对称的");
            }else{
                System.out.println(sab+"不是对称的");
            }

        }

    }
}
