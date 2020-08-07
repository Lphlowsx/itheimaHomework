package cn.CodingYoo.dao;
/*
 *  @author:  CodingYoo
 *  date:     8/7/2020  9:22 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import cn.CodingYoo.pojo.Student;

public class StudentDao {
    //创建学生对象数组
    private  Student[] stud = new Student[5];
    public boolean addStudent(Student stu) {

        //判断学生数组是否填满
        int index = -1;
        for (int i = 0; i < stud.length; i++) {
            Student student = stud[i];
            if(student == null){
                index = -1;
                break;
            }
        }
        if(index == -1){
            return false;
        }else {
            //存入
            stud[index] = stu;
            return true;
        }

    }

    public Student[] findAllStudent() {
        return stud;
    }
}
