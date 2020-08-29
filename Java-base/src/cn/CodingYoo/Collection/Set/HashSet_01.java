package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/29/2020  3:23 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_01 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("d");
        //使用迭代器
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=========================");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
