package cn.CodingYoo.Stream;
/*
 *  @author:  CodingYoo
 *  date:     8/16/2020  8:17 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class GetStream {
    public static void main(String[] args) {
        //stream流的获取方法： 单列集合，双列集合，数组，同种数据类型的多个数据

        //单列集合
       // method1();

        //双列集合: 不能直接获取stream流对象
        //  先获取 keySet()  或者  entrySet()
       // method2();

        //数组
       // int[] arr = {1,2,34,565,6};
        //Arrays.stream(arr).forEach(s-> System.out.println(s));

        // 同种数据类型的多个数据
        Stream.of("1","2").forEach(s -> System.out.println(s));
    }

    private static void method2() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1","aaa");
        hm.put("2","bbb");
        hm.put("3","ccc");
        //使用流获取key
        hm.keySet().stream().forEach(s -> System.out.println(s));
        //使用流获取 key=value
        hm.entrySet().stream().forEach(Entry -> System.out.println(Entry) );
    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        //使用stream流获取集合元素
        list.stream().forEach(s-> System.out.println(s));
    }
}
