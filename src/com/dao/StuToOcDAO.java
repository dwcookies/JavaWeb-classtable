package com.dao;

import com.pojo.OptionalCourse;
import com.pojo.StuToOc;
import com.pojo.Student;

import java.util.List;

public interface StuToOcDAO {
    List<StuToOc> getOcnoBySno(String sno);
    void addSnoAndOcno(String sno, String ocno);
    void delSnoAndOcno(String sno, String ocno);
    void addSnoAndOcno(Student student, OptionalCourse optionalCourse);
    void delSnoAndOcno(Student student, OptionalCourse optionalCourse);//改pojo
}
