package cn.ketanglianxi;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03 {
    public static void main(String[] args) {
           String [] arr ={"afs","gff","hugft","aftysvu"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparter());
        System.out.println(Arrays.toString(arr));
    }

    public static Comparator<String>  getComparter(){
        return ( o1, o2)->  o1.length()-o2.length()

        ;
    }
}
