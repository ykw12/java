package cn.ketanglianxi;
//可变参数
//修饰符 返回值 方法名 (数据类型...变量名)
//可变参数用的时候是数据类型确定,参数个数不确定,可变参数底层是数组,
//一个方法列表只能一个可变参数
//如果多个参数(double a,int a,String...a),可变参数必须后边
public class Demo04 {
    public static void main(String[] args) {
        int i = ChangeAdd(10, 20, 20, 30);
        System.out.println(i);
    }
    public static int ChangeAdd(int...a){


        System.out.println(a);
        System.out.println(a.length);


        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
