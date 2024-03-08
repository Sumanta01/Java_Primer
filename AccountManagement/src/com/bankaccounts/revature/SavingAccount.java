package com.bankaccounts.revature;

public class SavingAccount  extends  Accounts implements interestCalculator{

    public SavingAccount(String name, double balance, int accountId) {
        super(name, balance, accountId);
    }

    private static  double RateInterset=5.2;
    public SavingAccount() {
    }

    public double calculateInterest(double balance){
        return RateInterset * balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{} " + super.toString();
    }
}
