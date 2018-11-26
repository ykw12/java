package cn.testhomework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
public class Test01 {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        long time = date.getTime();
        String format = simpleDateFormat.format(time);
        System.out.println(format);



    }
}
