package cn.day01.homework;
//分别使用String的 += 和StringBuilder的append方法对字符串做100000次拼接，
 //  计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印
public class StringBuilder {

    public static void main(String[] args) {
        String s1 ="hello";
        long start = System.currentTimeMillis();//获取系统运行前的开始毫秒时间值
        for (int i = 0; i < 100000; i++) {
            s1 += "world";
        }
        long end = System.currentTimeMillis();

    long s = end - start;
        System.out.println(s);


    }
}
