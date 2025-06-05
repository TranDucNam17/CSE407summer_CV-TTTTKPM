public class SavingsAccount extends Account {
    public SavingsAccount(double balance, WithdrawStrategy withdrawStrategy) {
        super(balance, withdrawStrategy);
    }

    @Override
    public void showType() {
        System.out.println("This is a Savings Account.");
    }
}
