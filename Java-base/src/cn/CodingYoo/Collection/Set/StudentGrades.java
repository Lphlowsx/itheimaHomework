package cn.CodingYoo.Collection.Set;
/*
 *  @author:  CodingYoo
 *  date:     8/29/2020  3:05 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class StudentGrades implements Comparable<StudentGrades> {
    private int chinese;
    private int math;
    private int english;
    private String name;

    public StudentGrades() {
    }

    public StudentGrades(int chinese, int math, int english, String name) {
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSum() {
        return chinese + math + english;
    }

    @Override
    public int compareTo(StudentGrades o) {
        //比较总分
        int result = this.getSum() - o.getSum();
        //如果总分相等，比较语文成绩
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        //比较数学
        result = result == 0 ? this.getMath() - o.getMath() : result;
        //比较英语
        result = result == 0 ? this.getEnglish() - o.getEnglish() : result;
        //比较名字
        result = result == 0 ? this.getName().compareTo(o.name) : result;
        return result;
    }
}
