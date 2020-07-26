package cn.doslphx.practice;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/*
 *  @author:  CodingYoo
 *  date:     7/26/2020  9:57 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> a = new ArrayList<String>();

        //向集合中添加元素
        a.add("HelloWorld");
        a.add("HelloWorld");
        a.add("HelloWorld");
        System.out.println(a);

        //移除指定元素
        a.remove("HelloWorld");
        System.out.println(a);


    }


}
