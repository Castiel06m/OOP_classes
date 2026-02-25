package laboratory1;

public class BankAccount {

    public enum AccountType { SAVINGS, CHECKING }
    public static final String BANK_NAME = "TyankOFF";
    
    public static int totalAccountsCreated = 0;

    private final String accountNumber;
    
    private double balance;
    private AccountType type;

    {
        totalAccountsCreated++;
        System.out.println("Создание нового счета...");
    }

    public BankAccount(String accountNumber, double balance, AccountType type) {
        this.accountNumber = accountNumber; 
        this.balance = balance;
        this.type = type;
    }

    // тупо пустой акк 
    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0, AccountType.CHECKING); 
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(int amount) {
        this.balance += (double) amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
