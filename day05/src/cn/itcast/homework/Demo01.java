package cn.itcast.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

        try {
            Date date = format.parse("2018-04-03");
            System.out.println("程序正常");

        } catch (ParseException e) {
            System.out.println("程序异常");
        }
    }
}
