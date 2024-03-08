package com.bankaccounts.revature;

public class CurrentAccount extends  Accounts{
    public CurrentAccount() {
    }

    public CurrentAccount(String name, double balance, int accountId) {
        super(name, balance, accountId);
    }

    @Override
    public String toString() {
        return "CurrentAccount{} " + super.toString();
    }




}
