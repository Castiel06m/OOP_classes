package lab2.task3.bank;

import lab2.task3.model.Account;
import lab2.task3.service.CheckingAccount;
import lab2.task3.service.SavingsAccount;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account account){
        accounts.add(account);
    }

//    public void closeAccount(Account account){
//        accounts.remove(account);
//    }

    public void update(){
        for(Account account : accounts){
            if(account instanceof SavingsAccount){
                // тайпкастим
                ((SavingsAccount) account).addInterest();
            }else if(account instanceof CheckingAccount){
                ((CheckingAccount) account).deductFees();
            }
        }
    }

    public void displayka(){
       for(Account account : accounts){
           System.out.println(account.toString());
       }
    }
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.openAccount(new SavingsAccount(228, 14.0));
        bank.openAccount(new CheckingAccount(107));

        bank.accounts.get(0).deposit(921232);
        bank.accounts.get(1).deposit(212);

        bank.update();

        bank.displayka();

    }
}
