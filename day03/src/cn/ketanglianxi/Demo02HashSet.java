package cn.ketanglianxi;

import java.util.HashSet;

public class Demo02HashSet {
    public static void main(String[] args) {

//HashSet  需要调用Hashcodeh和equalis
        HashSet  set =  new HashSet();

        Person p1 = new Person("周杰伦",35);
        Person p2 = new Person("周星驰",35);
        Person p3 = new Person("周杰伦",35);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);



    }
}
