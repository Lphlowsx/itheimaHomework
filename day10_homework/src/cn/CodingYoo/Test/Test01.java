package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     7/31/2020  3:00 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import cn.CodingYoo.pojo.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===========欢迎来到学生管理系统==============");
            System.out.println("1.添加学生");
            System.out.println("2.修改信息");
            System.out.println("3.删除学生");
            System.out.println("4.查看信息");
            System.out.println("5.退出系统！");
            System.out.println("请输入学生信息：");
            String s = sc.next();
            switch (s) {
                case "1":
                    // System.out.println("添加学生");
                    add(list);
                    break;
                case "2":
                    //System.out.println("修改信息");
                    update(list);
                    break;
                case "3":
                    //System.out.println("删除学生");
                    delete(list);
                    break;
                case "4":
                    // System.out.println("查看信息");
                    find(list);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    System.exit(-1);
                default:
                    System.out.println("错误输入...");
                    break;

            }
        }

    }

    //添加学生
    public static void add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        // 1. 给出录入的提示信息

        String sid;

        while (true) {
            System.out.println("请输入学号:");
            sid = sc.next();

            int index = getIndex(list, sid);

            if (index == -1) {
                // sid不存在, 学号可以使用
                break;
            }
        }

        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        // 2. 将键盘录入的信息封装为学生对象
        Student stu = new Student(sid, name, age, birthday);
        // 3. 将封装好的学生对象, 添加到集合容器当中
        list.add(stu);
        // 4. 给出添加成功的提示信息
        System.out.println("添加成功!");

    }

    //修改学生
    public static void update(ArrayList<Student> list) {
        // 1. 给出提示信息 (请输入您要修改的学号)
        System.out.println("请输入您要修改的学生学号:");
        // 2. 键盘接收要删除的学号
        Scanner sc = new Scanner(System.in);
        String update = sc.next();
        // 3. 调用getIndex方法, 查找该学号在集合中出现的索引位置
        int index = getIndex(list, update);
        // 4. 根据索引判断, 学号在集合中是否存在
        if (index == -1) {
            // 不存在: 给出提示
            System.out.println("查无信息, 请重新输入");
        } else {
            System.out.println("请输入你要修改的学生姓名：");
            String name = sc.next();
            System.out.println("请输入你要修改的学生年龄：");
            String age = sc.next();
            System.out.println("请输入你要修改的学生生日：");
            String birthday = sc.next();

            Student stu = new Student(name, age, birthday);
            list.add(stu);
            System.out.println("学生信息已更新！");

        }

    }

    //判断
    public static int getIndex(ArrayList<Student> list, String sid) {
        // 1. 假设传入的学号, 在集合中不存在
        int index = -1;
        // 2. 遍历集合, 获取每一个学生对象, 准备进行查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 3. 获取每一个学生对象的学号
            String id = stu.getSid();
            // 4. 使用获取出的学生学号, 和传入的学号(查找的学号)进行比对
            if (id.equals(sid)) {
                // 存在: 让index变量记录正确的索引位置
                index = i;
            }
        }

        return index;
    }

    //查看学生
    public static void find(ArrayList<Student> list) {
        // 1. 判断集合中是否存在数据, 如果不存在直接给出提示
        if (list.size() == 0) {
            System.out.println("无信息, 请添加后重新查询");
            return;
        }
        // 2. 存在: 展示表头数据
        System.out.println("学号\t姓名\t年龄\t生日");
        // 3. 遍历集合, 获取每一个学生对象的信息, 打印在控制台
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getBirthday());
        }
    }


    //删除学生
    public static void delete(ArrayList<Student> list) {
        // 1. 给出提示信息 (请输入您要删除的学号)
        System.out.println("请输入您要删除的学生学号:");
        // 2. 键盘接收要删除的学号
        Scanner sc = new Scanner(System.in);
        String update = sc.next();
        // 3. 调用getIndex方法, 查找该学号在集合中出现的索引位置
        int index = getIndex(list, update);
        // 4. 根据索引判断, 学号在集合中是否存在
        if (index == -1) {
            // 不存在: 给出提示
            System.out.println("查无信息, 请重新输入");
        } else {
            // 存在:删除
            list.remove(index);
            System.out.println("删除成功!");

        }


    }

}