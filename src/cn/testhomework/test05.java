package cn.testhomework;
/*九、请使用代码实现
        分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
        计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。*/
public class test05 {
    public static void main(String[] args) {
       String s = "hello";

        long start = System.currentTimeMillis();
        for(int i = 1;i<=100000;i++){
           s+="world";
        }
        long end = System.currentTimeMillis();
        System.out.println("系统1耗时毫秒:"+(end-start));
       System.out.println("++++++++++++++++++++++++++++++++=");
          StringBuilder s1 = new StringBuilder();
        //StringBuilder append = s1.append("hello").append("world");
        long start1 = System.currentTimeMillis();
        for(int i = 1;i<=100000;i++){
            StringBuilder append = s1.append("hello").append("world");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("系统2耗时毫秒:"+(end1-start1));

    }
}
