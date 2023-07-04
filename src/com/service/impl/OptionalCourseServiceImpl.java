package com.service.impl;

import com.dao.OptionalCourseDAO;
import com.dao.StuToOcDAO;
import com.pojo.OptionalCourse;
import com.pojo.StuToOc;
import com.pojo.Student;
import com.service.OptionalCourseService;

import java.util.ArrayList;
import java.util.List;

public class OptionalCourseServiceImpl implements OptionalCourseService {
    private OptionalCourseDAO optionalCourseDAO;
    private StuToOcDAO stuToOcDAO;
    @Override
    public List<OptionalCourse> getOptCoursesByStudent(Student student) {
        List<OptionalCourse> optionalCourses = new ArrayList<>();
        List<StuToOc> stuToOcs = stuToOcDAO.getOcnoBySno(student.getSno());
        for (StuToOc stuToOc : stuToOcs) {
            optionalCourses.addAll(optionalCourseDAO.getOptionalCourses(stuToOc.getOcno()));
        }
        return optionalCourses;
    }

    @Override
    public OptionalCourse getOptCourse(String no) {
        return optionalCourseDAO.getOptionalCourse(no);
    }

    @Override
    public void delOptCoursesOfStudent(Student student, OptionalCourse optionalCourse) {
        stuToOcDAO.delSnoAndOcno(student.getSno(), optionalCourse.getOcno());
    }

    @Override
    public void addOptCoursesOfStudent(Student student, OptionalCourse optionalCourse) {
        stuToOcDAO.addSnoAndOcno(student.getSno(), optionalCourse.getOcno());
    }

    @Override
    public void delOptCourses(OptionalCourse optionalCourse) {
        optionalCourseDAO.delOptionalCourse(optionalCourse);
    }

    @Override
    public void addOptCourses(OptionalCourse optionalCourse) {
        optionalCourseDAO.addOptionalCourses(optionalCourse);
    }
}
