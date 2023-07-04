package com.service;

import com.pojo.Course;
import com.pojo.OptionalCourse;
import com.pojo.Profession;
import com.pojo.Student;

import java.util.List;

public interface CourseService {
    List<Course> getCoursesByPro(Profession profession);
    Course getCourse(String no);
    void delCoursesOfPro(Profession profession, Course course);
    void addCoursesOfPro(Profession profession, Course course);
    void delCourses(Course course);
    void addCourse(Course course);
}
