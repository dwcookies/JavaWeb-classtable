package com.dao.impl;

import com.dao.CourseDAO;
import com.pojo.Course;
import myssm.basedao.BaseDAO;

import java.util.List;

public class CourseDAOImpl extends BaseDAO<Course> implements CourseDAO {
    @Override
    public List<Course> getCourses(String cno) {
        return executeQuery("SELECT * FROM course WHERE cno = ?", cno);
    }

    @Override
    public Course getCourse(String no) {
        return load("SELECT * FROM course WHERE no = ?", no);
    }

    @Override
    public void addCourse(Course course) {
        executeUpdate("INSERT INTO course VALUES(0, ?, ?, ?, ?, ?, ?, ?, ?)",
                course.getCname(), course.getBegin(), course.getEnd(), course.getDay(),
                course.getTime(), course.getTeacher(), course.getLocation(), course.getCno());
    }

    @Override
    public void delCourse(Course course) {
        executeUpdate("DELETE FROM course WHERE no = ?", course.getNo());
    }
}
