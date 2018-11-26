package cn.homework.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

//十一、利用Map，完成下面的功能：
 //       从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
// 如果该年没有举办世界杯，则输出：没有举办世界杯。
//tips:参阅Map接口containsKey(Object key)方法 
public class Test06 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        String year = sc.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

    }
}
