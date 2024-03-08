package com.bankaccounts.revature;

public class DemadAccount extends  Accounts{

    public DemadAccount(String name, double balance, int accountId) {
        super(name, balance, accountId);
    }

    public DemadAccount() {
    }

    @Override
    public String toString() {
        return "DemadAccount{} " + super.toString();
    }
}
