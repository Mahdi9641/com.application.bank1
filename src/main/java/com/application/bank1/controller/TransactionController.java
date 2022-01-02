package com.application.bank1.controller;

import com.application.bank1.model.Transaction;
import com.application.bank1.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class TransactionController {

    private static final Logger log = LoggerFactory.getLogger(Transaction.class);

    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @GetMapping("/transactionList")
    public List<Transaction> getTransaction(){
        return transactionService.findall();
    }


    @GetMapping("/transaction")
    public Transaction gettarnsaction() {
        Transaction returnValue = new Transaction(1, 50);
        returnValue = new Transaction(12, 12);
        log.trace("get all transaction");
        return returnValue;

    }
    @PostMapping("/transaction")
    public void createdtarnsaction(@RequestBody Transaction transaction) {
        log.info("put all transaction");
        System.out.println(transaction);
    }
}