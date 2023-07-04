package com.service;

import com.pojo.OptionalCourse;
import com.pojo.Student;

import java.util.List;

public interface OptionalCourseService {
    List<OptionalCourse> getOptCoursesByStudent(Student student);
    OptionalCourse getOptCourse(String no);
    void delOptCoursesOfStudent(Student student, OptionalCourse optionalCourse);
    void addOptCoursesOfStudent(Student student, OptionalCourse optionalCourse);
    void delOptCourses(OptionalCourse optionalCourse);
    void addOptCourses(OptionalCourse optionalCourse);
}
