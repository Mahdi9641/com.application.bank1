package bank1.controller;

import bank1.model.Account;
import bank1.service.AccountService;
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
        returnValue = new Account(1, 1000000);
        log.trace("get account");
        return returnValue;

    }
    @PostMapping("/account")
    public void createdaccount(@RequestBody Account account) {
        log.info("created account accountNumber and accountBalance ");

    }

}
