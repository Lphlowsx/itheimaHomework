package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  2:49 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 分析一下需求，并用代码实现

1. 定义一个Student类，属性有姓名（String类型），语文考试成绩（int类型），
* 数学成绩（int），生成对应的set/get方法以及空参，满参构造,show方法（
* 例如：张三的语文成绩是100分，数学成绩是80分，总分是180分。）
2. 创建好三个对象,讲对象存入ArrayList\<Student>中，在集合中
* 查找总分大于160分的学生，存入新集合，最后输出新集合
 */

import cn.CodingYoo.pojo.Student;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 78, 98);
        Student stu1 = new Student("张三", 88, 88);
        Student stu2 = new Student("张三", 58, 68);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
      //  System.out.println(list);

        //打印集合中大于160的元素
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu0 = list.get(i);
            if (stu0.getShuxue() + stu0.getYuwen() >= 160) {
                students.add(stu0);
            }
        }
        System.out.println(students);
    }

}
