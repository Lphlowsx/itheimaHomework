package cn.CodingYoo.pojo;
/*
 *  @author:  CodingYoo
 *  date:     7/31/2020  2:58 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Student {
    private String sid;
    private String name;
    private int age;
    private String birthday;
    private int yuwen;
    private int shuxue;

    public Student(String sid, String name, String age, String birthday) {
    }

    public Student(String sid, String name, int age, String birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Student(String name, int yuwen, int shuxue) {
        this.name = name;
        this.yuwen = yuwen;
        this.shuxue = shuxue;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    public Student(String name, String age, String birthday) {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yuwen=" + yuwen +
                ", shuxue=" + shuxue +
                '}';
    }
}