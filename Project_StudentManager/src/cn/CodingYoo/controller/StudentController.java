package cn.CodingYoo.controller;
/*
 *  @author:  CodingYoo
 *  date:     8/7/2020  9:22 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import cn.CodingYoo.pojo.Student;
import cn.CodingYoo.service.StudentService;

import java.util.Scanner;

public class StudentController {

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------欢迎来到学生管理系统！------------");
            System.out.println("请输入您的选择： 1.添加学生 2.删除学生  3.修改学生  4.查看学生  5.退出");
            String ch = sc.next();
            lo:
            switch (ch) {
                case "1":
                    //添加
                    addStudent();
                    break;
                case "2":
                    //删除
                    break;
                case "3":
                    //修改
                    break;
                case "4":
                    //查看
                    break;
                case "5":
                    //退出学生管理系统
                    System.out.println("感谢使用学生管理系统！");
                    break lo;
            }
        }
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id:");
        String id = sc.next();
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        String age = sc.next();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();
        //将学生信息封装为对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        //将学生对象，传递给StudentService中的addStudent方法
        StudentService studentService = new StudentService();
       boolean result = studentService.addStudent(stu);

       if(result){
           System.out.println("添加成功！");
       }else {
           System.out.println("添加失败！");
       }

    }




}
