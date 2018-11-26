package cn.itcast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*练习:
//        请使用日期时间相关的API，计算出一个人已经出生了多少天。*/
public class Brithday {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生年月日格式年-月-日:");
        String brithdayprint = scanner.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(brithdayprint);
        long time1 = parse.getTime();
        /**
         *
         */

        Date date =  new Date();
        long time = date.getTime();







    }
}
