package cn.itcast.iteracor.cn.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<String>();
        //创建牌面
        ArrayList<String> colors = new ArrayList<String>();
        //创建牌面的花色
        ArrayList<String> number = new ArrayList<String>();
        //创建牌数,2-----10

        //天剑元素分别为牌色和数字
        colors.add("黑桃");
        colors.add("红桃");
        colors.add("方片");
        colors.add("梅花");
        //遍历2---10数字添加到number集合当中去
        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("A");
        number.add("J");
        number.add("Q");
        number.add("K");

        pokerBox.add("大王");
        pokerBox.add("小王");
     //拿出每一个花色然后和数字进行组合,存到牌当中
        for (String color : colors) {//花色
            for (String s : number) {//数字
                String card = color + s;//数字和花色进行组合
                pokerBox.add(card);//组合后放到牌里边
            }

        }
//         洗牌
        Collections.shuffle(pokerBox);
//         发牌

        //创建三个玩家对象,保留底牌

        ArrayList <String>  player1 =new ArrayList<String>();
        ArrayList <String>   player2 =new ArrayList<String>();
        ArrayList <String>   player3 = new ArrayList<String>();
        ArrayList <String>   diPai= new ArrayList<String>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
                if(i>=52){
                    diPai.add(card);
                }else{
                    if(i%3==0){
                        player1.add(card);
                    }else if (i%3==1){
                        player2.add(card);
                    }else{
                        player3.add(card);
                    }

                }


        }

        System.out.println("周润发"+player1);
        System.out.println("周星驰"+player2);
        System.out.println("周杰伦"+player3);
    }


}
