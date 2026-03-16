package lab2.task3.service;

import lab2.task3.model.Account;

public class CheckingAccount extends Account {

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFees(){
        if(transactionCount > FREE_TRANSACTIONS){
            int extraFees = transactionCount - FREE_TRANSACTIONS;
            double fee = extraFees*TRANSACTION_FEE;

            super.withdraw(fee);
        }
        transactionCount = 0;
    }

}
