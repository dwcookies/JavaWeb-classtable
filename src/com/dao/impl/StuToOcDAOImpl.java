package com.dao.impl;

import com.dao.StuToOcDAO;
import com.pojo.OptionalCourse;
import com.pojo.StuToOc;
import com.pojo.Student;
import myssm.basedao.BaseDAO;

import java.util.List;

public class StuToOcDAOImpl extends BaseDAO<StuToOc> implements StuToOcDAO {
    @Override
    public List<StuToOc> getOcnoBySno(String sno) {
        return executeQuery("SELECT ocno FROM stu_to_oc WHERE sno = ?", sno);
    }

    @Override
    public void addSnoAndOcno(String sno, String ocno) {
        executeUpdate("INSERT INTO stu_to_oc VALUES(0, ?, ?)", sno, ocno);
    }

    @Override
    public void delSnoAndOcno(String sno, String ocno) {
        executeUpdate("DELETE FROM stu_to_oc WHERE sno = ? AND ocno = ?", sno, ocno);
    }

    @Override
    public void addSnoAndOcno(Student student, OptionalCourse optionalCourse) {
        addSnoAndOcno(student.getSno(), optionalCourse.getOcno());
    }

    @Override
    public void delSnoAndOcno(Student student, OptionalCourse optionalCourse) {
        delSnoAndOcno(student.getSno(), optionalCourse.getOcno());
    }
}
