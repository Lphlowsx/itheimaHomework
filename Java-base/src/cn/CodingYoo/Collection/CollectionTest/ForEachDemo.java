package cn.CodingYoo.Collection.CollectionTest;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  11:29 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        //增强for： 为了简化迭代器的书写  单列结合可以直接使用迭代器
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        //快捷键 ： List + for
        for(String s : list){
            System.out.println(s);
        }
    }
}
