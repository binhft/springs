package com.example.demo.login.controller;

import com.example.demo.login.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam("orgId") String orgId,
                        @RequestParam("authenId") String authenId) {
        boolean found = loginService.getByLogin(orgId, authenId);
        return found ? "success" : "failure";
    }
}
