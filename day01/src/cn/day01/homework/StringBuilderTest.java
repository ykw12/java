package cn.day01.homework;

import java.lang.StringBuilder;
import java.util.Objects;

/*十、分析以下需求，并用代码实现：
        (1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
           (2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
         第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
        (3)如：010 是对称的，3223 是对称的，123123 不是对称的；
        (4)最终打印该数组中对称字符串的个数。
        注：判断对称可用reverse(),将此字符序列用其反转形式取代。*/
public class StringBuilderTest {
    public static void main(String[] args) {
        String[] arr = {"010", "3223", "666", "7890987", "123123"};
        setGet(arr);
    }
    public static void setGet(String[] str) {
        int count = 0;
        for (String s : str) {//遍历数组的每个元素,用增强for
            StringBuilder string = new StringBuilder(s);//创建StringBuilder对象,进行调用reverse()
            if (string.reverse().toString().equals(s)) {
                count++;
                System.out.println(s+"是对称的");
            }else {
                System.out.println(s+"不是对称的");
            }



        }
    }
}
