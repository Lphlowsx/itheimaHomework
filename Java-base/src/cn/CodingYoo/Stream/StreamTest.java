package cn.CodingYoo.Stream;
/*
 *  @author:  CodingYoo
 *  date:     8/16/2020  8:00 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张飞", "张小强", "刘丰", "王三丰", "赵三丰"));

        //过滤张开头的名字
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }
        System.out.println(list1);

        //过滤三个字的名字
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }
        System.out.println(list2);

        //使用stream流
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s ->
                        System.out.println(s)
                );


    }

}
