public class CheckingAccount extends Account {
    public CheckingAccount(AccountMediator mediator, double initialBalance) {
        super(mediator, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(getType() + " withdrew " + amount + ". New balance: " + balance);
            mediator.notifyWithdraw(this, amount);
        } else {
            System.out.println(getType() + " - Insufficient balance to withdraw " + amount);
        }
    }
}
