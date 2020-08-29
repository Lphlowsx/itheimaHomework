package cn.doslphx.homework;

import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {

        //switch
                /*周一：跑步
                周二：游泳
                周三：慢走
                周四：动感单车
                周五：拳击
                周六：爬山
                周日：好好吃一顿
                * */
        //键盘录入周几？
        System.out.println("请输入周几：");
        Scanner sc = new Scanner(System.in);
        int weeks = sc.nextInt();

        switch (weeks ){
            case 1:
                System.out.println("跑步！");
                break;
            case 2:
                System.out.println("游泳！");
                break;
            case 3:
                System.out.println("慢走！");
                break;
            case 4:
                System.out.println("动感单车！");
                break;
            case 5:
                System.out.println("拳击！");
                break;
            case 6:
                System.out.println("爬山！");
                break;
            case 7:
                System.out.println("好好吃一顿！");
                break;
            default:
                System.out.println("输入错误！");

        }



    }

}
