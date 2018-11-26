package cn.homework;

public class DemoCook {
    public static void main(String[] args) {
        getFood(() -> System.out.println("buidcfblsirhgfnergdpvb"));

    }
public static void getFood(Cook c){
        c.makeFood();
}
}
