package cn.itcast;
/*
* 基本数据类型与字符串之间的转换
*
*
* */
public class Demo03 {
    public static void main(String[] args) {
      //基本数据类型 ---------> 字符串(String)

        int a1 =100;
        String s1 =a1+"";//最简单的拼接
        System.out.println(s1+100);

        String s2 =Integer.toString(100);
        System.out.println(s2+200);//包含静态方法toString

        String s3 = String.valueOf(100);
        System.out.println(s3+300);//string 类静态方法valuef(参数)

        System.out.println("===============");

      //字符串(String)----------->基本数据类型
        int i = Integer.parseInt(s2);
        System.out.println(i-10);



    }


}
