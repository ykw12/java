package cn.day01.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//计算一个人已经出生了多少天
public class BrithdayDate {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生年月日:");
        Scanner scanner = new Scanner(System.in);
        String brithday = scanner.next();

        Date date =new Date ();
        long time = date.getTime();//获取时间远点的毫秒值

        SimpleDateFormat simpleDateFormat  =  new SimpleDateFormat("yyyy-MM-dd");//创建日期格式
        Date parse = simpleDateFormat.parse(brithday);//用parse把出生日期转换为日期格式
        long time1 = parse.getTime();//把出声日期格式转换为毫秒值;

          long s =  time - time1;
        System.out.println(s/24/60/60/1000);




    }
}
