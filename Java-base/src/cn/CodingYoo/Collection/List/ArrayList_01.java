package cn.CodingYoo.Collection.List;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  2:19 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
