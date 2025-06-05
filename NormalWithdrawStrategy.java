public class NormalWithdrawStrategy implements WithdrawStrategy {
    public void withdraw(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + ". New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
