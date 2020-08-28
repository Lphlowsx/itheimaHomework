package cn.CodingYoo.Collection.List;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  2:58 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_01 {
    public static void main(String[] args) {
        //LinkedList特有方法  void addFirst(E e) 在该列表开头插入指定的元素。
        //void addLast(E e) 将指定的元素追加到此列表的末尾。
//       getFirst() 返回此列表中的第一个元素。
//       E getLast() 返回此列表中的最后一个元素。
//       set(int index, E element) 用指定的元素替换此列表中指定位置的元素。
        //removeFirst()  检索并删除此列表的头（第一个元素）。
        //removeLast()  从此列表中删除并返回第一个元素。

        LinkedList<String> list = new LinkedList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        System.out.println(list);
        /*for (String s : list) {
            System.out.println(s);
        }*/
        //在链表头部添加元素
        list.addFirst("头插");
        System.out.println(list);
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }*/
        //在尾部添加元素
        list.addLast("尾插");
        System.out.println(list);

        // getFirst() 返回此列表中的第一个元素。
        // E getLast() 返回此列表中的最后一个元素。

        String first = list.getFirst();
        String last = list.getLast();
        System.out.println("第一个元素：" + first);
        System.out.println("最后一个元素：" + last);

        //removeFirst()  检索并删除此列表的头（第一个元素）。
        list.removeFirst();
        System.out.println("删除第一个元素后为：" + list);
        //removeLast()  从此列表中删除并返回第一个元素。
        list.removeLast();
        System.out.println("删除第一个元素后为=" + list);
    }
}
