public class Account {
    private double balance;
    private WithdrawStrategy strategy;

    public Account(double balance) {
        this.balance = balance;
    }

    public void setStrategy(WithdrawStrategy strategy) {
        this.strategy = strategy;
    }

    public void withdraw(double amount) {
        if (strategy != null) {
            strategy.withdraw(this, amount);
        } else {
            System.out.println("No withdraw strategy set.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
