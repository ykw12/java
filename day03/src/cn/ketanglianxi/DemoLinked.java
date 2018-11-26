package cn.ketanglianxi;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

//键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，
// 必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd
public class DemoLinked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();

        char[] chars = str.toCharArray();
        LinkedHashSet <Character> set =  new LinkedHashSet<>();


        for (char a : chars) {
               set.add(a);
        }

        for (Character c : set) {

            System.out.println(c);

        }

    }
}
