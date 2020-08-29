package cn.doslphx.demo;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        //switch 转 if
        System.out.println("请选择月份:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 1 && num <= 3) {
            System.out.println("春天");
        } else if (num > 3 && num <= 6) {
            System.out.println("夏天");
        } else if (num >=7 && num <= 9) {
            System.out.println("秋天");
        } else if (num > 10 && num <= 12) {
            System.out.println("冬天");
        } else {
            System.out.println("系统错误！");
        }


    }
}
