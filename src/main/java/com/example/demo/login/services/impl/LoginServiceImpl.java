package com.example.demo.login.services.impl;

import com.example.demo.login.entity.CmKain;
import com.example.demo.login.mappers.CmKainMapper;
import com.example.demo.login.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    CmKainMapper cmKainMapper;

    @Override
    public boolean getByLogin(String authenId, String organId) {
        try {
            CmKain cmKain = cmKainMapper.getById(organId);
            return cmKain != null && cmKain.getAuthenId().equals(authenId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public CmKain getByOrgId(String organId) {
        return cmKainMapper.getById(organId);
    }
}
