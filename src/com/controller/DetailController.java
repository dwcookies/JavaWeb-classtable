package com.controller;

import com.pojo.Student;

import javax.servlet.http.HttpSession;

public class DetailController {
    public String index(HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        if (student == null) return "login";
        return "detail";
    }
}
