package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  5:31 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest02 {
    //自定义对象，1.自然排序:需要实现Comparable接口，
    // 2.或者使用比较器排序：在创建对象时，传入比较器的实现类对象
    public static void main(String[] args) {
       TreeMap<Teacher,String> tm= new TreeMap<>(new Comparator<Teacher>() {
           @Override
           public int compare(Teacher o1, Teacher o2) {
               //比较年龄
               int result = o1.getAge() - o2.getAge();
               //若年龄相同，比较名字
               result = (result == 0) ? o1.getName().compareTo(o2.getName()) : result;
               return result;
           }
       });

        Teacher t1 = new Teacher(20,"zhangsan");
        Teacher t2 = new Teacher(12,"wangwu");
        Teacher t5 = new Teacher(12,"angwu");
        Teacher t3 = new Teacher(26,"haoliu");
        Teacher t6 = new Teacher(26,"1aoliu");

        tm.put(t1,"河南");
        tm.put(t2,"北京");
        tm.put(t3,"上海");
        tm.put(t5,"驻马店");
        tm.put(t6,"安徽");

        //遍历TreeMap集合
        tm.forEach(
                (Teacher teacher,String address)->{
                    System.out.println(teacher +"="+ address);
                }
        );
    }

}
