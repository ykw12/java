package cn.day01.homework;
/*十一、分析以下需求，并用代码实现：
        (1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
        (2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。*/

import java.lang.StringBuilder;

public class StringBuildertest02 {
    public static void main(String[] args) {
        String s = "789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
             for(int j = 0;j<s.length();j++){
                 sb.append(s.charAt(i));
             }
        }

    }
}
