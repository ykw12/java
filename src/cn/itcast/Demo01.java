package cn.itcast;
//
//    练习:
//        请使用日期时间相关的API，计算出一个人已经出生了多少天。
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;
/*
* .使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前的日期,转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒差值转换为天(s/1000/60/60/24)
 */
public class Demo01 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("请输入您的出生年月日,格式:yyyy-MM-dd:");
        String birthdayDateString = scanner.next();
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date brithday = simpleDateFormat.parse(birthdayDateString);
        long time1 = brithday.getTime();
        Date date = new Date();
        long time = date.getTime();
        long l = time - time1;
        System.out.println(l/1000/24/60/60);


    }
}
