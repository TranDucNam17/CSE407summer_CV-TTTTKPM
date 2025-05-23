public class SavingsAccountBuilder implements AccountBuilder {
    private SavingsAccount account;

    @Override
    public void reset(){
        account = new SavingsAccount();
    }

    @Override
    public void setInitialBalance(double amount) {
        account.setInitialBalance(amount);
    }

    @Override
    public void withdraw(double amount) {
        account.safeWithdraw(amount);
    }

    @Override
    public Account getResult() {
        return account;
    }
}
