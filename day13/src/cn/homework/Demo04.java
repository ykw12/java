package cn.homework;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo04 {
    public static void main(String[] args) {
        String [] arr = {"张翠山","张三丰","张我急","杨康伟","czb"};
        Stream<String> stream = Stream.of(arr);
       //
        Stream<String> stream1 = stream.filter(name -> name.startsWith("杨"));
        //stream.forEach(name-> System.out.println(name));

    }
}
