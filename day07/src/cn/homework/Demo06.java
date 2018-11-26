package cn.homework;
//问题：
  //      给定一个导演 Director接口，
   //     内含唯一的抽象方法makeMovie，且无参数、无返回值，使用lambda表达式在Test中完成调用。
public class Demo06 {
    public static void main(String[] args) {
        inmove(()-> System.out.println("导演拍电影啦"));
    }
     public static void inmove(Director d){
        d.makeMovie();
     }
    }

