package com.service.impl;

import com.dao.StudentDAO;
import com.pojo.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;
    @Override
    public Student login(String sno, String pwd) {
        return studentDAO.getStudent(sno, pwd);
    }
}
