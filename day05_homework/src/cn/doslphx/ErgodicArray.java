package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  6:10 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        //键盘录入arr.length个数
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            //System.out.println(sum);
        }
        System.out.println(sum);

    }
}

