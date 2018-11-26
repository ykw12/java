package cn.itcast.homework;

import java.io.File;

//获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
//注意：不包含子文件夹下的文件
public class Demo08 {
    public static void main(String[] args) {
        File f  = new File("D:\\aaa");
        String[] list = f.list();
        for (String s : list) {//获取的是文件夹下的子文件
            System.out.println(s);
        }/*b.txt
c.txt
ggg
        */
        System.out.println("++++++++++++++++++++++++++++");
        File[] files = f.listFiles();/*D:\aaa\b.txt
D:\aaa\c.txt
D:\aaa\ggg
*/
        for (File file : files) {//
            System.out.println(file);
        }

    }
}
