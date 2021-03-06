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
    private static Student[] stud = new Student[5];

    public static void updateStudent(String updateId, Student newStu) {
        //查找id所在索引位置
        int index = getIndex(updateId);
        //将索引位置元素进行替换
        stud[index] = newStu;

    }

    public boolean addStudent(Student stu) {

        //判断学生数组是否填满
        int index = -1;
        for (int i = 0; i < stud.length; i++) {
            Student student = stud[i];
            if(student == null){
                index = i;
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

    public void deleteStudentById(String delId) {
        //查找id在数组中的索引位置
        int index = getIndex(delId);
        //将该所引用null覆盖
        stud[index] = null;
    }

    public static int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stud.length; i++) {
            Student student = stud[i];
            if(student != null && student.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }
}
