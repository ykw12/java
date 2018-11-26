package cn.ketanglianxi;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
// 使用迭代器和增强for循环遍历LinkedHashSet。
public class Demo06 {
    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<>();
        Collections.addAll(list,"王昭君","王昭君","西施","杨玉环","貂蝉");

        Iterator<String> it = list.iterator();
            while (it.hasNext()){
                String next = it.next();
                System.out.println(next);
            }
        for (String s : list) {
            System.out.println(s);

        }


    }
}
