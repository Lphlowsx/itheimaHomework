package cn.CodingYoo.pojo;
/*
 *  @author:  CodingYoo
 *  date:     8/7/2020  9:18 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Student {
    private String name;
    private String age;
    private String id;
    private String birthday;

    public Student() {
    }

    public Student(String name, String age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
