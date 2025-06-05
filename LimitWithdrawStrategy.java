public class LimitWithdrawStrategy implements WithdrawStrategy {
    public void withdraw(Account account, double amount) {
        if (amount > 1000) {
            System.out.println("Withdrawal amount exceeds limit (1000).");
            return;
        }
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + ". New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
