package com.controller;

import com.pojo.Student;
import com.service.CourseService;
import com.service.OptionalCourseService;
import com.service.ProfessionService;
import com.service.StudentService;

import javax.servlet.http.HttpSession;

public class StudentController {
    private StudentService studentService;
    private ProfessionService professionService;
    private CourseService courseService;
    private OptionalCourseService optionalCourseService;
    public String login(String sno, String pwd, HttpSession session) {
        Student student = studentService.login(sno, pwd);
        if (student != null) {
            student.setProfession(professionService.getProfession(student.getPno()));
            student.setCourses(courseService.getCoursesByPro(student.getProfession()));
            student.setOptionalCourses(optionalCourseService.getOptCoursesByStudent(student));
            session.setAttribute("student", student);
            return "redirect:course.do?operate=index";
        }
        return "login";
    }

    public String index() {
        return "login";
    }
}
