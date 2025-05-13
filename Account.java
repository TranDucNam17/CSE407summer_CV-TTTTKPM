public abstract class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Initial balance must be non-negative.");
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected boolean canWithdraw(double amount) {
        return amount >= 0 && balance - amount >= 0;
    }

    protected void doWithdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds.");
        }
    }

    public abstract void withdraw(double amount);
}
