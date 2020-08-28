package cn.CodingYoo.Collection.Demo;
/*
 *  @author:  CodingYoo
 *  date:     8/13/2020  4:11 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */



//集合的三种遍历方式使用场景：
//1.若需操作索引，使用普通for
//2.若在遍历过程中删除元素，请使用迭代器
//3.若仅仅遍历集合，使用增强for
import java.util.ArrayList;

public class BigFor {
    //使用增强for遍历集合
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
