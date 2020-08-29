package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/29/2020  9:09 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_04 {
    public static void main(String[] args) {
        //使用比较器排序比较字符串长度
        //使用匿名内部类
        TreeSet<String> treeSet = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int result = o1.length() - o2.length();
                        result = result == 0 ? o1.compareTo(o2) : result;
                        return result;
                    }
                }
        );
        //lambada表达式版
        /*TreeSet<String> treeSet = new TreeSet<>(
                (String o1,String o2)->{
                    int result = o1.length() - o2.length();
                    result = result == 0 ? o1.compareTo(o2) : result;
                    return result;
                }
        );*/

        treeSet.add("aaa");
        treeSet.add("c");
        treeSet.add("fa");
        treeSet.add("afdfa");
        System.out.println(treeSet);

    }
}
