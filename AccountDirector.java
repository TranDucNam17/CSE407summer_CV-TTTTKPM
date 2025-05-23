public class AccountDirector {
    private AccountBuilder builder;

    public AccountDirector(AccountBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(AccountBuilder builder) {
        this.builder = builder;
    }

    public Account createSavingsAccount(double initialBalance, double... withdrawals) {
        builder.reset();
        builder.setInitialBalance(initialBalance);
        for (double amount : withdrawals) {
            builder.withdraw(amount);
        }
        return builder.getResult();
    }
}
