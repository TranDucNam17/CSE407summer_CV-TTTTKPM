public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SavingsAccount: Rút " + amount + ". Số dư còn lại: " + balance);
        } else {
            System.out.println("SavingsAccount: Số dư không đủ!");
        }
    }
}
