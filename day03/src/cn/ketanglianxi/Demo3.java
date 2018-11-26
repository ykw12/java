package cn.ketanglianxi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
        例如输入：aaaabbbcccddd，打印结果为：abcd。*/
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请的输入一个字符串:");
        String str = scanner.next();



        List<Character> list = new LinkedList<>();
        for(int i = 0;i<str.length();i++){
            if(!list.contains(str.charAt(i))){
                 list.add(str.charAt(i));
            }
        }
        System.out.println(list);
        for (Character c : list) {
            System.out.println(c);

        }
    }
}
