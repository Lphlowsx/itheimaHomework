package cn.CodingYoo.Collection.Demo;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  10:45 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    //HashSet小练习
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("hello");
        hs.add("lph");
        hs.add("java");
        hs.add("java");
        hs.add("java");
        hs.add("java");

        for (String h : hs) {
            System.out.println(h);
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        Iterator<String> s = hs.iterator();
        while (s.hasNext()){
            String s1 = s.next();
            System.out.println(s1);
        }
    }
}
