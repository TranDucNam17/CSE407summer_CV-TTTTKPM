public class BankMediator implements AccountMediator {
    private Account savingsAccount;
    private Account checkingAccount;

    public void registerSavings(Account account) {
        this.savingsAccount = account;
    }

    public void registerChecking(Account account) {
        this.checkingAccount = account;
    }

    @Override
    public void notifyWithdraw(Account sender, double amount) {
        System.out.println("Mediator notified of withdrawal from: " + sender.getType());

        if (sender == savingsAccount) {
            // Phản ứng lại nếu cần, ví dụ log hoặc tính toán tổng rút
        }

        if (sender == checkingAccount) {
            // Tương tự
        }
    }
}
