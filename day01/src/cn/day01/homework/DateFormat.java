package cn.day01.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串
public class DateFormat {
    public static void main(String[] args) {
        Date date =  new Date();
        long NowTime = date.getTime();//获取当前时间的毫秒值

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//定义格式
        String format = simpleDateFormat.format(NowTime);//把当前的时间转换为字符串
        System.out.println(format);

    }
}
