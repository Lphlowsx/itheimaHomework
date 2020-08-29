package cn.doslphx.demo;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        //产生0~9之间的一个随机数
        int i = 1;
        while (i <= 10) {
            Random random = new Random();
            int num = random.nextInt(10);//产生的是0到9
            System.out.println("打印一个随机数：" + num);
            i++;
        }

    }
}
