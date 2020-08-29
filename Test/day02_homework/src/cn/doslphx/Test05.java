package cn.doslphx;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        //键盘录入三个数
        System.out.println("请输入第一个数：");
        Scanner sc = new Scanner(System.in);
        //第一个数
        int a = sc.nextInt();
        //第二个数
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        //第三个数
        System.out.println("请输入第三个数：");
        int c = sc.nextInt();


        if (a > b && a > c) {
            System.out.println("最大的数是：" + a);

        } else if (b > a && b > c) {
            System.out.println("最大的数是：" + b);

        } else {
            System.out.println("最大的数是：" + c);
        }


    }
}
