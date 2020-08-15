package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/16/2020  7:40 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VariableElement02 {
    public static void main(String[] args) {
        //创建不可变集合 List Set Map
        List<Integer> i = List.of(1, 23, 45);
        //元素不可重复
        Set<String> a = Set.of("a", "b", "c");

        //Map不能直接使用可变参数
        Map<String, String> mp = Map.ofEntries(
                Map.entry("aaa", "sas"),
                Map.entry("lisi", "sas"));
        System.out.println(mp);
        System.out.println(i);
        /*i.add(123);
        i.set(1,2);   不可变集合不可修改
        */

        //不可变集合可以实现数据的批量添加
        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 23, 45));
        System.out.println(integers);
    }
}
