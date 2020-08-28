package cn.CodingYoo.Collection.Demo;
/*
 *  @author:  CodingYoo
 *  date:     8/13/2020  3:21 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("吕朋辉");
        list.add("王山心");
        list.add("张三");
        list.add("李四");
        Iterator<String> it = list.iterator();
        //使用迭代器遍历集合中的每一个元素   hasNext() 判断集合中是否有元素  Next()默认指向零索引

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
