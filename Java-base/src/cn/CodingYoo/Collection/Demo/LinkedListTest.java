package cn.CodingYoo.Collection.Demo;
/*
 *  @author:  CodingYoo
 *  date:     8/13/2020  8:05 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("张三");
        list.add("李四");
        list.add("123");

        //普通遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("========================");

        //使用迭代器
        Iterator<String> i = list.iterator();
        while (i.hasNext()){
            String next = i.next();
            System.out.println(next);
        }
        System.out.println("========================");

        //增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}
