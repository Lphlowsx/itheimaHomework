package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  7:45 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class JiuJiuMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数：");
        int n = sc.nextInt();
        //调用方法
        method(n);


    }
    //定义方法
    // 请定义一个方法，方法的功能是打印nn乘法表。在主方法中键盘录入取值范围为[1-9]的变量n，测试方法
    public static void method(int n) {
        System.out.println("乘法表：");
        //外层循环n次
        for (int i = 1; i <= n; i++) {
            //内存循环i次
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" +j*i + "\t");
            }
            //每行结尾执行换行
            System.out.println();
        }
    }
}
