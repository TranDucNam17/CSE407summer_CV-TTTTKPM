public class NormalWithdraw implements WithdrawStrategy {
    @Override
    public void withdraw(double amount, Account account) {
        if (amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + " normally.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
