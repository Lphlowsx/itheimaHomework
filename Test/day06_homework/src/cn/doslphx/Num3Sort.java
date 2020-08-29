package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  7:57 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class Num3Sort {
    public static void main(String[] args) {

        //键盘录入三个数，并按从大到小排序
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数：");
        int c = sc.nextInt();
        method(a,b,c);

    }

    public static void method(int a, int b, int c) {
        //获取最大值

        int max = 0;
        int min = 0;

        //获取最大值
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        //获取最小值
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        int mid = a + b + c - max - min;

        System.out.println(max + " " + mid + " " + min);


    }
}
