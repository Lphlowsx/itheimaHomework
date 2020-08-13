package cn.CodingYoo.Collection;
/*
 *  @author:  CodingYoo
 *  date:     8/13/2020  4:20 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();
        //创建学生对象
        Student stu01 = new Student("吕朋辉","22","男");
        Student stu02 = new Student("王山心","22","女");
        Student stu03 = new Student("吕辉","22","男");
        //将学生对象存入ArrayList集合中
        list.add(stu01);
        list.add(stu02);
        list.add(stu03);

        //使用迭代器遍历集合元素
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student);
        }
        System.out.println("=========================================");
        //使用增强for遍历集合元素
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
