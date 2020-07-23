package cn.doslphx.practice;

public class MethodOverload {
    public static void main(String[] args) {
        /*方法重载练习
        * 1.多个方法在同一个类中
        * 2.多个方法具有相同的方法名
        * 3.多个方法参数不相同，类型不同，或者数量不同
         */

        //方法调用
         int sum1 = sum(2,3,5);
        System.out.println(sum1);

        int sum2 = sum(3,5);
        System.out.println(sum2);

        double sum3 = sum(2.1,4.5);
        System.out.println(sum3);

        //输出调用
        System.out.println(sum(3,5));
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static int  sum(int a,int b,int c){
        return a+b+c;
    }


}
