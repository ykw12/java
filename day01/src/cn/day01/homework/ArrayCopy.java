package cn.day01.homework;
//八、现有一个字符数组{'i','t','c','a','s','a'}，
// 请使用System类中的arraycopy()方法在控制台输出“itcast”。
// （提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
public class ArrayCopy {
    public static void main(String[] args) {
        char[] aaa ={'i', 't', 'c', 'a', 's', 'a'};
        System.arraycopy(aaa,1,aaa,5,1);
        System.out.println(aaa);

    }
}
