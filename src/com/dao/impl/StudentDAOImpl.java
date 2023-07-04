package com.dao.impl;

import com.dao.StudentDAO;
import com.pojo.Student;
import myssm.basedao.BaseDAO;

import static com.alibaba.druid.util.Utils.md5;

public class StudentDAOImpl extends BaseDAO<Student> implements StudentDAO {
    @Override
    public Student getStudent(String sno, String pwd) {
        return load("SELECT * FROM student WHERE sno LIKE ? AND pwd LIKE ?", sno, md5(pwd));
    }
}
