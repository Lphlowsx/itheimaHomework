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

    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        lo:
        while (true) {
            System.out.println("---------欢迎来到学生管理系统！------------");
            System.out.println("请输入您的选择： 1.添加学生 2.删除学生  3.修改学生  4.查看学生  5.退出");
            String ch = sc.next();
            switch (ch) {
                case "1":
                    //添加
                    addStudent();
                    break;
                case "2":
                    //删除
                    deleteStudentById();
                    break;
                case "3":
                    //修改
                    updateStudent();
                    break;
                case "4":
                    //查看
                    findAllStudent();
                    break;
                case "5":
                    //退出学生管理系统
                    System.out.println("感谢使用学生管理系统！");
                    break lo;
                default:
                    System.out.println("输入有误，请重新输入：");
            }
        }
    }

    //查看学生信息
    private void findAllStudent() {
        //调用service中的获取方法，得到学生对象数组
        Student[] stu = studentService.findAllStudent();
        if (stu == null) {
            System.out.println("查无信息，请添加后重试！");
            return;
        }
        //遍历数组，打印数组元素
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stu.length; i++) {
            Student student = stu[i];
            if (student != null) {
                System.out.println(student.getId() + "\t\t\t" + student.getName() + "\t" + student.getAge() + "\t\t" + student.getBirthday());
            }
        }
    }

    //修改学生信息
    public void updateStudent() {
        String updateId;

        while (true) {
            System.out.println("请输入您要修改的学生id：");
            updateId = sc.next();
            boolean exists = studentService.isExists(updateId);
            if (!exists) {
                System.out.println("您输入的Id不存在，请重新输入：");
            } else {
                break;
            }

            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生年龄:");
            String age = sc.next();
            System.out.println("请输入学生生日:");
            String birthday = sc.next();

            Student newStu = new Student();
            newStu.setName(name);
            newStu.setAge(age);
            newStu.setBirthday(birthday);
            StudentService.updateStudent(updateId,newStu);
            System.out.println("修改成功！");
        }
    }

    //删除学生信息
    public void deleteStudentById() {
        Student[] stu = studentService.findAllStudent();
        if (stu == null) {
            System.out.println("查无信息，请添加后重试！");
            return;
        }
        String delId;
        while (true) {
            System.out.println("请输入您要删除的学生id：");
            delId = sc.next();
            boolean exists = studentService.isExists(delId);
            if (!exists) {
                System.out.println("您输入的Id不存在，请重新输入：");
            } else {
                break;
            }

            studentService.deleteStudentById(delId);
            System.out.println("删除成功！");
        }
    }

    //添加学生
    public void addStudent() {
        //键盘录入学生对象
        String id;
        while (true) {
            System.out.println("请输入学生id:");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已存在，请重新输入：");
            } else {
                break;
            }
        }
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

        boolean result = studentService.addStudent(stu);

        if (result) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }

    }


}
