package cn.itcast.lianxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DouDiZhu {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        List<String> color = List.of("♠", "♥", "♦", "♣");
        List<String> number = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K");
        ArrayList<Integer> pokerindex = new ArrayList<>();
        int index = 0;
        poker.put(index, "大王");
        pokerindex.add(index);
        index++;
        poker.put(index, "小王");
        pokerindex.add(index);
        index++;

        for (String colors : color) {
            for (String numbers : number) {
                poker.put(index, colors + numbers);
                pokerindex.add(index);
                index++;
            }
        }
        Collections.shuffle(pokerindex);

        ArrayList<Integer> Play1 = new ArrayList<>();
        ArrayList<Integer> Play2 = new ArrayList<>();
        ArrayList<Integer> Play3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (Integer in : pokerindex) {
            if (in >= 51) {
                dipai.add(in);
            } else if (in % 3 == 0) {
                Play1.add(in);
            } else if (in % 3 == 1) {
                Play2.add(in);
            } else if (in % 3 == 2) {
                Play3.add(in);
            }
        }
        Collections.sort(Play1);
        Collections.sort(Play2);
        Collections.sort(Play3);


        looker("刘德华", poker, Play1);
        looker("周润发", poker, Play2);
        looker("周星驰", poker, Play3);
        looker("底牌", poker, dipai);

    }

    public static void looker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name + ": ");//不换行打印玩家名字

        for (Integer key : list) {//遍历玩家底牌集和
            String value = poker.get(key);//通过对应索引去map集合中对应key,通过key找到对应的牌
            System.out.print(value + " ");
        }
        System.out.println();//打印完每一位玩家的牌换行
    }
}
