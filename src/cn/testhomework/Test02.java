package cn.testhomework;

import java.text.SimpleDateFormat;
import java.util.Date;

//六、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
public class Test02 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy年MM月dd");
        Date date = new Date();
        long time = date.getTime();
        String format = simpleDateFormat.format(time);
        System.out.println(format);


    }
}
