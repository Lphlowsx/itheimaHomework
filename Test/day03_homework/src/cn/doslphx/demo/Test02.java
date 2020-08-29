package cn.doslphx.demo;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {


        //case穿透使用
        //请输入一个1~12之间的数字
        System.out.println("请选择月份:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("月份错误！！！");
                break;
        }


    }


}
