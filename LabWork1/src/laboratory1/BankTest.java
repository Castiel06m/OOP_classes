package laboratory1;

public class BankTest {
    public static void main(String[] args){
        System.out.println(BankAccount.BANK_NAME);

        BankAccount mirik =  new BankAccount("24B031107", 3000.31, BankAccount.AccountType.SAVINGS);

        BankAccount HELLYEAH = new BankAccount("USAAAAAA");

        mirik.deposit(1.123);
        HELLYEAH.deposit(2);

        System.out.println(BankAccount.totalAccountsCreated);
        System.out.println(mirik.getAccountNumber());
        System.out.println(HELLYEAH.getAccountNumber());



    }
}
