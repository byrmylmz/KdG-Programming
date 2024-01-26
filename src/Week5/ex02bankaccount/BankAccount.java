package Week5.ex02bankaccount;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder, String iban) {
        this.holder = holder;
        this.iban = iban;
        this.balance = 0.0;
    }

    public BankAccount(String holder, String iban, double initialBalance) {
        this(holder, iban);
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public String getHolder() {
        return holder;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("The account %s of %s has a balance of € %.2f", iban, holder, balance);
    }
}
