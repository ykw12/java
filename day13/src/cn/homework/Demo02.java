package cn.homework;

import java.util.*;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Spliterator<String> stream2 = set.spliterator();




    }
}
