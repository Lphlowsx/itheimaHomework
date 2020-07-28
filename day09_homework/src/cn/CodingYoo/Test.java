package cn.CodingYoo;
/*
 *  @author:  CodingYoo
 *  date:     7/28/2020  10:36 AM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("吕朋辉");
        stu.setAge(20);
        stu.getSex("男");

        System.out.println(stu.getName());
        stu.getAge();
        stu.getSex();

        stu.Learnning();
    }
}
