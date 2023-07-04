package com.dao.impl;

import com.dao.ProfessionDAO;
import com.pojo.Profession;
import myssm.basedao.BaseDAO;

public class ProfessionDAOImpl extends BaseDAO<Profession> implements ProfessionDAO {
    @Override
    public Profession getProfession(String pno) {
        return load("SELECT * FROM prof WHERE pno = ?", pno);
    }
}
