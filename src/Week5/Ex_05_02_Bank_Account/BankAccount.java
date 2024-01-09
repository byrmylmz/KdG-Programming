package Week5.Ex_05_02_Bank_Account;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder, String iban) {
        this.holder = holder;
        this.iban = iban;
        this.balance = 0.0;
    }

    public BankAccount(String holder, String iban, double balance) {
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {

        if ((this.balance - amount) < 0) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
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
//        return "The account " + iban + "of" + holder +"has a balance of E" + balance;
        return String.format("iban: %s holder: %s balance: E%.2f",iban,holder,balance);


    }




}
