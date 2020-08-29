package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  7:28 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class Rectangle {
    //通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号
      int Rect(int n,int m){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        n = sc.nextInt();
        System.out.println("请输入列数：");
        m = sc.nextInt();

          System.out.println("您的图形为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }

      return n;

    }
}
