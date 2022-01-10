package bank1.controller;

import bank1.domain.Account;
import bank1.repository.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/getAccount")
    public void run() {
        Account account = new Account();
        account.setAccountNumber(1);
        account.setAccountBalance(200);
    accountRepository.save(account);
    }

}
