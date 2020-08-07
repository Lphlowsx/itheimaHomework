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


    public boolean addStudent(Student stu) {
        StudentDao studentDao = new StudentDao();

        return studentDao.addStudent(stu);
    }
}
