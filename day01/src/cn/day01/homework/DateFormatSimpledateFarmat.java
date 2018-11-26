package cn.day01.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
public class DateFormatSimpledateFarmat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//定义格式
        Date parse = simpleDateFormat.parse("2018-03-04");//把字符串转为日期格式

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = simpleDateFormat.format(parse);//把日期格式转为字符串
        System.out.println(format);

    }
}
