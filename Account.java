public abstract class Account {
    protected double balance;
    protected AccountMediator mediator;

    public Account(AccountMediator mediator, double initialBalance) {
        this.mediator = mediator;
        this.balance = initialBalance;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
