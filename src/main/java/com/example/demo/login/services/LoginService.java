package com.example.demo.login.services;

import com.example.demo.login.entity.CmKain;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    boolean getByLogin(String authenId, String organId);

    CmKain getByOrgId(String organId);
}
