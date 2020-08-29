package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/29/2020  2:51 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.TreeSet;

public class TreeSet_05 {
    public static void main(String[] args) {
        //红黑树练习（TreeSet自然排序使用红黑树）
        //使用自然排序比较学生成绩
        TreeSet<StudentGrades> stugrades = new TreeSet<>();
        stugrades.add(new StudentGrades(88,56,72,"zhagsan"));
        stugrades.add(new StudentGrades(98,96,77,"lisi"));
        stugrades.add(new StudentGrades(78,86,78,"wangwu"));
        for (StudentGrades stugrade : stugrades) {
            System.out.println(stugrade);
        }
    }
}
