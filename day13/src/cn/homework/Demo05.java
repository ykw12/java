package cn.homework;

import java.util.stream.Stream;

public class Demo05 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("10", "30", "90", "10");
        Stream<Integer> s1 = s.map(str -> Integer.parseInt(str));
    }
}
