package cn.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Demo03 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Stream<String> stream = map.keySet().stream();
        Stream<String> stream1 = map.values().stream();
        Stream<Map.Entry<String, String>> stream2 = map.entrySet().stream();



    }
}
