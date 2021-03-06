package com.application.bank1.model;

import java.util.StringJoiner;

public class Account {
    private long accountNumber;
    private long accountBalance;

    public Account(long accountNumber, long accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Account.class.getSimpleName() + "[", "]")
                .add("accountNumber=" + accountNumber)
                .add("accountBalance=" + accountBalance)
                .toString();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }
}
