package com.controller;

import com.pojo.Course;
import com.pojo.OptionalCourse;
import com.pojo.Student;
import com.service.CourseService;
import com.service.OptionalCourseService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CourseController {
    private CourseService courseService;
    private OptionalCourseService optionalCourseService;
    public String index(String week, HttpSession session) {
        Student student = (Student)session.getAttribute("student");
        //如果未登陆直接访问的话，就返回登陆界面
        if (student == null) return "login";
        //Course是OptionalCourse的父类，OptionalCourse也放入course中一起存储
        if (week == null) week = "1";
        int weekInt = Integer.parseInt(week);
        List<Course> courses = new ArrayList<>();
        for (Course course : student.getCourses()) {
            if (course.getBegin() <= weekInt && course.getEnd() >= weekInt) courses.add(course);
        }
        for (OptionalCourse optionalCourse : student.getOptionalCourses()) {
            if (optionalCourse.getBegin() <= weekInt && optionalCourse.getEnd() >= weekInt) courses.add(optionalCourse);
        }

        for (int i = 0;i < 5;i++) {
            Course[] lesson = new Course[7];
            for (int j = 0;j < courses.size();j++) {
                if (Integer.toString(i + 1).equals(courses.get(j).getTime())) {
                    Course course = courses.get(j);
                    String day = course.getDay();
                    lesson[Integer.parseInt(day)] = course;
                    courses.remove(course);
                }
            }
            session.setAttribute("lesson" + (i+1), new ArrayList<Course>(Arrays.asList(lesson)));
            session.setAttribute("week", weekInt);
        }

        return "index";
    }
}
