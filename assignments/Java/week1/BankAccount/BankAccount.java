// package assignments.Java.week1.BankAccount;

import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccts;
    private static double totalMoneyInAccts;

    public void BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.totalMoneyInAccts = 0;

        numOfAccts++;
    }

    // getter methods for checkings and savings acct.
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double totalMoneyInAccts(double amount, String account){
        if(account.equals("checkings")) {
            this.checkingBalance += amount;
            BankAccount.totalMoneyInAccts += amount;
            return this.checkingBalance;
        } else if (account.equals("savings")) {
            this.savingsBalance += amount;
            BankAccount.totalMoneyInAccts += amount;
            return this.savingsBalance;
        } else {
            return 404;
        }
        // switch(type){
        //     case "checkings":
        //     this.checkingBalance += amount;
        //     System.out.printf("$%.2f has been added to %s checking account. New Total Amount in Checking: $%.2f\n", amount, this.checkingBalance);
        //     BankAcct.totalMoneyInAccts += amount;
        //     break;
        //     case "savings":
        //     this.savingsBalance += amount;
        //     System.out.printf("$%.2f has been added to %s saving account. New Total Amount in Checking: $%.2f\n", amount, this.savingsBalance);
        //     BankAcct.totalMoneyInAccts += amount;
        //     break;
        // }
    }

// total amount of accounts
    public static void getNumOfAccts() {
        System.out.println("Total number of Accounts created: " + numOfAccts);
    }

//total amount of money in accts.
    public static void printTotalMoneyInAccts() {
        System.out.println("Total amount of money in checking ans savings account: " + totalMoneyInAccts);
    }
}
