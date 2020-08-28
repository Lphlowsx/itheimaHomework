package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  3:33 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_01 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("张三");
        treeSet.add("李四");
        treeSet.add("王五");

        Iterator<String> i = treeSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}

