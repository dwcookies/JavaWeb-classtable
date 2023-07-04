package com.service.impl;

import com.dao.ProfessionDAO;
import com.pojo.Profession;
import com.service.ProfessionService;

public class ProfessionServiceImpl implements ProfessionService {
    private ProfessionDAO professionDAO;
    @Override
    public Profession getProfession(String pno) {
        return professionDAO.getProfession(pno);
    }
}
