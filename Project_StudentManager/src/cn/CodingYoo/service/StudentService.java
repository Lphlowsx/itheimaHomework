package cn.CodingYoo.service;
/*
 *  @author:  CodingYoo
 *  date:     8/7/2020  9:23 AM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import cn.CodingYoo.dao.StudentDao;
import cn.CodingYoo.pojo.Student;

public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public static void updateStudent(String updateId, Student newStu) {
        StudentDao.updateStudent(updateId,newStu);
    }

    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        Student[] student = studentDao.findAllStudent();
        boolean exists = false;
        //遍历数组，获取每一个学生对象，准备进行判断
        for (int i = 0; i < student.length; i++) {
            Student stu = student[i];
            if (stu != null && stu.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        //调用dao的findall方法
        Student[] allStudent = studentDao.findAllStudent();
        //数组中只要有一个不是null，就打印
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if(stu != null){
                flag = true;
                break;
            }
        }
        if(flag){
            return allStudent;
        }else {
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }
}
