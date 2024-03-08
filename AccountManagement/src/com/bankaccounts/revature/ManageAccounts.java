package com.bankaccounts.revature;

public class ManageAccounts {
    public static void main(String[] args) {

        SavingAccount sv = new SavingAccount("Sumanta", 20000, 199);
        CurrentAccount cu = new CurrentAccount("John", 500000, 120);
        DemadAccount dm = new DemadAccount("Smith", 1200000, 150);
        sv.deposit(5000);
        sv.withdraw(12000);
        sv.currentBalance();
        double interest=sv.calculateInterest(sv.getAccountId());
        System.out.println("Interest : "+interest);
        System.out.println(sv);

        cu.deposit(3000);
        cu.withdraw(24000);
        cu.currentBalance();
        System.out.println(cu);

        dm.deposit(34000);
        dm.withdraw(21000);
        dm.currentBalance();
        System.out.println(dm);









    }

}