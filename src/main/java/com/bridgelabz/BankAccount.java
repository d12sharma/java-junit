package com.bridgelabz;

public class BankAccount {
    double balance;

    public BankAccount(double amount){
        this.balance=amount;
    }
    public  double deposit(double amount){
        balance+=amount;
        return this.balance;
    }
    public double withdraw(double amount){
        if(amount > this.balance){
            System.out.println("insufficent balance");
        }
        balance-=amount;
        return  this.balance;
    }
    public double getBalance(){
        return balance;
    }

}
