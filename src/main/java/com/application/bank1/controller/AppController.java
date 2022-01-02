package com.application.bank1.controller;

import com.application.bank1.dao.Dao;
import com.application.bank1.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppController
{
    @RequestMapping("/bank")
    public String hello(){

        return "Hello world";
    }

    @Autowired
    Dao<Account> accountDao;

}
