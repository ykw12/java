package cn.itcast.homework;

import java.io.File;
import java.io.IOException;

//描述:在D盘下创建一个名为bbb的文件夹。
public class Demo03 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\bbb");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);


    }
}
