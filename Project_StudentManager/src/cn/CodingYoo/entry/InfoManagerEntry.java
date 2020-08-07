package cn.CodingYoo.entry;
/*
 *  @author:  CodingYoo
 *  date:     8/7/2020  9:22 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import cn.CodingYoo.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //搭建主页面
        while (true) {
            System.out.println("---------欢迎来到高校信息管理系统！------------");
            System.out.println("请输入您的选择： 1.学生管理 2.教师管理  3.退出");
            String ch = sc.next();
            switch (ch) {
                case "1":
                    //进入学生管理系统
                    StudentController stu = new StudentController();
                    stu.start();
                    break;
                case "2":
                    //进入教师管理系统
                    break;
                case "3":
                    System.out.println("感谢您的使用！");
                    //退出虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入：");
                    break;
            }

        }
    }

}
