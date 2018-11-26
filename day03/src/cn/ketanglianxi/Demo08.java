package cn.ketanglianxi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*十、已知数组存放一批QQ号码，QQ号码最长为11位
，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
        将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
        将list中所有元素分别用迭代器和增强for循环打印出来。*/
public class Demo08 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        List <String>  list =  new LinkedList<>();
        for(int i = 0;i <strs.length;i++){
                if(!list.contains(strs[i])){//如果空集合不包含字符元素
                    list.add(strs[i]);
                }
            }
        System.out.println(list);


    }
}
