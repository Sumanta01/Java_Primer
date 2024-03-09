package com.sumanta.revature.bankaccount;

public class BankAccounts {
    private static int accountNumberCount=1000;
    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int numOfTransactions;

    public BankAccounts(String name, String address,String accountType,double balance) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.numOfTransactions = 0;
    }



    @Override
    public String toString() {
        return "BankAccounts{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", numOfTransactions=" + numOfTransactions +
                '}';
    }
    public void deposit(double amount){
        balance+=amount;
        numOfTransactions++;

    }

    public void withdraw(double amount){
        if(amount>=balance){
            System.out.println("Balance can't be withdrawn less balance ");
        }else{
            balance-=amount;
            numOfTransactions++;
        }
    }
    public void changeAddress(String newAddress){
        address=newAddress;
        numOfTransactions ++;

    }
    public int getAccountNumber(){
        return accountNumberCount++;
    }
}
