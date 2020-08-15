package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/15/2020  5:35 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Teacher /*implements Comparable<Teacher>*/{
    private int age;
    private String name;

    public Teacher() {
    }

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Teacher o) {
        int result = this.getName().compareTo(o.getName());
        return result;
    }*/
}
