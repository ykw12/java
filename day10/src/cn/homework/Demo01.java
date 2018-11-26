package cn.homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream  fos =new FileOutputStream("day10\\src\\cn\\homework\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        fos.write("我把数据写进缓冲留啦".getBytes());
        fos.close();
    }
}
