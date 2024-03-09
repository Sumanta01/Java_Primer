package com.sumanta.revature.bankaccount;

import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of depositer: ");
        int numOfDepositor=sc.nextInt();
        BankAccounts[]account=new BankAccounts[numOfDepositor];
        for(int i=0;i<numOfDepositor;i++){
            sc.nextLine();
            System.out.println("Enter the name of depositor "+(i+1)+": ");
            String nameofDepositor=sc.nextLine();
            System.out.println("Enter the address of depositor "+(i+1)+": ");
            String addressOfDepositor=sc.nextLine();
            System.out.println("Enter the account type of depositor "+(i+1)+": ");
            String accountType=sc.nextLine();
            System.out.println("Enter the base balance of depositor "+(i+1)+": ");
            double baseBalance=sc.nextDouble();
            account[i]=new BankAccounts(nameofDepositor,addressOfDepositor,accountType,baseBalance);


        }
        System.out.println("Enter the depositor number to display depositor information: ");
        int depositNumber=sc.nextInt();
        System.out.println(account[numOfDepositor-1]);

        System.out.println("Enter the depositor number to deposit money: ");
        depositNumber=sc.nextInt();
        System.out.println("Enter the amount of deposit: ");
        double depositAmount=sc.nextDouble();
        account[depositNumber-1].deposit(depositAmount);
        System.out.println(account[depositNumber-1]);

        System.out.println("Enter the depositor number to withdraw money: ");
        depositNumber=sc.nextInt();
        System.out.println("Enter the withdrawal amount: ");
        double withdrawAmount=sc.nextDouble();
        account[depositNumber-1].withdraw(withdrawAmount);
        System.out.println(account[depositNumber-1]);
        System.out.println("Enter the depositor number to change the address: ");
        depositNumber=sc.nextInt();
        System.out.println("Enter the new Address: ");
        String newAddress=sc.next();
        account[depositNumber-1].changeAddress(newAddress);
        System.out.println(account[depositNumber-1]);

        // Randomly repeat these processes for some other bank accounts
        for(int i=0;i<2;i++){
            int randomDepositor=(int)Math.random()*numOfDepositor;
            int randomOperations=(int)(Math.random()*3)+1;
            switch (randomOperations){
                case 1:
                    //deposit
                    System.out.println("\nRandomly Selected operations for deposit: ");
                    System.out.println("Enter the deposit amount: ");
                    double randomDepositAmount=sc.nextDouble();
                    account[randomDepositor].deposit(randomDepositAmount);
                    break;

                case 2:
                    // Withdraw
                    System.out.println("\nRandomly selected operation: Withdraw");
                    System.out.println("Enter the amount to withdraw: ");
                    double randomWithdrawAmount = sc.nextDouble();
                    account[randomDepositor].withdraw(randomWithdrawAmount);
                    break;
                case 3:
                    // Change Address
                    System.out.println("\nRandomly selected operation: Change Address");
                    sc.nextLine(); // Consume the newline character
                    System.out.println("Enter the new address: ");
                    String randomNewAddress = sc.nextLine();
                    account[randomDepositor].changeAddress(randomNewAddress);
                    break;
            }
        }
        int totalTransactions = 0;
        for (BankAccounts accounts : account) {
            totalTransactions += accounts.getAccountNumber();
        }
        System.out.println("\nTotal number of transactions across all accounts: " + totalTransactions);



    }
}
