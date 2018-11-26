package cn.homework;

import java.util.stream.Stream;

public class Demo07 {
    public static void main(String[] args) {
        Stream<String> st = Stream.of("周杰伦","周润发","周星驰","张杰","张三丰");
        Stream<String> limit = st.limit(3);
        Stream<String> skip = st.skip(2);
      st.forEach(s -> s.startsWith("周"));

    }
}
