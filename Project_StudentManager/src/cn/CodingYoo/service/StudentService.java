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
}
