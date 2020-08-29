package cn.doslphx.demo;

import java.util.Random;
import java.util.Scanner;

public class GussNumber {
    public static void main(String[] args) {
        System.out.println("欢迎光临猜数字游戏！");
        // 获得随机数
        // System.out.println("请输入您要猜的数字：");
        Random r = new Random();

        //猜1到100之间的数
        int number = r.nextInt(100) + 1;

        while (true){
            //键盘录入
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要猜的数字：");
            int guessNumber = scanner.nextInt();

            //判断数字是否猜对
            if (guessNumber > number){
                System.out.println("您猜的数字大了！");
            }else if (guessNumber < number){
                System.out.println("您猜的数字小了！");
            }else {
                System.out.println("恭喜您猜对了！");
                break;
            }

        }
        System.out.println("感谢参与猜数字游戏！");

    }

}
