package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  7:03 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class JudgeScore {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        //评委打分
        Scanner sc = new Scanner(System.in);
        //键盘录入评委打分：
        for (int i = 0; i < arr.length; i++) {

            System.out.println("请" + (i + 1) + "号评委请打分：");

            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("成绩不合法，请重新输入：");
                i--;
            }
        }

        //评委最高分
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        //评委最低分
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

        //总分

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        //去掉最高分，最低分后的平均分
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println(avg);
    }

}
