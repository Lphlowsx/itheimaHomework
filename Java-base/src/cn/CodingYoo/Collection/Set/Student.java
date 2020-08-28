package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/28/2020  3:47 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Student implements Comparable<Student>{//<---注意此处需要指定数据类型
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        //按照年龄进行排序
        //int result = this.age - o.age;
        int result = this.name.compareTo(o.name);
        return result;
    }
}
