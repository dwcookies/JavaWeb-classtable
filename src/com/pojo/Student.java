package com.pojo;

import java.util.List;

public class Student {
    String sno;
    String name;
    Integer age;
    String sex;
    String pwd;
    String pno;

    Profession profession;
    List<Course> courses;
    List<OptionalCourse> optionalCourses;

    public Student() {
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<OptionalCourse> getOptionalCourses() {
        return optionalCourses;
    }

    public void setOptionalCourses(List<OptionalCourse> optionalCourses) {
        this.optionalCourses = optionalCourses;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }
}
