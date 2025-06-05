public class LimitedWithdraw implements WithdrawStrategy {
    @Override
    public void withdraw(double amount, Account account) {
        if (amount > 100) {
            System.out.println("Withdrawal exceeds limit (100).");
        } else if (amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + " with limit.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
