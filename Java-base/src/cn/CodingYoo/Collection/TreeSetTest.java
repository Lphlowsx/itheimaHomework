package cn.CodingYoo.Collection;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  10:05 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.TreeSet;

public class TreeSetTest<S> {
    //TreeSet的简单使用
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s = new Student("kk", "13", "男");
        Student s1 = new Student("mm", "19", "女");
        Student s2 = new Student("ll", "15", "男");

        ts.add(s1);
        ts.add(s2);
        ts.add(s);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
