package cn.CodingYoo.Collection.Demo;
/*
 *  @author:  CodingYoo
 *  date:     8/13/2020  3:53 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest2 {
    public static void main(String[] args) {
        //迭代器删除指定元素
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

       /* //原始方法删除元素
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.equals("b")){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);*/

        //使用迭代器删除指定元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
