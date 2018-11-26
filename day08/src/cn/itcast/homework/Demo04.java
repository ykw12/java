package cn.itcast.homework;

import java.io.File;
import java.io.IOException;

//描述:在D盘下创建一个名为ccc的文件夹，要求如下：
//1.ccc文件夹中要求包含bbb子文件夹
//2.bbb子文件夹要求包含aaa文件夹
public class Demo04 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\ccc\\bbb\\aaa");
        f.mkdirs();

    }
}
