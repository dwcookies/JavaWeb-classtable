package com.dao.impl;

import com.dao.OptionalCourseDAO;
import com.pojo.OptionalCourse;
import myssm.basedao.BaseDAO;

import java.util.List;

public class OptionalCourseDAOImpl extends BaseDAO<OptionalCourse> implements OptionalCourseDAO {
    @Override
    public List<OptionalCourse> getOptionalCourses(String ocno) {
        return executeQuery("SELECT * FROM opt_course WHERE ocno = ?", ocno);
    }

    @Override
    public OptionalCourse getOptionalCourse(String no) {
        return load("SELECT * FROM opt_course WHERE no = ?", no);
    }

    @Override
    public void addOptionalCourses(OptionalCourse optionalCourse) {
        executeUpdate("INSERT INTO opt_course VALUES(0, ?, ?, ?, ?, ?, ?, ?, ?)",
                optionalCourse.getCname(), optionalCourse.getBegin(), optionalCourse.getEnd(), optionalCourse.getDay(),
                optionalCourse.getTime(), optionalCourse.getTeacher(), optionalCourse.getLocation(), optionalCourse.getOcno());
    }

    @Override
    public void delOptionalCourse(OptionalCourse optionalCourse) {
        executeUpdate("DELETE FROM opt_course WHERE no = ?", optionalCourse.getNo());
    }
}
