public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        if (getBalance() - amount >= MIN_BALANCE) {
            doWithdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $" + MIN_BALANCE + " must be maintained.");
        }
    }
}
