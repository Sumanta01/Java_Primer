package com.bankaccounts.revature;

public class Accounts {
    private String name;
    protected double balance;
    private int accountId;

    public Accounts(String name, double balance, int accountId) {
        this.name = name;
        this.balance = balance;
        this.accountId = accountId;
    }

    public Accounts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);

    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdraw amount: "+amount);
        }else{
            System.out.println("Base balance should more than withdrawal");
        }
    }
    public void currentBalance(){
        System.out.println("Current Balance :"+balance);
    }


    @Override
    public String toString() {
        return "Accounts{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountId=" + accountId +
                '}';
    }
}
