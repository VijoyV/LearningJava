/**
 * A class to represent the Bank Account and its basic operations
 */


public class SimpleBankAccount {

    private String name;
    private int balance;

    SimpleBankAccount(String name, int startBalance) {
        this.name = name;
        balance = Math.max(1, startBalance);
        // since the balance have to be positive
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getBalanceString() {
        return String.format("$%,d", balance);
    }

    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

}
