public class SavingsAccountFactory implements AccountFactory {

    @Override
    public Account createAccount(double initialBalance) {
        return new SavingsAccount(initialBalance);
    }
}
