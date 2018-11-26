package cn.ketanglianxi;

import java.util.LinkedList;

/*(要求练习LinkedList方法：
   （1）基本方法：add, set, get, remove, clear, size等方法；
        （2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst,
        removeLast, push, pop, clear等方法。*/
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("周星驰");
        list.add("周杰");
        list.addFirst("周杰伦");
         list.addLast("周润发");
       list.push("杨康伟");
        list.pop();

        System.out.println(list);

    }
}