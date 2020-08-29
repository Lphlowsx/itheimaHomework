package cn.CodingYoo;
/*
 *  @author:  CodingYoo
 *  date:     7/30/2020  7:50 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int year = sc.nextInt();

        //调用Worke方法
        Worker wo = new Worker(name,year);

        System.out.println("工人的姓名是：" + wo.getName());
        System.out.println("工人的年龄是：" + wo.getYear());



    }

}
