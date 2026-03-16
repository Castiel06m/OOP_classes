package lab2.task3.service;

import lab2.task3.model.Account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        deposit(getBalance() * interestRate/100);
    }


}
