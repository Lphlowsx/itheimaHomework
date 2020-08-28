package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  4:16 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_03 {
    public static void main(String[] args) {
        TreeSet<Teacher> tea = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();  //主要判定条件
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;  //只有年龄和姓名完全一致才不添加
                return result;
            }
        });

        Teacher teacher1 = new Teacher("aa",22);
        Teacher teacher2 = new Teacher("bb",21);
        Teacher teacher3 = new Teacher("cc",23);
        Teacher teacher4 = new Teacher("bb",20);
        tea.add(teacher1);
        tea.add(teacher2);
        tea.add(teacher3);
        tea.add(teacher4);
        System.out.println(tea);
    }
}
