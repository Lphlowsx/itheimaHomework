package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  3:48 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.TreeSet;

public class TreeSet_02 {
    public static void main(String[] args) {

        //TreeSet添加自定义对象，需要实现Comparable接口，并重写compareTo方法
        TreeSet<Student> stu = new TreeSet<>();
        Student student1 = new Student("a",22);
        Student student2 = new Student("b",23);
        Student student3 = new Student("c",24);

        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        for (Student student : stu) {
            System.out.println(student);
        }
    }
}
