package cn.homework;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张杰");
        list.add("张无忌");
        list.add("三丰");
        list.add("翠山");
        list.add("张三");
        list.add("张扛扛");

        list.stream()
                .filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(System.out::println);
    }
}
