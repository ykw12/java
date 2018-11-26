
package cn.day01.homework;

import java.lang.StringBuilder;

/*十一、分析以下需求，并用代码实现：
        (1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
        (2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。*/
public class StringBuildertest01 {
    public static void main(String[] args) {
        String s = "789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < s.length(); i1++) {
                sb.append(s.charAt(i1));
            }
            if(i != 2)
                sb.append(" ");

            s = s.substring(1).concat(s.substring(0,1));
        }
        System.out.println(sb.toString() + " " + sb.reverse().toString());

    }
}
