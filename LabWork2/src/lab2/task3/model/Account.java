package lab2.task3.model;

public class Account {
    private double balance;
    private int accNumber;
    public Account(int a) {
        balance = 0.0;
        this.accNumber = a;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double sum) {
        this.balance += sum;
    }
    public void withdraw(double sum) {
        if(this.balance < sum) {
            throw new RuntimeException("You can't withdraw more than $" + sum);
        } else{
            this.balance -= sum;
        }
    }
    public int getAccNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other) {
//        this.balance -= amount;
//        other.balance += amount;
        this.withdraw(amount); // нулина = ошибка
        other.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", accNumber=" + accNumber + '}';
    }

    public final void print(){
        System.out.println(toString());
    }
}
