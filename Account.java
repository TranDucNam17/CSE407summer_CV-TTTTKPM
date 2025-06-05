public abstract class Account {
    protected double balance;
    protected WithdrawStrategy withdrawStrategy;

    public Account(double balance, WithdrawStrategy withdrawStrategy) {
        this.balance = balance;
        this.withdrawStrategy = withdrawStrategy;
    }

    public void withdraw(double amount) {
        withdrawStrategy.withdraw(amount, this);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void showType();
}
