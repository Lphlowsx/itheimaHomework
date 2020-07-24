package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  8:14 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class Demo03 {

    public static void main(String[] args) {

        /*创建一个长度为6的整数数组。请编写代码，
        随机生成六个0-100之间的整数存放到数组中，然后再计算出数组中元素的和并打印。*/

        //键盘录入
        Scanner sc = new Scanner(System.in);
        //动态初始化一个长度为6的数组，并获取键盘录入的值
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入：");
            int temp = sc.nextInt();
            if (temp >= 0 && temp <= 100) {
                arr[i] = temp;
            } else {
                System.out.println("输入有误，请重新输入！");
                i--;
            }
        }

        //计算数组中的元素值，并打印输出
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组中元素的和为："+ sum);
        System.out.println();

    }

}

