package bank1.controller;

import bank1.domain.Account;
import bank1.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(Account.class);

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/Account")
    public Account run() {
        Account account = new Account();
        log.trace("get Account");
        account.setAccountNumber(1);
        account.setAccountBalance(200);
    accountRepository.save(account);
    return account;
    }

    @PostMapping("Account")
    public void createdaccount(@RequestBody Account account){
        log.info("created account accountNumber and accountBalance ");

    }

}
