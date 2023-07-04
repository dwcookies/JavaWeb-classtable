package com.dao;

import com.pojo.Course;
import com.pojo.ProToCour;
import com.pojo.Profession;

import java.util.List;

public interface ProToCourDAO {
    List<ProToCour> getCnosByPno(String pno);
    void addPnoAndCno(String pno, String cno);
    void addPnoAndCno(Profession profession, Course course);
    void delPnoAndCno(String pno, String cno);
    void delPnoAndCno(Profession profession, Course course);
}
