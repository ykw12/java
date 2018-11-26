package cn.itcast.homework;

import java.io.File;

//描述:
//将D盘下a.txt文件删除
//将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
public class Demo05 {
    public static void main(String[] args) {
        File f = new File("d:\\a.txt");
           f.delete();
        File f1 = new File("d:\\");
        f1.delete();

    }
}
