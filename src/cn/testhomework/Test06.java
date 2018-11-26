package cn.testhomework;
/*十一：StringBuilder类的使用
        十一、分析以下需求，并用代码实现：
        (1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
        (2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。*/
public class Test06 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder app = builder.append(789).append(798).append(879 ).append(978 ).append(987 );
        System.out.println(app );
    }
}
