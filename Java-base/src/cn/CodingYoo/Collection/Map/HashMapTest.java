package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  2:37 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // HashMap使用练习
        HashMap<String, Integer> hs = new HashMap<>();

        hs.put("吕朋辉", 22);
        hs.put("小王", 21);
        hs.put("小山", 20);

        //entrySet 为hashmap的键值对 对象
        Set<Map.Entry<String, Integer>> entrySet = hs.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            // String key = stringIntegerEntry.getKey();
            // System.out.println(stringIntegerEntry.getValue());
            // System.out.println(stringIntegerEntry.hashCode());
            //System.out.println(key);
            System.out.println(stringIntegerEntry);  //遍历hashmap
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");

        //第二种遍历方式：先获取每一个key，然后再获得值
        Set<String> key = hs.keySet();
        for (String s : key) {
            Integer value = hs.get(s);
            System.out.println(value);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        //第三种遍历方式
        hs.forEach(
                (String key1, Integer value) ->{
                    System.out.println(key1);
                    System.out.println(value);
                }
    );

    }
}
