package cn.itcast.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoRegisterException {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws RegisterException {

        Collections.addAll(list, "张杰", "谢娜", "张飞", "刘备");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名:");
        String name = sc.next();
        checkname(name);
    }

    public static void checkname(String name) throws RegisterException {
        for (String s : list) {
            if(s.equals(name)){
                throw new RegisterException("注册啦");
            }
        }
        System.out.println("恭喜");
    }
}