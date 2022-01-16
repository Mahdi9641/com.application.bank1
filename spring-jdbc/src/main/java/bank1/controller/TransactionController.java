package bank1.controller;

import bank1.model.Transaction;
import bank1.service.TransactionService;
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


    @GetMapping("/getTransaction")
    public Transaction gettarnsaction() {
        Transaction returnValue;
        returnValue = new Transaction(12, 12);
        log.trace("get all transaction");
        return returnValue;

    }
    @PostMapping("/createTransaction")
    public void createdtarnsaction(@RequestBody Transaction transaction) {
        log.info("put transaction");
        transactionService.insert(transaction);
    }

    @PutMapping("/updateTransaction")
    public void updateTransaction(@RequestBody Transaction transaction){
        log.trace("update transaction");
        transactionService.update(transaction);

    }
    @DeleteMapping("/deleteTransaction")
    public void deleteTransaction(@RequestBody Transaction transaction){
        log.trace("delete transaction");
        transactionService.delete(transaction);
    }
}