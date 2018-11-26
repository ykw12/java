package cn.test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
        请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其值为"100"
        score.txt文件内容如下：
        zhangsan = 90
        lisi = 80
        wangwu = 85*/
public class Test08 {//操作中文字符流,操作其他字节流
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        Properties ps = new Properties();
        ps.setProperty("zhangsan","90");
        ps.setProperty("lisi","80");
        ps.setProperty("wangwu","80");
       ps.store(fw,"");

        Set<String> strings = ps.stringPropertyNames();
        for (String key : strings) {
            String value = ps.getProperty(key);
           if(key.equals("lisi")){
               ps.setProperty("lisi","100");
           }
        }
        ps.store(fw,"");
        //FileReader fr = new FileReader("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt");
        ps.load(new FileInputStream("D:\\developer\\java32di2jieduan\\day09\\src\\cn\\a.txt"));
        Set<String> strings1 = ps.stringPropertyNames();
        for (String s : strings1) {
            String v = ps.getProperty(s);
            System.out.println(s+"--"+v);


        }

    }
}
