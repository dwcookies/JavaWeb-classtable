package com.service.impl;

import com.dao.CourseDAO;
import com.dao.ProToCourDAO;
import com.dao.ProfessionDAO;
import com.dao.StuToOcDAO;
import com.pojo.Course;
import com.pojo.ProToCour;
import com.pojo.Profession;
import com.pojo.Student;
import com.service.CourseService;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseDAO courseDAO;
    private ProToCourDAO proToCourDAO;
    @Override
    public List<Course> getCoursesByPro(Profession profession) {
        List<Course> courses = new ArrayList<>();
        List<ProToCour> proToCours = proToCourDAO.getCnosByPno(profession.getPno());
        for (ProToCour proToCour : proToCours) {
            courses.addAll(courseDAO.getCourses(proToCour.getCno()));
        }
        return courses;
    }

    @Override
    public Course getCourse(String no) {
        return courseDAO.getCourse(no);
    }

    @Override
    public void delCoursesOfPro(Profession profession, Course course) {
        proToCourDAO.delPnoAndCno(profession.getPno(), course.getCno());
    }

    @Override
    public void addCoursesOfPro(Profession profession, Course course) {
        proToCourDAO.addPnoAndCno(profession.getPno(), course.getCno());
    }

    @Override
    public void delCourses(Course course) {
        courseDAO.delCourse(course);
    }

    @Override
    public void addCourse(Course course) {
        courseDAO.addCourse(course);
    }
}
