package com.dao.impl;

import com.dao.ProToCourDAO;
import com.pojo.Course;
import com.pojo.ProToCour;
import com.pojo.Profession;
import myssm.basedao.BaseDAO;

import java.util.List;

public class ProToCourDAOImpl extends BaseDAO<ProToCour> implements ProToCourDAO {
    @Override
    public List<ProToCour> getCnosByPno(String pno) {
        return executeQuery("SELECT cno FROM pro_to_cour WHERE pno = ?", pno);
    }

    @Override
    public void addPnoAndCno(String pno, String cno) {
        executeUpdate("INSERT INTO pro_to_cour VALUES(0, ?, ?)", pno, cno);
    }

    @Override
    public void delPnoAndCno(String pno, String cno) {
        executeUpdate("DELETE FROM pro_to_cour WHERE pno = ? AND cno = ?", pno, cno);
    }

    @Override
    public void delPnoAndCno(Profession profession, Course course) {
        delPnoAndCno(profession.getPno(), course.getCno());
    }

    @Override
    public void addPnoAndCno(Profession profession, Course course) {
        addPnoAndCno(profession.getPno(), course.getCno());
    }
}
