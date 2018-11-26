public class StringBuilderAppend {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("world").append("hello");

        }
        long end = System.currentTimeMillis();
          long s = end - start;
        System.out.println(s);


    }
}
