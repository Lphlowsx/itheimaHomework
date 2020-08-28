package cn.CodingYoo.Collection.CollectionTest;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  10:30 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMath {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //判断元素是否添加成功
        boolean eg1 = list.add("eg1");
        System.out.println(eg1);
        //向集合中添加元素
        list.add("eg2");
        list.add("eg3");
        list.add("eg4");
        System.out.println(list);
        //判断集合是否包含元素
        boolean eg2 = list.contains("eg2");
        System.out.println(eg2);
        //清空集合元素
        //list.clear();
        boolean e3 = "eg3".equals(list);
        System.out.println(false);

        int i = list.hashCode();
        System.out.println(i);
        //判断集合是否为空
        boolean b = list.isEmpty();
        System.out.println(b);

        Iterator<String> iterator = list.iterator();
        boolean b1 = iterator.hasNext();
        iterator.next();  //指向第0号元素，依次迭代
        System.out.println(b1);
        //System.out.println(iterator);
        //iiterator,使用迭代器遍历结合
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        //size()  返回此集合中的元素数。

        int size = list.size();
        System.out.println(size);
//        //使用size()遍历结合
//        for (int i1 = 0; i1 < list.size(); i1++) {
//            System.out.println(i1);
//        }

        //移除集合中的元素
        System.out.println("移除前" + list);
        list.remove("eg1");
        System.out.println("移除后" + list);


    }
}
