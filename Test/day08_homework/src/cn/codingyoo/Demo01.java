package cn.codingyoo;
/*
 *  @author:  CodingYoo
 *  date:     7/27/2020  7:01 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        judgeSwitch(week);
        judgeIf(week);

    }

    /*通过键盘录入的方式输入星期数(1-7的整数)，显示今天的减肥活动，
    使用switch和if两种判断语句分别完成。
            ​周一：跑步
​            周二：游泳
​            周三：慢走
​            周四：动感单车
​            周五：拳击
​            周六：爬山
​            周日：好好吃一顿*/
    public static void judgeSwitch(int week) {

            switch (week) {
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好吃一顿");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入、、、");
                    break;

        }
    }


    public static void judgeIf(int week) {
        if(week >0 && week<2){
            System.out.println("跑步");
        }else if (week >1 && week<3){
            System.out.println("游泳");
        }else if (week >2 && week<4){
            System.out.println("慢走");
        }else if (week >3 && week<5){
            System.out.println("动感单车");
        }else if (week >4 && week<6){
            System.out.println("拳击");
        }else if (week >5 && week<7){
            System.out.println("爬山");
        }else if (week >6 && week<8){
            System.out.println("好好吃一顿");
        }else{
            System.out.println("输入有误！");
        }

    }

}
