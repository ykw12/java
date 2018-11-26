package cn.homework;

import java.util.stream.Stream;

public class Demo06 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("周杰伦","周润发","周星驰","张杰","张三丰");
        Stream<String> stream1 = stream.filter(s -> s.startsWith("周"));

        System.out.println(stream1.count());
    }
}
