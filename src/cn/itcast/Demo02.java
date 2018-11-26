package cn.itcast;
/*
Object类equals方法
*
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	(2)
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));


		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	(4)
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2));


		*/

public class Demo02 {
    public static void main(String[] args) {
        String s1 =new String("abc");//地址值
        String s2 = "abc";//字符串常量池
        System.out.println(s1==s2); //地址值  false
        System.out.println(s1.equals(s2));//比较的是内容是否相等
        System.out.println("====================");
        String s3 ="abc";
        String s4 = "abc";
        System.out.println(s3==s4);//true
        System.out.println(s3.equals(s4));//true
        System.out.println("=====================");
        String s5 = "a" + "b" + "c";
        String s6 = "abc";
        System.out.println(s5 == s6);//true
        System.out.println(s5.equals(s6));//true
        System.out.println("=====================");
        String s7 = "ab";//常量
        String s8 = "abc";//常量
        String s9 = s7 + "c";//变量
        System.out.println(s8==s9);//false  s9地址在堆,s7 s8 常量池,地址不一样
        System.out.println(s8.equals(s9));//true
    }

}
