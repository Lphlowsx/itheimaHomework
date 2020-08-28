package cn.CodingYoo.Collection.CollectionTest;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  10:14 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        //集合和数组的对比
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>();

        list.add("吕朋辉");
        list.add("张三");
        list.add("李四");
        System.out.println(list);

    }
}
