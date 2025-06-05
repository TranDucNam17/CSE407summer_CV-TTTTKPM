public class Client {
    private Account account;

    public Client(AccountFactory factory, double initialBalance) {
        account = factory.createAccount(initialBalance);
    }

    public void makeWithdrawal(double amount) {
        account.withdraw(amount);
    }

    public void showBalance() {
        System.out.println("Số dư hiện tại: " + account.getBalance());
    }
}
