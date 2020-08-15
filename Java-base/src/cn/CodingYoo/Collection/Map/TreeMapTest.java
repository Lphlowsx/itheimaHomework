package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  5:15 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.TreeMap;

public class TreeMapTest {
    //TreeMap小练习
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("c", "123");
        tm.put("b", "223");
        tm.put("a", "143");

        tm.forEach(
                (String key, String value) -> {
                    System.out.println(key + "=" + value);
                }
        );
    }
}
