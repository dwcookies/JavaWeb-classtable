package com.dao;

import com.pojo.Course;
import com.pojo.OptionalCourse;

import java.util.List;

public interface OptionalCourseDAO {
    List<OptionalCourse> getOptionalCourses(String ocno);
    OptionalCourse getOptionalCourse(String no);
    void addOptionalCourses(OptionalCourse optionalCourse);
    void delOptionalCourse(OptionalCourse optionalCourse);
}
