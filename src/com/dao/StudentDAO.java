package com.dao;

import com.pojo.Student;

public interface StudentDAO {
    Student getStudent(String sno, String pwd);
}
