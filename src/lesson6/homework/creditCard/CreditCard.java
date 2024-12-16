package lesson6.homework.creditCard;

import java.util.Scanner;

public class CreditCard {

    public String accountNumber;
    public double balance;

//deposit, withdraw, displayInfo
    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Charged " + amount + " to the card");
        }
        else {
            System.out.println("Sum have to be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0&&amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Something went wrong");
        }
    }

    public void showInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance+"\n");
    }






}
