package cn.CodingYoo.Collection;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  12:19 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.HashSet;

public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        //修改hashSet默认的由地制值计算的hash值，改为由元素确定hash值
        //  重写  hashcode（）和equals()方法即可
        //下面的张三确定为一个人，只存入一次
        Student s1 = new Student("zhangsan","10","n");
        Student s2 = new Student("zhangsan","10","n");
        Student s3 = new Student("zhangsan","12","l");

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
