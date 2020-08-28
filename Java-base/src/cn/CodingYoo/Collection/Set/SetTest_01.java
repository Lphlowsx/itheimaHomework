package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  3:37 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Set;
import java.util.TreeSet;

public class SetTest_01 {
    public static void main(String[] args) {
        //set集合的特点：
        //1.可以去除重复
        //2.可以排序
        //3.不能通过索引获取元素，故不能使用普通for

        Set<String> set = new TreeSet<>();
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
