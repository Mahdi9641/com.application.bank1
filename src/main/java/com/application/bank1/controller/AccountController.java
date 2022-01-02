package com.application.bank1.controller;

import com.application.bank1.model.Account;
import com.application.bank1.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(Account.class);

    private AccountService accountService;


    public AccountController(AccountService accountService){
        this.accountService = accountService;
}

    @GetMapping("/account")
    public Account getAccount() {
        Account returnValue = new Account(2, 50);
        returnValue = new Account(2, 1000000);
        log.trace("get account");
        return returnValue;

    }
    @PostMapping("/account")
    public void createdaccount(@RequestBody Account account) {
        log.info("created account accountNumber and accountBalance ");
        System.out.println(account);
    }

}
