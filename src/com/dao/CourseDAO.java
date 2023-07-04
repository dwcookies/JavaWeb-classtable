package com.dao;

import com.pojo.Course;

import java.util.List;

public interface CourseDAO {
    List<Course> getCourses(String cno);
    Course getCourse(String no);
    void addCourse(Course course);
    void delCourse(Course course);
}
