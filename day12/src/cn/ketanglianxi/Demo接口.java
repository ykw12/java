package cn.ketanglianxi;

public class Demo接口 {
    public static void main(String[] args) {
          /*show(new Demo函数接口() {
              @Override
              public void method() {
                  System.out.println("随便写吧");
              }
          });*/

        show(()->  System.out.println("随便写吧")
        );
    }
    public static void show(Demo函数接口 d){
        d.method();

    }
}
