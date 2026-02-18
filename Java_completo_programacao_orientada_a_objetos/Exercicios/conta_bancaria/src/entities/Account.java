package entities;

public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public Account(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public double withdrawTax() {
        return 5.00;
    }

    public void withdraw(double withdraw) {
         this.balance -= (withdraw + withdrawTax());
    }

    public double realWithDrawValue(double withdraw) {
        return withdraw + withdrawTax();
    }

    public String toString() {
        return "Account " + accountNumber + ", " + "Holder: " + accountName + ", " + ", Account balance: $ " + String.format("%.2f", balance);
    }

}
