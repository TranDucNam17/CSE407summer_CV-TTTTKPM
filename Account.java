public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
